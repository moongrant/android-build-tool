package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.support.statebutton.StateButton;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class n6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50068OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50069OooO0O0;

    public n6(@NonNull LinearLayout linearLayout, @NonNull StateButton stateButton) {
        this.f50068OooO00o = linearLayout;
        this.f50069OooO0O0 = stateButton;
    }

    @NonNull
    public static n6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50068OooO00o;
    }

    @NonNull
    public static n6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_login_error, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btRetry);
        if (stateButton != null) {
            return new n6((LinearLayout) viewInflate, stateButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.btRetry)));
    }
}
