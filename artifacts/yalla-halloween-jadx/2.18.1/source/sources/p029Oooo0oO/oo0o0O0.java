package p029Oooo0oO;

import androidx.compose.foundation.lazy.layout.OooOo;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0OO;
import o0O0O00.o000000O;
import o0O0O00.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0 extends Lambda implements Function3<Integer, Integer, Function1<? super o000O000.OooO00o, ? extends Unit>, o000000O> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f2496Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOo f2497Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f2498Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f2499Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(OooOo oooOo, long j, int i, int i2) {
        super(3);
        this.f2497Oooo0o = oooOo;
        this.f2498Oooo0oO = j;
        this.f2499Oooo0oo = i;
        this.f2496Oooo = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function3
    public final o000000O invoke(Integer num, Integer num2, Function1<? super o000O000.OooO00o, ? extends Unit> function1) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Function1<? super o000O000.OooO00o, ? extends Unit> placement = function1;
        Intrinsics.checkNotNullParameter(placement, "placement");
        return this.f2497Oooo0o.OooOooo(OooO0OO.OooO0o(this.f2498Oooo0oO, iIntValue + this.f2499Oooo0oo), OooO0OO.OooO0o0(this.f2498Oooo0oO, iIntValue2 + this.f2496Oooo), MapsKt.emptyMap(), placement);
    }
}
