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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH&J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\bH&J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\bH&J\u0010\u0010!\u001a\u00020\u0006*\u00060\"j\u0002`#H&J\u0010\u0010$\u001a\u00020\u0006*\u00060\"j\u0002`#H&J\u0010\u0010%\u001a\u00020\u0006*\u00060\"j\u0002`#H&J\u0010\u0010&\u001a\u00020\u0006*\u00060\"j\u0002`#H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "", "isEmpty", "", "()Z", "log", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "makeFunctionMetrics", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "function", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "recordClass", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "marked", "stability", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "recordComposableCall", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "paramMeta", "", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunctionBodyTransformer$ParamMeta;", "recordFunction", "recordLambda", "composable", "memoized", "singleton", "saveMetricsTo", "directory", "saveReportsTo", "appendClassesTxt", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "appendComposablesCsv", "appendComposablesTxt", "appendModuleJson", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ModuleMetrics {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isEmpty(@NotNull ModuleMetrics moduleMetrics) {
            return OooO0o.OooO00o(moduleMetrics);
        }
    }

    void appendClassesTxt(@NotNull Appendable appendable);

    void appendComposablesCsv(@NotNull Appendable appendable);

    void appendComposablesTxt(@NotNull Appendable appendable);

    void appendModuleJson(@NotNull Appendable appendable);

    boolean isEmpty();

    void log(@NotNull String message);

    @NotNull
    FunctionMetrics makeFunctionMetrics(@NotNull IrFunction function);

    void recordClass(@NotNull IrClass declaration, boolean marked, @NotNull Stability stability);

    void recordComposableCall(@NotNull IrCall expression, @NotNull List<ComposableFunctionBodyTransformer.ParamMeta> paramMeta);

    void recordFunction(@NotNull FunctionMetrics function);

    void recordLambda(boolean composable, boolean memoized, boolean singleton);

    void saveMetricsTo(@NotNull String directory);

    void saveReportsTo(@NotNull String directory);
}
