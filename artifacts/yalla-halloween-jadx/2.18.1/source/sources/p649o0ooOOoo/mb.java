package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class mb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50015OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f50016OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f50017OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final oa f50018OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50019OooO0o0;

    public mb(@NonNull XRefreshLayout xRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull oa oaVar, @NonNull RecyclerView recyclerView) {
        this.f50015OooO00o = xRefreshLayout;
        this.f50016OooO0O0 = appBarLayout;
        this.f50017OooO0OO = collapsingToolbarLayout;
        this.f50018OooO0Oo = oaVar;
        this.f50019OooO0o0 = recyclerView;
    }

    @NonNull
    public static mb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50015OooO00o;
    }

    @NonNull
    public static mb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_top_data_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.abl_related;
        AppBarLayout appBarLayout = (AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.abl_related);
        if (appBarLayout != null) {
            i = R.id.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) o00Oo0.OooO00o(viewInflate, R.id.ctl_room);
            if (collapsingToolbarLayout != null) {
                i = R.id.ilTop;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.ilTop);
                if (viewOooO00o != null) {
                    oa oaVarOooO00o = oa.OooO00o(viewOooO00o);
                    i = R.id.rv_top_data;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rv_top_data);
                    if (recyclerView != null) {
                        return new mb((XRefreshLayout) viewInflate, appBarLayout, collapsingToolbarLayout, oaVarOooO00o, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
