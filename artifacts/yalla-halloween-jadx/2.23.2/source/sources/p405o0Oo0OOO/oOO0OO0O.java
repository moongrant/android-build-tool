package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO0O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f45110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45111OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f45112OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f45113OooO0Oo;

    public oOO0OO0O(@NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull RefreshLayout refreshLayout, @NonNull RefreshLayout refreshLayout2) {
        this.f45110OooO00o = refreshLayout;
        this.f45111OooO0O0 = recyclerView;
        this.f45112OooO0OO = refreshLayout2;
        this.f45113OooO0Oo = stateLayout;
    }

    @NonNull
    public static oOO0OO0O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45110OooO00o;
    }

    @NonNull
    public static oOO0OO0O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.moment_fragment_post_detail_comment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.recyclerView;
        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            RefreshLayout refreshLayout = (RefreshLayout) viewInflate;
            int i2 = o0OO00O.stateLayout;
            StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i2, viewInflate);
            if (stateLayout != null) {
                return new oOO0OO0O(recyclerView, stateLayout, refreshLayout, refreshLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
