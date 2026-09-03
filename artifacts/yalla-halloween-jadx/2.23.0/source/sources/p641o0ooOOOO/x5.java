package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class x5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59272OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f59273OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59274OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f59275OooO0Oo;

    public x5(@NonNull LinearLayout linearLayout, @NonNull ComposeView composeView, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f59272OooO00o = linearLayout;
        this.f59273OooO0O0 = composeView;
        this.f59274OooO0OO = recyclerView;
        this.f59275OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static x5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59272OooO00o;
    }

    @NonNull
    public static x5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_activity_moment_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.composeView;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.rvMomentSearch;
            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = oO00O0oO.xrlSearchMoment;
                XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                if (xRefreshLayout != null) {
                    return new x5((LinearLayout) viewInflate, composeView, recyclerView, xRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
