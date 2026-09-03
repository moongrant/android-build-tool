package p497o0o00OoO;

import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f49807OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f49807OooO0Oo = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102025");
        MixedRoomActivity mixedRoomActivity = this.f49807OooO0Oo;
        new RoomGameBoxDialog(mixedRoomActivity, mixedRoomActivity.f22963OooOo0O).OooOO0o();
        return Unit.INSTANCE;
    }
}
