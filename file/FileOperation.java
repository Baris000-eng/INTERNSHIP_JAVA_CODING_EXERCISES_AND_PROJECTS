package baris.kaplan.file;

public interface FileOperation {
    String info();
    void fileRead(String string_path);
    void fileWrite(String string_path,String stringToAdd);

}
