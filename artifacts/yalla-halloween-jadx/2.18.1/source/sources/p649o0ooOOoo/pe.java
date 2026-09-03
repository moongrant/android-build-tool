package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.SearchView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class pe implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f50306OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50307OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f50309OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final SearchView f50310OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50311OooO0oO;

    public pe(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull SearchView searchView, @NonNull StateLayout stateLayout, @NonNull TextView textView2) {
        this.f50305OooO00o = linearLayout;
        this.f50306OooO0O0 = textView;
        this.f50307OooO0OO = recyclerView;
        this.f50308OooO0Oo = xRefreshLayout;
        this.f50310OooO0o0 = searchView;
        this.f50309OooO0o = stateLayout;
        this.f50311OooO0oO = textView2;
    }

    @NonNull
    public static pe inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50305OooO00o;
    }

    @NonNull
    public static pe inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_member_list_convene, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.convene;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.convene);
        if (textView != null) {
            i = R.id.info;
            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.info)) != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.refresh;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refresh);
                    if (xRefreshLayout != null) {
                        i = R.id.searchView;
                        SearchView searchView = (SearchView) o00Oo0.OooO00o(viewInflate, R.id.searchView);
                        if (searchView != null) {
                            i = R.id.stateLayout;
                            StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                            if (stateLayout != null) {
                                i = R.id.title;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.title);
                                if (textView2 != null) {
                                    return new pe((LinearLayout) viewInflate, textView, recyclerView, xRefreshLayout, searchView, stateLayout, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
