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
public final class w2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f45672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f45673OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f45674OooO0Oo;

    public w2(@NonNull FrameLayout frameLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.f45671OooO00o = frameLayout;
        this.f45672OooO0O0 = coordinatorLayout;
        this.f45673OooO0OO = composeView;
        this.f45674OooO0Oo = composeView2;
    }

    @NonNull
    public static w2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45671OooO00o;
    }

    @NonNull
    public static w2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_vip_benfit_mall_record, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.appBarLayout;
        if (((AppBarLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.cl_benefit;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) OooO0O0.OooO00o(i, viewInflate);
            if (coordinatorLayout != null) {
                i = o0OO00O.composeViewContent;
                ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = o0OO00O.composeViewTopHead;
                    ComposeView composeView2 = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = o0OO00O.ctl;
                        if (((CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            int i2 = o0OO00O.headerLayout;
                            View viewOooO00o = OooO0O0.OooO00o(i2, viewInflate);
                            if (viewOooO00o != null) {
                                o00O.OooO00o(viewOooO00o);
                                i2 = o0OO00O.ivTopShadow;
                                if (((ImageView) OooO0O0.OooO00o(i2, viewInflate)) != null) {
                                    return new w2(frameLayout, coordinatorLayout, composeView, composeView2);
                                }
                            }
                            i = i2;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
