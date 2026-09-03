package androidx.compose.compiler.plugins.kotlin.k1;

import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.Open;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import androidx.compose.compiler.plugins.kotlin.inference.SchemeKt;
import androidx.compose.compiler.plugins.kotlin.inference.Token;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrUtilsKt;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.com.intellij.psi.PsiFile;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptorWithSource;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.descriptors.annotations.Annotated;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.psi.KtAnnotationEntry;
import org.jetbrains.kotlin.psi.KtFile;
import org.jetbrains.kotlin.resolve.BindingContext;
import org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext;
import org.jetbrains.kotlin.resolve.sam.SamConversionResolverImplKt;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.TypeProjection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0002\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\fH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u000b*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000b*\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"fileScopeTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "callContext", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "isSamComposable", "", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "samComposableOrNull", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "scheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "schemeItem", "toScheme", "Lorg/jetbrains/kotlin/types/KotlinType;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k1/ComposableTargetCheckerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n1#2:475\n766#3:476\n857#3,2:477\n1549#3:479\n1620#3,3:480\n1549#3:483\n1620#3,3:484\n766#3:487\n857#3,2:488\n1549#3:490\n1620#3,3:491\n*S KotlinDebug\n*F\n+ 1 ComposableTargetChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k1/ComposableTargetCheckerKt\n*L\n443#1:476\n443#1:477,2\n445#1:479\n445#1:480,3\n448#1:483\n448#1:484,3\n464#1:487\n464#1:488,2\n464#1:490\n464#1:491,3\n*E\n"})
public final class ComposableTargetCheckerKt {
    private static final Item fileScopeTarget(CallableDescriptor callableDescriptor, CallCheckerContext callCheckerContext) {
        String strCompositionTarget;
        PsiElement psiElement = JvmIrUtilsKt.getPsiElement((DeclarationDescriptorWithSource) callableDescriptor);
        PsiFile containingFile = psiElement != null ? psiElement.getContainingFile() : null;
        KtFile ktFile = containingFile instanceof KtFile ? (KtFile) containingFile : null;
        if (ktFile != null) {
            Iterator it = ktFile.getAnnotationEntries().iterator();
            while (it.hasNext()) {
                AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) callCheckerContext.getTrace().getBindingContext().get(BindingContext.ANNOTATION, (KtAnnotationEntry) it.next());
                if (annotationDescriptor != null && (strCompositionTarget = AnnotationUtilsKt.compositionTarget(annotationDescriptor)) != null) {
                    return new Token(strCompositionTarget);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSamComposable(ValueParameterDescriptor valueParameterDescriptor) {
        Annotated annotatedSamComposableOrNull = samComposableOrNull(valueParameterDescriptor);
        return annotatedSamComposableOrNull != null && AnnotationUtilsKt.hasComposableAnnotation(annotatedSamComposableOrNull);
    }

    private static final FunctionDescriptor samComposableOrNull(ValueParameterDescriptor valueParameterDescriptor) {
        ClassDescriptor declarationDescriptor = valueParameterDescriptor.getType().getConstructor().getDeclarationDescriptor();
        ClassDescriptor classDescriptor = declarationDescriptor instanceof ClassDescriptor ? declarationDescriptor : null;
        if (classDescriptor != null) {
            return SamConversionResolverImplKt.getSingleAbstractMethodOrNull(classDescriptor);
        }
        return null;
    }

    private static final Scheme scheme(Annotated annotated) {
        String strCompositionScheme = AnnotationUtilsKt.compositionScheme(annotated);
        if (strCompositionScheme != null) {
            return SchemeKt.deserializeScheme(strCompositionScheme);
        }
        return null;
    }

    private static final Item schemeItem(Annotated annotated) {
        String strCompositionTarget = AnnotationUtilsKt.compositionTarget(annotated);
        Integer numCompositionOpenTarget = strCompositionTarget == null ? AnnotationUtilsKt.compositionOpenTarget(annotated) : null;
        if (strCompositionTarget != null) {
            return new Token(strCompositionTarget);
        }
        return numCompositionOpenTarget != null ? new Open(numCompositionOpenTarget.intValue(), false, 2, null) : new Open(-1, true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @NotNull
    public static final Scheme toScheme(@NotNull CallableDescriptor callableDescriptor, @Nullable CallCheckerContext callCheckerContext) {
        Item item;
        Scheme scheme;
        Annotated annotated = (Annotated) callableDescriptor;
        Scheme scheme2 = scheme(annotated);
        if (scheme2 != null) {
            return scheme2;
        }
        Item itemSchemeItem = schemeItem(annotated);
        if (itemSchemeItem.getIsUnspecified()) {
            Item itemFileScopeTarget = callCheckerContext != null ? fileScopeTarget(callableDescriptor, callCheckerContext) : null;
            if (itemFileScopeTarget != null) {
                item = itemFileScopeTarget;
            } else {
                item = itemSchemeItem;
            }
        } else {
            item = itemSchemeItem;
        }
        List valueParameters = callableDescriptor.getValueParameters();
        ArrayList<ValueParameterDescriptor> arrayList = new ArrayList();
        for (Object obj : valueParameters) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
            if (AnnotationUtilsKt.hasComposableAnnotation(valueParameterDescriptor.getType()) || isSamComposable(valueParameterDescriptor)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        for (ValueParameterDescriptor valueParameterDescriptor2 : arrayList) {
            CallableDescriptor callableDescriptorSamComposableOrNull = samComposableOrNull(valueParameterDescriptor2);
            if (callableDescriptorSamComposableOrNull == null || (scheme = toScheme(callableDescriptorSamComposableOrNull, callCheckerContext)) == null) {
                scheme = toScheme(valueParameterDescriptor2.getType());
            }
            arrayList2.add(scheme);
        }
        Scheme scheme3 = new Scheme(item, arrayList2, null, false, 12, null);
        Collection overriddenDescriptors = callableDescriptor.getOverriddenDescriptors();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(overriddenDescriptors));
        Iterator it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList3.add(toScheme((CallableDescriptor) it.next(), null));
        }
        return SchemeKt.mergeWith(scheme3, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scheme toScheme(KotlinType kotlinType) {
        Item itemSchemeItem = schemeItem((Annotated) kotlinType);
        List arguments = kotlinType.getArguments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (AnnotationUtilsKt.hasComposableAnnotation(((TypeProjection) obj).getType())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toScheme(((TypeProjection) it.next()).getType()));
        }
        return new Scheme(itemSchemeItem, arrayList2, null, false, 12, null);
    }
}
