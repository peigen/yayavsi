/*
 * dreamcube.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.dreamcube.core.dal.dataobject;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>dc_squad</tt>.
 *
 * This file is generated by <tt>dreamcube-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/dc_squad.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>dreamcubedalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class DcSquadDO {
    private static final long serialVersionUID = 741231858441822688L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.
	 */
	private long id;

	/**
	 * This property corresponds to db column <tt>squad_name</tt>.
	 */
	private String squadName;

	/**
	 * This property corresponds to db column <tt>squad_desc</tt>.
	 */
	private String squadDesc;

	/**
	 * This property corresponds to db column <tt>axiser</tt>.
	 */
	private String axiser;

	/**
	 * This property corresponds to db column <tt>cubers</tt>.
	 */
	private String cubers;

	/**
	 * This property corresponds to db column <tt>followers</tt>.
	 */
	private String followers;

	/**
	 * This property corresponds to db column <tt>investors</tt>.
	 */
	private String investors;

	/**
	 * This property corresponds to db column <tt>status</tt>.
	 */
	private String status;

	/**
	 * This property corresponds to db column <tt>gmt_create</tt>.
	 */
	private Date gmtCreate;

	/**
	 * This property corresponds to db column <tt>gmt_modify</tt>.
	 */
	private Date gmtModify;

    //========== getters and setters ==========

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
	public long getId() {
		return id;
	}
	
	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id value to be assigned to property id
     */
	public void setId(long id) {
		this.id = id;
	}

    /**
     * Getter method for property <tt>squadName</tt>.
     *
     * @return property value of squadName
     */
	public String getSquadName() {
		return squadName;
	}
	
	/**
	 * Setter method for property <tt>squadName</tt>.
	 * 
	 * @param squadName value to be assigned to property squadName
     */
	public void setSquadName(String squadName) {
		this.squadName = squadName;
	}

    /**
     * Getter method for property <tt>squadDesc</tt>.
     *
     * @return property value of squadDesc
     */
	public String getSquadDesc() {
		return squadDesc;
	}
	
	/**
	 * Setter method for property <tt>squadDesc</tt>.
	 * 
	 * @param squadDesc value to be assigned to property squadDesc
     */
	public void setSquadDesc(String squadDesc) {
		this.squadDesc = squadDesc;
	}

    /**
     * Getter method for property <tt>axiser</tt>.
     *
     * @return property value of axiser
     */
	public String getAxiser() {
		return axiser;
	}
	
	/**
	 * Setter method for property <tt>axiser</tt>.
	 * 
	 * @param axiser value to be assigned to property axiser
     */
	public void setAxiser(String axiser) {
		this.axiser = axiser;
	}

    /**
     * Getter method for property <tt>cubers</tt>.
     *
     * @return property value of cubers
     */
	public String getCubers() {
		return cubers;
	}
	
	/**
	 * Setter method for property <tt>cubers</tt>.
	 * 
	 * @param cubers value to be assigned to property cubers
     */
	public void setCubers(String cubers) {
		this.cubers = cubers;
	}

    /**
     * Getter method for property <tt>followers</tt>.
     *
     * @return property value of followers
     */
	public String getFollowers() {
		return followers;
	}
	
	/**
	 * Setter method for property <tt>followers</tt>.
	 * 
	 * @param followers value to be assigned to property followers
     */
	public void setFollowers(String followers) {
		this.followers = followers;
	}

    /**
     * Getter method for property <tt>investors</tt>.
     *
     * @return property value of investors
     */
	public String getInvestors() {
		return investors;
	}
	
	/**
	 * Setter method for property <tt>investors</tt>.
	 * 
	 * @param investors value to be assigned to property investors
     */
	public void setInvestors(String investors) {
		this.investors = investors;
	}

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Setter method for property <tt>status</tt>.
	 * 
	 * @param status value to be assigned to property status
     */
	public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Getter method for property <tt>gmtCreate</tt>.
     *
     * @return property value of gmtCreate
     */
	public Date getGmtCreate() {
		return gmtCreate;
	}
	
	/**
	 * Setter method for property <tt>gmtCreate</tt>.
	 * 
	 * @param gmtCreate value to be assigned to property gmtCreate
     */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Getter method for property <tt>gmtModify</tt>.
     *
     * @return property value of gmtModify
     */
	public Date getGmtModify() {
		return gmtModify;
	}
	
	/**
	 * Setter method for property <tt>gmtModify</tt>.
	 * 
	 * @param gmtModify value to be assigned to property gmtModify
     */
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
}
