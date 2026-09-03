package p139o00OOOo0;

import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f31771Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f31772Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o0O00OO<Boolean> o0o00oo2, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f31771Oooo0o = o0o00oo2;
        this.f31772Oooo0oO = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f31771Oooo0o.getValue().booleanValue()) {
            o00O000.OooO().OooOOOO(String.valueOf(this.f31772Oooo0oO.getUserId()), "1");
        } else {
            o00O000.OooO().OooOOOO(String.valueOf(this.f31772Oooo0oO.getUserId()), AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
        return Unit.INSTANCE;
    }
}
