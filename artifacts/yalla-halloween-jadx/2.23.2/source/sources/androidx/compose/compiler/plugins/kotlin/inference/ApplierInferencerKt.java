package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0082\b¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"getOrPut", "Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "Node", "Landroidx/compose/compiler/plugins/kotlin/inference/LazySchemeStorage;", "node", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/Function0;", "(Landroidx/compose/compiler/plugins/kotlin/inference/LazySchemeStorage;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Landroidx/compose/compiler/plugins/kotlin/inference/LazyScheme;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ApplierInferencerKt {
    private static final <Node> LazyScheme getOrPut(LazySchemeStorage<Node> lazySchemeStorage, Node node, Function0<LazyScheme> function0) {
        LazyScheme lazyScheme = lazySchemeStorage.getLazyScheme(node);
        if (lazyScheme != null) {
            return lazyScheme;
        }
        LazyScheme lazySchemeInvoke = function0.invoke();
        lazySchemeStorage.storeLazyScheme(node, lazySchemeInvoke);
        return lazySchemeInvoke;
    }
}
