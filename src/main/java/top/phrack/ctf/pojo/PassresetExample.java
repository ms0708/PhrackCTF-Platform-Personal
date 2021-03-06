package top.phrack.ctf.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PassresetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public PassresetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("\"id\" is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("\"id\" is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("\"id\" =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("\"id\" <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("\"id\" >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("\"id\" >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("\"id\" <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("\"id\" <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("\"id\" in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("\"id\" not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("\"id\" between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("\"id\" not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("\"userid\" is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("\"userid\" is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("\"userid\" =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("\"userid\" <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("\"userid\" >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("\"userid\" >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("\"userid\" <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("\"userid\" <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("\"userid\" in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("\"userid\" not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("\"userid\" between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("\"userid\" not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andResettokenIsNull() {
            addCriterion("\"resettoken\" is null");
            return (Criteria) this;
        }

        public Criteria andResettokenIsNotNull() {
            addCriterion("\"resettoken\" is not null");
            return (Criteria) this;
        }

        public Criteria andResettokenEqualTo(String value) {
            addCriterion("\"resettoken\" =", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenNotEqualTo(String value) {
            addCriterion("\"resettoken\" <>", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenGreaterThan(String value) {
            addCriterion("\"resettoken\" >", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenGreaterThanOrEqualTo(String value) {
            addCriterion("\"resettoken\" >=", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenLessThan(String value) {
            addCriterion("\"resettoken\" <", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenLessThanOrEqualTo(String value) {
            addCriterion("\"resettoken\" <=", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenLike(String value) {
            addCriterion("\"resettoken\" like", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenNotLike(String value) {
            addCriterion("\"resettoken\" not like", value, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenIn(List<String> values) {
            addCriterion("\"resettoken\" in", values, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenNotIn(List<String> values) {
            addCriterion("\"resettoken\" not in", values, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenBetween(String value1, String value2) {
            addCriterion("\"resettoken\" between", value1, value2, "resettoken");
            return (Criteria) this;
        }

        public Criteria andResettokenNotBetween(String value1, String value2) {
            addCriterion("\"resettoken\" not between", value1, value2, "resettoken");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("\"used\" is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("\"used\" is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(Boolean value) {
            addCriterion("\"used\" =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(Boolean value) {
            addCriterion("\"used\" <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(Boolean value) {
            addCriterion("\"used\" >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("\"used\" >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(Boolean value) {
            addCriterion("\"used\" <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(Boolean value) {
            addCriterion("\"used\" <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<Boolean> values) {
            addCriterion("\"used\" in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<Boolean> values) {
            addCriterion("\"used\" not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(Boolean value1, Boolean value2) {
            addCriterion("\"used\" between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("\"used\" not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("\"createtime\" is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("\"createtime\" is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("\"createtime\" =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("\"createtime\" <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("\"createtime\" >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"createtime\" >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("\"createtime\" <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("\"createtime\" <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("\"createtime\" in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("\"createtime\" not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("\"createtime\" between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("\"createtime\" not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andExpiresonIsNull() {
            addCriterion("\"expireson\" is null");
            return (Criteria) this;
        }

        public Criteria andExpiresonIsNotNull() {
            addCriterion("\"expireson\" is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresonEqualTo(Date value) {
            addCriterion("\"expireson\" =", value, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonNotEqualTo(Date value) {
            addCriterion("\"expireson\" <>", value, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonGreaterThan(Date value) {
            addCriterion("\"expireson\" >", value, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonGreaterThanOrEqualTo(Date value) {
            addCriterion("\"expireson\" >=", value, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonLessThan(Date value) {
            addCriterion("\"expireson\" <", value, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonLessThanOrEqualTo(Date value) {
            addCriterion("\"expireson\" <=", value, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonIn(List<Date> values) {
            addCriterion("\"expireson\" in", values, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonNotIn(List<Date> values) {
            addCriterion("\"expireson\" not in", values, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonBetween(Date value1, Date value2) {
            addCriterion("\"expireson\" between", value1, value2, "expireson");
            return (Criteria) this;
        }

        public Criteria andExpiresonNotBetween(Date value1, Date value2) {
            addCriterion("\"expireson\" not between", value1, value2, "expireson");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNull() {
            addCriterion("\"usedtime\" is null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNotNull() {
            addCriterion("\"usedtime\" is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeEqualTo(Date value) {
            addCriterion("\"usedtime\" =", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotEqualTo(Date value) {
            addCriterion("\"usedtime\" <>", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThan(Date value) {
            addCriterion("\"usedtime\" >", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"usedtime\" >=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThan(Date value) {
            addCriterion("\"usedtime\" <", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThanOrEqualTo(Date value) {
            addCriterion("\"usedtime\" <=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIn(List<Date> values) {
            addCriterion("\"usedtime\" in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotIn(List<Date> values) {
            addCriterion("\"usedtime\" not in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeBetween(Date value1, Date value2) {
            addCriterion("\"usedtime\" between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotBetween(Date value1, Date value2) {
            addCriterion("\"usedtime\" not between", value1, value2, "usedtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.passreset
     *
     * @mbggenerated do_not_delete_during_merge Sat Apr 09 16:44:25 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.passreset
     *
     * @mbggenerated Sat Apr 09 16:44:25 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}