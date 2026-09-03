package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.ClassId;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0002J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020#H\u0000¢\u0006\u0002\b%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0011\u0010\u001f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006¨\u0006&"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeClassIds;", "", "()V", "Composable", "Lorg/jetbrains/kotlin/name/ClassId;", "getComposable", "()Lorg/jetbrains/kotlin/name/ClassId;", "ComposableInferredTarget", "getComposableInferredTarget", "ComposableLambda", "getComposableLambda", "ComposableOpenTarget", "getComposableOpenTarget", "ComposableTarget", "getComposableTarget", "ComposeVersion", "getComposeVersion", "Composer", "getComposer", "FunctionKeyMeta", "getFunctionKeyMeta", "FunctionKeyMetaClass", "getFunctionKeyMetaClass", "LiveLiteralFileInfo", "getLiveLiteralFileInfo", "LiveLiteralInfo", "getLiveLiteralInfo", "NoLiveLiterals", "getNoLiveLiterals", "StabilityInferred", "getStabilityInferred", "State", "getState", "classIdFor", "cname", "", "internalClassIdFor", "internalClassIdFor$compiler_hosted", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeClassIds {

    @NotNull
    private static final ClassId Composable;

    @NotNull
    private static final ClassId ComposableInferredTarget;

    @NotNull
    private static final ClassId ComposableLambda;

    @NotNull
    private static final ClassId ComposableOpenTarget;

    @NotNull
    private static final ClassId ComposableTarget;

    @NotNull
    private static final ClassId ComposeVersion;

    @NotNull
    private static final ClassId Composer;

    @NotNull
    private static final ClassId FunctionKeyMeta;

    @NotNull
    private static final ClassId FunctionKeyMetaClass;

    @NotNull
    public static final ComposeClassIds INSTANCE;

    @NotNull
    private static final ClassId LiveLiteralFileInfo;

    @NotNull
    private static final ClassId LiveLiteralInfo;

    @NotNull
    private static final ClassId NoLiveLiterals;

    @NotNull
    private static final ClassId StabilityInferred;

    @NotNull
    private static final ClassId State;

    static {
        ComposeClassIds composeClassIds = new ComposeClassIds();
        INSTANCE = composeClassIds;
        Composable = composeClassIds.classIdFor("Composable");
        ComposableInferredTarget = composeClassIds.classIdFor("ComposableInferredTarget");
        ComposableLambda = composeClassIds.internalClassIdFor$compiler_hosted("ComposableLambda");
        ComposableOpenTarget = composeClassIds.classIdFor("ComposableOpenTarget");
        ComposableTarget = composeClassIds.classIdFor("ComposableTarget");
        ComposeVersion = composeClassIds.classIdFor("ComposeVersion");
        Composer = composeClassIds.classIdFor("Composer");
        FunctionKeyMetaClass = composeClassIds.internalClassIdFor$compiler_hosted("FunctionKeyMetaClass");
        FunctionKeyMeta = composeClassIds.internalClassIdFor$compiler_hosted("FunctionKeyMeta");
        LiveLiteralFileInfo = composeClassIds.internalClassIdFor$compiler_hosted("LiveLiteralFileInfo");
        LiveLiteralInfo = composeClassIds.internalClassIdFor$compiler_hosted("LiveLiteralInfo");
        NoLiveLiterals = composeClassIds.classIdFor("NoLiveLiterals");
        State = composeClassIds.classIdFor("State");
        StabilityInferred = composeClassIds.internalClassIdFor$compiler_hosted("StabilityInferred");
    }

    private ComposeClassIds() {
    }

    private final ClassId classIdFor(String cname) {
        return new ClassId(ComposeFqNamesKt.rootFqName, Name.identifier(cname));
    }

    @NotNull
    public final ClassId getComposable() {
        return Composable;
    }

    @NotNull
    public final ClassId getComposableInferredTarget() {
        return ComposableInferredTarget;
    }

    @NotNull
    public final ClassId getComposableLambda() {
        return ComposableLambda;
    }

    @NotNull
    public final ClassId getComposableOpenTarget() {
        return ComposableOpenTarget;
    }

    @NotNull
    public final ClassId getComposableTarget() {
        return ComposableTarget;
    }

    @NotNull
    public final ClassId getComposeVersion() {
        return ComposeVersion;
    }

    @NotNull
    public final ClassId getComposer() {
        return Composer;
    }

    @NotNull
    public final ClassId getFunctionKeyMeta() {
        return FunctionKeyMeta;
    }

    @NotNull
    public final ClassId getFunctionKeyMetaClass() {
        return FunctionKeyMetaClass;
    }

    @NotNull
    public final ClassId getLiveLiteralFileInfo() {
        return LiveLiteralFileInfo;
    }

    @NotNull
    public final ClassId getLiveLiteralInfo() {
        return LiveLiteralInfo;
    }

    @NotNull
    public final ClassId getNoLiveLiterals() {
        return NoLiveLiterals;
    }

    @NotNull
    public final ClassId getStabilityInferred() {
        return StabilityInferred;
    }

    @NotNull
    public final ClassId getState() {
        return State;
    }

    @NotNull
    public final ClassId internalClassIdFor$compiler_hosted(@NotNull String cname) {
        Intrinsics.checkNotNullParameter(cname, "cname");
        return new ClassId(ComposeFqNamesKt.internalRootFqName, Name.identifier(cname));
    }
}
