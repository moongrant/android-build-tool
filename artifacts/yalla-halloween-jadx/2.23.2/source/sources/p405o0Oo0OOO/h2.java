package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.code.android.uikit.svga.SVGAView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43907OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43908OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f43909OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f43910OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final SVGAView f43911OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43912OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43913OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43914OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43915OooO0oo;

    public h2(@NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull SVGAView sVGAView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5) {
        this.f43908OooO00o = frameLayout;
        this.f43909OooO0O0 = appCompatImageView;
        this.f43910OooO0OO = appCompatImageView2;
        this.f43911OooO0Oo = sVGAView;
        this.f43913OooO0o0 = appCompatTextView;
        this.f43912OooO0o = appCompatTextView2;
        this.f43914OooO0oO = appCompatTextView3;
        this.f43915OooO0oo = appCompatTextView4;
        this.f43907OooO = appCompatTextView5;
    }

    @NonNull
    public static h2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43908OooO00o;
    }

    @NonNull
    public static h2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_dialog_honor_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flBadge;
        if (((FrameLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivBadge;
            AppCompatImageView appCompatImageView = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
            if (appCompatImageView != null) {
                i = o0OO00O.ivBadgeBg;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatImageView2 != null) {
                    i = o0OO00O.sdvMedal;
                    SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                    if (sVGAView != null) {
                        i = o0OO00O.tvBadgeConfirm;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                        if (appCompatTextView != null) {
                            i = o0OO00O.tvBadgeContent;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                            if (appCompatTextView2 != null) {
                                i = o0OO00O.tvBadgeName;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                if (appCompatTextView3 != null) {
                                    i = o0OO00O.tvBadgeNum;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (appCompatTextView4 != null) {
                                        i = o0OO00O.tvBadgeTime;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (appCompatTextView5 != null) {
                                            return new h2((FrameLayout) viewInflate, appCompatImageView, appCompatImageView2, sVGAView, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
