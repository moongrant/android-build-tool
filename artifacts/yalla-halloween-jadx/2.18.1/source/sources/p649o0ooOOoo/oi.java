package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50216OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f50217OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f50218OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f50219OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50220OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50221OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50222OooO0oO;

    public oi(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.f50216OooO00o = frameLayout;
        this.f50217OooO0O0 = appCompatImageView;
        this.f50218OooO0OO = appCompatImageView2;
        this.f50219OooO0Oo = appCompatImageView3;
        this.f50221OooO0o0 = linearLayoutCompat;
        this.f50220OooO0o = linearLayoutCompat2;
        this.f50222OooO0oO = linearLayoutCompat3;
    }

    @NonNull
    public static oi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50216OooO00o;
    }

    @NonNull
    public static oi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_popup_window_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivDefault;
        AppCompatImageView appCompatImageView = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDefault);
        if (appCompatImageView != null) {
            i = R.id.ivLevel;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivLevel);
            if (appCompatImageView2 != null) {
                i = R.id.ivTime;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTime);
                if (appCompatImageView3 != null) {
                    i = R.id.llDefault;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llDefault);
                    if (linearLayoutCompat != null) {
                        i = R.id.llLevel;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llLevel);
                        if (linearLayoutCompat2 != null) {
                            i = R.id.llTime;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.llTime);
                            if (linearLayoutCompat3 != null) {
                                return new oi((FrameLayout) viewInflate, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
