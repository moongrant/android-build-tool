package androidx.compose.compiler.plugins.kotlin.k2;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.fir.FirSession;
import org.jetbrains.kotlin.fir.analysis.checkers.declaration.DeclarationCheckers;
import org.jetbrains.kotlin.fir.analysis.checkers.declaration.FirDeclarationChecker;
import org.jetbrains.kotlin.fir.analysis.checkers.expression.ExpressionCheckers;
import org.jetbrains.kotlin.fir.analysis.checkers.expression.FirExpressionChecker;
import org.jetbrains.kotlin.fir.analysis.extensions.FirAdditionalCheckersExtension;
import org.jetbrains.kotlin.fir.declarations.FirFunction;
import org.jetbrains.kotlin.fir.declarations.FirProperty;
import org.jetbrains.kotlin.fir.expressions.FirCallableReferenceAccess;
import org.jetbrains.kotlin.fir.expressions.FirFunctionCall;
import org.jetbrains.kotlin.fir.expressions.FirPropertyAccessExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposeFirCheckersExtension;", "Lorg/jetbrains/kotlin/fir/analysis/extensions/FirAdditionalCheckersExtension;", "session", "Lorg/jetbrains/kotlin/fir/FirSession;", "(Lorg/jetbrains/kotlin/fir/FirSession;)V", "declarationCheckers", "Lorg/jetbrains/kotlin/fir/analysis/checkers/declaration/DeclarationCheckers;", "getDeclarationCheckers", "()Lorg/jetbrains/kotlin/fir/analysis/checkers/declaration/DeclarationCheckers;", "expressionCheckers", "Lorg/jetbrains/kotlin/fir/analysis/checkers/expression/ExpressionCheckers;", "getExpressionCheckers", "()Lorg/jetbrains/kotlin/fir/analysis/checkers/expression/ExpressionCheckers;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeFirCheckersExtension extends FirAdditionalCheckersExtension {

    @NotNull
    private final DeclarationCheckers declarationCheckers;

    @NotNull
    private final ExpressionCheckers expressionCheckers;

    public ComposeFirCheckersExtension(@NotNull FirSession firSession) {
        super(firSession);
        this.declarationCheckers = new DeclarationCheckers() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposeFirCheckersExtension$declarationCheckers$1

            @NotNull
            private final Set<FirDeclarationChecker<FirFunction>> functionCheckers = SetsKt.setOf(ComposableFunctionChecker.INSTANCE);

            @NotNull
            private final Set<FirDeclarationChecker<FirProperty>> propertyCheckers = SetsKt.setOf(ComposablePropertyChecker.INSTANCE);

            @NotNull
            public Set<FirDeclarationChecker<FirFunction>> getFunctionCheckers() {
                return this.functionCheckers;
            }

            @NotNull
            public Set<FirDeclarationChecker<FirProperty>> getPropertyCheckers() {
                return this.propertyCheckers;
            }
        };
        this.expressionCheckers = new ExpressionCheckers() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposeFirCheckersExtension$expressionCheckers$1

            @NotNull
            private final Set<FirExpressionChecker<FirFunctionCall>> functionCallCheckers = SetsKt.setOf(ComposableFunctionCallChecker.INSTANCE);

            @NotNull
            private final Set<FirExpressionChecker<FirPropertyAccessExpression>> propertyAccessExpressionCheckers = SetsKt.setOf(ComposablePropertyAccessExpressionChecker.INSTANCE);

            @NotNull
            private final Set<FirExpressionChecker<FirCallableReferenceAccess>> callableReferenceAccessCheckers = SetsKt.setOf(ComposableCallableReferenceChecker.INSTANCE);

            @NotNull
            public Set<FirExpressionChecker<FirCallableReferenceAccess>> getCallableReferenceAccessCheckers() {
                return this.callableReferenceAccessCheckers;
            }

            @NotNull
            public Set<FirExpressionChecker<FirFunctionCall>> getFunctionCallCheckers() {
                return this.functionCallCheckers;
            }

            @NotNull
            public Set<FirExpressionChecker<FirPropertyAccessExpression>> getPropertyAccessExpressionCheckers() {
                return this.propertyAccessExpressionCheckers;
            }
        };
    }

    @NotNull
    public DeclarationCheckers getDeclarationCheckers() {
        return this.declarationCheckers;
    }

    @NotNull
    public ExpressionCheckers getExpressionCheckers() {
        return this.expressionCheckers;
    }
}
