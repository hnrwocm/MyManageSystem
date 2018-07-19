package com.ssh.dmain;

import java.util.List;
/**
 * 封装页面显示所需要的数据
 * @author hope
 *
 * @param <T>
 */
/**
 * @author Administrator
 *
 * @param <T>
 */
public class PageBean<T> {
   // 当前页数
   private int currPage;
   // 每页显示数量
   private int pageSize;
   // 总页数
   private int totalPage;
   // 总记录数
   private int totalCount;
   //跳转页数
   private int skipPage;

// 每页显示的数据
   private List<T> list;


public int getCurrPage() {
	return currPage;
}
public void setCurrPage(int currPage) {
	this.currPage = currPage;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}
public int getTotalCount() {
	return totalCount;
}
public void setTotalCount(int totalCount) {
	this.totalCount = totalCount;
}


public int getSkipPage() {
	return skipPage;
}
public void setSkipPage(int skipPage) {
	this.skipPage = skipPage;
}
public List<T> getList() {
	return list;
}
public void setList(List<T> list) {
	this.list = list;
}
@Override
public String toString() {
	return "PageBean [currPage=" + currPage + ", pageSize=" + pageSize + ", totalPage=" + totalPage + ", totalCount="
			+ totalCount + ", skipPage=" + skipPage + ", list=" + list + "]";
}

   
}