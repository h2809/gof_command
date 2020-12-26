import java.io.File;
import java.io.IOException;

// ファイル作成を行うReceiver
public class ConcreteReceiverMkfil implements Receiver {

    public void action(String path) {
        File file = new File(path + ".txt");
        try {
            if (file.createNewFile()){
            }else{
                System.out.println(path + "作成に失敗しました。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
