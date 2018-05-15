/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月15日 下午3:47:52 
 */
package com.tianli.util;

/**
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月15日 下午3:47:52
 */
public class DateUtil {
	
	public static java.sql.Timestamp d2t(java.util.Date d) {
		if (null == d)
			return null;
		return new java.sql.Timestamp(d.getTime());
	}

	public static java.util.Date t2d(java.sql.Timestamp t) {
		if (null == t)
			return null;
		return new java.util.Date(t.getTime());
	}
}
