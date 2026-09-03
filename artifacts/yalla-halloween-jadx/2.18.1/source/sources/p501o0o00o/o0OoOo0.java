package p501o0o00o;

import android.view.View;
import android.widget.ScrollView;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.oOO00O;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41527Oooo;

    public o0OoOo0(GiftBlindWebManager giftBlindWebManager) {
        this.f41527Oooo = giftBlindWebManager;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SVGAView sVGAView = this.f41527Oooo.f20888OooO0OO.f49624OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
        oOO00O.OooO(sVGAView);
        this.f41527Oooo.f20888OooO0OO.f49624OooO0OO.OooO0OO();
        ScrollView scrollView = this.f41527Oooo.f20888OooO0OO.f49625OooO0Oo.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.vError.root");
        oOO00O.OooO00o(scrollView);
        this.f41527Oooo.f20888OooO0OO.f49626OooO0o0.reload();
    }
}
