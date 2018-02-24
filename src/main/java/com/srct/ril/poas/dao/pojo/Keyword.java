package com.srct.ril.poas.dao.pojo;

public class Keyword {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keyword_.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keyword_.alias
     *
     * @mbggenerated
     */
    private String alias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keyword_.category
     *
     * @mbggenerated
     */
    private String category;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keyword_.keywords
     *
     * @mbggenerated
     */
    private String keywords;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keyword_.id
     *
     * @return the value of keyword_.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keyword_.id
     *
     * @param id the value for keyword_.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keyword_.alias
     *
     * @return the value of keyword_.alias
     *
     * @mbggenerated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keyword_.alias
     *
     * @param alias the value for keyword_.alias
     *
     * @mbggenerated
     */
    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keyword_.category
     *
     * @return the value of keyword_.category
     *
     * @mbggenerated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keyword_.category
     *
     * @param category the value for keyword_.category
     *
     * @mbggenerated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keyword_.keywords
     *
     * @return the value of keyword_.keywords
     *
     * @mbggenerated
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column keyword_.keywords
     *
     * @param keywords the value for keyword_.keywords
     *
     * @mbggenerated
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }
}