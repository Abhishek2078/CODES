import java.io.*;
public class Fileprogram {
public static void main (String s[]) throws FileNotFoundException, IOException
{
File f1 = new File("C:/exam/input.txt");
File f2 = new File("C:/exam/output.txt");
if(!f1.exists()) // If file is not created then create file
f1.createNewFile();
FileInputStream in = new FileInputStream(f1);
FileOutputStream out= new FileOutputStream(f2);
int k;
while ((k=in.read())!=-1){
System.out.println((char)k);
}
int c;
while ((c = in.read()) != -1) {
out.write(c); // writing
}
File f= new File("data.txt");
if(f.createNewFile()){
System.out.println("File created");
}
boolean de= f.delete(); // File deletion
System.out.println("File deleted="+de);
}
}