package org.example.controller;

import java.util.List;

import org.example.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.example.po.DeliveryAddress;
import org.example.po.CommonResult;

//@CrossOrigin("*")
@RestController
@RequestMapping("/DeliveryAddressController")
@RefreshScope //开启动态刷新

public class DeliveryAddressController {
	@Autowired
	private DeliveryAddressService deliveryAddressService;

	@GetMapping("/listDeliveryAddressByUserId/{userId}")
	public CommonResult<List> listDeliveryAddressByUserId(@PathVariable("userId") String userId) throws Exception {
		List<DeliveryAddress> list = deliveryAddressService.listDeliveryAddressByUserId(userId);
		return new CommonResult(200, "success", list);
	}

	@GetMapping("/getDeliveryAddressById/{daId}")
	public CommonResult<DeliveryAddress> getDeliveryAddressById(@PathVariable("daId") Integer daId) throws Exception {
		DeliveryAddress deliveryAddress = deliveryAddressService.getDeliveryAddressById(daId);
		return new CommonResult(200, "success", deliveryAddress);
	}

	@PostMapping("/saveDeliveryAddress/{contactName}/{contactSex}/{contactTel}/{address}/{userId}")
	public CommonResult<Integer> saveDeliveryAddress(@PathVariable("contactName") String contactName,
			@PathVariable("contactSex") Integer contactSex, @PathVariable("contactTel") String contactTel,
			@PathVariable("address") String address, @PathVariable("userId") String userId) throws Exception {
		DeliveryAddress param = new DeliveryAddress();
		param.setContactName(contactName);
		param.setContactSex(contactSex);
		param.setContactTel(contactTel);
		param.setAddress(address);
		param.setUserId(userId);
		int result = deliveryAddressService.saveDeliveryAddress(param);
		return new CommonResult(200, "success", result);
	}

	@PutMapping("/updateDeliveryAddress/{daId}/{contactName}/{contactSex}/{contactTel}/{address}")
	public CommonResult<Integer> updateDeliveryAddress(@PathVariable("daId") Integer daId,
			@PathVariable("contactName") String contactName, @PathVariable("contactSex") Integer contactSex,
			@PathVariable("contactTel") String contactTel, @PathVariable("address") String address) throws Exception {
		DeliveryAddress param = new DeliveryAddress();
		String address1 = java.net.URLDecoder.decode(address, "UTF-8");
		param.setDaId(daId);
		param.setContactName(contactName);
		param.setContactSex(contactSex);
		param.setContactTel(contactTel);
		param.setAddress(address1);
		int result = deliveryAddressService.updateDeliveryAddress(param);
		return new CommonResult(200, "success", result);
	}

	@DeleteMapping("/removeDeliveryAddress/{daId}")
	public CommonResult<Integer> removeDeliveryAddress(@PathVariable("daId") Integer daId) throws Exception {
		int result = deliveryAddressService.removeDeliveryAddress(daId);
		return new CommonResult(200, "success", result);
	}
}
