package p139o00OOOo0;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f31754Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f31754Oooo0o = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000.OooO().OooOO0o(this.f31754Oooo0o.getUserId());
        return Unit.INSTANCE;
    }
}
