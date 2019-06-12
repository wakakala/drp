package com.gmm.drp.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单查询参数
 */
/*@Getter
@Setter*/
public class OrderQueryVo {
    //@ApiModelProperty(value = "订单编号")
    private String ordernum;
    //@ApiModelProperty(value = "收货人姓名/号码")
    private String receiverKeyword;
   // @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;


    //@ApiModelProperty(value = "订单提交时间")
    private String createTime;

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public String getReceiverKeyword() {
        return receiverKeyword;
    }

    public void setReceiverKeyword(String receiverKeyword) {
        this.receiverKeyword = receiverKeyword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
