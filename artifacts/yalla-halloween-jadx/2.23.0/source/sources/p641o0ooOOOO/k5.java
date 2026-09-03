package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.DialogTitleView;
import com.yalla.yalla.ui.view.SearchLayout;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class k5 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final DialogTitleView f58256OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58257OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58258OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58259OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58260OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58261OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58262OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SearchLayout f58263OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f58264OooO0oo;

    public k5(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull SearchLayout searchLayout, @NonNull StateLayout stateLayout, @NonNull DialogTitleView dialogTitleView) {
        this.f58257OooO00o = linearLayout;
        this.f58258OooO0O0 = linearLayout2;
        this.f58259OooO0OO = textView;
        this.f58260OooO0Oo = textView2;
        this.f58262OooO0o0 = recyclerView;
        this.f58261OooO0o = xRefreshLayout;
        this.f58263OooO0oO = searchLayout;
        this.f58264OooO0oo = stateLayout;
        this.f58256OooO = dialogTitleView;
    }

    @NonNull
    public static k5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58257OooO00o;
    }

    @NonNull
    public static k5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_fragment_room_member_convene_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomLayout;
        LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
        if (linearLayout != null) {
            i = oO00O0oO.convene;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.info;
                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                    i = oO00O0oO.memberCount;
                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = oO00O0oO.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                        if (recyclerView != null) {
                            i = oO00O0oO.refresh;
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                            if (xRefreshLayout != null) {
                                i = oO00O0oO.searchView;
                                SearchLayout searchLayout = (SearchLayout) OooOO0.OooO00o(i, viewInflate);
                                if (searchLayout != null) {
                                    i = oO00O0oO.stateLayout;
                                    StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (stateLayout != null) {
                                        i = oO00O0oO.title;
                                        DialogTitleView dialogTitleView = (DialogTitleView) OooOO0.OooO00o(i, viewInflate);
                                        if (dialogTitleView != null) {
                                            return new k5(linearLayout2, linearLayout, textView, textView2, recyclerView, xRefreshLayout, searchLayout, stateLayout, dialogTitleView);
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
