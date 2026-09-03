package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44820OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f44821OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44822OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f44823OooO0Oo;

    public oO00Oo00(@NonNull ConstraintLayout constraintLayout, @NonNull RefreshLayout refreshLayout, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout) {
        this.f44820OooO00o = constraintLayout;
        this.f44821OooO0O0 = refreshLayout;
        this.f44822OooO0OO = recyclerView;
        this.f44823OooO0Oo = stateLayout;
    }

    @NonNull
    public static oO00Oo00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44820OooO00o;
    }

    @NonNull
    public static oO00Oo00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_fragment_search_user, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivHeadEndBg;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivHeadStartBg;
            if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.refresh;
                RefreshLayout refreshLayout = (RefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                if (refreshLayout != null) {
                    i = o0OO00O.rv;
                    RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        i = o0OO00O.stateLayout;
                        StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (stateLayout != null) {
                            return new oO00Oo00((ConstraintLayout) viewInflate, refreshLayout, recyclerView, stateLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
