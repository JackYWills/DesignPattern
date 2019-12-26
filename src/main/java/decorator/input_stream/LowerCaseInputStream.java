package decorator.input_stream;

import java.io.*;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 17:46
 * @Version V1.0
 **/
public class LowerCaseInputStream extends FilterInputStream{
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /** 针对字节 **/
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1?c:Character.toLowerCase((char)c));
    }

    /** 针对字节数组 **/
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b,off,len);
        for(int i=off;i<off+result;i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            int c;
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(
                    new File(".").getAbsolutePath()+"\\src\\main\\java\\decorator\\input_stream\\test.txt")));
            while((c=in.read())>=0){
                System.out.println((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
