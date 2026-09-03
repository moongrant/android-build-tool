package p497o0o00OoO;

import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49867OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49868OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49867OooO0Oo = oo0o;
        this.f49868OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableStateFlow<Boolean> silenced;
        long jLongValue = this.f49868OooO0o0.getUserId().getValue().longValue();
        oo0O oo0o = this.f49867OooO0Oo;
        o000O o000o = new o000O(oo0o.f49626OooO00o);
        RoomUserInfoModel roomUserInfoModel = oo0o.f49904OooO0o0;
        o000o.OooOo00(roomUserInfoModel != null && (silenced = roomUserInfoModel.getSilenced()) != null && !silenced.getValue().booleanValue() ? o0000.OooO0OO(o000000.ban_chat) : o0000.OooO0OO(o000000.cancel_ban_chat));
        o000o.OooOo(true);
        o000o.OooOo0(new o00O0OO0(jLongValue, oo0o));
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
