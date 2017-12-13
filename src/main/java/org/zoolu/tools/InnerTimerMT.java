/*
 * Copyright (C) 2005 Luca Veltri - University of Parma - Italy
 * 
 * This file is part of MjSip (http://www.mjsip.org)
 * 
 * MjSip is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * MjSip is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MjSip; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package org.zoolu.tools;


/** Class InnerTimerMT implements a separated-thread timer */
class InnerTimerMT extends Thread
{
   /** Timeout value */
   long timeout;

   /** Timer listener */
   InnerTimerListener listener;

   /** Creates a new InnerTimerMT. */
   public InnerTimerMT(long timeout, InnerTimerListener listener)
   {  this.timeout=timeout;
      this.listener=listener;
      start(); 
   }  

   /** From Thread. Runs in a separated thread. */
   public void run()
   {  if (listener!=null)
      {  try
         {  Thread.sleep(timeout);
            listener.onInnerTimeout();
         }
         catch (Exception e) { e.printStackTrace(); }
         listener=null;
      }
   }   
}
