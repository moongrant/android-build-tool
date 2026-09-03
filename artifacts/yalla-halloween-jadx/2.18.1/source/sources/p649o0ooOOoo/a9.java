package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class a9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final t9 f48925OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f48926OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f48927OooO0Oo;

    public a9(@NonNull LinearLayout linearLayout, @NonNull t9 t9Var, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f48924OooO00o = linearLayout;
        this.f48925OooO0O0 = t9Var;
        this.f48926OooO0OO = fixedRecyclerView;
        this.f48927OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static a9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48924OooO00o;
    }

    @NonNull
    public static a9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_member_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ll_search;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.ll_search);
        if (viewOooO00o != null) {
            t9 t9VarOooO00o = t9.OooO00o(viewOooO00o);
            FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
            if (fixedRecyclerView != null) {
                XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refreshLayout);
                if (xRefreshLayout != null) {
                    return new a9((LinearLayout) viewInflate, t9VarOooO00o, fixedRecyclerView, xRefreshLayout);
                }
                i = R.id.refreshLayout;
            } else {
                i = R.id.recyclerView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
