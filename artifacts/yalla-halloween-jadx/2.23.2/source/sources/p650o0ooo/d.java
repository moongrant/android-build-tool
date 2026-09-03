package p650o0ooo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f58177OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f58178OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f58179OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f58180OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f58181OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, int i2, String str, Function0 function0, boolean z) {
        super(2);
        this.f58177OooO0Oo = z;
        this.f58179OooO0o0 = str;
        this.f58178OooO0o = function0;
        this.f58180OooO0oO = i;
        this.f58181OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        boolean z = this.f58177OooO0Oo;
        e.OooO00o(this.f58179OooO0o0, z, this.f58178OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f58180OooO0oO | 1), this.f58181OooO0oo);
        return Unit.INSTANCE;
    }
}
