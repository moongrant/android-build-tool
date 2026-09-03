package p540o0o0OoO0;

import com.code.android.uikit.svga.SVGAView;
import com.opensource.svgaplayer.OooO0OO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0O.OooO;
import o0OO0O0O.OooOO0;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f55065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f55066OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f55067OooO0OO;

    public static final class OooO00o implements o0OO0O0O.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f55068OooO00o;

        public OooO00o(Function0<Unit> function0) {
            this.f55068OooO00o = function0;
        }

        @Override // o0OO0O0O.OooO0OO
        public final void OooO00o() {
        }

        @Override // o0OO0O0O.OooO0OO
        public final void OooO0O0() {
            this.f55068OooO00o.invoke();
        }

        @Override // o0OO0O0O.OooO0OO
        public final void OooO0OO(int i) {
        }

        @Override // o0OO0O0O.OooO0OO
        public final void onPause() {
        }
    }

    public ooo0Oo0(OooOO0 oooOO1, SVGAView sVGAView, o0o0000 o0o0000Var) {
        this.f55065OooO00o = oooOO1;
        this.f55066OooO0O0 = sVGAView;
        this.f55067OooO0OO = o0o0000Var;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull o00Ooo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        OooO oooO = new OooO(videoItem, this.f55065OooO00o);
        SVGAView sVGAView = this.f55066OooO0O0;
        sVGAView.setImageDrawable(oooO);
        sVGAView.setLoops(1);
        sVGAView.OooO0Oo();
        sVGAView.setCallback(new OooO00o(this.f55067OooO0OO));
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
    }
}
