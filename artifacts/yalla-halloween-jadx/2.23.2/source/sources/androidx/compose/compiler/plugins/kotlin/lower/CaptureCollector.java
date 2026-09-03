package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/CaptureCollector;", "", "()V", "capturedDeclarations", "", "Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "getCapturedDeclarations", "()Ljava/util/Set;", "captures", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getCaptures", "hasCaptures", "", "getHasCaptures", "()Z", "recordCapture", "", ImagesContract.LOCAL, "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class CaptureCollector {

    @NotNull
    private final Set<IrValueDeclaration> captures = new LinkedHashSet();

    @NotNull
    private final Set<IrSymbolOwner> capturedDeclarations = new LinkedHashSet();

    @NotNull
    public final Set<IrSymbolOwner> getCapturedDeclarations() {
        return this.capturedDeclarations;
    }

    @NotNull
    public final Set<IrValueDeclaration> getCaptures() {
        return this.captures;
    }

    public final boolean getHasCaptures() {
        return (this.captures.isEmpty() ^ true) || (this.capturedDeclarations.isEmpty() ^ true);
    }

    public final void recordCapture(@NotNull IrValueDeclaration local) {
        this.captures.add(local);
    }

    public final void recordCapture(@NotNull IrSymbolOwner local) {
        this.capturedDeclarations.add(local);
    }
}
