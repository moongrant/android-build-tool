package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00o0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44871OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f44872OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f44873OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f44874OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f44875OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44876OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44877OooO0oo;

    public oO0O00o0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ComposeView composeView, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f44870OooO00o = linearLayout;
        this.f44871OooO0O0 = linearLayout2;
        this.f44872OooO0OO = collapsingToolbarLayout;
        this.f44873OooO0Oo = composeView;
        this.f44875OooO0o0 = fixedRecyclerView;
        this.f44874OooO0o = sVGAView;
        this.f44876OooO0oO = textView;
        this.f44877OooO0oo = xRefreshLayout;
    }

    @NonNull
    public static oO0O00o0 OooO00o(@NonNull View view) {
        int i = o0OO00O.abl_related;
        if (((AppBarLayout) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.clChatServerConnStatus;
            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, view);
            if (linearLayout != null) {
                i = o0OO00O.ctl_room;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, view);
                if (collapsingToolbarLayout != null) {
                    i = o0OO00O.myRoomCV;
                    ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, view);
                    if (composeView != null) {
                        i = o0OO00O.rvMessage;
                        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) OooO0O0.OooO00o(i, view);
                        if (fixedRecyclerView != null) {
                            i = o0OO00O.svgaLoading;
                            SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, view);
                            if (sVGAView != null) {
                                i = o0OO00O.tvMessageTitle;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                                if (textView != null) {
                                    i = o0OO00O.xrlMessage;
                                    XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, view);
                                    if (xRefreshLayout != null) {
                                        return new oO0O00o0((LinearLayout) view, linearLayout, collapsingToolbarLayout, composeView, fixedRecyclerView, sVGAView, textView, xRefreshLayout);
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
    public static oO0O00o0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44870OooO00o;
    }

    @NonNull
    public static oO0O00o0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.message_fragment_message_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
