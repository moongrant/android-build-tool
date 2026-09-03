package androidx.compose.compiler.plugins.kotlin.k1;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.container.DslKt;
import org.jetbrains.kotlin.container.StorageComponentContainer;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.ModuleDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyDescriptor;
import org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.descriptors.VariableDescriptor;
import org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors;
import org.jetbrains.kotlin.descriptors.annotations.Annotated;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.descriptors.impl.LocalVariableDescriptor;
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor;
import org.jetbrains.kotlin.js.resolve.diagnostics.SourceLocationUtilsKt;
import org.jetbrains.kotlin.platform.TargetPlatform;
import org.jetbrains.kotlin.psi.KtAnnotatedExpression;
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression;
import org.jetbrains.kotlin.psi.KtClass;
import org.jetbrains.kotlin.psi.KtElement;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtFile;
import org.jetbrains.kotlin.psi.KtFunction;
import org.jetbrains.kotlin.psi.KtFunctionLiteral;
import org.jetbrains.kotlin.psi.KtLambdaExpression;
import org.jetbrains.kotlin.psi.KtProperty;
import org.jetbrains.kotlin.psi.KtPropertyAccessor;
import org.jetbrains.kotlin.psi.KtTryExpression;
import org.jetbrains.kotlin.psi.ValueArgument;
import org.jetbrains.kotlin.psi.ValueArgumentName;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.calls.checkers.AdditionalTypeChecker;
import org.jetbrains.kotlin.resolve.calls.checkers.CallChecker;
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext;
import org.jetbrains.kotlin.resolve.calls.context.ResolutionContext;
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall;
import org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall;
import org.jetbrains.kotlin.resolve.inline.InlineUtil;
import org.jetbrains.kotlin.resolve.source.PsiSourceElement;
import org.jetbrains.kotlin.types.FlexibleTypesKt;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.SimpleType;
import org.jetbrains.kotlin.types.TypeUtils;
import org.jetbrains.kotlin.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J,\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\nH\u0002J$\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J(\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J \u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u001c\u0010+\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006,"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposableCallChecker;", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallChecker;", "Lorg/jetbrains/kotlin/resolve/calls/checkers/AdditionalTypeChecker;", "Lorg/jetbrains/kotlin/extensions/StorageComponentContainerContributor;", "()V", "check", "", "resolvedCall", "Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;", "reportOn", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "context", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "checkInlineLambdaCall", "checkType", "expression", "Lorg/jetbrains/kotlin/psi/KtExpression;", "expressionType", "Lorg/jetbrains/kotlin/types/KotlinType;", "expressionTypeWithSmartCast", "c", "Lorg/jetbrains/kotlin/resolve/calls/context/ResolutionContext;", "composableExpected", "functionEl", "illegalCall", "callEl", "illegalCallMustBeReadonly", "illegalComposableDelegate", "illegalComposableFunctionReference", "refExpr", "Lorg/jetbrains/kotlin/psi/KtCallableReferenceExpression;", "missingDisallowedComposableCallPropagation", "unmarkedParamEl", "unmarkedParamDescriptor", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "markedParamDescriptor", "registerModuleComponents", "container", "Lorg/jetbrains/kotlin/container/StorageComponentContainer;", "platform", "Lorg/jetbrains/kotlin/platform/TargetPlatform;", "moduleDescriptor", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "warnOnUnstableNamedArguments", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComposableCallChecker implements CallChecker, AdditionalTypeChecker, StorageComponentContainerContributor {
    private final void checkInlineLambdaCall(ResolvedCall<?> resolvedCall, PsiElement reportOn, CallCheckerContext context) {
        PsiElement psiElementFindPsi;
        Annotated type;
        if (resolvedCall instanceof VariableAsFunctionResolvedCall) {
            DeclarationDescriptor declarationDescriptor = (VariableDescriptor) ((VariableAsFunctionResolvedCall) resolvedCall).getVariableCall().getResultingDescriptor();
            if (declarationDescriptor instanceof ValueParameterDescriptor) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) declarationDescriptor;
                if (AnnotationUtilsKt.hasDisallowComposableCallsAnnotation(valueParameterDescriptor.getType())) {
                    return;
                }
                FunctionDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
                if ((containingDeclaration instanceof FunctionDescriptor) && containingDeclaration.isInline() && ComposableCallCheckerKt.isMarkedAsComposable(containingDeclaration)) {
                    BindingContext bindingContext = context.getTrace().getBindingContext();
                    while (reportOn != null) {
                        if (reportOn instanceof KtLambdaExpression) {
                            ValueParameterDescriptor argumentDescriptor = ComposableCallCheckerKt.getArgumentDescriptor(((KtLambdaExpression) reportOn).getFunctionLiteral(), bindingContext);
                            boolean z = false;
                            if (argumentDescriptor != null && (type = argumentDescriptor.getType()) != null && AnnotationUtilsKt.hasDisallowComposableCallsAnnotation(type)) {
                                z = true;
                            }
                            if (z && (psiElementFindPsi = SourceLocationUtilsKt.findPsi(declarationDescriptor)) != null) {
                                missingDisallowedComposableCallPropagation(context, psiElementFindPsi, valueParameterDescriptor, argumentDescriptor);
                            }
                        } else if ((reportOn instanceof KtFunction) && Intrinsics.areEqual((SimpleFunctionDescriptor) bindingContext.get(BindingContext.FUNCTION, reportOn), containingDeclaration)) {
                            return;
                        }
                        KtElement parent = reportOn.getParent();
                        reportOn = (PsiElement) (parent instanceof KtElement ? parent : null);
                    }
                }
            }
        }
    }

    private final void composableExpected(CallCheckerContext context, PsiElement functionEl) {
        context.getTrace().report(ComposeErrors.COMPOSABLE_EXPECTED.on(functionEl));
    }

    private final void illegalCall(CallCheckerContext context, PsiElement callEl, PsiElement functionEl) {
        context.getTrace().report(ComposeErrors.COMPOSABLE_INVOCATION.on(callEl));
        if (functionEl != null) {
            composableExpected(context, functionEl);
        }
    }

    public static /* synthetic */ void illegalCall$default(ComposableCallChecker composableCallChecker, CallCheckerContext callCheckerContext, PsiElement psiElement, PsiElement psiElement2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: illegalCall");
        }
        if ((i & 4) != 0) {
            psiElement2 = null;
        }
        composableCallChecker.illegalCall(callCheckerContext, psiElement, psiElement2);
    }

    private final void illegalCallMustBeReadonly(CallCheckerContext context, PsiElement callEl) {
        context.getTrace().report(ComposeErrors.NONREADONLY_CALL_IN_READONLY_COMPOSABLE.on(callEl));
    }

    private final void illegalComposableDelegate(CallCheckerContext context, PsiElement reportOn) {
        context.getTrace().report(ComposeErrors.COMPOSE_INVALID_DELEGATE.on(reportOn));
    }

    private final void illegalComposableFunctionReference(CallCheckerContext context, KtCallableReferenceExpression refExpr) {
        context.getTrace().report(ComposeErrors.COMPOSABLE_FUNCTION_REFERENCE.on((PsiElement) refExpr));
    }

    private final void missingDisallowedComposableCallPropagation(CallCheckerContext context, PsiElement unmarkedParamEl, ValueParameterDescriptor unmarkedParamDescriptor, ValueParameterDescriptor markedParamDescriptor) {
        context.getTrace().report(ComposeErrors.MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION.on(unmarkedParamEl, unmarkedParamDescriptor, markedParamDescriptor, markedParamDescriptor.getContainingDeclaration()));
    }

    private final void warnOnUnstableNamedArguments(ResolvedCall<?> resolvedCall, CallCheckerContext context) {
        PsiElement referenceExpression;
        CallableDescriptor candidateDescriptor = resolvedCall.getCandidateDescriptor();
        boolean z = false;
        if (candidateDescriptor != null && candidateDescriptor.hasStableParameterNames()) {
            z = true;
        }
        if (z) {
            return;
        }
        Iterator it = resolvedCall.getCall().getValueArguments().iterator();
        while (it.hasNext()) {
            ValueArgumentName argumentName = ((ValueArgument) it.next()).getArgumentName();
            if (argumentName != null && (referenceExpression = argumentName.getReferenceExpression()) != null) {
                context.getTrace().report(ComposeErrors.NAMED_ARGUMENTS_NOT_ALLOWED.on(referenceExpression));
            }
        }
    }

    public void check(@NotNull ResolvedCall<?> resolvedCall, @NotNull PsiElement reportOn, @NotNull CallCheckerContext context) {
        Annotated type;
        BindingContext bindingContext = context.getTrace().getBindingContext();
        if (!ComposableCallCheckerKt.isComposableDelegateReference(resolvedCall, bindingContext) && !ComposableCallCheckerKt.isComposableInvocation(resolvedCall)) {
            checkInlineLambdaCall(resolvedCall, reportOn, context);
            return;
        }
        warnOnUnstableNamedArguments(resolvedCall, context);
        PsiElement psiElement = reportOn;
        while (psiElement != null) {
            if (!(psiElement instanceof KtFunctionLiteral)) {
                boolean z = false;
                if (psiElement instanceof KtLambdaExpression) {
                    KtLambdaExpression ktLambdaExpression = (KtLambdaExpression) psiElement;
                    CallableDescriptor callableDescriptor = (SimpleFunctionDescriptor) bindingContext.get(BindingContext.FUNCTION, ktLambdaExpression.getFunctionLiteral());
                    if (callableDescriptor == null) {
                        illegalCall$default(this, context, reportOn, null, 4, null);
                        return;
                    }
                    if (ComposableCallCheckerKt.isComposableCallable(callableDescriptor, bindingContext)) {
                        return;
                    }
                    ValueParameterDescriptor argumentDescriptor = ComposableCallCheckerKt.getArgumentDescriptor(ktLambdaExpression.getFunctionLiteral(), bindingContext);
                    if (argumentDescriptor != null && (type = argumentDescriptor.getType()) != null && AnnotationUtilsKt.hasDisallowComposableCallsAnnotation(type)) {
                        z = true;
                    }
                    if (z) {
                        context.getTrace().record(FrontendWritableSlices.INSTANCE.getLAMBDA_CAPABLE_OF_COMPOSER_CAPTURE(), callableDescriptor, Boolean.FALSE);
                        context.getTrace().report(ComposeErrors.CAPTURED_COMPOSABLE_INVOCATION.on(reportOn, argumentDescriptor, argumentDescriptor.getContainingDeclaration()));
                        return;
                    } else {
                        if (!InlineUtil.isInlinedArgument(ktLambdaExpression.getFunctionLiteral(), bindingContext, true)) {
                            illegalCall$default(this, context, reportOn, null, 4, null);
                            return;
                        }
                        context.getTrace().record(FrontendWritableSlices.INSTANCE.getLAMBDA_CAPABLE_OF_COMPOSER_CAPTURE(), callableDescriptor, Boolean.TRUE);
                    }
                } else if (psiElement instanceof KtTryExpression) {
                    KtTryExpression ktTryExpression = (KtTryExpression) psiElement;
                    PsiElement tryKeyword = ktTryExpression.getTryKeyword();
                    if (ktTryExpression.getTryBlock().getTextRange().contains(reportOn.getTextRange()) && tryKeyword != null) {
                        context.getTrace().report(ComposeErrors.ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE.on(tryKeyword));
                    }
                } else {
                    if (psiElement instanceof KtFunction) {
                        Annotated annotated = (SimpleFunctionDescriptor) bindingContext.get(BindingContext.FUNCTION, psiElement);
                        if (annotated == null) {
                            illegalCall$default(this, context, reportOn, null, 4, null);
                            return;
                        }
                        if (!ComposableCallCheckerKt.isComposableCallable((CallableDescriptor) annotated, bindingContext)) {
                            PsiElement nameIdentifier = ((KtFunction) psiElement).getNameIdentifier();
                            if (nameIdentifier != null) {
                                psiElement = nameIdentifier;
                            }
                            illegalCall(context, reportOn, psiElement);
                        }
                        if (!AnnotationUtilsKt.hasReadonlyComposableAnnotation(annotated) || ComposableCallCheckerKt.isReadOnlyComposableInvocation(resolvedCall)) {
                            return;
                        }
                        illegalCallMustBeReadonly(context, reportOn);
                        return;
                    }
                    if (psiElement instanceof KtProperty) {
                        PropertyDescriptor propertyDescriptor = (DeclarationDescriptor) bindingContext.get(BindingContext.DECLARATION_TO_DESCRIPTOR, psiElement);
                        if (ComposableCallCheckerKt.isComposableDelegateOperator(resolvedCall) && (propertyDescriptor instanceof VariableDescriptorWithAccessors)) {
                            VariableDescriptorWithAccessors variableDescriptorWithAccessors = (VariableDescriptorWithAccessors) propertyDescriptor;
                            if (variableDescriptorWithAccessors.isDelegated()) {
                                if (variableDescriptorWithAccessors.isVar()) {
                                    illegalComposableDelegate(context, reportOn);
                                }
                                if (propertyDescriptor instanceof PropertyDescriptor) {
                                    Annotated getter = propertyDescriptor.getGetter();
                                    if (getter != null && AnnotationUtilsKt.hasComposableAnnotation(getter)) {
                                        z = true;
                                    }
                                    if (z) {
                                        return;
                                    }
                                    PsiElement nameIdentifier2 = ((KtProperty) psiElement).getNameIdentifier();
                                    if (nameIdentifier2 != null) {
                                        psiElement = nameIdentifier2;
                                    }
                                    composableExpected(context, psiElement);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!(propertyDescriptor instanceof LocalVariableDescriptor) && ComposableCallCheckerKt.hasComposableAnnotation(((KtProperty) psiElement).getAnnotationEntries(), bindingContext)) {
                            illegalCall$default(this, context, reportOn, null, 4, null);
                            return;
                        }
                    } else {
                        if (psiElement instanceof KtPropertyAccessor) {
                            KtPropertyAccessor ktPropertyAccessor = (KtPropertyAccessor) psiElement;
                            KtProperty property = ktPropertyAccessor.getProperty();
                            if (!ComposableCallCheckerKt.hasComposableAnnotation(ktPropertyAccessor.getAnnotationEntries(), bindingContext)) {
                                PsiElement nameIdentifier3 = property.getNameIdentifier();
                                if (nameIdentifier3 == null) {
                                    nameIdentifier3 = (PsiElement) property;
                                }
                                illegalCall(context, reportOn, nameIdentifier3);
                            }
                            Annotated annotated2 = (PropertyAccessorDescriptor) bindingContext.get(BindingContext.PROPERTY_ACCESSOR, psiElement);
                            if (annotated2 == null || !AnnotationUtilsKt.hasReadonlyComposableAnnotation(annotated2) || ComposableCallCheckerKt.isReadOnlyComposableInvocation(resolvedCall)) {
                                return;
                            }
                            illegalCallMustBeReadonly(context, reportOn);
                            return;
                        }
                        if (psiElement instanceof KtCallableReferenceExpression) {
                            illegalComposableFunctionReference(context, (KtCallableReferenceExpression) psiElement);
                            return;
                        } else if (psiElement instanceof KtFile) {
                            illegalCall$default(this, context, reportOn, null, 4, null);
                            return;
                        } else if (psiElement instanceof KtClass) {
                            illegalCall$default(this, context, reportOn, null, 4, null);
                            return;
                        }
                    }
                }
            }
            KtElement parent = psiElement.getParent();
            psiElement = (PsiElement) (parent instanceof KtElement ? parent : null);
        }
    }

    public void checkType(@NotNull KtExpression expression, @NotNull KotlinType expressionType, @NotNull KotlinType expressionTypeWithSmartCast, @NotNull ResolutionContext<?> c) {
        SimpleType simpleType;
        CallableDescriptor callableDescriptor;
        boolean zIsComposableCallable;
        PsiElement psi;
        BindingContext bindingContext = c.trace.getBindingContext();
        if (TypeUtilsKt.isNothing(expressionType) || (simpleType = c.expectedType) == TypeUtils.NO_EXPECTED_TYPE || simpleType == TypeUtils.UNIT_EXPECTED_TYPE || TypeUtilsKt.isAnyOrNullableAny(simpleType)) {
            return;
        }
        boolean zHasComposableExpectedType = ComposableCallCheckerKt.hasComposableExpectedType(c, expression);
        if (!(expression instanceof KtLambdaExpression)) {
            SimpleType nullableAnyType = TypeUtilsKt.getBuiltIns(simpleType).getNullableAnyType();
            if (Intrinsics.areEqual(TypeUtilsKt.getBuiltIns(simpleType).getAnyType(), FlexibleTypesKt.lowerIfFlexible(simpleType)) && Intrinsics.areEqual(nullableAnyType, FlexibleTypesKt.upperIfFlexible(simpleType))) {
                return;
            }
            SimpleType nullableNothingType = TypeUtilsKt.getBuiltIns(simpleType).getNullableNothingType();
            if ((simpleType.isMarkedNullable() && Intrinsics.areEqual(expressionTypeWithSmartCast, nullableNothingType)) || zHasComposableExpectedType == AnnotationUtilsKt.hasComposableAnnotation(expressionType)) {
                return;
            }
            if (expression.getParent() instanceof KtAnnotatedExpression) {
                PsiElement parent = expression.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtExpression");
                expression = (KtExpression) parent;
            }
            c.trace.report(ComposeErrors.TYPE_MISMATCH.on((PsiElement) expression, simpleType, expressionTypeWithSmartCast));
            return;
        }
        KtLambdaExpression ktLambdaExpression = (KtLambdaExpression) expression;
        CallableDescriptor callableDescriptor2 = (SimpleFunctionDescriptor) bindingContext.get(BindingContext.FUNCTION, ktLambdaExpression.getFunctionLiteral());
        if (callableDescriptor2 == null || zHasComposableExpectedType == (zIsComposableCallable = ComposableCallCheckerKt.isComposableCallable((callableDescriptor = callableDescriptor2), bindingContext))) {
            return;
        }
        if (!InlineUtil.isInlinedArgument(ktLambdaExpression.getFunctionLiteral(), c.trace.getBindingContext(), true)) {
            if (!zHasComposableExpectedType && zIsComposableCallable && Intrinsics.areEqual(c.trace.getBindingContext().get(FrontendWritableSlices.INSTANCE.getINFERRED_COMPOSABLE_DESCRIPTOR(), callableDescriptor2), Boolean.TRUE)) {
                return;
            }
            if (ktLambdaExpression.getParent() instanceof KtAnnotatedExpression) {
                PsiElement parent2 = ktLambdaExpression.getParent();
                Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type org.jetbrains.kotlin.psi.KtExpression");
                expression = (KtExpression) parent2;
            }
            c.trace.report(ComposeErrors.TYPE_MISMATCH.on((PsiElement) expression, simpleType, expressionTypeWithSmartCast));
            return;
        }
        if (zHasComposableExpectedType || !ComposableCallCheckerKt.isMarkedAsComposable(callableDescriptor)) {
            return;
        }
        AnnotationDescriptor annotationDescriptorFindAnnotation = callableDescriptor2.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getComposable());
        SourceElement source = annotationDescriptorFindAnnotation != null ? annotationDescriptorFindAnnotation.getSource() : null;
        PsiSourceElement psiSourceElement = source instanceof PsiSourceElement ? (PsiSourceElement) source : null;
        if (psiSourceElement == null || (psi = psiSourceElement.getPsi()) == null) {
            psi = (PsiElement) expression;
        }
        c.trace.report(ComposeErrors.REDUNDANT_COMPOSABLE_ANNOTATION.on(psi));
    }

    public void registerModuleComponents(@NotNull StorageComponentContainer container, @NotNull TargetPlatform platform, @NotNull ModuleDescriptor moduleDescriptor) {
        DslKt.useInstance(container, this);
    }
}
