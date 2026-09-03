package p142o00OOooO;

import com.app.base.fragment.CrystalDetailFragment;
import com.app.base.model.RoomIndexModel;
import com.code.android.util.ToastUtil;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.manager.FixRechargeOrderManager;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p186o00o00Oo.o0ooOOo;
import p654o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OoOo0 implements o0ooOOo, OooO0OO.OooO0O0, o000oOoO, p654o0ooo.o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f31977OooO0Oo;

    public /* synthetic */ o0OoOo0(Object obj) {
        this.f31977OooO0Oo = obj;
    }

    @Override // p654o0ooo.o0OoOo0
    public final void OooO00o(Object obj) {
        MainRoomRecommendFragment.m482initView$lambda4((MainRoomRecommendFragment) this.f31977OooO0Oo, (RoomIndexModel) obj);
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooO(((OooOO0.OooO0O0) this.f31977OooO0Oo).f13243OoooO00);
    }

    @Override // p654o0ooo.o000oOoO
    public final void OooO0Oo() {
        PremiumActivity this$0 = (PremiumActivity) this.f31977OooO0Oo;
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.requireNonNull(this$0);
        new FixRechargeOrderManager(this$0, new PayManager(this$0)).start(this$0.Oooo0O0(), true);
        ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.Restoring_Please_wait_a_moment));
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        ((CrystalDetailFragment) this.f31977OooO0Oo).lambda$initView$0();
    }
}
