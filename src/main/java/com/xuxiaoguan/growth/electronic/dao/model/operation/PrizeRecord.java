package com.xuxiaoguan.growth.electronic.dao.model.operation;

import java.util.Date;

public class PrizeRecord {
    /**
     * 主键
     */
    private Long id;

    /**
     * 手机号
     */
    private String productNo;

    /**
     * 操作员号
     */
    private String operatorNo;

    /**
     * 用户客户号
     */
    private String customerNo;

    /**
     * 用户唯一性标识，唯一且不可变
     */
    private String uid;

    /**
     * 奖品编号
     */
    private String prizeNo;

    /**
     * 返利金额：分
     */
    private String prizeAmt;

    /**
     * 兑吧订单号（活动中奖领奖订单号）
     */
    private String orderNum;

    /**
     * 请求流水单号
     */
    private String requestNo;

    /**
     * 交易请求时间
     */
    private Date requestDate;

    /**
     * 营销活动号
     */
    private String marketCfgId;

    /**
     * 商户号
     */
    private String merchantId;

    /**
     * 外部交易类型
     */
    private String outTxnType;

    /**
     * 渠道号
     */
    private String channel;

    /**
     * 兑换状态--INIT-未兑换；DURING-兑换中；SUCCESS-兑换成功；FAILURE-兑换失败；UNKNOWN-未知
     */
    private String status;

    /**
     * 营销平台返回码
     */
    private String resultCode;

    /**
     * 营销平台返回结果
     */
    private String resultMsg;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 修改时间
     */
    private Date updatedAt;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 手机号
     * @return product_no 手机号
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * 手机号
     * @param productNo 手机号
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * 操作员号
     * @return operator_no 操作员号
     */
    public String getOperatorNo() {
        return operatorNo;
    }

    /**
     * 操作员号
     * @param operatorNo 操作员号
     */
    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
    }

    /**
     * 用户客户号
     * @return customer_no 用户客户号
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * 用户客户号
     * @param customerNo 用户客户号
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    /**
     * 用户唯一性标识，唯一且不可变
     * @return uid 用户唯一性标识，唯一且不可变
     */
    public String getUid() {
        return uid;
    }

    /**
     * 用户唯一性标识，唯一且不可变
     * @param uid 用户唯一性标识，唯一且不可变
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 奖品编号
     * @return prize_no 奖品编号
     */
    public String getPrizeNo() {
        return prizeNo;
    }

    /**
     * 奖品编号
     * @param prizeNo 奖品编号
     */
    public void setPrizeNo(String prizeNo) {
        this.prizeNo = prizeNo;
    }

    /**
     * 返利金额：分
     * @return prize_amt 返利金额：分
     */
    public String getPrizeAmt() {
        return prizeAmt;
    }

    /**
     * 返利金额：分
     * @param prizeAmt 返利金额：分
     */
    public void setPrizeAmt(String prizeAmt) {
        this.prizeAmt = prizeAmt;
    }

    /**
     * 兑吧订单号（活动中奖领奖订单号）
     * @return order_num 兑吧订单号（活动中奖领奖订单号）
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 兑吧订单号（活动中奖领奖订单号）
     * @param orderNum 兑吧订单号（活动中奖领奖订单号）
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 请求流水单号
     * @return request_no 请求流水单号
     */
    public String getRequestNo() {
        return requestNo;
    }

    /**
     * 请求流水单号
     * @param requestNo 请求流水单号
     */
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    /**
     * 交易请求时间
     * @return request_date 交易请求时间
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * 交易请求时间
     * @param requestDate 交易请求时间
     */
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * 营销活动号
     * @return market_cfg_id 营销活动号
     */
    public String getMarketCfgId() {
        return marketCfgId;
    }

    /**
     * 营销活动号
     * @param marketCfgId 营销活动号
     */
    public void setMarketCfgId(String marketCfgId) {
        this.marketCfgId = marketCfgId;
    }

    /**
     * 商户号
     * @return merchant_id 商户号
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 商户号
     * @param merchantId 商户号
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 外部交易类型
     * @return out_txn_type 外部交易类型
     */
    public String getOutTxnType() {
        return outTxnType;
    }

    /**
     * 外部交易类型
     * @param outTxnType 外部交易类型
     */
    public void setOutTxnType(String outTxnType) {
        this.outTxnType = outTxnType;
    }

    /**
     * 渠道号
     * @return channel 渠道号
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 渠道号
     * @param channel 渠道号
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 兑换状态--INIT-未兑换；DURING-兑换中；SUCCESS-兑换成功；FAILURE-兑换失败；UNKNOWN-未知
     * @return status 兑换状态--INIT-未兑换；DURING-兑换中；SUCCESS-兑换成功；FAILURE-兑换失败；UNKNOWN-未知
     */
    public String getStatus() {
        return status;
    }

    /**
     * 兑换状态--INIT-未兑换；DURING-兑换中；SUCCESS-兑换成功；FAILURE-兑换失败；UNKNOWN-未知
     * @param status 兑换状态--INIT-未兑换；DURING-兑换中；SUCCESS-兑换成功；FAILURE-兑换失败；UNKNOWN-未知
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 营销平台返回码
     * @return result_code 营销平台返回码
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 营销平台返回码
     * @param resultCode 营销平台返回码
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 营销平台返回结果
     * @return result_msg 营销平台返回结果
     */
    public String getResultMsg() {
        return resultMsg;
    }

    /**
     * 营销平台返回结果
     * @param resultMsg 营销平台返回结果
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    /**
     * 创建人
     * @return created_by 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建人
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 创建时间
     * @return created_at 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 修改人
     * @return updated_by 修改人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 修改人
     * @param updatedBy 修改人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 修改时间
     * @return updated_at 修改时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 修改时间
     * @param updatedAt 修改时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}