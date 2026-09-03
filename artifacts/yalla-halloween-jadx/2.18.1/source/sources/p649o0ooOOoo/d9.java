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
public final class d9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f49156OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49157OooO0OO;

    public d9(@NonNull LinearLayout linearLayout, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49155OooO00o = linearLayout;
        this.f49156OooO0O0 = fixedRecyclerView;
        this.f49157OooO0OO = xRefreshLayout;
    }

    @NonNull
    public static d9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49155OooO00o;
    }

    @NonNull
    public static d9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_moment_room_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.recyclerView;
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
        if (fixedRecyclerView != null) {
            i = R.id.refreshLayout;
            XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refreshLayout);
            if (xRefreshLayout != null) {
                return new d9((LinearLayout) viewInflate, fixedRecyclerView, xRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
