package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.RadiusCardView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RadiusCardView f58154OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f58155OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final a7 f58156OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final BaseWebView f58157OooO0Oo;

    public j1(@NonNull RadiusCardView radiusCardView, @NonNull SVGAView sVGAView, @NonNull a7 a7Var, @NonNull BaseWebView baseWebView) {
        this.f58154OooO00o = radiusCardView;
        this.f58155OooO0O0 = sVGAView;
        this.f58156OooO0OO = a7Var;
        this.f58157OooO0Oo = baseWebView;
    }

    @NonNull
    public static j1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58154OooO00o;
    }

    @NonNull
    public static j1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_gift_blind_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.svgaLoading;
        SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
        if (sVGAView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vError), viewInflate)) != null) {
            a7 a7VarOooO00o = a7.OooO00o(viewOooO00o);
            int i2 = oO00O0oO.webView;
            BaseWebView baseWebView = (BaseWebView) OooOO0.OooO00o(i2, viewInflate);
            if (baseWebView != null) {
                return new j1((RadiusCardView) viewInflate, sVGAView, a7VarOooO00o, baseWebView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
