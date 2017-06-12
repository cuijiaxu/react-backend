package com.cic.its.web.datamodel.dashboard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DashboardJson {

	public Dashboard getdashboard(){
		Dashboard dashboard = new Dashboard();
		List<Sales> sales = new ArrayList<Sales>();
		Cpu cpu = new Cpu();
		List<Browser> browser = new ArrayList<Browser>();
		User user = new User();
		List<Completed> completed = new ArrayList<Completed>();
		List<Comments> comments = new ArrayList<Comments>();
		List<RecentSales> recentsales = new ArrayList<RecentSales>();
		Quote quote = new Quote();
		List<Numbers> numbers = new ArrayList<Numbers>();
		
		int year = 2008;
		for(int i=0;i<8;i++){
			Sales sale = new Sales() ;
			sale.setName(year+i);
			sale.setClothes((int)(Math.random()*500));
			sale.setElectronics((int)(Math.random()*400));
			sale.setFood((int)(Math.random()*200));
			sales.add(sale);
		}
		dashboard.setSales(sales);
		
		List<CpuData> data = new ArrayList<CpuData>();
		for(int i=0;i<20;i++){
			CpuData cpudata = new CpuData();
			cpudata.setCpu((int)(Math.random()*100));
			data.add(cpudata);
		}
		cpu.setCpu(50);
		cpu.setSpace(800);
		cpu.setUsage(200);
		cpu.setData(data);
		dashboard.setCpu(cpu);
		
		Browser chrome = new Browser();
		Browser Firefox = new Browser();
		Browser Safari = new Browser();
		Browser Explorer = new Browser();
		chrome.setName("Google Chrome");
		chrome.setPercent(43.3);
		chrome.setStatus(1);
		Firefox.setName("Mozilla Firefox");
		Firefox.setPercent(33.4);
		Firefox.setStatus(2);
		Safari.setName("Apple Safari");
		Safari.setPercent(14.6);
		Safari.setStatus(4);
		Explorer.setName("Internet Explorer");
		Explorer.setPercent(13.3);
		Explorer.setStatus(1);
		browser.add(chrome);
		browser.add(Firefox);
		browser.add(Explorer);
		browser.add(Safari);
		dashboard.setBrowser(browser);
		
		user.setName("cuijiaxu");
		user.setEmail("cuijia_xu@sina.com");
		user.setSales(3300);
		user.setSold(2200);
		user.setAvatar("test");
		dashboard.setUser(user);
		
		for(int i=0;i<12;i++){
			Completed com = new Completed();
			com.setName(year+i);
			com.setTaskComplete((int)(Math.random()*400));
			com.setCardsComplete((int)(Math.random()*300));
			completed.add(com);
		}
		dashboard.setCompleted(completed);
		
		for(int i=0;i<5;i++){
			Comments comment = new Comments();
			comment.setName(randomStr(5));
			comment.setStatus((int)(Math.random()*5));
			comment.setContent(randomStr(10));
			comment.setAvatar(randomStr(10));
			comment.setDate((new Date()).toString());
			comments.add(comment);
		}
		dashboard.setComments(comments);
		
		for(int i=0;i<20;i++){
			RecentSales rs = new RecentSales();
			rs.setId(i);
			rs.setName(randomStr(5));
			rs.setPrice(Math.random()*100);
			rs.setStatus(2);
			rs.setDate((new Date()).toString());
			recentsales.add(rs);
		}
		dashboard.setRecentsales(recentsales);
		
		quote.setName("Jiaxu Cui");
		quote.setAvatar("avatar");
		quote.setContent("test backend");
		quote.setTitle("test backend");
		dashboard.setQuote(quote);
		
		Numbers a =new Numbers();
		Numbers b =new Numbers();
		Numbers c =new Numbers();
		Numbers d =new Numbers();
		a.setIcon("pay-circle-o");
		a.setColor("#64ea91");
		a.setTitle("Online Review");
		a.setNumber(2781);
		b.setIcon("team");
		b.setColor("#d897eb");
		b.setTitle("New Customers");
		b.setNumber(3401);
		c.setIcon("message");
		c.setColor("#e5e5e5");
		c.setTitle("Active Projects");
		c.setNumber(781);
		d.setIcon("shopping-cart");
		d.setColor("#d6fbb5");
		d.setTitle("Referrals");
		d.setNumber(4324);
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		numbers.add(d);
		dashboard.setNumbers(numbers);
		
		
		return dashboard;
		
	}
	
	
	String randomStr(int namelength){
		ArrayList list = new ArrayList();
        for (char c = 'a'; c <= 'z'; c++) {
            list.add(c);
        }
        String str = "";
        for (int i = 0; i < namelength; i++) {
            int num = (int) (Math.random() * 26);
            str = str + list.get(num);
        }
        return str;
	}
}
