package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class af implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f48952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f48953OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f48954OooO0OO;

    public af(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RefreshLayout refreshLayout, @NonNull RecyclerView recyclerView) {
        this.f48952OooO00o = linearLayoutCompat;
        this.f48953OooO0O0 = refreshLayout;
        this.f48954OooO0OO = recyclerView;
    }

    @NonNull
    public static af inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48952OooO00o;
    }

    @NonNull
    public static af inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_vote_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.rlHistory;
        RefreshLayout refreshLayout = (RefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.rlHistory);
        if (refreshLayout != null) {
            i = R.id.rvHistory;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvHistory);
            if (recyclerView != null) {
                return new af((LinearLayoutCompat) viewInflate, refreshLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
