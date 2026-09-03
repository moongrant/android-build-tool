package androidx.compose.compiler.plugins.kotlin.k1;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.diagnostics.rendering.CommonRenderers;
import org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages;
import org.jetbrains.kotlin.diagnostics.rendering.DiagnosticFactoryToRendererMap;
import org.jetbrains.kotlin.diagnostics.rendering.Renderers;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k1/ComposeErrorMessages;", "Lorg/jetbrains/kotlin/diagnostics/rendering/DefaultErrorMessages$Extension;", "()V", "MAP", "Lorg/jetbrains/kotlin/diagnostics/rendering/DiagnosticFactoryToRendererMap;", "getMap", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeErrorMessages implements DefaultErrorMessages.Extension {

    @NotNull
    private final DiagnosticFactoryToRendererMap MAP;

    public ComposeErrorMessages() {
        DiagnosticFactoryToRendererMap diagnosticFactoryToRendererMap = new DiagnosticFactoryToRendererMap("Compose");
        this.MAP = diagnosticFactoryToRendererMap;
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_INVOCATION, "@Composable invocations can only happen from the context of a @Composable function");
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_EXPECTED, "Functions which invoke @Composable functions must be marked with the @Composable annotation");
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_FUNCTION_REFERENCE, "Function References of @Composable functions are not currently supported");
        diagnosticFactoryToRendererMap.put(ComposeErrors.CAPTURED_COMPOSABLE_INVOCATION, "Composable calls are not allowed inside the {0} parameter of {1}", Renderers.NAME, Renderers.COMPACT);
        diagnosticFactoryToRendererMap.put(ComposeErrors.MISSING_DISALLOW_COMPOSABLE_CALLS_ANNOTATION, "Parameter {0} cannot be inlined inside of lambda argument {1} of {2} without also being annotated with @DisallowComposableCalls", Renderers.NAME, Renderers.NAME, Renderers.NAME);
        diagnosticFactoryToRendererMap.put(ComposeErrors.NONREADONLY_CALL_IN_READONLY_COMPOSABLE, "Composables marked with @ReadOnlyComposable can only call other @ReadOnlyComposable composables");
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_PROPERTY_BACKING_FIELD, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(ComposeErrors.CONFLICTING_OVERLOADS, "@Composable annotation mismatch with overridden function: {0}", CommonRenderers.commaSeparated(Renderers.FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS));
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_VAR, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_SUSPEND_FUN, "Composable function cannot be annotated as suspend");
        diagnosticFactoryToRendererMap.put(ComposeErrors.ABSTRACT_COMPOSABLE_DEFAULT_PARAMETER_VALUE, "Abstract Composable functions cannot have parameters with default values");
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSABLE_FUN_MAIN, "Composable main functions are not currently supported");
        diagnosticFactoryToRendererMap.put(ComposeErrors.ILLEGAL_TRY_CATCH_AROUND_COMPOSABLE, "Try catch is not supported around composable function invocations.");
        diagnosticFactoryToRendererMap.put(ComposeErrors.TYPE_MISMATCH, "Type inference failed. Expected type mismatch: inferred type is {1} but {0} was expected", Renderers.RENDER_TYPE_WITH_ANNOTATIONS, Renderers.RENDER_TYPE_WITH_ANNOTATIONS);
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSE_APPLIER_CALL_MISMATCH, "Calling a {0} composable function where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSE_APPLIER_PARAMETER_MISMATCH, "A {0} composable parameter was provided where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSE_APPLIER_DECLARATION_MISMATCH, "The composition target of an override must match the ancestor target");
        diagnosticFactoryToRendererMap.put(ComposeErrors.COMPOSE_INVALID_DELEGATE, "Composable setValue operator is not currently supported.");
        diagnosticFactoryToRendererMap.put(ComposeErrors.MISMATCHED_COMPOSABLE_IN_EXPECT_ACTUAL, "Mismatched @Composable annotation between expect and actual declaration");
        diagnosticFactoryToRendererMap.put(ComposeErrors.REDUNDANT_COMPOSABLE_ANNOTATION, "Invalid `@Composable` annotation on inline lambda. This will become an error in Kotlin 2.0.");
        diagnosticFactoryToRendererMap.put(ComposeErrors.NAMED_ARGUMENTS_NOT_ALLOWED, "Named arguments in composable function types are deprecated. This will become an error in Kotlin 2.0");
    }

    @NotNull
    /* JADX INFO: renamed from: getMap, reason: from getter */
    public DiagnosticFactoryToRendererMap getMAP() {
        return this.MAP;
    }
}
