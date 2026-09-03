package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.Player;
import com.yalla.yalla.ui.view.StickerFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p023Oooo00o.oO00O0o0;
import p025Oooo0OO.oo0o0Oo;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OO000o implements oo0o0Oo, o00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f797OooO0Oo;

    public /* synthetic */ o0OO000o(Object obj) {
        this.f797OooO0Oo = obj;
    }

    @Override // p025Oooo0OO.oo0o0Oo
    public final Object OooO00o(CameraCharacteristics.Key key) {
        return ((oO00O0o0) this.f797OooO0Oo).OooO00o(key);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        StickerFaceView this$0 = (StickerFaceView) this.f797OooO0Oo;
        int i2 = StickerFaceView.f30726OooO0oO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this$0.f30729OooO0o0 < 700) {
            return;
        }
        this$0.f30729OooO0o0 = jCurrentTimeMillis;
        Function1<? super Integer, Unit> function1 = this$0.f30728OooO0o;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(((StickerFaceView.OooO0O0) this$0.f30727OooO0Oo.f10111OooOOoo.get(i)).f30730OooO00o));
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onAvailableCommandsChanged(((OooOOO) this.f797OooO0Oo).f11114Oooo0o);
    }
}
