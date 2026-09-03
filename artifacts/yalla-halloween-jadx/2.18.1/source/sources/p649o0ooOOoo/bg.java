package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class bg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49057OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49058OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49059OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49060OooO0Oo;

    public bg(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49057OooO00o = linearLayout;
        this.f49058OooO0O0 = recyclerView;
        this.f49059OooO0OO = appCompatTextView;
        this.f49060OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static bg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49057OooO00o;
    }

    @NonNull
    public static bg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_fragment_packet_history_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.rvList;
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvList);
        if (recyclerView != null) {
            i = R.id.tvTotally;
            AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvTotally);
            if (appCompatTextView != null) {
                i = R.id.vRefresh;
                XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.vRefresh);
                if (xRefreshLayout != null) {
                    return new bg((LinearLayout) viewInflate, recyclerView, appCompatTextView, xRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
