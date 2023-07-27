package trabalahndoarrays;

import java.util.ArrayList;
import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        
        String resp = "";

        while (!resp.equals("x")) {
            resp = JOptionPane.showInputDialog("Digite um número ou x para sair");
            if (!resp.equals("x")) {
                numbers.add(Integer.parseInt(resp));
            }
        }
 
        //media();
        
        if (!numbers.isEmpty()) {
            Integer menor = numbers.get(0);
            Integer maior = numbers.get(0);
            double soma = 0;

            for (int i = 0; i < numbers.size(); i++) {
                int num = numbers.get(i);
                if (num < menor) {
                    menor = num;
                }
                if (num > maior) {
                    maior = num;
                }
                soma += num;
            }

            double media = soma / numbers.size();

            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
    }

    public static void pedirVariasNotas() {
        Double[] notas = new Double[1];
        String resp = "";

        int contador = 0;
        while (!resp.equals("-1")) {
            resp = (JOptionPane.showInputDialog("Digite a nota ou -1 para encerrar"));
            if (!resp.equals("-1")) {
                if (notas.length == contador) {
                    Double[] newNotas = new Double[contador + 1];
                }
                Double[] newNotas = null;
                notas = newNotas;
            }
            notas[contador] = Double.parseDouble(resp);
            contador++;
        }
    }

    public static void media() {
        Double[] notas = new Double[3];

        for (int i = 0; i <= 2; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a" + (i + 1) + " nota:"));

        }

        double media = (notas[0] + notas[1] + notas[2]) / 3;

        JOptionPane.showMessageDialog(null, "A media do aluno foi de " + media + ".");

    }

}
