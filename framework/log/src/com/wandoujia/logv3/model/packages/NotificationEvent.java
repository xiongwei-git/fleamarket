// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./log_transition.proto
package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.STRING;

public final class NotificationEvent extends Message {

  public static final Action DEFAULT_ACTION = Action.SHOW;
  public static final String DEFAULT_TITLE = "";
  public static final String DEFAULT_TYPE = "";

  /**
   * 在通知栏上的操作
   */
  @ProtoField(tag = 1, type = ENUM)
  public final Action action;

  /**
   * 通知标题
   */
  @ProtoField(tag = 2, type = STRING)
  public final String title;

  /**
   * 通知栏样式
   */
  @ProtoField(tag = 3, type = STRING)
  public final String type;

  /**
   * 通知栏跳往的页面
   */
  @ProtoField(tag = 4)
  public final UrlPackage landing_page;

  /**
   * 各个业务自己的 package
   */
  @ProtoField(tag = 5)
  public final ExtraPackage extra_package;

  private NotificationEvent(Builder builder) {
    super(builder);
    this.action = builder.action;
    this.title = builder.title;
    this.type = builder.type;
    this.landing_page = builder.landing_page;
    this.extra_package = builder.extra_package;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof NotificationEvent)) return false;
    NotificationEvent o = (NotificationEvent) other;
    return equals(action, o.action)
        && equals(title, o.title)
        && equals(type, o.type)
        && equals(landing_page, o.landing_page)
        && equals(extra_package, o.extra_package);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = action != null ? action.hashCode() : 0;
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (type != null ? type.hashCode() : 0);
      result = result * 37 + (landing_page != null ? landing_page.hashCode() : 0);
      result = result * 37 + (extra_package != null ? extra_package.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<NotificationEvent> {

    public Action action;
    public String title;
    public String type;
    public UrlPackage landing_page;
    public ExtraPackage extra_package;

    public Builder() {
    }

    public Builder(NotificationEvent message) {
      super(message);
      if (message == null) return;
      this.action = message.action;
      this.title = message.title;
      this.type = message.type;
      this.landing_page = message.landing_page;
      this.extra_package = message.extra_package;
    }

    /**
     * 在通知栏上的操作
     */
    public Builder action(Action action) {
      this.action = action;
      return this;
    }

    /**
     * 通知标题
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 通知栏样式
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * 通知栏跳往的页面
     */
    public Builder landing_page(UrlPackage landing_page) {
      this.landing_page = landing_page;
      return this;
    }

    /**
     * 各个业务自己的 package
     */
    public Builder extra_package(ExtraPackage extra_package) {
      this.extra_package = extra_package;
      return this;
    }

    @Override
    public NotificationEvent build() {
      return new NotificationEvent(this);
    }
  }

  public enum Action
      implements ProtoEnum {
    SHOW(0),
    /**
     * 展示
     */
    CLICK(1),
    /**
     * 点击
     */
    DISMISS(2),
    /**
     * 忽略
     */
    EXPAND(3);

    private final int value;

    private Action(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
