package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58927OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58928OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58929OooO0OO;

    public u1(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.f58927OooO00o = constraintLayout;
        this.f58928OooO0O0 = constraintLayout2;
        this.f58929OooO0OO = appCompatTextView;
    }

    @NonNull
    public static u1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58927OooO00o;
    }

    @NonNull
    public static u1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_send_reward_first_time, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = oO00O0oO.content;
        AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
        if (appCompatTextView != null) {
            return new u1(constraintLayout, constraintLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
