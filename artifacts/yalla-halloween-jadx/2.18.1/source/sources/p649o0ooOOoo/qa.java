package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qa implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50365OooO0O0;

    public qa(@NonNull ConstraintLayout constraintLayout, @NonNull StateButton stateButton) {
        this.f50364OooO00o = constraintLayout;
        this.f50365OooO0O0 = stateButton;
    }

    @NonNull
    public static qa inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50364OooO00o;
    }

    @NonNull
    public static qa inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_clock_dialog_network, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivNetworkFailed;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivNetworkFailed)) != null) {
            i = R.id.tvNetworkFailed1;
            if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNetworkFailed1)) != null) {
                i = R.id.tvNetworkFailed2;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNetworkFailed2)) != null) {
                    i = R.id.tvTryAgain;
                    StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.tvTryAgain);
                    if (stateButton != null) {
                        return new qa((ConstraintLayout) viewInflate, stateButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
