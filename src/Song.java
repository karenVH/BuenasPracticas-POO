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
     * @param title
     * @param year
     * @param duration
     * @param gender
     * @param cover
     * @param description
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
     * 
     * @return
     */
    public UUID getIdentifier() {
        return identifier;
    }

    /**
     * 
     * @param identifier
     */
    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    /**
     * 
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     */
    public Calendar getDate() {
        return date;
    }

    /**
     * 
     * @param date
     */
    public void setDate(Calendar date) {
        this.date = date;
    }

    /**
     * 
     * @return
     */
    public double getDuration() {
        return duration;
    }

    /**
     * 
     * @param duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * 
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     */
    public String getCover() {
        return cover;
    }

    /**
     * 
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    

    
}
