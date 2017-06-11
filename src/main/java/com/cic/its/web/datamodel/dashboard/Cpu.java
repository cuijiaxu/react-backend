package com.cic.its.web.datamodel.dashboard;

import java.util.List;

public class Cpu {

	private int usage;
	private int space;
	private int cpu;
	private List<CpuData> data;
	public int getUsage() {
		return usage;
	}
	public void setUsage(int usage) {
		this.usage = usage;
	}
	public int getSpace() {
		return space;
	}
	public void setSpace(int space) {
		this.space = space;
	}
	public int getCpu() {
		return cpu;
	}
	public void setCpu(int cpu) {
		this.cpu = cpu;
	}
	public List<CpuData> getData() {
		return data;
	}
	public void setData(List<CpuData> data) {
		this.data = data;
	}
	
	
}
