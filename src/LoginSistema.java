import javax.swing.JOptionPane;

public class LoginSistema {
    public static void main(String[] args) {
        
        int opcao;
        
        do{
            String[] opcoes = {"Entrar", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Escolha um opção", "Sistem de Login", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
            
            if(opcao == 0){
                realizarLogin();
        }
    }while(opcao == 0);
}
    
public static void realizarLogin(){
    int tentativas = 0;
    final int MAX_TENTATIVAS = 3
            
            while(tentativas < MAX_TENTATIVAS){
                String login = JOptionPane.showInputDialog("Digite o login");
                if (){
                    s
                }
            }
}