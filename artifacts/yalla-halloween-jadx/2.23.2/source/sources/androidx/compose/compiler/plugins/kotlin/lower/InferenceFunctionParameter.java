package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.inference.Item;
import androidx.compose.compiler.plugins.kotlin.inference.Scheme;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.impl.IrSimpleTypeBuilder;
import org.jetbrains.kotlin.ir.types.impl.IrSimpleTypeImplKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionParameter;", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceFunction;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "parameter", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "(Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;)V", "name", "", "getName", "()Ljava/lang/String;", "getParameter", "()Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "schemeIsUpdatable", "", "getSchemeIsUpdatable", "()Z", "equals", "other", "", "hashCode", "", "toDeclaredScheme", "Landroidx/compose/compiler/plugins/kotlin/inference/Scheme;", "defaultTarget", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "updateScheme", "", "scheme", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/InferenceFunctionParameter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1104:1\n1#2:1105\n*E\n"})
public final class InferenceFunctionParameter extends InferenceFunction {

    @NotNull
    private final IrValueParameter parameter;

    public InferenceFunctionParameter(@NotNull ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer, @NotNull IrValueParameter irValueParameter) {
        super(composableTargetAnnotationsTransformer, null);
        this.parameter = irValueParameter;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof InferenceFunctionParameter) && Intrinsics.areEqual(((InferenceFunctionParameter) other).parameter, this.parameter);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public String getName() {
        return "<parameter>";
    }

    @NotNull
    public final IrValueParameter getParameter() {
        return this.parameter;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public boolean getSchemeIsUpdatable() {
        return false;
    }

    public int hashCode() {
        return this.parameter.hashCode() * 31;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    @NotNull
    public Scheme toDeclaredScheme(@NotNull Item defaultTarget) {
        List listEmptyList;
        ComposableTargetAnnotationsTransformer transformer = getTransformer();
        IrSimpleFunction irSimpleFunctionSamOwnerOrNull = ComposableTargetAnnotationsTransformerKt.samOwnerOrNull(this.parameter.getType());
        if (irSimpleFunctionSamOwnerOrNull == null || (listEmptyList = irSimpleFunctionSamOwnerOrNull.getAnnotations()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Item target = transformer.getTarget(CollectionsKt.plus((Collection) this.parameter.getType().getAnnotations(), (Iterable) listEmptyList));
        if (!target.getIsUnspecified()) {
            defaultTarget = target;
        }
        return transformer.toScheme(this.parameter.getType(), defaultTarget);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.InferenceFunction
    public void updateScheme(@NotNull Scheme scheme) {
        IrSimpleType type = this.parameter.getType();
        if (type instanceof IrSimpleType) {
            IrSimpleTypeBuilder builder = IrSimpleTypeImplKt.toBuilder(type);
            builder.setAnnotations(updatedAnnotations(builder.getAnnotations(), scheme.getTarget()));
            this.parameter.setType(IrSimpleTypeImplKt.buildSimpleType(builder));
        }
    }
}
