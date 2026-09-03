package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class h9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58073OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58074OooO0O0;

    public h9(@NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.f58073OooO00o = constraintLayout;
        this.f58074OooO0O0 = view;
    }

    @NonNull
    public static h9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58073OooO00o;
    }

    @NonNull
    public static h9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_item_quick_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.coin;
        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.line), viewInflate)) != null) {
            i = oO00O0oO.money;
            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                return new h9((ConstraintLayout) viewInflate, viewOooO00o);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
