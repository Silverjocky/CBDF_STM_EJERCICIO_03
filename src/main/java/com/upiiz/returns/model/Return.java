package com.upiiz.returns.model;

public class Return {
    private Long return_id;
    private Long order_id;
    private Long product_id;
    private String return_date;
    private String reason;

    public Return(Long return_id, Long order_id, Long product_id, String return_date, String reason) {
        this.return_id = return_id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.return_date = return_date;
        this.reason = reason;
    }

    public Return() {}

    public Long getReturn_id() {
        return return_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public String getReturn_date() {
        return return_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReturn_id(Long return_id) {
        this.return_id = return_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
