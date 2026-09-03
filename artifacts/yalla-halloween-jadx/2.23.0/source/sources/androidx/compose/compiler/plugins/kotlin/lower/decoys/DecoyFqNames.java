package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.FqName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyFqNames;", "", "()V", "CurrentComposerIntrinsic", "Lorg/jetbrains/kotlin/name/FqName;", "getCurrentComposerIntrinsic", "()Lorg/jetbrains/kotlin/name/FqName;", "Decoy", "getDecoy", "DecoyImplementation", "getDecoyImplementation", "DecoyImplementationDefaultsBitMask", "getDecoyImplementationDefaultsBitMask", "key", "getKey", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DecoyFqNames {

    @NotNull
    private static final FqName CurrentComposerIntrinsic;

    @NotNull
    private static final FqName Decoy;

    @NotNull
    private static final FqName DecoyImplementation;

    @NotNull
    private static final FqName DecoyImplementationDefaultsBitMask;

    @NotNull
    public static final DecoyFqNames INSTANCE = new DecoyFqNames();

    @NotNull
    private static final FqName key;

    static {
        DecoyClassIds decoyClassIds = DecoyClassIds.INSTANCE;
        FqName fqNameAsSingleFqName = decoyClassIds.getDecoy().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "DecoyClassIds.Decoy.asSingleFqName()");
        Decoy = fqNameAsSingleFqName;
        FqName fqNameAsSingleFqName2 = decoyClassIds.getDecoyImplementation().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName2, "DecoyClassIds.DecoyImplementation.asSingleFqName()");
        DecoyImplementation = fqNameAsSingleFqName2;
        FqName fqNameAsSingleFqName3 = decoyClassIds.getDecoyImplementationDefaultsBitMask().asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName3, "DecoyClassIds.DecoyImple…sBitMask.asSingleFqName()");
        DecoyImplementationDefaultsBitMask = fqNameAsSingleFqName3;
        ComposeFqNames composeFqNames = ComposeFqNames.INSTANCE;
        CurrentComposerIntrinsic = composeFqNames.fqNameFor$compiler_hosted("$get-currentComposer$$composable");
        key = composeFqNames.fqNameFor$compiler_hosted("key$composable");
    }

    private DecoyFqNames() {
    }

    @NotNull
    public final FqName getCurrentComposerIntrinsic() {
        return CurrentComposerIntrinsic;
    }

    @NotNull
    public final FqName getDecoy() {
        return Decoy;
    }

    @NotNull
    public final FqName getDecoyImplementation() {
        return DecoyImplementation;
    }

    @NotNull
    public final FqName getDecoyImplementationDefaultsBitMask() {
        return DecoyImplementationDefaultsBitMask;
    }

    @NotNull
    public final FqName getKey() {
        return key;
    }
}
