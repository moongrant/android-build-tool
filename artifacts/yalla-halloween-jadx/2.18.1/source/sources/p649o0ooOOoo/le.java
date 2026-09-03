package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class le implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49966OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final me f49967OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49968OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49969OooO0Oo;

    public le(@NonNull LinearLayout linearLayout, @NonNull me meVar, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49966OooO00o = linearLayout;
        this.f49967OooO0O0 = meVar;
        this.f49968OooO0OO = recyclerView;
        this.f49969OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static le inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49966OooO00o;
    }

    @NonNull
    public static le inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_lucky_packet_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.headDetail;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.headDetail);
        if (viewOooO00o != null) {
            me meVarOooO00o = me.OooO00o(viewOooO00o);
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
            if (recyclerView != null) {
                XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xRefreshLayout);
                if (xRefreshLayout != null) {
                    return new le((LinearLayout) viewInflate, meVarOooO00o, recyclerView, xRefreshLayout);
                }
                i = R.id.xRefreshLayout;
            } else {
                i = R.id.recyclerView;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
