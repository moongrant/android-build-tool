package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final StateLayout f58652OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final BaseWebView f58653OooO0O0;

    public q2(@NonNull StateLayout stateLayout, @NonNull BaseWebView baseWebView) {
        this.f58652OooO00o = stateLayout;
        this.f58653OooO0O0 = baseWebView;
    }

    @NonNull
    public static q2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58652OooO00o;
    }

    @NonNull
    public static q2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.fragment_store_crystal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.webView;
        BaseWebView baseWebView = (BaseWebView) OooOO0.OooO00o(i, viewInflate);
        if (baseWebView != null) {
            return new q2((StateLayout) viewInflate, baseWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
