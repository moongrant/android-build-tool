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
public final class s7 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final StateButton f50516OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50517OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50519OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50520OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50521OooO0oO;

    public s7(@NonNull LinearLayout linearLayout, @NonNull StateButton stateButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f50515OooO00o = linearLayout;
        this.f50516OooO0O0 = stateButton;
        this.f50517OooO0OO = textView;
        this.f50518OooO0Oo = textView2;
        this.f50520OooO0o0 = textView3;
        this.f50519OooO0o = textView4;
        this.f50521OooO0oO = textView5;
    }

    @NonNull
    public static s7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50515OooO00o;
    }

    @NonNull
    public static s7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_common_suspension, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.btConfirm;
        StateButton stateButton = (StateButton) o00Oo0.OooO00o(viewInflate, R.id.btConfirm);
        if (stateButton != null) {
            i = R.id.tvBlockedId;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBlockedId);
            if (textView != null) {
                i = R.id.tvBlockedMsg;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBlockedMsg);
                if (textView2 != null) {
                    i = R.id.tvBlockedReason;
                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvBlockedReason);
                    if (textView3 != null) {
                        i = R.id.tvRequest;
                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRequest);
                        if (textView4 != null) {
                            i = R.id.tvUnblockTime;
                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvUnblockTime);
                            if (textView5 != null) {
                                return new s7((LinearLayout) viewInflate, stateButton, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
