package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000OOo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44772OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f44773OooO0O0;

    public oO000OOo(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton) {
        this.f44772OooO00o = constraintLayout;
        this.f44773OooO0O0 = stateButton;
    }

    @NonNull
    public static oO000OOo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44772OooO00o;
    }

    @NonNull
    public static oO000OOo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_clock_dialog_network, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivNetworkFailed;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.tvNetworkFailed1;
            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.tvNetworkFailed2;
                if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.tvTryAgain;
                    StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
                    if (stateButton != null) {
                        return new oO000OOo((ConstraintLayout) viewInflate, stateButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
