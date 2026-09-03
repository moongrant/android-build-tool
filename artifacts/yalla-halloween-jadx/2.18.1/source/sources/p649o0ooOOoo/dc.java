package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.ui.view.DialogTitleView;
import com.yalla.yalla.ui.view.SearchLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class dc implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final DialogTitleView f49168OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f49171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49173OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49174OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SearchLayout f49175OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f49176OooO0oo;

    public dc(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull SearchLayout searchLayout, @NonNull StateLayout stateLayout, @NonNull DialogTitleView dialogTitleView) {
        this.f49169OooO00o = linearLayout;
        this.f49170OooO0O0 = linearLayout2;
        this.f49171OooO0OO = textView;
        this.f49172OooO0Oo = textView2;
        this.f49174OooO0o0 = recyclerView;
        this.f49173OooO0o = xRefreshLayout;
        this.f49175OooO0oO = searchLayout;
        this.f49176OooO0oo = stateLayout;
        this.f49168OooO = dialogTitleView;
    }

    @NonNull
    public static dc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49169OooO00o;
    }

    @NonNull
    public static dc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_fragment_room_member_convene_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bottomLayout;
        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.bottomLayout);
        if (linearLayout != null) {
            i = R.id.convene;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.convene);
            if (textView != null) {
                i = R.id.info;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.info)) != null) {
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                    i = R.id.memberCount;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.memberCount);
                    if (textView2 != null) {
                        i = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                        if (recyclerView != null) {
                            i = R.id.refresh;
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refresh);
                            if (xRefreshLayout != null) {
                                i = R.id.searchView;
                                SearchLayout searchLayout = (SearchLayout) o00Oo0.OooO00o(viewInflate, R.id.searchView);
                                if (searchLayout != null) {
                                    i = R.id.stateLayout;
                                    StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                                    if (stateLayout != null) {
                                        i = R.id.title;
                                        DialogTitleView dialogTitleView = (DialogTitleView) o00Oo0.OooO00o(viewInflate, R.id.title);
                                        if (dialogTitleView != null) {
                                            return new dc(linearLayout2, linearLayout, textView, textView2, recyclerView, xRefreshLayout, searchLayout, stateLayout, dialogTitleView);
                                        }
                                    }
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
