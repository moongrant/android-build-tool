package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.RadiusCardView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f59495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final a7 f59497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final BaseWebView f59498OooO0o0;

    public z8(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull a7 a7Var, @NonNull BaseWebView baseWebView) {
        this.f59494OooO00o = constraintLayout;
        this.f59495OooO0O0 = view;
        this.f59496OooO0OO = sVGAView;
        this.f59497OooO0Oo = a7Var;
        this.f59498OooO0o0 = baseWebView;
    }

    @NonNull
    public static z8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59494OooO00o;
    }

    @NonNull
    public static z8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_gift_layout_show_select_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomView;
        View viewOooO00o2 = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o2 != null) {
            i = oO00O0oO.cardView;
            if (((RadiusCardView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.svgaLoading;
                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                if (sVGAView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vError), viewInflate)) != null) {
                    a7 a7VarOooO00o = a7.OooO00o(viewOooO00o);
                    i = oO00O0oO.webView;
                    BaseWebView baseWebView = (BaseWebView) OooOO0.OooO00o(i, viewInflate);
                    if (baseWebView != null) {
                        return new z8((ConstraintLayout) viewInflate, viewOooO00o2, sVGAView, a7VarOooO00o, baseWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
