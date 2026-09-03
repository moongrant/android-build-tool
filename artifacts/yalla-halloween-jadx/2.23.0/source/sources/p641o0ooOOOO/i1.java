package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexboxLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58097OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f58098OooO0O0;

    public i1(@NonNull LinearLayout linearLayout, @NonNull FlexboxLayout flexboxLayout) {
        this.f58097OooO00o = linearLayout;
        this.f58098OooO0O0 = flexboxLayout;
    }

    @NonNull
    public static i1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58097OooO00o;
    }

    @NonNull
    public static i1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_event_tag, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.info;
        if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            int i2 = oO00O0oO.tags;
            FlexboxLayout flexboxLayout = (FlexboxLayout) OooOO0.OooO00o(i2, viewInflate);
            if (flexboxLayout != null) {
                i2 = oO00O0oO.title;
                if (((TextView) OooOO0.OooO00o(i2, viewInflate)) != null) {
                    return new i1(linearLayout, flexboxLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
