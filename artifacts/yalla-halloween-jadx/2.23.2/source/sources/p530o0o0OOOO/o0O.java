package p530o0o0OOOO;

import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53388OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(o0O00oO0 o0o00oo1) {
        super(0);
        this.f53388OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00oO0 o0o00oo1 = this.f53388OooO0Oo;
        o000O o000o = new o000O(o0o00oo1.f53398OooOO0O);
        o000o.OooOoO0(o000000.room_member_convene_dialog_title);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n".concat(o0000O.OooO00o(o0000.OooO0OO(o000000.room_member_convene_info_content_1_xxx1_xxx2), String.valueOf(o0o00oo1.OooOOO0()), String.valueOf(((Number) o0o00oo1.f53407OooOo.getValue()).intValue()))));
        stringBuffer.append("\n" + o0000.OooO0OO(o000000.room_member_convene_info_content_2));
        stringBuffer.append("\n" + o0000.OooO0OO(o000000.room_member_convene_info_content_3));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        o000o.OooOo00(string);
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
