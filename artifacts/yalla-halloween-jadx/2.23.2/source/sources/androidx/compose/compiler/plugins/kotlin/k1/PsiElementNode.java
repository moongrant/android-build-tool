package androidx.compose.compiler.plugins.kotlin.k1;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.codegen.CodegenUtilKt;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtFunction;
import org.jetbrains.kotlin.psi.KtFunctionLiteral;
import org.jetbrains.kotlin.psi.KtLambdaExpression;
import org.jetbrains.kotlin.psi.KtProperty;
import org.jetbrains.kotlin.psi.KtPropertyAccessor;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.types.KotlinType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/PsiElementNode;", "Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNode;", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lcom/intellij/psi/PsiElement;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "getBindingContext", "()Lorg/jetbrains/kotlin/resolve/BindingContext;", "type", "Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNodeType;", "getType", "()Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNodeType;", "descriptorTypeOf", "kotlinTypeOf", "Lorg/jetbrains/kotlin/psi/KtExpression;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PsiElementNode extends InferenceNode {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final InferenceNodeType type;

    public PsiElementNode(@NotNull PsiElement psiElement, @NotNull BindingContext bindingContext) {
        InferenceNodeType inferenceNodeTypeKotlinTypeOf;
        super(psiElement, null);
        this.bindingContext = bindingContext;
        if (psiElement instanceof KtLambdaExpression) {
            inferenceNodeTypeKotlinTypeOf = descriptorTypeOf((PsiElement) ((KtLambdaExpression) psiElement).getFunctionLiteral());
        } else {
            inferenceNodeTypeKotlinTypeOf = psiElement instanceof KtFunctionLiteral ? true : psiElement instanceof KtFunction ? descriptorTypeOf(psiElement) : ((psiElement instanceof KtProperty) || (psiElement instanceof KtPropertyAccessor) || (psiElement instanceof KtExpression)) ? kotlinTypeOf((KtExpression) psiElement) : descriptorTypeOf(psiElement);
        }
        this.type = inferenceNodeTypeKotlinTypeOf;
    }

    private final InferenceNodeType descriptorTypeOf(PsiElement element) {
        CallableDescriptor callableDescriptor = (SimpleFunctionDescriptor) this.bindingContext.get(BindingContext.FUNCTION, element);
        return callableDescriptor != null ? new InferenceDescriptorType(callableDescriptor) : new InferenceUnknownType();
    }

    private final InferenceNodeType kotlinTypeOf(KtExpression element) {
        KotlinType kotlinType = CodegenUtilKt.kotlinType(element, this.bindingContext);
        return kotlinType != null ? new InferenceKotlinType(kotlinType) : new InferenceUnknownType();
    }

    @NotNull
    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.k1.InferenceNode
    @NotNull
    public InferenceNodeType getType() {
        return this.type;
    }
}
