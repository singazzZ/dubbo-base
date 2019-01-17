package com.provider.service;

import com.api.device.DeviceService;

public class DeviceServiceImpl implements DeviceService{
	public String getDeviceName() {
		System.out.println("I am Provider3");
		return "便携式设备";
	}
}
