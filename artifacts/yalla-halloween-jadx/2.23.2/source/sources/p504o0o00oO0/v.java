package p504o0o00oO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f50293OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50294OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f50295OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RoomUserInfoModel roomUserInfoModel, Function0<Unit> function0, int i) {
        super(2);
        this.f50293OooO0Oo = roomUserInfoModel;
        this.f50295OooO0o0 = function0;
        this.f50294OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50294OooO0o | 1);
        q.OooO0oo(this.f50293OooO0Oo, this.f50295OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
