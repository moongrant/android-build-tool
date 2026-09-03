package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58827OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58828OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58829OooO0OO;

    public t(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f58827OooO00o = linearLayout;
        this.f58828OooO0O0 = recyclerView;
        this.f58829OooO0OO = xRefreshLayout;
    }

    @NonNull
    public static t inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58827OooO00o;
    }

    @NonNull
    public static t inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_country_code_select, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.rv_country_code;
        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            i = oO00O0oO.xrlSearchCountry;
            XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
            if (xRefreshLayout != null) {
                return new t((LinearLayout) viewInflate, recyclerView, xRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
