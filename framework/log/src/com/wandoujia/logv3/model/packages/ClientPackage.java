// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./log_common_package.proto
package com.wandoujia.logv3.model.packages;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.ENUM;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;

/**
 * client 信息，每条 log 都需要带
 */
public final class ClientPackage extends Message {

  public static final Product DEFAULT_PRODUCT = Product.WINDOWS;
  public static final Platform DEFAULT_PLATFORM = Platform.ANDROID_PHONE;
  public static final String DEFAULT_FIRST_SOURCE = "";
  public static final String DEFAULT_LAST_SOURCE = "";
  public static final String DEFAULT_WINDOWS_SOURCE = "";
  public static final String DEFAULT_VERSION_NAME = "";
  public static final Integer DEFAULT_VERSION_CODE = 0;
  public static final String DEFAULT_LOCALE = "";
  public static final Language DEFAULT_LANGUAGE = Language.SIMPLE_CHINESE;
  public static final Integer DEFAULT_INTERNAL_VERSION_CODE = 0;
  public static final Long DEFAULT_CREATE_DATE = 0L;

  /**
   * 产品
   */
  @ProtoField(tag = 1, type = ENUM)
  public final Product product;

  /**
   * 设备平台
   */
  @ProtoField(tag = 2, type = ENUM)
  public final Platform platform;

  /**
   * 首次安装时渠道号
   */
  @ProtoField(tag = 3, type = STRING)
  public final String first_source;

  /**
   * 产品当前的渠道号
   */
  @ProtoField(tag = 4, type = STRING)
  public final String last_source;

  /**
   * 此时设备上的产品渠道来自 PC 的渠道号
   */
  @ProtoField(tag = 5, type = STRING)
  public final String windows_source;

  /**
   * 产品的版本名, ex. 4.6.1
   */
  @ProtoField(tag = 6, type = STRING)
  public final String version_name;

  /**
   * 产品的版本号
   */
  @ProtoField(tag = 7, type = INT32)
  public final Integer version_code;

  /**
   * 客户端的语言版本(如 thai 表示泰语版本)
   */
  @ProtoField(tag = 8, type = STRING)
  public final String locale;

  /**
   * 客户端选择的语言
   */
  @ProtoField(tag = 9, type = ENUM)
  public final Language language;

  /**
   * 内部版本号
   */
  @ProtoField(tag = 10, type = INT32)
  public final Integer internal_version_code;

  /**
   * 客户端第一次安装的时间(使用Unix timestamp)
   */
  @ProtoField(tag = 11, type = INT64)
  public final Long create_date;

  private ClientPackage(Builder builder) {
    super(builder);
    this.product = builder.product;
    this.platform = builder.platform;
    this.first_source = builder.first_source;
    this.last_source = builder.last_source;
    this.windows_source = builder.windows_source;
    this.version_name = builder.version_name;
    this.version_code = builder.version_code;
    this.locale = builder.locale;
    this.language = builder.language;
    this.internal_version_code = builder.internal_version_code;
    this.create_date = builder.create_date;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ClientPackage)) return false;
    ClientPackage o = (ClientPackage) other;
    return equals(product, o.product)
        && equals(platform, o.platform)
        && equals(first_source, o.first_source)
        && equals(last_source, o.last_source)
        && equals(windows_source, o.windows_source)
        && equals(version_name, o.version_name)
        && equals(version_code, o.version_code)
        && equals(locale, o.locale)
        && equals(language, o.language)
        && equals(internal_version_code, o.internal_version_code)
        && equals(create_date, o.create_date);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = product != null ? product.hashCode() : 0;
      result = result * 37 + (platform != null ? platform.hashCode() : 0);
      result = result * 37 + (first_source != null ? first_source.hashCode() : 0);
      result = result * 37 + (last_source != null ? last_source.hashCode() : 0);
      result = result * 37 + (windows_source != null ? windows_source.hashCode() : 0);
      result = result * 37 + (version_name != null ? version_name.hashCode() : 0);
      result = result * 37 + (version_code != null ? version_code.hashCode() : 0);
      result = result * 37 + (locale != null ? locale.hashCode() : 0);
      result = result * 37 + (language != null ? language.hashCode() : 0);
      result = result * 37 + (internal_version_code != null ? internal_version_code.hashCode() : 0);
      result = result * 37 + (create_date != null ? create_date.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ClientPackage> {

    public Product product;
    public Platform platform;
    public String first_source;
    public String last_source;
    public String windows_source;
    public String version_name;
    public Integer version_code;
    public String locale;
    public Language language;
    public Integer internal_version_code;
    public Long create_date;

    public Builder() {
    }

    public Builder(ClientPackage message) {
      super(message);
      if (message == null) return;
      this.product = message.product;
      this.platform = message.platform;
      this.first_source = message.first_source;
      this.last_source = message.last_source;
      this.windows_source = message.windows_source;
      this.version_name = message.version_name;
      this.version_code = message.version_code;
      this.locale = message.locale;
      this.language = message.language;
      this.internal_version_code = message.internal_version_code;
      this.create_date = message.create_date;
    }

    /**
     * 产品
     */
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    /**
     * 设备平台
     */
    public Builder platform(Platform platform) {
      this.platform = platform;
      return this;
    }

    /**
     * 首次安装时渠道号
     */
    public Builder first_source(String first_source) {
      this.first_source = first_source;
      return this;
    }

    /**
     * 产品当前的渠道号
     */
    public Builder last_source(String last_source) {
      this.last_source = last_source;
      return this;
    }

    /**
     * 此时设备上的产品渠道来自 PC 的渠道号
     */
    public Builder windows_source(String windows_source) {
      this.windows_source = windows_source;
      return this;
    }

    /**
     * 产品的版本名, ex. 4.6.1
     */
    public Builder version_name(String version_name) {
      this.version_name = version_name;
      return this;
    }

    /**
     * 产品的版本号
     */
    public Builder version_code(Integer version_code) {
      this.version_code = version_code;
      return this;
    }

    /**
     * 客户端的语言版本(如 thai 表示泰语版本)
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * 客户端选择的语言
     */
    public Builder language(Language language) {
      this.language = language;
      return this;
    }

    /**
     * 内部版本号
     */
    public Builder internal_version_code(Integer internal_version_code) {
      this.internal_version_code = internal_version_code;
      return this;
    }

    /**
     * 客户端第一次安装的时间(使用Unix timestamp)
     */
    public Builder create_date(Long create_date) {
      this.create_date = create_date;
      return this;
    }

    @Override
    public ClientPackage build() {
      return new ClientPackage(this);
    }
  }

  public enum Product
      implements ProtoEnum {
    WINDOWS(0),
    /**
     * windows
     */
    ANDROID(1),
    /**
     * p4
     */
    USB_CONNECTION(2),
    /**
     * usb连接引擎
     */
    GAME_SDK(3),
    /**
     * 游戏sdk
     */
    MARIO_SDK(4),
    /**
     * mario sdk
     */
    IOS(5),
    /**
     * IOS版
     */
    ADS(6);

    private final int value;

    private Product(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum Platform
      implements ProtoEnum {
    ANDROID_PHONE(0),
    ANDROID_TABLET(1),
    IPHONE(2),
    IPAD(3),
    PC(4);

    private final int value;

    private Platform(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum Language
      implements ProtoEnum {
    SIMPLE_CHINESE(0),
    ENGLISH(1),
    THAI(2);

    private final int value;

    private Language(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
