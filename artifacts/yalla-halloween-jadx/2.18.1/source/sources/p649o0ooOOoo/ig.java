package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ig implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49675OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f49676OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final SVGAView f49677OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49678OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final BaseWebView f49679OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ie f49680OooO0o0;

    public ig(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull ie ieVar, @NonNull BaseWebView baseWebView) {
        this.f49675OooO00o = constraintLayout;
        this.f49676OooO0O0 = view;
        this.f49677OooO0OO = sVGAView;
        this.f49678OooO0Oo = textView;
        this.f49680OooO0o0 = ieVar;
        this.f49679OooO0o = baseWebView;
    }

    @NonNull
    public static ig inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49675OooO00o;
    }

    @NonNull
    public static ig inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_gift_custom_made_web_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bottomView;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.bottomView);
        if (viewOooO00o != null) {
            i = R.id.svgaLoading;
            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaLoading);
            if (sVGAView != null) {
                i = R.id.tv_saving;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_saving);
                if (textView != null) {
                    i = R.id.vError;
                    View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.vError);
                    if (viewOooO00o2 != null) {
                        ie ieVarOooO00o = ie.OooO00o(viewOooO00o2);
                        i = R.id.webView;
                        BaseWebView baseWebView = (BaseWebView) o00Oo0.OooO00o(viewInflate, R.id.webView);
                        if (baseWebView != null) {
                            return new ig((ConstraintLayout) viewInflate, viewOooO00o, sVGAView, textView, ieVarOooO00o, baseWebView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
