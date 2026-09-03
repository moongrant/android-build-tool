package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57455OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57456OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57457OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57458OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57459OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57460OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f57461OooO0oO;

    public a0(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f57455OooO00o = linearLayout;
        this.f57456OooO0O0 = frameLayout;
        this.f57457OooO0OO = imageView;
        this.f57458OooO0Oo = linearLayout2;
        this.f57460OooO0o0 = linearLayout3;
        this.f57459OooO0o = textView;
        this.f57461OooO0oO = textView2;
    }

    @NonNull
    public static a0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57455OooO00o;
    }

    @NonNull
    public static a0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_phone_bind, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flChangePwd;
        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = oO00O0oO.ivChangePwd;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.ivPhone;
                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.ivPhoneBg;
                    ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = oO00O0oO.llBindNum;
                        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayout != null) {
                            i = oO00O0oO.llChangePwd;
                            LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayout2 != null) {
                                i = oO00O0oO.tvDescContent1;
                                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    i = oO00O0oO.tvDescContent2;
                                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        i = oO00O0oO.tvDescContent3;
                                        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                            i = oO00O0oO.tvDescTitle;
                                            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                                i = oO00O0oO.tvPhone;
                                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    i = oO00O0oO.tvTitle;
                                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView2 != null) {
                                                        return new a0((LinearLayout) viewInflate, frameLayout, imageView, linearLayout, linearLayout2, textView, textView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
