package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.IrElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0000H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\b\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "", "()V", "element", "Lorg/jetbrains/kotlin/ir/IrElement;", "getElement", "()Lorg/jetbrains/kotlin/ir/IrElement;", "function", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "getFunction", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "referenceContainer", "getReferenceContainer", "()Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "equals", "", "other", "hashCode", "", "isOverlyWide", "parameterIndex", "node", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceCallExpression;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceCallTargetNode;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceElementExpression;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionDeclarationNode;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionExpressionNode;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceResolvedParameter;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceUnknownElement;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceVariable;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class InferenceNode {

    @Nullable
    private final InferenceNode referenceContainer;

    private InferenceNode() {
    }

    public /* synthetic */ InferenceNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof InferenceNode) && Intrinsics.areEqual(((InferenceNode) other).getElement(), getElement());
    }

    @NotNull
    public abstract IrElement getElement();

    @Nullable
    public abstract InferenceFunction getFunction();

    @NotNull
    public abstract NodeKind getKind();

    @Nullable
    public InferenceNode getReferenceContainer() {
        return this.referenceContainer;
    }

    public int hashCode() {
        return getElement().hashCode() * 31;
    }

    public boolean isOverlyWide() {
        InferenceFunction function = getFunction();
        return function != null && function.isOverlyWide();
    }

    public int parameterIndex(@NotNull InferenceNode node) {
        return -1;
    }
}
