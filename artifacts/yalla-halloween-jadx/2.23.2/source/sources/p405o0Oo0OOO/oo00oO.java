package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexboxLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45261OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f45262OooO0O0;

    public oo00oO(@NonNull LinearLayout linearLayout, @NonNull FlexboxLayout flexboxLayout) {
        this.f45261OooO00o = linearLayout;
        this.f45262OooO0O0 = flexboxLayout;
    }

    @NonNull
    public static oo00oO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45261OooO00o;
    }

    @NonNull
    public static oo00oO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_event_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.info;
        if (((TextView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i2 = o0OO00O.tags;
            FlexboxLayout flexboxLayout = (FlexboxLayout) OooO0O0.OooO00o(i2, viewInflate);
            if (flexboxLayout != null) {
                i2 = o0OO00O.title;
                if (((TextView) OooO0O0.OooO00o(i2, viewInflate)) != null) {
                    return new oo00oO(linearLayout, flexboxLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
