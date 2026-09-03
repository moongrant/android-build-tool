package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43757OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final d2 f43758OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f43759OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f43760OooO0Oo;

    public c2(@NonNull LinearLayout linearLayout, @NonNull d2 d2Var, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f43757OooO00o = linearLayout;
        this.f43758OooO0O0 = d2Var;
        this.f43759OooO0OO = fixedRecyclerView;
        this.f43760OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static c2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43757OooO00o;
    }

    @NonNull
    public static c2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_vehicle_store, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.foot_layout;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            d2 d2VarOooO00o = d2.OooO00o(viewOooO00o);
            int i2 = o0OO00O.head_layout;
            if (((TextView) OooO0O0.OooO00o(i2, viewInflate)) != null) {
                i2 = o0OO00O.recyclerView;
                FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooO0O0.OooO00o(i2, viewInflate);
                if (fixedRecyclerView != null) {
                    i2 = o0OO00O.xRefreshLayout;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i2, viewInflate);
                    if (xRefreshLayout != null) {
                        return new c2((LinearLayout) viewInflate, d2VarOooO00o, fixedRecyclerView, xRefreshLayout);
                    }
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
