// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./log_muce.proto
package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Label.REPEATED;

/**
 * 用于批量发送 Event
 */
public final class LogReportBatchEvent extends Message {

  public static final List<LogReportEvent> DEFAULT_EVENT = Collections.emptyList();
  public static final Long DEFAULT_DISCARDED_EVENT = 0L;

  @ProtoField(tag = 1, label = REPEATED)
  public final List<LogReportEvent> event;

  @ProtoField(tag = 2, type = INT64)
  public final Long discarded_event;

  private LogReportBatchEvent(Builder builder) {
    super(builder);
    this.event = immutableCopyOf(builder.event);
    this.discarded_event = builder.discarded_event;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof LogReportBatchEvent)) return false;
    LogReportBatchEvent o = (LogReportBatchEvent) other;
    return equals(event, o.event)
        && equals(discarded_event, o.discarded_event);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = event != null ? event.hashCode() : 1;
      result = result * 37 + (discarded_event != null ? discarded_event.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<LogReportBatchEvent> {

    public List<LogReportEvent> event;
    public Long discarded_event;

    public Builder() {
    }

    public Builder(LogReportBatchEvent message) {
      super(message);
      if (message == null) return;
      this.event = copyOf(message.event);
      this.discarded_event = message.discarded_event;
    }

    public Builder event(List<LogReportEvent> event) {
      this.event = checkForNulls(event);
      return this;
    }

    public Builder discarded_event(Long discarded_event) {
      this.discarded_event = discarded_event;
      return this;
    }

    @Override
    public LogReportBatchEvent build() {
      return new LogReportBatchEvent(this);
    }
  }
}
