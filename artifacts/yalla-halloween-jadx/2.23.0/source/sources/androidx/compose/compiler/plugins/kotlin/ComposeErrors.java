package androidx.compose.compiler.plugins.kotlin;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.com.intellij.psi.PsiElement;
import org.jetbrains.kotlin.descriptors.CallableDescriptor;
import org.jetbrains.kotlin.descriptors.DeclarationDescriptor;
import org.jetbrains.kotlin.descriptors.ValueParameterDescriptor;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory0;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory1;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory2;
import org.jetbrains.kotlin.diagnostics.DiagnosticFactory3;
import org.jetbrains.kotlin.diagnostics.Errors;
import org.jetbrains.kotlin.diagnostics.PositioningStrategies;
import org.jetbrains.kotlin.diagnostics.Severity;
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression;
import org.jetbrains.kotlin.psi.KtExpression;
import org.jetbrains.kotlin.types.KotlinType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010\n\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010\u0015\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010\u0017\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000RH\u0010\u001c\u001a:\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001e0\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001e0\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001f0\u001f0\u001d8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010!\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\"0\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010#0#\u0012\f\u0012\n \u0006*\u0004\u0018\u00010#0#0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/ComposeErrors;", "", "()V", "ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory0;", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "kotlin.jvm.PlatformType", "CALLED_IN_INCORRECT_CONTEXT", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory1;", "", "CAPTURED_COMPOSABLE_INVOCATION", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory2;", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "COMPOSABLE_EXPECTED", "COMPOSABLE_FUNCTION_REFERENCE", "Lorg/jetbrains/kotlin/psi/KtCallableReferenceExpression;", "COMPOSABLE_FUN_MAIN", "COMPOSABLE_INVOCATION", "COMPOSABLE_PROPERTY_BACKING_FIELD", "COMPOSABLE_SUSPEND_FUN", "COMPOSABLE_VAR", "COMPOSE_APPLIER_CALL_MISMATCH", "COMPOSE_APPLIER_DECLARATION_MISMATCH", "COMPOSE_APPLIER_PARAMETER_MISMATCH", "COMPOSE_INVALID_DELEGATE", "CONFLICTING_OVERLOADS", "", "ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE", "MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory3;", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "NONREADONLY_CALL_IN_READONLY_COMPOSABLE", "TYPE_MISMATCH", "Lorg/jetbrains/kotlin/psi/KtExpression;", "Lorg/jetbrains/kotlin/types/KotlinType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeErrors {

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE;

    @JvmField
    @NotNull
    public static final DiagnosticFactory1<PsiElement, String> CALLED_IN_INCORRECT_CONTEXT;

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<PsiElement, DeclarationDescriptor, DeclarationDescriptor> CAPTURED_COMPOSABLE_INVOCATION;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_EXPECTED;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<KtCallableReferenceExpression> COMPOSABLE_FUNCTION_REFERENCE;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_FUN_MAIN;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_INVOCATION;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_PROPERTY_BACKING_FIELD;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_SUSPEND_FUN;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_VAR;

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<PsiElement, String, String> COMPOSE_APPLIER_CALL_MISMATCH;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSE_APPLIER_DECLARATION_MISMATCH;

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<PsiElement, String, String> COMPOSE_APPLIER_PARAMETER_MISMATCH;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSE_INVALID_DELEGATE;

    @JvmField
    @NotNull
    public static DiagnosticFactory1<PsiElement, Collection<DeclarationDescriptor>> CONFLICTING_OVERLOADS;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE;

    @NotNull
    public static final ComposeErrors INSTANCE = new ComposeErrors();

    @JvmField
    @NotNull
    public static final DiagnosticFactory3<PsiElement, ValueParameterDescriptor, ValueParameterDescriptor, CallableDescriptor> MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION;

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> NONREADONLY_CALL_IN_READONLY_COMPOSABLE;

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<KtExpression, KotlinType, KotlinType> TYPE_MISMATCH;

    static {
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSABLE_INVOCATION = diagnosticFactory0Create;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create2 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create2, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSABLE_EXPECTED = diagnosticFactory0Create2;
        DiagnosticFactory0<KtCallableReferenceExpression> diagnosticFactory0Create3 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create3, "create<KtCallableReferen… Severity.ERROR\n        )");
        COMPOSABLE_FUNCTION_REFERENCE = diagnosticFactory0Create3;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create4 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create4, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSABLE_PROPERTY_BACKING_FIELD = diagnosticFactory0Create4;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create5 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create5, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSABLE_VAR = diagnosticFactory0Create5;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create6 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create6, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSABLE_SUSPEND_FUN = diagnosticFactory0Create6;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create7 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create7, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE = diagnosticFactory0Create7;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create8 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create8, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSABLE_FUN_MAIN = diagnosticFactory0Create8;
        DiagnosticFactory2<PsiElement, DeclarationDescriptor, DeclarationDescriptor> diagnosticFactory2Create = DiagnosticFactory2.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory2Create, "create<PsiElement, Decla… Severity.ERROR\n        )");
        CAPTURED_COMPOSABLE_INVOCATION = diagnosticFactory2Create;
        DiagnosticFactory1<PsiElement, String> diagnosticFactory1Create = DiagnosticFactory1.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory1Create, "create<PsiElement, Strin… Severity.ERROR\n        )");
        CALLED_IN_INCORRECT_CONTEXT = diagnosticFactory1Create;
        DiagnosticFactory3<PsiElement, ValueParameterDescriptor, ValueParameterDescriptor, CallableDescriptor> diagnosticFactory3Create = DiagnosticFactory3.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory3Create, "create<\n            PsiE… Severity.ERROR\n        )");
        MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION = diagnosticFactory3Create;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create9 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create9, "create<PsiElement>(\n        Severity.ERROR\n    )");
        NONREADONLY_CALL_IN_READONLY_COMPOSABLE = diagnosticFactory0Create9;
        DiagnosticFactory1<PsiElement, Collection<DeclarationDescriptor>> diagnosticFactory1Create2 = DiagnosticFactory1.create(Severity.ERROR, PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory1Create2, "create(\n            Seve…TURE_OR_DEFAULT\n        )");
        CONFLICTING_OVERLOADS = diagnosticFactory1Create2;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create10 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create10, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE = diagnosticFactory0Create10;
        DiagnosticFactory2<KtExpression, KotlinType, KotlinType> diagnosticFactory2Create2 = DiagnosticFactory2.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory2Create2, "create<KtExpression, Kot… Severity.ERROR\n        )");
        TYPE_MISMATCH = diagnosticFactory2Create2;
        DiagnosticFactory2<PsiElement, String, String> diagnosticFactory2Create3 = DiagnosticFactory2.create(Severity.WARNING);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory2Create3, "create<PsiElement, Strin…everity.WARNING\n        )");
        COMPOSE_APPLIER_CALL_MISMATCH = diagnosticFactory2Create3;
        DiagnosticFactory2<PsiElement, String, String> diagnosticFactory2Create4 = DiagnosticFactory2.create(Severity.WARNING);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory2Create4, "create<PsiElement, Strin…everity.WARNING\n        )");
        COMPOSE_APPLIER_PARAMETER_MISMATCH = diagnosticFactory2Create4;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create11 = DiagnosticFactory0.create(Severity.WARNING);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create11, "create<PsiElement>(\n    …everity.WARNING\n        )");
        COMPOSE_APPLIER_DECLARATION_MISMATCH = diagnosticFactory0Create11;
        DiagnosticFactory0<PsiElement> diagnosticFactory0Create12 = DiagnosticFactory0.create(Severity.ERROR);
        Intrinsics.checkNotNullExpressionValue(diagnosticFactory0Create12, "create<PsiElement>(\n    … Severity.ERROR\n        )");
        COMPOSE_INVALID_DELEGATE = diagnosticFactory0Create12;
        Errors.Initializer.initializeFactoryNamesAndDefaultErrorMessages(ComposeErrors.class, new ComposeErrorMessages());
    }

    private ComposeErrors() {
    }
}
