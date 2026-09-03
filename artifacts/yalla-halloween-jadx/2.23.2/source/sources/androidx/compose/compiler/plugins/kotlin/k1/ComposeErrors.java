package androidx.compose.compiler.plugins.kotlin.k1;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
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
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R,\u0010\u0007\u001a\u001e\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010\n\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\f0\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f0\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010\u0015\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010\u0017\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\t0\t0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000RH\u0010\u001d\u001a:\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001f0\u001f\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001f0\u001f\u0012\f\u0012\n \u0006*\u0004\u0018\u00010 0 0\u001e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010!\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R:\u0010$\u001a,\u0012\f\u0012\n \u0006*\u0004\u0018\u00010%0%\u0012\f\u0012\n \u0006*\u0004\u0018\u00010&0&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010&0&0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposeErrors;", "", "()V", "ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory0;", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "kotlin.jvm.PlatformType", "CALLED_IN_INCORRECT_CONTEXT", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory1;", "", "CAPTURED_COMPOSABLE_INVOCATION", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory2;", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "COMPOSABLE_EXPECTED", "COMPOSABLE_FUNCTION_REFERENCE", "Lorg/jetbrains/kotlin/psi/KtCallableReferenceExpression;", "COMPOSABLE_FUN_MAIN", "COMPOSABLE_INVOCATION", "COMPOSABLE_PROPERTY_BACKING_FIELD", "COMPOSABLE_SUSPEND_FUN", "COMPOSABLE_VAR", "COMPOSE_APPLIER_CALL_MISMATCH", "COMPOSE_APPLIER_DECLARATION_MISMATCH", "COMPOSE_APPLIER_PARAMETER_MISMATCH", "COMPOSE_INVALID_DELEGATE", "CONFLICTING_OVERLOADS", "", "ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE", "MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL", "MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory3;", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "NAMED_ARGUMENTS_NOT_ALLOWED", "NONREADONLY_CALL_IN_READONLY_COMPOSABLE", "REDUNDANT_COMPOSABLE_ANNOTATION", "TYPE_MISMATCH", "Lorg/jetbrains/kotlin/psi/KtExpression;", "Lorg/jetbrains/kotlin/types/KotlinType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeErrors {

    @NotNull
    public static final ComposeErrors INSTANCE = new ComposeErrors();

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_INVOCATION = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_EXPECTED = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<KtCallableReferenceExpression> COMPOSABLE_FUNCTION_REFERENCE = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_PROPERTY_BACKING_FIELD = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_VAR = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_SUSPEND_FUN = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSABLE_FUN_MAIN = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<PsiElement, DeclarationDescriptor, DeclarationDescriptor> CAPTURED_COMPOSABLE_INVOCATION = DiagnosticFactory2.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory1<PsiElement, String> CALLED_IN_INCORRECT_CONTEXT = DiagnosticFactory1.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory3<PsiElement, ValueParameterDescriptor, ValueParameterDescriptor, CallableDescriptor> MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION = DiagnosticFactory3.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> NONREADONLY_CALL_IN_READONLY_COMPOSABLE = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory1<PsiElement, Collection<DeclarationDescriptor>> CONFLICTING_OVERLOADS = DiagnosticFactory1.create(Severity.ERROR, PositioningStrategies.DECLARATION_SIGNATURE_OR_DEFAULT);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<KtExpression, KotlinType, KotlinType> TYPE_MISMATCH = DiagnosticFactory2.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<PsiElement, String, String> COMPOSE_APPLIER_CALL_MISMATCH = DiagnosticFactory2.create(Severity.WARNING);

    @JvmField
    @NotNull
    public static final DiagnosticFactory2<PsiElement, String, String> COMPOSE_APPLIER_PARAMETER_MISMATCH = DiagnosticFactory2.create(Severity.WARNING);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSE_APPLIER_DECLARATION_MISMATCH = DiagnosticFactory0.create(Severity.WARNING);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> COMPOSE_INVALID_DELEGATE = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> NAMED_ARGUMENTS_NOT_ALLOWED = DiagnosticFactory0.create(Severity.WARNING);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL = DiagnosticFactory0.create(Severity.ERROR);

    @JvmField
    @NotNull
    public static final DiagnosticFactory0<PsiElement> REDUNDANT_COMPOSABLE_ANNOTATION = DiagnosticFactory0.create(Severity.WARNING);

    static {
        Errors.Initializer.initializeFactoryNamesAndDefaultErrorMessages(ComposeErrors.class, new ComposeErrorMessages());
    }

    private ComposeErrors() {
    }
}
