package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.UserPremiumView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class n9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58463OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f58464OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f58465OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58466OooO0Oo;

    public n9(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull UserPremiumView userPremiumView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView) {
        this.f58463OooO00o = linearLayoutCompat;
        this.f58464OooO0O0 = userPremiumView;
        this.f58465OooO0OO = linearLayoutCompat2;
        this.f58466OooO0Oo = textView;
    }

    @NonNull
    public static n9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58463OooO00o;
    }

    @NonNull
    public static n9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_layout_user_info_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivVip;
        UserPremiumView userPremiumView = (UserPremiumView) OooOO0.OooO00o(i, viewInflate);
        if (userPremiumView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            int i2 = oO00O0oO.tvVipName;
            TextView textView = (TextView) OooOO0.OooO00o(i2, viewInflate);
            if (textView != null) {
                return new n9(linearLayoutCompat, userPremiumView, linearLayoutCompat, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
