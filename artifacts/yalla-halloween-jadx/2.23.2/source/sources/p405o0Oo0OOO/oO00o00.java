package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44827OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f44828OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f44829OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final oO0OoOO0 f44830OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44831OooO0o0;

    public oO00o00(@NonNull XRefreshLayout xRefreshLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull oO0OoOO0 oo0oooo0, @NonNull RecyclerView recyclerView) {
        this.f44827OooO00o = xRefreshLayout;
        this.f44828OooO0O0 = appBarLayout;
        this.f44829OooO0OO = collapsingToolbarLayout;
        this.f44830OooO0Oo = oo0oooo0;
        this.f44831OooO0o0 = recyclerView;
    }

    @NonNull
    public static oO00o00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44827OooO00o;
    }

    @NonNull
    public static oO00o00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_top_data_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.abl_related;
        AppBarLayout appBarLayout = (AppBarLayout) OooO0O0.OooO00o(i, viewInflate);
        if (appBarLayout != null) {
            i = o0OO00O.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate);
            if (collapsingToolbarLayout != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.ilTop), viewInflate)) != null) {
                oO0OoOO0 oo0oooo0OooO00o = oO0OoOO0.OooO00o(viewOooO00o);
                i = o0OO00O.rv_top_data;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    return new oO00o00((XRefreshLayout) viewInflate, appBarLayout, collapsingToolbarLayout, oo0oooo0OooO00o, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
