package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.RadiusCardView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RadiusCardView f44683OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f44684OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final oOOO0OO0 f44685OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final BaseWebView f44686OooO0Oo;

    public o0oOOo(@NonNull RadiusCardView radiusCardView, @NonNull SVGAView sVGAView, @NonNull oOOO0OO0 oooo0oo0, @NonNull BaseWebView baseWebView) {
        this.f44683OooO00o = radiusCardView;
        this.f44684OooO0O0 = sVGAView;
        this.f44685OooO0OO = oooo0oo0;
        this.f44686OooO0Oo = baseWebView;
    }

    @NonNull
    public static o0oOOo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44683OooO00o;
    }

    @NonNull
    public static o0oOOo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_gift_blind_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.svgaLoading;
        SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
        if (sVGAView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vError), viewInflate)) != null) {
            oOOO0OO0 oooo0oo0OooO00o = oOOO0OO0.OooO00o(viewOooO00o);
            int i2 = o0OO00O.webView;
            BaseWebView baseWebView = (BaseWebView) OooO0O0.OooO00o(i2, viewInflate);
            if (baseWebView != null) {
                return new o0oOOo((RadiusCardView) viewInflate, sVGAView, oooo0oo0OooO00o, baseWebView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
