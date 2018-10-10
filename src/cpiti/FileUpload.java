
package cpiti;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.swing.ImageIcon;

@Entity
public class FileUpload implements Serializable{
    @Id
    private String file_session_id;
    @Lob
    private byte[] photo;

    public String getFile_session_id() {
        return file_session_id;
    }
    
    public byte[] getPhoto() {
        return photo;
    }

    public void setFile_session_id(String file_session_id) {
        this.file_session_id = file_session_id;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    public ImageIcon getImage(){
     return new ImageIcon(photo);   
    }
}
