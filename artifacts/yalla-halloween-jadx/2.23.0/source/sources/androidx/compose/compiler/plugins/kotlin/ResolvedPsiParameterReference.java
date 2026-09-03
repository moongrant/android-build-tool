package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ResolvedPsiParameterReference;", "Landroidx/compose/compiler/plugins/kotlin/InferenceNode;", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "type", "Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "index", "", "container", "(Lcom/intellij/psi/PsiElement;Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;ILcom/intellij/psi/PsiElement;)V", "getContainer", "()Lcom/intellij/psi/PsiElement;", "getIndex", "()I", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getType", "()Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ResolvedPsiParameterReference extends InferenceNode {

    @NotNull
    private final PsiElement container;
    private final int index;

    @NotNull
    private final InferenceNodeType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResolvedPsiParameterReference(@NotNull PsiElement element, @NotNull InferenceNodeType type, int i, @NotNull PsiElement container) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(container, "container");
        this.type = type;
        this.index = i;
        this.container = container;
    }

    @NotNull
    public final PsiElement getContainer() {
        return this.container;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return NodeKind.ParameterReference;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNode
    @NotNull
    public InferenceNodeType getType() {
        return this.type;
    }
}
