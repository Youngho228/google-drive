package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "View_table")
@Data
public class View {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Integer size;
    private String name;
    private String path;
    private Boolean isIndexed;
    private Boolean isUploaded;
    private String videoUrl;
}
