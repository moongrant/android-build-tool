package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f59439OooO0O0;

    public z3(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton) {
        this.f59438OooO00o = constraintLayout;
        this.f59439OooO0O0 = stateButton;
    }

    @NonNull
    public static z3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59438OooO00o;
    }

    @NonNull
    public static z3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_clock_dialog_network, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivNetworkFailed;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.tvNetworkFailed1;
            if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.tvNetworkFailed2;
                if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.tvTryAgain;
                    StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
                    if (stateButton != null) {
                        return new z3((ConstraintLayout) viewInflate, stateButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
