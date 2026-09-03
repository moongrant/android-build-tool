package p566o0oOo00O;

import android.content.Context;
import android.os.Looper;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.CommonModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f45194OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f45195OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(FollowerActivity followerActivity, Context context, UserInfoModel userInfoModel) {
        super(context);
        this.f45195OooO0O0 = followerActivity;
        this.f45194OooO00o = userInfoModel;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        CommonModel commonModel = (CommonModel) o0Oo0oo.OooO0O0(str, CommonModel.class);
        if (commonModel == null || !commonModel.f11862code.equals("1000")) {
            return;
        }
        if (this.f45194OooO00o.getIsFollow()) {
            this.f45194OooO00o.setFollow(false);
            String string = this.f45195OooO0O0.getResources().getString(R.string.Unfollowed);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(string == null || StringsKt.isBlank(string))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        } else {
            this.f45194OooO00o.setFollow(true);
            String string2 = this.f45195OooO0O0.getResources().getString(R.string.topic_following);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (!(string2 == null || StringsKt.isBlank(string2))) {
                o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, string2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                }
            }
        }
        this.f45195OooO0O0.f23321Ooooo0o.notifyDataSetChanged();
    }
}
