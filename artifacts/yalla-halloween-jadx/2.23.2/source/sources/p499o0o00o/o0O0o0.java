package p499o0o00o;

import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000O;
import p590o0oOooo0.c1;
import p650o0ooo.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f49944OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(oo0OOoo oo0oooo) {
        super(1);
        this.f49944OooO0Oo = oo0oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        Intrinsics.checkNotNull(str2);
        oo0OOoo oo0oooo = this.f49944OooO0Oo;
        if (oo0oooo.f50085OooO0O0 == null) {
            o000OO00 o000oo01 = new o000OO00(oo0oooo.f49626OooO00o, o000000O.FullscreenDialog);
            Window window = o000oo01.f58510OooO0oO;
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
                window.setWindowAnimations(o000000O.animation_bottom_in_bottom_out);
            }
            if (window != null) {
                window.setStatusBarColor(ColorKt.m1735toArgb8_81llA(Color.INSTANCE.m1708getBlue0d7_KjU()));
            }
            o000O.OooO0o(oo0oooo.OooO0OO());
            o000oo01.OooO0oO(oo0oooo.OooO0OO());
            o000oo01.OooO0oo(80);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().observe(o000oo01.f58509OooO0o0, new oo0OOoo.OooO00o(new o0O0o000(oo0oooo)));
            oo0oooo.f50085OooO0O0 = o000oo01;
        }
        if (oo0oooo.OooO0OO().getLoadState() != BaseWebView.LoadState.Loading) {
            if (oo0oooo.OooO0OO().getLoadState() == BaseWebView.LoadState.Success) {
                o000OO00 o000oo02 = oo0oooo.f50085OooO0O0;
                if (o000oo02 != null) {
                    o000oo02.OooO();
                }
            } else {
                oo0oooo.OooO0OO().loadUrl(c1.OooO0OO(c1.OooO00o(str2), null));
                oo0oooo.OooO0OO().setLoadStateListener(new o0O0o00O(oo0oooo));
            }
        }
        return Unit.INSTANCE;
    }
}
