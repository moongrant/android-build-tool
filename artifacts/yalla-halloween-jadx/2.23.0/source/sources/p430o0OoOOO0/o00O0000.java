package p430o0OoOOO0;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f45802OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f45803OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f45804OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45805OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(long j, o000OO00 o000oo01, UserBlackVM userBlackVM, boolean z) {
        super(1);
        this.f45802OooO0Oo = userBlackVM;
        this.f45804OooO0o0 = z;
        this.f45803OooO0o = j;
        this.f45805OooO0oO = o000oo01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean isSuccess = bool;
        Intrinsics.checkNotNullExpressionValue(isSuccess, "isSuccess");
        if (isSuccess.booleanValue()) {
            FriendCheckModel mFriendCheckModel = this.f45802OooO0Oo.getMFriendCheckModel();
            boolean z = this.f45804OooO0o0;
            if (mFriendCheckModel != null) {
                mFriendCheckModel.isBlack = z;
            }
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            long j = this.f45803OooO0o;
            if (z) {
                LiveEventBus.get("USER_ADD_BLACKLISTED").post(Long.valueOf(j));
            }
            OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this.f45805OooO0oO.f45779OooO00o), new o00(j, null));
        }
        return Unit.INSTANCE;
    }
}
