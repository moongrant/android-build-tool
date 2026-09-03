package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class na implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58467OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final oa f58468OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f58469OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58470OooO0Oo;

    public na(@NonNull LinearLayout linearLayout, @NonNull oa oaVar, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f58467OooO00o = linearLayout;
        this.f58468OooO0O0 = oaVar;
        this.f58469OooO0OO = fixedRecyclerView;
        this.f58470OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static na inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58467OooO00o;
    }

    @NonNull
    public static na inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_vehicle_store, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.foot_layout;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            oa oaVarOooO00o = oa.OooO00o(viewOooO00o);
            int i2 = oO00O0oO.head_layout;
            if (((TextView) OooOO0.OooO00o(i2, viewInflate)) != null) {
                i2 = oO00O0oO.recyclerView;
                FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooOO0.OooO00o(i2, viewInflate);
                if (fixedRecyclerView != null) {
                    i2 = oO00O0oO.xRefreshLayout;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i2, viewInflate);
                    if (xRefreshLayout != null) {
                        return new na((LinearLayout) viewInflate, oaVarOooO00o, fixedRecyclerView, xRefreshLayout);
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
