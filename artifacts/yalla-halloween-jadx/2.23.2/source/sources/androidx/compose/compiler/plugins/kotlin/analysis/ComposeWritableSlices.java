package androidx.compose.compiler.plugins.kotlin.analysis;

import androidx.compose.compiler.plugins.kotlin.FunctionMetrics;
import androidx.compose.compiler.plugins.kotlin.lower.KeyInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression;
import org.jetbrains.kotlin.util.slicedMap.BasicWritableSlice;
import org.jetbrains.kotlin.util.slicedMap.RewritePolicy;
import org.jetbrains.kotlin.util.slicedMap.WritableSlice;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/analysis/ComposeWritableSlices;", "", "()V", "DURABLE_FUNCTION_KEY", "Lorg/jetbrains/kotlin/util/slicedMap/WritableSlice;", "Lorg/jetbrains/kotlin/ir/declarations/IrAttributeContainer;", "Landroidx/compose/compiler/plugins/kotlin/lower/KeyInfo;", "getDURABLE_FUNCTION_KEY", "()Lorg/jetbrains/kotlin/util/slicedMap/WritableSlice;", "DURABLE_FUNCTION_KEYS", "", "getDURABLE_FUNCTION_KEYS", "FUNCTION_METRICS", "Landroidx/compose/compiler/plugins/kotlin/FunctionMetrics;", "getFUNCTION_METRICS", "HAS_TRANSFORMED_LAMBDA", "", "getHAS_TRANSFORMED_LAMBDA", "IS_COMPOSABLE_SINGLETON", "getIS_COMPOSABLE_SINGLETON", "IS_COMPOSABLE_SINGLETON_CLASS", "getIS_COMPOSABLE_SINGLETON_CLASS", "IS_STATIC_FUNCTION_EXPRESSION", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "getIS_STATIC_FUNCTION_EXPRESSION", "IS_SYNTHETIC_COMPOSABLE_CALL", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "getIS_SYNTHETIC_COMPOSABLE_CALL", "IS_TRANSFORMED_LAMBDA", "getIS_TRANSFORMED_LAMBDA", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeWritableSlices {

    @NotNull
    public static final ComposeWritableSlices INSTANCE = new ComposeWritableSlices();

    @NotNull
    private static final WritableSlice<IrFunctionAccessExpression, Boolean> IS_SYNTHETIC_COMPOSABLE_CALL = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrExpression, Boolean> IS_STATIC_FUNCTION_EXPRESSION = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, Boolean> IS_COMPOSABLE_SINGLETON = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, Boolean> IS_COMPOSABLE_SINGLETON_CLASS = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, KeyInfo> DURABLE_FUNCTION_KEY = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, List<KeyInfo>> DURABLE_FUNCTION_KEYS = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, Boolean> HAS_TRANSFORMED_LAMBDA = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, Boolean> IS_TRANSFORMED_LAMBDA = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    @NotNull
    private static final WritableSlice<IrAttributeContainer, FunctionMetrics> FUNCTION_METRICS = new BasicWritableSlice<>(RewritePolicy.DO_NOTHING);

    private ComposeWritableSlices() {
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, KeyInfo> getDURABLE_FUNCTION_KEY() {
        return DURABLE_FUNCTION_KEY;
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, List<KeyInfo>> getDURABLE_FUNCTION_KEYS() {
        return DURABLE_FUNCTION_KEYS;
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, FunctionMetrics> getFUNCTION_METRICS() {
        return FUNCTION_METRICS;
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, Boolean> getHAS_TRANSFORMED_LAMBDA() {
        return HAS_TRANSFORMED_LAMBDA;
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, Boolean> getIS_COMPOSABLE_SINGLETON() {
        return IS_COMPOSABLE_SINGLETON;
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, Boolean> getIS_COMPOSABLE_SINGLETON_CLASS() {
        return IS_COMPOSABLE_SINGLETON_CLASS;
    }

    @NotNull
    public final WritableSlice<IrExpression, Boolean> getIS_STATIC_FUNCTION_EXPRESSION() {
        return IS_STATIC_FUNCTION_EXPRESSION;
    }

    @NotNull
    public final WritableSlice<IrFunctionAccessExpression, Boolean> getIS_SYNTHETIC_COMPOSABLE_CALL() {
        return IS_SYNTHETIC_COMPOSABLE_CALL;
    }

    @NotNull
    public final WritableSlice<IrAttributeContainer, Boolean> getIS_TRANSFORMED_LAMBDA() {
        return IS_TRANSFORMED_LAMBDA;
    }
}
