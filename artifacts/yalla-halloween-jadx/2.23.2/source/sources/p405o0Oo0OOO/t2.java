package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45557OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f45558OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f45559OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f45560OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45561OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45562OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45563OooO0oO;

    public t2(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.f45557OooO00o = frameLayout;
        this.f45558OooO0O0 = appCompatImageView;
        this.f45559OooO0OO = appCompatImageView2;
        this.f45560OooO0Oo = appCompatImageView3;
        this.f45562OooO0o0 = linearLayoutCompat;
        this.f45561OooO0o = linearLayoutCompat2;
        this.f45563OooO0oO = linearLayoutCompat3;
    }

    @NonNull
    public static t2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45557OooO00o;
    }

    @NonNull
    public static t2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_popup_window_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivDefault;
        AppCompatImageView appCompatImageView = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
        if (appCompatImageView != null) {
            i = o0OO00O.ivLevel;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
            if (appCompatImageView2 != null) {
                i = o0OO00O.ivTime;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatImageView3 != null) {
                    i = o0OO00O.llDefault;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayoutCompat != null) {
                        i = o0OO00O.llLevel;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                        if (linearLayoutCompat2 != null) {
                            i = o0OO00O.llTime;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat3 != null) {
                                return new t2((FrameLayout) viewInflate, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
