import java.util.Scanner;

public final class Login {

    private static Login instance;
    private Usuario ususarioLogado;
    public Usuarios usuarios = Usuarios.getInstance();
    Scanner scanner = new Scanner(System.in);

    public void exibeLogin(){
        while (true){

            System.out.println("==================================");
            System.out.println("-----BEM-VINDO AO JAVA PETSHOP----");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");
            System.out.print("* MATRICULA ---------------------* ");
            String matricula = scanner.nextLine();

            System.out.print("* SENHA---- ---------------------* ");
            String senha = scanner.nextLine();
            realizaLogin(matricula,senha);
        }
    }

    public boolean realizaLogin(String matricula, String senha){
        Usuario usuario = usuarios.checkCredenciais(matricula,senha);
        if (usuario != null){
            this.ususarioLogado = usuario;
            System.out.println("Login realizado com Sucesso!!");
            return true;
        }
        System.out.println("Credenciais inválidas");
        return false;
    }


    public Usuario getUsusarioLogado() {
        return ususarioLogado;
    }

    public void setUsusarioLogado(Usuario ususarioLogado) {
        this.ususarioLogado = ususarioLogado;
    }

    //Verfica se existe uma instancia Login
    public static Login getInstance(){
        if (instance ==null){
            instance = new Login();
        }
        return instance;
    }
}

