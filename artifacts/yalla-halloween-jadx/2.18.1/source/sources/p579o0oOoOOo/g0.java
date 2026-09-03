package p579o0oOoOOo;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends Lambda implements Function1<RoomUserInfoModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final g0 f45956Oooo0o = new g0();

    public g0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomUserInfoModel roomUserInfoModel) {
        RoomUserInfoModel roomUserInfoModel2 = roomUserInfoModel;
        if (roomUserInfoModel2 != null) {
            o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(roomUserInfoModel2);
        }
        return Unit.INSTANCE;
    }
}
