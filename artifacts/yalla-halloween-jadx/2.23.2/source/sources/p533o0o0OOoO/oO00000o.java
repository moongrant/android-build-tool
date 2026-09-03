package p533o0o0OOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f53534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53535OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000000 f53536OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(CoroutineScope coroutineScope, o000000 o000000Var, int i) {
        super(0);
        this.f53534OooO0Oo = coroutineScope;
        this.f53536OooO0o0 = o000000Var;
        this.f53535OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f53534OooO0Oo, null, null, new oO00000(this.f53536OooO0o0, this.f53535OooO0o, null), 3, null);
        return Unit.INSTANCE;
    }
}
