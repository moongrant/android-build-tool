package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.ComposeWritableSlices;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.FunctionTypesKt;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyGetterDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors;
import org.jetbrains.kotlin.descriptors.annotations.Annotated;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor;
import org.jetbrains.kotlin.descriptors.synthetic.FunctionInterfaceConstructorDescriptor;
import org.jetbrains.kotlin.js.resolve.diagnostics.SourceLocationUtilsKt;
import org.jetbrains.kotlin.psi.Call;
import org.jetbrains.kotlin.psi.KtAnnotationEntry;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtFunctionLiteral;
import org.jetbrains.kotlin.psi.KtLambdaExpression;
import org.jetbrains.kotlin.psi.KtPsiUtil;
import org.jetbrains.kotlin.psi.ValueArgument;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.calls.context.CallPosition;
import org.jetbrains.kotlin.resolve.calls.context.ResolutionContext;
import org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch;
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall;
import org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall;
import org.jetbrains.kotlin.resolve.calls.util.CallUtilKt;
import org.jetbrains.kotlin.resolve.sam.SamConversionResolverImplKt;
import org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u001a\u0010\f\u001a\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000e\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u0018\u0010\u0011\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0012\u0010\u0012\u001a\u00020\t*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u0014\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0015\u001a\u0016\u0010\u0016\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\u0005\u001a\u000e\u0010\u0017\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0015\u001a\f\u0010\u0018\u001a\u00020\t*\u00020\u0013H\u0000\u001a\u000e\u0010\u0019\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0015¨\u0006\u001a"}, d2 = {"getArgumentDescriptor", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "expression", "Lorg/jetbrains/kotlin/psi/KtExpression;", "context", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "getValueArgumentPositionFromPsi", "Lorg/jetbrains/kotlin/resolve/calls/context/CallPosition$ValueArgumentPosition;", "allowsComposableCalls", "", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "bindingContext", "getValueArgumentPosition", "Lorg/jetbrains/kotlin/resolve/calls/context/ResolutionContext;", "hasComposableAnnotation", "", "Lorg/jetbrains/kotlin/psi/KtAnnotationEntry;", "hasComposableExpectedType", "isComposableCallable", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "isComposableDelegateOperator", "Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;", "isComposableDelegateReference", "isComposableInvocation", "isMarkedAsComposable", "isReadOnlyComposableInvocation", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposableCallCheckerKt {
    public static final boolean allowsComposableCalls(@NotNull FunctionDescriptor functionDescriptor, @NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        if (isComposableCallable((CallableDescriptor) functionDescriptor, bindingContext)) {
            return true;
        }
        return Intrinsics.areEqual(bindingContext.get(ComposeWritableSlices.INSTANCE.getLAMBDA_CAPABLE_OF_COMPOSER_CAPTURE(), functionDescriptor), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueParameterDescriptor getArgumentDescriptor(KtExpression ktExpression, BindingContext bindingContext) {
        CallPosition.ValueArgumentPosition valueArgumentPositionFromPsi = getValueArgumentPositionFromPsi(ktExpression, bindingContext);
        if (valueArgumentPositionFromPsi != null) {
            return valueArgumentPositionFromPsi.getValueParameter();
        }
        return null;
    }

    private static final CallPosition.ValueArgumentPosition getValueArgumentPosition(ResolutionContext<?> resolutionContext, KtExpression ktExpression) {
        CallPosition.ValueArgumentPosition callPosition = resolutionContext.callPosition;
        Intrinsics.checkNotNullExpressionValue(callPosition, "callPosition");
        if (callPosition instanceof CallPosition.ValueArgumentPosition) {
            return callPosition;
        }
        if (!(callPosition instanceof CallPosition.Unknown)) {
            return null;
        }
        BindingContext bindingContext = resolutionContext.trace.getBindingContext();
        Intrinsics.checkNotNullExpressionValue(bindingContext, "trace.bindingContext");
        return getValueArgumentPositionFromPsi(ktExpression, bindingContext);
    }

    private static final CallPosition.ValueArgumentPosition getValueArgumentPositionFromPsi(KtExpression ktExpression, BindingContext bindingContext) {
        ResolvedCall resolvedCall = CallUtilKt.getResolvedCall(KtPsiUtil.getParentCallIfPresent(ktExpression), bindingContext);
        if (resolvedCall == null) {
            return null;
        }
        Call call = resolvedCall.getCall();
        Intrinsics.checkNotNullExpressionValue(call, "resolvedCall.call");
        ValueArgument valueArgumentForExpression = CallUtilKt.getValueArgumentForExpression(call, ktExpression);
        if (valueArgumentForExpression == null) {
            return null;
        }
        ArgumentMatch argumentMapping = resolvedCall.getArgumentMapping(valueArgumentForExpression);
        ArgumentMatch argumentMatch = argumentMapping instanceof ArgumentMatch ? argumentMapping : null;
        if (argumentMatch == null) {
            return null;
        }
        return new CallPosition.ValueArgumentPosition(resolvedCall, argumentMatch.getValueParameter(), valueArgumentForExpression);
    }

    public static final boolean hasComposableAnnotation(@NotNull List<? extends KtAnnotationEntry> list, @NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Iterator<? extends KtAnnotationEntry> it = list.iterator();
        while (it.hasNext()) {
            AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) bindingContext.get(BindingContext.ANNOTATION, it.next());
            if (annotationDescriptor != null && ComposeFqNamesKt.isComposableAnnotation(annotationDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean hasComposableExpectedType(@NotNull ResolutionContext<?> resolutionContext, @NotNull KtExpression expression) {
        CallPosition.ValueArgumentPosition valueArgumentPosition;
        ClassDescriptor classDescriptor;
        Intrinsics.checkNotNullParameter(resolutionContext, "<this>");
        Intrinsics.checkNotNullParameter(expression, "expression");
        KotlinType expectedType = resolutionContext.expectedType;
        Intrinsics.checkNotNullExpressionValue(expectedType, "expectedType");
        if (ComposeFqNamesKt.hasComposableAnnotation(expectedType)) {
            return true;
        }
        KotlinType expectedType2 = resolutionContext.expectedType;
        Intrinsics.checkNotNullExpressionValue(expectedType2, "expectedType");
        if (!ComposeFqNamesKt.isSpecialType(expectedType2)) {
            KotlinType expectedType3 = resolutionContext.expectedType;
            Intrinsics.checkNotNullExpressionValue(expectedType3, "expectedType");
            if (!FunctionTypesKt.isBuiltinFunctionalType(expectedType3) || (valueArgumentPosition = getValueArgumentPosition(resolutionContext, expression)) == null) {
                return false;
            }
            FunctionInterfaceConstructorDescriptor original = valueArgumentPosition.getResolvedCall().getResultingDescriptor().getOriginal();
            Intrinsics.checkNotNullExpressionValue(original, "position.resolvedCall.resultingDescriptor.original");
            if (original instanceof FunctionInterfaceConstructorDescriptor) {
                classDescriptor = (ClassDescriptor) original.getBaseDescriptorForSynthetic();
            } else {
                ClassDescriptor declarationDescriptor = valueArgumentPosition.getValueParameter().getType().getConstructor().getDeclarationDescriptor();
                classDescriptor = declarationDescriptor instanceof ClassDescriptor ? declarationDescriptor : null;
                if (classDescriptor == null) {
                    return false;
                }
            }
            Annotated singleAbstractMethodOrNull = SamConversionResolverImplKt.getSingleAbstractMethodOrNull(classDescriptor);
            return singleAbstractMethodOrNull != null && ComposeFqNamesKt.hasComposableAnnotation(singleAbstractMethodOrNull);
        }
        return false;
    }

    public static final boolean isComposableCallable(@NotNull CallableDescriptor callableDescriptor, @NotNull BindingContext bindingContext) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        if (isMarkedAsComposable(callableDescriptor)) {
            return true;
        }
        if ((callableDescriptor instanceof FunctionDescriptor) && Intrinsics.areEqual(bindingContext.get(ComposeWritableSlices.INSTANCE.getINFERRED_COMPOSABLE_DESCRIPTOR(), callableDescriptor), Boolean.TRUE)) {
            return true;
        }
        KtFunctionLiteral ktFunctionLiteralFindPsi = SourceLocationUtilsKt.findPsi((DeclarationDescriptor) callableDescriptor);
        KtFunctionLiteral ktFunctionLiteral = ktFunctionLiteralFindPsi instanceof KtFunctionLiteral ? ktFunctionLiteralFindPsi : null;
        if (ktFunctionLiteral == null) {
            return false;
        }
        List annotationEntries = ktFunctionLiteral.getAnnotationEntries();
        Intrinsics.checkNotNullExpressionValue(annotationEntries, "functionLiteral.annotationEntries");
        if (hasComposableAnnotation(annotationEntries, bindingContext)) {
            return true;
        }
        PsiElement parent = ktFunctionLiteral.getParent();
        KtLambdaExpression ktLambdaExpression = parent instanceof KtLambdaExpression ? (KtLambdaExpression) parent : null;
        return ktLambdaExpression != null && Intrinsics.areEqual(bindingContext.get(ComposeWritableSlices.INSTANCE.getINFERRED_COMPOSABLE_LITERAL(), ktLambdaExpression), Boolean.TRUE);
    }

    public static final boolean isComposableDelegateOperator(@NotNull ResolvedCall<?> resolvedCall) {
        Intrinsics.checkNotNullParameter(resolvedCall, "<this>");
        FunctionDescriptor candidateDescriptor = resolvedCall.getCandidateDescriptor();
        if (candidateDescriptor instanceof FunctionDescriptor) {
            FunctionDescriptor functionDescriptor = candidateDescriptor;
            if (functionDescriptor.isOperator() && OperatorNameConventions.DELEGATED_PROPERTY_OPERATORS.contains(functionDescriptor.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isComposableDelegateReference(@NotNull ResolvedCall<?> resolvedCall, @NotNull BindingContext bindingContext) {
        ResolvedCall resolvedCall2;
        CallableDescriptor callableDescriptor;
        Intrinsics.checkNotNullParameter(resolvedCall, "<this>");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        VariableDescriptorWithAccessors candidateDescriptor = resolvedCall.getCandidateDescriptor();
        return (candidateDescriptor instanceof VariableDescriptorWithAccessors) && (resolvedCall2 = (ResolvedCall) bindingContext.get(BindingContext.DELEGATED_PROPERTY_RESOLVED_CALL, candidateDescriptor.getGetter())) != null && (callableDescriptor = (FunctionDescriptor) resolvedCall2.getCandidateDescriptor()) != null && isMarkedAsComposable(callableDescriptor);
    }

    public static final boolean isComposableInvocation(@NotNull ResolvedCall<?> resolvedCall) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(resolvedCall, "<this>");
        if (resolvedCall instanceof VariableAsFunctionResolvedCall) {
            VariableAsFunctionResolvedCall variableAsFunctionResolvedCall = (VariableAsFunctionResolvedCall) resolvedCall;
            KotlinType type2 = variableAsFunctionResolvedCall.getVariableCall().getCandidateDescriptor().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "variableCall.candidateDescriptor.type");
            if (ComposeFqNamesKt.hasComposableAnnotation(type2)) {
                return true;
            }
            Annotated resultingDescriptor = variableAsFunctionResolvedCall.getFunctionCall().getResultingDescriptor();
            Intrinsics.checkNotNullExpressionValue(resultingDescriptor, "functionCall.resultingDescriptor");
            return ComposeFqNamesKt.hasComposableAnnotation(resultingDescriptor);
        }
        FunctionDescriptor candidateDescriptor = resolvedCall.getCandidateDescriptor();
        if (candidateDescriptor instanceof FunctionDescriptor) {
            FunctionDescriptor functionDescriptor = candidateDescriptor;
            if (functionDescriptor.isOperator() && Intrinsics.areEqual(functionDescriptor.getName(), OperatorNameConventions.INVOKE)) {
                ReceiverValue dispatchReceiver = resolvedCall.getDispatchReceiver();
                if ((dispatchReceiver == null || (type = dispatchReceiver.getType()) == null || !ComposeFqNamesKt.hasComposableAnnotation(type)) ? false : true) {
                    return true;
                }
            }
        }
        if ((candidateDescriptor instanceof ValueParameterDescriptor) || (candidateDescriptor instanceof LocalVariableDescriptor)) {
            return false;
        }
        if (!(candidateDescriptor instanceof PropertyDescriptor)) {
            if (candidateDescriptor instanceof PropertyGetterDescriptor) {
                Intrinsics.checkNotNullExpressionValue(candidateDescriptor, "candidateDescriptor");
                return ComposeFqNamesKt.hasComposableAnnotation((Annotated) candidateDescriptor);
            }
            Intrinsics.checkNotNullExpressionValue(candidateDescriptor, "candidateDescriptor");
            return ComposeFqNamesKt.hasComposableAnnotation((Annotated) candidateDescriptor);
        }
        boolean zIsEmpty = resolvedCall.getValueArguments().isEmpty();
        Annotated getter = ((PropertyDescriptor) candidateDescriptor).getGetter();
        if (!zIsEmpty || getter == null) {
            return false;
        }
        return ComposeFqNamesKt.hasComposableAnnotation(getter);
    }

    public static final boolean isMarkedAsComposable(@NotNull CallableDescriptor callableDescriptor) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
        if (callableDescriptor instanceof PropertyGetterDescriptor) {
            return ComposeFqNamesKt.hasComposableAnnotation((Annotated) callableDescriptor);
        }
        if (callableDescriptor instanceof ValueParameterDescriptor) {
            KotlinType type = ((ValueParameterDescriptor) callableDescriptor).getType();
            Intrinsics.checkNotNullExpressionValue(type, "type");
            return ComposeFqNamesKt.hasComposableAnnotation(type);
        }
        if (callableDescriptor instanceof LocalVariableDescriptor) {
            KotlinType type2 = ((LocalVariableDescriptor) callableDescriptor).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "type");
            return ComposeFqNamesKt.hasComposableAnnotation(type2);
        }
        if (callableDescriptor instanceof PropertyDescriptor) {
            return false;
        }
        return ComposeFqNamesKt.hasComposableAnnotation((Annotated) callableDescriptor);
    }

    public static final boolean isReadOnlyComposableInvocation(@NotNull ResolvedCall<?> resolvedCall) {
        Intrinsics.checkNotNullParameter(resolvedCall, "<this>");
        if (resolvedCall instanceof VariableAsFunctionResolvedCall) {
            return false;
        }
        PropertyDescriptor candidateDescriptor = resolvedCall.getCandidateDescriptor();
        if ((candidateDescriptor instanceof ValueParameterDescriptor) || (candidateDescriptor instanceof LocalVariableDescriptor)) {
            return false;
        }
        if (!(candidateDescriptor instanceof PropertyDescriptor)) {
            if (candidateDescriptor instanceof PropertyGetterDescriptor) {
                return ComposeFqNamesKt.hasReadonlyComposableAnnotation((Annotated) candidateDescriptor);
            }
            Intrinsics.checkNotNullExpressionValue(candidateDescriptor, "candidateDescriptor");
            return ComposeFqNamesKt.hasReadonlyComposableAnnotation((Annotated) candidateDescriptor);
        }
        boolean zIsEmpty = resolvedCall.getValueArguments().isEmpty();
        Annotated getter = candidateDescriptor.getGetter();
        if (!zIsEmpty || getter == null) {
            return false;
        }
        return ComposeFqNamesKt.hasReadonlyComposableAnnotation(getter);
    }
}
