package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.TypeRemapper;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0003H\u0096\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"androidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1", "Lorg/jetbrains/kotlin/ir/util/TypeRemapper;", "enterScope", "", "irTypeParametersContainer", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParametersContainer;", "leaveScope", "remapType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "type", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nDecoyTransformBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1\n*L\n1#1,216:1\n*E\n"})
public final class DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1 implements TypeRemapper {
    private final /* synthetic */ TypeRemapper $$delegate_0;
    final /* synthetic */ IrFunction $source;
    final /* synthetic */ IrFunction $target;
    final /* synthetic */ TypeRemapper $typeRemapper;

    public DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(TypeRemapper typeRemapper, IrFunction irFunction, IrFunction irFunction2) {
        this.$typeRemapper = typeRemapper;
        this.$source = irFunction;
        this.$target = irFunction2;
        this.$$delegate_0 = typeRemapper;
    }

    public void enterScope(@NotNull IrTypeParametersContainer irTypeParametersContainer) {
        Intrinsics.checkNotNullParameter(irTypeParametersContainer, "irTypeParametersContainer");
        this.$$delegate_0.enterScope(irTypeParametersContainer);
    }

    public void leaveScope() {
        this.$$delegate_0.leaveScope();
    }

    @NotNull
    public IrType remapType(@NotNull IrType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.$typeRemapper.remapType(IrUtilsKt.remapTypeParameters$default(type, this.$source, this.$target, (Map) null, 4, (Object) null));
    }
}
