package com.galaxy.springboot.entity;

import java.util.ArrayList;
import java.util.List;

public class RightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RightExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRightCodeIsNull() {
            addCriterion("right_code is null");
            return (Criteria) this;
        }

        public Criteria andRightCodeIsNotNull() {
            addCriterion("right_code is not null");
            return (Criteria) this;
        }

        public Criteria andRightCodeEqualTo(Integer value) {
            addCriterion("right_code =", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotEqualTo(Integer value) {
            addCriterion("right_code <>", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeGreaterThan(Integer value) {
            addCriterion("right_code >", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_code >=", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLessThan(Integer value) {
            addCriterion("right_code <", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeLessThanOrEqualTo(Integer value) {
            addCriterion("right_code <=", value, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeIn(List<Integer> values) {
            addCriterion("right_code in", values, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotIn(List<Integer> values) {
            addCriterion("right_code not in", values, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeBetween(Integer value1, Integer value2) {
            addCriterion("right_code between", value1, value2, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("right_code not between", value1, value2, "rightCode");
            return (Criteria) this;
        }

        public Criteria andRightTextIsNull() {
            addCriterion("right_text is null");
            return (Criteria) this;
        }

        public Criteria andRightTextIsNotNull() {
            addCriterion("right_text is not null");
            return (Criteria) this;
        }

        public Criteria andRightTextEqualTo(String value) {
            addCriterion("right_text =", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotEqualTo(String value) {
            addCriterion("right_text <>", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextGreaterThan(String value) {
            addCriterion("right_text >", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextGreaterThanOrEqualTo(String value) {
            addCriterion("right_text >=", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLessThan(String value) {
            addCriterion("right_text <", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLessThanOrEqualTo(String value) {
            addCriterion("right_text <=", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextLike(String value) {
            addCriterion("right_text like", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotLike(String value) {
            addCriterion("right_text not like", value, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextIn(List<String> values) {
            addCriterion("right_text in", values, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotIn(List<String> values) {
            addCriterion("right_text not in", values, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextBetween(String value1, String value2) {
            addCriterion("right_text between", value1, value2, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightTextNotBetween(String value1, String value2) {
            addCriterion("right_text not between", value1, value2, "rightText");
            return (Criteria) this;
        }

        public Criteria andRightFlagIsNull() {
            addCriterion("right_flag is null");
            return (Criteria) this;
        }

        public Criteria andRightFlagIsNotNull() {
            addCriterion("right_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRightFlagEqualTo(String value) {
            addCriterion("right_flag =", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagNotEqualTo(String value) {
            addCriterion("right_flag <>", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagGreaterThan(String value) {
            addCriterion("right_flag >", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagGreaterThanOrEqualTo(String value) {
            addCriterion("right_flag >=", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagLessThan(String value) {
            addCriterion("right_flag <", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagLessThanOrEqualTo(String value) {
            addCriterion("right_flag <=", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagLike(String value) {
            addCriterion("right_flag like", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagNotLike(String value) {
            addCriterion("right_flag not like", value, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagIn(List<String> values) {
            addCriterion("right_flag in", values, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagNotIn(List<String> values) {
            addCriterion("right_flag not in", values, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagBetween(String value1, String value2) {
            addCriterion("right_flag between", value1, value2, "rightFlag");
            return (Criteria) this;
        }

        public Criteria andRightFlagNotBetween(String value1, String value2) {
            addCriterion("right_flag not between", value1, value2, "rightFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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