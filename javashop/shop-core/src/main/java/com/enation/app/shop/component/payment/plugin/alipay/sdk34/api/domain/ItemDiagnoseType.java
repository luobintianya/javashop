package com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.domain;

import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.AlipayObject;
import com.enation.app.shop.component.payment.plugin.alipay.sdk34.api.internal.mapping.ApiField;

/**
 * 菜品诊断类型列表对象
 *
 * @author auto create
 * @since 1.0, 2017-02-12 21:51:42
 */
public class ItemDiagnoseType extends AlipayObject {

	private static final long serialVersionUID = 4662771457934196446L;

	/**
	 * 类型
	 */
	@ApiField("item_diagnose")
	private String itemDiagnose;

	/**
	 * 对类型的描述
	 */
	@ApiField("item_diagnose_desc")
	private String itemDiagnoseDesc;

	public String getItemDiagnose() {
		return this.itemDiagnose;
	}
	public void setItemDiagnose(String itemDiagnose) {
		this.itemDiagnose = itemDiagnose;
	}

	public String getItemDiagnoseDesc() {
		return this.itemDiagnoseDesc;
	}
	public void setItemDiagnoseDesc(String itemDiagnoseDesc) {
		this.itemDiagnoseDesc = itemDiagnoseDesc;
	}

}
