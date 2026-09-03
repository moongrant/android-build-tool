package p142o00OOooO;

import com.app.base.fragment.CrystalDetailFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.fragment.MainMomentsTopicNewFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import p186o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000oOoO implements o0ooOOo, OooO0OO.OooO0O0, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f31958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f31959OooO0o0;

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f31958OooO0Oo = i;
        this.f31959OooO0o0 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        OooOO0.OooO0O0 oooO0O0 = (OooOO0.OooO0O0) this.f31959OooO0o0;
        oooO00o.OooOooO(oooO0O0.f13245OoooOO0, oooO0O0.f13241OoooO);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainRoomRecommendFragment.m483initView$lambda5((MainRoomRecommendFragment) this.f31959OooO0o0);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31958OooO0Oo) {
            case 0:
                ((CrystalDetailFragment) this.f31959OooO0o0).lambda$initView$1();
                break;
            default:
                MainMomentsTopicNewFragment.m356initView$lambda2((MainMomentsTopicNewFragment) this.f31959OooO0o0);
                break;
        }
    }
}
