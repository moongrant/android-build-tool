package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.IrElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class IrValidator$elementChecker$1 extends FunctionReferenceImpl implements Function2<IrElement, String, Unit> {
    public IrValidator$elementChecker$1(Object obj) {
        super(2, obj, IrValidator.class, "error", "error(Lorg/jetbrains/kotlin/ir/IrElement;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(IrElement irElement, String str) {
        invoke2(irElement, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IrElement p0, @NotNull String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((IrValidator) this.receiver).error(p0, p1);
    }
}
