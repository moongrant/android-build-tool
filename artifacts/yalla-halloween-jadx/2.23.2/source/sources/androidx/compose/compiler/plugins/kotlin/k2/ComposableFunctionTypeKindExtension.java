package androidx.compose.compiler.plugins.kotlin.k2;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.fir.FirSession;
import org.jetbrains.kotlin.fir.extensions.FirFunctionTypeKindExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposableFunctionTypeKindExtension;", "Lorg/jetbrains/kotlin/fir/extensions/FirFunctionTypeKindExtension;", "session", "Lorg/jetbrains/kotlin/fir/FirSession;", "(Lorg/jetbrains/kotlin/fir/FirSession;)V", "registerKinds", "", "Lorg/jetbrains/kotlin/fir/extensions/FirFunctionTypeKindExtension$FunctionTypeKindRegistrar;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableFunctionTypeKindExtension extends FirFunctionTypeKindExtension {
    public ComposableFunctionTypeKindExtension(@NotNull FirSession firSession) {
        super(firSession);
    }

    public void registerKinds(@NotNull FirFunctionTypeKindExtension.FunctionTypeKindRegistrar functionTypeKindRegistrar) {
        functionTypeKindRegistrar.registerKind(ComposableFunction.INSTANCE, KComposableFunction.INSTANCE);
    }
}
