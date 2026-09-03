package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44846OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44847OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44848OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RefreshLayout f44849OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final StateLayout f44850OooO0o0;

    public oO0O00(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RefreshLayout refreshLayout, @NonNull StateLayout stateLayout) {
        this.f44846OooO00o = frameLayout;
        this.f44847OooO0O0 = imageView;
        this.f44848OooO0OO = recyclerView;
        this.f44849OooO0Oo = refreshLayout;
        this.f44850OooO0o0 = stateLayout;
    }

    @NonNull
    public static oO0O00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44846OooO00o;
    }

    @NonNull
    public static oO0O00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_fragment_friend_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivBottomBg;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.recyclerview;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = o0OO00O.refreshLayout;
                RefreshLayout refreshLayout = (RefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                if (refreshLayout != null) {
                    i = o0OO00O.stateLayout;
                    StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (stateLayout != null) {
                        return new oO0O00((FrameLayout) viewInflate, imageView, recyclerView, refreshLayout, stateLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
