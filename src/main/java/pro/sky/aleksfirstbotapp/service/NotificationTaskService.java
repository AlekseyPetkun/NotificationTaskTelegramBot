package pro.sky.aleksfirstbotapp.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.aleksfirstbotapp.entity.NotificationTask;
import pro.sky.aleksfirstbotapp.repository.NotificationTaskRepository;

@Service
@AllArgsConstructor
public class NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public void save(NotificationTask notificationTask) {

        notificationTaskRepository.save(notificationTask);
    }
}
