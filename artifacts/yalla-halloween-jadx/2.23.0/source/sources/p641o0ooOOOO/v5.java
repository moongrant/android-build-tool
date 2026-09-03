package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.moment.MomentDetailListTitleView;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class v5 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f59047OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f59048OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f59049OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f59050OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f59051OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59052OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f59053OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f59054OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final MomentDetailListTitleView f59055OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f59056OooOO0;

    public v5(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull MomentDetailListTitleView momentDetailListTitleView, @NonNull RefreshLayout refreshLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f59048OooO00o = frameLayout;
        this.f59049OooO0O0 = appBarLayout;
        this.f59050OooO0OO = composeView;
        this.f59051OooO0Oo = composeView2;
        this.f59053OooO0o0 = view;
        this.f59052OooO0o = linearLayout;
        this.f59054OooO0oO = collapsingToolbarLayout;
        this.f59055OooO0oo = momentDetailListTitleView;
        this.f59047OooO = refreshLayout;
        this.f59056OooOO0 = viewPagerFixed;
    }

    @NonNull
    public static v5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59048OooO00o;
    }

    @NonNull
    public static v5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_activity_moment_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooOO0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = oO00O0oO.bottomComposeView;
            ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
            if (composeView != null) {
                i = oO00O0oO.composeViewDetail;
                ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                if (composeView2 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.composeViewToolBar), viewInflate)) != null) {
                    i = oO00O0oO.contentLayout;
                    LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        i = oO00O0oO.ctl;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate);
                        if (collapsingToolbarLayout != null) {
                            i = oO00O0oO.postDetailListTitleView;
                            MomentDetailListTitleView momentDetailListTitleView = (MomentDetailListTitleView) OooOO0.OooO00o(i, viewInflate);
                            if (momentDetailListTitleView != null) {
                                i = oO00O0oO.refreshLayout;
                                RefreshLayout refreshLayout = (RefreshLayout) OooOO0.OooO00o(i, viewInflate);
                                if (refreshLayout != null) {
                                    i = oO00O0oO.viewPager;
                                    ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooOO0.OooO00o(i, viewInflate);
                                    if (viewPagerFixed != null) {
                                        return new v5((FrameLayout) viewInflate, appBarLayout, composeView, composeView2, viewOooO00o, linearLayout, collapsingToolbarLayout, momentDetailListTitleView, refreshLayout, viewPagerFixed);
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
