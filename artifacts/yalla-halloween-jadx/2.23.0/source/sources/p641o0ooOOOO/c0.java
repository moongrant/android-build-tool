package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.support.statebutton.StateButton;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f57632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final StateButton f57633OooO0OO;

    public c0(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull StateButton stateButton) {
        this.f57631OooO00o = linearLayout;
        this.f57632OooO0O0 = button;
        this.f57633OooO0OO = stateButton;
    }

    @NonNull
    public static c0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57631OooO00o;
    }

    @NonNull
    public static c0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_re_open_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.btActiveAccount;
        Button button = (Button) OooOO0.OooO00o(i, viewInflate);
        if (button != null) {
            i = oO00O0oO.btCancelActive;
            StateButton stateButton = (StateButton) OooOO0.OooO00o(i, viewInflate);
            if (stateButton != null) {
                return new c0((LinearLayout) viewInflate, button, stateButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
