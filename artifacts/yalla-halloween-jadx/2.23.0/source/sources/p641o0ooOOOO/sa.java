package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.code.android.uikit.svga.SVGAView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class sa implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58813OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58814OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58815OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58816OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final SVGAView f58817OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58818OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58819OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58820OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58821OooO0oo;

    public sa(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull SVGAView sVGAView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.f58814OooO00o = frameLayout;
        this.f58815OooO0O0 = appCompatImageView;
        this.f58816OooO0OO = appCompatImageView2;
        this.f58817OooO0Oo = sVGAView;
        this.f58819OooO0o0 = appCompatTextView;
        this.f58818OooO0o = appCompatTextView2;
        this.f58820OooO0oO = appCompatTextView3;
        this.f58821OooO0oo = appCompatTextView4;
        this.f58813OooO = appCompatTextView5;
    }

    @NonNull
    public static sa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58814OooO00o;
    }

    @NonNull
    public static sa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_dialog_honor_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flBadge;
        if (((FrameLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ivBadge;
            AppCompatImageView appCompatImageView = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
            if (appCompatImageView != null) {
                i = oO00O0oO.ivBadgeBg;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
                if (appCompatImageView2 != null) {
                    i = oO00O0oO.sdvMedal;
                    SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                    if (sVGAView != null) {
                        i = oO00O0oO.tvBadgeConfirm;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                        if (appCompatTextView != null) {
                            i = oO00O0oO.tvBadgeContent;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                            if (appCompatTextView2 != null) {
                                i = oO00O0oO.tvBadgeName;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                if (appCompatTextView3 != null) {
                                    i = oO00O0oO.tvBadgeNum;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                    if (appCompatTextView4 != null) {
                                        i = oO00O0oO.tvBadgeTime;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                        if (appCompatTextView5 != null) {
                                            return new sa((FrameLayout) viewInflate, appCompatImageView, appCompatImageView2, sVGAView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
