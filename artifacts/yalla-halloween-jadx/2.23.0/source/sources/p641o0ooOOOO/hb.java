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
public final class hb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f58092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ComposeView f58093OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f58094OooO0Oo;

    public hb(@NonNull FrameLayout frameLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.f58091OooO00o = frameLayout;
        this.f58092OooO0O0 = coordinatorLayout;
        this.f58093OooO0OO = composeView;
        this.f58094OooO0Oo = composeView2;
    }

    @NonNull
    public static hb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58091OooO00o;
    }

    @NonNull
    public static hb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_vip_benfit_mall_record, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.appBarLayout;
        if (((AppBarLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.cl_benefit;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) OooOO0.OooO00o(i, viewInflate);
            if (coordinatorLayout != null) {
                i = oO00O0oO.composeViewContent;
                ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                if (composeView != null) {
                    i = oO00O0oO.composeViewTopHead;
                    ComposeView composeView2 = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                    if (composeView2 != null) {
                        i = oO00O0oO.ctl;
                        if (((CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            int i2 = oO00O0oO.headerLayout;
                            View viewOooO00o = OooOO0.OooO00o(i2, viewInflate);
                            if (viewOooO00o != null) {
                                s0.OooO00o(viewOooO00o);
                                i2 = oO00O0oO.ivTopShadow;
                                if (((ImageView) OooOO0.OooO00o(i2, viewInflate)) != null) {
                                    return new hb(frameLayout, coordinatorLayout, composeView, composeView2);
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
