package androidx.compose.compiler.plugins.kotlin;

import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.lower.ComposableFunctionBodyTransformer;
import com.facebook.share.internal.ShareConstants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrCall;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u00020\u0007*\u00060#j\u0002`$H\u0016J\u0010\u0010%\u001a\u00020\u0007*\u00060#j\u0002`$H\u0016J\u0010\u0010&\u001a\u00020\u0007*\u00060#j\u0002`$H\u0016J\u0010\u0010'\u001a\u00020\u0007*\u00060#j\u0002`$H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006("}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/EmptyModuleMetrics;", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "()V", "isEmpty", "", "()Z", "log", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "makeFunctionMetrics", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "recordClass", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "marked", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "recordComposableCall", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "paramMeta", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "recordFunction", "recordLambda", "composable", "memoized", "singleton", "saveMetricsTo", "directory", "saveReportsTo", "appendClassesTxt", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "appendComposablesCsv", "appendComposablesTxt", "appendModuleJson", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmptyModuleMetrics implements ModuleMetrics {

    @NotNull
    public static final EmptyModuleMetrics INSTANCE = new EmptyModuleMetrics();

    private EmptyModuleMetrics() {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendClassesTxt(@NotNull Appendable appendable) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendComposablesCsv(@NotNull Appendable appendable) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendComposablesTxt(@NotNull Appendable appendable) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void appendModuleJson(@NotNull Appendable appendable) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public boolean isEmpty() {
        return true;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void log(@NotNull String message) {
        System.out.println((Object) message);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    @NotNull
    public FunctionMetrics makeFunctionMetrics(@NotNull IrFunction function) {
        return EmptyFunctionMetrics.INSTANCE;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordClass(@NotNull IrClass declaration, boolean marked, @NotNull Stability stability) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordComposableCall(@NotNull IrCall expression, @NotNull List<ComposableFunctionBodyTransformer.ParamMeta> paramMeta) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordFunction(@NotNull FunctionMetrics function) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void recordLambda(boolean composable, boolean memoized, boolean singleton) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void saveMetricsTo(@NotNull String directory) {
    }

    @Override // androidx.compose.compiler.plugins.kotlin.ModuleMetrics
    public void saveReportsTo(@NotNull String directory) {
    }
}
