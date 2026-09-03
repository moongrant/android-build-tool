package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class fi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49405OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49406OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49407OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49408OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49409OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49410OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49411OooO0oO;

    public fi(@NonNull XRefreshLayout xRefreshLayout, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull XRefreshLayout xRefreshLayout2) {
        this.f49405OooO00o = xRefreshLayout;
        this.f49406OooO0O0 = constraintLayout;
        this.f49407OooO0OO = recyclerView;
        this.f49408OooO0Oo = appCompatTextView;
        this.f49410OooO0o0 = appCompatTextView2;
        this.f49409OooO0o = appCompatTextView3;
        this.f49411OooO0oO = xRefreshLayout2;
    }

    @NonNull
    public static fi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49405OooO00o;
    }

    @NonNull
    public static fi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_fragment_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.clHeader;
        ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.clHeader);
        if (constraintLayout != null) {
            i = R.id.rvBadge;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvBadge);
            if (recyclerView != null) {
                i = R.id.tvBadgeOrder;
                AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeOrder);
                if (appCompatTextView != null) {
                    i = R.id.tvBadgeRank;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeRank);
                    if (appCompatTextView2 != null) {
                        i = R.id.tvBadgeStar;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvBadgeStar);
                        if (appCompatTextView3 != null) {
                            XRefreshLayout xRefreshLayout = (XRefreshLayout) viewInflate;
                            return new fi(xRefreshLayout, constraintLayout, recyclerView, appCompatTextView, appCompatTextView2, appCompatTextView3, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
