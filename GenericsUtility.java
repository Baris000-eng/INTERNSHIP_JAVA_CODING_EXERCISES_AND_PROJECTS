package baris.kaplan;
import java.io.*;
public class GenericsUtility <T extends Serializable> /*implements Serializable*/ {
    public void serialize(T t){
        try{
            FileOutputStream fout=new FileOutputStream("/Users/barissss/eclipse-workspace/JIG-G2-2022/src/baris.kaplan/f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(t);
            out.flush();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public T deserialize() {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("/Users/barissss/eclipse-workspace/JIG-G2-2022/src/baris.kaplan/f.txt"));
            T s=(T) in.readObject();
            in.close();
            return s;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
