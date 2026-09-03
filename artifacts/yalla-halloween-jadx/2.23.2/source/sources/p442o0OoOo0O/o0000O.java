package p442o0OoOo0O;

import com.yalla.yalla.mixedroom.model.SendPicMessageModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p182o00o000O.OooO0o;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function2<Boolean, OooO0o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000O f47239OooO0Oo = new o0000O();

    public o0000O() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, OooO0o oooO0o) {
        boolean zBooleanValue = bool.booleanValue();
        OooO0o oooO0o2 = oooO0o;
        if (oooO0o2 != null && zBooleanValue) {
            SendPicMessageModel sendPicMessageModel = new SendPicMessageModel();
            sendPicMessageModel.message = oooO0o2.OooO00o();
            sendPicMessageModel.picwidth = oooO0o2.f38406OooO0Oo;
            sendPicMessageModel.picheight = oooO0o2.f38408OooO0o0;
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(100031, oOOO00.OooO0OO(sendPicMessageModel));
            }
        }
        return Unit.INSTANCE;
    }
}
