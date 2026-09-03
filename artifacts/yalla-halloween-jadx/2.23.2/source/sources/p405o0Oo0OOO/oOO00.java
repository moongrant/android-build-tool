package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final Toolbar f45011OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f45013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f45014OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f45015OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o00O0O00 f45016OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f45017OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final oo0ooO f45018OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45019OooO0oo;

    public oOO00(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull o00O0O00 o00o0o01, @NonNull oo0ooO oo0ooo, @NonNull ImageView imageView, @NonNull Toolbar toolbar) {
        this.f45012OooO00o = frameLayout;
        this.f45013OooO0O0 = appBarLayout;
        this.f45014OooO0OO = coordinatorLayout;
        this.f45015OooO0Oo = composeView;
        this.f45017OooO0o0 = composeView2;
        this.f45016OooO0o = o00o0o01;
        this.f45018OooO0oO = oo0ooo;
        this.f45019OooO0oo = imageView;
        this.f45011OooO = toolbar;
    }

    @NonNull
    public static oOO00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45012OooO00o;
    }

    @NonNull
    public static oOO00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_activity_topic_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) OooO0O0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = o0OO00O.clTopics;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) OooO0O0.OooO00o(i, viewInflate);
            if (coordinatorLayout != null) {
                i = o0OO00O.composeView;
                ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = o0OO00O.composeViewTabLayout;
                    ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                    if (composeView2 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.emptyLayout), viewInflate)) != null) {
                        o00O0O00 o00o0o00OooO00o = o00O0O00.OooO00o(viewOooO00o);
                        i = o0OO00O.head;
                        View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
                        if (viewOooO00o2 != null) {
                            oo0ooO oo0oooOooO00o = oo0ooO.OooO00o(viewOooO00o2);
                            i = o0OO00O.ivCreate;
                            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView != null) {
                                i = o0OO00O.toolbarHolder;
                                Toolbar toolbar = (Toolbar) OooO0O0.OooO00o(i, viewInflate);
                                if (toolbar != null) {
                                    return new oOO00((FrameLayout) viewInflate, appBarLayout, coordinatorLayout, composeView, composeView2, o00o0o00OooO00o, oo0oooOooO00o, imageView, toolbar);
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
