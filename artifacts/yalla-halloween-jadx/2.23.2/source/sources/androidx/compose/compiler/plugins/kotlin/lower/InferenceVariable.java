package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrVariable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceVariable;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "element", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/declarations/IrVariable;)V", "getElement", "()Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "function", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "getFunction", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "referenceContainer", "getReferenceContainer", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InferenceVariable extends InferenceNode {

    @NotNull
    private final IrVariable element;

    @NotNull
    private final ComposableTargetAnnotationsTransformer transformer;

    public InferenceVariable(@NotNull ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, @NotNull IrVariable irVariable) {
        super(null);
        this.transformer = composableTargetAnnotationsTransformer;
        this.element = irVariable;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public InferenceFunction getFunction() {
        return this.transformer.inferenceFunctionTypeOf(getElement().getType());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return NodeKind.Variable;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @Nullable
    public InferenceNode getReferenceContainer() {
        return null;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public IrVariable getElement() {
        return this.element;
    }
}
