package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class s6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50512OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f50513OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f50514OooO0OO;

    public s6(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull StateButton stateButton) {
        this.f50512OooO00o = linearLayout;
        this.f50513OooO0O0 = button;
        this.f50514OooO0OO = stateButton;
    }

    @NonNull
    public static s6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50512OooO00o;
    }

    @NonNull
    public static s6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_re_open_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btActiveAccount;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btActiveAccount);
        if (button != null) {
            i = R.id.btCancelActive;
            StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btCancelActive);
            if (stateButton != null) {
                return new s6((LinearLayout) viewInflate, button, stateButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
