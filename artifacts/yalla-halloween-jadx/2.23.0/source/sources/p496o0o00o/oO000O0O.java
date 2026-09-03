package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0O implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49133OooO0Oo;

    public oO000O0O(UserInfoEditActivity userInfoEditActivity) {
        this.f49133OooO0Oo = userInfoEditActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = UserInfoEditActivity.f27283Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f49133OooO0Oo;
        userInfoEditActivity.OooOoO().f58088OooOOO0.setText(OooOOOO.OooO((String) obj));
        userInfoEditActivity.f27299Oooo00O.setValue(null);
    }
}
