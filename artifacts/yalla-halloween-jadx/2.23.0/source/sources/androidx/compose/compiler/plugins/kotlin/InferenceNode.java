package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.psi.KtFunction;
import org.jetbrains.kotlin.psi.KtFunctionLiteral;
import org.jetbrains.kotlin.psi.KtLambdaExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/InferenceNode;", "", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "(Lcom/intellij/psi/PsiElement;)V", "getElement", "()Lcom/intellij/psi/PsiElement;", "kind", "Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "getKind", "()Landroidx/compose/compiler/plugins/kotlin/inference/NodeKind;", "type", "Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "getType", "()Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "Landroidx/compose/compiler/plugins/kotlin/PsiElementNode;", "Landroidx/compose/compiler/plugins/kotlin/ResolvedPsiElementNode;", "Landroidx/compose/compiler/plugins/kotlin/ResolvedPsiParameterReference;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class InferenceNode {

    @NotNull
    private final PsiElement element;

    public /* synthetic */ InferenceNode(PsiElement psiElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(psiElement);
    }

    @NotNull
    public final PsiElement getElement() {
        return this.element;
    }

    @NotNull
    public NodeKind getKind() {
        PsiElement psiElement = this.element;
        if (psiElement instanceof KtLambdaExpression ? true : psiElement instanceof KtFunctionLiteral) {
            return NodeKind.Lambda;
        }
        return psiElement instanceof KtFunction ? NodeKind.Function : NodeKind.Expression;
    }

    @NotNull
    public abstract InferenceNodeType getType();

    private InferenceNode(PsiElement psiElement) {
        this.element = psiElement;
    }
}
