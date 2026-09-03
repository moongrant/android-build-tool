package androidx.compose.compiler.plugins.kotlin.k1;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.inference.ApplierInferencer;
import androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter;
import androidx.compose.compiler.plugins.kotlin.inference.LazyScheme;
import androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage;
import androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter;
import androidx.compose.compiler.plugins.kotlin.inference.NodeKind;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.builtins.FunctionTypesKt;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.container.DslKt;
import org.jetbrains.kotlin.container.StorageComponentContainer;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.FindClassInModuleKt;
import org.jetbrains.kotlin.descriptors.ModuleDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor;
import org.jetbrains.kotlin.name.ClassId;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.platform.TargetPlatform;
import org.jetbrains.kotlin.psi.KtClass;
import org.jetbrains.kotlin.psi.KtElement;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.psi.KtFile;
import org.jetbrains.kotlin.psi.KtFunction;
import org.jetbrains.kotlin.psi.KtFunctionLiteral;
import org.jetbrains.kotlin.psi.KtLabeledExpression;
import org.jetbrains.kotlin.psi.KtLambdaArgument;
import org.jetbrains.kotlin.psi.KtLambdaExpression;
import org.jetbrains.kotlin.psi.KtProperty;
import org.jetbrains.kotlin.psi.KtPropertyAccessor;
import org.jetbrains.kotlin.psi.KtReferenceExpression;
import org.jetbrains.kotlin.psi.ValueArgument;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.calls.checkers.CallChecker;
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext;
import org.jetbrains.kotlin.resolve.calls.model.ExpressionValueArgument;
import org.jetbrains.kotlin.resolve.calls.model.ResolvedCall;
import org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument;
import org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall;
import org.jetbrains.kotlin.resolve.constants.StringValue;
import org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0014\u0010%\u001a\u00020\t2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposableTargetChecker;", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallChecker;", "Lorg/jetbrains/kotlin/extensions/StorageComponentContainerContributor;", "()V", "callContext", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "infer", "Landroidx/compose/compiler/plugins/kotlin/inference/ApplierInferencer;", "Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNodeType;", "Landroidx/compose/compiler/plugins/kotlin/k1/InferenceNode;", "argumentToInferenceNode", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "element", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "check", "", "resolvedCall", "Lorg/jetbrains/kotlin/resolve/calls/model/ResolvedCall;", "reportOn", "context", "containerNodeOf", "Landroidx/compose/compiler/plugins/kotlin/k1/PsiElementNode;", "containerOf", "descriptorToInferenceNode", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "findParameterReferenceOrNull", "lambdaOrNull", "Lorg/jetbrains/kotlin/psi/KtFunctionLiteral;", "parameterDescriptorToInferenceNode", "registerModuleComponents", "container", "Lorg/jetbrains/kotlin/container/StorageComponentContainer;", "platform", "Lorg/jetbrains/kotlin/platform/TargetPlatform;", "moduleDescriptor", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "resolvedCallToInferenceNode", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k1/ComposableTargetChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n766#2:475\n857#2,2:476\n1549#2:478\n1620#2,2:479\n288#2,2:481\n1622#2:483\n766#2:484\n857#2,2:485\n*S KotlinDebug\n*F\n+ 1 ComposableTargetChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k1/ComposableTargetChecker\n*L\n297#1:475\n297#1:476,2\n300#1:478\n300#1:479,2\n301#1:481,2\n300#1:483\n403#1:484\n403#1:485,2\n*E\n"})
public final class ComposableTargetChecker implements CallChecker, StorageComponentContainerContributor {
    private CallCheckerContext callContext;

    @NotNull
    private final ApplierInferencer<InferenceNodeType, InferenceNode> infer = new ApplierInferencer<>(new TypeAdapter<InferenceNodeType>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$1
        @Override // androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter
        @Nullable
        public Scheme currentInferredSchemeOf(@NotNull InferenceNodeType type) {
            return null;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter
        public void updatedInferredScheme(@NotNull InferenceNodeType type, @NotNull Scheme scheme) {
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.TypeAdapter
        @NotNull
        public Scheme declaredSchemaOf(@NotNull InferenceNodeType type) {
            CallCheckerContext callCheckerContext = this.this$0.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            return type.toScheme(callCheckerContext);
        }
    }, new NodeAdapter<InferenceNodeType, InferenceNode>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$2
        @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
        @Nullable
        public InferenceNode referencedContainerOf(@NotNull InferenceNode node) {
            return null;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
        @NotNull
        public InferenceNode containerOf(@NotNull InferenceNode node) {
            PsiElementNode psiElementNodeContainerNodeOf = this.this$0.containerNodeOf(node.getElement());
            return psiElementNodeContainerNodeOf != null ? psiElementNodeContainerNodeOf : node;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
        @NotNull
        public NodeKind kindOf(@NotNull InferenceNode node) {
            return node.getKind();
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
        public int schemeParameterIndexOf(@NotNull InferenceNode node, @NotNull InferenceNode container) {
            ResolvedPsiParameterReference resolvedPsiParameterReference = node instanceof ResolvedPsiParameterReference ? (ResolvedPsiParameterReference) node : null;
            if (resolvedPsiParameterReference == null || !Intrinsics.areEqual(resolvedPsiParameterReference.getContainer(), container.getElement())) {
                return -1;
            }
            return resolvedPsiParameterReference.getIndex();
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.NodeAdapter
        @NotNull
        public InferenceNodeType typeOf(@NotNull InferenceNode node) {
            return node.getType();
        }
    }, new LazySchemeStorage<InferenceNode>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$4
        @Override // androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage
        @Nullable
        public LazyScheme getLazyScheme(@NotNull InferenceNode node) {
            CallCheckerContext callCheckerContext = this.this$0.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            return (LazyScheme) callCheckerContext.getTrace().getBindingContext().get(FrontendWritableSlices.INSTANCE.getCOMPOSE_LAZY_SCHEME(), node.getType());
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.LazySchemeStorage
        public void storeLazyScheme(@NotNull InferenceNode node, @NotNull LazyScheme value) {
            CallCheckerContext callCheckerContext = this.this$0.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            callCheckerContext.getTrace().record(FrontendWritableSlices.INSTANCE.getCOMPOSE_LAZY_SCHEME(), node.getType(), value);
        }
    }, new ErrorReporter<InferenceNode>() { // from class: androidx.compose.compiler.plugins.kotlin.k1.ComposableTargetChecker$infer$3
        /* JADX WARN: Code duplicated, block: B:22:0x007b  */
        private final String descriptionFrom(String token) {
            String str;
            FqName fqName = new FqName(token);
            CallCheckerContext callCheckerContext = this.this$0.callContext;
            String str2 = null;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(callCheckerContext.getModuleDescriptor(), ClassId.topLevel(fqName));
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return token;
            }
            AnnotationDescriptor annotationDescriptorFindAnnotation = classDescriptorFindClassAcrossModuleDependencies.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getComposableTargetMarker());
            if (annotationDescriptorFindAnnotation != null) {
                for (Map.Entry entry : annotationDescriptorFindAnnotation.getAllValueArguments().entrySet()) {
                    Name name = (Name) entry.getKey();
                    if (name.isSpecial() || !Intrinsics.areEqual(name.getIdentifier(), ComposeFqNames.INSTANCE.getComposableTargetMarkerDescription())) {
                        str = null;
                    } else {
                        Object value = entry.getValue();
                        StringValue stringValue = value instanceof StringValue ? (StringValue) value : null;
                        if (stringValue != null) {
                            str = (String) stringValue.getValue();
                        } else {
                            str = null;
                        }
                    }
                    if (str != null) {
                        str2 = str;
                        break;
                    }
                }
            }
            return str2 == null ? token : str2;
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter
        public void log(@Nullable InferenceNode node, @NotNull String message) {
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter
        public void reportCallError(@NotNull InferenceNode node, @NotNull String expected, @NotNull String received) {
            if (Intrinsics.areEqual(expected, received)) {
                return;
            }
            String strDescriptionFrom = descriptionFrom(expected);
            String strDescriptionFrom2 = descriptionFrom(received);
            CallCheckerContext callCheckerContext = this.this$0.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            callCheckerContext.getTrace().report(ComposeErrors.COMPOSE_APPLIER_CALL_MISMATCH.on(node.getElement(), strDescriptionFrom, strDescriptionFrom2));
        }

        @Override // androidx.compose.compiler.plugins.kotlin.inference.ErrorReporter
        public void reportParameterError(@NotNull InferenceNode node, int index, @NotNull String expected, @NotNull String received) {
            if (Intrinsics.areEqual(expected, received)) {
                return;
            }
            String strDescriptionFrom = descriptionFrom(expected);
            String strDescriptionFrom2 = descriptionFrom(received);
            CallCheckerContext callCheckerContext = this.this$0.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            callCheckerContext.getTrace().report(ComposeErrors.COMPOSE_APPLIER_PARAMETER_MISMATCH.on(node.getElement(), strDescriptionFrom, strDescriptionFrom2));
        }
    });

    private final InferenceNode argumentToInferenceNode(ValueParameterDescriptor descriptor, PsiElement element) {
        CallCheckerContext callCheckerContext = this.callContext;
        if (callCheckerContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callContext");
            callCheckerContext = null;
        }
        BindingContext bindingContext = callCheckerContext.getTrace().getBindingContext();
        PsiElement psiElementLambdaOrNull = lambdaOrNull(element);
        if (psiElementLambdaOrNull != null) {
            return new PsiElementNode(psiElementLambdaOrNull, bindingContext);
        }
        InferenceNode inferenceNodeFindParameterReferenceOrNull = findParameterReferenceOrNull(descriptor, element);
        return inferenceNodeFindParameterReferenceOrNull != null ? inferenceNodeFindParameterReferenceOrNull : new PsiElementNode(element, bindingContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PsiElementNode containerNodeOf(PsiElement element) {
        PsiElement psiElementContainerOf = containerOf(element);
        CallCheckerContext callCheckerContext = null;
        if (psiElementContainerOf == null) {
            return null;
        }
        CallCheckerContext callCheckerContext2 = this.callContext;
        if (callCheckerContext2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callContext");
        } else {
            callCheckerContext = callCheckerContext2;
        }
        return new PsiElementNode(psiElementContainerOf, callCheckerContext.getTrace().getBindingContext());
    }

    private final PsiElement containerOf(PsiElement element) {
        PsiElement parent = element.getParent();
        while (true) {
            KtElement ktElement = null;
            if (parent == null) {
                break;
            }
            if (!(parent instanceof KtLambdaExpression ? true : parent instanceof KtFunction ? true : parent instanceof KtProperty ? true : parent instanceof KtPropertyAccessor)) {
                if (parent instanceof KtClass ? true : parent instanceof KtFile) {
                    break;
                }
                PsiElement parent2 = parent.getParent();
                if (parent2 instanceof KtElement) {
                    ktElement = (KtElement) parent2;
                }
                parent = (PsiElement) ktElement;
            } else {
                return parent;
            }
        }
        return null;
    }

    private final InferenceNode descriptorToInferenceNode(CallableDescriptor descriptor, PsiElement element) {
        if (descriptor instanceof ValueParameterDescriptor) {
            return parameterDescriptorToInferenceNode((ValueParameterDescriptor) descriptor, element);
        }
        CallableDescriptor original = descriptor.getOriginal();
        return original instanceof ValueParameterDescriptor ? parameterDescriptorToInferenceNode((ValueParameterDescriptor) original, element) : new ResolvedPsiElementNode(element, new InferenceDescriptorType(descriptor));
    }

    private final InferenceNode findParameterReferenceOrNull(ValueParameterDescriptor descriptor, PsiElement element) {
        CallCheckerContext callCheckerContext = this.callContext;
        if (callCheckerContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callContext");
            callCheckerContext = null;
        }
        BindingContext bindingContext = callCheckerContext.getTrace().getBindingContext();
        CallableDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        PsiElementNode psiElementNodeContainerNodeOf = containerNodeOf(element);
        while (psiElementNodeContainerNodeOf != null) {
            if (psiElementNodeContainerNodeOf.getType().isTypeFor(containingDeclaration)) {
                List valueParameters = containingDeclaration.getValueParameters();
                ArrayList arrayList = new ArrayList();
                for (Object obj : valueParameters) {
                    CallableDescriptor callableDescriptor = (ValueParameterDescriptor) obj;
                    if (ComposableCallCheckerKt.isComposableCallable(callableDescriptor, bindingContext) || ComposableTargetCheckerKt.isSamComposable(callableDescriptor)) {
                        arrayList.add(obj);
                    }
                }
                return new ResolvedPsiParameterReference(element, new InferenceDescriptorType((CallableDescriptor) descriptor), arrayList.indexOf(descriptor), psiElementNodeContainerNodeOf.getElement());
            }
            psiElementNodeContainerNodeOf = containerNodeOf(psiElementNodeContainerNodeOf.getElement());
        }
        return null;
    }

    private final KtFunctionLiteral lambdaOrNull(PsiElement element) {
        PsiElement[] children;
        KtLambdaArgument ktLambdaArgument = element instanceof KtLambdaArgument ? (KtLambdaArgument) element : null;
        PsiElement lastChild = (ktLambdaArgument == null || (children = ktLambdaArgument.getChildren()) == null) ? null : (PsiElement) ArraysKt.singleOrNull(children);
        while (lastChild != null) {
            if (lastChild instanceof KtLabeledExpression) {
                lastChild = ((KtLabeledExpression) lastChild).getLastChild();
            } else {
                if (lastChild instanceof KtFunctionLiteral) {
                    return (KtFunctionLiteral) lastChild;
                }
                if (!(lastChild instanceof KtLambdaExpression)) {
                    throw new Error(OooO00o.OooO00o("Unknown type: ", lastChild.getClass()));
                }
                lastChild = (PsiElement) ArraysKt.single(((KtLambdaExpression) lastChild).getChildren());
            }
        }
        return null;
    }

    private final InferenceNode parameterDescriptorToInferenceNode(ValueParameterDescriptor descriptor, PsiElement element) {
        InferenceNode inferenceNodeFindParameterReferenceOrNull = findParameterReferenceOrNull(descriptor, element);
        if (inferenceNodeFindParameterReferenceOrNull == null) {
            CallCheckerContext callCheckerContext = this.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            inferenceNodeFindParameterReferenceOrNull = new PsiElementNode(element, callCheckerContext.getTrace().getBindingContext());
        }
        return inferenceNodeFindParameterReferenceOrNull;
    }

    private final InferenceNode resolvedCallToInferenceNode(ResolvedCall<?> resolvedCall) {
        if (resolvedCall instanceof VariableAsFunctionResolvedCall) {
            return descriptorToInferenceNode(((VariableAsFunctionResolvedCall) resolvedCall).getVariableCall().getCandidateDescriptor(), (PsiElement) resolvedCall.getCall().getCallElement());
        }
        ExpressionReceiver dispatchReceiver = resolvedCall.getDispatchReceiver();
        InferenceNode inferenceNodeDescriptorToInferenceNode = null;
        ExpressionReceiver expressionReceiver = dispatchReceiver instanceof ExpressionReceiver ? dispatchReceiver : null;
        KtExpression expression = expressionReceiver != null ? expressionReceiver.getExpression() : null;
        KtReferenceExpression ktReferenceExpression = expression instanceof KtReferenceExpression ? (KtReferenceExpression) expression : null;
        if (ktReferenceExpression != null) {
            CallCheckerContext callCheckerContext = this.callContext;
            if (callCheckerContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                callCheckerContext = null;
            }
            Object obj = callCheckerContext.getTrace().get(BindingContext.REFERENCE_TARGET, ktReferenceExpression);
            CallableDescriptor callableDescriptor = obj instanceof CallableDescriptor ? (CallableDescriptor) obj : null;
            if (callableDescriptor != null) {
                inferenceNodeDescriptorToInferenceNode = descriptorToInferenceNode(callableDescriptor, (PsiElement) resolvedCall.getCall().getCallElement());
            }
        }
        return inferenceNodeDescriptorToInferenceNode == null ? descriptorToInferenceNode(resolvedCall.getResultingDescriptor(), (PsiElement) resolvedCall.getCall().getCallElement()) : inferenceNodeDescriptorToInferenceNode;
    }

    public void check(@NotNull ResolvedCall<?> resolvedCall, @NotNull PsiElement reportOn, @NotNull CallCheckerContext context) {
        Object next;
        InferenceNode psiElementNode;
        KtElement ktElementAsElement;
        if (ComposableCallCheckerKt.isComposableInvocation(resolvedCall)) {
            this.callContext = context;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("callContext");
                context = null;
            }
            BindingContext bindingContext = context.getTrace().getBindingContext();
            List valueParameters = resolvedCall.getCandidateDescriptor().getValueParameters();
            ArrayList<ValueParameterDescriptor> arrayList = new ArrayList();
            for (Object obj : valueParameters) {
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                if ((FunctionTypesKt.isFunctionType(valueParameterDescriptor.getType()) && AnnotationUtilsKt.hasComposableAnnotation(valueParameterDescriptor.getType())) || ComposableTargetCheckerKt.isSamComposable(valueParameterDescriptor)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
            for (ValueParameterDescriptor valueParameterDescriptor2 : arrayList) {
                Iterator it = resolvedCall.getValueArguments().entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((ValueParameterDescriptor) ((Map.Entry) next).getKey()).getOriginal(), valueParameterDescriptor2));
                Map.Entry entry = (Map.Entry) next;
                ResolvedValueArgument resolvedValueArgument = entry != null ? (ResolvedValueArgument) entry.getValue() : null;
                if (resolvedValueArgument instanceof ExpressionValueArgument) {
                    ValueArgument valueArgument = ((ExpressionValueArgument) resolvedValueArgument).getValueArgument();
                    psiElementNode = argumentToInferenceNode(valueParameterDescriptor2, (valueArgument == null || (ktElementAsElement = valueArgument.asElement()) == null) ? reportOn : (PsiElement) ktElementAsElement);
                } else {
                    psiElementNode = new PsiElementNode(reportOn, bindingContext);
                }
                arrayList2.add(psiElementNode);
            }
            this.infer.visitCall(new PsiElementNode(reportOn, bindingContext), resolvedCallToInferenceNode(resolvedCall), arrayList2);
        }
    }

    public void registerModuleComponents(@NotNull StorageComponentContainer container, @NotNull TargetPlatform platform, @NotNull ModuleDescriptor moduleDescriptor) {
        DslKt.useInstance(container, this);
    }
}
