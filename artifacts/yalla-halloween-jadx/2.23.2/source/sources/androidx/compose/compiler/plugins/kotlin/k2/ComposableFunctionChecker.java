package androidx.compose.compiler.plugins.kotlin.k2;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.diagnostics.AbstractSourceElementPositioningStrategy;
import org.jetbrains.kotlin.diagnostics.DiagnosticContext;
import org.jetbrains.kotlin.diagnostics.DiagnosticReporter;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticReportHelpersKt;
import org.jetbrains.kotlin.fir.FirAnnotationContainer;
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext;
import org.jetbrains.kotlin.fir.analysis.checkers.declaration.FirDeclarationChecker;
import org.jetbrains.kotlin.fir.analysis.diagnostics.FirErrors;
import org.jetbrains.kotlin.fir.declarations.ExpectActualAttributesKt;
import org.jetbrains.kotlin.fir.declarations.FirFunction;
import org.jetbrains.kotlin.fir.declarations.FirMemberDeclaration;
import org.jetbrains.kotlin.fir.declarations.FirValueParameter;
import org.jetbrains.kotlin.fir.declarations.utils.FirDeclarationUtilKt;
import org.jetbrains.kotlin.fir.expressions.FirExpression;
import org.jetbrains.kotlin.fir.symbols.FirBasedSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirFunctionSymbol;
import org.jetbrains.kotlin.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposableFunctionChecker;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/declaration/FirDeclarationChecker;", "Lorg/jetbrains/kotlin/fir/declarations/FirFunction;", "Lorg/jetbrains/kotlin/fir/analysis/checkers/declaration/FirFunctionChecker;", "()V", "check", "", "declaration", "context", "Lorg/jetbrains/kotlin/fir/analysis/checkers/context/CheckerContext;", "reporter", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticReporter;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableFunctionChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunctionChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableFunctionChecker\n+ 2 FirStatusUtils.kt\norg/jetbrains/kotlin/fir/declarations/utils/FirStatusUtilsKt\n*L\n1#1,97:1\n43#2:98\n12#2:99\n38#2:100\n*S KotlinDebug\n*F\n+ 1 ComposableFunctionChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableFunctionChecker\n*L\n68#1:98\n73#1:99\n90#1:100\n*E\n"})
public final class ComposableFunctionChecker extends FirDeclarationChecker<FirFunction> {

    @NotNull
    public static final ComposableFunctionChecker INSTANCE = new ComposableFunctionChecker();

    private ComposableFunctionChecker() {
    }

    public void check(@NotNull FirFunction declaration, @NotNull CheckerContext context, @NotNull DiagnosticReporter reporter) {
        boolean zHasComposableAnnotation = FirUtilsKt.hasComposableAnnotation((FirAnnotationContainer) declaration, context.getSession());
        Iterator<FirFunctionSymbol<?>> it = FirUtilsKt.getDirectOverriddenFunctions(declaration, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FirFunctionSymbol next = it.next();
            if (FirUtilsKt.isComposable((FirCallableSymbol) next, context.getSession()) != zHasComposableAnnotation) {
                KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), FirErrors.INSTANCE.getCONFLICTING_OVERLOADS(), CollectionsKt.listOf((Object[]) new FirFunctionSymbol[]{declaration.getSymbol(), next}), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 16, (Object) null);
            }
        }
        FirBasedSymbol singleCompatibleExpectForActualOrNull = ExpectActualAttributesKt.getSingleCompatibleExpectForActualOrNull(declaration.getSymbol());
        if (singleCompatibleExpectForActualOrNull != null && FirUtilsKt.hasComposableAnnotation((FirBasedSymbol<?>) singleCompatibleExpectForActualOrNull, context.getSession()) != zHasComposableAnnotation) {
            KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), ComposeErrors.INSTANCE.getMISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
        }
        if (zHasComposableAnnotation) {
            FirMemberDeclaration firMemberDeclaration = (FirMemberDeclaration) declaration;
            if (firMemberDeclaration.getStatus().isSuspend()) {
                KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_SUSPEND_FUN(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
            }
            if (firMemberDeclaration.getStatus().getModality() == Modality.ABSTRACT) {
                Iterator it2 = declaration.getValueParameters().iterator();
                while (it2.hasNext()) {
                    FirExpression defaultValue = ((FirValueParameter) it2.next()).getDefaultValue();
                    if (defaultValue != null) {
                        KtDiagnosticReportHelpersKt.reportOn$default(reporter, defaultValue.getSource(), ComposeErrors.INSTANCE.getABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
                    }
                }
            }
            if (FirUtilsKt.isMain(declaration.getSymbol(), context.getSession())) {
                KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_FUN_MAIN(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
            }
            if (firMemberDeclaration.getStatus().isOperator() && Intrinsics.areEqual(FirDeclarationUtilKt.getNameOrSpecialName(firMemberDeclaration), OperatorNameConventions.SET_VALUE)) {
                KtDiagnosticReportHelpersKt.reportOn$default(reporter, declaration.getSource(), ComposeErrors.INSTANCE.getCOMPOSE_INVALID_DELEGATE(), (DiagnosticContext) context, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
            }
        }
    }
}
