package p024Oooo00o;

import org.jetbrains.kotlin.diagnostics.rendering.CommonRenderers;
import org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages;
import org.jetbrains.kotlin.diagnostics.rendering.DiagnosticFactoryToRendererMap;
import org.jetbrains.kotlin.diagnostics.rendering.Renderers;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O implements DefaultErrorMessages.Extension {
    public o0O000O() {
        DiagnosticFactoryToRendererMap diagnosticFactoryToRendererMap = new DiagnosticFactoryToRendererMap("Compose");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1337OooO00o, "@Composable invocations can only happen from the context of a @Composable function");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1338OooO0O0, "Functions which invoke @Composable functions must be marked with the @Composable annotation");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1339OooO0OO, "Function References of @Composable functions are not currently supported");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1336OooO, "Composable calls are not allowed inside the {0} parameter of {1}", Renderers.NAME, Renderers.COMPACT);
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1345OooOO0, "Parameter {0} cannot be inlined inside of lambda argument {1} of {2} without also being annotated with @DisallowComposableCalls", Renderers.NAME, Renderers.NAME, Renderers.NAME);
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1346OooOO0O, "Composables marked with @ReadOnlyComposable can only call other @ReadOnlyComposable composables");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1340OooO0Oo, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1347OooOO0o, "Conflicting overloads: {0}", CommonRenderers.commaSeparated(Renderers.FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS));
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1342OooO0o0, "Composable properties are not able to have backing fields");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1341OooO0o, "Composable function cannot be annotated as suspend");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1343OooO0oO, "Abstract Composable functions cannot have parameters with default values");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1344OooO0oo, "Composable main functions are not currently supported");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1349OooOOO0, "Try catch is not supported around composable function invocations.");
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1348OooOOO, "Type inference failed. Expected type mismatch: inferred type is {1} but {0} was expected", Renderers.RENDER_TYPE_WITH_ANNOTATIONS, Renderers.RENDER_TYPE_WITH_ANNOTATIONS);
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1350OooOOOO, "Calling a {0} composable function where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1351OooOOOo, "A {0} composable parameter was provided where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        diagnosticFactoryToRendererMap.put(o0OoOoOo.f1352OooOOo0, "The composition target of an override must match the ancestor target");
    }
}
