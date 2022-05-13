import javax.swing.JOptionPane;
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
        int resultado = calc.somar(n1, n2);
        System.out.println(resultado);

        //usar o método subtrair para calcular n1 - n2
        resultado = calc.subtrair(n1, n2);
        System.out.println(resultado);

        System.out.println(calc.subtrair(n1, n2));

        //usar o método multiplicar para calcular n1^3

        resultado = calc.multiplicar(n1, n1, n1);
        System.out.println(resultado);

        System.out.println(calc.multiplicar(n1, n1, n1));
    }    
}
