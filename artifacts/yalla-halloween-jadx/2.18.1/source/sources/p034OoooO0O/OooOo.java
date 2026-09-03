package p034OoooO0O;

import androidx.compose.foundation.text.Handle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f3432Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f3433Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(boolean z, long j) {
        super(1);
        this.f3432Oooo0o = z;
        this.f3433Oooo0oO = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        semantics.OooO00o(oo0o0Oo.f3569OooO0OO, new o0OO00O(this.f3432Oooo0o ? Handle.SelectionStart : Handle.SelectionEnd, this.f3433Oooo0oO));
        return Unit.INSTANCE;
    }
}
