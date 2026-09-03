package o000O00O;

import androidx.media3.common.Player;
import androidx.media3.common.text.Cue;
import com.yalla.yalla.ui.fragment.moment.MainMomentsTopicAddMoreFragment;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements o000OoO.o00000O0.OooO00o, p559o0oOo.o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34027OooO0Oo;

    public /* synthetic */ o000O00(Object obj) {
        this.f34027OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainMomentsTopicAddMoreFragment.initView$lambda$2((MainMomentsTopicAddMoreFragment) this.f34027OooO0Oo);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onCues((List<Cue>) this.f34027OooO0Oo);
    }
}
