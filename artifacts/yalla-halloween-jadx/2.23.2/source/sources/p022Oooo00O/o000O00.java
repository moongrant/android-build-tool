package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import android.view.View;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.ui.fragment.PacketHistoryListFragment;
import kotlin.jvm.internal.Intrinsics;
import p023Oooo00o.oO000o00;
import p025Oooo0OO.oo0o0Oo;
import p045Oooooo.o0000Ooo;
import p080o000OoO.o00000O0;
import p559o0oOo.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements oo0o0Oo, o000Oo0.OooO0OO, o00000O0.OooO00o, BaseQuickAdapter.OooO0o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f506OooO0Oo;

    public /* synthetic */ o000O00(Object obj) {
        this.f506OooO0Oo = obj;
    }

    @Override // p025Oooo0OO.oo0o0Oo
    public final Object OooO00o(CameraCharacteristics.Key key) {
        return ((oO000o00) this.f506OooO0Oo).OooO00o(key);
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        PacketHistoryListFragment.initView$lambda$1((PacketHistoryListFragment) this.f506OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        AlbumActivity this$0 = (AlbumActivity) this.f506OooO0Oo;
        int i2 = AlbumActivity.f22018OooOo0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOOoo(false);
        this$0.f22026OooOO0o = i;
        this$0.OooOOo0();
        this$0.OooOOOO().smoothScrollToPosition(0);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) this.f506OooO0Oo;
        o0000Ooo.this.f1894OooO0oo.execute(new androidx.camera.core.impl.o0000Ooo(1, oooO0OO, oooO00o));
        return "fetchData";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o00O0O();
    }
}
