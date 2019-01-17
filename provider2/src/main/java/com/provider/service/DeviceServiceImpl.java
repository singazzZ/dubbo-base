package com.provider.service;

import com.api.device.DeviceService;

public class DeviceServiceImpl implements DeviceService{
	public String getDeviceName() {
		System.out.println("I am Provider2");
		return "桌面式设备";
	}
}
