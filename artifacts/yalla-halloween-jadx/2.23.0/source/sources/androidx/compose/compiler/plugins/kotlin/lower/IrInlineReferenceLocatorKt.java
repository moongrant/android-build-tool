package androidx.compose.compiler.plugins.kotlin.lower;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrBlock;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\f"}, d2 = {"isInlinable", "", "Lorg/jetbrains/kotlin/ir/expressions/IrStatementOrigin;", "(Lorg/jetbrains/kotlin/ir/expressions/IrStatementOrigin;)Z", "isInlineArrayConstructor", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "isInlineFunctionCall", "unwrapInlineLambda", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IrInlineReferenceLocatorKt {
    private static final boolean isInlinable(IrStatementOrigin irStatementOrigin) {
        return IrUtilsKt.isLambda(irStatementOrigin) || Intrinsics.areEqual(irStatementOrigin, IrStatementOrigin.ADAPTED_FUNCTION_REFERENCE.INSTANCE) || Intrinsics.areEqual(irStatementOrigin, IrStatementOrigin.SUSPEND_CONVERSION.INSTANCE);
    }

    private static final boolean isInlineArrayConstructor(IrFunction irFunction, IrPluginContext irPluginContext) {
        if (!(irFunction instanceof IrConstructor) || irFunction.getValueParameters().size() != 2) {
            return false;
        }
        IrClassSymbol symbol = AdditionalIrUtilsKt.getConstructedClass((IrConstructor) irFunction).getSymbol();
        return Intrinsics.areEqual(symbol, irPluginContext.getIrBuiltIns().getArrayClass()) || irPluginContext.getIrBuiltIns().getPrimitiveArraysToPrimitiveTypes().containsKey(symbol);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInlineFunctionCall(IrFunction irFunction, IrPluginContext irPluginContext) {
        return irFunction.isInline() || isInlineArrayConstructor(irFunction, irPluginContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IrFunctionSymbol unwrapInlineLambda(IrExpression irExpression) {
        if (irExpression instanceof IrBlock) {
            IrBlock irBlock = (IrBlock) irExpression;
            if (isInlinable(irBlock.getOrigin())) {
                Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) irBlock.getStatements());
                IrFunctionReference irFunctionReference = objLastOrNull instanceof IrFunctionReference ? (IrFunctionReference) objLastOrNull : null;
                if (irFunctionReference != null) {
                    return irFunctionReference.getSymbol();
                }
                return null;
            }
        }
        if (irExpression instanceof IrFunctionExpression) {
            return ((IrFunctionExpression) irExpression).getFunction().getSymbol();
        }
        return null;
    }
}
