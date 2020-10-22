package rentalService;

import rentalService.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @Autowired
    ScheduleRepository ScheduleRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverInstallCanceled_cancelSchedule(@Payload InstallCanceled installCanceled) {

        if (installCanceled.isMe()) {
            Schedule schedule = new Schedule();
            schedule.setInstallId(installCanceled.getInstallId());
            schedule.setQty(installCanceled.getQty());
            schedule.setStatus("SCHEDULECANCELED");

            ScheduleRepository.save(schedule);

        }
    }
}
