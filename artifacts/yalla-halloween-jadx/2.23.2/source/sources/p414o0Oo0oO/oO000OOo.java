package p414o0Oo0oO;

import androidx.appcompat.widget.o0000O0O;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000OOo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0OOo0o f46391OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(oO0OOo0o oo0ooo0o) {
        super(1);
        this.f46391OooO0Oo = oo0ooo0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        if (bool2.booleanValue()) {
            oO0OOo0o oo0ooo0o = this.f46391OooO0Oo;
            oo0ooo0o.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0000O0O.OooO0O0("isPayEmojiHasRead", o0O00oO0.OooOOo0().getValue(), oo0ooo0o, true);
        }
        return Unit.INSTANCE;
    }
}
