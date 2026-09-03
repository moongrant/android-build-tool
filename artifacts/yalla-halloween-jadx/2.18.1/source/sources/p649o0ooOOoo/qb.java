package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qb implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateLayout f50368OooO0OO;

    public qb(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout) {
        this.f50366OooO00o = linearLayoutCompat;
        this.f50367OooO0O0 = recyclerView;
        this.f50368OooO0OO = stateLayout;
    }

    @NonNull
    public static qb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50366OooO00o;
    }

    @NonNull
    public static qb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_activity_system_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.refreshLayout;
        if (((RefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refreshLayout)) != null) {
            i = R.id.rvSystemMessage;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvSystemMessage);
            if (recyclerView != null) {
                i = R.id.stateLayout;
                StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                if (stateLayout != null) {
                    return new qb((LinearLayoutCompat) viewInflate, recyclerView, stateLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
