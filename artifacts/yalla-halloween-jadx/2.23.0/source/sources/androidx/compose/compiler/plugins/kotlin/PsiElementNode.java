package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/PsiElementNode;", "Landroidx/compose/compiler/plugins/kotlin/InferenceNode;", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lcom/intellij/psi/PsiElement;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "getBindingContext", "()Lorg/jetbrains/kotlin/resolve/BindingContext;", "type", "Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "getType", "()Landroidx/compose/compiler/plugins/kotlin/InferenceNodeType;", "descriptorTypeOf", "kotlinTypeOf", "Lorg/jetbrains/kotlin/psi/KtExpression;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PsiElementNode extends InferenceNode {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final InferenceNodeType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PsiElementNode(@NotNull PsiElement element, @NotNull BindingContext bindingContext) {
        InferenceNodeType inferenceNodeTypeKotlinTypeOf;
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        this.bindingContext = bindingContext;
        if (element instanceof KtLambdaExpression) {
            KtFunctionLiteral functionLiteral = ((KtLambdaExpression) element).getFunctionLiteral();
            Intrinsics.checkNotNullExpressionValue(functionLiteral, "element.functionLiteral");
            inferenceNodeTypeKotlinTypeOf = descriptorTypeOf((PsiElement) functionLiteral);
        } else {
            inferenceNodeTypeKotlinTypeOf = element instanceof KtFunctionLiteral ? true : element instanceof KtFunction ? descriptorTypeOf(element) : ((element instanceof KtProperty) || (element instanceof KtPropertyAccessor) || (element instanceof KtExpression)) ? kotlinTypeOf((KtExpression) element) : descriptorTypeOf(element);
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

    @Override // androidx.compose.compiler.plugins.kotlin.InferenceNode
    @NotNull
    public InferenceNodeType getType() {
        return this.type;
    }
}
