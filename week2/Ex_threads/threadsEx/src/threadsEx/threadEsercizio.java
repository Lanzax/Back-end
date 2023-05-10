package threadsEx;
	//class  dadThread extends Thread
	class  dadThread implements Runnable{
		 String stringa;
		public dadThread(String stringa) {
			this.stringa=stringa;			
		}
		public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(stringa);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}						
			}		
		}

