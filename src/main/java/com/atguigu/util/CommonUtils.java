package com.atguigu.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通用工具箱
 * @ClassName CommonUtils
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Seifon
 * @Date 2017年7月5日 下午6:50:21
 * @version 1.0.0
 */
public class CommonUtils {

    public static String simpleFormatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
}
