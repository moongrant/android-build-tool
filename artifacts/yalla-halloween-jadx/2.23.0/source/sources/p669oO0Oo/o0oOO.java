package p669oO0Oo;

import com.code.android.uikit.svga.SVGAView;
import com.opensource.svgaplayer.OooO0OO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import o0OO0O0.OooOO0;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f60764OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f60765OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f60766OooO0OO;

    public static final class OooO00o implements o0OO0O0.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f60767OooO00o;

        public OooO00o(Function0<Unit> function0) {
            this.f60767OooO00o = function0;
        }

        @Override // o0OO0O0.OooO0OO
        public final void OooO00o() {
        }

        @Override // o0OO0O0.OooO0OO
        public final void OooO0O0() {
            this.f60767OooO00o.invoke();
        }

        @Override // o0OO0O0.OooO0OO
        public final void OooO0OO(int i) {
        }

        @Override // o0OO0O0.OooO0OO
        public final void onPause() {
        }
    }

    public o0oOO(OooOO0 oooOO1, SVGAView sVGAView, o00OOOO0 o00oooo1) {
        this.f60764OooO00o = oooOO1;
        this.f60765OooO0O0 = sVGAView;
        this.f60766OooO0OO = o00oooo1;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull oo000o videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        OooO oooO = new OooO(videoItem, this.f60764OooO00o);
        SVGAView sVGAView = this.f60765OooO0O0;
        sVGAView.setImageDrawable(oooO);
        sVGAView.setLoops(1);
        sVGAView.OooO0Oo();
        sVGAView.setCallback(new OooO00o(this.f60766OooO0OO));
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
    }
}
