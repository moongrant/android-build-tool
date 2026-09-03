package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class df implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49190OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final SVGAView f49191OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ie f49192OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final BaseWebView f49193OooO0Oo;

    public df(@NonNull ConstraintLayout constraintLayout, @NonNull SVGAView sVGAView, @NonNull ie ieVar, @NonNull BaseWebView baseWebView) {
        this.f49190OooO00o = constraintLayout;
        this.f49191OooO0O0 = sVGAView;
        this.f49192OooO0OO = ieVar;
        this.f49193OooO0Oo = baseWebView;
    }

    @NonNull
    public static df inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49190OooO00o;
    }

    @NonNull
    public static df inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_fruit_game, viewGroup, false);
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
                    return new df((ConstraintLayout) viewInflate, sVGAView, ieVarOooO00o, baseWebView);
                }
                i = R.id.webView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
