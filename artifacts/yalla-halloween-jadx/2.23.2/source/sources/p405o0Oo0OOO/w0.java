package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45653OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f45654OooO0O0;

    public w0(@NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.f45653OooO00o = constraintLayout;
        this.f45654OooO0O0 = view;
    }

    @NonNull
    public static w0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45653OooO00o;
    }

    @NonNull
    public static w0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_item_quick_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.coin;
        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.line), viewInflate)) != null) {
            i = o0OO00O.money;
            if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                return new w0((ConstraintLayout) viewInflate, viewOooO00o);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
