package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class eb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f57860OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f57861OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f57862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57863OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57864OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57865OooO0oO;

    public eb(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3) {
        this.f57859OooO00o = frameLayout;
        this.f57860OooO0O0 = appCompatImageView;
        this.f57861OooO0OO = appCompatImageView2;
        this.f57862OooO0Oo = appCompatImageView3;
        this.f57864OooO0o0 = linearLayoutCompat;
        this.f57863OooO0o = linearLayoutCompat2;
        this.f57865OooO0oO = linearLayoutCompat3;
    }

    @NonNull
    public static eb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57859OooO00o;
    }

    @NonNull
    public static eb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_popup_window_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivDefault;
        AppCompatImageView appCompatImageView = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
        if (appCompatImageView != null) {
            i = oO00O0oO.ivLevel;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
            if (appCompatImageView2 != null) {
                i = oO00O0oO.ivTime;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
                if (appCompatImageView3 != null) {
                    i = oO00O0oO.llDefault;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayoutCompat != null) {
                        i = oO00O0oO.llLevel;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                        if (linearLayoutCompat2 != null) {
                            i = oO00O0oO.llTime;
                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                            if (linearLayoutCompat3 != null) {
                                return new eb((FrameLayout) viewInflate, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
