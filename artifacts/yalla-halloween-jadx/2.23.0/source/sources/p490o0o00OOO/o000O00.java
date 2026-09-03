package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function1<Pair<? extends Long, ? extends Boolean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48603OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o000O o000o) {
        super(1);
        this.f48603OooO0Oo = o000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Boolean> pair) {
        MutableStateFlow<Long> userId;
        Pair<? extends Long, ? extends Boolean> pair2 = pair;
        if (pair2 != null) {
            o000O o000o = this.f48603OooO0Oo;
            RoomUserInfoModel roomUserInfoModel = o000o.f48596OooO0o0;
            if ((roomUserInfoModel == null || (userId = roomUserInfoModel.getUserId()) == null || pair2.getFirst().longValue() != userId.getValue().longValue()) ? false : true) {
                RoomUserInfoModel roomUserInfoModel2 = o000o.f48596OooO0o0;
                MutableStateFlow<Boolean> silenced = roomUserInfoModel2 != null ? roomUserInfoModel2.getSilenced() : null;
                if (silenced != null) {
                    silenced.setValue(pair2.getSecond());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
