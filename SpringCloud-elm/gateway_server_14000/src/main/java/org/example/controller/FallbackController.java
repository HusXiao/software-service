package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.example.po.CommonResult;

@RestController
public class FallbackController {

	@RequestMapping("/fallback")
	public CommonResult fallback() {
		return new CommonResult(403, "Gateway触发了熔断降级方法", null);
	}
}
