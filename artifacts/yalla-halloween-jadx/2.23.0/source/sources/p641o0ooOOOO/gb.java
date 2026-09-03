package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class gb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f58007OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f58008OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f58009OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58010OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final s0 f58011OooO0o0;

    public gb(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull s0 s0Var, @NonNull ImageView imageView) {
        this.f58006OooO00o = frameLayout;
        this.f58007OooO0O0 = appBarLayout;
        this.f58008OooO0OO = composeView;
        this.f58009OooO0Oo = composeView2;
        this.f58011OooO0o0 = s0Var;
        this.f58010OooO0o = imageView;
    }

    @NonNull
    public static gb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58006OooO00o;
    }

    @NonNull
    public static gb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_vip_benfit_mall, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooOO0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = oO00O0oO.cl_benefit;
            if (((CoordinatorLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.composeViewContent;
                ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = oO00O0oO.composeViewTopHead;
                    ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = oO00O0oO.ctl;
                        if (((CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            i = oO00O0oO.headerLayout;
                            View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
                            if (viewOooO00o != null) {
                                s0 s0VarOooO00o = s0.OooO00o(viewOooO00o);
                                i = oO00O0oO.ivTopShadow;
                                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView != null) {
                                    return new gb(frameLayout, appBarLayout, composeView, composeView2, s0VarOooO00o, imageView);
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
