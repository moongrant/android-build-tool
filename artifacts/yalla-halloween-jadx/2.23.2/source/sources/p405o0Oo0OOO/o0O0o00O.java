package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44536OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44537OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44538OooO0OO;

    public o0O0o00O(@NonNull XRefreshLayout xRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout2) {
        this.f44536OooO00o = xRefreshLayout;
        this.f44537OooO0O0 = recyclerView;
        this.f44538OooO0OO = xRefreshLayout2;
    }

    @NonNull
    public static o0O0o00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44536OooO00o;
    }

    @NonNull
    public static o0O0o00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.fragment_main_moment_recommend, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.rvMomentRecommend;
        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        }
        XRefreshLayout xRefreshLayout = (XRefreshLayout) viewInflate;
        return new o0O0o00O(xRefreshLayout, recyclerView, xRefreshLayout);
    }
}
