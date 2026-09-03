package androidx.compose.compiler.plugins.kotlin.k1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.FunctionTypesKt;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.container.DslKt;
import org.jetbrains.kotlin.container.StorageComponentContainer;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.MemberDescriptor;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.descriptors.ModuleDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor;
import org.jetbrains.kotlin.descriptors.PropertyDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.descriptors.annotations.Annotated;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory0;
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor;
import org.jetbrains.kotlin.idea.MainFunctionDetector;
import org.jetbrains.kotlin.platform.TargetPlatform;
import org.jetbrains.kotlin.psi.KtDeclaration;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtFunction;
import org.jetbrains.kotlin.psi.KtParameter;
import org.jetbrains.kotlin.psi.KtProperty;
import org.jetbrains.kotlin.psi.KtPropertyAccessor;
import org.jetbrains.kotlin.psi.KtTypeReference;
import org.jetbrains.kotlin.resolve.BindingTrace;
import org.jetbrains.kotlin.resolve.checkers.DeclarationChecker;
import org.jetbrains.kotlin.resolve.checkers.DeclarationCheckerContext;
import org.jetbrains.kotlin.resolve.multiplatform.ExpectedActualResolverKt;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.typeUtil.TypeUtilsKt;
import org.jetbrains.kotlin.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006%"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposableDeclarationChecker;", "Lorg/jetbrains/kotlin/resolve/checkers/DeclarationChecker;", "Lorg/jetbrains/kotlin/extensions/StorageComponentContainerContributor;", "()V", "arity", "", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "getArity", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)I", "check", "", "declaration", "Lorg/jetbrains/kotlin/psi/KtDeclaration;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "context", "Lorg/jetbrains/kotlin/resolve/checkers/DeclarationCheckerContext;", "checkFunction", "Lorg/jetbrains/kotlin/psi/KtFunction;", "checkProperty", "Lorg/jetbrains/kotlin/psi/KtProperty;", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "checkPropertyAccessor", "Lorg/jetbrains/kotlin/psi/KtPropertyAccessor;", "Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "checkType", "type", "Lorg/jetbrains/kotlin/types/KotlinType;", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "registerModuleComponents", "container", "Lorg/jetbrains/kotlin/container/StorageComponentContainer;", "platform", "Lorg/jetbrains/kotlin/platform/TargetPlatform;", "moduleDescriptor", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableDeclarationChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableDeclarationChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k1/ComposableDeclarationChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1747#2,3:274\n1855#2,2:277\n1855#2,2:279\n*S KotlinDebug\n*F\n+ 1 ComposableDeclarationChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k1/ComposableDeclarationChecker\n*L\n86#1:274,3\n109#1:277,2\n145#1:279,2\n*E\n"})
public final class ComposableDeclarationChecker implements DeclarationChecker, StorageComponentContainerContributor {
    /* JADX WARN: Code duplicated, block: B:33:0x0096 A[EDGE_INSN: B:33:0x0096->B:34:0x0097 BREAK  A[LOOP:0: B:21:0x0068->B:110:?]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    private final void checkFunction(KtFunction declaration, FunctionDescriptor descriptor, DeclarationCheckerContext context) {
        Annotated annotated;
        boolean zHasComposableAnnotation;
        boolean z;
        boolean zHasComposableAnnotation2 = AnnotationUtilsKt.hasComposableAnnotation((Annotated) descriptor);
        if (!descriptor.getOverriddenDescriptors().isEmpty()) {
            Annotated annotated2 = (FunctionDescriptor) CollectionsKt.first(descriptor.getOverriddenDescriptors());
            if (!descriptor.isOperator() || !Intrinsics.areEqual(descriptor.getName(), OperatorNameConventions.INVOKE)) {
                zHasComposableAnnotation = AnnotationUtilsKt.hasComposableAnnotation(annotated2);
            } else if (AnnotationUtilsKt.hasComposableAnnotation(annotated2)) {
                zHasComposableAnnotation = true;
            } else {
                ClassDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? containingDeclaration : null;
                if (classDescriptor == null) {
                    z = false;
                    break;
                }
                Collection collectionSupertypes = TypeUtilsKt.supertypes(classDescriptor.getDefaultType());
                if (!(collectionSupertypes instanceof Collection) || !collectionSupertypes.isEmpty()) {
                    Iterator it = collectionSupertypes.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        KotlinType kotlinType = (KotlinType) it.next();
                        if (FunctionTypesKt.isFunctionType(kotlinType) && kotlinType.getArguments().size() == getArity(descriptor) + 1 && AnnotationUtilsKt.hasComposableAnnotation(kotlinType)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    zHasComposableAnnotation = true;
                } else {
                    zHasComposableAnnotation = false;
                }
            }
            if (zHasComposableAnnotation != zHasComposableAnnotation2) {
                context.getTrace().report(ComposeErrors.CONFLICTING_OVERLOADS.on((PsiElement) declaration, CollectionsKt.listOf((Object[]) new FunctionDescriptor[]{descriptor, annotated2})));
            } else if (!ComposableTargetCheckerKt.toScheme((CallableDescriptor) descriptor, null).canOverride(ComposableTargetCheckerKt.toScheme((CallableDescriptor) annotated2, null))) {
                context.getTrace().report(ComposeErrors.COMPOSE_APPLIER_DECLARATION_MISMATCH.on((PsiElement) declaration));
            }
            for (ValueParameterDescriptor valueParameterDescriptor : descriptor.getValueParameters()) {
                ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) CollectionsKt.firstOrNull(valueParameterDescriptor.getOverriddenDescriptors());
                if (valueParameterDescriptor2 != null && AnnotationUtilsKt.hasComposableAnnotation(valueParameterDescriptor.getType()) != AnnotationUtilsKt.hasComposableAnnotation(valueParameterDescriptor2.getType())) {
                    context.getTrace().report(ComposeErrors.CONFLICTING_OVERLOADS.on((PsiElement) declaration, CollectionsKt.listOf((Object[]) new ValueParameterDescriptor[]{valueParameterDescriptor, valueParameterDescriptor2})));
                }
            }
        }
        if (descriptor.isSuspend() && zHasComposableAnnotation2) {
            BindingTrace trace = context.getTrace();
            DiagnosticFactory0<PsiElement> diagnosticFactory0 = ComposeErrors.COMPOSABLE_SUSPEND_FUN;
            PsiElement nameIdentifier = declaration.getNameIdentifier();
            if (nameIdentifier == null) {
                nameIdentifier = (PsiElement) declaration;
            }
            trace.report(diagnosticFactory0.on(nameIdentifier));
        }
        if (descriptor.isActual() && (annotated = (MemberDescriptor) CollectionsKt.singleOrNull(ExpectedActualResolverKt.findCompatibleExpectsForActual$default((MemberDescriptor) descriptor, (Function1) null, 1, (Object) null))) != null && AnnotationUtilsKt.hasComposableAnnotation(annotated) != zHasComposableAnnotation2) {
            BindingTrace trace2 = context.getTrace();
            DiagnosticFactory0<PsiElement> diagnosticFactory1 = ComposeErrors.MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL;
            PsiElement nameIdentifier2 = declaration.getNameIdentifier();
            if (nameIdentifier2 == null) {
                nameIdentifier2 = (PsiElement) declaration;
            }
            trace2.report(diagnosticFactory1.on(nameIdentifier2));
        }
        if (zHasComposableAnnotation2 && descriptor.getModality() == Modality.ABSTRACT) {
            Iterator it2 = declaration.getValueParameters().iterator();
            while (it2.hasNext()) {
                PsiElement defaultValue = ((KtParameter) it2.next()).getDefaultValue();
                if (defaultValue != null) {
                    context.getTrace().report(ComposeErrors.ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE.on(defaultValue));
                }
            }
        }
        List valueParameters = descriptor.getValueParameters();
        List valueParameters2 = declaration.getValueParameters();
        if (valueParameters.size() == valueParameters2.size()) {
            for (Pair pair : CollectionsKt.zip(valueParameters, valueParameters2)) {
                ValueParameterDescriptor valueParameterDescriptor3 = (ValueParameterDescriptor) pair.component1();
                KtTypeReference typeReference = ((KtParameter) pair.component2()).getTypeReference();
                if (typeReference != null) {
                    checkType(valueParameterDescriptor3.getType(), (PsiElement) typeReference, context);
                }
            }
        }
        if (zHasComposableAnnotation2 && Intrinsics.areEqual(descriptor.getName().asString(), "main") && MainFunctionDetector.isMain$default(new MainFunctionDetector(context.getTrace().getBindingContext(), context.getLanguageVersionSettings()), (DeclarationDescriptor) descriptor, false, false, false, 14, (Object) null)) {
            BindingTrace trace3 = context.getTrace();
            DiagnosticFactory0<PsiElement> diagnosticFactory2 = ComposeErrors.COMPOSABLE_FUN_MAIN;
            PsiElement nameIdentifier3 = declaration.getNameIdentifier();
            if (nameIdentifier3 == null) {
                nameIdentifier3 = (PsiElement) declaration;
            }
            trace3.report(diagnosticFactory2.on(nameIdentifier3));
        }
        if (zHasComposableAnnotation2 && descriptor.isOperator() && Intrinsics.areEqual(descriptor.getName(), OperatorNameConventions.SET_VALUE)) {
            BindingTrace trace4 = context.getTrace();
            DiagnosticFactory0<PsiElement> diagnosticFactory3 = ComposeErrors.COMPOSE_INVALID_DELEGATE;
            PsiElement nameIdentifier4 = declaration.getNameIdentifier();
            if (nameIdentifier4 == null) {
                nameIdentifier4 = (PsiElement) declaration;
            }
            trace4.report(diagnosticFactory3.on(nameIdentifier4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    private final void checkProperty(KtProperty declaration, PropertyDescriptor descriptor, DeclarationCheckerContext context) {
        boolean z;
        Annotated getter = descriptor.getGetter();
        boolean z2 = getter != null && AnnotationUtilsKt.hasComposableAnnotation(getter);
        if (!descriptor.getOverriddenDescriptors().isEmpty()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) CollectionsKt.first(descriptor.getOverriddenDescriptors());
            if (AnnotationUtilsKt.hasComposableAnnotation((Annotated) propertyDescriptor)) {
                z = true;
            } else {
                Annotated getter2 = propertyDescriptor.getGetter();
                if (getter2 != null && AnnotationUtilsKt.hasComposableAnnotation(getter2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z != z2) {
                context.getTrace().report(ComposeErrors.CONFLICTING_OVERLOADS.on((PsiElement) declaration, CollectionsKt.listOf((Object[]) new PropertyDescriptor[]{descriptor, propertyDescriptor})));
            }
        }
        if (z2) {
            KtExpression initializer = declaration.getInitializer();
            PsiElement nameIdentifier = declaration.getNameIdentifier();
            if (initializer != null && nameIdentifier != null) {
                context.getTrace().report(ComposeErrors.COMPOSABLE_PROPERTY_BACKING_FIELD.on(nameIdentifier));
            }
            if (!descriptor.isVar() || nameIdentifier == null) {
                return;
            }
            context.getTrace().report(ComposeErrors.COMPOSABLE_VAR.on(nameIdentifier));
        }
    }

    private final void checkPropertyAccessor(KtPropertyAccessor declaration, PropertyAccessorDescriptor descriptor, DeclarationCheckerContext context) {
        PropertyDescriptor correspondingProperty = descriptor.getCorrespondingProperty();
        KtProperty parent = declaration.getParent();
        KtProperty ktProperty = parent instanceof KtProperty ? parent : null;
        if (ktProperty == null) {
            return;
        }
        PsiElement nameIdentifier = ktProperty.getNameIdentifier();
        KtExpression initializer = ktProperty.getInitializer();
        boolean zHasComposableAnnotation = AnnotationUtilsKt.hasComposableAnnotation((Annotated) descriptor);
        if (!descriptor.getOverriddenDescriptors().isEmpty()) {
            PropertyAccessorDescriptor propertyAccessorDescriptor = (PropertyAccessorDescriptor) CollectionsKt.first(descriptor.getOverriddenDescriptors());
            if (AnnotationUtilsKt.hasComposableAnnotation((Annotated) propertyAccessorDescriptor) != zHasComposableAnnotation) {
                context.getTrace().report(ComposeErrors.CONFLICTING_OVERLOADS.on((PsiElement) declaration, CollectionsKt.listOf((Object[]) new PropertyAccessorDescriptor[]{descriptor, propertyAccessorDescriptor})));
            }
        }
        if (zHasComposableAnnotation) {
            if (initializer != null && nameIdentifier != null) {
                context.getTrace().report(ComposeErrors.COMPOSABLE_PROPERTY_BACKING_FIELD.on(nameIdentifier));
            }
            if (!correspondingProperty.isVar() || nameIdentifier == null) {
                return;
            }
            context.getTrace().report(ComposeErrors.COMPOSABLE_VAR.on(nameIdentifier));
        }
    }

    private final void checkType(KotlinType type, PsiElement element, DeclarationCheckerContext context) {
        if (AnnotationUtilsKt.hasComposableAnnotation(type) && FunctionTypesKt.isSuspendFunctionType(type)) {
            context.getTrace().report(ComposeErrors.COMPOSABLE_SUSPEND_FUN.on(element));
        }
    }

    private final int getArity(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor.getExtensionReceiverParameter() != null) {
            return 1;
        }
        return functionDescriptor.getValueParameters().size() + functionDescriptor.getContextReceiverParameters().size() + 0;
    }

    public void check(@NotNull KtDeclaration declaration, @NotNull DeclarationDescriptor descriptor, @NotNull DeclarationCheckerContext context) {
        if ((declaration instanceof KtProperty) && (descriptor instanceof PropertyDescriptor)) {
            checkProperty((KtProperty) declaration, (PropertyDescriptor) descriptor, context);
            return;
        }
        if ((declaration instanceof KtPropertyAccessor) && (descriptor instanceof PropertyAccessorDescriptor)) {
            checkPropertyAccessor((KtPropertyAccessor) declaration, (PropertyAccessorDescriptor) descriptor, context);
        } else if ((declaration instanceof KtFunction) && (descriptor instanceof FunctionDescriptor)) {
            checkFunction((KtFunction) declaration, (FunctionDescriptor) descriptor, context);
        }
    }

    public void registerModuleComponents(@NotNull StorageComponentContainer container, @NotNull TargetPlatform platform, @NotNull ModuleDescriptor moduleDescriptor) {
        DslKt.useInstance(container, this);
    }
}
