package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58708OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58709OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final StateLayout f58711OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58712OooO0o0;

    public r1(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout, @NonNull StateLayout stateLayout) {
        this.f58707OooO00o = constraintLayout;
        this.f58708OooO0O0 = imageView;
        this.f58709OooO0OO = imageView2;
        this.f58710OooO0Oo = recyclerView;
        this.f58712OooO0o0 = xRefreshLayout;
        this.f58711OooO0o = stateLayout;
    }

    @NonNull
    public static r1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58707OooO00o;
    }

    @NonNull
    public static r1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_room_lucky_number_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.close;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.doubt;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = oO00O0oO.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = oO00O0oO.refresh;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                    if (xRefreshLayout != null) {
                        i = oO00O0oO.stateLayout;
                        StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                        if (stateLayout != null) {
                            i = oO00O0oO.title;
                            if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                return new r1(constraintLayout, imageView, imageView2, recyclerView, xRefreshLayout, stateLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
