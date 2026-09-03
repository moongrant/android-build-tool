package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ea implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f49232OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f49233OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49234OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49235OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49236OooO0o0;

    public ea(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull StateButton stateButton, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49232OooO00o = linearLayoutCompat;
        this.f49233OooO0O0 = stateButton;
        this.f49234OooO0OO = recyclerView;
        this.f49235OooO0Oo = textView;
        this.f49236OooO0o0 = xRefreshLayout;
    }

    @NonNull
    public static ea inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49232OooO00o;
    }

    @NonNull
    public static ea inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_activity_arrears_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btRecharge;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btRecharge);
        if (stateButton != null) {
            i = R.id.rvArrears;
            RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvArrears);
            if (recyclerView != null) {
                i = R.id.tvArrearsCount;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvArrearsCount);
                if (textView != null) {
                    i = R.id.xflArrears;
                    XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xflArrears);
                    if (xRefreshLayout != null) {
                        return new ea((LinearLayoutCompat) viewInflate, stateButton, recyclerView, textView, xRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
