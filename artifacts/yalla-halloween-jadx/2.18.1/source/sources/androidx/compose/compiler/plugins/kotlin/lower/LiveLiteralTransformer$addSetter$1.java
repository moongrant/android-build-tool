package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lorg/jetbrains/kotlin/ir/builders/declarations/IrFunctionBuilder;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 176)
public final class LiveLiteralTransformer$addSetter$1 extends Lambda implements Function1<IrFunctionBuilder, Unit> {
    static {
        new LiveLiteralTransformer$addSetter$1();
    }

    public LiveLiteralTransformer$addSetter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IrFunctionBuilder irFunctionBuilder) {
        Intrinsics.checkNotNullParameter(irFunctionBuilder, "$this$null");
        return Unit.INSTANCE;
    }
}
