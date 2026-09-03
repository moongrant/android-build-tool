package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class sg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f50619OooO0O0;

    public sg(@NonNull ConstraintLayout constraintLayout, @NonNull View view) {
        this.f50618OooO00o = constraintLayout;
        this.f50619OooO0O0 = view;
    }

    @NonNull
    public static sg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50618OooO00o;
    }

    @NonNull
    public static sg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_item_quick_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.coin;
        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.coin)) != null) {
            i = R.id.line;
            View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.line);
            if (viewOooO00o != null) {
                i = R.id.money;
                if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.money)) != null) {
                    return new sg((ConstraintLayout) viewInflate, viewOooO00o);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
