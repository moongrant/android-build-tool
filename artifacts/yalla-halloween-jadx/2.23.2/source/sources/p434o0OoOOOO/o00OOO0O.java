package p434o0OoOOOO;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f46961OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f46962OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f46963OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00OO f46964OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(long j, o00OO o00oo2, UserBlackVM userBlackVM, boolean z) {
        super(1);
        this.f46961OooO0Oo = userBlackVM;
        this.f46963OooO0o0 = z;
        this.f46962OooO0o = j;
        this.f46964OooO0oO = o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            FriendCheckModel mFriendCheckModel = this.f46961OooO0Oo.getMFriendCheckModel();
            boolean z = this.f46963OooO0o0;
            if (mFriendCheckModel != null) {
                mFriendCheckModel.isBlack = z;
            }
            String strOooO0OO = o0000.OooO0OO(o000000.Success);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            long j = this.f46962OooO0o;
            if (z) {
                LiveEventBus.get("USER_ADD_BLACKLISTED").post(Long.valueOf(j));
            }
            OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this.f46964OooO0oO.f46935OooO00o), new o00OOO0(j, null));
        }
        return Unit.INSTANCE;
    }
}
