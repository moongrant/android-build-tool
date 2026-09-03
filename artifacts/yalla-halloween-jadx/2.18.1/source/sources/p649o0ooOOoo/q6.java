package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class q6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50340OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50341OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50342OooO0oO;

    public q6(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50336OooO00o = linearLayout;
        this.f50337OooO0O0 = frameLayout;
        this.f50338OooO0OO = imageView;
        this.f50339OooO0Oo = linearLayout2;
        this.f50341OooO0o0 = linearLayout3;
        this.f50340OooO0o = textView;
        this.f50342OooO0oO = textView2;
    }

    @NonNull
    public static q6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50336OooO00o;
    }

    @NonNull
    public static q6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_phone_bind, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flChangePwd;
        FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flChangePwd);
        if (frameLayout != null) {
            i = R.id.ivChangePwd;
            if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivChangePwd)) != null) {
                i = R.id.ivPhone;
                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPhone)) != null) {
                    i = R.id.ivPhoneBg;
                    ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPhoneBg);
                    if (imageView != null) {
                        i = R.id.llBindNum;
                        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llBindNum);
                        if (linearLayout != null) {
                            i = R.id.llChangePwd;
                            LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llChangePwd);
                            if (linearLayout2 != null) {
                                i = R.id.tvDescContent1;
                                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDescContent1)) != null) {
                                    i = R.id.tvDescContent2;
                                    if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDescContent2)) != null) {
                                        i = R.id.tvDescContent3;
                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDescContent3)) != null) {
                                            i = R.id.tvDescTitle;
                                            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDescTitle)) != null) {
                                                i = R.id.tvPhone;
                                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvPhone);
                                                if (textView != null) {
                                                    i = R.id.tvTitle;
                                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                                                    if (textView2 != null) {
                                                        return new q6((LinearLayout) viewInflate, frameLayout, imageView, linearLayout, linearLayout2, textView, textView2);
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
