package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p494o0o00OOo.o00O0O;
import p494o0o00OOo.o00Oo0;
import p494o0o00OOo.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49204OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(MomentSendActivity momentSendActivity) {
        super(0);
        this.f49204OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentSendActivity.f25726Oooo0OO;
        o0OoOo0 o0oooo0OooOoO = this.f49204OooO0Oo.OooOoO();
        MomentSendActivity momentSendActivity = o0oooo0OooOoO.f49590OooO00o;
        momentSendActivity.OooOo().f44320OooO0o.OooO0o0();
        OooO00o.OooO0O0("203007");
        com.yalla.yalla.util.permission.OooO00o.OooO0OO(momentSendActivity, PermissionGroupReveal.f32340OooO0o0, o00O0O.f49578OooO0Oo, new o00Oo0(o0oooo0OooOoO));
        return Unit.INSTANCE;
    }
}
