package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44077OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44078OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44079OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44080OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44081OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44082OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44083OooO0oO;

    public k2(@NonNull XRefreshLayout xRefreshLayout, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull XRefreshLayout xRefreshLayout2) {
        this.f44077OooO00o = xRefreshLayout;
        this.f44078OooO0O0 = constraintLayout;
        this.f44079OooO0OO = recyclerView;
        this.f44080OooO0Oo = appCompatTextView;
        this.f44082OooO0o0 = appCompatTextView2;
        this.f44081OooO0o = appCompatTextView3;
        this.f44083OooO0oO = xRefreshLayout2;
    }

    @NonNull
    public static k2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44077OooO00o;
    }

    @NonNull
    public static k2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_fragment_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.clHeader;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = o0OO00O.rvBadge;
            RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
            if (recyclerView != null) {
                i = o0OO00O.tvBadgeOrder;
                AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatTextView != null) {
                    i = o0OO00O.tvBadgeRank;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                    if (appCompatTextView2 != null) {
                        i = o0OO00O.tvBadgeStar;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                        if (appCompatTextView3 != null) {
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) viewInflate;
                            return new k2(xRefreshLayout, constraintLayout, recyclerView, appCompatTextView, appCompatTextView2, appCompatTextView3, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
