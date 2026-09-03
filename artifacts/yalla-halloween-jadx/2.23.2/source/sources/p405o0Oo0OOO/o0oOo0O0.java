package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f44687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f44688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44689OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44690OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44691OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44692OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final StateLayout f44693OooO0oO;

    public o0oOo0O0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull StateLayout stateLayout) {
        this.f44687OooO00o = linearLayoutCompat;
        this.f44688OooO0O0 = textView;
        this.f44689OooO0OO = imageView;
        this.f44690OooO0Oo = imageView2;
        this.f44692OooO0o0 = recyclerView;
        this.f44691OooO0o = xRefreshLayout;
        this.f44693OooO0oO = stateLayout;
    }

    @NonNull
    public static o0oOo0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44687OooO00o;
    }

    @NonNull
    public static o0oOo0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.fragment_main_room_explore, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.head_layout;
        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = o0OO00O.ivBottomBg;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivSearchRoom;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        i = o0OO00O.refresh_layout;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (xRefreshLayout != null) {
                            i = o0OO00O.stateLayout;
                            StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                            if (stateLayout != null) {
                                return new o0oOo0O0((LinearLayoutCompat) viewInflate, textView, imageView, imageView2, recyclerView, xRefreshLayout, stateLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
