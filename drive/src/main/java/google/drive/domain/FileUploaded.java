package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String path;
    private String type;
    private Integer size;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
