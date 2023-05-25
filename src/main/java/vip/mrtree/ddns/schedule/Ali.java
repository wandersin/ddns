package vip.mrtree.ddns.schedule;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Component
public class Ali extends AbsSchedule{
    private final static Set<String> ENV_KEY_SET = new HashSet<>();

    static {
        ENV_KEY_SET.add("ALI_DOMAIN_NAME_SERVER_REGION");
        ENV_KEY_SET.add("ALI_ACCESS_KEY");
        ENV_KEY_SET.add("ALI_ACCESS_KEY_SECRET");
    }

    @PostConstruct
    public void init() {
        ENV_KEY_SET.forEach(key -> log.info("{} = {}", key, System.getenv(key)));
    }

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
