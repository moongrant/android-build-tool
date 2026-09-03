package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45573OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f45574OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f45575OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45576OooO0Oo;

    public u1(@NonNull ConstraintLayout constraintLayout, @NonNull XRefreshLayout xRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f45573OooO00o = constraintLayout;
        this.f45574OooO0O0 = xRefreshLayout;
        this.f45575OooO0OO = recyclerView;
        this.f45576OooO0Oo = textView;
    }

    @NonNull
    public static u1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45573OooO00o;
    }

    @NonNull
    public static u1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_support_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.headerLayout;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            o00O.OooO00o(viewOooO00o);
            i = o0OO00O.refresh;
            XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, viewInflate);
            if (xRefreshLayout != null) {
                i = o0OO00O.rvSupport;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = o0OO00O.time;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        return new u1((ConstraintLayout) viewInflate, xRefreshLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
