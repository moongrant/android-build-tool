package androidx.compose.compiler.plugins.kotlin.k2;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.functions.FunctionTypeKind;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0001H\u0016¨\u0006\u0004"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/KComposableFunction;", "Lorg/jetbrains/kotlin/builtins/functions/FunctionTypeKind;", "()V", "nonReflectKind", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KComposableFunction extends FunctionTypeKind {

    @NotNull
    public static final KComposableFunction INSTANCE = new KComposableFunction();

    private KComposableFunction() {
        super(FqName.topLevel(Name.identifier("androidx.compose.runtime.internal")), "KComposableFunction", ComposeClassIds.INSTANCE.getComposable(), true);
    }

    @NotNull
    public FunctionTypeKind nonReflectKind() {
        return ComposableFunction.INSTANCE;
    }
}
