package p499o0o00o0O;

import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.yalla.yalla.model.ArrearsDetailModel;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import p023Oooo00o.oO00Oo00;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends o000O<ArrearsDetailModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ ArrearsDetailActivity f49360OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(ArrearsDetailActivity arrearsDetailActivity, int i) {
        super(arrearsDetailActivity, i);
        this.f49360OooOoo0 = arrearsDetailActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        ArrearsDetailModel arrearsDetailModel = (ArrearsDetailModel) obj;
        if (viewHolder == null || arrearsDetailModel == null) {
            return;
        }
        viewHolder.setText(oO00O0oO.tvArrears, o0000.OooO0OO(oO00OOo0.main_coin_arrears));
        viewHolder.setText(oO00O0oO.tvArrearsTime, o0000oo.OooO0Oo(arrearsDetailModel.getRefundStamp(), System.currentTimeMillis()));
        viewHolder.setText(oO00O0oO.tvAmount, ArrearsDetailActivity.OooOo(this.f49360OooOoo0, arrearsDetailModel.getCoinNum()));
        viewHolder.setText(oO00O0oO.tvRechargeTime, oO00Oo00.OooO00o("(", o0000.OooO0OO(oO00OOo0.main_arrears_recharge_time), ZegoConstants.ZegoVideoDataAuxPublishingStream, o0000oo.OooO0Oo(arrearsDetailModel.getPurchaseStamp(), System.currentTimeMillis()), ")"));
    }
}
