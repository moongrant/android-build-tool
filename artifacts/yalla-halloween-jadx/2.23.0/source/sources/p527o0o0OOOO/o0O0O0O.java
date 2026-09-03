package p527o0o0OOOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f53651OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessage f53652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53653OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53654OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53655OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53656OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(FriendRequestMessage friendRequestMessage, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Function0<Unit> function3, int i) {
        super(2);
        this.f53652OooO0Oo = friendRequestMessage;
        this.f53654OooO0o0 = function0;
        this.f53653OooO0o = function1;
        this.f53655OooO0oO = function2;
        this.f53656OooO0oo = function3;
        this.f53651OooO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0oO0O0o.OooO0O0(this.f53652OooO0Oo, this.f53654OooO0o0, this.f53653OooO0o, this.f53655OooO0oO, this.f53656OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53651OooO | 1));
        return Unit.INSTANCE;
    }
}
