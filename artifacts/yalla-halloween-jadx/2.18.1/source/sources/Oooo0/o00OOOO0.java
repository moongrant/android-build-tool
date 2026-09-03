package Oooo0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOO0 extends Lambda implements Function2<Float, Float, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f690Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f692Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(CoroutineScope coroutineScope, boolean z, o0oOOo o0oooo2) {
        super(2);
        this.f690Oooo0o = coroutineScope;
        this.f691Oooo0oO = z;
        this.f692Oooo0oo = o0oooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        BuildersKt__Builders_commonKt.launch$default(this.f690Oooo0o, null, null, new o0o0Oo(this.f691Oooo0oO, this.f692Oooo0oo, f2.floatValue(), fFloatValue, null), 3, null);
        return Boolean.TRUE;
    }
}
