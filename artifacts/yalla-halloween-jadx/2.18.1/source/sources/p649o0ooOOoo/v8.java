package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class v8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50786OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50788OooO0OO;

    public v8(@NonNull XRefreshLayout xRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout2) {
        this.f50786OooO00o = xRefreshLayout;
        this.f50787OooO0O0 = recyclerView;
        this.f50788OooO0OO = xRefreshLayout2;
    }

    @NonNull
    public static v8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50786OooO00o;
    }

    @NonNull
    public static v8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main_moment_join, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvMomentJoin);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.rvMomentJoin)));
        }
        XRefreshLayout xRefreshLayout = (XRefreshLayout) viewInflate;
        return new v8(xRefreshLayout, recyclerView, xRefreshLayout);
    }
}
