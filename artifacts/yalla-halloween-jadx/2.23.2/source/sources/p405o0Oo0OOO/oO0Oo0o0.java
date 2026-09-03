package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f44926OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44927OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f44928OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f44929OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f44930OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44931OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f44932OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f44933OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final MomentDetailListTitleView f44934OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f44935OooOO0;

    public oO0Oo0o0(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull MomentDetailListTitleView momentDetailListTitleView, @NonNull RefreshLayout refreshLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f44927OooO00o = frameLayout;
        this.f44928OooO0O0 = appBarLayout;
        this.f44929OooO0OO = composeView;
        this.f44930OooO0Oo = composeView2;
        this.f44932OooO0o0 = view;
        this.f44931OooO0o = linearLayout;
        this.f44933OooO0oO = collapsingToolbarLayout;
        this.f44934OooO0oo = momentDetailListTitleView;
        this.f44926OooO = refreshLayout;
        this.f44935OooOO0 = viewPagerFixed;
    }

    @NonNull
    public static oO0Oo0o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44927OooO00o;
    }

    @NonNull
    public static oO0Oo0o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_activity_moment_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooO0O0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = o0OO00O.bottomComposeView;
            ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
            if (composeView != null) {
                i = o0OO00O.composeViewDetail;
                ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                if (composeView2 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.composeViewToolBar), viewInflate)) != null) {
                    i = o0OO00O.contentLayout;
                    LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (linearLayout != null) {
                        i = o0OO00O.ctl;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (collapsingToolbarLayout != null) {
                            i = o0OO00O.postDetailListTitleView;
                            MomentDetailListTitleView momentDetailListTitleView = (MomentDetailListTitleView) OooO0O0.OooO00o(i, viewInflate);
                            if (momentDetailListTitleView != null) {
                                i = o0OO00O.refreshLayout;
                                RefreshLayout refreshLayout = (RefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (refreshLayout != null) {
                                    i = o0OO00O.viewPager;
                                    ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
                                    if (viewPagerFixed != null) {
                                        return new oO0Oo0o0((FrameLayout) viewInflate, appBarLayout, composeView, composeView2, viewOooO00o, linearLayout, collapsingToolbarLayout, momentDetailListTitleView, refreshLayout, viewPagerFixed);
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
