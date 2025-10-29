package Exception_programs;

import java.io.File;
import java.io.IOException;

public class p15 {
public static void main(String[] args) 
	throws ClassNotFoundException,InterruptedException,IOException
{
	Class.forName("acb");
	Thread.sleep(10000);
	File.createTempFile(null, null);
}
}
