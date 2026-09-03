package androidx.compose.compiler.plugins.kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.ClassDescriptor;
import org.jetbrains.kotlin.descriptors.FindClassInModuleKt;
import org.jetbrains.kotlin.descriptors.ModuleDescriptor;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor;
import org.jetbrains.kotlin.name.ClassId;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.resolve.constants.ConstantValue;
import org.jetbrains.kotlin.types.KotlinType;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0018H\u0002J\u0015\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0018H\u0000¢\u0006\u0002\bDJ\u0010\u0010E\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0018H\u0002J\u000e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0011\u0010#\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u0011\u0010'\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0006R\u0011\u0010)\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0011\u0010+\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0011\u0010-\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0006R\u0011\u0010/\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006R\u0011\u00101\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0011\u00103\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0006R\u0011\u00105\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0006R\u0011\u00107\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0006R\u0011\u00109\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0006R\u0011\u0010;\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0006R\u0011\u0010=\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0006R\u0011\u0010?\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0006¨\u0006J"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeFqNames;", "", "()V", "Composable", "Lorg/jetbrains/kotlin/name/FqName;", "getComposable", "()Lorg/jetbrains/kotlin/name/FqName;", "ComposableInferredTarget", "getComposableInferredTarget", "ComposableInferredTargetSchemeArgument", "Lorg/jetbrains/kotlin/name/Name;", "getComposableInferredTargetSchemeArgument", "()Lorg/jetbrains/kotlin/name/Name;", "ComposableOpenTarget", "getComposableOpenTarget", "ComposableOpenTargetIndexArgument", "getComposableOpenTargetIndexArgument", "ComposableTarget", "getComposableTarget", "ComposableTargetApplierArgument", "getComposableTargetApplierArgument", "ComposableTargetMarker", "getComposableTargetMarker", "ComposableTargetMarkerDescription", "", "getComposableTargetMarkerDescription", "()Ljava/lang/String;", "ComposeVersion", "getComposeVersion", "Composer", "getComposer", "CurrentComposerIntrinsic", "getCurrentComposerIntrinsic", "DisallowComposableCalls", "getDisallowComposableCalls", "ExplicitGroupsComposable", "getExplicitGroupsComposable", "Immutable", "getImmutable", "NonRestartableComposable", "getNonRestartableComposable", "Package", "getPackage", "ReadOnlyComposable", "getReadOnlyComposable", "StabilityInferred", "getStabilityInferred", "Stable", "getStable", "StableMarker", "getStableMarker", "cache", "getCache", "composableLambda", "getComposableLambda", "composableLambdaFullName", "getComposableLambdaFullName", "composableLambdaType", "getComposableLambdaType", "getCurrentComposerFullName", "getGetCurrentComposerFullName", "key", "getKey", "remember", "getRemember", "composablesFqNameFor", "cname", "fqNameFor", "fqNameFor$compiler_hosted", "internalFqNameFor", "makeComposableAnnotation", "Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeFqNames {

    @NotNull
    private static final FqName Composable;

    @NotNull
    private static final FqName ComposableInferredTarget;

    @NotNull
    private static final Name ComposableInferredTargetSchemeArgument;

    @NotNull
    private static final FqName ComposableOpenTarget;

    @NotNull
    private static final Name ComposableOpenTargetIndexArgument;

    @NotNull
    private static final FqName ComposableTarget;

    @NotNull
    private static final Name ComposableTargetApplierArgument;

    @NotNull
    private static final FqName ComposableTargetMarker;

    @NotNull
    private static final String ComposableTargetMarkerDescription;

    @NotNull
    private static final FqName ComposeVersion;

    @NotNull
    private static final FqName Composer;

    @NotNull
    private static final FqName CurrentComposerIntrinsic;

    @NotNull
    private static final FqName DisallowComposableCalls;

    @NotNull
    private static final FqName ExplicitGroupsComposable;

    @NotNull
    public static final ComposeFqNames INSTANCE;

    @NotNull
    private static final FqName Immutable;

    @NotNull
    private static final FqName NonRestartableComposable;

    @NotNull
    private static final FqName Package;

    @NotNull
    private static final FqName ReadOnlyComposable;

    @NotNull
    private static final FqName StabilityInferred;

    @NotNull
    private static final FqName Stable;

    @NotNull
    private static final FqName StableMarker;

    @NotNull
    private static final FqName cache;

    @NotNull
    private static final FqName composableLambda;

    @NotNull
    private static final FqName composableLambdaFullName;

    @NotNull
    private static final FqName composableLambdaType;

    @NotNull
    private static final FqName getCurrentComposerFullName;

    @NotNull
    private static final FqName key;

    @NotNull
    private static final FqName remember;

    static {
        ComposeFqNames composeFqNames = new ComposeFqNames();
        INSTANCE = composeFqNames;
        ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
        FqName fqNameAsSingleFqName = composeClassIds.getComposable().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "ComposeClassIds.Composable.asSingleFqName()");
        Composable = fqNameAsSingleFqName;
        FqName fqNameAsSingleFqName2 = composeClassIds.getComposableTarget().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName2, "ComposeClassIds.ComposableTarget.asSingleFqName()");
        ComposableTarget = fqNameAsSingleFqName2;
        ComposableTargetMarker = composeFqNames.fqNameFor$compiler_hosted("ComposableTargetMarker");
        ComposableTargetMarkerDescription = "description";
        Name nameIdentifier = Name.identifier("applier");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(\"applier\")");
        ComposableTargetApplierArgument = nameIdentifier;
        FqName fqNameAsSingleFqName3 = composeClassIds.getComposableOpenTarget().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName3, "ComposeClassIds.Composab…enTarget.asSingleFqName()");
        ComposableOpenTarget = fqNameAsSingleFqName3;
        Name nameIdentifier2 = Name.identifier("index");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(\"index\")");
        ComposableOpenTargetIndexArgument = nameIdentifier2;
        FqName fqNameAsSingleFqName4 = composeClassIds.getComposableInferredTarget().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName4, "ComposeClassIds.Composab…edTarget.asSingleFqName()");
        ComposableInferredTarget = fqNameAsSingleFqName4;
        Name nameIdentifier3 = Name.identifier("scheme");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(\"scheme\")");
        ComposableInferredTargetSchemeArgument = nameIdentifier3;
        CurrentComposerIntrinsic = composeFqNames.fqNameFor$compiler_hosted("<get-currentComposer>");
        getCurrentComposerFullName = composeFqNames.composablesFqNameFor("<get-currentComposer>");
        DisallowComposableCalls = composeFqNames.fqNameFor$compiler_hosted("DisallowComposableCalls");
        ReadOnlyComposable = composeFqNames.fqNameFor$compiler_hosted("ReadOnlyComposable");
        ExplicitGroupsComposable = composeFqNames.fqNameFor$compiler_hosted("ExplicitGroupsComposable");
        NonRestartableComposable = composeFqNames.fqNameFor$compiler_hosted("NonRestartableComposable");
        FqName fqNameAsSingleFqName5 = composeClassIds.getComposableLambda().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName5, "ComposeClassIds.ComposableLambda.asSingleFqName()");
        composableLambdaType = fqNameAsSingleFqName5;
        ComposeCallableIds composeCallableIds = ComposeCallableIds.INSTANCE;
        composableLambda = composeCallableIds.getComposableLambda().asSingleFqName();
        composableLambdaFullName = composeFqNames.internalFqNameFor("ComposableLambdaKt.composableLambda");
        remember = composeCallableIds.getRemember().asSingleFqName();
        cache = composeCallableIds.getCache().asSingleFqName();
        key = composeFqNames.fqNameFor$compiler_hosted("key");
        StableMarker = composeFqNames.fqNameFor$compiler_hosted("StableMarker");
        Stable = composeFqNames.fqNameFor$compiler_hosted("Stable");
        Immutable = composeFqNames.fqNameFor$compiler_hosted("Immutable");
        FqName fqNameAsSingleFqName6 = composeClassIds.getComposer().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName6, "ComposeClassIds.Composer.asSingleFqName()");
        Composer = fqNameAsSingleFqName6;
        ComposeVersion = composeFqNames.fqNameFor$compiler_hosted("ComposeVersion");
        Package = new FqName("androidx.compose.runtime");
        FqName fqNameAsSingleFqName7 = composeClassIds.getStabilityInferred().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName7, "ComposeClassIds.StabilityInferred.asSingleFqName()");
        StabilityInferred = fqNameAsSingleFqName7;
    }

    private ComposeFqNames() {
    }

    private final FqName composablesFqNameFor(String cname) {
        return fqNameFor$compiler_hosted("ComposablesKt." + cname);
    }

    private final FqName internalFqNameFor(String cname) {
        return new FqName(o00O00OO.OooO00o("androidx.compose.runtime.internal.", cname));
    }

    @NotNull
    public final FqName fqNameFor$compiler_hosted(@NotNull String cname) {
        Intrinsics.checkNotNullParameter(cname, "cname");
        return new FqName(o00O00OO.OooO00o("androidx.compose.runtime.", cname));
    }

    @NotNull
    public final FqName getCache() {
        return cache;
    }

    @NotNull
    public final FqName getComposable() {
        return Composable;
    }

    @NotNull
    public final FqName getComposableInferredTarget() {
        return ComposableInferredTarget;
    }

    @NotNull
    public final Name getComposableInferredTargetSchemeArgument() {
        return ComposableInferredTargetSchemeArgument;
    }

    @NotNull
    public final FqName getComposableLambda() {
        return composableLambda;
    }

    @NotNull
    public final FqName getComposableLambdaFullName() {
        return composableLambdaFullName;
    }

    @NotNull
    public final FqName getComposableLambdaType() {
        return composableLambdaType;
    }

    @NotNull
    public final FqName getComposableOpenTarget() {
        return ComposableOpenTarget;
    }

    @NotNull
    public final Name getComposableOpenTargetIndexArgument() {
        return ComposableOpenTargetIndexArgument;
    }

    @NotNull
    public final FqName getComposableTarget() {
        return ComposableTarget;
    }

    @NotNull
    public final Name getComposableTargetApplierArgument() {
        return ComposableTargetApplierArgument;
    }

    @NotNull
    public final FqName getComposableTargetMarker() {
        return ComposableTargetMarker;
    }

    @NotNull
    public final String getComposableTargetMarkerDescription() {
        return ComposableTargetMarkerDescription;
    }

    @NotNull
    public final FqName getComposeVersion() {
        return ComposeVersion;
    }

    @NotNull
    public final FqName getComposer() {
        return Composer;
    }

    @NotNull
    public final FqName getCurrentComposerIntrinsic() {
        return CurrentComposerIntrinsic;
    }

    @NotNull
    public final FqName getDisallowComposableCalls() {
        return DisallowComposableCalls;
    }

    @NotNull
    public final FqName getExplicitGroupsComposable() {
        return ExplicitGroupsComposable;
    }

    @NotNull
    public final FqName getGetCurrentComposerFullName() {
        return getCurrentComposerFullName;
    }

    @NotNull
    public final FqName getImmutable() {
        return Immutable;
    }

    @NotNull
    public final FqName getKey() {
        return key;
    }

    @NotNull
    public final FqName getNonRestartableComposable() {
        return NonRestartableComposable;
    }

    @NotNull
    public final FqName getPackage() {
        return Package;
    }

    @NotNull
    public final FqName getReadOnlyComposable() {
        return ReadOnlyComposable;
    }

    @NotNull
    public final FqName getRemember() {
        return remember;
    }

    @NotNull
    public final FqName getStabilityInferred() {
        return StabilityInferred;
    }

    @NotNull
    public final FqName getStable() {
        return Stable;
    }

    @NotNull
    public final FqName getStableMarker() {
        return StableMarker;
    }

    @NotNull
    public final AnnotationDescriptor makeComposableAnnotation(@NotNull final ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        return new AnnotationDescriptor() { // from class: androidx.compose.compiler.plugins.kotlin.ComposeFqNames.makeComposableAnnotation.1
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
                ModuleDescriptor moduleDescriptor = module;
                ClassId classId = ClassId.topLevel(ComposeFqNames.INSTANCE.getComposable());
                Intrinsics.checkNotNullExpressionValue(classId, "topLevel(Composable)");
                ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
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
}
