/*
 * dreamcube.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.dreamcube.core.dal.daointerface;

// auto generated imports
import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.dreamcube.core.common.tools.PageList;
import com.dreamcube.core.dal.dataobject.DcUserDO;

/**
 * A dao interface provides methods to access database table <tt>dc_user</tt>.
 *
 * This file is generated by <tt>dreamcube-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/dc_user.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>dreamcubedalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public interface DcUserDAO {
    /**
     *  Insert one <tt>DcUserDO</tt> object to DB table <tt>dc_user</tt>, return primary key
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>insert into dc_user(logon_name,logon_passwd,nick_name,birthday,cert_no,gender,work_site,projects,info_site,gmt_create,gmt_modify,status) values (?, ?, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?)</tt>
     *
     *	@param dcUser
     *	@return long
     *	@throws DataAccessException
     */
    public long insert(DcUserDO dcUser) throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user</tt>
     *
     *	@return List<DcUserDO>
     *	@throws DataAccessException
     */
    public List<DcUserDO> load() throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user where (id = ?)</tt>
     *
     *	@param id
     *	@return DcUserDO
     *	@throws DataAccessException
     */
    public DcUserDO loadById(long id) throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user where ((logon_name = ?) AND (nick_name = ?) AND (cert_no = ?) AND (status = ?) AND (gmt_create = ?) AND (gmt_modify = ?))</tt>
     *
     *	@param logonName
     *	@param nickName
     *	@param certNo
     *	@param status
     *	@param gmtCreate
     *	@param gmtModify
     *	@param pageSize
     *	@param pageNum
     *	@return PageList
     *	@throws DataAccessException
     */
    public PageList query(String logonName, String nickName, String certNo, String status,
                          Date gmtCreate, Date gmtModify, int pageSize, int pageNum)
                                                                                    throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user where (logon_name = ?)</tt>
     *
     *	@param logonName
     *	@return DcUserDO
     *	@throws DataAccessException
     */
    public DcUserDO loadByLogonName(String logonName) throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user where (nick_name = ?)</tt>
     *
     *	@param nickName
     *	@return DcUserDO
     *	@throws DataAccessException
     */
    public DcUserDO loadByNickName(String nickName) throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user where ((logon_name = ?) AND (logon_passwd = ?))</tt>
     *
     *	@param logonName
     *	@param logonPasswd
     *	@return DcUserDO
     *	@throws DataAccessException
     */
    public DcUserDO loadByLogonNameAndPasswd(String logonName, String logonPasswd)
                                                                                  throws DataAccessException;

    /**
     *  Update DB table <tt>dc_user</tt>.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>update dc_user set logon_passwd=?, nick_name=?, birthday=?, cert_no=?, gender=?, work_site=?, projects=?, info_site=?, status=?, gmt_modify=CURRENT_TIMESTAMP where (id = ?)</tt>
     *
     *	@param dcUser
     *	@return int
     *	@throws DataAccessException
     */
    public int update(DcUserDO dcUser) throws DataAccessException;

    /**
     *  Delete records from DB table <tt>dc_user</tt>.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>delete from dc_user where (id = ?)</tt>
     *
     *	@param id
     *	@return int
     *	@throws DataAccessException
     */
    public int deleteById(long id) throws DataAccessException;

    /**
     *  Query DB table <tt>dc_user</tt> for records.
     *
     *  <p>
     *  The sql statement for this operation is <br>
     *  <tt>select * from dc_user</tt>
     *
     *	@param size
     *	@return List<DcUserDO>
     *	@throws DataAccessException
     */
    public List<DcUserDO> loadForAttention(Integer size) throws DataAccessException;

}