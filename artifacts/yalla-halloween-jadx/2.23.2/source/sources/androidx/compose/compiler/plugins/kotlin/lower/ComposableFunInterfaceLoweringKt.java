package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNamesKt;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperator;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"findSamFunctionExpr", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "Lorg/jetbrains/kotlin/ir/expressions/IrTypeOperatorCall;", "isComposableFunInterface", "", "Lorg/jetbrains/kotlin/ir/types/IrType;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableFunInterfaceLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableFunInterfaceLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunInterfaceLoweringKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,102:1\n346#2,12:103\n*S KotlinDebug\n*F\n+ 1 ComposableFunInterfaceLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableFunInterfaceLoweringKt\n*L\n71#1:103,12\n*E\n"})
public final class ComposableFunInterfaceLoweringKt {
    @Nullable
    public static final IrFunctionExpression findSamFunctionExpr(@NotNull IrTypeOperatorCall irTypeOperatorCall) {
        IrFunctionExpression argument = irTypeOperatorCall.getArgument();
        IrTypeOperator operator = irTypeOperatorCall.getOperator();
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irTypeOperatorCall.getTypeOperand());
        if (!(operator == IrTypeOperator.SAM_CONVERSION && classOrNull != null && classOrNull.getOwner().isFun())) {
            return null;
        }
        if (argument instanceof IrFunctionExpression) {
            IrFunctionExpression irFunctionExpression = argument;
            if (IrUtilsKt.isLambda(irFunctionExpression.getOrigin())) {
                return irFunctionExpression;
            }
        }
        if (!(argument instanceof IrTypeOperatorCall)) {
            return null;
        }
        IrTypeOperatorCall irTypeOperatorCall2 = (IrTypeOperatorCall) argument;
        if (irTypeOperatorCall2.getOperator() != IrTypeOperator.IMPLICIT_CAST) {
            return null;
        }
        IrFunctionExpression argument2 = irTypeOperatorCall2.getArgument();
        if (argument2 instanceof IrFunctionExpression) {
            return argument2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableFunInterface(IrType irType) {
        Sequence functions;
        IrAnnotationContainer irAnnotationContainer;
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irType);
        if (classOrNull == null || (functions = IrUtilsKt.getFunctions(classOrNull)) == null) {
            return false;
        }
        Object obj = null;
        boolean z = false;
        for (Object obj2 : functions) {
            if (((IrSimpleFunctionSymbol) obj2).getOwner().getModality() == Modality.ABSTRACT) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                obj = obj2;
                z = true;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) obj;
        return (irSimpleFunctionSymbol == null || (irAnnotationContainer = (IrSimpleFunction) irSimpleFunctionSymbol.getOwner()) == null || !ComposeFqNamesKt.hasComposableAnnotation(irAnnotationContainer)) ? false : true;
    }
}
