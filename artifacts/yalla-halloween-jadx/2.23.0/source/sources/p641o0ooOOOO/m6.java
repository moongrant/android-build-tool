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
public final class m6 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f58409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f58410OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f58411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58412OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f58413OooO0o0;

    public m6(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ImageView imageView) {
        this.f58408OooO00o = frameLayout;
        this.f58409OooO0O0 = appBarLayout;
        this.f58410OooO0OO = composeView;
        this.f58411OooO0Oo = composeView2;
        this.f58413OooO0o0 = collapsingToolbarLayout;
        this.f58412OooO0o = imageView;
    }

    @NonNull
    public static m6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58408OooO00o;
    }

    @NonNull
    public static m6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_fragment_featured, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooOO0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = oO00O0oO.clTopics;
            if (((CoordinatorLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.composeViewContent;
                ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = oO00O0oO.composeViewToolBar;
                    ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = oO00O0oO.ctl;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate);
                        if (collapsingToolbarLayout != null) {
                            i = oO00O0oO.ivTopShadow;
                            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView != null) {
                                return new m6((FrameLayout) viewInflate, appBarLayout, composeView, composeView2, collapsingToolbarLayout, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
