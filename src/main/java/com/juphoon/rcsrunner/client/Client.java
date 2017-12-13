package com.juphoon.rcsrunner.client;

import java.io.*;
import java.net.Socket;

/**
 * @Author: huguanghui
 * Created by huguanghui on 2017/12/2.
 * @Description:
 */
public class Client {
    public static final String IP_ADDR = "192.168.1.105";//服务器地址
    public static final int PORT = 8888;//服务器端口号
    public static void main(String[] args) {
//        Socket socket = null;
//        try {
//
//            //创建一个流套接字并将其连接到指定主机上的指定端口号
//            socket = new Socket(IP_ADDR, PORT);
//
//            while (true){
//                //读取服务器端数据
//                DataInputStream input = new DataInputStream(socket.getInputStream());
//                //向服务器端发送数据
//                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
//                out.writeUTF("1000");
//                String ret = input.readUTF();
//                System.out.println("服务器端返回过来的是: " + ret);
//                out.close();
//                input.close();
//            }
//
//        } catch (Exception e) {
//            System.out.println("客户端异常:" + e.getMessage());
//        } finally {
//            if (socket != null) {
//                try {
//                    socket.close();
//                } catch (IOException e) {
//                    socket = null;
//                    System.out.println("客户端 finally 异常:" + e.getMessage());
//                }
//            }
//        }

        try {
            Socket socket = new Socket(IP_ADDR, PORT);
            System.out.println("客户端启动成功");

          //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter write = new PrintWriter(socket.getOutputStream());

          //  String readline;
            write.println("YL_20170425100001");
            write.flush();
          //  readline = br.readLine();
            while (true) {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = in.readLine();
                System.out.println(message);
            } // 继续循环
            //4、关闭资源
          //  write.close(); // 关闭Socket输出流
          //  in.close(); // 关闭Socket输入流
          //  socket.close(); // 关闭Socket
        } catch (Exception e) {
            System.out.println("can not listen to:" + e);// 出错，打印出错信息
        }
    }
}
