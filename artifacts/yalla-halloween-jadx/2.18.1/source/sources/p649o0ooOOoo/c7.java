package p649o0ooOOoo;

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
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class c7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49072OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49073OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49074OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49075OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final XRefreshLayout f49076OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49077OooO0o0;

    public c7(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull XRefreshLayout xRefreshLayout) {
        this.f49072OooO00o = frameLayout;
        this.f49073OooO0O0 = imageView;
        this.f49074OooO0OO = linearLayout;
        this.f49075OooO0Oo = recyclerView;
        this.f49077OooO0o0 = textView;
        this.f49076OooO0o = xRefreshLayout;
    }

    @NonNull
    public static c7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49072OooO00o;
    }

    @NonNull
    public static c7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_task, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivReward2;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivReward2);
        if (imageView != null) {
            i = R.id.llGetCoinAnim;
            LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llGetCoinAnim);
            if (linearLayout != null) {
                i = R.id.rvTask;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvTask);
                if (recyclerView != null) {
                    i = R.id.tvAnimNum;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAnimNum);
                    if (textView != null) {
                        i = R.id.xrl;
                        XRefreshLayout xRefreshLayout = (XRefreshLayout) o00Oo0.OooO00o(viewInflate, R.id.xrl);
                        if (xRefreshLayout != null) {
                            return new c7((FrameLayout) viewInflate, imageView, linearLayout, recyclerView, textView, xRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
