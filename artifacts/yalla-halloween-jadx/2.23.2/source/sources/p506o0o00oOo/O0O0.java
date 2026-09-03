package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class O0O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f50386OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50387OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(UserInfoActivity userInfoActivity, boolean z, long j) {
        super(1);
        this.f50385OooO0Oo = userInfoActivity;
        this.f50387OooO0o0 = z;
        this.f50386OooO0o = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            UserInfoActivity userInfoActivity = this.f50385OooO0Oo;
            UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
            boolean z = this.f50387OooO0o0;
            if (userInfoModel != null) {
                userInfoModel.setBlack(z);
            }
            if (userInfoActivity.f26788OooOooo) {
                String string = userInfoActivity.getString(o000000.Success);
                if (!(string == null || StringsKt.isBlank(string))) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            if (z) {
                LiveEventBus.get("USER_ADD_BLACKLISTED").post(Long.valueOf(this.f50386OooO0o));
                userInfoActivity.Oooo00O();
            }
        }
        return Unit.INSTANCE;
    }
}
