package com.wandoujia.base.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liuyaxin on 2014/4/12.
 */
public class PathAdjustUtil {

  private static final String SDCARD_EMULATED = "storage/emulated/";
  private static final String SDCARD_REAL = "storage/sdcard";

  public static String adjustSdcardPathForAdb(String path) {
    Pattern pattern = Pattern.compile("^/storage/emulated/\\d{1,2}");
    Matcher matcher = pattern.matcher(path);
    if (matcher.find()) {
      return path.replace(SDCARD_EMULATED, SDCARD_REAL);
    } else {
      return path;
    }
  }

  public static String adjustSdcardPathForApp(String path) {
    Pattern pattern = Pattern.compile("^/storage/sdcard\\d{1,2}");
    Matcher matcher = pattern.matcher(path);
    if (matcher.find()) {
      return path.replace(SDCARD_REAL, SDCARD_EMULATED);
    } else {
      return path;
    }
  }

}
