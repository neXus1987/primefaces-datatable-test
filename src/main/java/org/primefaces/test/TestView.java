package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

	private String string;
	private Integer integer;
	private BigDecimal decimal;
	private LocalDateTime localDateTime;

	@PostConstruct
	public void init() {
		string = "Welcome to PrimeFaces!!!";
		toggleList();
	}

	private List<String> getData1() {
		List<String> t = new ArrayList<>();

		t.add("Data 1 1");
		t.add("Data 1 2");
		t.add("Data 1 3");
		t.add("Data 1 4");

		return t;
	}

	private List<String> getData2() {
		List<String> t = new ArrayList<>();

		t.add("Data 2 1");
		t.add("Data 2 2");
		t.add("Data 2 3");
		t.add("Data 2 4");

		return t;
	}

	private int viewState;

	public void toggleList() {

		if (viewState == 0) {
			setListStringData(getData1());
			viewState = 1;
		} else {
			setListStringData(getData2());
			viewState = 0;
		}

	}

	private List<String> listStringData;

	public List<String> getListStringData() {
		return listStringData;
	}

	public void setListStringData(List<String> listStringData) {
		this.listStringData = listStringData;
	}

}
