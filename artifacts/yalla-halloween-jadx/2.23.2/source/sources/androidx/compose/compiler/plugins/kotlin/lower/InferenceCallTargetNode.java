package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.expressions.IrCall;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceCallTargetNode;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "element", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/expressions/IrCall;)V", "getElement", "()Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "function", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "getFunction", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "referenceContainer", "getReferenceContainer", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "equals", "", "other", "", "hashCode", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceCallTargetNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1104:1\n1#2:1105\n*E\n"})
public final class InferenceCallTargetNode extends InferenceNode {

    @NotNull
    private final IrCall element;

    @NotNull
    private final InferenceFunction function;

    @Nullable
    private final InferenceNode referenceContainer;

    @NotNull
    private final ComposableTargetAnnotationsTransformer transformer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InferenceCallTargetNode(@NotNull ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, @NotNull IrCall irCall) {
        super(null);
        InferenceNode inferenceNodeInferenceNodeOf = null;
        this.transformer = composableTargetAnnotationsTransformer;
        this.element = irCall;
        this.function = composableTargetAnnotationsTransformer.hasSchemeSpecified(getElement().getSymbol().getOwner()) ? new InferenceFunctionDeclaration(composableTargetAnnotationsTransformer, getElement().getSymbol().getOwner()) : new InferenceFunctionCallType(composableTargetAnnotationsTransformer, getElement());
        if (!ComposableTargetAnnotationsTransformerKt.isGenericFunction(getElement().getSymbol())) {
            IrSimpleFunction function = composableTargetAnnotationsTransformer.isComposableSingletonGetter(getElement()) ? composableTargetAnnotationsTransformer.singletonFunctionExpression$compiler_hosted(getElement()).getFunction() : composableTargetAnnotationsTransformer.hasTransformedLambda$compiler_hosted(getElement()) ? composableTargetAnnotationsTransformer.transformedLambda$compiler_hosted((IrElement) getElement()).getFunction() : getElement().getSymbol().getOwner();
            if ((function.getBody() != null && function.getTypeParameters().isEmpty() ? function : null) != null) {
                inferenceNodeInferenceNodeOf = ComposableTargetAnnotationsTransformerKt.inferenceNodeOf((IrElement) function, composableTargetAnnotationsTransformer);
            }
        }
        this.referenceContainer = inferenceNodeInferenceNodeOf;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    public boolean equals(@Nullable Object other) {
        return (other instanceof InferenceCallTargetNode) && super.equals(other);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public InferenceFunction getFunction() {
        return this.function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return NodeKind.Function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @Nullable
    public InferenceNode getReferenceContainer() {
        return this.referenceContainer;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public IrCall getElement() {
        return this.element;
    }
}
