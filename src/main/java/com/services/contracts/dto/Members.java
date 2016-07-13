//package com.services.contracts.dto;
//
//import java.io.Serializable;
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "members")
//public class Members implements Serializable
//{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "mbr_id")
//    private Long id;
//
//    /*
//     * @Column(name = "number") private Integer memberNumber;
//     */
//
//    @Column(name = "first_nm")
//    private String firstName;
//
//    @Column(name = "middle_nm")
//    private String middleName;
//
//    @Column(name = "last_nm")
//    private String lastName;
//
//    @Column(name = "company_nm")
//    private String companyName;
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "source")
//    private String source;
//
//    @Column(name = "fees_paid_dt")
//    private Timestamp feePaidDate;
//
//    @Column(name = "pswd")
//    private String password;
//
//    @Column(name = "pswd_expi_dt")
//    private Timestamp passwordExpiryDate;
//
//    @Column(name = "mbr_status_cd")
//    private String statusCode;
//
//    @Column(name = "reg_site_cd")
//    private String siteCode;
//
//    @Column(name = "crt_dt")
//    private Timestamp createDate;
//
//    @Column(name = "crt_user")
//    private String createUser;
//
//    @Column(name = "last_upd_dt")
//    private Timestamp lastUpdateDate;
//
//    @Column(name = "last_upd_user")
//    private String lastUpdateUser;
//
//    public String getFirstName()
//    {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName)
//    {
//        this.firstName = firstName;
//    }
//
//    public Long getId()
//    {
//        return id;
//    }
//
//    public void setId(Long id)
//    {
//        this.id = id;
//    }
//
//    /**
//     * @return the siteCode
//     */
//    public String getSiteCode()
//    {
//        return siteCode;
//    }
//
//    /**
//     * @param siteCode the siteCode to set
//     */
//    public void setSiteCode(String siteCode)
//    {
//        this.siteCode = siteCode;
//    }
//
//    public String getMiddleName()
//    {
//        return middleName;
//    }
//
//    public void setMiddleName(String middleName)
//    {
//        this.middleName = middleName;
//    }
//
//    public String getLastName()
//    {
//        return lastName;
//    }
//
//    public void setLastName(String lastName)
//    {
//        this.lastName = lastName;
//    }
//
//    public String getCompanyName()
//    {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName)
//    {
//        this.companyName = companyName;
//    }
//
//    public String getEmail()
//    {
//        return email;
//    }
//
//    public void setEmail(String email)
//    {
//        this.email = email;
//    }
//
//    public String getSource()
//    {
//        return source;
//    }
//
//    public void setSource(String source)
//    {
//        this.source = source;
//    }
//
//    public Timestamp getFeePaidDate()
//    {
//        return feePaidDate;
//    }
//
//    public void setFeePaidDate(Timestamp feePaidDate)
//    {
//        this.feePaidDate = feePaidDate;
//    }
//
//    public String getPassword()
//    {
//        return password;
//    }
//
//    public void setPassword(String password)
//    {
//        this.password = password;
//    }
//
//    public Timestamp getPasswordExpiryDate()
//    {
//        return passwordExpiryDate;
//    }
//
//    public void setPasswordExpiryDate(Timestamp passwordExpiryDate)
//    {
//        this.passwordExpiryDate = passwordExpiryDate;
//    }
//
//    public String getStatusCode()
//    {
//        return statusCode;
//    }
//
//    public void setStatusCode(String statusCode)
//    {
//        this.statusCode = statusCode;
//    }
//
//    public Timestamp getCreateDate()
//    {
//        return createDate;
//    }
//
//    public void setCreateDate(Timestamp createDate)
//    {
//        this.createDate = createDate;
//    }
//
//    public String getCreateUser()
//    {
//        return createUser;
//    }
//
//    public void setCreateUser(String createUser)
//    {
//        this.createUser = createUser;
//    }
//
//    public Timestamp getLastUpdateDate()
//    {
//        return lastUpdateDate;
//    }
//
//    public void setLastUpdateDate(Timestamp lastUpdateDate)
//    {
//        this.lastUpdateDate = lastUpdateDate;
//    }
//
//    public String getLastUpdateUser()
//    {
//        return lastUpdateUser;
//    }
//
//    public void setLastUpdateUser(String lastUpdateUser)
//    {
//        this.lastUpdateUser = lastUpdateUser;
//    }
//
//}
