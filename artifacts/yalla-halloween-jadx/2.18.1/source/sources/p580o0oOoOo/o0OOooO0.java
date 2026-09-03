package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p027Oooo0o.o000O00O;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOooO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f46430Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O00O f46431Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46432Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(CoroutineScope coroutineScope, o000O00O o000o00o2, o0O00OO<Boolean> o0o00oo2) {
        super(0);
        this.f46430Oooo0o = coroutineScope;
        this.f46431Oooo0oO = o000o00o2;
        this.f46432Oooo0oo = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f46430Oooo0o, null, null, new o0OO0O0(this.f46431Oooo0oO, this.f46432Oooo0oo, null), 3, null);
        return Unit.INSTANCE;
    }
}
