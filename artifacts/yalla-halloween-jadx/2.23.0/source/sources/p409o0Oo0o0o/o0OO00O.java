package p409o0Oo0o0o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f45223OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o0O0O00 o0o0o00) {
        super(1);
        this.f45223OooO0Oo = o0o0o00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            o0O0O00 o0o0o00 = this.f45223OooO0Oo;
            o0o0o00.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            com.google.firebase.messaging.o0OO00O.OooO00o("isPayEmojiHasRead", o000000O.OooOOo0().getValue(), o0o0o00, true);
        }
        return Unit.INSTANCE;
    }
}
