package p580o0oOoOo;

import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooO0o;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00O implements OooOo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f46567OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f46568OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f46569OooO0OO;

    public static final class OooO00o implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f46570OooO00o;

        public OooO00o(Function0<Unit> function0) {
            this.f46570OooO00o = function0;
        }

        @Override // p405o0Oo0OO0.OooO0o
        public final void onFinished() {
            this.f46570OooO00o.invoke();
        }

        @Override // p405o0Oo0OO0.OooO0o
        public final void onPause() {
        }

        @Override // p405o0Oo0OO0.OooO0o
        public final void onRepeat() {
        }

        @Override // p405o0Oo0OO0.OooO0o
        public final void onStep(int i, double d) {
        }
    }

    public oO0O00O(OooOO0 oooOO1, SVGAView sVGAView, Function0<Unit> function0) {
        this.f46567OooO00o = oooOO1;
        this.f46568OooO0O0 = sVGAView;
        this.f46569OooO0OO = function0;
    }

    @Override // o0Oo0OO0.OooOo00.OooO0O0
    public final void onComplete(@NotNull OooOo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        this.f46568OooO0O0.setImageDrawable(new OooO(videoItem, this.f46567OooO00o));
        this.f46568OooO0O0.setLoops(1);
        this.f46568OooO0O0.OooO0OO();
        this.f46568OooO0O0.setCallback(new OooO00o(this.f46569OooO0OO));
    }

    @Override // o0Oo0OO0.OooOo00.OooO0O0
    public final void onError() {
    }
}
