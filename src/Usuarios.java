import java.util.ArrayList;
import java.util.List;

public  final class Usuarios {

    private static Usuarios instance;
    private List<Usuario> usuarios;

    public Usuarios(){
        this.usuarios = new ArrayList<>();
    }

    public Usuario adicionaUsuario(String nome, String matricula, String senha, String tipo){
        Usuario usuario = new Usuario(nome,matricula,senha,tipo);
        usuarios.add(usuario);
        System.out.println("Usuário foi Cadastrado com Sucesso!!!");
        return usuario;
    }

    //Realiza a busca do index atraves da matricula
    public  int indexof (String matricula){
        for (int i=0; i <usuarios.size(); i++){
            if (usuarios.get(i).getMatricula().equals(matricula)){
                return i;
            }
        }
        return -1;
    }

    public void removerUsuario(String matricula){
        int indice = this.indexof(matricula);
        if (indice != -1){
            usuarios.remove(indice);
            System.out.println("Usuário removido com sucesso!!");
        }else {
            System.out.println("Usuário não foi encontrado!!");
        }
    }
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }

    public static Usuarios getInstance(){
        if (instance == null){
            instance = new Usuarios();
        }
        return instance;
    }

}
