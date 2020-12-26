import java.util.Iterator;
import java.util.Stack;

// コマンドの追加・取消・実行を管理するクラス
public class Invoker {

    private Stack<Command> commandStack = new Stack<Command>();

    // コマンドを追加する
    public void addCommnad(Command command) {
        commandStack.push(command);
        System.out.println(commandStack.size() + "個目のコマンドを登録しました。");
    }

    // 直近のコマンドを削除する
    public void undoCommnad() {
        if (commandStack.empty()) {
            System.out.println("削除するコマンドがありません。");
        } else {
            commandStack.pop();
            System.out.println((commandStack.size()+1) + "個目のコマンドを削除しました。");
        }
    }

    // コマンドを順番に実行する
    public void execute() {
        System.out.println(commandStack.size() + "個のコマンドを実行します。");

        Iterator<Command> itetator = commandStack.iterator();

        while (itetator.hasNext()) {
        	itetator.next().execute();
        }

        System.out.println("コマンドを実行しました。");
    }
}
