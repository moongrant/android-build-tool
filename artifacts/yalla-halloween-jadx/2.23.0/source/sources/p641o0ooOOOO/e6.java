package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class e6 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Toolbar f57819OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f57821OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f57822OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f57823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final j0 f57824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f57825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final s2 f57826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57827OooO0oo;

    public e6(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull j0 j0Var, @NonNull s2 s2Var, @NonNull ImageView imageView, @NonNull Toolbar toolbar) {
        this.f57820OooO00o = frameLayout;
        this.f57821OooO0O0 = appBarLayout;
        this.f57822OooO0OO = coordinatorLayout;
        this.f57823OooO0Oo = composeView;
        this.f57825OooO0o0 = composeView2;
        this.f57824OooO0o = j0Var;
        this.f57826OooO0oO = s2Var;
        this.f57827OooO0oo = imageView;
        this.f57819OooO = toolbar;
    }

    @NonNull
    public static e6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57820OooO00o;
    }

    @NonNull
    public static e6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_activity_topic_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooOO0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = oO00O0oO.clTopics;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) OooOO0.OooO00o(i, viewInflate);
            if (coordinatorLayout != null) {
                i = oO00O0oO.composeView;
                ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = oO00O0oO.composeViewTabLayout;
                    ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                    if (composeView2 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.emptyLayout), viewInflate)) != null) {
                        j0 j0VarOooO00o = j0.OooO00o(viewOooO00o);
                        i = oO00O0oO.head;
                        View viewOooO00o2 = OooOO0.OooO00o(i, viewInflate);
                        if (viewOooO00o2 != null) {
                            s2 s2VarOooO00o = s2.OooO00o(viewOooO00o2);
                            i = oO00O0oO.ivCreate;
                            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView != null) {
                                i = oO00O0oO.toolbarHolder;
                                Toolbar toolbar = (Toolbar) OooOO0.OooO00o(i, viewInflate);
                                if (toolbar != null) {
                                    return new e6((FrameLayout) viewInflate, appBarLayout, coordinatorLayout, composeView, composeView2, j0VarOooO00o, s2VarOooO00o, imageView, toolbar);
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
