package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.diagnostics.KtDiagnosticFactoryToRendererMap;
import org.jetbrains.kotlin.diagnostics.rendering.BaseDiagnosticRendererFactory;
import org.jetbrains.kotlin.fir.analysis.diagnostics.FirDiagnosticRenderers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposeErrorMessages;", "Lorg/jetbrains/kotlin/diagnostics/rendering/BaseDiagnosticRendererFactory;", "()V", "MAP", "Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactoryToRendererMap;", "getMAP", "()Lorg/jetbrains/kotlin/diagnostics/KtDiagnosticFactoryToRendererMap;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeErrorMessages extends BaseDiagnosticRendererFactory {

    @NotNull
    public static final ComposeErrorMessages INSTANCE = new ComposeErrorMessages();

    @NotNull
    private static final KtDiagnosticFactoryToRendererMap MAP;

    static {
        KtDiagnosticFactoryToRendererMap ktDiagnosticFactoryToRendererMap = new KtDiagnosticFactoryToRendererMap("Compose");
        ComposeErrors composeErrors = ComposeErrors.INSTANCE;
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_INVOCATION(), "@Composable invocations can only happen from the context of a @Composable function");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_EXPECTED(), "Functions which invoke @Composable functions must be marked with the @Composable annotation");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getNONREADONLY_CALL_IN_READONLY_COMPOSABLE(), "Composables marked with @ReadOnlyComposable can only call other @ReadOnlyComposable composables");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCAPTURED_COMPOSABLE_INVOCATION(), "Composable calls are not allowed inside the {0} parameter of {1}", FirDiagnosticRenderers.INSTANCE.getVARIABLE_NAME(), FirDiagnosticRenderers.INSTANCE.getDECLARATION_NAME());
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getILLEGAL_TRY_CATCH_AROUND_COMPOSABLE(), "Try catch is not supported around composable function invocations.");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getMISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION(), "Parameter {0} cannot be inlined inside of lambda argument {1} of {2} without also being annotated with @DisallowComposableCalls", FirDiagnosticRenderers.INSTANCE.getVARIABLE_NAME(), FirDiagnosticRenderers.INSTANCE.getVARIABLE_NAME(), FirDiagnosticRenderers.INSTANCE.getDECLARATION_NAME());
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE(), "Abstract Composable functions cannot have parameters with default values");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_SUSPEND_FUN(), "Composable function cannot be annotated as suspend");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_FUN_MAIN(), "Composable main functions are not currently supported");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_FUNCTION_REFERENCE(), "Function References of @Composable functions are not currently supported");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_PROPERTY_BACKING_FIELD(), "Composable properties are not able to have backing fields");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSABLE_VAR(), "Composable properties are not able to have backing fields");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getCOMPOSE_INVALID_DELEGATE(), "Composable setValue operator is not currently supported.");
        ktDiagnosticFactoryToRendererMap.put(composeErrors.getMISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL(), "Mismatched @Composable annotation between expect and actual declaration");
        MAP = ktDiagnosticFactoryToRendererMap;
    }

    private ComposeErrorMessages() {
    }

    @NotNull
    public KtDiagnosticFactoryToRendererMap getMAP() {
        return MAP;
    }
}
