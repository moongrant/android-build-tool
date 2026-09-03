package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrCall;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceCallExpression;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "element", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/expressions/IrCall;)V", "getElement", "()Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "function", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "getFunction", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "isSingletonLambda", "", "isTransformedLambda", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "referenceContainer", "getReferenceContainer", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceCallExpression\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1104:1\n1#2:1105\n*E\n"})
public final class InferenceCallExpression extends InferenceNode {

    @NotNull
    private final IrCall element;

    @NotNull
    private final InferenceFunction function;
    private final boolean isSingletonLambda;
    private final boolean isTransformedLambda;

    @NotNull
    private final ComposableTargetAnnotationsTransformer transformer;

    public InferenceCallExpression(@NotNull ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, @NotNull IrCall irCall) {
        super(null);
        this.transformer = composableTargetAnnotationsTransformer;
        this.element = irCall;
        boolean zIsComposableSingletonGetter = composableTargetAnnotationsTransformer.isComposableSingletonGetter(getElement());
        this.isSingletonLambda = zIsComposableSingletonGetter;
        boolean zHasTransformedLambda$compiler_hosted = composableTargetAnnotationsTransformer.hasTransformedLambda$compiler_hosted(getElement());
        this.isTransformedLambda = zHasTransformedLambda$compiler_hosted;
        this.function = zIsComposableSingletonGetter ? composableTargetAnnotationsTransformer.inferenceFunctionOf((IrFunction) composableTargetAnnotationsTransformer.singletonFunctionExpression$compiler_hosted(getElement()).getFunction()) : zHasTransformedLambda$compiler_hosted ? composableTargetAnnotationsTransformer.inferenceFunctionOf((IrFunction) composableTargetAnnotationsTransformer.transformedLambda$compiler_hosted((IrElement) getElement()).getFunction()) : composableTargetAnnotationsTransformer.inferenceFunctionTypeOf(getElement().getType());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public InferenceFunction getFunction() {
        return this.function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return (this.isSingletonLambda || this.isTransformedLambda) ? NodeKind.Lambda : NodeKind.Expression;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @Nullable
    public InferenceNode getReferenceContainer() {
        ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer = this.transformer;
        if (this.isSingletonLambda) {
            return ComposableTargetAnnotationsTransformerKt.inferenceNodeOf(composableTargetAnnotationsTransformer.singletonFunctionExpression$compiler_hosted(getElement()).getFunction(), this.transformer);
        }
        if (this.isTransformedLambda) {
            return ComposableTargetAnnotationsTransformerKt.inferenceNodeOf(composableTargetAnnotationsTransformer.transformedLambda$compiler_hosted((IrElement) getElement()).getFunction(), this.transformer);
        }
        return null;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public IrCall getElement() {
        return this.element;
    }
}
