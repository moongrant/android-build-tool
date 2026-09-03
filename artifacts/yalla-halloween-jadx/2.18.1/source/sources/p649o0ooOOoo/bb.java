package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import com.youth.banner.Banner;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class bb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f49015OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Banner f49016OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f49017OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49018OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49019OooO0o0;

    public bb(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Banner banner, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49015OooO00o = coordinatorLayout;
        this.f49016OooO0O0 = banner;
        this.f49017OooO0OO = collapsingToolbarLayout;
        this.f49018OooO0Oo = recyclerView;
        this.f49019OooO0o0 = xRefreshLayout;
    }

    @NonNull
    public static bb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49015OooO00o;
    }

    @NonNull
    public static bb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_fragment_room_all_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.abl_related;
        if (((AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.abl_related)) != null) {
            i = R.id.banner;
            Banner banner = (Banner) o00Oo0.OooO00o(viewInflate, R.id.banner);
            if (banner != null) {
                i = R.id.ctl_room;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) o00Oo0.OooO00o(viewInflate, R.id.ctl_room);
                if (collapsingToolbarLayout != null) {
                    i = R.id.rv_main_new;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rv_main_new);
                    if (recyclerView != null) {
                        i = R.id.xrl_main_new;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xrl_main_new);
                        if (xRefreshLayout != null) {
                            return new bb((CoordinatorLayout) viewInflate, banner, collapsingToolbarLayout, recyclerView, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
