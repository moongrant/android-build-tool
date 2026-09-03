package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.UserPremiumView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class fb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57944OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f57945OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f57946OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f57947OooO0Oo;

    public fb(@NonNull LinearLayout linearLayout, @NonNull UserPremiumView userPremiumView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f57944OooO00o = linearLayout;
        this.f57945OooO0O0 = userPremiumView;
        this.f57946OooO0OO = textView;
        this.f57947OooO0Oo = textView2;
    }

    @NonNull
    public static fb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57944OooO00o;
    }

    @NonNull
    public static fb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_vip_ari_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.iv_ari_header;
        UserPremiumView userPremiumView = (UserPremiumView) OooOO0.OooO00o(i, viewInflate);
        if (userPremiumView != null) {
            i = oO00O0oO.tv_ari;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.tv_num;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    return new fb((LinearLayout) viewInflate, userPremiumView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
