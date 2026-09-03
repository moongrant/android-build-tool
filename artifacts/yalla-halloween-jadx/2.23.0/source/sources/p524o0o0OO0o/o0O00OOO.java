package p524o0o0OO0o;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.RoomMemberConveneResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function1<RoomMemberConveneResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53498OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(o0O00 o0o01) {
        super(1);
        this.f53498OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomMemberConveneResultModel roomMemberConveneResultModel) {
        o0O00 o0o01 = this.f53498OooO0Oo;
        o0o01.f53468OooOOOO.clear();
        boolean z = true;
        o0o01.OooOOO(true);
        o0o01.OooOOo0();
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_member_convene_send_success);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (!z) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
