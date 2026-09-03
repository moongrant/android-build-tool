package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.RadiusCardView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44180OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f44181OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44182OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final oOOO0OO0 f44183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final BaseWebView f44184OooO0o0;

    public n0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull oOOO0OO0 oooo0oo0, @NonNull BaseWebView baseWebView) {
        this.f44180OooO00o = constraintLayout;
        this.f44181OooO0O0 = view;
        this.f44182OooO0OO = sVGAView;
        this.f44183OooO0Oo = oooo0oo0;
        this.f44184OooO0o0 = baseWebView;
    }

    @NonNull
    public static n0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44180OooO00o;
    }

    @NonNull
    public static n0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_gift_layout_show_select_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottomView;
        View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o2 != null) {
            i = o0OO00O.cardView;
            if (((RadiusCardView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.svgaLoading;
                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                if (sVGAView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vError), viewInflate)) != null) {
                    oOOO0OO0 oooo0oo0OooO00o = oOOO0OO0.OooO00o(viewOooO00o);
                    i = o0OO00O.webView;
                    BaseWebView baseWebView = (BaseWebView) OooO0O0.OooO00o(i, viewInflate);
                    if (baseWebView != null) {
                        return new n0((ConstraintLayout) viewInflate, viewOooO00o2, sVGAView, oooo0oo0OooO00o, baseWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
