package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.Open;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0012\u001a\u00020\u0013R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0004\u001d\u001e\u001f ¨\u0006!"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;)V", "name", "", "getName", "()Ljava/lang/String;", "schemeIsUpdatable", "", "getSchemeIsUpdatable", "()Z", "getTransformer", "()Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "isOverlyWide", "recordScheme", "", "scheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "toDeclaredScheme", "defaultTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "updateScheme", "updatedAnnotations", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "annotations", "target", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionCallType;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionDeclaration;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionParameter;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionType;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class InferenceFunction {

    @NotNull
    private final ComposableTargetAnnotationsTransformer transformer;

    public /* synthetic */ InferenceFunction(ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, DefaultConstructorMarker defaultConstructorMarker) {
        this(composableTargetAnnotationsTransformer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Scheme toDeclaredScheme$default(InferenceFunction inferenceFunction, Item item, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDeclaredScheme");
        }
        if ((i & 1) != 0) {
            item = new Open(0, 0 == true ? 1 : 0, 2, null);
        }
        return inferenceFunction.toDeclaredScheme(item);
    }

    @NotNull
    public abstract String getName();

    public abstract boolean getSchemeIsUpdatable();

    @NotNull
    public final ComposableTargetAnnotationsTransformer getTransformer() {
        return this.transformer;
    }

    public boolean isOverlyWide() {
        return false;
    }

    public void recordScheme(@NotNull Scheme scheme) {
    }

    @NotNull
    public abstract Scheme toDeclaredScheme(@NotNull Item defaultTarget);

    public abstract void updateScheme(@NotNull Scheme scheme);

    @NotNull
    public final List<IrConstructorCall> updatedAnnotations(@NotNull List<? extends IrConstructorCall> annotations, @NotNull Item target) {
        return this.transformer.updatedAnnotations(annotations, target);
    }

    private InferenceFunction(ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer) {
        this.transformer = composableTargetAnnotationsTransformer;
    }

    @NotNull
    public final List<IrConstructorCall> updatedAnnotations(@NotNull List<? extends IrConstructorCall> annotations, @NotNull Scheme scheme) {
        return this.transformer.updatedAnnotations(annotations, scheme);
    }
}
