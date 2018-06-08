package cn.edu.zua.damon.util;

import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * MyToStringStyleBuilder
 *
 * @author ascend
 * @date 2018/6/4 15:04.
 */
public class MyToStringStyleBuilder {
    private static Map<String, String> filedNameMap = new HashMap<>();

    public MyToStringStyleBuilder() {
    }

    /**
     * 创建默认的ToStringStyle
     * 日期输出：Date-->yyyy-MM-dd HH:mm:ss
     *
     * @return ToStringStyle
     */
    public static ToStringStyle build() {
        return new ToStringStyle() {
            private static final long serialVersionUID = -6571916616666945972L;

            /**
             * <p>Append to the <code>toString</code> an <code>Object</code>
             * value, printing the full detail of the <code>Object</code>.</p>
             *
             * @param buffer    the <code>StringBuffer</code> to populate
             * @param fieldName the field name, typically not used as already appended
             * @param value     the value to add to the <code>toString</code>,
             */
            @Override
            protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
                if ("gmtCreate".equals(fieldName) || "gmtModified".equals(fieldName)) {
                    if (value instanceof Date) {
                        value = DateFormatUtils.format((Date) value, "yyyy-MM-dd HH:mm:ss");
                    }
                }
                buffer.append(value);
            }
        };
    }

}
