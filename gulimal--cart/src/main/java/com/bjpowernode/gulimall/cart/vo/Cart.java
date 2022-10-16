package com.bjpowernode.gulimall.cart.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 *
 * 整个购物车
 *
 *
 */
public class Cart {
    List<CartItem> items;

    private Integer countNum;//总计的商品数量

    private Integer countType;//商品类型数量

    private BigDecimal totalAmount;//商品的总价格

    private BigDecimal reduce = new BigDecimal("0.00");//减免的价格

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public Integer getCountNum() {
        int count = 0;
        if (items!=null && items.size()>0){
            for (CartItem item : items) {
                count+= item.getCount();
            }
        }
        return count;
    }



    public Integer getCountType() {
        int count = 0;
        if (items!=null && items.size()>0) {
            for (CartItem item : items) {
                count += 1;
            }
        }
        return count;
    }



    public BigDecimal getTotalAmount() {
        BigDecimal amount = new BigDecimal("0");
        //计算购物项目的总价
        if (items!=null && items.size()>0) {
            for (CartItem item : items) {
                BigDecimal totalPrice = item.getTotalPrice();
               amount= amount.add(totalPrice);
            }
        }

//        减去优惠券的价格
        BigDecimal subtract = amount.subtract(getReduce());

        return subtract;
    }



    public BigDecimal getReduce() {
        return reduce;
    }

    public void setReduce(BigDecimal reduce) {
        this.reduce = reduce;
    }
}
