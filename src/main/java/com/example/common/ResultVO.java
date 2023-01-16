package com.example.common;

import java.io.Serializable;

/**
 * 结果对象VO
 *
 * @Author yyw
 * @Date 2018年06月20日 14:04
 * @Version 1.0.0
 */
public class ResultVO<T,R> implements Serializable {
    private static final long serialVersionUID = -6027997976969510028L;

    private final String FAIL = "0";

    private String code;
    private String msg;
    private T result;
    // 当前页
    private int pageNum;
    // 每页的数量
    private int pageSize;
    private long total;
    // 总页数
    private int pages;

    public ResultVO() {
    }

    public ResultVO(String code) {
        this.setCode(code);
    }

    /**
     * 初始化，优先取多语言错误信息
     * @author dougs
     * @date 2019/11/29 14:52
     * @param code
     * @param msg
     * @return
     */
    public ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(String code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public ResultVO(String code, T result) {
        this.setCode(code);
        this.result = result;
    }

    public ResultVO(Throwable e) {
        super();
        this.code = FAIL;
        this.msg = e.getCause() == null ? e.getMessage() : e.getCause().getMessage();
    }

    public void setCode(String code){
        this.code = code;
    }


    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
        if (total == -1) {
            pages = 1;
            return;
        }
        if (pageSize > 0) {
            pages = (int) (total / pageSize + ((total % pageSize == 0) ? 0 : 1));
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
