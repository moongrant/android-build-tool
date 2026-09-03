package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f44787OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f44788OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44789OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44792OooO0o0;

    public oO00O0o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull ComposeView composeView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f44787OooO00o = coordinatorLayout;
        this.f44788OooO0O0 = collapsingToolbarLayout;
        this.f44789OooO0OO = imageView;
        this.f44790OooO0Oo = recyclerView;
        this.f44792OooO0o0 = composeView;
        this.f44791OooO0o = xRefreshLayout;
    }

    @NonNull
    public static oO00O0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44787OooO00o;
    }

    @NonNull
    public static oO00O0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_fragment_room_all_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.abl_related;
        if (((AppBarLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate);
            if (collapsingToolbarLayout != null) {
                i = o0OO00O.ivBottomBg;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.rv_main_new;
                    RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        i = o0OO00O.topComposeView;
                        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
                        if (composeView != null) {
                            i = o0OO00O.xrl_main_new;
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (xRefreshLayout != null) {
                                return new oO00O0o((CoordinatorLayout) viewInflate, collapsingToolbarLayout, imageView, recyclerView, composeView, xRefreshLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
