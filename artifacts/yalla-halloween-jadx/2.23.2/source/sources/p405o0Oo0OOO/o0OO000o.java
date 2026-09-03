package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final StateLayout f44575OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final BaseWebView f44576OooO0O0;

    public o0OO000o(@NonNull StateLayout stateLayout, @NonNull BaseWebView baseWebView) {
        this.f44575OooO00o = stateLayout;
        this.f44576OooO0O0 = baseWebView;
    }

    @NonNull
    public static o0OO000o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44575OooO00o;
    }

    @NonNull
    public static o0OO000o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.fragment_store_crystal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.webView;
        BaseWebView baseWebView = (BaseWebView) OooO0O0.OooO00o(i, viewInflate);
        if (baseWebView != null) {
            return new o0OO000o((StateLayout) viewInflate, baseWebView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
