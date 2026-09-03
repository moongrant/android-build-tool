package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class x8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f59335OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59336OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final BaseWebView f59338OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final a7 f59339OooO0o0;

    public x8(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull a7 a7Var, @NonNull BaseWebView baseWebView) {
        this.f59334OooO00o = constraintLayout;
        this.f59335OooO0O0 = view;
        this.f59336OooO0OO = sVGAView;
        this.f59337OooO0Oo = textView;
        this.f59339OooO0o0 = a7Var;
        this.f59338OooO0o = baseWebView;
    }

    @NonNull
    public static x8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59334OooO00o;
    }

    @NonNull
    public static x8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_gift_custom_made_web_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomView;
        View viewOooO00o2 = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o2 != null) {
            i = oO00O0oO.svgaLoading;
            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                i = oO00O0oO.tv_saving;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vError), viewInflate)) != null) {
                    a7 a7VarOooO00o = a7.OooO00o(viewOooO00o);
                    i = oO00O0oO.webView;
                    BaseWebView baseWebView = (BaseWebView) OooOO0.OooO00o(i, viewInflate);
                    if (baseWebView != null) {
                        return new x8((ConstraintLayout) viewInflate, viewOooO00o2, sVGAView, textView, a7VarOooO00o, baseWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
