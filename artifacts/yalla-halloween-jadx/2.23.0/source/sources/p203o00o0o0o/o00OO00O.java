package p203o00o0o0o;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.text.Cue;
import com.squareup.okhttp.OooOo;
import java.util.List;
import oO0OO.OooOO0O;
import p245o00oo0o.o00O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OO00O implements o00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39203OooO0Oo;

    public /* synthetic */ o00OO00O(Object obj) {
        this.f39203OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        OooOO0O oooOO0O = (OooOO0O) this.f39203OooO0Oo;
        if (i < oooOO0O.f60387OooOOOO.f10111OooOOoo.size()) {
            o0OO000.OooO00o("102284");
            OooOo.OooO0OO(174, oooOO0O.f60387OooOOOO.OooOOO(i));
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onCues((List<Cue>) this.f39203OooO0Oo);
    }
}
