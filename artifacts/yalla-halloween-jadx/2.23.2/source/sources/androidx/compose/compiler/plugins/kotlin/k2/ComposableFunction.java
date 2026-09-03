package androidx.compose.compiler.plugins.kotlin.k2;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.functions.FunctionTypeKind;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0001H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/k2/ComposableFunction;", "Lorg/jetbrains/kotlin/builtins/functions/FunctionTypeKind;", "()V", "prefixForTypeRender", "", "getPrefixForTypeRender", "()Ljava/lang/String;", "reflectKind", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableFunction extends FunctionTypeKind {

    @NotNull
    public static final ComposableFunction INSTANCE = new ComposableFunction();

    private ComposableFunction() {
        super(FqName.topLevel(Name.identifier("androidx.compose.runtime.internal")), "ComposableFunction", ComposeClassIds.INSTANCE.getComposable(), false);
    }

    @NotNull
    public String getPrefixForTypeRender() {
        return "@Composable";
    }

    @NotNull
    public FunctionTypeKind reflectKind() {
        return KComposableFunction.INSTANCE;
    }
}
