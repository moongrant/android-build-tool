package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44200OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44201OooO0OO;

    public o(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f44199OooO00o = linearLayout;
        this.f44200OooO0O0 = imageView;
        this.f44201OooO0OO = textView;
    }

    @NonNull
    public static o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44199OooO00o;
    }

    @NonNull
    public static o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_about, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.includeCheckVersion;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            oo0oO0.OooO00o(viewOooO00o);
            i = o0OO00O.includePrivacyPolicy;
            View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
            if (viewOooO00o2 != null) {
                oo0oO0.OooO00o(viewOooO00o2);
                i = o0OO00O.includeTermsOfService;
                View viewOooO00o3 = OooO0O0.OooO00o(i, viewInflate);
                if (viewOooO00o3 != null) {
                    oo0oO0.OooO00o(viewOooO00o3);
                    i = o0OO00O.ivLogo;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = o0OO00O.layout;
                        if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.versionName;
                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView != null) {
                                return new o((LinearLayout) viewInflate, imageView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
