package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.diagnostics.AbstractSourceElementPositioningStrategy;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory0DelegateProvider;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory2DelegateProvider;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory3DelegateProvider;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticFactory0;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticFactory2;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticFactory3;
import org.jetbrains.kotlin.diagnostics.Severity;
import org.jetbrains.kotlin.diagnostics.SourceElementPositioningStrategies;
import org.jetbrains.kotlin.diagnostics.rendering.RootDiagnosticRendererFactory;
import org.jetbrains.kotlin.fir.symbols.impl.FirCallableSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirValueParameterSymbol;
import org.jetbrains.kotlin.fir.symbols.impl.FirVariableSymbol;
import org.jetbrains.kotlin.psi.KtTryExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R/\u0010\t\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0011\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0014\u0010\u0006R\u001b\u0010\u0016\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R\u001b\u0010\u0019\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001a\u0010\u0006R\u001b\u0010\u001c\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001d\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b \u0010\u0006R\u001b\u0010\"\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u0006R\u001b\u0010%\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b&\u0010\u0006R\u001b\u0010(\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b)\u0010\u0006R\u001b\u0010+\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b,\u0010\u0006R1\u0010.\u001a\u0018\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000200\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b5\u0010\u0006¨\u00067"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposeErrors;", "", "()V", "ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE", "Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", "getABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE", "()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", "ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE$delegate", "Lkotlin/properties/ReadOnlyProperty;", "CAPTURED_COMPOSABLE_INVOCATION", "Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory2;", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirVariableSymbol;", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirCallableSymbol;", "getCAPTURED_COMPOSABLE_INVOCATION", "()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory2;", "CAPTURED_COMPOSABLE_INVOCATION$delegate", "COMPOSABLE_EXPECTED", "getCOMPOSABLE_EXPECTED", "COMPOSABLE_EXPECTED$delegate", "COMPOSABLE_FUNCTION_REFERENCE", "getCOMPOSABLE_FUNCTION_REFERENCE", "COMPOSABLE_FUNCTION_REFERENCE$delegate", "COMPOSABLE_FUN_MAIN", "getCOMPOSABLE_FUN_MAIN", "COMPOSABLE_FUN_MAIN$delegate", "COMPOSABLE_INVOCATION", "getCOMPOSABLE_INVOCATION", "COMPOSABLE_INVOCATION$delegate", "COMPOSABLE_PROPERTY_BACKING_FIELD", "getCOMPOSABLE_PROPERTY_BACKING_FIELD", "COMPOSABLE_PROPERTY_BACKING_FIELD$delegate", "COMPOSABLE_SUSPEND_FUN", "getCOMPOSABLE_SUSPEND_FUN", "COMPOSABLE_SUSPEND_FUN$delegate", "COMPOSABLE_VAR", "getCOMPOSABLE_VAR", "COMPOSABLE_VAR$delegate", "COMPOSE_INVALID_DELEGATE", "getCOMPOSE_INVALID_DELEGATE", "COMPOSE_INVALID_DELEGATE$delegate", "ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE", "getILLEGAL_TRY_CATCH_AROUND_COMPOSABLE", "ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE$delegate", "MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL", "getMISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL", "MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL$delegate", "MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION", "Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory3;", "Lorg/jetbrains/kotlin/fir/symbols/impl/FirValueParameterSymbol;", "getMISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION", "()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory3;", "MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION$delegate", "NONREADONLY_CALL_IN_READONLY_COMPOSABLE", "getNONREADONLY_CALL_IN_READONLY_COMPOSABLE", "NONREADONLY_CALL_IN_READONLY_COMPOSABLE$delegate", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeErrors.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposeErrors\n+ 2 KtDiagnosticFactoryDsl.kt\norg/jetbrains/kotlin/diagnostics/KtDiagnosticFactoryDslKt\n*L\n1#1,143:1\n44#2,4:144\n47#2:148\n44#2,4:149\n56#2,4:153\n47#2:157\n62#2,4:158\n44#2,4:162\n47#2:166\n47#2:167\n44#2,4:168\n47#2:172\n47#2:173\n47#2:174\n47#2:175\n*S KotlinDebug\n*F\n+ 1 ComposeErrors.kt\nandroidx/compose/compiler/plugins/kotlin/k2/ComposeErrors\n*L\n44#1:144,4\n47#1:148\n51#1:149,4\n54#1:153,4\n58#1:157\n62#1:158,4\n68#1:162,4\n70#1:166\n74#1:167\n78#1:168,4\n80#1:172\n84#1:173\n86#1:174\n90#1:175\n*E\n"})
public final class ComposeErrors {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    /* JADX INFO: renamed from: ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE;

    /* JADX INFO: renamed from: CAPTURED_COMPOSABLE_INVOCATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty CAPTURED_COMPOSABLE_INVOCATION;

    /* JADX INFO: renamed from: COMPOSABLE_EXPECTED$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_EXPECTED;

    /* JADX INFO: renamed from: COMPOSABLE_FUNCTION_REFERENCE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_FUNCTION_REFERENCE;

    /* JADX INFO: renamed from: COMPOSABLE_FUN_MAIN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_FUN_MAIN;

    /* JADX INFO: renamed from: COMPOSABLE_INVOCATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_INVOCATION;

    /* JADX INFO: renamed from: COMPOSABLE_PROPERTY_BACKING_FIELD$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_PROPERTY_BACKING_FIELD;

    /* JADX INFO: renamed from: COMPOSABLE_SUSPEND_FUN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_SUSPEND_FUN;

    /* JADX INFO: renamed from: COMPOSABLE_VAR$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSABLE_VAR;

    /* JADX INFO: renamed from: COMPOSE_INVALID_DELEGATE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty COMPOSE_INVALID_DELEGATE;

    /* JADX INFO: renamed from: ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE;

    @NotNull
    public static final ComposeErrors INSTANCE;

    /* JADX INFO: renamed from: MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL;

    /* JADX INFO: renamed from: MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION;

    /* JADX INFO: renamed from: NONREADONLY_CALL_IN_READONLY_COMPOSABLE$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadOnlyProperty NONREADONLY_CALL_IN_READONLY_COMPOSABLE;

    static {
        KProperty<Object>[] kPropertyArr = {OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_INVOCATION", "getCOMPOSABLE_INVOCATION()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_EXPECTED", "getCOMPOSABLE_EXPECTED()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "NONREADONLY_CALL_IN_READONLY_COMPOSABLE", "getNONREADONLY_CALL_IN_READONLY_COMPOSABLE()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "CAPTURED_COMPOSABLE_INVOCATION", "getCAPTURED_COMPOSABLE_INVOCATION()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory2;", 0), OooO00o.OooO00o(ComposeErrors.class, "ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE", "getILLEGAL_TRY_CATCH_AROUND_COMPOSABLE()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION", "getMISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory3;", 0), OooO00o.OooO00o(ComposeErrors.class, "ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE", "getABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_SUSPEND_FUN", "getCOMPOSABLE_SUSPEND_FUN()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_FUN_MAIN", "getCOMPOSABLE_FUN_MAIN()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_FUNCTION_REFERENCE", "getCOMPOSABLE_FUNCTION_REFERENCE()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_PROPERTY_BACKING_FIELD", "getCOMPOSABLE_PROPERTY_BACKING_FIELD()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSABLE_VAR", "getCOMPOSABLE_VAR()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "COMPOSE_INVALID_DELEGATE", "getCOMPOSE_INVALID_DELEGATE()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0), OooO00o.OooO00o(ComposeErrors.class, "MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL", "getMISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactory0;", 0)};
        $$delegatedProperties = kPropertyArr;
        ComposeErrors composeErrors = new ComposeErrors();
        INSTANCE = composeErrors;
        COMPOSABLE_INVOCATION = new DiagnosticFactory0DelegateProvider(Severity.ERROR, AbstractSourceElementPositioningStrategy.Companion.getDEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[0]);
        COMPOSABLE_EXPECTED = new DiagnosticFactory0DelegateProvider(Severity.ERROR, SourceElementPositioningStrategies.INSTANCE.getDECLARATION_NAME(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[1]);
        NONREADONLY_CALL_IN_READONLY_COMPOSABLE = new DiagnosticFactory0DelegateProvider(Severity.ERROR, AbstractSourceElementPositioningStrategy.Companion.getDEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[2]);
        CAPTURED_COMPOSABLE_INVOCATION = new DiagnosticFactory2DelegateProvider(Severity.ERROR, AbstractSourceElementPositioningStrategy.Companion.getDEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[3]);
        ComposeSourceElementPositioningStrategies composeSourceElementPositioningStrategies = ComposeSourceElementPositioningStrategies.INSTANCE;
        ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE = new DiagnosticFactory0DelegateProvider(Severity.ERROR, composeSourceElementPositioningStrategies.getTRY_KEYWORD(), Reflection.getOrCreateKotlinClass(KtTryExpression.class)).provideDelegate(composeErrors, kPropertyArr[4]);
        MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION = new DiagnosticFactory3DelegateProvider(Severity.ERROR, AbstractSourceElementPositioningStrategy.Companion.getDEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[5]);
        ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE = new DiagnosticFactory0DelegateProvider(Severity.ERROR, AbstractSourceElementPositioningStrategy.Companion.getDEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[6]);
        COMPOSABLE_SUSPEND_FUN = new DiagnosticFactory0DelegateProvider(Severity.ERROR, SourceElementPositioningStrategies.INSTANCE.getDECLARATION_NAME(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[7]);
        COMPOSABLE_FUN_MAIN = new DiagnosticFactory0DelegateProvider(Severity.ERROR, SourceElementPositioningStrategies.INSTANCE.getDECLARATION_NAME(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[8]);
        COMPOSABLE_FUNCTION_REFERENCE = new DiagnosticFactory0DelegateProvider(Severity.ERROR, AbstractSourceElementPositioningStrategy.Companion.getDEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[9]);
        COMPOSABLE_PROPERTY_BACKING_FIELD = new DiagnosticFactory0DelegateProvider(Severity.ERROR, SourceElementPositioningStrategies.INSTANCE.getDECLARATION_NAME(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[10]);
        COMPOSABLE_VAR = new DiagnosticFactory0DelegateProvider(Severity.ERROR, SourceElementPositioningStrategies.INSTANCE.getDECLARATION_NAME(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[11]);
        COMPOSE_INVALID_DELEGATE = new DiagnosticFactory0DelegateProvider(Severity.ERROR, composeSourceElementPositioningStrategies.getDECLARATION_NAME_OR_DEFAULT(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[12]);
        MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL = new DiagnosticFactory0DelegateProvider(Severity.ERROR, SourceElementPositioningStrategies.INSTANCE.getDECLARATION_NAME(), Reflection.getOrCreateKotlinClass(PsiElement.class)).provideDelegate(composeErrors, kPropertyArr[13]);
        RootDiagnosticRendererFactory.INSTANCE.registerFactory(ComposeErrorMessages.INSTANCE);
    }

    private ComposeErrors() {
    }

    @NotNull
    public final KtDiagnosticFactory0 getABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE() {
        return (KtDiagnosticFactory0) ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE.getValue(this, $$delegatedProperties[6]);
    }

    @NotNull
    public final KtDiagnosticFactory2<FirVariableSymbol<?>, FirCallableSymbol<?>> getCAPTURED_COMPOSABLE_INVOCATION() {
        return (KtDiagnosticFactory2) CAPTURED_COMPOSABLE_INVOCATION.getValue(this, $$delegatedProperties[3]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_EXPECTED() {
        return (KtDiagnosticFactory0) COMPOSABLE_EXPECTED.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_FUNCTION_REFERENCE() {
        return (KtDiagnosticFactory0) COMPOSABLE_FUNCTION_REFERENCE.getValue(this, $$delegatedProperties[9]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_FUN_MAIN() {
        return (KtDiagnosticFactory0) COMPOSABLE_FUN_MAIN.getValue(this, $$delegatedProperties[8]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_INVOCATION() {
        return (KtDiagnosticFactory0) COMPOSABLE_INVOCATION.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_PROPERTY_BACKING_FIELD() {
        return (KtDiagnosticFactory0) COMPOSABLE_PROPERTY_BACKING_FIELD.getValue(this, $$delegatedProperties[10]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_SUSPEND_FUN() {
        return (KtDiagnosticFactory0) COMPOSABLE_SUSPEND_FUN.getValue(this, $$delegatedProperties[7]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSABLE_VAR() {
        return (KtDiagnosticFactory0) COMPOSABLE_VAR.getValue(this, $$delegatedProperties[11]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getCOMPOSE_INVALID_DELEGATE() {
        return (KtDiagnosticFactory0) COMPOSE_INVALID_DELEGATE.getValue(this, $$delegatedProperties[12]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getILLEGAL_TRY_CATCH_AROUND_COMPOSABLE() {
        return (KtDiagnosticFactory0) ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE.getValue(this, $$delegatedProperties[4]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getMISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL() {
        return (KtDiagnosticFactory0) MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL.getValue(this, $$delegatedProperties[13]);
    }

    @NotNull
    public final KtDiagnosticFactory3<FirValueParameterSymbol, FirValueParameterSymbol, FirCallableSymbol<?>> getMISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION() {
        return (KtDiagnosticFactory3) MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION.getValue(this, $$delegatedProperties[5]);
    }

    @NotNull
    public final KtDiagnosticFactory0 getNONREADONLY_CALL_IN_READONLY_COMPOSABLE() {
        return (KtDiagnosticFactory0) NONREADONLY_CALL_IN_READONLY_COMPOSABLE.getValue(this, $$delegatedProperties[2]);
    }
}
