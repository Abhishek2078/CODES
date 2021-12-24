import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class radiobu extends JFrame implements ItemListener {
    public radiobu() {
    initUI();
    }
    private void initUI() {
    var cb = new JCheckBox("Show title", true);
    cb.addItemListener(this);
    createLayout(cb);
    setSize(280, 200);
    setTitle("JCheckBox");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
    int sel = e.getStateChange();
    if (sel == ItemEvent.SELECTED) {
    setTitle("JCheckBox");
    } else {
    setTitle("");
    }
    }
    private void createLayout(JComponent... arg) {
    var pane = getContentPane();
    var gl = new GroupLayout(pane);
    pane.setLayout(gl);
    gl.setAutoCreateContainerGaps(true);
    gl.setHorizontalGroup(gl.createParallelGroup().addComponent(arg[0]));
    gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));
}
public static void main(String[] args) {
EventQueue.invokeLater(
() -> {
var ex = new radiobu();
ex.setVisible(true);
}
);
}
}