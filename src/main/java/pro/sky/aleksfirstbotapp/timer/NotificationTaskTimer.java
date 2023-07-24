package pro.sky.aleksfirstbotapp.timer;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pro.sky.aleksfirstbotapp.repository.NotificationTaskRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * Таймер напоминаний
 */
@Component
@AllArgsConstructor
public class NotificationTaskTimer {

    private final NotificationTaskRepository notificationTaskRepository;
    private final TelegramBot telegramBot;

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void task() {

        notificationTaskRepository.findAllByNotificationDateTime(
                LocalDateTime.now().truncatedTo(
                        ChronoUnit.MINUTES)
        ).forEach(notificationTask -> {
            telegramBot.execute(
                    new SendMessage(notificationTask.getChatId(),
                            "Вы просили напомнить о задаче: " + notificationTask.getMessage()));
            notificationTaskRepository.delete(notificationTask);
        });
    }
}
