package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44653OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44654OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44655OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44656OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f44657OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44658OooO0o0;

    public o0OoO00O(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull StateLayout stateLayout) {
        this.f44653OooO00o = constraintLayout;
        this.f44654OooO0O0 = imageView;
        this.f44655OooO0OO = imageView2;
        this.f44656OooO0Oo = recyclerView;
        this.f44658OooO0o0 = xRefreshLayout;
        this.f44657OooO0o = stateLayout;
    }

    @NonNull
    public static o0OoO00O inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44653OooO00o;
    }

    @NonNull
    public static o0OoO00O inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_room_lucky_number_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.close;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.doubt;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = o0OO00O.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = o0OO00O.refresh;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (xRefreshLayout != null) {
                        i = o0OO00O.stateLayout;
                        StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (stateLayout != null) {
                            i = o0OO00O.title;
                            if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                return new o0OoO00O(constraintLayout, imageView, imageView2, recyclerView, xRefreshLayout, stateLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
