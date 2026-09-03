package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f6509Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0o0Oo f6510Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00.OooO0O0 f6511Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(AbstractComposeView abstractComposeView, o0o0Oo o0o0oo, o000OO00.OooO0O0 oooO0O0) {
        super(0);
        this.f6509Oooo0o = abstractComposeView;
        this.f6510Oooo0oO = o0o0oo;
        this.f6511Oooo0oo = oooO0O0;
    }

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
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f6509Oooo0o.removeOnAttachStateChangeListener(this.f6510Oooo0oO);
        AbstractComposeView abstractComposeView = this.f6509Oooo0o;
        o000OO00.OooO0O0 listener = this.f6511Oooo0oo;
        int i = o000OO00.OooO00o.f28231OooO00o;
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i2 = o000OO00.OooO00o.f28231OooO00o;
        o000OO00.OooO0OO oooO0OO = (o000OO00.OooO0OO) abstractComposeView.getTag(i2);
        if (oooO0OO == null) {
            oooO0OO = new o000OO00.OooO0OO();
            abstractComposeView.setTag(i2, oooO0OO);
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        oooO0OO.f28233OooO00o.remove(listener);
        return Unit.INSTANCE;
    }
}
