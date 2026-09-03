package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class i4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f58106OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f58107OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58108OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f58111OooO0o0;

    public i4(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull ComposeView composeView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f58106OooO00o = coordinatorLayout;
        this.f58107OooO0O0 = collapsingToolbarLayout;
        this.f58108OooO0OO = imageView;
        this.f58109OooO0Oo = recyclerView;
        this.f58111OooO0o0 = composeView;
        this.f58110OooO0o = xRefreshLayout;
    }

    @NonNull
    public static i4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58106OooO00o;
    }

    @NonNull
    public static i4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_fragment_room_all_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.abl_related;
        if (((AppBarLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate);
            if (collapsingToolbarLayout != null) {
                i = oO00O0oO.ivBottomBg;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.rv_main_new;
                    RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        i = oO00O0oO.topComposeView;
                        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
                        if (composeView != null) {
                            i = oO00O0oO.xrl_main_new;
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                            if (xRefreshLayout != null) {
                                return new i4((CoordinatorLayout) viewInflate, collapsingToolbarLayout, imageView, recyclerView, composeView, xRefreshLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
