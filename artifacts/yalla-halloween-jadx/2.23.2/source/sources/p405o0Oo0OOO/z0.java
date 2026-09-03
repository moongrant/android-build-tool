package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.UserIdentityView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45722OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f45723OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45724OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f45725OooO0Oo;

    public z0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull UserIdentityView userIdentityView, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TextView textView) {
        this.f45722OooO00o = linearLayoutCompat;
        this.f45723OooO0O0 = userIdentityView;
        this.f45724OooO0OO = linearLayoutCompat2;
        this.f45725OooO0Oo = textView;
    }

    @NonNull
    public static z0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45722OooO00o;
    }

    @NonNull
    public static z0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_layout_user_info_identity, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivIdentity;
        UserIdentityView userIdentityView = (UserIdentityView) OooO0O0.OooO00o(i, viewInflate);
        if (userIdentityView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
            int i2 = o0OO00O.tvIdentity;
            TextView textView = (TextView) OooO0O0.OooO00o(i2, viewInflate);
            if (textView != null) {
                return new z0(linearLayoutCompat, userIdentityView, linearLayoutCompat, textView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
