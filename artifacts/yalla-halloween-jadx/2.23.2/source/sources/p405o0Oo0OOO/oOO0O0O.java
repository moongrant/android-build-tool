package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f45095OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f45096OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f45097OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f45098OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f45099OooO0o0;

    public oOO0O0O(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull ComposeView composeView3, @NonNull CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f45094OooO00o = frameLayout;
        this.f45095OooO0O0 = appBarLayout;
        this.f45096OooO0OO = composeView;
        this.f45097OooO0Oo = composeView2;
        this.f45099OooO0o0 = composeView3;
        this.f45098OooO0o = collapsingToolbarLayout;
    }

    @NonNull
    public static oOO0O0O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45094OooO00o;
    }

    @NonNull
    public static oOO0O0O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_fragment_following, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooO0O0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = o0OO00O.clTopics;
            if (((CoordinatorLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.composeViewContent;
                ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = o0OO00O.composeViewToolBar;
                    ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = o0OO00O.composeViewTopBg;
                        ComposeView composeView3 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                        if (composeView3 != null) {
                            i = o0OO00O.ctl;
                            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (collapsingToolbarLayout != null) {
                                return new oOO0O0O((FrameLayout) viewInflate, appBarLayout, composeView, composeView2, composeView3, collapsingToolbarLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
