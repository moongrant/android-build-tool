package p669oO0Oo;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0o000.o000OOo;
import p494o0o00OoO.o00OO00O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f60828OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0ooO(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f60828OooO0Oo = mixedRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO00O o00oo00o;
        o0OO000.OooO00o("102229");
        o000OOo o000ooo2 = OooO00o.f24991OooOo0;
        o000ooo2.f47432OooO0O0.setValue(Boolean.FALSE);
        if (((Boolean) OooO00o.f24978OooO0o0.f47485OooO.getValue()).booleanValue()) {
            MixedRoomActivity mixedRoomActivity = this.f60828OooO0Oo;
            if (mixedRoomActivity != null && (o00oo00o = mixedRoomActivity.f23430OooOo0) != null) {
                o00oo00o.OooO00o();
            }
        } else {
            o000ooo2.f47433OooO0OO.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
