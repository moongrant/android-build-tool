package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44331OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44332OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44333OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f44335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44336OooO0o0;

    public o00O0OOO(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f44331OooO00o = frameLayout;
        this.f44332OooO0O0 = imageView;
        this.f44333OooO0OO = linearLayout;
        this.f44334OooO0Oo = recyclerView;
        this.f44336OooO0o0 = textView;
        this.f44335OooO0o = xRefreshLayout;
    }

    @NonNull
    public static o00O0OOO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44331OooO00o;
    }

    @NonNull
    public static o00O0OOO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.activity_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivReward2;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.llGetCoinAnim;
            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
            if (linearLayout != null) {
                i = o0OO00O.rvTask;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = o0OO00O.tvAnimNum;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = o0OO00O.xrl;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (xRefreshLayout != null) {
                            return new o00O0OOO((FrameLayout) viewInflate, imageView, linearLayout, recyclerView, textView, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
