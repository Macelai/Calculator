import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class File {

    void filesave(String txt){

        try{
            FileWriter arq = new FileWriter("/home/macelai/IdeaProjects/Calculator/historico.txt", true);
            PrintWriter writer = new PrintWriter(arq);
            writer.printf(txt+"\n");
            arq.close();
            System.out.printf("Gravado\n");

        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Falha ao salvar arquivo");
            e.printStackTrace(); // isso vai exibir as últimas chamadas de método
        }
    }
}
