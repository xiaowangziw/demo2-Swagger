package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class XcCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XcCompanyExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("linkname is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkname is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkname =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkname <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkname >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkname >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkname <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkname <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkname like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkname not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkname in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkname not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkname between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkname not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andIdentitypicIsNull() {
            addCriterion("identitypic is null");
            return (Criteria) this;
        }

        public Criteria andIdentitypicIsNotNull() {
            addCriterion("identitypic is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitypicEqualTo(String value) {
            addCriterion("identitypic =", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicNotEqualTo(String value) {
            addCriterion("identitypic <>", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicGreaterThan(String value) {
            addCriterion("identitypic >", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicGreaterThanOrEqualTo(String value) {
            addCriterion("identitypic >=", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicLessThan(String value) {
            addCriterion("identitypic <", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicLessThanOrEqualTo(String value) {
            addCriterion("identitypic <=", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicLike(String value) {
            addCriterion("identitypic like", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicNotLike(String value) {
            addCriterion("identitypic not like", value, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicIn(List<String> values) {
            addCriterion("identitypic in", values, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicNotIn(List<String> values) {
            addCriterion("identitypic not in", values, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicBetween(String value1, String value2) {
            addCriterion("identitypic between", value1, value2, "identitypic");
            return (Criteria) this;
        }

        public Criteria andIdentitypicNotBetween(String value1, String value2) {
            addCriterion("identitypic not between", value1, value2, "identitypic");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNull() {
            addCriterion("worktype is null");
            return (Criteria) this;
        }

        public Criteria andWorktypeIsNotNull() {
            addCriterion("worktype is not null");
            return (Criteria) this;
        }

        public Criteria andWorktypeEqualTo(String value) {
            addCriterion("worktype =", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotEqualTo(String value) {
            addCriterion("worktype <>", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThan(String value) {
            addCriterion("worktype >", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeGreaterThanOrEqualTo(String value) {
            addCriterion("worktype >=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThan(String value) {
            addCriterion("worktype <", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLessThanOrEqualTo(String value) {
            addCriterion("worktype <=", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeLike(String value) {
            addCriterion("worktype like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotLike(String value) {
            addCriterion("worktype not like", value, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeIn(List<String> values) {
            addCriterion("worktype in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotIn(List<String> values) {
            addCriterion("worktype not in", values, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeBetween(String value1, String value2) {
            addCriterion("worktype between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andWorktypeNotBetween(String value1, String value2) {
            addCriterion("worktype not between", value1, value2, "worktype");
            return (Criteria) this;
        }

        public Criteria andBusinesspicIsNull() {
            addCriterion("businesspic is null");
            return (Criteria) this;
        }

        public Criteria andBusinesspicIsNotNull() {
            addCriterion("businesspic is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesspicEqualTo(String value) {
            addCriterion("businesspic =", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotEqualTo(String value) {
            addCriterion("businesspic <>", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicGreaterThan(String value) {
            addCriterion("businesspic >", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicGreaterThanOrEqualTo(String value) {
            addCriterion("businesspic >=", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLessThan(String value) {
            addCriterion("businesspic <", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLessThanOrEqualTo(String value) {
            addCriterion("businesspic <=", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLike(String value) {
            addCriterion("businesspic like", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotLike(String value) {
            addCriterion("businesspic not like", value, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicIn(List<String> values) {
            addCriterion("businesspic in", values, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotIn(List<String> values) {
            addCriterion("businesspic not in", values, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicBetween(String value1, String value2) {
            addCriterion("businesspic between", value1, value2, "businesspic");
            return (Criteria) this;
        }

        public Criteria andBusinesspicNotBetween(String value1, String value2) {
            addCriterion("businesspic not between", value1, value2, "businesspic");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andLinknameLikeInsensitive(String value) {
            addCriterion("upper(linkname) like", value.toUpperCase(), "linkname");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(`name`) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(mobile) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(email) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andIntroLikeInsensitive(String value) {
            addCriterion("upper(intro) like", value.toUpperCase(), "intro");
            return (Criteria) this;
        }

        public Criteria andLogoLikeInsensitive(String value) {
            addCriterion("upper(logo) like", value.toUpperCase(), "logo");
            return (Criteria) this;
        }

        public Criteria andIdentitypicLikeInsensitive(String value) {
            addCriterion("upper(identitypic) like", value.toUpperCase(), "identitypic");
            return (Criteria) this;
        }

        public Criteria andWorktypeLikeInsensitive(String value) {
            addCriterion("upper(worktype) like", value.toUpperCase(), "worktype");
            return (Criteria) this;
        }

        public Criteria andBusinesspicLikeInsensitive(String value) {
            addCriterion("upper(businesspic) like", value.toUpperCase(), "businesspic");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(`status`) like", value.toUpperCase(), "status");
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