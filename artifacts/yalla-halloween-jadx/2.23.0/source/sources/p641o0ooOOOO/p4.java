package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58586OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f58587OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58588OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f58589OooO0Oo;

    public p4(@NonNull ConstraintLayout constraintLayout, @NonNull RefreshLayout refreshLayout, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout) {
        this.f58586OooO00o = constraintLayout;
        this.f58587OooO0O0 = refreshLayout;
        this.f58588OooO0OO = recyclerView;
        this.f58589OooO0Oo = stateLayout;
    }

    @NonNull
    public static p4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58586OooO00o;
    }

    @NonNull
    public static p4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_fragment_search_user, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivHeadEndBg;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.ivHeadStartBg;
            if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.refresh;
                RefreshLayout refreshLayout = (RefreshLayout) OooOO0.OooO00o(i, viewInflate);
                if (refreshLayout != null) {
                    i = oO00O0oO.rv;
                    RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        i = oO00O0oO.stateLayout;
                        StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                        if (stateLayout != null) {
                            return new p4((ConstraintLayout) viewInflate, refreshLayout, recyclerView, stateLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
