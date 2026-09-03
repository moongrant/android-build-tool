package p504o0o00oO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f50284OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f50285OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ y f50286OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f50287OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(RoomUserInfoModel roomUserInfoModel, y yVar, Function0<Unit> function0, int i) {
        super(2);
        this.f50284OooO0Oo = roomUserInfoModel;
        this.f50286OooO0o0 = yVar;
        this.f50285OooO0o = function0;
        this.f50287OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50287OooO0oO | 1);
        y yVar = this.f50286OooO0o0;
        Function0<Unit> function0 = this.f50285OooO0o;
        q.OooO0oO(this.f50284OooO0Oo, yVar, function0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
