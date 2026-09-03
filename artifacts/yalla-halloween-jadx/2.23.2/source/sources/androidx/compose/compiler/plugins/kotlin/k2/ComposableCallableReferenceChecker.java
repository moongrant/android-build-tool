package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.functions.FunctionTypeKind;
import org.jetbrains.kotlin.diagnostics.AbstractSourceElementPositioningStrategy;
import org.jetbrains.kotlin.diagnostics.DiagnosticContext;
import org.jetbrains.kotlin.diagnostics.DiagnosticReporter;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticReportHelpersKt;
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext;
import org.jetbrains.kotlin.fir.analysis.checkers.expression.FirExpressionChecker;
import org.jetbrains.kotlin.fir.expressions.FirCallableReferenceAccess;
import org.jetbrains.kotlin.fir.types.FirTypeUtilsKt;
import org.jetbrains.kotlin.fir.types.FunctionalTypeUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposableCallableReferenceChecker;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/expression/FirExpressionChecker;", "Lorg/jetbrains/kotlin/fir/expressions/FirCallableReferenceAccess;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/expression/FirCallableReferenceAccessChecker;", "()V", "check", "", "expression", "context", "Lorg/jetbrains/kotlin/fir/analysis/checkers/context/CheckerContext;", "reporter", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticReporter;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableCallableReferenceChecker extends FirExpressionChecker<FirCallableReferenceAccess> {

    @NotNull
    public static final ComposableCallableReferenceChecker INSTANCE = new ComposableCallableReferenceChecker();

    private ComposableCallableReferenceChecker() {
    }

    public void check(@NotNull FirCallableReferenceAccess expression, @NotNull CheckerContext context, @NotNull DiagnosticReporter reporter) {
        FunctionTypeKind functionTypeKind = FunctionalTypeUtilsKt.functionTypeKind(FirTypeUtilsKt.getConeType(expression.getTypeRef()), context.getSession());
        if (Intrinsics.areEqual(functionTypeKind, ComposableFunction.INSTANCE) || Intrinsics.areEqual(functionTypeKind, KComposableFunction.INSTANCE)) {
            KtDiagnosticReportHelpersKt.reportOn$default(reporter, expression.getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_FUNCTION_REFERENCE(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
        }
    }
}
