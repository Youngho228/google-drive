package google.drive.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import google.drive.config.kafka.KafkaProcessor;
import google.drive.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploaded'"
    )
    public void wheneverFileUploaded_UserAlert(
        @Payload FileUploaded fileUploaded
    ) {
        FileUploaded event = fileUploaded;
        System.out.println(
            "\n\n##### listener UserAlert : " + fileUploaded + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='VideoStereamed'"
    )
    public void wheneverVideoStereamed_UserAlert(
        @Payload VideoStereamed videoStereamed
    ) {
        VideoStereamed event = videoStereamed;
        System.out.println(
            "\n\n##### listener UserAlert : " + videoStereamed + "\n\n"
        );
        // Sample Logic //

    }
}
