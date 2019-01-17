package com.provider.service;

import com.api.device.DeviceService;

public class DeviceServiceImpl implements DeviceService{
	public String getDeviceName() {
		System.out.println("I am Provider");
		return "大立式设备";
	}
}
