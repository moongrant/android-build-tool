package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58637OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58638OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58639OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58640OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f58641OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f58642OooO0o0;

    public q0(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f58637OooO00o = frameLayout;
        this.f58638OooO0O0 = imageView;
        this.f58639OooO0OO = linearLayout;
        this.f58640OooO0Oo = recyclerView;
        this.f58642OooO0o0 = textView;
        this.f58641OooO0o = xRefreshLayout;
    }

    @NonNull
    public static q0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58637OooO00o;
    }

    @NonNull
    public static q0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.activity_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivReward2;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.llGetCoinAnim;
            LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = oO00O0oO.rvTask;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = oO00O0oO.tvAnimNum;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.xrl;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) OooOO0.OooO00o(i, viewInflate);
                        if (xRefreshLayout != null) {
                            return new q0((FrameLayout) viewInflate, imageView, linearLayout, recyclerView, textView, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
