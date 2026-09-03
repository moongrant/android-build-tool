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
public final class c7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57663OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final d7 f57664OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57665OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f57666OooO0Oo;

    public c7(@NonNull LinearLayout linearLayout, @NonNull d7 d7Var, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f57663OooO00o = linearLayout;
        this.f57664OooO0O0 = d7Var;
        this.f57665OooO0OO = recyclerView;
        this.f57666OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static c7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57663OooO00o;
    }

    @NonNull
    public static c7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_lucky_packet_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.headDetail;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            d7 d7VarOooO00o = d7.OooO00o(viewOooO00o);
            int i2 = oO00O0oO.recyclerView;
            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i2, viewInflate);
            if (recyclerView != null) {
                i2 = oO00O0oO.xRefreshLayout;
                XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i2, viewInflate);
                if (xRefreshLayout != null) {
                    return new c7((LinearLayout) viewInflate, d7VarOooO00o, recyclerView, xRefreshLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
