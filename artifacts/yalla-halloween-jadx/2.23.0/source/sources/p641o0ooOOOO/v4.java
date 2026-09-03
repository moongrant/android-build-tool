package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class v4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59044OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59045OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateLayout f59046OooO0OO;

    public v4(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout) {
        this.f59044OooO00o = linearLayout;
        this.f59045OooO0O0 = recyclerView;
        this.f59046OooO0OO = stateLayout;
    }

    @NonNull
    public static v4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59044OooO00o;
    }

    @NonNull
    public static v4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_activity_friend_request_message, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.refreshLayout;
        if (((RefreshLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.rv;
            RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = oO00O0oO.stateLayout;
                StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                if (stateLayout != null) {
                    return new v4((LinearLayout) viewInflate, recyclerView, stateLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
