package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.types.IrType;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionType;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/types/IrType;)V", "name", "", "getName", "()Ljava/lang/String;", "schemeIsUpdatable", "", "getSchemeIsUpdatable", "()Z", "toDeclaredScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "defaultTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "updateScheme", "", "scheme", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InferenceFunctionType extends InferenceFunction {

    @NotNull
    private final IrType type;

    public InferenceFunctionType(@NotNull ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, @NotNull IrType irType) {
        super(composableTargetAnnotationsTransformer, null);
        this.type = irType;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public String getName() {
        return "<type>";
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public boolean getSchemeIsUpdatable() {
        return false;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public Scheme toDeclaredScheme(@NotNull Item defaultTarget) {
        return getTransformer().toScheme(this.type, defaultTarget);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public void updateScheme(@NotNull Scheme scheme) {
    }
}
