package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class k4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f58248OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f58249OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f58250OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f58251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58252OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f58253OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f58254OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ViewStub f58255OooO0oo;

    public k4(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed, @NonNull ViewStub viewStub) {
        this.f58248OooO00o = coordinatorLayout;
        this.f58249OooO0O0 = appBarLayout;
        this.f58250OooO0OO = collapsingToolbarLayout;
        this.f58251OooO0Oo = composeView;
        this.f58253OooO0o0 = composeView2;
        this.f58252OooO0o = ylTableLayout;
        this.f58254OooO0oO = viewPagerFixed;
        this.f58255OooO0oo = viewStub;
    }

    @NonNull
    public static k4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58248OooO00o;
    }

    @NonNull
    public static k4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_fragment_room_related, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.abl_related;
        AppBarLayout appBarLayout = (AppBarLayout) OooOO0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = oO00O0oO.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate);
            if (collapsingToolbarLayout != null) {
                i = oO00O0oO.cvIndicator;
                ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = oO00O0oO.myRoomCV;
                    ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = oO00O0oO.related_magicIndicator;
                        YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                        if (ylTableLayout != null) {
                            i = oO00O0oO.vpRoomRelated;
                            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooOO0.OooO00o(i, viewInflate);
                            if (viewPagerFixed != null) {
                                i = oO00O0oO.vs_main_related_tips_bubble;
                                ViewStub viewStub = (ViewStub) OooOO0.OooO00o(i, viewInflate);
                                if (viewStub != null) {
                                    return new k4((CoordinatorLayout) viewInflate, appBarLayout, collapsingToolbarLayout, composeView, composeView2, ylTableLayout, viewPagerFixed, viewStub);
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
