package com.zdran.btmovie.provider.domain;

import java.util.ArrayList;
import java.util.List;

public class MovieInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieInfoExample() {
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

        public Criteria andMovieIdIsNull() {
            addCriterion("movie_id is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movie_id is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(String value) {
            addCriterion("movie_id =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(String value) {
            addCriterion("movie_id <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(String value) {
            addCriterion("movie_id >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(String value) {
            addCriterion("movie_id >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(String value) {
            addCriterion("movie_id <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(String value) {
            addCriterion("movie_id <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLike(String value) {
            addCriterion("movie_id like", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotLike(String value) {
            addCriterion("movie_id not like", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<String> values) {
            addCriterion("movie_id in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<String> values) {
            addCriterion("movie_id not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(String value1, String value2) {
            addCriterion("movie_id between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(String value1, String value2) {
            addCriterion("movie_id not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieBtIsNull() {
            addCriterion("movie_bt is null");
            return (Criteria) this;
        }

        public Criteria andMovieBtIsNotNull() {
            addCriterion("movie_bt is not null");
            return (Criteria) this;
        }

        public Criteria andMovieBtEqualTo(String value) {
            addCriterion("movie_bt =", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtNotEqualTo(String value) {
            addCriterion("movie_bt <>", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtGreaterThan(String value) {
            addCriterion("movie_bt >", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtGreaterThanOrEqualTo(String value) {
            addCriterion("movie_bt >=", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtLessThan(String value) {
            addCriterion("movie_bt <", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtLessThanOrEqualTo(String value) {
            addCriterion("movie_bt <=", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtLike(String value) {
            addCriterion("movie_bt like", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtNotLike(String value) {
            addCriterion("movie_bt not like", value, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtIn(List<String> values) {
            addCriterion("movie_bt in", values, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtNotIn(List<String> values) {
            addCriterion("movie_bt not in", values, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtBetween(String value1, String value2) {
            addCriterion("movie_bt between", value1, value2, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMovieBtNotBetween(String value1, String value2) {
            addCriterion("movie_bt not between", value1, value2, "movieBt");
            return (Criteria) this;
        }

        public Criteria andMoviePosterIsNull() {
            addCriterion("movie_poster is null");
            return (Criteria) this;
        }

        public Criteria andMoviePosterIsNotNull() {
            addCriterion("movie_poster is not null");
            return (Criteria) this;
        }

        public Criteria andMoviePosterEqualTo(String value) {
            addCriterion("movie_poster =", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterNotEqualTo(String value) {
            addCriterion("movie_poster <>", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterGreaterThan(String value) {
            addCriterion("movie_poster >", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterGreaterThanOrEqualTo(String value) {
            addCriterion("movie_poster >=", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterLessThan(String value) {
            addCriterion("movie_poster <", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterLessThanOrEqualTo(String value) {
            addCriterion("movie_poster <=", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterLike(String value) {
            addCriterion("movie_poster like", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterNotLike(String value) {
            addCriterion("movie_poster not like", value, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterIn(List<String> values) {
            addCriterion("movie_poster in", values, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterNotIn(List<String> values) {
            addCriterion("movie_poster not in", values, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterBetween(String value1, String value2) {
            addCriterion("movie_poster between", value1, value2, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMoviePosterNotBetween(String value1, String value2) {
            addCriterion("movie_poster not between", value1, value2, "moviePoster");
            return (Criteria) this;
        }

        public Criteria andMovieDetailIsNull() {
            addCriterion("movie_detail is null");
            return (Criteria) this;
        }

        public Criteria andMovieDetailIsNotNull() {
            addCriterion("movie_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMovieDetailEqualTo(String value) {
            addCriterion("movie_detail =", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailNotEqualTo(String value) {
            addCriterion("movie_detail <>", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailGreaterThan(String value) {
            addCriterion("movie_detail >", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailGreaterThanOrEqualTo(String value) {
            addCriterion("movie_detail >=", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailLessThan(String value) {
            addCriterion("movie_detail <", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailLessThanOrEqualTo(String value) {
            addCriterion("movie_detail <=", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailLike(String value) {
            addCriterion("movie_detail like", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailNotLike(String value) {
            addCriterion("movie_detail not like", value, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailIn(List<String> values) {
            addCriterion("movie_detail in", values, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailNotIn(List<String> values) {
            addCriterion("movie_detail not in", values, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailBetween(String value1, String value2) {
            addCriterion("movie_detail between", value1, value2, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieDetailNotBetween(String value1, String value2) {
            addCriterion("movie_detail not between", value1, value2, "movieDetail");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNull() {
            addCriterion("movie_score is null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIsNotNull() {
            addCriterion("movie_score is not null");
            return (Criteria) this;
        }

        public Criteria andMovieScoreEqualTo(String value) {
            addCriterion("movie_score =", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotEqualTo(String value) {
            addCriterion("movie_score <>", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThan(String value) {
            addCriterion("movie_score >", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreGreaterThanOrEqualTo(String value) {
            addCriterion("movie_score >=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThan(String value) {
            addCriterion("movie_score <", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLessThanOrEqualTo(String value) {
            addCriterion("movie_score <=", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreLike(String value) {
            addCriterion("movie_score like", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotLike(String value) {
            addCriterion("movie_score not like", value, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreIn(List<String> values) {
            addCriterion("movie_score in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotIn(List<String> values) {
            addCriterion("movie_score not in", values, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreBetween(String value1, String value2) {
            addCriterion("movie_score between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieScoreNotBetween(String value1, String value2) {
            addCriterion("movie_score not between", value1, value2, "movieScore");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNull() {
            addCriterion("movie_type is null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIsNotNull() {
            addCriterion("movie_type is not null");
            return (Criteria) this;
        }

        public Criteria andMovieTypeEqualTo(String value) {
            addCriterion("movie_type =", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotEqualTo(String value) {
            addCriterion("movie_type <>", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThan(String value) {
            addCriterion("movie_type >", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeGreaterThanOrEqualTo(String value) {
            addCriterion("movie_type >=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThan(String value) {
            addCriterion("movie_type <", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLessThanOrEqualTo(String value) {
            addCriterion("movie_type <=", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeLike(String value) {
            addCriterion("movie_type like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotLike(String value) {
            addCriterion("movie_type not like", value, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeIn(List<String> values) {
            addCriterion("movie_type in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotIn(List<String> values) {
            addCriterion("movie_type not in", values, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeBetween(String value1, String value2) {
            addCriterion("movie_type between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieTypeNotBetween(String value1, String value2) {
            addCriterion("movie_type not between", value1, value2, "movieType");
            return (Criteria) this;
        }

        public Criteria andMovieStarringIsNull() {
            addCriterion("movie_Starring is null");
            return (Criteria) this;
        }

        public Criteria andMovieStarringIsNotNull() {
            addCriterion("movie_Starring is not null");
            return (Criteria) this;
        }

        public Criteria andMovieStarringEqualTo(String value) {
            addCriterion("movie_Starring =", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringNotEqualTo(String value) {
            addCriterion("movie_Starring <>", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringGreaterThan(String value) {
            addCriterion("movie_Starring >", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringGreaterThanOrEqualTo(String value) {
            addCriterion("movie_Starring >=", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringLessThan(String value) {
            addCriterion("movie_Starring <", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringLessThanOrEqualTo(String value) {
            addCriterion("movie_Starring <=", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringLike(String value) {
            addCriterion("movie_Starring like", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringNotLike(String value) {
            addCriterion("movie_Starring not like", value, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringIn(List<String> values) {
            addCriterion("movie_Starring in", values, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringNotIn(List<String> values) {
            addCriterion("movie_Starring not in", values, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringBetween(String value1, String value2) {
            addCriterion("movie_Starring between", value1, value2, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieStarringNotBetween(String value1, String value2) {
            addCriterion("movie_Starring not between", value1, value2, "movieStarring");
            return (Criteria) this;
        }

        public Criteria andMovieAreaIsNull() {
            addCriterion("movie_area is null");
            return (Criteria) this;
        }

        public Criteria andMovieAreaIsNotNull() {
            addCriterion("movie_area is not null");
            return (Criteria) this;
        }

        public Criteria andMovieAreaEqualTo(String value) {
            addCriterion("movie_area =", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotEqualTo(String value) {
            addCriterion("movie_area <>", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaGreaterThan(String value) {
            addCriterion("movie_area >", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaGreaterThanOrEqualTo(String value) {
            addCriterion("movie_area >=", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaLessThan(String value) {
            addCriterion("movie_area <", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaLessThanOrEqualTo(String value) {
            addCriterion("movie_area <=", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaLike(String value) {
            addCriterion("movie_area like", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotLike(String value) {
            addCriterion("movie_area not like", value, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaIn(List<String> values) {
            addCriterion("movie_area in", values, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotIn(List<String> values) {
            addCriterion("movie_area not in", values, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaBetween(String value1, String value2) {
            addCriterion("movie_area between", value1, value2, "movieArea");
            return (Criteria) this;
        }

        public Criteria andMovieAreaNotBetween(String value1, String value2) {
            addCriterion("movie_area not between", value1, value2, "movieArea");
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