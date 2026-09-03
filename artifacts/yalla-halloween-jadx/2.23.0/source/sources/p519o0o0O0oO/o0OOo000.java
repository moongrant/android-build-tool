package p519o0o0O0oO;

import android.view.View;
import android.widget.ScrollView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o f52763OooO0oO;

    public o0OOo000(o oVar) {
        this.f52763OooO0oO = oVar;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o oVar = this.f52763OooO0oO;
        SVGAView sVGAView = oVar.OooOO0().f58871OooO0O0;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
        o000OO00.OooOOOO(sVGAView);
        oVar.OooOO0().f58871OooO0O0.OooO0Oo();
        ScrollView scrollView = oVar.OooOO0().f58872OooO0OO.f57486OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        o000OO00.OooO0O0(scrollView);
        oVar.OooOO0().f58873OooO0Oo.reload();
    }
}
