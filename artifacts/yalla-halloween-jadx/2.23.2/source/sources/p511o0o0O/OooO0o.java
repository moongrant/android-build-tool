package p511o0o0O;

import android.view.View;
import android.widget.ScrollView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p405o0Oo0OOO.l0;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f50909OooO0oO;

    public OooO0o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        this.f50909OooO0oO = giftCustomMadeWebManager;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50909OooO0oO;
        SVGAView svgaLoading = giftCustomMadeWebManager.f27526OooO0OO.f44108OooO0OO;
        Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
        o000O.OooOOOO(svgaLoading);
        l0 l0Var = giftCustomMadeWebManager.f27526OooO0OO;
        l0Var.f44108OooO0OO.OooO0Oo();
        ScrollView scrollView = l0Var.f44111OooO0o0.f45166OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "getRoot(...)");
        o000O.OooO0O0(scrollView);
        l0Var.f44110OooO0o.reload();
    }
}
