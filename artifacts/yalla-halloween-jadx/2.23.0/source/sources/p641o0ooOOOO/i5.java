package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.code.android.uikit.svga.SVGAView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class i5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f58114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f58115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f58116OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f58117OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f58118OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58119OooO0oo;

    public i5(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ComposeView composeView, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f58112OooO00o = linearLayout;
        this.f58113OooO0O0 = linearLayout2;
        this.f58114OooO0OO = collapsingToolbarLayout;
        this.f58115OooO0Oo = composeView;
        this.f58117OooO0o0 = fixedRecyclerView;
        this.f58116OooO0o = sVGAView;
        this.f58118OooO0oO = textView;
        this.f58119OooO0oo = xRefreshLayout;
    }

    @NonNull
    public static i5 OooO00o(@NonNull View view) {
        int i = oO00O0oO.abl_related;
        if (((AppBarLayout) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.clChatServerConnStatus;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, view);
            if (linearLayout != null) {
                i = oO00O0oO.ctl_room;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, view);
                if (collapsingToolbarLayout != null) {
                    i = oO00O0oO.myRoomCV;
                    ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, view);
                    if (composeView != null) {
                        i = oO00O0oO.rvMessage;
                        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooOO0.OooO00o(i, view);
                        if (fixedRecyclerView != null) {
                            i = oO00O0oO.svgaLoading;
                            SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, view);
                            if (sVGAView != null) {
                                i = oO00O0oO.tvMessageTitle;
                                TextView textView = (TextView) OooOO0.OooO00o(i, view);
                                if (textView != null) {
                                    i = oO00O0oO.xrlMessage;
                                    XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, view);
                                    if (xRefreshLayout != null) {
                                        return new i5((LinearLayout) view, linearLayout, collapsingToolbarLayout, composeView, fixedRecyclerView, sVGAView, textView, xRefreshLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static i5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58112OooO00o;
    }

    @NonNull
    public static i5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_fragment_message_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
