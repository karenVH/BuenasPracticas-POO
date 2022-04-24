
//importaciones
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Clase principal, donde se ejecutan los filtros para crear la playlist
 * 
 * @version 1.0.0   23/04/2017
 * 
 * @author Karen Vásquez Hernández karen5808266@gmail.com
 * @author Jose Felipe Escobar - jfejose10@gmail.com 
 * 
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        System.out.println("¡Hola! Bienvenidos a nuestra biblioteca de musica");
        // Entradas Scanner
        Scanner entry = new Scanner(System.in);
        Scanner entry2 = new Scanner(System.in);
        // Arrray donde se almacenan las canciones de la biblioteca de musica
        ArrayList<Song> musicLibrary = new ArrayList<Song>();
        // Canciones filtradas por genero
        ArrayList<Song> GenderFilter = new ArrayList<Song>();
        // Canciones filtradas por año
        ArrayList<Song> YearFilter = new ArrayList<Song>();
        // PlayList creada
        ArrayList<Song> playList = new ArrayList<Song>();

        // Canciones agregadas a la biblioteca de musica
        musicLibrary.add(new Song("All Your Love", 2015, 1.5, "Pop", "lila", ""));
        musicLibrary.add(new Song("Cuando Volveras", 2007, 2.5, "Bachata", "romantic", ""));
        musicLibrary.add(new Song("Darte un Beso", 2004, 3.0, "Bachata", "comi", ""));
        musicLibrary.add(new Song("Frozen", 2015, 2.0, "Pop", "disney", ""));
        musicLibrary.add(new Song("Muchachones", 2018, 3.0, "Rap", "poli", ""));

        int select = 1;
        // Acciones que puedes realizar en la biblioteca
        while (select != 0) {
            System.out.print("Digita 1 para listar las canciones de la biblioteca\n"
                    + "Digita 2 para listar las canciones por genero\n"
                    + "Digita 3 para listr las canciones por año\n"
                    + "Digita 4 para listar las canciones ordenadas por duracion de menor a mayor\n"
                    + "Digita 5 para listar las canciones ordenadas por duracion de mayor a menor\n"
                    + "Digita 6 para listar las canciones ordenadas por año\n"
                    + "Digita 7 para crear tu playList\n"
                    + "Digita 0 para temrinar: ");
            try {
                select = entry.nextInt();
            } catch (Exception e) {
                System.out.println("La opción que acabas de igresar es invalida, intenta con otra");
                entry.nextLine();
                continue;
            }
            // ----
            switch (select) {
                case 1:
                    for (Song playingSong : musicLibrary) {
                        System.out.println(" se esta reproduciendo la cancion " + playingSong.getTitle() + "  "
                                + playingSong.getDuration());
                    }
                    break;
                case 2:
                    System.out.print("Digite el genero de las canciones que deseas ver: ");
                    String musicGender = entry2.nextLine();
                    MusicByGender(musicLibrary, musicGender, GenderFilter);
                    break;
                case 3:
                    System.out.print("Digite el año , para filtrar las canciones");
                    int musicYear = entry.nextInt();
                    MusicByYear(musicLibrary, musicYear, YearFilter);
                    break;
                case 4:
                    System.out.println("Las canciones se orgnizaran de Menor a Mayor duracion");
                    orderByShorterDuration(musicLibrary);
                    break;
                case 5:
                    System.out.println("Las canciones se orgnizaran de Mayor a menor duracion");
                    orderByLongerDuraton(musicLibrary);
                    break;
                case 6:
                    System.out.println("se va a escuchar las canciones organizadas por fecha (año)");
                    OrderByYear(musicLibrary);
                    break;
                case 7:
                    System.out.println("Crear playlist");
                    System.out.print("Digita el titulo de la cancion que deseas agregar a tu playlist ");
                    String title = entry2.nextLine();
                    createPlaylist(title, playList, musicLibrary);
                    System.out.println("Si desea agregar otra cancion digite 1, d elo contrario digite 0");
                    break;
                default:
                    break;

            }
        }
    }

    // Metodo para filtrar canciones por genero
    public static void MusicByGender(ArrayList<Song> musicLibrary,
            String musicGender, ArrayList<Song> GenderFilter) {
        int cont = 0;
        for (int i = 0; i < musicLibrary.size(); i++) {
            if (musicLibrary.get(i).getGender().equals(musicGender)) {
                GenderFilter.add(musicLibrary.get(i));
                cont++;
            }
        }
        for (int i = 0; i < cont; i++) {
            System.out.println("Titulo  " + GenderFilter.get(i).getTitle() + " " + GenderFilter.get(i).getGender());
        }

    }

    

    

    

}
