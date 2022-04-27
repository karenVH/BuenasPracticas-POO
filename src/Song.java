//importaciones
import java.util.Calendar;
import java.util.UUID;



/**
 * Clase que representa una cancion y sus caracteristicas
 * 
 * 
 * @version 1.0.0   23/04/2017
 * 
 * @author Jose Felipe Escobar - jfejose10@gmail.com
 * @author Karen Vazquez - karen5808266@gmail.com 
 * 
 * @since 1.0.0
 */

public class Song {
    /**Identificador unico de la canción */
    private UUID identifier;
    /**Titulo de la cancion */
    private String title;
    /**Fecha(año) de la cancion */
    private Calendar date;
    /**Duración de la cancion */
    private double duration;
    /**Genero de la canción */
    private String gender;
    /**Caratula de la cancion */
    private String cover;
    /**Descripcion de la cancion */
    private String description;


    /**
     * Metodo Constructor para una canción
     * 
     * @param title Titulo de la canción
     * @param year Año de la cancion
     * @param duration Duracion de la cancion
     * @param gender Genero de la cancion
     * @param cover Portada de la cancion
     * @param description Descripcion de la cancion
     */
    public Song(String title, int year, double duration, String gender, String cover, String description) {
        this.title = title;
        this.identifier = UUID.randomUUID();//El identifiacador unico se genera automaticamente
        this.date = Calendar.getInstance();
        this.date.set(year,1,1);//Solo para obtener el año de la cancion
        this.duration = duration;
        this.gender = gender;
        this.cover = cover;
        this.description = description;
    }

    /**Getters y Seetters */

    /**
     * Metodo para obtener del identificador unico
     * @return numero unico
     */
    public UUID getIdentifier() {
        return identifier;
    }

    /**
     * Metodo para mostrar el identificador unico
     * @param identifier numero unico
     */
    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    /**
     * Metodo para obtener el titulo de la cancion
     * @return Titulo de l cancion
     */
    public String getTitle() {
        return title;
    }

    /**
     * Metodo para mostrar el titulo de la cancion
     * @param title Titulo de la cancion
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Metodo para obtener la fecha(Solo año) de la cancion
     * @return fecha de la cancion
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * Metodo para mostrar la fecha(solo año) de la cancion
     * @param date fecha de la cancion
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * Metodo para obtener la duracion de la cancion
     * @return duracion de la cancion
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Metodo para mostrar la duracion de la cancion
     * @param duration duracion de la cancion
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Metodo para otener el genero de la cancion
     * @return genero de la cancion
     */
    public String getGender() {
        return gender;
    }

    /**
     * Metodo para mostrar el genero de la cancion
     * @param gender genero de la cancion
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Metodo para obtener la portada de la cancion
     * @return Portada de la cancion
     */
    public String getCover() {
        return cover;
    }

    /**
     * Metodo para mostrar la portada de la cancion
     * @param cover Portada de la cancion
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Metodo para obtener la descripcion de la cancion
     * @return Descripcion de la cancion
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metodo para mostrar la descripcion de la cancion
     * @param description Descripcion
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
