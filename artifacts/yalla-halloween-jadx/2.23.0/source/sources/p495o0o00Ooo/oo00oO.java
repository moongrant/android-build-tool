package p495o0o00Ooo;

import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p519o0o0O0oO.o00O00OO;
import p579o0oOoo.oOo0o00;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f48962OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(o00Oo00 o00oo00) {
        super(1);
        this.f48962OooO0Oo = o00oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        Intrinsics.checkNotNullExpressionValue(url, "url");
        o00Oo00 o00oo00 = this.f48962OooO0Oo;
        if (o00oo00.f48769OooO0O0 == null) {
            o00O00OO o00o00oo2 = new o00O00OO(o00oo00.f48470OooO00o, oO00Oo00.FullscreenDialog);
            Window window = o00o00oo2.f52535OooO0oO;
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.width = -1;
            }
            WindowManager.LayoutParams attributes2 = window != null ? window.getAttributes() : null;
            if (attributes2 != null) {
                attributes2.height = -1;
            }
            if (window != null) {
                window.setAttributes(window.getAttributes());
            }
            if (window != null) {
                window.setWindowAnimations(oO00Oo00.animation_bottom_in_bottom_out);
            }
            if (window != null) {
                window.setStatusBarColor(ColorKt.m1724toArgb8_81llA(Color.INSTANCE.m1697getBlue0d7_KjU()));
            }
            o000OO00.OooO0o(o00oo00.OooO0OO());
            o00o00oo2.OooO0oO(o00oo00.OooO0OO());
            o00o00oo2.OooO0oo(80);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().observe(o00o00oo2.f52534OooO0o0, new o00Oo00.OooO00o(new o0oOO(o00oo00)));
            o00oo00.f48769OooO0O0 = o00o00oo2;
        }
        if (o00oo00.OooO0OO().getLoadState() != BaseWebView.LoadState.Loading) {
            if (o00oo00.OooO0OO().getLoadState() == BaseWebView.LoadState.Success) {
                o00O00OO o00o00oo3 = o00oo00.f48769OooO0O0;
                if (o00o00oo3 != null) {
                    o00o00oo3.OooO();
                }
            } else {
                o00oo00.OooO0OO().loadUrl(oOo0o00.OooO0OO(oOo0o00.OooO00o(url), null));
                o00oo00.OooO0OO().setLoadStateListener(new o0O00o0(o00oo00));
            }
        }
        return Unit.INSTANCE;
    }
}
