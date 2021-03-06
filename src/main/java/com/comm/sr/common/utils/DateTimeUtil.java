package com.comm.sr.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.LocalDateTime;

/**
 * @author liubing
 * @version v 1.0 Jan 25, 2010 3:50:57 PM
 * @Desc:日期时间工具类，进行各种日期时间格式的转化以及格式化
 */
public class DateTimeUtil {

  ///
  // 定义时间日期显示格式
  ///
  public final static String DATE_FORMAT = "yyyy-MM-dd";
  public final static String DATE_FORMAT_CN = "yyyy年MM月dd日";
  public final static String TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
  public final static String TIME_FORMAT_CN = "yyyy年MM月dd日 HH:mm:ss";
  public final static String MONTH_FORMAT = "yyyy-MM";
  public final static String DAY_FORMAT = "yyyyMMdd";
  public static final String DATE_TIME_TZ = "yyyy-MM-dd'T'HH:mm:ss'Z'";

  public static void main(String[] args) {

    // String date = "2016-09-09 12:09:09";
    // String startDate = "2016-09-18 12:09:09";
    // String endDate = "2016-09-23 12:09:09";
    // Date date_ = DateTimeUtil.getFormatDateTime(date,DateTimeUtil.TIME_FORMAT);
    // Date startDate_ = DateTimeUtil.getFormatDateTime(startDate,DateTimeUtil.TIME_FORMAT);
    // Date endDate_ = DateTimeUtil.getFormatDateTime(endDate,DateTimeUtil.TIME_FORMAT );
    // if (date_.getTime() < startDate_.getTime() || date_.getTime() > endDate_.getTime()) {
    // System.out.print("not isWithin the range");
    //
    // }
    LocalDateTime localTime = new LocalDateTime();
    localTime.minusDays(1);
    localTime = localTime.withHourOfDay(0);
    localTime = localTime.withMinuteOfHour(0);
    localTime = localTime.withSecondOfMinute(0);
    System.out.print(localTime);
  }

  // private final static String TIME_FORMAT_MILLI = "yyyy-MM-dd HH:mm:ss.SSS";

  /**
   * 取得当前系统时间，返回java.util.Date类型
   * @return java.util.Date 返回服务器当前系统时间
   * @see Date
   */
  public static Date getCurrDate() {
    return new Date();
  }

  /**
   * 取得当前系统时间戳
   * @return java.sql.Timestamp 系统时间戳
   * @see java.sql.Timestamp
   */
  public static java.sql.Timestamp getCurrTimestamp() {
    return new java.sql.Timestamp(System.currentTimeMillis());
  }

  /**
   * 得到格式化后的日期，格式为yyyy-MM-dd，如2006-02-15
   * @param currDate 要格式化的日期
   * @return String 返回格式化后的日期，默认格式为为yyyy-MM-dd，如2006-02-15
   * @see #getFormatDate(Date, String)
   */
  public static String getFormatDate(Date currDate) {
    return getFormatDate(currDate, DATE_FORMAT);
  }

  /**
   * 得到格式化后的日期，格式为yyyy-MM-dd，如2006-02-15
   * @param currDate 要格式化的日期
   * @return Date 返回格式化后的日期，默认格式为为yyyy-MM-dd，如2006-02-15
   * @see #getFormatDate(Date)
   */
  public static Date getFormatDateToDate(Date currDate) {
    return getFormatDate(getFormatDate(currDate));
  }

  /**
   * 得到格式化后的日期，格式为yyyy年MM月dd日，如2006年02月15日
   * @param currDate 要格式化的日期
   * @return String 返回格式化后的日期，默认格式为yyyy年MM月dd日，如2006年02月15日
   * @see #getFormatDate(Date, String)
   */
  public static String getFormatDate_CN(Date currDate) {
    return getFormatDate(currDate, DATE_FORMAT_CN);
  }

  /**
   * 得到格式化后的日期，格式为yyyy年MM月dd日，如2006年02月15日
   * @param currDate 要格式化的日期
   * @return Date 返回格式化后的日期，默认格式为yyyy年MM月dd日，如2006年02月15日
   * @see #getFormatDate_CN(String)
   */
  public static Date getFormatDateToDate_CN(Date currDate) {
    return getFormatDate_CN(getFormatDate_CN(currDate));
  }

  /**
   * 得到格式化后的日期，格式为yyyy-MM-dd，如2006-02-15
   * @param currDate 要格式化的日期
   * @return Date 返回格式化后的日期，默认格式为yyyy-MM-dd，如2006-02-15
   * @see #getFormatDate(String, String)
   */
  public static Date getFormatDate(String currDate) {
    return getFormatDate(currDate, DATE_FORMAT);
  }

  /**
   * 得到格式化后的日期，格式为yyyy年MM月dd日，如2006年02月15日
   * @param currDate 要格式化的日期
   * @return 返回格式化后的日期，默认格式为yyyy年MM月dd日，如2006年02月15日
   * @see #getFormatDate(String, String)
   */
  public static Date getFormatDate_CN(String currDate) {
    return getFormatDate(currDate, DATE_FORMAT_CN);
  }

  /**
   * 根据格式得到格式化后的日期
   * @param currDate 要格式化的日期
   * @param format 日期格式，如yyyy-MM-dd
   * @return String 返回格式化后的日期，格式由参数<code>format</code>定义，如yyyy-MM-dd，如2006-02-15
   * @see SimpleDateFormat#format(Date)
   */
  public static String getFormatDate(Date currDate, String format) {
    SimpleDateFormat dtFormatdB = null;
    try {
      dtFormatdB = new SimpleDateFormat(format);
      return dtFormatdB.format(currDate);
    } catch (Exception e) {
      dtFormatdB = new SimpleDateFormat(DATE_FORMAT);
      return dtFormatdB.format(currDate);
    }
  }

  /**
   * 得到格式化后的时间，格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @param currDate 要格式化的时间
   * @return String 返回格式化后的时间，默认格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @see #getFormatDateTime(Date, String)
   */
  public static String getFormatDateTime(Date currDate) {
    return getFormatDateTime(currDate, TIME_FORMAT);
  }

  /**
   * 得到格式化后的时间，格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @param currDate 要格式环的时间
   * @return Date 返回格式化后的时间，默认格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @see #getFormatDateTime(String)
   */
  public static Date getFormatDateTimeToTime(Date currDate) {
    return getFormatDateTime(getFormatDateTime(currDate));
  }

  /**
   * 得到格式化后的时间，格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @param currDate 要格式化的时间
   * @return Date 返回格式化后的时间，默认格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @see #getFormatDateTime(String, String)
   */
  public static Date getFormatDateTime(String currDate) {
    return getFormatDateTime(currDate, TIME_FORMAT);
  }

  /**
   * 得到格式化后的时间，格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @param currDate 要格式化的时间
   * @return String 返回格式化后的时间，默认格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @see #getFormatDateTime(Date, String)
   */
  public static String getFormatDateTime_CN(Date currDate) {
    return getFormatDateTime(currDate, TIME_FORMAT_CN);
  }

  /**
   * 得到格式化后的时间，格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @param currDate 要格式化的时间
   * @return Date 返回格式化后的时间，默认格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @see #getFormatDateTime_CN(String)
   */
  public static Date getFormatDateTimeToTime_CN(Date currDate) {
    return getFormatDateTime_CN(getFormatDateTime_CN(currDate));
  }

  /**
   * 得到格式化后的时间，格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @param currDate 要格式化的时间
   * @return Date 返回格式化后的时间，默认格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @see #getFormatDateTime(String, String)
   */
  public static Date getFormatDateTime_CN(String currDate) {
    return getFormatDateTime(currDate, TIME_FORMAT_CN);
  }

  /**
   * 根据格式得到格式化后的时间
   * @param currDate 要格式化的时间
   * @param format 时间格式，如yyyy-MM-dd HH:mm:ss
   * @return String 返回格式化后的时间，格式由参数<code>format</code>定义，如yyyy-MM-dd HH:mm:ss
   * @see SimpleDateFormat#format(Date)
   */
  public static String getFormatDateTime(Date currDate, String format) {
    SimpleDateFormat dtFormatdB = null;
    try {
      dtFormatdB = new SimpleDateFormat(format);
      return dtFormatdB.format(currDate);
    } catch (Exception e) {
      dtFormatdB = new SimpleDateFormat(TIME_FORMAT);
      return dtFormatdB.format(currDate);
    }
  }

  /**
   * 根据格式得到格式化后的日期
   * @param currDate 要格式化的日期
   * @param format 日期格式，如yyyy-MM-dd
   * @return Date 返回格式化后的日期，格式由参数<code>format</code>定义，如yyyy-MM-dd，如2006-02-15
   * @see SimpleDateFormat#parse(String)
   */
  public static Date getFormatDate(String currDate, String format) {
    SimpleDateFormat dtFormatdB = null;
    try {
      dtFormatdB = new SimpleDateFormat(format);
      return dtFormatdB.parse(currDate);
    } catch (Exception e) {
      dtFormatdB = new SimpleDateFormat(DATE_FORMAT);
      try {
        return dtFormatdB.parse(currDate);
      } catch (Exception ex) {
      }
    }
    return null;
  }

  /**
   * 根据格式得到格式化后的时间
   * @param currDate 要格式化的时间
   * @param format 时间格式，如yyyy-MM-dd HH:mm:ss
   * @return Date 返回格式化后的时间，格式由参数<code>format</code>定义，如yyyy-MM-dd HH:mm:ss
   * @see SimpleDateFormat#parse(String)
   */
  public static Date getFormatDateTime(String currDate, String format) {
    SimpleDateFormat dtFormatdB = null;
    try {
      dtFormatdB = new SimpleDateFormat(format);
      return dtFormatdB.parse(currDate);
    } catch (Exception e) {
      dtFormatdB = new SimpleDateFormat(TIME_FORMAT);
      try {
        return dtFormatdB.parse(currDate);
      } catch (Exception ex) {
      }
    }
    return null;
  }

  /**
   * 得到格式化后的当前系统日期，格式为yyyy-MM-dd，如2006-02-15
   * @return String 返回格式化后的当前服务器系统日期，格式为yyyy-MM-dd，如2006-02-15
   * @see #getFormatDate(Date)
   */
  public static String getCurrDateStr() {
    return getFormatDate(getCurrDate());
  }

  public static String getOffsetDateStr(int offsetDays) {
    return getFormatDate(getDateBeforeOrAfter(offsetDays));
  }

  public static String getOffsetDateStr(int offsetDays, String format) {
    return getFormatDate(getDateBeforeOrAfter(offsetDays), DateTimeUtil.DATE_TIME_TZ);
  }

  /**
   * 得到格式化后的当前系统时间，格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @return String 返回格式化后的当前服务器系统时间，格式为yyyy-MM-dd HH:mm:ss，如2006-02-15 15:23:45
   * @see #getFormatDateTime(Date)
   */
  public static String getCurrDateTimeStr() {
    return getFormatDateTime(getCurrDate());
  }

  /**
   * 得到格式化后的当前系统日期，格式为yyyy年MM月dd日，如2006年02月15日
   * @return String 返回当前服务器系统日期，格式为yyyy年MM月dd日，如2006年02月15日
   * @see #getFormatDate(Date, String)
   */
  public static String getCurrDateStr_CN() {
    return getFormatDate(getCurrDate(), DATE_FORMAT_CN);
  }

  /**
   * 得到格式化后的当前系统时间，格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @return String 返回格式化后的当前服务器系统时间，格式为yyyy年MM月dd日 HH:mm:ss，如2006年02月15日 15:23:45
   * @see #getFormatDateTime(Date, String)
   */
  public static String getCurrDateTimeStr_CN() {
    return getFormatDateTime(getCurrDate(), TIME_FORMAT_CN);
  }

  /**
   * 得到系统当前日期的前或者后几天
   * @param iDate 如果要获得前几天日期，该参数为负数； 如果要获得后几天日期，该参数为正数
   * @return Date 返回系统当前日期的前或者后几天
   * @see Calendar#add(int, int)
   */
  public static Date getDateBeforeOrAfter(int iDate) {
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH, iDate);
    return cal.getTime();
  }

  /**
   * 得到日期的前或者后几天
   * @param iDate 如果要获得前几天日期，该参数为负数； 如果要获得后几天日期，该参数为正数
   * @return Date 返回参数<code>curDate</code>定义日期的前或者后几天
   * @see Calendar#add(int, int)
   */
  public static Date getDateBeforeOrAfter(Date curDate, int iDate) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(curDate);
    cal.add(Calendar.DAY_OF_MONTH, iDate);
    return cal.getTime();
  }

  /**
   * 得到格式化后的月份，格式为yyyy-MM，如2006-02
   * @param currDate 要格式化的日期
   * @return String 返回格式化后的月份，格式为yyyy-MM，如2006-02
   * @see #getFormatDate(Date, String)
   */
  public static String getFormatMonth(Date currDate) {
    return getFormatDate(currDate, MONTH_FORMAT);
  }

  /**
   * 得到格式化后的日，格式为yyyyMMdd，如20060210
   * @param currDate 要格式化的日期
   * @return String 返回格式化后的日，格式为yyyyMMdd，如20060210
   * @see #getFormatDate(Date, String)
   */
  public static String getFormatDay(Date currDate) {
    return getFormatDate(currDate, DAY_FORMAT);
  }

  /**
   * 得到格式化后的当月第一天，格式为yyyy-MM-dd，如2006-02-01
   * @return String 返回格式化后的当月第一天，格式为yyyy-MM-dd，如2006-02-01
   * @see Calendar#getMinimum(int)
   * @see #getFormatDate(Date, String)
   */
  public static String getFirstDayOfMonth() {
    Calendar cal = Calendar.getInstance();
    int firstDay = cal.getMinimum(Calendar.DAY_OF_MONTH);
    cal.set(Calendar.DAY_OF_MONTH, firstDay);
    return getFormatDate(cal.getTime(), DATE_FORMAT);
  }

  /**
   * 得到格式化后的当月第一天，格式为yyyy-MM-dd，如2006-02-01
   * @param currDate 要格式化的日期
   * @return String 返回格式化后的当月第一天，格式为yyyy-MM-dd，如2006-02-01
   * @see Calendar#getMinimum(int)
   * @see #getFormatDate(Date, String)
   */
  public static String getFirstDayOfMonth(Date currDate) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(currDate);
    int firstDay = cal.getMinimum(Calendar.DAY_OF_MONTH);
    cal.set(Calendar.DAY_OF_MONTH, firstDay);
    return getFormatDate(cal.getTime(), DATE_FORMAT);
  }

  /**
   * 得到日期的前或者后几分钟
   * @param iMinute 如果要获得前几分钟日期，该参数为负数； 如果要获得后几分钟日期，该参数为正数
   * @return Date 返回参数<code>curDate</code>定义日期的前或者后几分钟
   * @see Calendar#add(int, int)
   */
  public static Date getDateBeforeOrAfterMinutes(Date curDate, int iMinute) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(curDate);
    cal.add(Calendar.MINUTE, iMinute);
    return cal.getTime();
  }

  /**
   * 得到日期的前或者后几小时
   * @param iHour 如果要获得前几小时日期，该参数为负数； 如果要获得后几小时日期，该参数为正数
   * @return Date 返回参数<code>curDate</code>定义日期的前或者后几小时
   * @see Calendar#add(int, int)
   */
  public static Date getDateBeforeOrAfterHours(Date curDate, int iHour) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(curDate);
    cal.add(Calendar.HOUR_OF_DAY, iHour);
    return cal.getTime();
  }

  /**
   * 得到日期的前或者后几个月
   * @param iMonth 如果要获得前几个月日期，该参数为负数； 如果要获得后几个月日期，该参数为正数
   * @return Date 返回参数<code>curDate</code>定义日期的前或者后几个月
   * @see Calendar#add(int, int)
   */
  public static Date getDateBeforeOrAfterMonths(Date curDate, int iMonth) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(curDate);
    cal.add(Calendar.MONTH, iMonth);
    return cal.getTime();
  }

  /**
   * 获取日期的凌晨Date对象
   * @param currDate
   * @return Date
   * @Desc:
   * @author: liubing
   */
  public static Date getWeeHourDateTime(Date currDate) {

    Calendar c = Calendar.getInstance();
    c.setTime(currDate);
    c.set(Calendar.HOUR_OF_DAY, 0);
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    return c.getTime();
  }

  /**
   * 获取明天的凌晨的时间
   * @param currDate
   * @return Date
   * @Desc:
   * @author: liubing
   */
  public static Date getDateOfNextDay(Date currDate) {

    return getWeeHourDateTime(getDateBeforeOrAfter(currDate, 1));
  }

  /**
   * 得到传入日期与当前系统日期相差几天 (纯日期比较)
   * @param currDate 需要比较的日期时间
   * @return long 返回参数 如果比较日期比当前日期小，则返回负数 如果比较日期比当前日期大，则返回正数
   * @Desc: 比如 2月5日 和2月6日比较 不关心几点 就是返回相差1天
   * @author: liubing
   */
  public static int getIntCompareToCurrDateDay(Date currDate) {

    currDate = getWeeHourDateTime(currDate);
    Date nowDate = getWeeHourDateTime(getCurrDate());

    long currDayCount = currDate.getTime() / (1000 * 60 * 60 * 24);
    long nowDateCount = nowDate.getTime() / (1000 * 60 * 60 * 24);

    return (int) (currDayCount - nowDateCount);
  }

  /**
   * 得到传入日期与当前日期相差几天 （24小时为一天，不足24小时为0天）
   * @param currDate 需要比较的日期时间
   * @return long 返回参数 如果比较日期比当前日期小，则返回负数 如果比较日期比当前日期大，则返回正数
   * @Desc:
   * @author: liubing
   */
  public static int getIntCompareToCurrDateHour(Date currDate) {

    return (int) ((currDate.getTime() - getCurrDate().getTime()) / (1000 * 60 * 60));
  }

  /**
   * 根据时间戳返回日期对象
   * @return Date
   * @Desc:
   * @author: liubing
   */
  public static Date getDateFromTimeMillis(Long currentTimeMillis) {

    System.out.println("currentTimeMillis=" + currentTimeMillis);
    Calendar cal = Calendar.getInstance();
    System.out.println("cal=" + cal);
    cal.setTimeInMillis(currentTimeMillis);
    System.out.println("setTimeInMillis=");

    return cal.getTime();
  }

}
