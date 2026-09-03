package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58860OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f58861OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f58862OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final x3 f58863OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58864OooO0o0;

    public t4(@NonNull XRefreshLayout xRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull x3 x3Var, @NonNull RecyclerView recyclerView) {
        this.f58860OooO00o = xRefreshLayout;
        this.f58861OooO0O0 = appBarLayout;
        this.f58862OooO0OO = collapsingToolbarLayout;
        this.f58863OooO0Oo = x3Var;
        this.f58864OooO0o0 = recyclerView;
    }

    @NonNull
    public static t4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58860OooO00o;
    }

    @NonNull
    public static t4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_top_data_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.abl_related;
        AppBarLayout appBarLayout = (AppBarLayout) OooOO0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = oO00O0oO.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate);
            if (collapsingToolbarLayout != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.ilTop), viewInflate)) != null) {
                x3 x3VarOooO00o = x3.OooO00o(viewOooO00o);
                i = oO00O0oO.rv_top_data;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    return new t4((XRefreshLayout) viewInflate, appBarLayout, collapsingToolbarLayout, x3VarOooO00o, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
