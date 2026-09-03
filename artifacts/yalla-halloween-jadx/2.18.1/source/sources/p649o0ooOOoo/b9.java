package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import com.youth.banner.Banner;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class b9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f49005OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Banner f49006OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f49007OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f49008OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49009OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f49010OooO0o0;

    public b9(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Banner banner, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull AppBarLayout appBarLayout, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49005OooO00o = coordinatorLayout;
        this.f49006OooO0O0 = banner;
        this.f49007OooO0OO = collapsingToolbarLayout;
        this.f49008OooO0Oo = appBarLayout;
        this.f49010OooO0o0 = fixedRecyclerView;
        this.f49009OooO0o = xRefreshLayout;
    }

    @NonNull
    public static b9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49005OooO00o;
    }

    @NonNull
    public static b9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_moment_list_featured, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.banner;
        Banner banner = (Banner) o00Oo0.OooO00o(viewInflate, R.id.banner);
        if (banner != null) {
            i = R.id.ctl;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) o00Oo0.OooO00o(viewInflate, R.id.ctl);
            if (collapsingToolbarLayout != null) {
                i = R.id.layout_banner;
                AppBarLayout appBarLayout = (AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_banner);
                if (appBarLayout != null) {
                    i = R.id.recyclerView;
                    FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                    if (fixedRecyclerView != null) {
                        i = R.id.vs_main_room_all_vp;
                        if (((ViewStub) o00Oo0.OooO00o(viewInflate, R.id.vs_main_room_all_vp)) != null) {
                            i = R.id.xRefreshLayout;
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xRefreshLayout);
                            if (xRefreshLayout != null) {
                                return new b9((CoordinatorLayout) viewInflate, banner, collapsingToolbarLayout, appBarLayout, fixedRecyclerView, xRefreshLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
