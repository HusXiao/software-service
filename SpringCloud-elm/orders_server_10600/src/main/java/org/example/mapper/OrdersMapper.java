package org.example.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import org.example.po.Orders;

@Mapper
public interface OrdersMapper {

	@Insert("insert into orders(userId,businessId,orderDate,orderTotal,daId,orderState) values(#{userId},#{businessId},#{orderDate},#{orderTotal},#{daId},0)")
	@Options(useGeneratedKeys=true,keyProperty="orderId",keyColumn="orderId")
	public int saveOrders(Orders order);
	
	public Orders getOrdersById(Integer orderId);
	
	public List<Orders> listOrdersByUserId(String user);

}
