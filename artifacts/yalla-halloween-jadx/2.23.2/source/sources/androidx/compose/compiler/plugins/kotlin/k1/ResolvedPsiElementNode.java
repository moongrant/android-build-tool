package androidx.compose.compiler.plugins.kotlin.k1;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ResolvedPsiElementNode;", "Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNode;", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "type", "Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNodeType;", "(Lcom/intellij/psi/PsiElement;Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNodeType;)V", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getType", "()Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNodeType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ResolvedPsiElementNode extends InferenceNode {

    @NotNull
    private final InferenceNodeType type;

    public ResolvedPsiElementNode(@NotNull PsiElement psiElement, @NotNull InferenceNodeType inferenceNodeType) {
        super(psiElement, null);
        this.type = inferenceNodeType;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.k1.InferenceNode
    @NotNull
    public NodeKind getKind() {
        return NodeKind.Function;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.k1.InferenceNode
    @NotNull
    public InferenceNodeType getType() {
        return this.type;
    }
}
