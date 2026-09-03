package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ph implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50328OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f50329OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f50330OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50331OooO0Oo;

    public ph(@NonNull ConstraintLayout constraintLayout, @NonNull XRefreshLayout xRefreshLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f50328OooO00o = constraintLayout;
        this.f50329OooO0O0 = xRefreshLayout;
        this.f50330OooO0OO = recyclerView;
        this.f50331OooO0Oo = textView;
    }

    @NonNull
    public static ph inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50328OooO00o;
    }

    @NonNull
    public static ph inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_support_top, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.headerLayout;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.headerLayout);
        if (viewOooO00o != null) {
            f7.OooO00o(viewOooO00o);
            i = R.id.refresh;
            XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.refresh);
            if (xRefreshLayout != null) {
                i = R.id.rvSupport;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvSupport);
                if (recyclerView != null) {
                    i = R.id.time;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.time);
                    if (textView != null) {
                        return new ph((ConstraintLayout) viewInflate, xRefreshLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
