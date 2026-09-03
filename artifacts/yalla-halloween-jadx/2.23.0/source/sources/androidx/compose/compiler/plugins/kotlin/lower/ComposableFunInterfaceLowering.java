package androidx.compose.compiler.plugins.kotlin.lower;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.IrElementTransformerVoidWithContext;
import org.jetbrains.kotlin.backend.common.ScopeWithIr;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.builders.IrGeneratorContext;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperator;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeSystemContextImpl;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposableFunInterfaceLowering;", "Lorg/jetbrains/kotlin/backend/common/IrElementTransformerVoidWithContext;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;)V", "isFunInterfaceConversion", "", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrTypeOperatorCall;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitTypeOperator", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableFunInterfaceLowering extends IrElementTransformerVoidWithContext implements ModuleLoweringPass {

    @NotNull
    private final IrPluginContext context;

    public ComposableFunInterfaceLowering(@NotNull IrPluginContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final boolean isFunInterfaceConversion(IrTypeOperatorCall expression) {
        IrFunctionExpression argument = expression.getArgument();
        IrTypeOperator operator = expression.getOperator();
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(expression.getTypeOperand());
        return operator == IrTypeOperator.SAM_CONVERSION && (argument instanceof IrFunctionExpression) && IrUtilsKt.isLambda(argument.getOrigin()) && classOrNull != null && classOrNull.getOwner().isFun();
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        if (JvmPlatformKt.isJvm(this.context.getPlatform())) {
            IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, (IrElementTransformerVoid) this);
        }
    }

    @NotNull
    public IrExpression visitTypeOperator(@NotNull IrTypeOperatorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (!isFunInterfaceConversion(expression)) {
            return super.visitTypeOperator(expression);
        }
        IrFunctionExpression irFunctionExpressionTransform = expression.getArgument().transform((IrElementTransformer) this, (Object) null);
        Intrinsics.checkNotNull(irFunctionExpressionTransform, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrFunctionExpression");
        IrFunctionExpression irFunctionExpression = irFunctionExpressionTransform;
        IrType typeOperand = expression.getTypeOperand();
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(typeOperand);
        if (classOrNull == null) {
            throw new IllegalStateException("Expected non-null class".toString());
        }
        IrDeclarationParent currentDeclarationParent = getCurrentDeclarationParent();
        Intrinsics.checkNotNull(currentDeclarationParent);
        IrGeneratorContext irGeneratorContext = this.context;
        ScopeWithIr currentScope = getCurrentScope();
        Intrinsics.checkNotNull(currentScope);
        return new FunctionReferenceBuilder(irFunctionExpression, classOrNull, typeOperand, currentDeclarationParent, irGeneratorContext, currentScope.getScope().getScopeOwnerSymbol(), new IrTypeSystemContextImpl(this.context.getIrBuiltIns())).build();
    }
}
