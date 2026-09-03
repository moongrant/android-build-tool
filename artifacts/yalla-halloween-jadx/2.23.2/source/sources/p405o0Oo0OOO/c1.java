package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.UserPremiumView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f43754OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f43755OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f43756OooO0Oo;

    public c1(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull UserPremiumView userPremiumView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView) {
        this.f43753OooO00o = linearLayoutCompat;
        this.f43754OooO0O0 = userPremiumView;
        this.f43755OooO0OO = linearLayoutCompat2;
        this.f43756OooO0Oo = textView;
    }

    @NonNull
    public static c1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43753OooO00o;
    }

    @NonNull
    public static c1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_layout_user_info_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivVip;
        UserPremiumView userPremiumView = (UserPremiumView) OooO0O0.OooO00o(i, viewInflate);
        if (userPremiumView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            int i2 = o0OO00O.tvVipName;
            TextView textView = (TextView) OooO0O0.OooO00o(i2, viewInflate);
            if (textView != null) {
                return new c1(linearLayoutCompat, userPremiumView, linearLayoutCompat, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
