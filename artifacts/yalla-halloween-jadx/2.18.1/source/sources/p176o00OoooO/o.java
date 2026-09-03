package p176o00OoooO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f32766Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<String> f32767Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i, o0O00OO<String> o0o00oo2) {
        super(1);
        this.f32766Oooo0o = i;
        this.f32767Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= this.f32766Oooo0o) {
            this.f32767Oooo0oO.setValue(it);
        }
        return Unit.INSTANCE;
    }
}
