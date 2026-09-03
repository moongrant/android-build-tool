package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44453OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44455OooO0OO;

    public o0O00OO(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.f44453OooO00o = constraintLayout;
        this.f44454OooO0O0 = constraintLayout2;
        this.f44455OooO0OO = appCompatTextView;
    }

    @NonNull
    public static o0O00OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44453OooO00o;
    }

    @NonNull
    public static o0O00OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_send_reward_first_time, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = o0OO00O.content;
        AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
        if (appCompatTextView != null) {
            return new o0O00OO(constraintLayout, constraintLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
