package p531o0o0OOoo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p143o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f54548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f54550OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54551OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54552OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i, String str, OooO0O0<RoomUserRecordModel> oooO0O0, OooO0O0<RoomUserRecordModel> oooO0O1, int i2) {
        super(2);
        this.f54548OooO0Oo = i;
        this.f54550OooO0o0 = str;
        this.f54549OooO0o = oooO0O0;
        this.f54551OooO0oO = oooO0O1;
        this.f54552OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        z.OooO0OO(this.f54548OooO0Oo, this.f54550OooO0o0, this.f54549OooO0o, this.f54551OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54552OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
