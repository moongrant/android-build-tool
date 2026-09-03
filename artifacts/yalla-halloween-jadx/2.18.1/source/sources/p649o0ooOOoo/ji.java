package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.StateLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ji implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f49803OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49804OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f49805OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49806OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49807OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49808OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49809OooO0oo;

    public ji(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f49802OooO00o = linearLayout;
        this.f49803OooO0O0 = imageView;
        this.f49804OooO0OO = recyclerView;
        this.f49805OooO0Oo = stateLayout;
        this.f49807OooO0o0 = textView;
        this.f49806OooO0o = textView2;
        this.f49808OooO0oO = textView3;
        this.f49809OooO0oo = textView4;
    }

    @NonNull
    public static ji inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49802OooO00o;
    }

    @NonNull
    public static ji inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_fragment_coin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.firstChargeReward;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.firstChargeReward);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i = R.id.layoutTop;
            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutTop)) != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.stateLayout;
                    StateLayout stateLayout = (StateLayout) o00Oo0.OooO00o(viewInflate, R.id.stateLayout);
                    if (stateLayout != null) {
                        i = R.id.tvArea;
                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvArea);
                        if (textView != null) {
                            i = R.id.tvHelp;
                            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvHelp);
                            if (textView2 != null) {
                                i = R.id.tvMinWidth;
                                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMinWidth);
                                if (textView3 != null) {
                                    i = R.id.tvTag;
                                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTag);
                                    if (textView4 != null) {
                                        return new ji(linearLayout, imageView, recyclerView, stateLayout, textView, textView2, textView3, textView4);
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
