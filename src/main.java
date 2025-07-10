import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();

        Usuario Manuel = usuarios.adicionaUsuario("Manoel","101","101","Gerente");
        Usuario Carlos = usuarios.adicionaUsuario("Carlos","102","102","Vendededor");
        Usuario Lucas = usuarios.adicionaUsuario("Lucas","103","103","Vendededor");

        System.out.println(Manuel.getMatricula());
        System.out.println(Carlos.getMatricula());
        System.out.println(Lucas.getMatricula());

        System.out.println(Arrays.toString(usuarios.getUsuarios().toArray()));
        usuarios.removerUsuario("102");
        System.out.println(Arrays.toString(usuarios.getUsuarios().toArray()));
    }

}
