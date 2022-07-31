package com.oaajava.demo.config;

import com.oaajava.demo.common.utils.DateUtil;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import org.apache.commons.lang.StringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * SQL格式化输出
 */

public class P6spySqlFormatConfigure implements MessageFormattingStrategy {

    /**
     * sql格式化输出
     */
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        return StringUtils.isNotBlank(sql) ? "执行时间:" + formatFullTime(LocalDateTime.now(), DateUtil.FULL_TIME_SPLIT_PATTERN) + "\r\n"+
                "SQL耗时【" + elapsed + "毫秒】  \r\n" +
                "最终执行SQL【" + sql + "】" : StringUtils.EMPTY;
    }

    /**
     * 日期格式化
     */
    public  String formatFullTime(LocalDateTime localDateTime, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        return localDateTime.format(dateTimeFormatter);
    }
}
