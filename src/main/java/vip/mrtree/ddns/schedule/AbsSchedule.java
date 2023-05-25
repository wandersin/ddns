package vip.mrtree.ddns.schedule;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbsSchedule {
    public abstract void execute();

    protected void scheduleTemplate(String scheduleKey) {
        log.info("任务 {} 开始执行", scheduleKey);
        execute();
        log.info("任务 {} 执行结束", scheduleKey);
    }
}
