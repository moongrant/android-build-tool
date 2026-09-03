package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.diagnostics.DiagnosticReporter;
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext;
import org.jetbrains.kotlin.fir.analysis.checkers.expression.FirExpressionChecker;
import org.jetbrains.kotlin.fir.declarations.FirDeclarationOrigin;
import org.jetbrains.kotlin.fir.expressions.FirFunctionCall;
import org.jetbrains.kotlin.fir.expressions.FirQualifiedAccessExpression;
import org.jetbrains.kotlin.fir.references.FirReferenceUtilsKt;
import org.jetbrains.kotlin.fir.resolve.CallableIdUtilsKt;
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposableFunctionCallChecker;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/expression/FirExpressionChecker;", "Lorg/jetbrains/kotlin/fir/expressions/FirFunctionCall;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/expression/FirFunctionCallChecker;", "()V", "check", "", "expression", "context", "Lorg/jetbrains/kotlin/fir/analysis/checkers/context/CheckerContext;", "reporter", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticReporter;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableFunctionCallChecker extends FirExpressionChecker<FirFunctionCall> {

    @NotNull
    public static final ComposableFunctionCallChecker INSTANCE = new ComposableFunctionCallChecker();

    private ComposableFunctionCallChecker() {
    }

    public void check(@NotNull FirFunctionCall expression, @NotNull CheckerContext context, @NotNull DiagnosticReporter reporter) {
        FirCallableSymbol resolvedCallableSymbol$default = FirReferenceUtilsKt.toResolvedCallableSymbol$default(expression.getCalleeReference(), false, 1, (Object) null);
        if (resolvedCallableSymbol$default == null || Intrinsics.areEqual(resolvedCallableSymbol$default.getOrigin(), FirDeclarationOrigin.SamConstructor.INSTANCE)) {
            return;
        }
        if (FirUtilsKt.isComposable(resolvedCallableSymbol$default, context.getSession())) {
            ComposableCallCheckerKt.checkComposableCall((FirQualifiedAccessExpression) expression, resolvedCallableSymbol$default, context, reporter);
        } else if (CallableIdUtilsKt.isInvoke(resolvedCallableSymbol$default.getCallableId())) {
            ComposableCallCheckerKt.checkInvoke((FirQualifiedAccessExpression) expression, context, reporter);
        }
    }
}
