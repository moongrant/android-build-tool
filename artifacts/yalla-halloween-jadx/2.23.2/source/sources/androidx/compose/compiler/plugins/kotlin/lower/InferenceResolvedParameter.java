package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0001H\u0016R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceResolvedParameter;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "element", "Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;", "function", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "container", "index", "", "(Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;I)V", "getContainer", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "getElement", "()Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;", "getFunction", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "getIndex", "()I", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "referenceContainer", "getReferenceContainer", "equals", "", "other", "", "hashCode", "parameterIndex", "node", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InferenceResolvedParameter extends InferenceNode {

    @NotNull
    private final InferenceNode container;

    @NotNull
    private final IrGetValue element;

    @NotNull
    private final InferenceFunction function;
    private final int index;

    public InferenceResolvedParameter(@NotNull IrGetValue irGetValue, @NotNull InferenceFunction inferenceFunction, @NotNull InferenceNode inferenceNode, int i) {
        super(null);
        this.element = irGetValue;
        this.function = inferenceFunction;
        this.container = inferenceNode;
        this.index = i;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    public boolean equals(@Nullable Object other) {
        return (other instanceof InferenceResolvedParameter) && Intrinsics.areEqual(((InferenceResolvedParameter) other).getElement(), getElement());
    }

    @NotNull
    public final InferenceNode getContainer() {
        return this.container;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public InferenceFunction getFunction() {
        return this.function;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return NodeKind.ParameterReference;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public InferenceNode getReferenceContainer() {
        return this.container;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    public int hashCode() {
        return (getElement().hashCode() * 31) + 103;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    public int parameterIndex(@NotNull InferenceNode node) {
        if (Intrinsics.areEqual(node.getFunction(), getFunction())) {
            return this.index;
        }
        return -1;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceNode
    @NotNull
    public IrGetValue getElement() {
        return this.element;
    }
}
