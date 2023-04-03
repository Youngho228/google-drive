package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStereamed extends AbstractEvent {

    private Long id;
    private Long fileid;
    private String url;
}
