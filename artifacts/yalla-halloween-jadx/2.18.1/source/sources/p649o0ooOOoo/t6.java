package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class t6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50630OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50631OooO0OO;

    public t6(@NonNull LinearLayout linearLayout, @NonNull StateButton stateButton, @NonNull TextView textView) {
        this.f50629OooO00o = linearLayout;
        this.f50630OooO0O0 = stateButton;
        this.f50631OooO0OO = textView;
    }

    @NonNull
    public static t6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50629OooO00o;
    }

    @NonNull
    public static t6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_turn_on_login_protection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btTurnOnProtection;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btTurnOnProtection);
        if (stateButton != null) {
            i = R.id.tvVerificationPhone;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVerificationPhone);
            if (textView != null) {
                return new t6((LinearLayout) viewInflate, stateButton, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
