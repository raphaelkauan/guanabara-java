package curso.gustavo.guanabara.java;
import java.awt.*;

public class ResolucaoTela {
  public static void main(String[] args) {
    Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) size.getWidth();
    int height = (int) size.getHeight();

    System.out.println("Sua tela está com a seguinte resolução : "
        + "width : " + width
        + " height : " + height);
  }
}
