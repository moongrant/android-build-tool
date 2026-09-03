package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44106OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f44107OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44108OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final BaseWebView f44110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final oOOO0OO0 f44111OooO0o0;

    public l0(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull oOOO0OO0 oooo0oo0, @NonNull BaseWebView baseWebView) {
        this.f44106OooO00o = constraintLayout;
        this.f44107OooO0O0 = view;
        this.f44108OooO0OO = sVGAView;
        this.f44109OooO0Oo = textView;
        this.f44111OooO0o0 = oooo0oo0;
        this.f44110OooO0o = baseWebView;
    }

    @NonNull
    public static l0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44106OooO00o;
    }

    @NonNull
    public static l0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_gift_custom_made_web_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottomView;
        View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o2 != null) {
            i = o0OO00O.svgaLoading;
            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
            if (sVGAView != null) {
                i = o0OO00O.tv_saving;
                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vError), viewInflate)) != null) {
                    oOOO0OO0 oooo0oo0OooO00o = oOOO0OO0.OooO00o(viewOooO00o);
                    i = o0OO00O.webView;
                    BaseWebView baseWebView = (BaseWebView) OooO0O0.OooO00o(i, viewInflate);
                    if (baseWebView != null) {
                        return new l0((ConstraintLayout) viewInflate, viewOooO00o2, sVGAView, textView, oooo0oo0OooO00o, baseWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
