package p700oO0Oo;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.model.FriendCheckModel;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.UserBlackVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ FriendCheckModel f52896Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f52897Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f52898Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f52899Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(oo0o0Oo oo0o0oo, UserBlackVM userBlackVM, long j, FriendCheckModel friendCheckModel) {
        super(0);
        this.f52897Oooo0o = oo0o0oo;
        this.f52898Oooo0oO = userBlackVM;
        this.f52899Oooo0oo = j;
        this.f52896Oooo = friendCheckModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final oo0o0Oo oo0o0oo = this.f52897Oooo0o;
        final UserBlackVM userBlackVM = this.f52898Oooo0oO;
        final long j = this.f52899Oooo0oo;
        final boolean z = !this.f52896Oooo.isBlack;
        Objects.requireNonNull(oo0o0oo);
        userBlackVM.blockUser(j, z).observe(oo0o0oo.f52920OooO00o, new Observer() { // from class: oO0Oo.o0ooOOo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                UserBlackVM userBlackVM2 = userBlackVM;
                boolean z2 = z;
                long j2 = j;
                oo0o0Oo this$0 = oo0o0oo;
                Boolean isSuccess = (Boolean) obj;
                Intrinsics.checkNotNullParameter(userBlackVM2, "$userBlackVM");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(isSuccess, "isSuccess");
                if (isSuccess.booleanValue()) {
                    FriendCheckModel mFriendCheckModel = userBlackVM2.getMFriendCheckModel();
                    if (mFriendCheckModel != null) {
                        mFriendCheckModel.isBlack = z2;
                    }
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Success);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                    if (z2) {
                        LiveEventBus.get("USER_ADD_BLACKLISTED").post(Long.valueOf(j2));
                    }
                    o0000O0.OooO00o(LifecycleOwnerKt.getLifecycleScope(this$0.f52920OooO00o), new o000OOo(j2, null));
                }
            }
        });
        return Unit.INSTANCE;
    }
}
