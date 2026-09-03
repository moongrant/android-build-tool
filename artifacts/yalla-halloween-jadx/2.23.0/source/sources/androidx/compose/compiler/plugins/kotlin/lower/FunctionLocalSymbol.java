package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrSymbolOwner;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/FunctionLocalSymbol;", "Landroidx/compose/compiler/plugins/kotlin/lower/DeclarationContext;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "functionContext", "Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "(Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;)V", "captures", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getCaptures", "()Ljava/util/Set;", "composable", "", "getComposable", "()Z", "getDeclaration", "()Lorg/jetbrains/kotlin/ir/declarations/IrSymbolOwner;", "getFunctionContext", "()Landroidx/compose/compiler/plugins/kotlin/lower/FunctionContext;", "symbol", "Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "getSymbol", "()Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "declareLocal", "", ImagesContract.LOCAL, "popCollector", "collector", "Landroidx/compose/compiler/plugins/kotlin/lower/CaptureCollector;", "pushCollector", "recordCapture", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FunctionLocalSymbol extends DeclarationContext {

    @NotNull
    private final IrSymbolOwner declaration;

    @NotNull
    private final FunctionContext functionContext;

    public FunctionLocalSymbol(@NotNull IrSymbolOwner declaration, @NotNull FunctionContext functionContext) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        Intrinsics.checkNotNullParameter(functionContext, "functionContext");
        this.declaration = declaration;
        this.functionContext = functionContext;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void declareLocal(@Nullable IrValueDeclaration local) {
        getFunctionContext().declareLocal(local);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    public Set<IrValueDeclaration> getCaptures() {
        return getFunctionContext().getCaptures();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public boolean getComposable() {
        return getFunctionContext().getComposable();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    public IrSymbolOwner getDeclaration() {
        return this.declaration;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    public FunctionContext getFunctionContext() {
        return this.functionContext;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    @NotNull
    /* JADX INFO: renamed from: getSymbol */
    public IrSymbol mo132getSymbol() {
        return getDeclaration().getSymbol();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void popCollector(@NotNull CaptureCollector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        getFunctionContext().popCollector(collector);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void pushCollector(@NotNull CaptureCollector collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        getFunctionContext().pushCollector(collector);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public boolean recordCapture(@Nullable IrValueDeclaration local) {
        return getFunctionContext().recordCapture(local);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.DeclarationContext
    public void recordCapture(@Nullable IrSymbolOwner local) {
        getFunctionContext().recordCapture(local);
    }
}
