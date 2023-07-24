package pro.sky.aleksfirstbotapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pro.sky.aleksfirstbotapp.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Репозиторий напоминаний
 */
public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    /**
     * Поиск всех напоминаний по дате и времени
     *
     * @param localDateTime дата и время
     * @return список напоминаний
     */
    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);

    /*List<NotificationTask> findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime, long chatId);

    @Modifying
    @Query("DELETE FROM NotificationTask WHERE message like %:nameLike%")
    void removeAllLike(@Param("nameLike") String nameLike);

    @Query("SELECT nt FROM NotificationTask nt WHERE nt.user.name like %:nameLike%")

    @Query("SELECT nt.* FROM notification_tasks nt INNER JOIN user u ON nt.user_id= u.id WHERE u.name like %:nameLike%", nativeQuery = true)
    List<NotificationTask> findAllByNameLike(@Param("nameLike") String nameLike);
*/
}
