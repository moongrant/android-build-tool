package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43783OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43784OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f43785OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43786OooO0Oo;

    public d2(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f43783OooO00o = constraintLayout;
        this.f43784OooO0O0 = constraintLayout2;
        this.f43785OooO0OO = textView;
        this.f43786OooO0Oo = textView2;
    }

    @NonNull
    public static d2 OooO00o(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = o0OO00O.ivGold;
        if (((ImageView) OooO0O0.OooO00o(i, view)) != null) {
            i = o0OO00O.tvGold;
            TextView textView = (TextView) OooO0O0.OooO00o(i, view);
            if (textView != null) {
                i = o0OO00O.tvRecharge;
                TextView textView2 = (TextView) OooO0O0.OooO00o(i, view);
                if (textView2 != null) {
                    return new d2(constraintLayout, constraintLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static d2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43783OooO00o;
    }

    @NonNull
    public static d2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_vehicle_store_foot, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
