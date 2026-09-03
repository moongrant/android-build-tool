package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.descriptors.annotations.Annotated;
import org.jetbrains.kotlin.descriptors.impl.AnonymousFunctionDescriptor;
import org.jetbrains.kotlin.extensions.internal.TypeResolutionInterceptorExtension;
import org.jetbrains.kotlin.psi.KtElement;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtLambdaExpression;
import org.jetbrains.kotlin.psi.psiUtil.KtPsiUtilKt;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.calls.context.ResolutionContext;
import org.jetbrains.kotlin.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.TypeUtils;
import org.jetbrains.kotlin.types.expressions.ExpressionTypingContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeTypeResolutionInterceptorExtension;", "Lorg/jetbrains/kotlin/extensions/internal/TypeResolutionInterceptorExtension;", "()V", "interceptFunctionLiteralDescriptor", "Lorg/jetbrains/kotlin/descriptors/impl/AnonymousFunctionDescriptor;", "expression", "Lorg/jetbrains/kotlin/psi/KtLambdaExpression;", "context", "Lorg/jetbrains/kotlin/types/expressions/ExpressionTypingContext;", "descriptor", "interceptType", "Lorg/jetbrains/kotlin/types/KotlinType;", "element", "Lorg/jetbrains/kotlin/psi/KtElement;", "resultType", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComposeTypeResolutionInterceptorExtension implements TypeResolutionInterceptorExtension {
    @NotNull
    public AnonymousFunctionDescriptor interceptFunctionLiteralDescriptor(@NotNull KtLambdaExpression expression, @NotNull ExpressionTypingContext context, @NotNull AnonymousFunctionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor.isSuspend() || ComposeFqNamesKt.hasComposableAnnotation((Annotated) descriptor) || !ComposableCallCheckerKt.hasComposableExpectedType((ResolutionContext) context, (KtExpression) expression)) {
            return descriptor;
        }
        AnonymousFunctionDescriptor anonymousFunctionDescriptorAnnotateAsComposable = ComposeFqNamesKt.annotateAsComposable(descriptor, DescriptorUtilsKt.getModule(context.scope.getOwnerDescriptor()));
        context.trace.record(ComposeWritableSlices.INSTANCE.getINFERRED_COMPOSABLE_DESCRIPTOR(), anonymousFunctionDescriptorAnnotateAsComposable, Boolean.TRUE);
        return anonymousFunctionDescriptorAnnotateAsComposable;
    }

    @NotNull
    public KotlinType interceptType(@NotNull KtElement element, @NotNull ExpressionTypingContext context, @NotNull KotlinType resultType) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        if (resultType == TypeUtils.NO_EXPECTED_TYPE || resultType == TypeUtils.UNIT_EXPECTED_TYPE || !(element instanceof KtLambdaExpression)) {
            return resultType;
        }
        KtExpression ktExpression = (KtExpression) element;
        List annotationEntries = KtPsiUtilKt.getAnnotationEntries(ktExpression);
        BindingContext bindingContext = context.trace.getBindingContext();
        Intrinsics.checkNotNullExpressionValue(bindingContext, "context.trace.bindingContext");
        if (!ComposableCallCheckerKt.hasComposableAnnotation(annotationEntries, bindingContext) && !ComposableCallCheckerKt.hasComposableExpectedType((ResolutionContext) context, ktExpression)) {
            return resultType;
        }
        context.trace.record(ComposeWritableSlices.INSTANCE.getINFERRED_COMPOSABLE_LITERAL(), element, Boolean.TRUE);
        return ComposeFqNamesKt.makeComposable(resultType, DescriptorUtilsKt.getModule(context.scope.getOwnerDescriptor()));
    }
}
