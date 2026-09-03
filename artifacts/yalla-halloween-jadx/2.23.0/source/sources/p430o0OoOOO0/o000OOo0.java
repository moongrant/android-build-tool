package p430o0OoOOO0;

import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.ui.vm.UserBlackVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f45791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f45792OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FriendCheckModel f45793OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o000OO00 o000oo01, UserBlackVM userBlackVM, long j, FriendCheckModel friendCheckModel) {
        super(0);
        this.f45790OooO0Oo = o000oo01;
        this.f45792OooO0o0 = userBlackVM;
        this.f45791OooO0o = j;
        this.f45793OooO0oO = friendCheckModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long j = this.f45791OooO0o;
        boolean z = !this.f45793OooO0oO.isBlack;
        o000OO00 o000oo01 = this.f45790OooO0Oo;
        o000oo01.getClass();
        UserBlackVM userBlackVM = this.f45792OooO0o0;
        userBlackVM.blockUser(j, z).observe(o000oo01.f45779OooO00o, new o000OO00.OooO0O0(new o00O0000(j, o000oo01, userBlackVM, z)));
        return Unit.INSTANCE;
    }
}
