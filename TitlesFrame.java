
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame
{

    public TitlesFrame()
    {
        initUI();
    }

    private void initUI()
    {
        setTitle("\u041A\u0440\u0438\u0432\u044B\u0435 \u0444\u0438\u0433\u0443\u0440\u044B");
        setDefaultCloseOperation(3);
        add(new TitlesPanel(38));
        setSize(350, 350);
        setLocationRelativeTo(null);
    }

    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {

            public void run()
            {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }

        }
);
    }
}