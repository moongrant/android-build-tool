package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o0OO0oO0 f44540OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f44541OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44542OooO0Oo;

    public o0O0oo00(@NonNull LinearLayout linearLayout, @NonNull o0OO0oO0 o0oo0oo1, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f44539OooO00o = linearLayout;
        this.f44540OooO0O0 = o0oo0oo1;
        this.f44541OooO0OO = fixedRecyclerView;
        this.f44542OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static o0O0oo00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44539OooO00o;
    }

    @NonNull
    public static o0O0oo00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.fragment_member_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ll_search;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            o0OO0oO0 o0oo0oo0OooO00o = o0OO0oO0.OooO00o(viewOooO00o);
            int i2 = o0OO00O.recyclerView;
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooO0O0.OooO00o(i2, viewInflate);
            if (fixedRecyclerView != null) {
                i2 = o0OO00O.refreshLayout;
                XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i2, viewInflate);
                if (xRefreshLayout != null) {
                    return new o0O0oo00((LinearLayout) viewInflate, o0oo0oo0OooO00o, fixedRecyclerView, xRefreshLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
