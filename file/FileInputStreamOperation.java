package baris.kaplan.file;
import java.io.*;

public class FileInputStreamOperation implements FileOperation{

    @Override
    public String info() {
        return "File Input Stream Operation";
    }

    @Override
    public void fileRead(String string_path) {
        try{
            FileInputStream f=new FileInputStream(string_path);
            int r=0;
            while((r=f.read())!=-1){
                System.out.print((char)r);
            }
            f.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fileWrite(String string_path, String stringToAdd) {
        try {
            FileOutputStream o
                    = new FileOutputStream(string_path,true);
            byte[] array = stringToAdd.getBytes();
            o.write(array);
            o.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
