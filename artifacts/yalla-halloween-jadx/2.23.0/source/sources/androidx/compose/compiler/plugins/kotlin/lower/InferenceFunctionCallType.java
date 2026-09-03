package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionCallType;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "call", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/expressions/IrCall;)V", "name", "", "getName", "()Ljava/lang/String;", "schemeIsUpdatable", "", "getSchemeIsUpdatable", "()Z", "isOverlyWide", "toDeclaredScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "defaultTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "updateScheme", "", "scheme", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionCallType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1104:1\n766#2:1105\n857#2,2:1106\n1549#2:1108\n1620#2,3:1109\n*S KotlinDebug\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionCallType\n*L\n746#1:1105\n746#1:1106,2\n748#1:1108\n748#1:1109,3\n*E\n"})
public final class InferenceFunctionCallType extends InferenceFunction {

    @NotNull
    private final IrCall call;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InferenceFunctionCallType(@NotNull ComposableTargetAnnotationsTransformer transformer, @NotNull IrCall call) {
        super(transformer, null);
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(call, "call");
        this.call = call;
    }

    private static final void toDeclaredScheme$lambda$3$recordParameter(ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, List<Scheme> list, Item item, IrExpression irExpression) {
        if (irExpression == null || !composableTargetAnnotationsTransformer.isOrHasComposableLambda$compiler_hosted(irExpression.getType())) {
            return;
        }
        list.add(composableTargetAnnotationsTransformer.toScheme(irExpression.getType(), item));
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public String getName() {
        return "Call(" + this.call.getSymbol().getOwner().getName() + ")";
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public boolean getSchemeIsUpdatable() {
        return false;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public boolean isOverlyWide() {
        return ComposableTargetAnnotationsTransformerKt.hasOverlyWideParameters(this.call.getSymbol().getOwner());
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public Scheme toDeclaredScheme(@NotNull Item defaultTarget) {
        Intrinsics.checkNotNullParameter(defaultTarget, "defaultTarget");
        ComposableTargetAnnotationsTransformer transformer = getTransformer();
        Item target = transformer.getTarget(this.call.getSymbol().getOwner().getAnnotations());
        Item item = target.getIsUnspecified() ? defaultTarget : target;
        List listFilterNotNull = CollectionsKt.filterNotNull(ComposableTargetAnnotationsTransformerKt.getArguments(this.call));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (transformer.isOrHasComposableLambda$compiler_hosted(((IrExpression) obj).getType())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(transformer.toScheme(((IrExpression) it.next()).getType(), defaultTarget));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        toDeclaredScheme$lambda$3$recordParameter(transformer, mutableList, defaultTarget, this.call.getExtensionReceiver());
        return new Scheme(item, mutableList, transformer.isOrHasComposableLambda$compiler_hosted(this.call.getType()) ? transformer.toScheme(this.call.getType(), defaultTarget) : null, false, 8, null);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public void updateScheme(@NotNull Scheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
    }
}
