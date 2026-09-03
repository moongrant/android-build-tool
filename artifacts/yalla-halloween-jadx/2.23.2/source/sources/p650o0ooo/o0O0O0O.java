package p650o0ooo;

import android.view.View;
import android.widget.ScrollView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0OO0 f58644OooO0oO;

    public o0O0O0O(o0O0OO0 o0o0oo0) {
        this.f58644OooO0oO = o0o0oo0;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0O0OO0 o0o0oo0 = this.f58644OooO0oO;
        SVGAView svgaLoading = o0o0oo0.OooOO0().f43867OooO0O0;
        Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
        o000O.OooOOOO(svgaLoading);
        o0o0oo0.OooOO0().f43867OooO0O0.OooO0Oo();
        ScrollView scrollView = o0o0oo0.OooOO0().f43868OooO0OO.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooO0O0(scrollView);
        o0o0oo0.OooOO0().f43869OooO0Oo.reload();
    }
}
