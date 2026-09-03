package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.model.share.ShareChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareChannel f58214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58215OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f58216OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58217OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(ShareChannel shareChannel, boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.f58214OooO0Oo = shareChannel;
        this.f58216OooO0o0 = z;
        this.f58215OooO0o = function0;
        this.f58217OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58217OooO0oO | 1);
        boolean z = this.f58216OooO0o0;
        Function0<Unit> function0 = this.f58215OooO0o;
        m3.OooO0O0(this.f58214OooO0Oo, z, function0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
