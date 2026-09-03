package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f45101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f45102OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f45103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f45104OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f45105OooO0o0;

    public oOO0O0O0(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ImageView imageView) {
        this.f45100OooO00o = frameLayout;
        this.f45101OooO0O0 = appBarLayout;
        this.f45102OooO0OO = composeView;
        this.f45103OooO0Oo = composeView2;
        this.f45105OooO0o0 = collapsingToolbarLayout;
        this.f45104OooO0o = imageView;
    }

    @NonNull
    public static oOO0O0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45100OooO00o;
    }

    @NonNull
    public static oOO0O0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_fragment_featured, viewGroup, false);
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
                        i = o0OO00O.ctl;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (collapsingToolbarLayout != null) {
                            i = o0OO00O.ivTopShadow;
                            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView != null) {
                                return new oOO0O0O0((FrameLayout) viewInflate, appBarLayout, composeView, composeView2, collapsingToolbarLayout, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
