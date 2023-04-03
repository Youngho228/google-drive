package google.drive.domain;

import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VideoStereamed extends AbstractEvent {

    private Long id;
    private Long Fileid;
    private String url;
}
