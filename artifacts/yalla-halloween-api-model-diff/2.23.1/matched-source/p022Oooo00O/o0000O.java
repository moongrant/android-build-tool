package p022Oooo00O;

import android.util.Range;
import androidx.camera.core.impl.o0O0O00;
import com.yy.yyeva.view.EvaAnimView;
import com.yy.yyeva.view.InnerSurfaceView;
import kotlin.jvm.internal.Intrinsics;
import o000OO.OooOOO0;
import p045Oooooo.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f489OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f490OooO0o0;

    public /* synthetic */ o0000O(Object obj, int i) {
        this.f489OooO0Oo = i;
        this.f490OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f489OooO0Oo) {
            case 0:
                o000OO.OooOO0O.OooO0O0 oooO0O0 = (o000OO.OooOO0O.OooO0O0) this.f490OooO0o0;
                if (oooO0O0.f593OooO0o0) {
                    return;
                }
                OooOOO0.OooO0o(null, o000OO.this.f553OooO0oo == o000OO.OooOO0.REOPENING);
                if (o000OO.OooOO0O.this.OooO0OO()) {
                    o000OO.this.Oooo0O0(true);
                    return;
                } else {
                    o000OO.this.Oooo0OO(true);
                    return;
                }
            case 1:
                o000OO.OooO0o oooO0o = (o000OO.OooO0o) ((o0O0O00.OooO0O0) this.f490OooO0o0);
                if (o000OO.this.f553OooO0oo == o000OO.OooOO0.OPENED) {
                    o000OO.this.OooOoo0();
                    return;
                }
                return;
            case 2:
                o0000Ooo o0000ooo = (o0000Ooo) this.f490OooO0o0;
                Range<Long> range = o0000Ooo.f1888OooOooO;
                o0000ooo.getClass();
                int i = o0000Ooo.OooO00o.f1931OooO00o[o0000ooo.f1910OooOo00.ordinal()];
                if (i == 2) {
                    o0000ooo.OooO();
                    return;
                } else {
                    if (i == 7 || i == 9) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            default:
                EvaAnimView this$0 = (EvaAnimView) this.f490OooO0o0;
                int i2 = EvaAnimView.f32435OooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                InnerSurfaceView innerSurfaceView = this$0.f32436OooO;
                if (innerSurfaceView != null) {
                    innerSurfaceView.setLayoutParams(this$0.f32443OooOO0O.OooO0O0(innerSurfaceView));
                    return;
                }
                return;
        }
    }
}
