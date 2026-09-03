package p434o0OoOOOO;

import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OO f46957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f46958OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f46959OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FriendCheckModel f46960OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(o00OO o00oo2, UserBlackVM userBlackVM, long j, FriendCheckModel friendCheckModel) {
        super(0);
        this.f46957OooO0Oo = o00oo2;
        this.f46959OooO0o0 = userBlackVM;
        this.f46958OooO0o = j;
        this.f46960OooO0oO = friendCheckModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j = this.f46958OooO0o;
        boolean z = !this.f46960OooO0oO.isBlack;
        o00OO o00oo2 = this.f46957OooO0Oo;
        o00oo2.getClass();
        UserBlackVM userBlackVM = this.f46959OooO0o0;
        userBlackVM.blockUser(j, z).observe(o00oo2.f46935OooO00o, new o00OO.OooO0O0(new o00OOO0O(j, o00oo2, userBlackVM, z)));
        return Unit.INSTANCE;
    }
}
