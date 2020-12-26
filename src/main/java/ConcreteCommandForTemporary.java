// 一時フォルダ・ファイル作成を指示するクラス
public class ConcreteCommandForTemporary extends Command {

    public ConcreteCommandForTemporary(String nameOfFileFolder) {
        super(nameOfFileFolder);
    }

    public void execute() {
        receiver.action("C:\\java2020\\pleiades\\workspace\\command\\target\\tmp\\" + nameOfFileFolder);
    }
}
