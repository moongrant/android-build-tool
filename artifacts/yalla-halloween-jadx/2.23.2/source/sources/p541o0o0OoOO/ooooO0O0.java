package p541o0o0OoOO;

import android.content.Context;
import com.code.android.util.o000O00;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55340OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO0O0(Context context, int i) {
        super(0);
        this.f55339OooO0Oo = context;
        this.f55340OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO0O0 oooO0O0OooO00o = OooO0O0.f24533OoooOOO.OooO00o();
        if (oooO0O0OooO00o.OooOOO() || (oooO0O0OooO00o.OooOO0o() && Intrinsics.areEqual(oooO0O0OooO00o.f24561OooOoOO.getValue(), Boolean.TRUE))) {
            o000O o000o = new o000O(this.f55339OooO0Oo);
            o000o.OooOOoo(o000000.tip_unlock_mic);
            o000o.OooOo(true);
            o000o.OooOo0(new oOO0OoO0(this.f55340OooO0o0));
            o000o.OooOO0o();
        } else {
            o000O00.OooO00o(o000000.mic_locked_by_ower);
        }
        return Unit.INSTANCE;
    }
}
