package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class yg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f51043OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f51044OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f51045OooO0Oo;

    public yg(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull UserPremiumView userPremiumView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView) {
        this.f51042OooO00o = linearLayoutCompat;
        this.f51043OooO0O0 = userPremiumView;
        this.f51044OooO0OO = linearLayoutCompat2;
        this.f51045OooO0Oo = textView;
    }

    @NonNull
    public static yg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51042OooO00o;
    }

    @NonNull
    public static yg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_layout_user_info_vip, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivVip;
        UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.ivVip);
        if (userPremiumView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvVipName);
            if (textView != null) {
                return new yg(linearLayoutCompat, userPremiumView, linearLayoutCompat, textView);
            }
            i = R.id.tvVipName;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
