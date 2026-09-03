package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class bc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f49022OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f49023OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f49024OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final FixedRecyclerView f49025OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49026OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49027OooO0oo;

    public bc(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ComposeView composeView, @NonNull FixedRecyclerView fixedRecyclerView, @NonNull SVGAView sVGAView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49020OooO00o = linearLayout;
        this.f49021OooO0O0 = linearLayout2;
        this.f49022OooO0OO = collapsingToolbarLayout;
        this.f49023OooO0Oo = composeView;
        this.f49025OooO0o0 = fixedRecyclerView;
        this.f49024OooO0o = sVGAView;
        this.f49026OooO0oO = textView;
        this.f49027OooO0oo = xRefreshLayout;
    }

    @NonNull
    public static bc OooO00o(@NonNull View view) {
        int i = R.id.abl_related;
        if (((AppBarLayout) o00Oo0.OooO00o(view, R.id.abl_related)) != null) {
            i = R.id.clChatServerConnStatus;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(view, R.id.clChatServerConnStatus);
            if (linearLayout != null) {
                i = R.id.ctl_room;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) o00Oo0.OooO00o(view, R.id.ctl_room);
                if (collapsingToolbarLayout != null) {
                    i = R.id.myRoomCV;
                    ComposeView composeView = (ComposeView) o00Oo0.OooO00o(view, R.id.myRoomCV);
                    if (composeView != null) {
                        i = R.id.rvMessage;
                        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) o00Oo0.OooO00o(view, R.id.rvMessage);
                        if (fixedRecyclerView != null) {
                            i = R.id.svgaLoading;
                            SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(view, R.id.svgaLoading);
                            if (sVGAView != null) {
                                i = R.id.tvMessageTitle;
                                TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvMessageTitle);
                                if (textView != null) {
                                    i = R.id.xrlMessage;
                                    XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(view, R.id.xrlMessage);
                                    if (xRefreshLayout != null) {
                                        return new bc((LinearLayout) view, linearLayout, collapsingToolbarLayout, composeView, fixedRecyclerView, sVGAView, textView, xRefreshLayout);
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
    public static bc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49020OooO00o;
    }

    @NonNull
    public static bc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_fragment_message_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
