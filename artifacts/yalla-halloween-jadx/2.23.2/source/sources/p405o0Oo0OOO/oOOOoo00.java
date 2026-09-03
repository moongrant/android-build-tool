package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45181OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final oOOOOo0O f45182OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45183OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f45184OooO0Oo;

    public oOOOoo00(@NonNull LinearLayout linearLayout, @NonNull oOOOOo0O oooooo0o, @NonNull RecyclerView recyclerView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f45181OooO00o = linearLayout;
        this.f45182OooO0O0 = oooooo0o;
        this.f45183OooO0OO = recyclerView;
        this.f45184OooO0Oo = xRefreshLayout;
    }

    @NonNull
    public static oOOOoo00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45181OooO00o;
    }

    @NonNull
    public static oOOOoo00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_lucky_packet_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.headDetail;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            oOOOOo0O oooooo0oOooO00o = oOOOOo0O.OooO00o(viewOooO00o);
            int i2 = o0OO00O.recyclerView;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i2, viewInflate);
            if (recyclerView != null) {
                i2 = o0OO00O.xRefreshLayout;
                XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i2, viewInflate);
                if (xRefreshLayout != null) {
                    return new oOOOoo00((LinearLayout) viewInflate, oooooo0oOooO00o, recyclerView, xRefreshLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
