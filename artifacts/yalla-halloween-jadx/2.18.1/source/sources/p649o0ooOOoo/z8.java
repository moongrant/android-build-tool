package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class z8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f51059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f51060OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f51061OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f51062OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f51063OooO0o0;

    public z8(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull StateLayout stateLayout) {
        this.f51058OooO00o = linearLayoutCompat;
        this.f51059OooO0O0 = textView;
        this.f51060OooO0OO = imageView;
        this.f51061OooO0Oo = recyclerView;
        this.f51063OooO0o0 = xRefreshLayout;
        this.f51062OooO0o = stateLayout;
    }

    @NonNull
    public static z8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51058OooO00o;
    }

    @NonNull
    public static z8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main_room_explore, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.head_layout;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.head_layout);
        if (textView != null) {
            i = R.id.ivSearchRoom;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivSearchRoom);
            if (imageView != null) {
                i = R.id.recycler_view;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recycler_view);
                if (recyclerView != null) {
                    i = R.id.refresh_layout;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refresh_layout);
                    if (xRefreshLayout != null) {
                        i = R.id.stateLayout;
                        StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                        if (stateLayout != null) {
                            return new z8((LinearLayoutCompat) viewInflate, textView, imageView, recyclerView, xRefreshLayout, stateLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
