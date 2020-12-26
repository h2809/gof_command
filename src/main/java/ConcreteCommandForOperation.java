// 運用で使用するフォルダ・ファイル作成を指示するクラス
public class ConcreteCommandForOperation extends Command {

    public ConcreteCommandForOperation(String nameOfFileFolder) {
        super(nameOfFileFolder);
    }

    public void execute() {
        receiver.action("C:\\java2020\\pleiades\\workspace\\command\\target\\conf\\" + nameOfFileFolder);
    }
}
