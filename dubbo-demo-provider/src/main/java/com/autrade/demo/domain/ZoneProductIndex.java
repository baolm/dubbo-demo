package com.autrade.demo.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("ZoneProductIndex")
public class ZoneProductIndex {

    private Long       indexId;      // ָ��ID���Զ����ɣ�
    private String     productType;  // ��Ʒ����
    private String     productName;  // ��Ʒ����
    private BigDecimal indexNumber;  // ָ��
    private Date       indexTime;    // ָ��ʱ��
    private String     memo;         // ��ע
    private Date       submitTime;   // �ύʱ��
    private String     submitUserId; // �ύ���û�ID
    private Date       updateTime;   // ����ʱ��
    private String     updateUser;   // ������

    public Long getIndexId() {

        return indexId;
    }

    public void setIndexId(Long indexId) {

        this.indexId = indexId;
    }

    public String getProductType() {

        return productType;
    }

    public void setProductType(String productType) {

        this.productType = productType;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public BigDecimal getIndexNumber() {

        return indexNumber;
    }

    public void setIndexNumber(BigDecimal indexNumber) {

        this.indexNumber = indexNumber;
    }

    public Date getIndexTime() {

        return indexTime;
    }

    public void setIndexTime(Date indexTime) {

        this.indexTime = indexTime;
    }

    public String getMemo() {

        return memo;
    }

    public void setMemo(String memo) {

        this.memo = memo;
    }

    public Date getSubmitTime() {

        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {

        this.submitTime = submitTime;
    }

    public String getSubmitUserId() {

        return submitUserId;
    }

    public void setSubmitUserId(String submitUserId) {

        this.submitUserId = submitUserId;
    }

    
    public Date getUpdateTime() {
    
        return updateTime;
    }

    
    public void setUpdateTime(Date updateTime) {
    
        this.updateTime = updateTime;
    }

    
    public String getUpdateUser() {
    
        return updateUser;
    }

    
    public void setUpdateUser(String updateUser) {
    
        this.updateUser = updateUser;
    }

}
