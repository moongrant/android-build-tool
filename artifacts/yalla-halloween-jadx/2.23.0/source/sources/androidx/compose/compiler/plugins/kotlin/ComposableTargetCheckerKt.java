package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.inference.Bindings;
import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.LazyScheme;
import androidx.compose.compiler.plugins.kotlin.inference.Open;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import androidx.compose.compiler.plugins.kotlin.inference.SchemeKt;
import androidx.compose.compiler.plugins.kotlin.inference.Token;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\u001a\u001a\u0010\b\u001a\u00020\t*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0007H\u0002\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u000fH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u000fH\u0002\u001a\u0016\u0010\u0011\u001a\u00020\t*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0011\u001a\u00020\t*\u00020\u0012H\u0002¨\u0006\u0013"}, d2 = {"fileScopeTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "callContext", "Lorg/jetbrains/kotlin/resolve/calls/checkers/CallCheckerContext;", "isSamComposable", "", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "mergeWith", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "schemes", "", "samComposableOrNull", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "scheme", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "schemeItem", "toScheme", "Lorg/jetbrains/kotlin/types/KotlinType;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetChecker.kt\nandroidx/compose/compiler/plugins/kotlin/ComposableTargetCheckerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,493:1\n1#2:494\n766#3:495\n857#3,2:496\n1549#3:498\n1620#3,3:499\n1549#3:502\n1620#3,3:503\n766#3:506\n857#3,2:507\n1549#3:509\n1620#3,3:510\n1855#3,2:513\n*S KotlinDebug\n*F\n+ 1 ComposableTargetChecker.kt\nandroidx/compose/compiler/plugins/kotlin/ComposableTargetCheckerKt\n*L\n442#1:495\n442#1:496,2\n444#1:498\n444#1:499,3\n447#1:502\n447#1:503,3\n463#1:506\n463#1:507,2\n463#1:509\n463#1:510,3\n487#1:513,2\n*E\n"})
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
                if (annotationDescriptor != null && (strCompositionTarget = ComposeFqNamesKt.compositionTarget(annotationDescriptor)) != null) {
                    return new Token(strCompositionTarget);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSamComposable(ValueParameterDescriptor valueParameterDescriptor) {
        Annotated annotatedSamComposableOrNull = samComposableOrNull(valueParameterDescriptor);
        return annotatedSamComposableOrNull != null && ComposeFqNamesKt.hasComposableAnnotation(annotatedSamComposableOrNull);
    }

    @NotNull
    public static final Scheme mergeWith(@NotNull Scheme scheme, @NotNull List<Scheme> schemes) {
        Intrinsics.checkNotNullParameter(scheme, "<this>");
        Intrinsics.checkNotNullParameter(schemes, "schemes");
        if (schemes.isEmpty()) {
            return scheme;
        }
        LazyScheme lazyScheme = new LazyScheme(scheme, null, null, 6, null);
        Bindings bindings = lazyScheme.getBindings();
        Iterator<T> it = schemes.iterator();
        while (it.hasNext()) {
            mergeWith$unifySchemes(bindings, lazyScheme, new LazyScheme((Scheme) it.next(), null, lazyScheme.getBindings(), 2, null));
        }
        return lazyScheme.toScheme();
    }

    private static final void mergeWith$unifySchemes(Bindings bindings, LazyScheme lazyScheme, LazyScheme lazyScheme2) {
        bindings.unify(lazyScheme.getTarget(), lazyScheme2.getTarget());
        for (Pair pair : CollectionsKt.zip(lazyScheme.getParameters(), lazyScheme2.getParameters())) {
            mergeWith$unifySchemes(bindings, (LazyScheme) pair.component1(), (LazyScheme) pair.component2());
        }
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
        String strCompositionScheme = ComposeFqNamesKt.compositionScheme(annotated);
        if (strCompositionScheme != null) {
            return SchemeKt.deserializeScheme(strCompositionScheme);
        }
        return null;
    }

    private static final Item schemeItem(Annotated annotated) {
        String strCompositionTarget = ComposeFqNamesKt.compositionTarget(annotated);
        Integer numCompositionOpenTarget = strCompositionTarget == null ? ComposeFqNamesKt.compositionOpenTarget(annotated) : null;
        if (strCompositionTarget != null) {
            return new Token(strCompositionTarget);
        }
        return numCompositionOpenTarget != null ? new Open(numCompositionOpenTarget.intValue(), false, 2, null) : new Open(-1, true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @NotNull
    public static final Scheme toScheme(@NotNull CallableDescriptor callableDescriptor, @Nullable CallCheckerContext callCheckerContext) {
        Item item;
        Scheme scheme;
        boolean z;
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
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
        Intrinsics.checkNotNullExpressionValue(valueParameters, "valueParameters");
        ArrayList<ValueParameterDescriptor> arrayList = new ArrayList();
        for (Object obj : valueParameters) {
            ValueParameterDescriptor it = (ValueParameterDescriptor) obj;
            KotlinType type = it.getType();
            Intrinsics.checkNotNullExpressionValue(type, "it.type");
            if (ComposeFqNamesKt.hasComposableAnnotation(type)) {
                z = true;
            } else {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (isSamComposable(it)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (ValueParameterDescriptor it2 : arrayList) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            CallableDescriptor callableDescriptorSamComposableOrNull = samComposableOrNull(it2);
            if (callableDescriptorSamComposableOrNull == null || (scheme = toScheme(callableDescriptorSamComposableOrNull, callCheckerContext)) == null) {
                KotlinType type2 = it2.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "it.type");
                scheme = toScheme(type2);
            }
            arrayList2.add(scheme);
        }
        Scheme scheme3 = new Scheme(item, arrayList2, null, false, 12, null);
        Collection overriddenDescriptors = callableDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
        Collection<CallableDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (CallableDescriptor it3 : collection) {
            Intrinsics.checkNotNullExpressionValue(it3, "it");
            arrayList3.add(toScheme(it3, null));
        }
        return mergeWith(scheme3, arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scheme toScheme(KotlinType kotlinType) {
        Item itemSchemeItem = schemeItem((Annotated) kotlinType);
        List arguments = kotlinType.getArguments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            KotlinType type = ((TypeProjection) obj).getType();
            Intrinsics.checkNotNullExpressionValue(type, "it.type");
            if (ComposeFqNamesKt.hasComposableAnnotation(type)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KotlinType type2 = ((TypeProjection) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type2, "it.type");
            arrayList2.add(toScheme(type2));
        }
        return new Scheme(itemSchemeItem, arrayList2, null, false, 12, null);
    }
}
