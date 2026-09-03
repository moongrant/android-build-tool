package p490o0o00OOO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48631OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48631OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102025");
        MixedRoomActivity mixedRoomActivity = this.f48631OooO0Oo;
        new RoomGameBoxDialog(mixedRoomActivity, mixedRoomActivity.f23432OooOo0O).OooOO0o();
        return Unit.INSTANCE;
    }
}
