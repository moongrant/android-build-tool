package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.BaseWebView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class e7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49209OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ie f49210OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49211OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ProgressBar f49212OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final BaseWebView f49213OooO0o0;

    public e7(@NonNull LinearLayout linearLayout, @NonNull ie ieVar, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull BaseWebView baseWebView) {
        this.f49209OooO00o = linearLayout;
        this.f49210OooO0O0 = ieVar;
        this.f49211OooO0OO = imageView;
        this.f49212OooO0Oo = progressBar;
        this.f49213OooO0o0 = baseWebView;
    }

    @NonNull
    public static e7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49209OooO00o;
    }

    @NonNull
    public static e7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_web, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.emptyView;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.emptyView);
        if (viewOooO00o != null) {
            ie ieVarOooO00o = ie.OooO00o(viewOooO00o);
            i = R.id.iv;
            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv)) != null) {
                i = R.id.ivClose;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                if (imageView != null) {
                    i = R.id.pb_web;
                    ProgressBar progressBar = (ProgressBar) o00Oo0.OooO00o(viewInflate, R.id.pb_web);
                    if (progressBar != null) {
                        i = R.id.webView;
                        BaseWebView baseWebView = (BaseWebView) o00Oo0.OooO00o(viewInflate, R.id.webView);
                        if (baseWebView != null) {
                            return new e7((LinearLayout) viewInflate, ieVarOooO00o, imageView, progressBar, baseWebView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
