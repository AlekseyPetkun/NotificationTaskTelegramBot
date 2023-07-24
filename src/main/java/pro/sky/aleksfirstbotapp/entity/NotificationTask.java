package pro.sky.aleksfirstbotapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Сущность - напоминание задачи
 */
@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notification_tasks2")
public class NotificationTask {

    /**
     * Идентификатор напоминаний
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Задача, которую нужно запланировать
     */
    @Column(name = "message", nullable = false)
    private String message;

    /**
     * Идентификатор пользователя
     */
    @Column(name = "chat_id", nullable = false)
    private long chatId;

    /**
     * Дата и время планируемой задачи
     */
    @Column(name = "notification_date_time", nullable = false)
    private LocalDateTime notificationDateTime;
}
