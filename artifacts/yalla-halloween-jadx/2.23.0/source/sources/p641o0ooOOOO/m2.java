package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class m2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58393OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f58394OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58395OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58396OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58397OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58398OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final StateLayout f58399OooO0oO;

    public m2(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull StateLayout stateLayout) {
        this.f58393OooO00o = linearLayoutCompat;
        this.f58394OooO0O0 = textView;
        this.f58395OooO0OO = imageView;
        this.f58396OooO0Oo = imageView2;
        this.f58398OooO0o0 = recyclerView;
        this.f58397OooO0o = xRefreshLayout;
        this.f58399OooO0oO = stateLayout;
    }

    @NonNull
    public static m2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58393OooO00o;
    }

    @NonNull
    public static m2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.fragment_main_room_explore, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.head_layout;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oO00O0oO.ivBottomBg;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivSearchRoom;
                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = oO00O0oO.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        i = oO00O0oO.refresh_layout;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                        if (xRefreshLayout != null) {
                            i = oO00O0oO.stateLayout;
                            StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                            if (stateLayout != null) {
                                return new m2((LinearLayoutCompat) viewInflate, textView, imageView, imageView2, recyclerView, xRefreshLayout, stateLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
