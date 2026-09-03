package androidx.media3.session;

import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000 implements o000OoO.o00000O0.OooO0O0, BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9280OooO0Oo;

    public /* synthetic */ o000(Object obj) {
        this.f9280OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        MainRoomPopularFragment.initView$lambda$3$lambda$2((MainRoomPopularFragment) this.f9280OooO0Oo);
    }

    @Override // o000OoO.o00000O0.OooO0O0
    public final void OooO0O0(Object obj, androidx.media3.common.OooO oooO) {
        o000OO0O o000oo0o2 = (o000OO0O) this.f9280OooO0Oo;
        o000oo0o2.getClass();
        Player.OooO0O0 oooO0O0 = new Player.OooO0O0(oooO);
        o000oo0o2.getClass();
        ((Player.OooO0OO) obj).onEvents(null, oooO0O0);
    }
}
