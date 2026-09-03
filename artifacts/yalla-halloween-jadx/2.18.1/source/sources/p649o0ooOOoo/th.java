package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class th implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50669OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50670OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50671OooO0OO;

    public th(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f50669OooO00o = linearLayout;
        this.f50670OooO0O0 = recyclerView;
        this.f50671OooO0OO = xRefreshLayout;
    }

    @NonNull
    public static th inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50669OooO00o;
    }

    @NonNull
    public static th inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_user_rooms, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
        if (recyclerView != null) {
            i = R.id.xRefreshLayout;
            XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xRefreshLayout);
            if (xRefreshLayout != null) {
                return new th((LinearLayout) viewInflate, recyclerView, xRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
