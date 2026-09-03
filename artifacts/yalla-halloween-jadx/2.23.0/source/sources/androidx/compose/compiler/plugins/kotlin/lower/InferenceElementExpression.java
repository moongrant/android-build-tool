package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.expressions.IrExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceElementExpression;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "element", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/expressions/IrExpression;)V", "getElement", "()Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "function", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "getFunction", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InferenceElementExpression extends InferenceNode {

    @NotNull
    private final IrExpression element;

    @NotNull
    private final InferenceFunction function;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InferenceElementExpression(@NotNull ComposableTargetAnnotationsTransformer transformer, @NotNull IrExpression element) {
        super(null);
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(element, "element");
        this.element = element;
        this.function = transformer.inferenceFunctionTypeOf(getElement().getType());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public InferenceFunction getFunction() {
        return this.function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return NodeKind.Expression;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public IrExpression getElement() {
        return this.element;
    }
}
