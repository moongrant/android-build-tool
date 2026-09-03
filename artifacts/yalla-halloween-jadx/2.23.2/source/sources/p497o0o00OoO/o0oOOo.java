package p497o0o00OoO;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p110o000ooo0.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49891OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49890OooO0Oo = oo0o;
        this.f49891OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49890OooO0Oo;
        oo0o.getClass();
        OooO00o.OooO0O0("102186");
        MutableState<Boolean> mutableState = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48589OooOOOO;
        Boolean bool = Boolean.FALSE;
        mutableState.setValue(bool);
        com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48493OooO00o.setValue(bool);
        oo0o.f49626OooO00o.f22965OooOoO.postDelayed(new o0000(2, oo0o, this.f49891OooO0o0), 200L);
        return Unit.INSTANCE;
    }
}
