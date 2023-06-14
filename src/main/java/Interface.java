import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends  JFrame{
    private JTextField nomeProduto;
    private JTextField custoProduto;
    private JTextField valorVenda;
    private JTextField valorPis;
    private JTextField valorCofins;
    private JTextField valorIcms;
    private JTextField valorDifal;
    private JTextField valorFrete;
    private JTextField ValorIss;
    private JTextField resultado;
    public JPanel painelPrincipal;
    private JButton CALCULARButton;

    private Double resultadoRbo;

public Interface() {
    CALCULARButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double ValordaVenda = Double.valueOf(valorVenda.getText());
            Double CustodoProduto = Double.valueOf(custoProduto.getText());
            Double valorPIS = Double.valueOf(valorPis.getText());
            Double valorcofins = Double.valueOf(valorCofins.getText());
            Double valoricms = Double.valueOf(valorIcms.getText());
            Double valordifal = Double.valueOf(valorDifal.getText());

            resultadoRbo = ((ValordaVenda - CustodoProduto - valorPIS - valorcofins - valoricms - valordifal)/ValordaVenda) * 100;
            resultado.setText(resultadoRbo.toString());
        }
    });
}
}
