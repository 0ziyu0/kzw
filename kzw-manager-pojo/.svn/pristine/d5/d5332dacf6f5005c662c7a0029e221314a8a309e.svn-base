package com.kzw.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPartnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPartnerExample() {
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

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
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

        public Criteria andUserStockIsNull() {
            addCriterion("user_stock is null");
            return (Criteria) this;
        }

        public Criteria andUserStockIsNotNull() {
            addCriterion("user_stock is not null");
            return (Criteria) this;
        }

        public Criteria andUserStockEqualTo(String value) {
            addCriterion("user_stock =", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockNotEqualTo(String value) {
            addCriterion("user_stock <>", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockGreaterThan(String value) {
            addCriterion("user_stock >", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockGreaterThanOrEqualTo(String value) {
            addCriterion("user_stock >=", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockLessThan(String value) {
            addCriterion("user_stock <", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockLessThanOrEqualTo(String value) {
            addCriterion("user_stock <=", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockLike(String value) {
            addCriterion("user_stock like", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockNotLike(String value) {
            addCriterion("user_stock not like", value, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockIn(List<String> values) {
            addCriterion("user_stock in", values, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockNotIn(List<String> values) {
            addCriterion("user_stock not in", values, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockBetween(String value1, String value2) {
            addCriterion("user_stock between", value1, value2, "userStock");
            return (Criteria) this;
        }

        public Criteria andUserStockNotBetween(String value1, String value2) {
            addCriterion("user_stock not between", value1, value2, "userStock");
            return (Criteria) this;
        }

        public Criteria andStockNoteIsNull() {
            addCriterion("stock_note is null");
            return (Criteria) this;
        }

        public Criteria andStockNoteIsNotNull() {
            addCriterion("stock_note is not null");
            return (Criteria) this;
        }

        public Criteria andStockNoteEqualTo(String value) {
            addCriterion("stock_note =", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteNotEqualTo(String value) {
            addCriterion("stock_note <>", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteGreaterThan(String value) {
            addCriterion("stock_note >", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteGreaterThanOrEqualTo(String value) {
            addCriterion("stock_note >=", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteLessThan(String value) {
            addCriterion("stock_note <", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteLessThanOrEqualTo(String value) {
            addCriterion("stock_note <=", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteLike(String value) {
            addCriterion("stock_note like", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteNotLike(String value) {
            addCriterion("stock_note not like", value, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteIn(List<String> values) {
            addCriterion("stock_note in", values, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteNotIn(List<String> values) {
            addCriterion("stock_note not in", values, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteBetween(String value1, String value2) {
            addCriterion("stock_note between", value1, value2, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockNoteNotBetween(String value1, String value2) {
            addCriterion("stock_note not between", value1, value2, "stockNote");
            return (Criteria) this;
        }

        public Criteria andStockOtherIsNull() {
            addCriterion("stock_other is null");
            return (Criteria) this;
        }

        public Criteria andStockOtherIsNotNull() {
            addCriterion("stock_other is not null");
            return (Criteria) this;
        }

        public Criteria andStockOtherEqualTo(String value) {
            addCriterion("stock_other =", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherNotEqualTo(String value) {
            addCriterion("stock_other <>", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherGreaterThan(String value) {
            addCriterion("stock_other >", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherGreaterThanOrEqualTo(String value) {
            addCriterion("stock_other >=", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherLessThan(String value) {
            addCriterion("stock_other <", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherLessThanOrEqualTo(String value) {
            addCriterion("stock_other <=", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherLike(String value) {
            addCriterion("stock_other like", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherNotLike(String value) {
            addCriterion("stock_other not like", value, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherIn(List<String> values) {
            addCriterion("stock_other in", values, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherNotIn(List<String> values) {
            addCriterion("stock_other not in", values, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherBetween(String value1, String value2) {
            addCriterion("stock_other between", value1, value2, "stockOther");
            return (Criteria) this;
        }

        public Criteria andStockOtherNotBetween(String value1, String value2) {
            addCriterion("stock_other not between", value1, value2, "stockOther");
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