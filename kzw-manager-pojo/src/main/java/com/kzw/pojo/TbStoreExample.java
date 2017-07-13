package com.kzw.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStoreExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreDescIsNull() {
            addCriterion("store_desc is null");
            return (Criteria) this;
        }

        public Criteria andStoreDescIsNotNull() {
            addCriterion("store_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDescEqualTo(String value) {
            addCriterion("store_desc =", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotEqualTo(String value) {
            addCriterion("store_desc <>", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescGreaterThan(String value) {
            addCriterion("store_desc >", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescGreaterThanOrEqualTo(String value) {
            addCriterion("store_desc >=", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescLessThan(String value) {
            addCriterion("store_desc <", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescLessThanOrEqualTo(String value) {
            addCriterion("store_desc <=", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescLike(String value) {
            addCriterion("store_desc like", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotLike(String value) {
            addCriterion("store_desc not like", value, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescIn(List<String> values) {
            addCriterion("store_desc in", values, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotIn(List<String> values) {
            addCriterion("store_desc not in", values, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescBetween(String value1, String value2) {
            addCriterion("store_desc between", value1, value2, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreDescNotBetween(String value1, String value2) {
            addCriterion("store_desc not between", value1, value2, "storeDesc");
            return (Criteria) this;
        }

        public Criteria andStoreOtherIsNull() {
            addCriterion("store_other is null");
            return (Criteria) this;
        }

        public Criteria andStoreOtherIsNotNull() {
            addCriterion("store_other is not null");
            return (Criteria) this;
        }

        public Criteria andStoreOtherEqualTo(String value) {
            addCriterion("store_other =", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherNotEqualTo(String value) {
            addCriterion("store_other <>", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherGreaterThan(String value) {
            addCriterion("store_other >", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherGreaterThanOrEqualTo(String value) {
            addCriterion("store_other >=", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherLessThan(String value) {
            addCriterion("store_other <", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherLessThanOrEqualTo(String value) {
            addCriterion("store_other <=", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherLike(String value) {
            addCriterion("store_other like", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherNotLike(String value) {
            addCriterion("store_other not like", value, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherIn(List<String> values) {
            addCriterion("store_other in", values, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherNotIn(List<String> values) {
            addCriterion("store_other not in", values, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherBetween(String value1, String value2) {
            addCriterion("store_other between", value1, value2, "storeOther");
            return (Criteria) this;
        }

        public Criteria andStoreOtherNotBetween(String value1, String value2) {
            addCriterion("store_other not between", value1, value2, "storeOther");
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