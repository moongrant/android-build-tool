package p524o0o0OO0o;

import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53506OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(o0O00 o0o01) {
        super(0);
        this.f53506OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00 o0o01 = this.f53506OooO0Oo;
        o0OO00O o0oo00o2 = new o0OO00O(o0o01.f53464OooOO0O);
        o0oo00o2.OooOoO0(oO00OOo0.room_member_convene_dialog_title);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n".concat(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_convene_info_content_1_xxx1_xxx2), String.valueOf(o0o01.OooOOO0()), String.valueOf(((Number) o0o01.f53473OooOo.getValue()).intValue()))));
        stringBuffer.append("\n" + o0000.OooO0OO(oO00OOo0.room_member_convene_info_content_2));
        stringBuffer.append("\n" + o0000.OooO0OO(oO00OOo0.room_member_convene_info_content_3));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "this.toString()");
        o0oo00o2.OooOo00(string);
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
