package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58439OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final a3 f58440OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f58441OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58442OooO0Oo;

    public n2(@NonNull LinearLayout linearLayout, @NonNull a3 a3Var, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f58439OooO00o = linearLayout;
        this.f58440OooO0O0 = a3Var;
        this.f58441OooO0OO = fixedRecyclerView;
        this.f58442OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static n2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58439OooO00o;
    }

    @NonNull
    public static n2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.fragment_member_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ll_search;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            a3 a3VarOooO00o = a3.OooO00o(viewOooO00o);
            int i2 = oO00O0oO.recyclerView;
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooOO0.OooO00o(i2, viewInflate);
            if (fixedRecyclerView != null) {
                i2 = oO00O0oO.refreshLayout;
                XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i2, viewInflate);
                if (xRefreshLayout != null) {
                    return new n2((LinearLayout) viewInflate, a3VarOooO00o, fixedRecyclerView, xRefreshLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
