import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;


public class Logout extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs=req.getSession();
		hs.invalidate();	
		res.sendRedirect("Login.jsp");	
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		doGet(req,res);
	}
}s.read())!=-1)
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
EIP=0x66ef5af9, EFLAGS=0x00010206

Top of Stack: (sp=0x018cf4dc)
0x018cf4dc:   33a626a0 3895be00 33a626a0 00000005
0x018cf4ec:   01183ff8 018cf51c 66ed64a9 3895be00
0x018cf4fc:   33a626a0 00000000 01183c00 01183308
0x018cf50c:   01183ff0 01183ff8 011843e4 018cf764
0x018cf51c:   018cf530 66efe5ad 33a626a0 38662ba0
0x018cf52c:   000003fe 018cf550 66fcd502 33a626a0
0x018cf53c:   67150630 389175a0 0194fa70 018cf55c
0x018cf54c:   66fcd93b 018cf55c 66fcd941 67150630 

Instructions: (pc=0x66ef5af9)
0x66ef5ad9:   00 56 eb 03 8d 49 00 8b 03 85 c0 74 02 8b 00 8b
0x66ef5ae9:   53 04 8d 14 ba 8b 34 02 85 f6 0f 84 87 00 00 00
0x66ef5af9:   8b 06 83 e0 03 3c 03 74 7e 8b 06 c7 45 fc 03 00
0x66ef5b09:   00 00 8b 4d fc 89 0e 80 3d 4d 22 14 67 00 75 0a 


Register to memory mapping:

EAX=0x33a626a0 is an oop
{object array class} 
 - klass: {other class}
EBX=0x03d31988 is an unknown value
ECX=0x00000005 is an unknown value
EDX=0x0000013c is an unknown value
ESP=0x018cf4dc is an unknown value
EBP=0x018cf4f0 is an unknown value
ESI=0x38220648 is an unknown value
EDI=0x00000003 