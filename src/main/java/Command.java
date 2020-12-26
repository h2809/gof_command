// コマンドの抽象クラス
public abstract class Command {

    protected String nameOfFileFolder;
    protected Receiver receiver;

    // コンストラクタ：生成するファイル名・フォルダ名をセット
    public Command(String nameOfFileFolder) {
        this.nameOfFileFolder = nameOfFileFolder;
    }

    // コマンドの受け手をセット
    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    // コマンドの受け手に処理を依頼
    public abstract void execute();

}
