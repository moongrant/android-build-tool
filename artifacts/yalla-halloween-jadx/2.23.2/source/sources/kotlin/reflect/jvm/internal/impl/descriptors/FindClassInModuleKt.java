package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
public final class FindClassInModuleKt {
    @Nullable
    public static final ClassDescriptor findClassAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    @Nullable
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        ClassifierDescriptor classifierDescriptorMo5494getContributedClassifier;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            FqName packageFqName = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object objFirst = CollectionsKt.first((List<? extends Object>) listPathSegments);
            Intrinsics.checkNotNullExpressionValue(objFirst, "segments.first()");
            classifierDescriptorMo5494getContributedClassifier = memberScope.mo5494getContributedClassifier((Name) objFirst, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo5494getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo5494getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) classifierDescriptorMo5494getContributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                ClassifierDescriptor classifierDescriptorMo5494getContributedClassifier2 = unsubstitutedInnerClassesScope.mo5494getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo5494getContributedClassifier = classifierDescriptorMo5494getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5494getContributedClassifier2 : null;
                if (classifierDescriptorMo5494getContributedClassifier == null) {
                    return null;
                }
            }
        } else {
            FqName packageFqName2 = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName2, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(packageFqName2);
            List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments2, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
            Object objFirst2 = CollectionsKt.first((List<? extends Object>) listPathSegments2);
            Intrinsics.checkNotNullExpressionValue(objFirst2, "segments.first()");
            ClassifierDescriptor classifierDescriptorMo5494getContributedClassifier3 = memberScope2.mo5494getContributedClassifier((Name) objFirst2, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo5494getContributedClassifier3 == null) {
                classifierDescriptorMo5494getContributedClassifier3 = null;
                break;
            }
            for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
                if (classifierDescriptorMo5494getContributedClassifier3 instanceof ClassDescriptor) {
                    MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) classifierDescriptorMo5494getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                    Intrinsics.checkNotNullExpressionValue(name2, "name");
                    ClassifierDescriptor classifierDescriptorMo5494getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo5494getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    classifierDescriptorMo5494getContributedClassifier3 = classifierDescriptorMo5494getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5494getContributedClassifier4 : null;
                    if (classifierDescriptorMo5494getContributedClassifier3 != null) {
                    }
                }
                classifierDescriptorMo5494getContributedClassifier3 = null;
            }
            if (classifierDescriptorMo5494getContributedClassifier3 != null) {
                return classifierDescriptorMo5494getContributedClassifier3;
            }
            FqName packageFqName3 = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName3, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(packageFqName3);
            List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments3, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
            Object objFirst3 = CollectionsKt.first((List<? extends Object>) listPathSegments3);
            Intrinsics.checkNotNullExpressionValue(objFirst3, "segments.first()");
            classifierDescriptorMo5494getContributedClassifier = memberScope3.mo5494getContributedClassifier((Name) objFirst3, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo5494getContributedClassifier == null) {
                return null;
            }
            for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
                if (!(classifierDescriptorMo5494getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) classifierDescriptorMo5494getContributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(name3, "name");
                ClassifierDescriptor classifierDescriptorMo5494getContributedClassifier5 = unsubstitutedInnerClassesScope3.mo5494getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo5494getContributedClassifier = classifierDescriptorMo5494getContributedClassifier5 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo5494getContributedClassifier5 : null;
                if (classifierDescriptorMo5494getContributedClassifier == null) {
                    return null;
                }
            }
        }
        return classifierDescriptorMo5494getContributedClassifier;
    }

    @NotNull
    public static final ClassDescriptor findNonGenericClassAcrossDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId, @NotNull NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE), new Function1<ClassId, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull ClassId it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return 0;
            }
        })));
    }

    @Nullable
    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(@NotNull ModuleDescriptor moduleDescriptor, @NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
