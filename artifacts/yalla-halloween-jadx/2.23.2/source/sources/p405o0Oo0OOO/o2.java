package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.ui.view.StateLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44700OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44701OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f44702OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f44703OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44704OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44705OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f44706OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f44707OooO0oo;

    public o2(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f44700OooO00o = linearLayout;
        this.f44701OooO0O0 = imageView;
        this.f44702OooO0OO = recyclerView;
        this.f44703OooO0Oo = stateLayout;
        this.f44705OooO0o0 = textView;
        this.f44704OooO0o = textView2;
        this.f44706OooO0oO = textView3;
        this.f44707OooO0oo = textView4;
    }

    @NonNull
    public static o2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44700OooO00o;
    }

    @NonNull
    public static o2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_fragment_coin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.firstChargeReward;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i = o0OO00O.layoutTop;
            if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = o0OO00O.stateLayout;
                    StateLayout stateLayout = (StateLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (stateLayout != null) {
                        i = o0OO00O.tvArea;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = o0OO00O.tvHelp;
                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                i = o0OO00O.tvMinWidth;
                                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView3 != null) {
                                    i = o0OO00O.tvTag;
                                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView4 != null) {
                                        return new o2(linearLayout, imageView, recyclerView, stateLayout, textView, textView2, textView3, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
