package p564o0oOo00;

import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.ArrearsDetailModel;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends OooO0OO<ArrearsDetailModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ArrearsDetailActivity f45118OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(ArrearsDetailActivity arrearsDetailActivity) {
        super(arrearsDetailActivity, R.layout.main_item_arrears_detail);
        this.f45118OooO00o = arrearsDetailActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o oooO0o = (OooO0o) oooO00o;
        ArrearsDetailModel arrearsDetailModel = (ArrearsDetailModel) obj;
        if (oooO0o == null || arrearsDetailModel == null) {
            return;
        }
        oooO0o.OooOO0(R.id.tvArrears, o000O0O0.OooO0OO(R.string.main_coin_arrears));
        oooO0o.OooOO0(R.id.tvArrearsTime, o00O0.f48624OooO00o.OooO0Oo(arrearsDetailModel.getRefundStamp(), System.currentTimeMillis()));
        oooO0o.OooOO0(R.id.tvAmount, ArrearsDetailActivity.OooOoo(this.f45118OooO00o, arrearsDetailModel.getCoinNum()));
        oooO0o.OooOO0(R.id.tvRechargeTime, '(' + o000O0O0.OooO0OO(R.string.main_arrears_recharge_time) + ' ' + o00O0.f48624OooO00o.OooO0Oo(arrearsDetailModel.getPurchaseStamp(), System.currentTimeMillis()) + ')');
    }
}
