package p579o0oOoOOo;

import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f45934Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f45934Oooo0o = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O.OooO00o oooO00o = o00O.OooO00o.f43196OooO00o;
        o00O.OooO00o.f43199OooO0Oo.setValue(Boolean.valueOf(this.f45934Oooo0o.getRankWeek() > 0));
        o00O.OooO00o.f43198OooO0OO.setValue(Boolean.TRUE);
        OooOo.OooO0O0("102209");
        return Unit.INSTANCE;
    }
}
