package demo.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/*
 * 业务成功，状态码code 为 1
 * 业务失败，状态码code 为0
 * 代码异常，状态码code 为-1
 */
public class R {
	
	private String msg;					//状态信息	
	private Integer code;				//状态码	
	private Object data;
	private Integer pageNum;			//当前页码								
	private Integer pageSize;			//页面大小
	private long total;					//总记录数
	
	public  R(Integer code,String msg,Object data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	public R(Integer code,String msg,Object data,Integer pageNum,Integer pageSize,long total) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.total = total;
	}
	public static R ok() {
		return new R(1, "请求成功", null);
	}
	public static R ok(Object data) {
		return new R(1,"请求成功",data);
	}
	public static R error0(String msg) {
		return new R(0, msg, null);
	}
	public static R error1(String msg){
		return new R(-1, msg, null);
	}
	public static R queryOk(Object data,Integer pageNum,Integer pageSize,long total) {
		return new R(1, "请求成功", data, pageNum, pageSize, total);
	}
	
	@Override
	public String toString() {
		return "R [msg=" + msg + ", code=" + code + ", data=" + data + ", pageNum=" + pageNum + ", pageSize=" + pageSize + ", total="
				+ total + "]";
	}
}
