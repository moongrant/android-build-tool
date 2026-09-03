package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class da implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49160OooO0OO;

    public da(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f49158OooO00o = linearLayout;
        this.f49159OooO0O0 = imageView;
        this.f49160OooO0OO = textView;
    }

    @NonNull
    public static da inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49158OooO00o;
    }

    @NonNull
    public static da inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_about, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.includeCheckVersion;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.includeCheckVersion);
        if (viewOooO00o != null) {
            i9.OooO00o(viewOooO00o);
            i = R.id.includePrivacyPolicy;
            View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.includePrivacyPolicy);
            if (viewOooO00o2 != null) {
                i9.OooO00o(viewOooO00o2);
                i = R.id.includeTermsOfService;
                View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.includeTermsOfService);
                if (viewOooO00o3 != null) {
                    i9.OooO00o(viewOooO00o3);
                    i = R.id.ivLogo;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLogo);
                    if (imageView != null) {
                        i = R.id.layout;
                        if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layout)) != null) {
                            i = R.id.versionName;
                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.versionName);
                            if (textView != null) {
                                return new da((LinearLayout) viewInflate, imageView, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
