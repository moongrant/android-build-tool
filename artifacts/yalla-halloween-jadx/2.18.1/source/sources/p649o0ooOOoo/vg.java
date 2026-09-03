package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserIdentityView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class vg implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f50820OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50821OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50822OooO0Oo;

    public vg(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull UserIdentityView userIdentityView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView) {
        this.f50819OooO00o = linearLayoutCompat;
        this.f50820OooO0O0 = userIdentityView;
        this.f50821OooO0OO = linearLayoutCompat2;
        this.f50822OooO0Oo = textView;
    }

    @NonNull
    public static vg inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50819OooO00o;
    }

    @NonNull
    public static vg inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_layout_user_info_identity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivIdentity;
        UserIdentityView userIdentityView = (UserIdentityView) o00Oo0.OooO00o(viewInflate, R.id.ivIdentity);
        if (userIdentityView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvIdentity);
            if (textView != null) {
                return new vg(linearLayoutCompat, userIdentityView, linearLayoutCompat, textView);
            }
            i = R.id.tvIdentity;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
