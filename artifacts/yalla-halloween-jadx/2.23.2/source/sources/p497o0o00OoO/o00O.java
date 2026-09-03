package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends Lambda implements Function1<Pair<? extends Long, ? extends Boolean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49821OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(oo0O oo0o) {
        super(1);
        this.f49821OooO0Oo = oo0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Boolean> pair) {
        MutableStateFlow<Long> userId;
        Pair<? extends Long, ? extends Boolean> pair2 = pair;
        if (pair2 != null) {
            oo0O oo0o = this.f49821OooO0Oo;
            RoomUserInfoModel roomUserInfoModel = oo0o.f49904OooO0o0;
            if ((roomUserInfoModel == null || (userId = roomUserInfoModel.getUserId()) == null || pair2.getFirst().longValue() != userId.getValue().longValue()) ? false : true) {
                RoomUserInfoModel roomUserInfoModel2 = oo0o.f49904OooO0o0;
                MutableStateFlow<Boolean> silenced = roomUserInfoModel2 != null ? roomUserInfoModel2.getSilenced() : null;
                if (silenced != null) {
                    silenced.setValue(pair2.getSecond());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
