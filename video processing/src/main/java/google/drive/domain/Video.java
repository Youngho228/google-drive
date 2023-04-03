package google.drive.domain;

import google.drive.VideoProcessingApplication;
import google.drive.domain.VideoStereamed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileid;

    private String url;

    @PostPersist
    public void onPostPersist() {
        VideoStereamed videoStereamed = new VideoStereamed(this);
        videoStereamed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    public static void processVideo(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        VideoStereamed videoStereamed = new VideoStereamed(video);
        videoStereamed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);

            VideoStereamed videoStereamed = new VideoStereamed(video);
            videoStereamed.publishAfterCommit();

         });
        */

    }
}
