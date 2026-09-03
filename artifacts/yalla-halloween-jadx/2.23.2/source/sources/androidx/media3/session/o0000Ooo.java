package androidx.media3.session;

import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.TopDataFragment;
import kotlin.jvm.internal.Intrinsics;
import p414o0Oo0oO.oO000o00;
import p475o0Ooooo0.o0O00oO0;
import p650o0ooo.oO00OOOo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000Ooo implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9299OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9300OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f9299OooO0Oo = i;
        this.f9300OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f9299OooO0Oo;
        Object obj = this.f9300OooO0o0;
        switch (i2) {
            case 1:
                RoomSettingActivity this$0 = (RoomSettingActivity) obj;
                int i3 = RoomSettingActivity.f26191Oooo00O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO((RoomItemInfoModel) this$0.f26195OooOo00.get(i), i);
                break;
            case 2:
                oO00OOOo this$1 = (oO00OOOo) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                GiftPropModel giftPropModelOooOOO = this$1.f58785OooOO0o.OooOOO(i);
                if (giftPropModelOooOOO != null && giftPropModelOooOOO.getGiftId() != p415o0Oo0oO0.o00Ooo.OooO0oo().OooOOO()) {
                    oO000o00 oo000o00OooO0oo = p415o0Oo0oO0.o00Ooo.OooO0oo();
                    int giftId = giftPropModelOooOOO.getGiftId();
                    oo000o00OooO0oo.getClass();
                    oo000o00OooO0oo.OooO0oO(giftId, "giftId" + o0O00oO0.OooOOo0().getValue());
                    oO000o00 oo000o00OooO0oo2 = p415o0Oo0oO0.o00Ooo.OooO0oo();
                    long price = (long) giftPropModelOooOOO.getPrice();
                    oo000o00OooO0oo2.getClass();
                    oo000o00OooO0oo2.OooO0oo(price, "giftCoin" + o0O00oO0.OooOOo0().getValue());
                    this$1.f58785OooOO0o.notifyDataSetChanged();
                    this$1.OooOO0().f44005OooO0O0.setText(String.valueOf(p415o0Oo0oO0.o00Ooo.OooO0oo().OooOO0o() * ((long) p415o0Oo0oO0.o00Ooo.OooO0oo().OooOOO0())));
                    break;
                }
                break;
            default:
                TopDataFragment.initView$lambda$2((TopDataFragment) obj, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackParametersChanged(((o00O00O) this.f9300OooO0o0).f9372OooOO0);
    }
}
