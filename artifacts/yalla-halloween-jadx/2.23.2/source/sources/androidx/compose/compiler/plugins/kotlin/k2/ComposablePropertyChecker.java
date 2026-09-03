package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.diagnostics.AbstractSourceElementPositioningStrategy;
import org.jetbrains.kotlin.diagnostics.DiagnosticContext;
import org.jetbrains.kotlin.diagnostics.DiagnosticReporter;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticReportHelpersKt;
import org.jetbrains.kotlin.fir.FirAnnotationContainer;
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext;
import org.jetbrains.kotlin.fir.analysis.checkers.declaration.FirDeclarationChecker;
import org.jetbrains.kotlin.fir.declarations.FirProperty;
import org.jetbrains.kotlin.fir.declarations.utils.DeclarationAttributesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposablePropertyChecker;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/declaration/FirDeclarationChecker;", "Lorg/jetbrains/kotlin/fir/declarations/FirProperty;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/declaration/FirPropertyChecker;", "()V", "check", "", "declaration", "context", "Lorg/jetbrains/kotlin/fir/analysis/checkers/context/CheckerContext;", "reporter", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticReporter;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposablePropertyChecker extends FirDeclarationChecker<FirProperty> {

    @NotNull
    public static final ComposablePropertyChecker INSTANCE = new ComposablePropertyChecker();

    private ComposablePropertyChecker() {
    }

    public void check(@NotNull FirProperty declaration, @NotNull CheckerContext context, @NotNull DiagnosticReporter reporter) {
        FirAnnotationContainer getter = declaration.getGetter();
        if (!(getter != null && FirUtilsKt.hasComposableAnnotation(getter, context.getSession()))) {
            FirAnnotationContainer setter = declaration.getSetter();
            if (!(setter != null && FirUtilsKt.hasComposableAnnotation(setter, context.getSession()))) {
                return;
            }
        }
        if (declaration.isVar()) {
            KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_VAR(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
        }
        if (DeclarationAttributesKt.getHasBackingField(declaration)) {
            KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_PROPERTY_BACKING_FIELD(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
        }
    }
}
