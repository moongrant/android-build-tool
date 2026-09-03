package p533o0o0Oo0;

import android.content.Context;
import com.code.android.util.o000O00O;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f54834OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54835OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(Context context, int i) {
        super(0);
        this.f54834OooO0Oo = context;
        this.f54835OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO0O0 oooO0O0OooO00o = OooO0O0.f24995OoooOOO.OooO00o();
        if (oooO0O0OooO00o.OooOOO() || (oooO0O0OooO00o.OooOO0o() && Intrinsics.areEqual(oooO0O0OooO00o.f25023OooOoOO.getValue(), Boolean.TRUE))) {
            o0OO00O o0oo00o2 = new o0OO00O(this.f54834OooO0Oo);
            o0oo00o2.OooOOoo(oO00OOo0.tip_unlock_mic);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new o00O00o0(this.f54835OooO0o0));
            o0oo00o2.OooOO0o();
        } else {
            o000O00O.OooO00o(oO00OOo0.mic_locked_by_ower);
        }
        return Unit.INSTANCE;
    }
}
