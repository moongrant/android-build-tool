package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oa implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58546OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58547OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58548OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58549OooO0Oo;

    public oa(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58546OooO00o = constraintLayout;
        this.f58547OooO0O0 = constraintLayout2;
        this.f58548OooO0OO = textView;
        this.f58549OooO0Oo = textView2;
    }

    @NonNull
    public static oa OooO00o(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = oO00O0oO.ivGold;
        if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.tvGold;
            TextView textView = (TextView) OooOO0.OooO00o(i, view);
            if (textView != null) {
                i = oO00O0oO.tvRecharge;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, view);
                if (textView2 != null) {
                    return new oa(constraintLayout, constraintLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58546OooO00o;
    }

    @NonNull
    public static oa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_vehicle_store_foot, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
