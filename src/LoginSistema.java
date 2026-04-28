import javax.swing.JOptionPane;
 
public class LoginSistema {
 
    public static void main(String[] args) {
 
        int opcao;
 
        do {
            String[] opcoes = {"Entrar", "Sair"};
            opcao = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Sistema de Login",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );
 
            if (opcao == 0) {
                realizarLogin();
            }
 
        } while (opcao == 0);
    }
 
    public static void realizarLogin() {
 
        int tentativas = 0;
        final int MAX_TENTATIVAS = 3;
 
        while (tentativas < MAX_TENTATIVAS) {
 
            String login = JOptionPane.showInputDialog("Digite o login:");
            if (login == null || login.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Login não pode ser vazio!");
                continue;
            }
 
            String senha = JOptionPane.showInputDialog("Digite a senha:");
            if (senha == null || senha.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Senha não pode ser vazia!");
                continue;
            }
 
            if (login.equals("admin") && senha.equals("1313")) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                return;
            } else {
                tentativas++;
 
                int continuar = JOptionPane.showConfirmDialog(
                        null,
                        "Login ou senha inválidos.\nTentar novamente?",
                        "Erro",
                        JOptionPane.YES_NO_OPTION
                );
 
                if (continuar != JOptionPane.YES_OPTION) {
                    return;
                }
            }
        }
 
        JOptionPane.showMessageDialog(null, "Número máximo de tentativas atingido!");
    }
}
 