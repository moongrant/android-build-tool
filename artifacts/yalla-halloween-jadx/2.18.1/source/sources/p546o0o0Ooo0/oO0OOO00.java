package p546o0o0Ooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p150o00Oo0Oo.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OOO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO00Oo00 f44582Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(oO00Oo00 oo00oo00) {
        super(1);
        this.f44582Oooo0o = oo00oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOo oooOo = new OooOo(it, 0L);
        oooOo.f32174Oooo0oo = 40;
        oO00o0.OooOO0O(oooOo, this.f44582Oooo0o.OooO0Oo(), this.f44582Oooo0o.OooO0OO());
        return Unit.INSTANCE;
    }
}
