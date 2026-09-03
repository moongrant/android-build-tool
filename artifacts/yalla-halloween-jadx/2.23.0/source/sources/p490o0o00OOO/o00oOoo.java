package p490o0o00OOO;

import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48660OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48659OooO0Oo = o000o;
        this.f48660OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableStateFlow<Boolean> silenced;
        long jLongValue = this.f48660OooO0o0.getUserId().getValue().longValue();
        o000O o000o = this.f48659OooO0Oo;
        o0OO00O o0oo00o2 = new o0OO00O(o000o.f48470OooO00o);
        RoomUserInfoModel roomUserInfoModel = o000o.f48596OooO0o0;
        o0oo00o2.OooOo00(roomUserInfoModel != null && (silenced = roomUserInfoModel.getSilenced()) != null && !silenced.getValue().booleanValue() ? o0000.OooO0OO(oO00OOo0.ban_chat) : o0000.OooO0OO(oO00OOo0.cancel_ban_chat));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new o0000OO0(jLongValue, o000o));
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
