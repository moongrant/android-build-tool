package p027Oooo0o;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 extends Lambda implements Function2<Float, Float, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f1967Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f1968Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000O00O f1969Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(boolean z, CoroutineScope coroutineScope, o000O00O o000o00o2) {
        super(2);
        this.f1967Oooo0o = z;
        this.f1968Oooo0oO = coroutineScope;
        this.f1969Oooo0oo = o000o00o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Float f, Float f2) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        if (this.f1967Oooo0o) {
            fFloatValue = fFloatValue2;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f1968Oooo0oO, null, null, new o00oOoo(this.f1969Oooo0oo, fFloatValue, null), 3, null);
        return Boolean.TRUE;
    }
}
