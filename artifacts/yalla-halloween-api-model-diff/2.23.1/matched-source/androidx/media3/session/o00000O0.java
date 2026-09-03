package androidx.media3.session;

import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.fragment.TopDataFragment;
import kotlin.jvm.internal.Intrinsics;
import p416o0Oo0oO.oO000o00;
import p474o0OoooOO.oo0oO0;
import p675oO0Oo.oOO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00000O0 implements o000OoO.o00000.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9297OooO0o0;

    public /* synthetic */ o00000O0(Object obj, int i) {
        this.f9296OooO0Oo = i;
        this.f9297OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f9296OooO0Oo;
        Object obj = this.f9297OooO0o0;
        switch (i2) {
            case 1:
                oOO0OO this$0 = (oOO0OO) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GiftPropModel giftPropModelOooOOO = this$0.f59752OooOO0o.OooOOO(i);
                if (giftPropModelOooOOO != null && giftPropModelOooOOO.getGiftId() != p417o0Oo0oO0.o00Oo0.OooO0oo().OooOOO()) {
                    oO000o00 oo000o00OooO0oo = p417o0Oo0oO0.o00Oo0.OooO0oo();
                    int giftId = giftPropModelOooOOO.getGiftId();
                    oo000o00OooO0oo.getClass();
                    oo000o00OooO0oo.OooO0oO(giftId, "giftId" + oo0oO0.OooOOo0().getValue());
                    oO000o00 oo000o00OooO0oo2 = p417o0Oo0oO0.o00Oo0.OooO0oo();
                    long price = (long) giftPropModelOooOOO.getPrice();
                    oo000o00OooO0oo2.getClass();
                    oo000o00OooO0oo2.OooO0oo(price, "giftCoin" + oo0oO0.OooOOo0().getValue());
                    this$0.f59752OooOO0o.notifyDataSetChanged();
                    this$0.OooOO0().f44023OooO0O0.setText(String.valueOf(p417o0Oo0oO0.o00Oo0.OooO0oo().OooOO0o() * ((long) p417o0Oo0oO0.o00Oo0.OooO0oo().OooOOO0())));
                    break;
                }
                break;
            default:
                TopDataFragment.initView$lambda$2((TopDataFragment) obj, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackParametersChanged(((o00O00O) this.f9297OooO0o0).f9378OooOO0);
    }
}
