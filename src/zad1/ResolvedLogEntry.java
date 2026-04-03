/**
 *
 *  @author Polański Aleksander s33173
 *
 */

package zad1;


import java.time.ZonedDateTime;

public record ResolvedLogEntry(
    LogEntry source,
    ZonedDateTime serverTime,
    ResolutionKind resolutionKind
) {}
