package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f31764Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(o00000O0 o00000o1) {
        super(1);
        this.f31764Oooo0o = o00000o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!this.f31764Oooo0o.f31748OooO00o.getValue().booleanValue()) {
            this.f31764Oooo0o.f31751OooO0Oo.setValue(it);
            this.f31764Oooo0o.f31750OooO0OO.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
