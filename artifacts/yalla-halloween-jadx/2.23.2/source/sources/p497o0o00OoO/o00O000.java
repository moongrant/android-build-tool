package p497o0o00OoO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f49824OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f49825OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f49826OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f49827OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(MixedRoomActivity mixedRoomActivity, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.f49824OooO0Oo = mixedRoomActivity;
        this.f49826OooO0o0 = function0;
        this.f49825OooO0o = i;
        this.f49827OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49825OooO0o | 1);
        o00O0.OooO00o(this.f49824OooO0Oo, this.f49826OooO0o0, composer, iUpdateChangedFlags, this.f49827OooO0oO);
        return Unit.INSTANCE;
    }
}
