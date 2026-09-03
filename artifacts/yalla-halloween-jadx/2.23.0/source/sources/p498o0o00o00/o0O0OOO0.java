package p498o0o00o00;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f49313OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o0 f49314OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49315OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(RoomUserInfoModel roomUserInfoModel, o0O0o0 o0o0o0, Function0<Unit> function0, int i) {
        super(2);
        this.f49312OooO0Oo = roomUserInfoModel;
        this.f49314OooO0o0 = o0o0o0;
        this.f49313OooO0o = function0;
        this.f49315OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49315OooO0oO | 1);
        o0O0o0 o0o0o0 = this.f49314OooO0o0;
        Function0<Unit> function0 = this.f49313OooO0o;
        o0O0O0Oo.OooO0oO(this.f49312OooO0Oo, o0o0o0, function0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
