package p530o0o0OOOO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.RoomMemberConveneResultModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function1<RoomMemberConveneResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53428OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(o0O00oO0 o0o00oo1) {
        super(1);
        this.f53428OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomMemberConveneResultModel roomMemberConveneResultModel) {
        o0O00oO0 o0o00oo1 = this.f53428OooO0Oo;
        o0o00oo1.f53402OooOOOO.clear();
        boolean z = true;
        o0o00oo1.OooOOO(true);
        o0o00oo1.OooOOo0();
        String strOooO0OO = o0000.OooO0OO(o000000.room_member_convene_send_success);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (!z) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
