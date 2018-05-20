/**   
 * 
 * @author: TianLi   
 *
 * @date: 2018年5月20日 下午1:25:27 
 */
package com.tianli.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

/** 
 * @Description: TODO
 * @author: TianLi
 * @date: 2018年5月20日 下午1:25:27  
 */
public class ResponseUtil {
	public static void write(HttpServletResponse response, Object obj)throws Exception{
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println(obj.toString());
        out.flush();
        out.close();
    }
}
