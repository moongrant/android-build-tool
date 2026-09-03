package p029Oooo0oO;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000Oo extends Lambda implements Function2<Float, Float, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f2421Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2422Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f2423Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(boolean z, CoroutineScope coroutineScope, o00OOOOo o00ooooo2) {
        super(2);
        this.f2421Oooo0o = z;
        this.f2422Oooo0oO = coroutineScope;
        this.f2423Oooo0oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        if (this.f2421Oooo0o) {
            fFloatValue = fFloatValue2;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f2422Oooo0oO, null, null, new o0OoOoOo(this.f2423Oooo0oo, fFloatValue, null), 3, null);
        return Boolean.TRUE;
    }
}
