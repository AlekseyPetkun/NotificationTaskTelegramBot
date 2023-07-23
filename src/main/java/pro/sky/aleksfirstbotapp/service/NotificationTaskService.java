package pro.sky.aleksfirstbotapp.service;

import org.springframework.stereotype.Service;
import pro.sky.aleksfirstbotapp.entity.NotificationTask;
import pro.sky.aleksfirstbotapp.repository.NotificationTaskRepository;

@Service
public class NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask) {

        notificationTaskRepository.save(notificationTask);
    }
}
