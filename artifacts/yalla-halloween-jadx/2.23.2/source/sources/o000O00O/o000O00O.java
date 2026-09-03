package o000O00O;

import androidx.media3.common.Player;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements o000OoO.o00000O0.OooO00o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34030OooO0Oo;

    public /* synthetic */ o000O00O(Object obj) {
        this.f34030OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainMomentsTopicAddMoreFragment.initView$lambda$3((MainMomentsTopicAddMoreFragment) this.f34030OooO0Oo);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onMediaMetadataChanged(androidx.media3.exoplayer.OooO.this.f7159Oooo0o);
    }
}
