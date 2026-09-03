package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q6 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f58667OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58668OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f58669OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f58670OooO0Oo;

    public q6(@NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull RefreshLayout refreshLayout, @NonNull RefreshLayout refreshLayout2) {
        this.f58667OooO00o = refreshLayout;
        this.f58668OooO0O0 = recyclerView;
        this.f58669OooO0OO = refreshLayout2;
        this.f58670OooO0Oo = stateLayout;
    }

    @NonNull
    public static q6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58667OooO00o;
    }

    @NonNull
    public static q6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_fragment_post_detail_praise, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.recyclerView;
        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            RefreshLayout refreshLayout = (RefreshLayout) viewInflate;
            int i2 = oO00O0oO.stateLayout;
            StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i2, viewInflate);
            if (stateLayout != null) {
                return new q6(recyclerView, stateLayout, refreshLayout, refreshLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
