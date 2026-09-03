package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f59388OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f59389OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59390OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f59392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final SVGAView f59393OooO0o0;

    public y5(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull SVGAView sVGAView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f59388OooO00o = frameLayout;
        this.f59389OooO0O0 = composeView;
        this.f59390OooO0OO = linearLayout;
        this.f59391OooO0Oo = recyclerView;
        this.f59393OooO0o0 = sVGAView;
        this.f59392OooO0o = xRefreshLayout;
    }

    @NonNull
    public static y5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59388OooO00o;
    }

    @NonNull
    public static y5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.moment_activity_reply, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomComposeView;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.contentLayout;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = oO00O0oO.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = oO00O0oO.sVGAView;
                    SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                    if (sVGAView != null) {
                        i = oO00O0oO.xRefreshLayout;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                        if (xRefreshLayout != null) {
                            return new y5((FrameLayout) viewInflate, composeView, linearLayout, recyclerView, sVGAView, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
