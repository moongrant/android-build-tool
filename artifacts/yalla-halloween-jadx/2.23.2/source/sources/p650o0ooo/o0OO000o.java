package p650o0ooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0oo00 f58678OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(o0O0oo00 o0o0oo00) {
        super(1);
        this.f58678OooO0Oo = o0o0oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O0oo00 o0o0oo00 = this.f58678OooO0Oo;
        if (!o0o0oo00.f58662OooO00o.getValue().booleanValue()) {
            o0o0oo00.f58665OooO0Oo.setValue(it);
            o0o0oo00.f58664OooO0OO.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
