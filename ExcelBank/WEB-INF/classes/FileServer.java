java FileServerge;
import java.io.*;
import java.net.*;


public class FileDownLoad
{
		public String d;
		public FileDownLoad(){}
		public boolean fileDownLoad(String s,String d)
		{
			boolean flag=false;
			try{
				Socket client=new  Socket("127.0.0.1",7080);
				d=d+"9";
				
				OutputStream b=client.getOutputStream();
				b.write(d.getBytes());
									
				FileInputStream fis=new FileInputStream(s);
				int c;
				while((c=fis.read())!=-1)
					b.write(c);
				flag=true;
				fis.close();
				b.close();
				client.close();
			}catch(Exception e){
				System.out.println(e);
			}
			return flag;
		}
		
}
        5  6  8  9 - : ; ;      
Rajkot
      �    IEND�B`�

Registers:
EAX=0x33a626a0, EBX=0x03d31988, ECX=0x00000005, EDX=0x0000013c
ESP=0x018cf4dc, EBP=0x018cf4f0, ESI=0x38220648, EDI=0x00000003
EIP=0x66ef5af9, EFLAGS=0x000102