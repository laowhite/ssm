package com.ssm.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_d
 *
 * @mbggenerated do_not_delete_during_merge
 */
public class UserD {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_d.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_d.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_d.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_d.age
     *
     * @mbggenerated
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_d.id
     *
     * @return the value of user_d.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_d.id
     *
     * @param id the value for user_d.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_d.name
     *
     * @return the value of user_d.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_d.name
     *
     * @param name the value for user_d.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_d.password
     *
     * @return the value of user_d.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_d.password
     *
     * @param password the value for user_d.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_d.age
     *
     * @return the value of user_d.age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_d.age
     *
     * @param age the value for user_d.age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}