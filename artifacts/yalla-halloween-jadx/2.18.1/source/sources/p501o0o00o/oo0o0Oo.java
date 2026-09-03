package p501o0o00o;

import android.view.View;
import android.widget.ScrollView;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.oOO00O;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f41535Oooo;

    public oo0o0Oo(GiftCustomMadeWebManager giftCustomMadeWebManager) {
        this.f41535Oooo = giftCustomMadeWebManager;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SVGAView sVGAView = this.f41535Oooo.f20894OooO0OO.f49677OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
        oOO00O.OooO(sVGAView);
        this.f41535Oooo.f20894OooO0OO.f49677OooO0OO.OooO0OO();
        ScrollView scrollView = this.f41535Oooo.f20894OooO0OO.f49680OooO0o0.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        oOO00O.OooO00o(scrollView);
        this.f41535Oooo.f20894OooO0OO.f49679OooO0o.reload();
    }
}
