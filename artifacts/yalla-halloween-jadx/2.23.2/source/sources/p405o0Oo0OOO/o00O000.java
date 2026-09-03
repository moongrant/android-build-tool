package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class o00O000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44258OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44259OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44260OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44261OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44262OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44263OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44264OooO0oO;

    public o00O000(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f44258OooO00o = linearLayout;
        this.f44259OooO0O0 = frameLayout;
        this.f44260OooO0OO = imageView;
        this.f44261OooO0Oo = linearLayout2;
        this.f44263OooO0o0 = linearLayout3;
        this.f44262OooO0o = textView;
        this.f44264OooO0oO = textView2;
    }

    @NonNull
    public static o00O000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44258OooO00o;
    }

    @NonNull
    public static o00O000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_phone_bind, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flChangePwd;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0OO00O.ivChangePwd;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.ivPhone;
                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.ivPhoneBg;
                    ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView != null) {
                        i = o0OO00O.llBindNum;
                        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayout != null) {
                            i = o0OO00O.llChangePwd;
                            LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayout2 != null) {
                                i = o0OO00O.tvDescContent1;
                                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0OO00O.tvDescContent2;
                                    if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        i = o0OO00O.tvDescContent3;
                                        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                            i = o0OO00O.tvDescTitle;
                                            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                                i = o0OO00O.tvPhone;
                                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    i = o0OO00O.tvTitle;
                                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView2 != null) {
                                                        return new o00O000((LinearLayout) viewInflate, frameLayout, imageView, linearLayout, linearLayout2, textView, textView2);
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
