package p669oO0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f60685OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f60686OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(int i, MixedRoomActivity mixedRoomActivity) {
        super(2);
        this.f60685OooO0Oo = mixedRoomActivity;
        this.f60686OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60686OooO0o0 | 1);
        o0O00OOO.OooO0o0(this.f60685OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
