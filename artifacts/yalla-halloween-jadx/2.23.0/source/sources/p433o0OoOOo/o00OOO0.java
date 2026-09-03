package p433o0OoOOo;

import com.yalla.yalla.mixedroom.model.SendPicMessageModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p136o00OOOo0.OooO0OO;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function2<Boolean, OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OOO0 f46002OooO0Oo = new o00OOO0();

    public o00OOO0() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, OooO0OO oooO0OO) {
        boolean zBooleanValue = bool.booleanValue();
        OooO0OO oooO0OO2 = oooO0OO;
        if (oooO0OO2 != null && zBooleanValue) {
            SendPicMessageModel sendPicMessageModel = new SendPicMessageModel();
            sendPicMessageModel.message = oooO0OO2.OooO00o();
            sendPicMessageModel.picwidth = oooO0OO2.f37356OooO0Oo;
            sendPicMessageModel.picheight = oooO0OO2.f37358OooO0o0;
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(100031, oOo00OO0.OooO0OO(sendPicMessageModel));
            }
        }
        return Unit.INSTANCE;
    }
}
