package com.juphoon.rcsrunner.server;

import com.juphoon.rcsrunner.entity.CaseProcess;
import com.juphoon.rcsrunner.service.ICaseProcessService;
import com.juphoon.rcsrunner.util.SpringContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RcsServer {
    private static ConcurrentHashMap<String, String> map;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private ICaseProcessService caseProcessService;
    private static Socket client;
    public static final int PORT = 8888;//监听的端口号

    public void init() {
//        map = new ConcurrentHashMap<>();
//        try {
//            ServerSocket serverSocket = new ServerSocket(PORT);
//
//            System.out.println("socket开启");
//            while (true) {
//
//                client = serverSocket.accept();
//                // 读取客户端数据
//                DataInputStream input = new DataInputStream(client.getInputStream());
//                if (input.read() > 0) {
//                    String clientInputStr = input.readUTF();//这里要注意和客户端输出流的写方法对应,否则会抛 EOFException
//                    // 处理客户端数据
//                    System.out.println("客户端发过来的内容:" + clientInputStr);
//                    map.put("testCaseId", clientInputStr);
//                    map.put("userAccount", "11:15");
//                    if (redisTemplate == null) {
//                        redisTemplate = (RedisTemplate<String, Object>) SpringContextUtils.getContext().getBean("redisTemplate");
//                    }
//                    //   CaseProcess caseProcess = (CaseProcess)redisTemplate.opsForValue().get(clientInputStr);
//                    //   sendMessage(caseProcess.toString());
//                    if (caseProcessService == null) {
//                        caseProcessService = (ICaseProcessService) SpringContextUtils.getContext().getBean("caseProcessService");
//                    }
//                    //根据用例编号取流程
//                    List<CaseProcess> caseProcesses = (List<CaseProcess>) redisTemplate.opsForValue().get(clientInputStr);
//                    //根据账号存流程序号,null表示没有进行
//                    redisTemplate.opsForValue().set("account=11:account=15", null);
//                    for (CaseProcess caseProcess : caseProcesses) {
//                        System.out.println(caseProcess.toString());
//                    }
//                    sendMessage("111");
//                }
//                //  input.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("服务器异常: " + e.getMessage());
//        }
        try {
            map = new ConcurrentHashMap<>();
            ServerSocket server = null;
            try {
                server = new ServerSocket(PORT);
                System.out.println("服务器启动成功");
            } catch (Exception e) {
                System.out.println("没有启动监听：" + e);
            }
            try {
                client = server.accept();
            } catch (Exception e) {
                System.out.println("Error." + e);
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line;
            while (true) {
                line = in.readLine();
                System.out.println("line-------------------"+line);
                map.put("testCaseId", line);
               // map.put("userAccount", "11:15");
                if (redisTemplate == null) {
                    redisTemplate = (RedisTemplate<String, Object>) SpringContextUtils.getContext().getBean("redisTemplate");
                }
                //   CaseProcess caseProcess = (CaseProcess)redisTemplate.opsForValue().get(clientInputStr);
                //   sendMessage(caseProcess.toString());
//                if (caseProcessService == null) {
//                    caseProcessService = (ICaseProcessService) SpringContextUtils.getContext().getBean("caseProcessService");
//                }
                //根据用例编号取流程
                List<CaseProcess> caseProcesses = (List<CaseProcess>) redisTemplate.opsForValue().get(line);
                //根据账号存流程序号,null表示没有进行
                redisTemplate.opsForValue().set("15888:15999", null);
                for (CaseProcess caseProcess : caseProcesses) {
                    System.out.println(caseProcess.toString());
                }
             //   sendMessage("111");

            }

//            //5、关闭资源
//            writer.close(); //关闭Socket输出流
//            in.close(); //关闭Socket输入流
//            socket.close(); //关闭Socket
//            server.close(); //关闭ServerSocket
        } catch (Exception e) {//出错，打印出错信息
            System.out.println("Error." + e);
        }

    }

//    private class HandlerThread implements Runnable {
//        public HandlerThread() {
//
//            new Thread(this).start();
//        }
//
//        public void run() {
//
//        }
//    }

    public void sendMessage(String message) {
//        // 向客户端回复信息
//        DataOutputStream out = null;
//        System.out.println("发送消息啦");
//        try {
//            out = new DataOutputStream(client.getOutputStream());
//            out.writeUTF(message);
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        } finally {
//            if (client != null) {
//                try {
//                    out.close();
//                    client.close();
//                } catch (Exception e) {
//                    client = null;
//                    System.out.println("服务端 finally 异常:" + e.getMessage());
//                }
//            }
//        }
        try {
            PrintWriter writer = new PrintWriter(client.getOutputStream());
            writer.println(message);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Socket getSocket() {
        return client;
    }

    public static ConcurrentHashMap<String, String> getMap() {
        return map;
    }

    public static void main(String[] args) {

        RcsServer rcsServer = new RcsServer();
        rcsServer.init();
    }
}
