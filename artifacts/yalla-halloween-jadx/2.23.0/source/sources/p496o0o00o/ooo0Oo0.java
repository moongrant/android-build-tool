package p496o0o00o;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49209OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f49210OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f49211OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(UserInfoActivity userInfoActivity, boolean z, long j) {
        super(1);
        this.f49209OooO0Oo = userInfoActivity;
        this.f49211OooO0o0 = z;
        this.f49210OooO0o = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean isSuccess = bool;
        Intrinsics.checkNotNullExpressionValue(isSuccess, "isSuccess");
        if (isSuccess.booleanValue()) {
            UserInfoActivity userInfoActivity = this.f49209OooO0Oo;
            UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
            boolean z = this.f49211OooO0o0;
            if (userInfoModel != null) {
                userInfoModel.setBlack(z);
            }
            if (userInfoActivity.f27253OooOooo) {
                String string = userInfoActivity.getString(oO00OOo0.Success);
                if (!(string == null || StringsKt.isBlank(string))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            if (z) {
                LiveEventBus.get("USER_ADD_BLACKLISTED").post(Long.valueOf(this.f49210OooO0o));
                userInfoActivity.Oooo00O();
            }
        }
        return Unit.INSTANCE;
    }
}
