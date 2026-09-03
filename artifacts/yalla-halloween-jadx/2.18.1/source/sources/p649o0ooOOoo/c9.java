package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class c9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49084OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f49085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49086OooO0OO;

    public c9(@NonNull XRefreshLayout xRefreshLayout, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout2) {
        this.f49084OooO00o = xRefreshLayout;
        this.f49085OooO0O0 = fixedRecyclerView;
        this.f49086OooO0OO = xRefreshLayout2;
    }

    @NonNull
    public static c9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49084OooO00o;
    }

    @NonNull
    public static c9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_moment_list_following, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvMomentFollowing);
        if (fixedRecyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvMomentFollowing)));
        }
        XRefreshLayout xRefreshLayout = (XRefreshLayout) viewInflate;
        return new c9(xRefreshLayout, fixedRecyclerView, xRefreshLayout);
    }
}
