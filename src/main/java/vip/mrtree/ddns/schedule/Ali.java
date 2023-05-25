package vip.mrtree.ddns.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Ali extends AbsSchedule{
    @Scheduled(fixedDelay = 60 * 1000)
    public void ali() {
        scheduleTemplate(this.getClass().getSimpleName());
    }

    @Override
    public void execute() {
        log.info("ali ddns开始 ...");

        log.info("ali ddns结束");
    }
}
