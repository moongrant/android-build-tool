package p599o0oo00O0;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f47917Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f47917Oooo0o = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(this.f47917Oooo0o);
        return Unit.INSTANCE;
    }
}
