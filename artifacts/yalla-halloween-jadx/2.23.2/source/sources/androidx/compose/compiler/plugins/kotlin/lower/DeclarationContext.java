package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H&J\u0012\u0010#\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH&J\u0012\u0010#\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0000R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/DeclarationContext;", "", "()V", "captures", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getCaptures", "()Ljava/util/Set;", "composable", "", "getComposable", "()Z", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "functionContext", "Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "getFunctionContext", "()Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "localDeclarationCaptures", "", "getLocalDeclarationCaptures", "()Ljava/util/Map;", "symbol", "Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "getSymbol", "()Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "declareLocal", "", ImagesContract.LOCAL, "popCollector", "collector", "Landroidx/compose/compiler/plugins/kotlin/lower/CaptureCollector;", "pushCollector", "recordCapture", "recordLocalDeclaration", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class DeclarationContext {

    @NotNull
    private final Map<IrSymbolOwner, Set<IrValueDeclaration>> localDeclarationCaptures = new LinkedHashMap();

    public abstract void declareLocal(@Nullable IrValueDeclaration local);

    @NotNull
    public abstract Set<IrValueDeclaration> getCaptures();

    public abstract boolean getComposable();

    @NotNull
    public abstract IrSymbolOwner getDeclaration();

    @Nullable
    public abstract FunctionContext getFunctionContext();

    @NotNull
    public final Map<IrSymbolOwner, Set<IrValueDeclaration>> getLocalDeclarationCaptures() {
        return this.localDeclarationCaptures;
    }

    @NotNull
    /* JADX INFO: renamed from: getSymbol */
    public abstract IrSymbol mo132getSymbol();

    public abstract void popCollector(@NotNull CaptureCollector collector);

    public abstract void pushCollector(@NotNull CaptureCollector collector);

    public abstract void recordCapture(@Nullable IrSymbolOwner local);

    public abstract boolean recordCapture(@Nullable IrValueDeclaration local);

    public final void recordLocalDeclaration(@NotNull DeclarationContext local) {
        this.localDeclarationCaptures.put(local.getDeclaration(), local.getCaptures());
    }
}
