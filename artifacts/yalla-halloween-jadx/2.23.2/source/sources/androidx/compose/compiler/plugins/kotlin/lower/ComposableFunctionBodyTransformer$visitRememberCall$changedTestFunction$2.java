package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.expressions.IrExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ComposableFunctionBodyTransformer$visitRememberCall$changedTestFunction$2 extends FunctionReferenceImpl implements Function1<IrExpression, IrExpression> {
    public ComposableFunctionBodyTransformer$visitRememberCall$changedTestFunction$2(Object obj) {
        super(1, obj, ComposableFunctionBodyTransformer.class, "irChangedOrInferredChanged", "irChangedOrInferredChanged(Lorg/jetbrains/kotlin/ir/expressions/IrExpression;)Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final IrExpression invoke(@NotNull IrExpression irExpression) {
        return ((ComposableFunctionBodyTransformer) this.receiver).irChangedOrInferredChanged(irExpression);
    }
}
