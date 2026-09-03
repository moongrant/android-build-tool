package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final DialogTitleView f44837OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44839OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44840OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44842OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44843OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SearchLayout f44844OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f44845OooO0oo;

    public oO0O0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull SearchLayout searchLayout, @NonNull StateLayout stateLayout, @NonNull DialogTitleView dialogTitleView) {
        this.f44838OooO00o = linearLayout;
        this.f44839OooO0O0 = linearLayout2;
        this.f44840OooO0OO = textView;
        this.f44841OooO0Oo = textView2;
        this.f44843OooO0o0 = recyclerView;
        this.f44842OooO0o = xRefreshLayout;
        this.f44844OooO0oO = searchLayout;
        this.f44845OooO0oo = stateLayout;
        this.f44837OooO = dialogTitleView;
    }

    @NonNull
    public static oO0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44838OooO00o;
    }

    @NonNull
    public static oO0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_fragment_room_member_convene_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.bottomLayout;
        LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
        if (linearLayout != null) {
            i = o0OO00O.convene;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0OO00O.info;
                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                    i = o0OO00O.memberCount;
                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView2 != null) {
                        i = o0OO00O.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                        if (recyclerView != null) {
                            i = o0OO00O.refresh;
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (xRefreshLayout != null) {
                                i = o0OO00O.searchView;
                                SearchLayout searchLayout = (SearchLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (searchLayout != null) {
                                    i = o0OO00O.stateLayout;
                                    StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (stateLayout != null) {
                                        i = o0OO00O.title;
                                        DialogTitleView dialogTitleView = (DialogTitleView) OooO0O0.OooO00o(i, viewInflate);
                                        if (dialogTitleView != null) {
                                            return new oO0O0(linearLayout2, linearLayout, textView, textView2, recyclerView, xRefreshLayout, searchLayout, stateLayout, dialogTitleView);
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
