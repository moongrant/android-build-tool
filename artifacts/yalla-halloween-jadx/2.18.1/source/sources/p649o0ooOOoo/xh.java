package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class xh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final yh f50982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f50983OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50984OooO0Oo;

    public xh(@NonNull LinearLayout linearLayout, @NonNull yh yhVar, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f50981OooO00o = linearLayout;
        this.f50982OooO0O0 = yhVar;
        this.f50983OooO0OO = fixedRecyclerView;
        this.f50984OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static xh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50981OooO00o;
    }

    @NonNull
    public static xh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_vehicle_store, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.foot_layout;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.foot_layout);
        if (viewOooO00o != null) {
            yh yhVarOooO00o = yh.OooO00o(viewOooO00o);
            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.head_layout)) != null) {
                FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                if (fixedRecyclerView != null) {
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xRefreshLayout);
                    if (xRefreshLayout != null) {
                        return new xh((LinearLayout) viewInflate, yhVarOooO00o, fixedRecyclerView, xRefreshLayout);
                    }
                    i = R.id.xRefreshLayout;
                } else {
                    i = R.id.recyclerView;
                }
            } else {
                i = R.id.head_layout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
