package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.AbstractKtSourceElement;
import org.jetbrains.kotlin.diagnostics.AbstractSourceElementPositioningStrategy;
import org.jetbrains.kotlin.diagnostics.DiagnosticContext;
import org.jetbrains.kotlin.diagnostics.DiagnosticReporter;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticReportHelpersKt;
import org.jetbrains.kotlin.fir.FirAnnotationContainer;
import org.jetbrains.kotlin.fir.FirElement;
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext;
import org.jetbrains.kotlin.fir.declarations.FirAnonymousFunction;
import org.jetbrains.kotlin.fir.declarations.FirAnonymousInitializer;
import org.jetbrains.kotlin.fir.declarations.FirAnonymousObject;
import org.jetbrains.kotlin.fir.declarations.FirDeclaration;
import org.jetbrains.kotlin.fir.declarations.FirFunction;
import org.jetbrains.kotlin.fir.declarations.FirProperty;
import org.jetbrains.kotlin.fir.declarations.FirPropertyAccessor;
import org.jetbrains.kotlin.fir.declarations.FirValueParameter;
import org.jetbrains.kotlin.fir.declarations.InlineStatus;
import org.jetbrains.kotlin.fir.expressions.FirCatch;
import org.jetbrains.kotlin.fir.expressions.FirLambdaArgumentExpression;
import org.jetbrains.kotlin.fir.expressions.FirPropertyAccessExpression;
import org.jetbrains.kotlin.fir.expressions.FirQualifiedAccessExpression;
import org.jetbrains.kotlin.fir.expressions.FirTryExpression;
import org.jetbrains.kotlin.fir.expressions.impl.FirResolvedArgumentList;
import org.jetbrains.kotlin.fir.references.FirReference;
import org.jetbrains.kotlin.fir.references.FirReferenceUtilsKt;
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirValueParameterSymbol;
import org.jetbrains.kotlin.fir.types.FirTypeUtilsKt;
import org.jetbrains.kotlin.fir.types.FunctionalTypeUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001ai\u0010\u000f\u001a\u00020\u0001*\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00112\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00112\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u0017H\u0082\b¨\u0006\u001a"}, d2 = {"checkComposableCall", "", "expression", "Lorg/jetbrains/kotlin/fir/expressions/FirQualifiedAccessExpression;", "calleeFunction", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirCallableSymbol;", "context", "Lorg/jetbrains/kotlin/fir/analysis/checkers/context/CheckerContext;", "reporter", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticReporter;", "checkInvoke", "findValueParameterForLambdaAtIndex", "Lorg/jetbrains/kotlin/fir/declarations/FirValueParameter;", "elementIndex", "", "visitCurrentScope", "visitInlineLambdaParameter", "Lkotlin/Function1;", "visitAnonymousFunction", "Lorg/jetbrains/kotlin/fir/declarations/FirAnonymousFunction;", "visitFunction", "Lorg/jetbrains/kotlin/fir/declarations/FirFunction;", "visitTryExpression", "Lkotlin/Function2;", "Lorg/jetbrains/kotlin/fir/expressions/FirTryExpression;", "Lorg/jetbrains/kotlin/fir/FirElement;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableCallChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableCallChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableCallCheckerKt\n+ 2 FirSymbolStatusUtils.kt\norg/jetbrains/kotlin/fir/declarations/utils/FirSymbolStatusUtilsKt\n+ 3 ComposableCallChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableCallCheckerKt$visitCurrentScope$1\n+ 4 ComposableCallChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableCallCheckerKt$visitCurrentScope$2\n+ 5 ComposableCallChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableCallCheckerKt$visitCurrentScope$3\n*L\n1#1,278:1\n230#1,38:279\n224#1,15:318\n239#1,6:334\n245#1,6:341\n252#1,16:348\n37#2:317\n226#3:333\n227#4:340\n228#5:347\n*S KotlinDebug\n*F\n+ 1 ComposableCallChecker.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposableCallCheckerKt\n*L\n106#1:279,38\n204#1:318,15\n204#1:334,6\n204#1:341,6\n204#1:348,16\n200#1:317\n204#1:333\n204#1:340\n204#1:347\n*E\n"})
public final class ComposableCallCheckerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkComposableCall(FirQualifiedAccessExpression firQualifiedAccessExpression, FirCallableSymbol<?> firCallableSymbol, CheckerContext checkerContext, DiagnosticReporter diagnosticReporter) {
        FirValueParameter firValueParameterFindValueParameterForLambdaAtIndex;
        for (IndexedValue indexedValue : CollectionsKt.reversed(CollectionsKt.withIndex(checkerContext.getContainingElements()))) {
            int index = indexedValue.getIndex();
            FirTryExpression firTryExpression = (FirElement) indexedValue.component2();
            if (firTryExpression instanceof FirAnonymousFunction) {
                FirAnonymousFunction firAnonymousFunction = (FirAnonymousFunction) firTryExpression;
                if (firAnonymousFunction.getInlineStatus() == InlineStatus.Inline && (firValueParameterFindValueParameterForLambdaAtIndex = findValueParameterForLambdaAtIndex(checkerContext, index)) != null && FirUtilsKt.hasDisallowComposableCallsAnnotation(firValueParameterFindValueParameterForLambdaAtIndex.getReturnTypeRef(), checkerContext.getSession())) {
                    KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, firQualifiedAccessExpression.getCalleeReference().getSource(), ComposeErrors.INSTANCE.getCAPTURED_COMPOSABLE_INVOCATION(), firValueParameterFindValueParameterForLambdaAtIndex.getSymbol(), firValueParameterFindValueParameterForLambdaAtIndex.getContainingFunctionSymbol(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 32, (Object) null);
                }
                if (FunctionalTypeUtilsKt.functionTypeKind(FirTypeUtilsKt.getConeType(firAnonymousFunction.getTypeRef()), checkerContext.getSession()) == ComposableFunction.INSTANCE) {
                    return;
                }
                if (firAnonymousFunction.getInlineStatus() != InlineStatus.Inline) {
                    break;
                }
            } else {
                if (firTryExpression instanceof FirFunction) {
                    FirPropertyAccessor firPropertyAccessor = (FirFunction) firTryExpression;
                    FirAnnotationContainer firAnnotationContainer = (FirAnnotationContainer) firPropertyAccessor;
                    if (!FirUtilsKt.hasComposableAnnotation(firAnnotationContainer, checkerContext.getSession())) {
                        boolean z = firPropertyAccessor instanceof FirPropertyAccessor;
                        if (z) {
                            FirPropertyAccessor firPropertyAccessor2 = firPropertyAccessor;
                            if (firPropertyAccessor2.getPropertySymbol().getHasDelegate()) {
                                if (firPropertyAccessor2.getPropertySymbol().isVar()) {
                                    KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, firPropertyAccessor.getSource(), ComposeErrors.INSTANCE.getCOMPOSE_INVALID_DELEGATE(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
                                }
                                if (firPropertyAccessor2.getPropertySymbol().isLocal()) {
                                    return;
                                }
                                KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, firPropertyAccessor2.getPropertySymbol().getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_EXPECTED(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
                                return;
                            }
                        }
                        KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, (AbstractKtSourceElement) (z ? firPropertyAccessor.getPropertySymbol().getSource() : firPropertyAccessor.getSource()), ComposeErrors.INSTANCE.getCOMPOSABLE_EXPECTED(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
                        break;
                    }
                    if (!FirUtilsKt.hasReadOnlyComposableAnnotation(firAnnotationContainer, checkerContext.getSession()) || FirUtilsKt.isReadOnlyComposable(firCallableSymbol, checkerContext.getSession())) {
                        return;
                    }
                    KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, firQualifiedAccessExpression.getCalleeReference().getSource(), ComposeErrors.INSTANCE.getNONREADONLY_CALL_IN_READONLY_COMPOSABLE(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
                    return;
                }
                if (firTryExpression instanceof FirTryExpression) {
                    FirElement firElement = (FirElement) CollectionsKt.getOrNull(checkerContext.getContainingElements(), index + 1);
                    if (firElement != null) {
                        FirTryExpression firTryExpression2 = firTryExpression;
                        if (!(firElement instanceof FirCatch) && !Intrinsics.areEqual(firTryExpression2.getFinallyBlock(), firElement)) {
                            KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, firTryExpression2.getSource(), ComposeErrors.INSTANCE.getILLEGAL_TRY_CATCH_AROUND_COMPOSABLE(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
                        }
                    }
                } else if (!(firTryExpression instanceof FirProperty) && !(firTryExpression instanceof FirValueParameter)) {
                    if (!(firTryExpression instanceof FirAnonymousObject ? true : firTryExpression instanceof FirAnonymousInitializer) && (firTryExpression instanceof FirDeclaration)) {
                        break;
                    }
                }
            }
        }
        KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, firQualifiedAccessExpression.getCalleeReference().getSource(), ComposeErrors.INSTANCE.getCOMPOSABLE_INVOCATION(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkInvoke(FirQualifiedAccessExpression firQualifiedAccessExpression, CheckerContext checkerContext, DiagnosticReporter diagnosticReporter) {
        FirReference calleeReference;
        FirValueParameterSymbol resolvedValueParameterSymbol$default;
        FirValueParameter firValueParameterFindValueParameterForLambdaAtIndex;
        FirPropertyAccessExpression dispatchReceiver = firQualifiedAccessExpression.getDispatchReceiver();
        FirPropertyAccessExpression firPropertyAccessExpression = dispatchReceiver instanceof FirPropertyAccessExpression ? dispatchReceiver : null;
        if (firPropertyAccessExpression == null || (calleeReference = firPropertyAccessExpression.getCalleeReference()) == null || (resolvedValueParameterSymbol$default = FirReferenceUtilsKt.toResolvedValueParameterSymbol$default(calleeReference, false, 1, (Object) null)) == null || FirUtilsKt.hasDisallowComposableCallsAnnotation(resolvedValueParameterSymbol$default.getResolvedReturnTypeRef(), checkerContext.getSession()) || !resolvedValueParameterSymbol$default.getContainingFunctionSymbol().getRawStatus().isInline()) {
            return;
        }
        for (IndexedValue indexedValue : CollectionsKt.reversed(CollectionsKt.withIndex(checkerContext.getContainingElements()))) {
            int index = indexedValue.getIndex();
            FirTryExpression firTryExpression = (FirElement) indexedValue.component2();
            if (firTryExpression instanceof FirAnonymousFunction) {
                FirAnonymousFunction firAnonymousFunction = (FirAnonymousFunction) firTryExpression;
                if (firAnonymousFunction.getInlineStatus() == InlineStatus.Inline && (firValueParameterFindValueParameterForLambdaAtIndex = findValueParameterForLambdaAtIndex(checkerContext, index)) != null && FirUtilsKt.hasDisallowComposableCallsAnnotation(firValueParameterFindValueParameterForLambdaAtIndex.getReturnTypeRef(), checkerContext.getSession())) {
                    KtDiagnosticReportHelpersKt.reportOn$default(diagnosticReporter, resolvedValueParameterSymbol$default.getSource(), ComposeErrors.INSTANCE.getMISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION(), resolvedValueParameterSymbol$default, firValueParameterFindValueParameterForLambdaAtIndex.getSymbol(), firValueParameterFindValueParameterForLambdaAtIndex.getContainingFunctionSymbol(), (DiagnosticContext) checkerContext, (AbstractSourceElementPositioningStrategy) null, 64, (Object) null);
                }
                if (firAnonymousFunction.getInlineStatus() != InlineStatus.Inline) {
                    return;
                }
            } else if (firTryExpression instanceof FirFunction) {
                return;
            } else if (firTryExpression instanceof FirTryExpression) {
                if (((FirElement) CollectionsKt.getOrNull(checkerContext.getContainingElements(), index + 1)) == null) {
                }
            } else if (!(firTryExpression instanceof FirProperty) && !(firTryExpression instanceof FirValueParameter)) {
                if (!(firTryExpression instanceof FirAnonymousObject ? true : firTryExpression instanceof FirAnonymousInitializer) && (firTryExpression instanceof FirDeclaration)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirValueParameter findValueParameterForLambdaAtIndex(CheckerContext checkerContext, int i) {
        Object orNull = CollectionsKt.getOrNull(checkerContext.getContainingElements(), i - 1);
        FirLambdaArgumentExpression firLambdaArgumentExpression = orNull instanceof FirLambdaArgumentExpression ? (FirLambdaArgumentExpression) orNull : null;
        if (firLambdaArgumentExpression == null) {
            return null;
        }
        Object orNull2 = CollectionsKt.getOrNull(checkerContext.getContainingElements(), i - 2);
        FirResolvedArgumentList firResolvedArgumentList = orNull2 instanceof FirResolvedArgumentList ? (FirResolvedArgumentList) orNull2 : null;
        if (firResolvedArgumentList == null) {
            return null;
        }
        return (FirValueParameter) firResolvedArgumentList.getMapping().get(firLambdaArgumentExpression);
    }

    private static final void visitCurrentScope(CheckerContext checkerContext, Function1<? super FirValueParameter, Unit> function1, Function1<? super FirAnonymousFunction, Unit> function2, Function1<? super FirFunction, Unit> function3, Function2<? super FirTryExpression, ? super FirElement, Unit> function4) {
        FirValueParameter firValueParameterFindValueParameterForLambdaAtIndex;
        for (IndexedValue indexedValue : CollectionsKt.reversed(CollectionsKt.withIndex(checkerContext.getContainingElements()))) {
            int index = indexedValue.getIndex();
            FirAnonymousFunction firAnonymousFunction = (FirElement) indexedValue.component2();
            if (firAnonymousFunction instanceof FirAnonymousFunction) {
                FirAnonymousFunction firAnonymousFunction2 = firAnonymousFunction;
                if (firAnonymousFunction2.getInlineStatus() == InlineStatus.Inline && (firValueParameterFindValueParameterForLambdaAtIndex = findValueParameterForLambdaAtIndex(checkerContext, index)) != null) {
                    function1.invoke(firValueParameterFindValueParameterForLambdaAtIndex);
                }
                function2.invoke(firAnonymousFunction);
                if (firAnonymousFunction2.getInlineStatus() != InlineStatus.Inline) {
                    return;
                }
            } else {
                if (firAnonymousFunction instanceof FirFunction) {
                    function3.invoke(firAnonymousFunction);
                    return;
                }
                if (firAnonymousFunction instanceof FirTryExpression) {
                    FirElement firElement = (FirElement) CollectionsKt.getOrNull(checkerContext.getContainingElements(), index + 1);
                    if (firElement != null) {
                        function4.invoke(firAnonymousFunction, firElement);
                    }
                } else if (!(firAnonymousFunction instanceof FirProperty) && !(firAnonymousFunction instanceof FirValueParameter)) {
                    if (!(firAnonymousFunction instanceof FirAnonymousObject ? true : firAnonymousFunction instanceof FirAnonymousInitializer) && (firAnonymousFunction instanceof FirDeclaration)) {
                        return;
                    }
                }
            }
        }
    }

    public static /* synthetic */ void visitCurrentScope$default(CheckerContext checkerContext, Function1 function1, Function1 function2, Function1 function3, Function2 function4, int i, Object obj) {
        FirValueParameter firValueParameterFindValueParameterForLambdaAtIndex;
        if ((i & 2) != 0) {
            function2 = new Function1<FirAnonymousFunction, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposableCallCheckerKt.visitCurrentScope.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FirAnonymousFunction firAnonymousFunction) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FirAnonymousFunction firAnonymousFunction) {
                    invoke2(firAnonymousFunction);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function3 = new Function1<FirFunction, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposableCallCheckerKt.visitCurrentScope.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FirFunction firFunction) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FirFunction firFunction) {
                    invoke2(firFunction);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function4 = new Function2<FirTryExpression, FirElement, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.k2.ComposableCallCheckerKt.visitCurrentScope.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FirTryExpression firTryExpression, @NotNull FirElement firElement) {
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(FirTryExpression firTryExpression, FirElement firElement) {
                    invoke2(firTryExpression, firElement);
                    return Unit.INSTANCE;
                }
            };
        }
        for (IndexedValue indexedValue : CollectionsKt.reversed(CollectionsKt.withIndex(checkerContext.getContainingElements()))) {
            int index = indexedValue.getIndex();
            FirAnonymousFunction firAnonymousFunction = (FirElement) indexedValue.component2();
            if (firAnonymousFunction instanceof FirAnonymousFunction) {
                FirAnonymousFunction firAnonymousFunction2 = firAnonymousFunction;
                if (firAnonymousFunction2.getInlineStatus() == InlineStatus.Inline && (firValueParameterFindValueParameterForLambdaAtIndex = findValueParameterForLambdaAtIndex(checkerContext, index)) != null) {
                    function1.invoke(firValueParameterFindValueParameterForLambdaAtIndex);
                }
                function2.invoke(firAnonymousFunction);
                if (firAnonymousFunction2.getInlineStatus() != InlineStatus.Inline) {
                    return;
                }
            } else {
                if (firAnonymousFunction instanceof FirFunction) {
                    function3.invoke(firAnonymousFunction);
                    return;
                }
                if (firAnonymousFunction instanceof FirTryExpression) {
                    FirElement firElement = (FirElement) CollectionsKt.getOrNull(checkerContext.getContainingElements(), index + 1);
                    if (firElement != null) {
                        function4.invoke(firAnonymousFunction, firElement);
                    }
                } else if (!(firAnonymousFunction instanceof FirProperty) && !(firAnonymousFunction instanceof FirValueParameter)) {
                    if (!(firAnonymousFunction instanceof FirAnonymousObject ? true : firAnonymousFunction instanceof FirAnonymousInitializer) && (firAnonymousFunction instanceof FirDeclaration)) {
                        return;
                    }
                }
            }
        }
    }
}
