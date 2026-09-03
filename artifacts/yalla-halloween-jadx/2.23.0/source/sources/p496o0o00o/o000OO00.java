package p496o0o00o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f48993OooO0Oo;

    public o000OO00(FollowerActivity followerActivity) {
        this.f48993OooO0Oo = followerActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        long jLongValue = l.longValue();
        FollowerActivity followerActivity = this.f48993OooO0Oo;
        o00 o00Var = followerActivity.f27109OooOo0;
        o00 o00Var2 = null;
        if (o00Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var = null;
        }
        int size = o00Var.f10111OooOOoo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            o00 o00Var3 = followerActivity.f27109OooOo0;
            if (o00Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00Var3 = null;
            }
            UserInfoModel userInfoModel = (UserInfoModel) o00Var3.f10111OooOOoo.get(i);
            Intrinsics.checkNotNull(userInfoModel);
            if (jLongValue == userInfoModel.getUserId()) {
                break;
            } else {
                i++;
            }
        }
        if (i > 0) {
            o00 o00Var4 = followerActivity.f27109OooOo0;
            if (o00Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00Var4 = null;
            }
            if (i < o00Var4.f10111OooOOoo.size()) {
                o00 o00Var5 = followerActivity.f27109OooOo0;
                if (o00Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    o00Var2 = o00Var5;
                }
                o00Var2.OooOOo(i);
            }
        }
    }
}
