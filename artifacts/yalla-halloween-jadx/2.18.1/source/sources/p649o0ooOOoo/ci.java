package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ci implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49111OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final SVGAView f49115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49116OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49117OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49118OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49119OooO0oo;

    public ci(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull SVGAView sVGAView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.f49112OooO00o = frameLayout;
        this.f49113OooO0O0 = appCompatImageView;
        this.f49114OooO0OO = appCompatImageView2;
        this.f49115OooO0Oo = sVGAView;
        this.f49117OooO0o0 = appCompatTextView;
        this.f49116OooO0o = appCompatTextView2;
        this.f49118OooO0oO = appCompatTextView3;
        this.f49119OooO0oo = appCompatTextView4;
        this.f49111OooO = appCompatTextView5;
    }

    @NonNull
    public static ci inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49112OooO00o;
    }

    @NonNull
    public static ci inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_dialog_honor_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flBadge;
        if (((FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flBadge)) != null) {
            i = R.id.ivBadge;
            AppCompatImageView appCompatImageView = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBadge);
            if (appCompatImageView != null) {
                i = R.id.ivBadgeBg;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBadgeBg);
                if (appCompatImageView2 != null) {
                    i = R.id.sdvMedal;
                    SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.sdvMedal);
                    if (sVGAView != null) {
                        i = R.id.tvBadgeConfirm;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeConfirm);
                        if (appCompatTextView != null) {
                            i = R.id.tvBadgeContent;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeContent);
                            if (appCompatTextView2 != null) {
                                i = R.id.tvBadgeName;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeName);
                                if (appCompatTextView3 != null) {
                                    i = R.id.tvBadgeNum;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeNum);
                                    if (appCompatTextView4 != null) {
                                        i = R.id.tvBadgeTime;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeTime);
                                        if (appCompatTextView5 != null) {
                                            return new ci((FrameLayout) viewInflate, appCompatImageView, appCompatImageView2, sVGAView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
