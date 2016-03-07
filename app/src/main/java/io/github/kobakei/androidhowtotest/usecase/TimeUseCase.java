package io.github.kobakei.androidhowtotest.usecase;

import org.threeten.bp.Clock;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;

/**
 * Use case about time/date.
 * Created by keisuke on 16/03/08.
 */
public class TimeUseCase {

    private Clock clock;

    public TimeUseCase(Clock clock) {
        this.clock = clock;
    }

    /**
     * Check if the epoch second is today or not
     * @param epochSeconds
     * @return
     */
    public boolean isToday(long epochSeconds) {
        Instant instant = Instant.ofEpochSecond(epochSeconds);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime now = LocalDateTime.now(clock);
        return localDateTime.toLocalDate().isEqual(now.toLocalDate());
    }
}
