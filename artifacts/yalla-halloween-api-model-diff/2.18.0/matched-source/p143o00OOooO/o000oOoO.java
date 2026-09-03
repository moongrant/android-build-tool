package p143o00OOooO;

import com.app.base.fragment.CrystalDetailFragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.fragment.MainMomentsTopicNewFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import p187o00o00Oo.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000oOoO implements o0ooOOo, OooO0OO.OooO0O0, BaseQuickAdapter.OooOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31979Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f31980OoooO00;

    public /* synthetic */ o000oOoO(Object obj, int i) {
        this.f31979Oooo = i;
        this.f31980OoooO00 = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        OooOO0.OooO0O0 oooO0O0 = (OooOO0.OooO0O0) this.f31980OoooO00;
        oooO00o.OooOooO(oooO0O0.f13261OoooOOo, oooO0O0.f13260OoooOOO);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo
    public final void OooO0Oo() {
        MainRoomRecommendFragment.m483initView$lambda5((MainRoomRecommendFragment) this.f31980OoooO00);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f31979Oooo) {
            case 0:
                ((CrystalDetailFragment) this.f31980OoooO00).lambda$initView$1();
                break;
            default:
                MainMomentsTopicNewFragment.m356initView$lambda2((MainMomentsTopicNewFragment) this.f31980OoooO00);
                break;
        }
    }
}
