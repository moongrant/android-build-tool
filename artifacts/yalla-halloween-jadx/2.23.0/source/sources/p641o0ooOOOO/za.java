package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class za implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59503OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59504OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f59505OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final StateLayout f59506OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59507OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59508OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f59509OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f59510OooO0oo;

    public za(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull StateLayout stateLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f59503OooO00o = linearLayout;
        this.f59504OooO0O0 = imageView;
        this.f59505OooO0OO = recyclerView;
        this.f59506OooO0Oo = stateLayout;
        this.f59508OooO0o0 = textView;
        this.f59507OooO0o = textView2;
        this.f59509OooO0oO = textView3;
        this.f59510OooO0oo = textView4;
    }

    @NonNull
    public static za inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59503OooO00o;
    }

    @NonNull
    public static za inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_fragment_coin, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.firstChargeReward;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            i = oO00O0oO.layoutTop;
            if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.recyclerView;
                RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                if (recyclerView != null) {
                    i = oO00O0oO.stateLayout;
                    StateLayout stateLayout = (StateLayout) OooOO0.OooO00o(i, viewInflate);
                    if (stateLayout != null) {
                        i = oO00O0oO.tvArea;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            i = oO00O0oO.tvHelp;
                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView2 != null) {
                                i = oO00O0oO.tvMinWidth;
                                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView3 != null) {
                                    i = oO00O0oO.tvTag;
                                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView4 != null) {
                                        return new za(linearLayout, imageView, recyclerView, stateLayout, textView, textView2, textView3, textView4);
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
