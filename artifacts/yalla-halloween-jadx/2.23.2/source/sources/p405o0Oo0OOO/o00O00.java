package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f44256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f44257OooO0OO;

    public o00O00(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull StateButton stateButton) {
        this.f44255OooO00o = linearLayout;
        this.f44256OooO0O0 = button;
        this.f44257OooO0OO = stateButton;
    }

    @NonNull
    public static o00O00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44255OooO00o;
    }

    @NonNull
    public static o00O00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.account_activity_re_open_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.btActiveAccount;
        Button button = (Button) OooO0O0.OooO00o(i, viewInflate);
        if (button != null) {
            i = o0OO00O.btCancelActive;
            StateButton stateButton = (StateButton) OooO0O0.OooO00o(i, viewInflate);
            if (stateButton != null) {
                return new o00O00((LinearLayout) viewInflate, button, stateButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
