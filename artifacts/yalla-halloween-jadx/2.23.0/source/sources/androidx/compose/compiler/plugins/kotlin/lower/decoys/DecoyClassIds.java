package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.name.ClassId;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyClassIds;", "", "()V", "Decoy", "Lorg/jetbrains/kotlin/name/ClassId;", "getDecoy", "()Lorg/jetbrains/kotlin/name/ClassId;", "DecoyImplementation", "getDecoyImplementation", "DecoyImplementationDefaultsBitMask", "getDecoyImplementationDefaultsBitMask", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DecoyClassIds {

    @NotNull
    private static final ClassId Decoy;

    @NotNull
    private static final ClassId DecoyImplementation;

    @NotNull
    private static final ClassId DecoyImplementationDefaultsBitMask;

    @NotNull
    public static final DecoyClassIds INSTANCE = new DecoyClassIds();

    static {
        ComposeClassIds composeClassIds = ComposeClassIds.INSTANCE;
        Decoy = composeClassIds.internalClassIdFor$compiler_hosted("Decoy");
        DecoyImplementation = composeClassIds.internalClassIdFor$compiler_hosted("DecoyImplementation");
        DecoyImplementationDefaultsBitMask = composeClassIds.internalClassIdFor$compiler_hosted("DecoyImplementationDefaultsBitMask");
    }

    private DecoyClassIds() {
    }

    @NotNull
    public final ClassId getDecoy() {
        return Decoy;
    }

    @NotNull
    public final ClassId getDecoyImplementation() {
        return DecoyImplementation;
    }

    @NotNull
    public final ClassId getDecoyImplementationDefaultsBitMask() {
        return DecoyImplementationDefaultsBitMask;
    }
}
