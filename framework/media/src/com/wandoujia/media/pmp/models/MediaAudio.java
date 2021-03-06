// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./audio.proto
package com.wandoujia.media.pmp.models;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoEnum;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.SINT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.PACKED;

public final class MediaAudio extends Message {

  public static final Long DEFAULT_ID = 0L;
  public static final String DEFAULT_PATH = "";
  public static final String DEFAULT_DISPLAY_NAME = "";
  public static final String DEFAULT_MIME_TYPE = "";
  public static final String DEFAULT_TITLE = "";
  public static final Long DEFAULT_SIZE = 0L;
  public static final Long DEFAULT_DATE_ADDED = 0L;
  public static final Long DEFAULT_DATE_MODIFIED = 0L;
  public static final String DEFAULT_ALBUM_NAME = "";
  public static final Long DEFAULT_ALBUM_ID = 0L;
  public static final String DEFAULT_ARTIST_NAME = "";
  public static final Long DEFAULT_ARTIST_ID = 0L;
  public static final List<Long> DEFAULT_GENRES = Collections.emptyList();
  public static final String DEFAULT_COMPOSER_NAME = "";
  public static final Long DEFAULT_DURATION = 0L;
  public static final Integer DEFAULT_TRACK_NO = 0;
  public static final Integer DEFAULT_YEAR = 0;
  public static final Long DEFAULT_BOOKMARK = 0L;
  public static final Integer DEFAULT_IS_ALARM = 0;
  public static final Integer DEFAULT_IS_MUSIC = 0;
  public static final Integer DEFAULT_IS_NOTIFICATION = 0;
  public static final Integer DEFAULT_IS_PODCAST = 0;
  public static final Integer DEFAULT_IS_RINGTONE = 0;

  @ProtoField(tag = 1, type = SINT64)
  public final Long id;

  @ProtoField(tag = 2, type = STRING)
  public final String path;

  @ProtoField(tag = 3, type = STRING)
  public final String display_name;

  @ProtoField(tag = 4, type = STRING)
  public final String mime_type;

  @ProtoField(tag = 5, type = STRING)
  public final String title;

  @ProtoField(tag = 6, type = SINT64)
  public final Long size;

  @ProtoField(tag = 7, type = SINT64)
  public final Long date_added;

  @ProtoField(tag = 8, type = SINT64)
  public final Long date_modified;

  @ProtoField(tag = 9, type = STRING)
  public final String album_name;

  @ProtoField(tag = 10, type = SINT64)
  public final Long album_id;

  @ProtoField(tag = 11, type = STRING)
  public final String artist_name;

  @ProtoField(tag = 12, type = SINT64)
  public final Long artist_id;

  @ProtoField(tag = 13, type = SINT64, label = PACKED)
  public final List<Long> genres;

  @ProtoField(tag = 14, type = STRING)
  public final String composer_name;

  @ProtoField(tag = 15, type = SINT64)
  public final Long duration;

  @ProtoField(tag = 16, type = INT32)
  public final Integer track_no;

  @ProtoField(tag = 17, type = INT32)
  public final Integer year;

  @ProtoField(tag = 18, type = INT64)
  public final Long bookmark;

  @ProtoField(tag = 19, type = INT32)
  public final Integer is_alarm;

  @ProtoField(tag = 20, type = INT32)
  public final Integer is_music;

  @ProtoField(tag = 21, type = INT32)
  public final Integer is_notification;

  @ProtoField(tag = 22, type = INT32)
  public final Integer is_podcast;

  @ProtoField(tag = 23, type = INT32)
  public final Integer is_ringtone;

  private MediaAudio(Builder builder) {
    super(builder);
    this.id = builder.id;
    this.path = builder.path;
    this.display_name = builder.display_name;
    this.mime_type = builder.mime_type;
    this.title = builder.title;
    this.size = builder.size;
    this.date_added = builder.date_added;
    this.date_modified = builder.date_modified;
    this.album_name = builder.album_name;
    this.album_id = builder.album_id;
    this.artist_name = builder.artist_name;
    this.artist_id = builder.artist_id;
    this.genres = immutableCopyOf(builder.genres);
    this.composer_name = builder.composer_name;
    this.duration = builder.duration;
    this.track_no = builder.track_no;
    this.year = builder.year;
    this.bookmark = builder.bookmark;
    this.is_alarm = builder.is_alarm;
    this.is_music = builder.is_music;
    this.is_notification = builder.is_notification;
    this.is_podcast = builder.is_podcast;
    this.is_ringtone = builder.is_ringtone;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MediaAudio)) return false;
    MediaAudio o = (MediaAudio) other;
    return equals(id, o.id)
        && equals(path, o.path)
        && equals(display_name, o.display_name)
        && equals(mime_type, o.mime_type)
        && equals(title, o.title)
        && equals(size, o.size)
        && equals(date_added, o.date_added)
        && equals(date_modified, o.date_modified)
        && equals(album_name, o.album_name)
        && equals(album_id, o.album_id)
        && equals(artist_name, o.artist_name)
        && equals(artist_id, o.artist_id)
        && equals(genres, o.genres)
        && equals(composer_name, o.composer_name)
        && equals(duration, o.duration)
        && equals(track_no, o.track_no)
        && equals(year, o.year)
        && equals(bookmark, o.bookmark)
        && equals(is_alarm, o.is_alarm)
        && equals(is_music, o.is_music)
        && equals(is_notification, o.is_notification)
        && equals(is_podcast, o.is_podcast)
        && equals(is_ringtone, o.is_ringtone);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (path != null ? path.hashCode() : 0);
      result = result * 37 + (display_name != null ? display_name.hashCode() : 0);
      result = result * 37 + (mime_type != null ? mime_type.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      result = result * 37 + (size != null ? size.hashCode() : 0);
      result = result * 37 + (date_added != null ? date_added.hashCode() : 0);
      result = result * 37 + (date_modified != null ? date_modified.hashCode() : 0);
      result = result * 37 + (album_name != null ? album_name.hashCode() : 0);
      result = result * 37 + (album_id != null ? album_id.hashCode() : 0);
      result = result * 37 + (artist_name != null ? artist_name.hashCode() : 0);
      result = result * 37 + (artist_id != null ? artist_id.hashCode() : 0);
      result = result * 37 + (genres != null ? genres.hashCode() : 1);
      result = result * 37 + (composer_name != null ? composer_name.hashCode() : 0);
      result = result * 37 + (duration != null ? duration.hashCode() : 0);
      result = result * 37 + (track_no != null ? track_no.hashCode() : 0);
      result = result * 37 + (year != null ? year.hashCode() : 0);
      result = result * 37 + (bookmark != null ? bookmark.hashCode() : 0);
      result = result * 37 + (is_alarm != null ? is_alarm.hashCode() : 0);
      result = result * 37 + (is_music != null ? is_music.hashCode() : 0);
      result = result * 37 + (is_notification != null ? is_notification.hashCode() : 0);
      result = result * 37 + (is_podcast != null ? is_podcast.hashCode() : 0);
      result = result * 37 + (is_ringtone != null ? is_ringtone.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<MediaAudio> {

    public Long id;
    public String path;
    public String display_name;
    public String mime_type;
    public String title;
    public Long size;
    public Long date_added;
    public Long date_modified;
    public String album_name;
    public Long album_id;
    public String artist_name;
    public Long artist_id;
    public List<Long> genres;
    public String composer_name;
    public Long duration;
    public Integer track_no;
    public Integer year;
    public Long bookmark;
    public Integer is_alarm;
    public Integer is_music;
    public Integer is_notification;
    public Integer is_podcast;
    public Integer is_ringtone;

    public Builder() {
    }

    public Builder(MediaAudio message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.path = message.path;
      this.display_name = message.display_name;
      this.mime_type = message.mime_type;
      this.title = message.title;
      this.size = message.size;
      this.date_added = message.date_added;
      this.date_modified = message.date_modified;
      this.album_name = message.album_name;
      this.album_id = message.album_id;
      this.artist_name = message.artist_name;
      this.artist_id = message.artist_id;
      this.genres = copyOf(message.genres);
      this.composer_name = message.composer_name;
      this.duration = message.duration;
      this.track_no = message.track_no;
      this.year = message.year;
      this.bookmark = message.bookmark;
      this.is_alarm = message.is_alarm;
      this.is_music = message.is_music;
      this.is_notification = message.is_notification;
      this.is_podcast = message.is_podcast;
      this.is_ringtone = message.is_ringtone;
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder path(String path) {
      this.path = path;
      return this;
    }

    public Builder display_name(String display_name) {
      this.display_name = display_name;
      return this;
    }

    public Builder mime_type(String mime_type) {
      this.mime_type = mime_type;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder size(Long size) {
      this.size = size;
      return this;
    }

    public Builder date_added(Long date_added) {
      this.date_added = date_added;
      return this;
    }

    public Builder date_modified(Long date_modified) {
      this.date_modified = date_modified;
      return this;
    }

    public Builder album_name(String album_name) {
      this.album_name = album_name;
      return this;
    }

    public Builder album_id(Long album_id) {
      this.album_id = album_id;
      return this;
    }

    public Builder artist_name(String artist_name) {
      this.artist_name = artist_name;
      return this;
    }

    public Builder artist_id(Long artist_id) {
      this.artist_id = artist_id;
      return this;
    }

    public Builder genres(List<Long> genres) {
      this.genres = checkForNulls(genres);
      return this;
    }

    public Builder composer_name(String composer_name) {
      this.composer_name = composer_name;
      return this;
    }

    public Builder duration(Long duration) {
      this.duration = duration;
      return this;
    }

    public Builder track_no(Integer track_no) {
      this.track_no = track_no;
      return this;
    }

    public Builder year(Integer year) {
      this.year = year;
      return this;
    }

    public Builder bookmark(Long bookmark) {
      this.bookmark = bookmark;
      return this;
    }

    public Builder is_alarm(Integer is_alarm) {
      this.is_alarm = is_alarm;
      return this;
    }

    public Builder is_music(Integer is_music) {
      this.is_music = is_music;
      return this;
    }

    public Builder is_notification(Integer is_notification) {
      this.is_notification = is_notification;
      return this;
    }

    public Builder is_podcast(Integer is_podcast) {
      this.is_podcast = is_podcast;
      return this;
    }

    public Builder is_ringtone(Integer is_ringtone) {
      this.is_ringtone = is_ringtone;
      return this;
    }

    @Override
    public MediaAudio build() {
      return new MediaAudio(this);
    }
  }

  public enum ScanType
      implements ProtoEnum {
    ID_ONLY(0),
    METADATA(1),
    FULL(2);

    private final int value;

    private ScanType(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  public enum Type
      implements ProtoEnum {
    RINGTONE(0),
    NOTIFICATION(1),
    ALARM(2);

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
