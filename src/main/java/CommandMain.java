
public class CommandMain {

	public static void main(String[] args) {
        // 初期処理
        Receiver receiverMkfil = new ConcreteReceiverMkfil();
        Receiver receiverMkdir = new ConcreteReceiverMkdir();
        Invoker invoker = new Invoker();

        // コマンドの作成（５個）
        System.out.println("Aファイルを作成するコマンドを登録します。");
        Command commandA = new ConcreteCommandForOperation("A");
        commandA.setReceiver(receiverMkfil);
        invoker.addCommnad(commandA);

        System.out.println("Bフォルダを作成するコマンドを登録します。");
        Command commandB = new ConcreteCommandForOperation("B");
        commandB.setReceiver(receiverMkdir);
        invoker.addCommnad(commandB);

        System.out.println("C一時ファイルを作成するコマンドを登録します。");
        Command commandC = new ConcreteCommandForTemporary("C");
        commandC.setReceiver(receiverMkfil);
        invoker.addCommnad(commandC);

        System.out.println("D一時フォルダを作成するコマンドを登録します。");
        Command commandD = new ConcreteCommandForTemporary("D");
        commandD.setReceiver(receiverMkdir);
        invoker.addCommnad(commandD);

        System.out.println("Eファイルを作成するコマンドを登録します。");
        Command commandE = new ConcreteCommandForOperation("E");
        commandE.setReceiver(receiverMkfil);
        invoker.addCommnad(commandE);

        // 直近のコマンドの削除
        invoker.undoCommnad();

        // コマンドの実行
        invoker.execute();
    }
}
