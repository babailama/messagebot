package com.ukrtatnafta.messagebot.db.repository;

import com.ukrtatnafta.messagebot.db.domain.LogRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ivanov-av on 01.12.2017.
 */
@Repository("messageBotCRUDLogRecordRepository")
public interface IMessageBotCRUDLogRecordRepository extends CrudRepository<LogRecord, Long> {
}
