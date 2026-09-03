package p505o0o00oOO;

import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.yalla.yalla.model.ArrearsDetailModel;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import p023Oooo00o.oO00OOOo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends o0000oo<ArrearsDetailModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrearsDetailActivity f50328OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(ArrearsDetailActivity arrearsDetailActivity, int i) {
        super(arrearsDetailActivity, i);
        this.f50328OooOoo0 = arrearsDetailActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ArrearsDetailModel arrearsDetailModel = (ArrearsDetailModel) obj;
        if (viewHolder == null || arrearsDetailModel == null) {
            return;
        }
        viewHolder.setText(o0OO00O.tvArrears, o0000.OooO0OO(o000000.main_coin_arrears));
        viewHolder.setText(o0OO00O.tvArrearsTime, o0O0O0o0.OooO0Oo(arrearsDetailModel.getRefundStamp(), System.currentTimeMillis()));
        viewHolder.setText(o0OO00O.tvAmount, ArrearsDetailActivity.OooOo(this.f50328OooOoo0, arrearsDetailModel.getCoinNum()));
        viewHolder.setText(o0OO00O.tvRechargeTime, oO00OOOo.OooO00o("(", o0000.OooO0OO(o000000.main_arrears_recharge_time), ZegoConstants.ZegoVideoDataAuxPublishingStream, o0O0O0o0.OooO0Oo(arrearsDetailModel.getPurchaseStamp(), System.currentTimeMillis()), ")"));
    }
}
