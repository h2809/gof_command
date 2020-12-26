import java.io.File;

// フォルダ作成を行うReceiver
public class ConcreteReceiverMkdir implements Receiver {

    public void action(String path) {
        File file = new File(path);
        if (file.mkdir()){
        }else{
            System.out.println(path + "作成に失敗しました。");
        }
    }

}
