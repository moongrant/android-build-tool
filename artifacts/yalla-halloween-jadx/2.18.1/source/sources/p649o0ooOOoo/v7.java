package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.view.RadiusCardView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class v7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RadiusCardView f50782OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f50783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ie f50784OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final BaseWebView f50785OooO0Oo;

    public v7(@NonNull RadiusCardView radiusCardView, @NonNull SVGAView sVGAView, @NonNull ie ieVar, @NonNull BaseWebView baseWebView) {
        this.f50782OooO00o = radiusCardView;
        this.f50783OooO0O0 = sVGAView;
        this.f50784OooO0OO = ieVar;
        this.f50785OooO0Oo = baseWebView;
    }

    @NonNull
    public static v7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50782OooO00o;
    }

    @NonNull
    public static v7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_gift_blind_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.svgaLoading;
        SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaLoading);
        if (sVGAView != null) {
            i = R.id.vError;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vError);
            if (viewOooO00o != null) {
                ie ieVarOooO00o = ie.OooO00o(viewOooO00o);
                BaseWebView baseWebView = (BaseWebView) o00Oo0.OooO00o(viewInflate, R.id.webView);
                if (baseWebView != null) {
                    return new v7((RadiusCardView) viewInflate, sVGAView, ieVarOooO00o, baseWebView);
                }
                i = R.id.webView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
