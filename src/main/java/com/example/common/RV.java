package com.example.common;


/**
 * RV
 *
 * @Author yyw
 * @Date 2018年06月20日 14:04
 * @Version 1.0.0
 */
public class RV {
	private final static String SUCCESS = "1";
	private final static String FAIL = "0";
	public static ResultVO success() {
		return new ResultVO(SUCCESS,"操作成功");
	}

	/***
	 * success:操作成功返回 <br/>
	 * 
	 * @author he.kui
	 * @param data
	 *            返回到前端的数据对象
	 * @return
	 * @since JDK 1.7
	 */
	public static ResultVO success(Object data) {
		ResultVO resultVo = new ResultVO();
		resultVo.setCode(SUCCESS);
		resultVo.setMsg("操作成功");
		resultVo.setResult(data);
		return resultVo;
	}

	public static ResultVO page(Integer pageNum,Integer pageSize,
								long total,int pages,
								Object data) {
		ResultVO resultVo = new ResultVO();
		resultVo.setCode(SUCCESS);
		resultVo.setMsg("操作成功");
		resultVo.setResult(data);
		resultVo.setPageNum(pageNum);
		resultVo.setPageSize(pageSize);
		resultVo.setTotal(total);
		resultVo.setPages(pages);
		return resultVo;
	}

	/***
	 * fail:操作失败时返回 <br/>
	 * 
	 * @author he.kui
	 * @param errCode
	 *            错误代码
	 * @return
	 * @since JDK 1.7
	 */
	public static ResultVO fail(String errCode) {
		ResultVO resultVo = new ResultVO();
		resultVo.setCode(errCode);
		return resultVo;
	}
	
	/**
	 * 操作失败抛出错误代码和错误明细 fail:<br/>
	 * @author gaolinlou
	 * @param errCode
	 * @param data
	 * @return
	 * @since JDK 1.7
	 */
	@SuppressWarnings("unchecked")
	public static ResultVO fail(String errCode,Object data){
		ResultVO resultVo = new ResultVO();
		resultVo.setCode(errCode);
		resultVo.setResult(data);
		return resultVo;
	}
	
	
	/**
	 * 操作失败抛出错误代码和错误信息 fail:<br/>
	 * 
	 * @author he.kui
	 * @param errCode
	 * @param errMessage
	 * @return
	 * @since JDK 1.7
	 */
	public static ResultVO fail(String errCode, String errMessage) {
		if (errMessage == null) {
			return fail(errCode);
		} else {
			return new ResultVO(errCode, errMessage);
		}
	}

	/***
	 * 失败返回
	 * 
	 * @name fail(这里用一句话描述这个方法的作用) (这里描述这个方法适用条件 – 可选)
	 * @param errCode
	 *            对应的错误代码
	 * @param e
	 *            对应的异常对象
	 * @return
	 * @return ResultVO
	 * @autor he.kui
	 * @time 2015年5月30日 下午1:21:37
	 * @update 2015年5月30日 下午1:21:37
	 * 
	 */
	public static ResultVO fail(String errCode, Exception e) {
		return fail(errCode,e.getMessage());
	}

	public static ResultVO fail(Exception e) {
		return fail(FAIL,e);
	}
}
