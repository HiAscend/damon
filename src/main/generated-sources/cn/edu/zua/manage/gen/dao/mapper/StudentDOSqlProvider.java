package cn.edu.zua.manage.gen.dao.mapper;

import cn.edu.zua.manage.gen.entity.domain.StudentDO;
import cn.edu.zua.manage.gen.entity.domain.StudentDOExample.Criteria;
import cn.edu.zua.manage.gen.entity.domain.StudentDOExample.Criterion;
import cn.edu.zua.manage.gen.entity.domain.StudentDOExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class StudentDOSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String countByExample(StudentDOExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("test_student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String deleteByExample(StudentDOExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("test_student");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String insertSelective(StudentDO record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("test_student");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=CHAR}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=TINYINT}");
        }
        
        if (record.getDate() != null) {
            sql.VALUES("t_date", "#{date,jdbcType=DATE}");
        }
        
        if (record.getTime() != null) {
            sql.VALUES("t_time", "#{time,jdbcType=TIME}");
        }
        
        if (record.getDatetime() != null) {
            sql.VALUES("t_datetime", "#{datetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String selectByExample(StudentDOExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_name");
        sql.SELECT("age");
        sql.SELECT("t_date");
        sql.SELECT("t_time");
        sql.SELECT("t_datetime");
        sql.SELECT("sex");
        sql.FROM("test_student");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        StudentDO record = (StudentDO) parameter.get("record");
        StudentDOExample example = (StudentDOExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("test_student");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{record.userName,jdbcType=CHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{record.age,jdbcType=TINYINT}");
        }
        
        if (record.getDate() != null) {
            sql.SET("t_date = #{record.date,jdbcType=DATE}");
        }
        
        if (record.getTime() != null) {
            sql.SET("t_time = #{record.time,jdbcType=TIME}");
        }
        
        if (record.getDatetime() != null) {
            sql.SET("t_datetime = #{record.datetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("test_student");
        
        sql.SET("id = #{record.id,jdbcType=BIGINT}");
        sql.SET("user_name = #{record.userName,jdbcType=CHAR}");
        sql.SET("age = #{record.age,jdbcType=TINYINT}");
        sql.SET("t_date = #{record.date,jdbcType=DATE}");
        sql.SET("t_time = #{record.time,jdbcType=TIME}");
        sql.SET("t_datetime = #{record.datetime,jdbcType=TIMESTAMP}");
        sql.SET("sex = #{record.sex,jdbcType=TINYINT}");
        
        StudentDOExample example = (StudentDOExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    public String updateByPrimaryKeySelective(StudentDO record) {
        SQL sql = new SQL();
        sql.UPDATE("test_student");
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=CHAR}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=TINYINT}");
        }
        
        if (record.getDate() != null) {
            sql.SET("t_date = #{date,jdbcType=DATE}");
        }
        
        if (record.getTime() != null) {
            sql.SET("t_time = #{time,jdbcType=TIME}");
        }
        
        if (record.getDatetime() != null) {
            sql.SET("t_datetime = #{datetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=TINYINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_student
     *
     * @mbg.generated 2018-06-19 15:57:18
     */
    protected void applyWhere(SQL sql, StudentDOExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}