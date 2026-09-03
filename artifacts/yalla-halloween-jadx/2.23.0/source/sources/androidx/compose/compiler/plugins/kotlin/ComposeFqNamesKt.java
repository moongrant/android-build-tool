package androidx.compose.compiler.plugins.kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.FindClassInModuleKt;
import org.jetbrains.kotlin.descriptors.ModuleDescriptor;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.descriptors.annotations.Annotated;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.descriptors.annotations.Annotations;
import org.jetbrains.kotlin.descriptors.impl.AnonymousFunctionDescriptor;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.resolve.constants.ConstantValue;
import org.jetbrains.kotlin.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.TypeUtils;
import org.jetbrains.kotlin.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u0014¢\u0006\u0002\u0010\u0015\u001a\f\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0014\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\u0014\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\u0001*\u00020\b\u001a\n\u0010\u0018\u001a\u00020\u0007*\u00020\u0014\u001a\n\u0010\u0018\u001a\u00020\u0007*\u00020\u0019\u001a\n\u0010\u0018\u001a\u00020\u0007*\u00020\u001a\u001a\n\u0010\u0018\u001a\u00020\u0007*\u00020\u000b\u001a\n\u0010\u001b\u001a\u00020\u0007*\u00020\u0014\u001a\n\u0010\u001c\u001a\u00020\u0007*\u00020\u0014\u001a\n\u0010\u001d\u001a\u00020\u0007*\u00020\u0014\u001a\n\u0010\u001e\u001a\u00020\u0007*\u00020\u0014\u001a\n\u0010\u001f\u001a\u00020\u0007*\u00020\u0014\u001a\u0012\u0010 \u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006!"}, d2 = {"internalRoot", "", "internalRootFqName", "Lorg/jetbrains/kotlin/name/FqName;", "root", "rootFqName", "isComposableAnnotation", "", "Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;)Z", "isSpecialType", "Lorg/jetbrains/kotlin/types/KotlinType;", "(Lorg/jetbrains/kotlin/types/KotlinType;)Z", "makeComposableAnnotation", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "annotateAsComposable", "Lorg/jetbrains/kotlin/descriptors/impl/AnonymousFunctionDescriptor;", "compositionOpenTarget", "", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "(Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;)Ljava/lang/Integer;", "compositionScheme", "compositionTarget", "hasComposableAnnotation", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "Lorg/jetbrains/kotlin/ir/types/IrType;", "hasCompositionTargetMarker", "hasDisallowComposableCallsAnnotation", "hasExplicitGroupsAnnotation", "hasNonRestartableComposableAnnotation", "hasReadonlyComposableAnnotation", "makeComposable", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeFqNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeFqNames.kt\nandroidx/compose/compiler/plugins/kotlin/ComposeFqNamesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1549#2:221\n1620#2,3:222\n288#2,2:225\n*S KotlinDebug\n*F\n+ 1 ComposeFqNames.kt\nandroidx/compose/compiler/plugins/kotlin/ComposeFqNamesKt\n*L\n190#1:221\n190#1:222,3\n190#1:225,2\n*E\n"})
public final class ComposeFqNamesKt {

    @NotNull
    private static final String root = "androidx.compose.runtime";

    @NotNull
    private static final FqName rootFqName = new FqName(root);

    @NotNull
    private static final String internalRoot = "androidx.compose.runtime.internal";

    @NotNull
    private static final FqName internalRootFqName = new FqName(internalRoot);

    @NotNull
    public static final AnonymousFunctionDescriptor annotateAsComposable(@NotNull AnonymousFunctionDescriptor anonymousFunctionDescriptor, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(anonymousFunctionDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        DeclarationDescriptor containingDeclaration = anonymousFunctionDescriptor.getContainingDeclaration();
        Annotations.Companion companion = Annotations.Companion;
        Iterable annotations = anonymousFunctionDescriptor.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "annotations");
        return new AnonymousFunctionDescriptor(containingDeclaration, companion.create(CollectionsKt.plus((Iterable<? extends AnnotationDescriptor>) annotations, makeComposableAnnotation(module))), anonymousFunctionDescriptor.getKind(), anonymousFunctionDescriptor.getSource(), anonymousFunctionDescriptor.isSuspend());
    }

    @Nullable
    public static final Integer compositionOpenTarget(@NotNull Annotated annotated) {
        Map allValueArguments;
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
        AnnotationDescriptor annotationDescriptorFindAnnotation = annotations.findAnnotation(composeFqNames.getComposableOpenTarget());
        if (annotationDescriptorFindAnnotation == null || (allValueArguments = annotationDescriptorFindAnnotation.getAllValueArguments()) == null) {
            return null;
        }
        ConstantValue constantValue = (ConstantValue) allValueArguments.get(composeFqNames.getComposableOpenTargetIndexArgument());
        Object value = constantValue != null ? constantValue.getValue() : null;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
        return Integer.valueOf(((Integer) value).intValue());
    }

    @Nullable
    public static final String compositionScheme(@NotNull Annotated annotated) {
        Map allValueArguments;
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
        AnnotationDescriptor annotationDescriptorFindAnnotation = annotations.findAnnotation(composeFqNames.getComposableInferredTarget());
        if (annotationDescriptorFindAnnotation == null || (allValueArguments = annotationDescriptorFindAnnotation.getAllValueArguments()) == null) {
            return null;
        }
        ConstantValue constantValue = (ConstantValue) allValueArguments.get(composeFqNames.getComposableInferredTargetSchemeArgument());
        Object value = constantValue != null ? constantValue.getValue() : null;
        if (value instanceof String) {
            return (String) value;
        }
        return null;
    }

    @Nullable
    public static final String compositionTarget(@NotNull Annotated annotated) {
        Object next;
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        Iterable annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(annotations, 10));
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(compositionTarget((AnnotationDescriptor) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (((String) next) != null) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    public static final boolean hasComposableAnnotation(@NotNull IrType irType) {
        Intrinsics.checkNotNullParameter(irType, "<this>");
        return IrUtilsKt.hasAnnotation((IrAnnotationContainer) irType, ComposeFqNames.INSTANCE.getComposable());
    }

    public static final boolean hasCompositionTargetMarker(@NotNull Annotated annotated) {
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        return annotated.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getComposableTargetMarker()) != null;
    }

    public static final boolean hasDisallowComposableCallsAnnotation(@NotNull Annotated annotated) {
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        return annotated.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getDisallowComposableCalls()) != null;
    }

    public static final boolean hasExplicitGroupsAnnotation(@NotNull Annotated annotated) {
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        return annotated.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getExplicitGroupsComposable()) != null;
    }

    public static final boolean hasNonRestartableComposableAnnotation(@NotNull Annotated annotated) {
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        return annotated.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getNonRestartableComposable()) != null;
    }

    public static final boolean hasReadonlyComposableAnnotation(@NotNull Annotated annotated) {
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        return annotated.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getReadOnlyComposable()) != null;
    }

    public static final boolean isComposableAnnotation(@NotNull AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "<this>");
        return Intrinsics.areEqual(annotationDescriptor.getFqName(), ComposeFqNames.INSTANCE.getComposable());
    }

    public static final boolean isSpecialType(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return kotlinType == TypeUtils.NO_EXPECTED_TYPE || kotlinType == TypeUtils.UNIT_EXPECTED_TYPE;
    }

    @NotNull
    public static final KotlinType makeComposable(@NotNull KotlinType kotlinType, @NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (hasComposableAnnotation(kotlinType)) {
            return kotlinType;
        }
        return TypeUtilsKt.replaceAnnotations(kotlinType, Annotations.Companion.create(CollectionsKt.plus((Iterable<? extends AnnotationDescriptor>) kotlinType.getAnnotations(), makeComposableAnnotation(module))));
    }

    private static final AnnotationDescriptor makeComposableAnnotation(final ModuleDescriptor moduleDescriptor) {
        return new AnnotationDescriptor() { // from class: androidx.compose.compiler.plugins.kotlin.ComposeFqNamesKt.makeComposableAnnotation.1
            @NotNull
            public Map<Name, ConstantValue<?>> getAllValueArguments() {
                return MapsKt.emptyMap();
            }

            @Nullable
            public FqName getFqName() {
                return AnnotationDescriptor.DefaultImpls.getFqName(this);
            }

            @NotNull
            public SourceElement getSource() {
                SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            }

            @NotNull
            public KotlinType getType() {
                ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, ComposeClassIds.INSTANCE.getComposable());
                Intrinsics.checkNotNull(classDescriptorFindClassAcrossModuleDependencies);
                KotlinType defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
                Intrinsics.checkNotNullExpressionValue(defaultType, "module.findClassAcrossMo…          )!!.defaultType");
                return defaultType;
            }

            @NotNull
            public String toString() {
                return "[@Composable]";
            }
        };
    }

    public static final boolean hasComposableAnnotation(@NotNull IrAnnotationContainer irAnnotationContainer) {
        Intrinsics.checkNotNullParameter(irAnnotationContainer, "<this>");
        return IrUtilsKt.hasAnnotation(irAnnotationContainer, ComposeFqNames.INSTANCE.getComposable());
    }

    public static final boolean hasComposableAnnotation(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return (isSpecialType(kotlinType) || kotlinType.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getComposable()) == null) ? false : true;
    }

    public static final boolean hasComposableAnnotation(@NotNull Annotated annotated) {
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        return annotated.getAnnotations().findAnnotation(ComposeFqNames.INSTANCE.getComposable()) != null;
    }

    @Nullable
    public static final String compositionTarget(@NotNull AnnotationDescriptor annotationDescriptor) {
        Intrinsics.checkNotNullParameter(annotationDescriptor, "<this>");
        FqName fqName = annotationDescriptor.getFqName();
        ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
        if (Intrinsics.areEqual(fqName, composeFqNames.getComposableTarget())) {
            ConstantValue constantValue = (ConstantValue) annotationDescriptor.getAllValueArguments().get(composeFqNames.getComposableTargetApplierArgument());
            Object value = constantValue != null ? constantValue.getValue() : null;
            if (value instanceof String) {
                return (String) value;
            }
            return null;
        }
        Annotated annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        boolean z = false;
        if (annotationClass != null && hasCompositionTargetMarker(annotationClass)) {
            z = true;
        }
        if (z) {
            return String.valueOf(annotationDescriptor.getFqName());
        }
        return null;
    }
}
