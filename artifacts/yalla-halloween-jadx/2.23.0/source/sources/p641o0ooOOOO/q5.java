package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q5 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58666OooO0O0;

    public q5(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.f58665OooO00o = constraintLayout;
        this.f58666OooO0O0 = constraintLayout2;
    }

    @NonNull
    public static q5 OooO00o(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = oO00O0oO.ivWarn;
        if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
            i = oO00O0oO.ivWarnClose;
            if (((ImageView) OooOO0.OooO00o(i, view)) != null) {
                i = oO00O0oO.tvWarn;
                if (((TextView) OooOO0.OooO00o(i, view)) != null) {
                    return new q5(constraintLayout, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static q5 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58665OooO00o;
    }

    @NonNull
    public static q5 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.message_layout_chat_warn_tips, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
