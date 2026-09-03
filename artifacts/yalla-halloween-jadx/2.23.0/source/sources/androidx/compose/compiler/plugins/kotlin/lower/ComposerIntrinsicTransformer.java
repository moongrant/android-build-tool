package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyFqNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.FileLoweringPass;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.name.FqName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposerIntrinsicTransformer;", "Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;", "Lorg/jetbrains/kotlin/backend/common/FileLoweringPass;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "decoysEnabled", "", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Z)V", "getContext", "()Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "currentComposerIntrinsic", "Lorg/jetbrains/kotlin/name/FqName;", "currentComposerFqName", "lower", "", "irFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposerIntrinsicTransformer extends IrElementTransformerVoid implements FileLoweringPass, ModuleLoweringPass {

    @NotNull
    private final IrPluginContext context;

    @NotNull
    private final FqName currentComposerIntrinsic;
    private final boolean decoysEnabled;

    public ComposerIntrinsicTransformer(@NotNull IrPluginContext context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.decoysEnabled = z;
        this.currentComposerIntrinsic = currentComposerFqName();
    }

    private final FqName currentComposerFqName() {
        return this.decoysEnabled ? DecoyFqNames.INSTANCE.getCurrentComposerIntrinsic() : ComposeFqNames.INSTANCE.getCurrentComposerIntrinsic();
    }

    @NotNull
    public final IrPluginContext getContext() {
        return this.context;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    @NotNull
    public IrExpression visitCall(@NotNull IrCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (!Intrinsics.areEqual(AdditionalIrUtilsKt.getKotlinFqName(expression.getSymbol().getOwner()), this.currentComposerIntrinsic)) {
            return super.visitCall(expression);
        }
        expression.getValueArgumentsCount();
        IrExpression valueArgument = expression.getValueArgument(0);
        if (valueArgument != null) {
            return valueArgument;
        }
        throw new IllegalStateException("Expected non-null composer argument".toString());
    }

    public void lower(@NotNull IrFile irFile) {
        Intrinsics.checkNotNullParameter(irFile, "irFile");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) irFile, this);
    }
}
