package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeCallableIds;
import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.AbstractDecoysLowering;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBaseKt;
import com.common.support.apm.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl;
import org.jetbrains.kotlin.ir.declarations.impl.IrVariableImpl;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrBlockBodyImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionExpressionImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrReturnTargetSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.name.CallableId;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.name.SpecialNames;
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedContainerSource;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0014H\u0002J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0014H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006-"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/WrapJsComposableLambdaLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "signatureBuilder", "Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "decoysEnabled", "", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;Z)V", "rememberFunSymbol", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "getRememberFunSymbol", "()Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "rememberFunSymbol$delegate", "Lkotlin/Lazy;", "callRun", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "returnType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "runBlock", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrFunctionExpressionImpl;", "createLambda0", "functionSymbol", "statements", "", "Lorg/jetbrains/kotlin/ir/IrStatement;", "functionReferenceForComposableLambda", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrFunctionReferenceImpl;", "lambda", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "dispatchReceiver", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "transformComposableLambdaCall", "originalCall", "transformComposableLambdaInstanceCall", "visitCall", "expression", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWrapJsComposableLambdaLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WrapJsComposableLambdaLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/WrapJsComposableLambdaLowering\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,267:1\n346#2,12:268\n*S KotlinDebug\n*F\n+ 1 WrapJsComposableLambdaLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/WrapJsComposableLambdaLowering\n*L\n146#1:268,12\n*E\n"})
public final class WrapJsComposableLambdaLowering extends AbstractDecoysLowering {
    private final boolean decoysEnabled;

    /* JADX INFO: renamed from: rememberFunSymbol$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rememberFunSymbol;

    public WrapJsComposableLambdaLowering(@NotNull final IrPluginContext irPluginContext, @NotNull final DeepCopySymbolRemapper deepCopySymbolRemapper, @NotNull final ModuleMetrics moduleMetrics, @NotNull final IdSignatureSerializer idSignatureSerializer, boolean z) {
        super(irPluginContext, deepCopySymbolRemapper, moduleMetrics, idSignatureSerializer);
        this.decoysEnabled = z;
        this.rememberFunSymbol = LazyKt.lazy(new Function0<IrSimpleFunctionSymbol>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.WrapJsComposableLambdaLowering$rememberFunSymbol$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrSimpleFunctionSymbol invoke() {
                IrSimpleFunction irSimpleFunction;
                ComposerParamTransformer composerParamTransformer = new ComposerParamTransformer(irPluginContext, deepCopySymbolRemapper, this.decoysEnabled, moduleMetrics);
                DeepCopySymbolRemapper deepCopySymbolRemapper2 = deepCopySymbolRemapper;
                List<IrSimpleFunctionSymbol> topLevelFunctions = this.getTopLevelFunctions(ComposeCallableIds.INSTANCE.getRemember());
                ArrayList<IrSimpleFunction> arrayList = new ArrayList(CollectionsKt.OooO0oo(topLevelFunctions));
                Iterator<T> it = topLevelFunctions.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IrSimpleFunctionSymbol) it.next()).getOwner());
                }
                for (IrSimpleFunction irSimpleFunction2 : arrayList) {
                    if (irSimpleFunction2.getValueParameters().size() == 2 && !AdditionalIrUtilsKt.isVararg((IrValueParameter) CollectionsKt.first(irSimpleFunction2.getValueParameters()))) {
                        IrSimpleFunction owner = deepCopySymbolRemapper2.getReferencedSimpleFunction(irSimpleFunction2.getSymbol()).getOwner();
                        WrapJsComposableLambdaLowering wrapJsComposableLambdaLowering = this;
                        IrPluginContext irPluginContext2 = irPluginContext;
                        DeepCopySymbolRemapper deepCopySymbolRemapper3 = deepCopySymbolRemapper;
                        IdSignatureSerializer idSignatureSerializer2 = idSignatureSerializer;
                        ModuleMetrics moduleMetrics2 = moduleMetrics;
                        IrSimpleFunction irSimpleFunction3 = owner;
                        if (!wrapJsComposableLambdaLowering.decoysEnabled) {
                            IrStatement irStatementVisitSimpleFunction = composerParamTransformer.visitSimpleFunction(irSimpleFunction3);
                            Intrinsics.checkNotNull(irStatementVisitSimpleFunction, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
                            irSimpleFunction = (IrSimpleFunction) irStatementVisitSimpleFunction;
                        } else if (DecoyTransformBaseKt.isDecoy((IrDeclaration) irSimpleFunction3)) {
                            IrSimpleFunction owner2 = wrapJsComposableLambdaLowering.getComposableForDecoy((IrFunction) irSimpleFunction3).getOwner();
                            Intrinsics.checkNotNull(owner2, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
                            irSimpleFunction = owner2;
                        } else {
                            CreateDecoysTransformer createDecoysTransformer = new CreateDecoysTransformer(irPluginContext2, deepCopySymbolRemapper3, idSignatureSerializer2, moduleMetrics2);
                            Intrinsics.checkNotNull(createDecoysTransformer.visitSimpleFunction(irSimpleFunction3), "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
                            createDecoysTransformer.updateParents();
                            IrFunction owner3 = wrapJsComposableLambdaLowering.getComposableForDecoy((IrFunction) irSimpleFunction3).getOwner();
                            Intrinsics.checkNotNull(owner3, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
                            IrStatement irStatementVisitSimpleFunction2 = composerParamTransformer.visitSimpleFunction((IrSimpleFunction) owner3);
                            Intrinsics.checkNotNull(irStatementVisitSimpleFunction2, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
                            irSimpleFunction = (IrSimpleFunction) irStatementVisitSimpleFunction2;
                        }
                        return irSimpleFunction.getSymbol();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        });
    }

    private final IrCall callRun(IrType returnType, IrFunctionExpressionImpl runBlock) {
        IrCall irCallImpl = new IrCallImpl(-2, -2, returnType, getTopLevelFunction(new CallableId(new FqName(Constants.SDK_LANGUAGE), Name.identifier("run"))), 1, 1, (IrStatementOrigin) null, (IrClassSymbol) null, 192, (DefaultConstructorMarker) null);
        irCallImpl.putTypeArgument(0, returnType);
        irCallImpl.putValueArgument(0, (IrExpression) runBlock);
        return irCallImpl;
    }

    private final IrFunctionExpressionImpl createLambda0(IrType returnType, IrSimpleFunctionSymbol functionSymbol, List<? extends IrStatement> statements) {
        IrType irTypeTypeWith = IrTypesKt.typeWith(getContext().getIrBuiltIns().functionN(0), new IrType[]{returnType});
        IrStatementOrigin irStatementOrigin = IrStatementOrigin.LAMBDA.INSTANCE;
        IrSimpleFunction irFunctionImpl = new IrFunctionImpl(-2, -2, IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA.INSTANCE, functionSymbol, SpecialNames.ANONYMOUS, DescriptorVisibilities.LOCAL, Modality.FINAL, returnType, true, false, false, false, false, false, false, false, (DeserializedContainerSource) null, (IrFactory) null, 229376, (DefaultConstructorMarker) null);
        irFunctionImpl.setBody(new IrBlockBodyImpl(-2, -2, statements));
        return new IrFunctionExpressionImpl(-2, -2, irTypeTypeWith, irFunctionImpl, irStatementOrigin);
    }

    public static /* synthetic */ IrFunctionExpressionImpl createLambda0$default(WrapJsComposableLambdaLowering wrapJsComposableLambdaLowering, IrType irType, IrSimpleFunctionSymbol irSimpleFunctionSymbol, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) new IrSimpleFunctionSymbolImpl((FunctionDescriptor) null, 1, (DefaultConstructorMarker) null);
        }
        return wrapJsComposableLambdaLowering.createLambda0(irType, irSimpleFunctionSymbol, list);
    }

    private final IrFunctionReferenceImpl functionReferenceForComposableLambda(IrFunctionExpression lambda, IrExpression dispatchReceiver) {
        int size = lambda.getFunction().getValueParameters().size() + (lambda.getFunction().getExtensionReceiverParameter() != null ? 1 : 0);
        Object obj = null;
        boolean z = false;
        for (Object obj2 : IrUtilsKt.getFunctions(getSymbolRemapper().getReferencedClass(getTopLevelClass(ComposeClassIds.INSTANCE.getComposableLambda())))) {
            IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) obj2;
            if (Intrinsics.areEqual(irSimpleFunctionSymbol.getOwner().getName().asString(), "invoke") && size == irSimpleFunctionSymbol.getOwner().getValueParameters().size()) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                obj = obj2;
            }
        }
        if (!z) {
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        IrFunctionSymbol irFunctionSymbol = (IrSimpleFunctionSymbol) obj;
        IrFunctionReferenceImpl irFunctionReferenceImpl = new IrFunctionReferenceImpl(-1, -1, lambda.getType(), irFunctionSymbol, irFunctionSymbol.getOwner().getTypeParameters().size(), irFunctionSymbol.getOwner().getValueParameters().size(), (IrFunctionSymbol) null, (IrStatementOrigin) null, 192, (DefaultConstructorMarker) null);
        irFunctionReferenceImpl.setDispatchReceiver(dispatchReceiver);
        return irFunctionReferenceImpl;
    }

    private final IrSimpleFunctionSymbol getRememberFunSymbol() {
        return (IrSimpleFunctionSymbol) this.rememberFunSymbol.getValue();
    }

    private final IrExpression transformComposableLambdaCall(IrCall originalCall) {
        IrExpression valueArgument = originalCall.getValueArgument(0);
        IrExpression valueArgument2 = originalCall.getValueArgument(originalCall.getValueArgumentsCount() - 1);
        Intrinsics.checkNotNull(valueArgument2, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrFunctionExpression");
        IrFunctionExpression irFunctionExpression = (IrFunctionExpression) valueArgument2;
        IrVariableImpl irVariableImplIrTemporary$default = AbstractComposeLowering.irTemporary$default(this, (IrExpression) originalCall, "dispatchReceiver", null, false, null, 28, null);
        IrValueDeclaration irValueDeclaration = (IrValueDeclaration) irVariableImplIrTemporary$default;
        IrExpression irExpressionFunctionReferenceForComposableLambda = functionReferenceForComposableLambda(irFunctionExpression, irGet(irValueDeclaration));
        IrReturnTargetSymbol irSimpleFunctionSymbolImpl = new IrSimpleFunctionSymbolImpl((FunctionDescriptor) null, 1, (DefaultConstructorMarker) null);
        IrExpression irExpressionCreateLambda0 = createLambda0(irFunctionExpression.getType(), (IrSimpleFunctionSymbol) irSimpleFunctionSymbolImpl, CollectionsKt.listOf(AbstractComposeLowering.irReturn$default(this, irSimpleFunctionSymbolImpl, irExpressionFunctionReferenceForComposableLambda, null, 4, null)));
        IrExpression irCallImpl = new IrCallImpl(-2, -2, irFunctionExpression.getType(), getRememberFunSymbol(), 1, 4, (IrStatementOrigin) null, (IrClassSymbol) null, 192, (DefaultConstructorMarker) null);
        irCallImpl.putTypeArgument(0, irFunctionExpression.getType());
        irCallImpl.putValueArgument(0, irGet(irValueDeclaration));
        irCallImpl.putValueArgument(1, irExpressionCreateLambda0);
        irCallImpl.putValueArgument(2, valueArgument);
        irCallImpl.putValueArgument(3, irConst(0));
        IrReturnTargetSymbol irSimpleFunctionSymbolImpl2 = new IrSimpleFunctionSymbolImpl((FunctionDescriptor) null, 1, (DefaultConstructorMarker) null);
        IrType type = irFunctionExpression.getType();
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) irSimpleFunctionSymbolImpl2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(irVariableImplIrTemporary$default);
        arrayList.add(AbstractComposeLowering.irReturn$default(this, irSimpleFunctionSymbolImpl2, irCallImpl, null, 4, null));
        Unit unit = Unit.INSTANCE;
        return callRun(irFunctionExpression.getType(), createLambda0(type, irSimpleFunctionSymbol, arrayList));
    }

    private final IrExpression transformComposableLambdaInstanceCall(IrCall originalCall) {
        IrExpression valueArgument = originalCall.getValueArgument(originalCall.getValueArgumentsCount() - 1);
        Intrinsics.checkNotNull(valueArgument, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrFunctionExpression");
        return functionReferenceForComposableLambda((IrFunctionExpression) valueArgument, (IrExpression) originalCall);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        IrElement irElement = (IrElement) module;
        IrElementTransformerVoidKt.transformChildrenVoid(irElement, this);
        PatchDeclarationParentsKt.patchDeclarationParents$default(irElement, (IrDeclarationParent) null, 1, (Object) null);
    }

    @NotNull
    public IrExpression visitCall(@NotNull IrCall expression) {
        IrExpression irExpressionVisitCall = super.visitCall(expression);
        Intrinsics.checkNotNull(irExpressionVisitCall, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrCall");
        IrExpression irExpression = (IrCall) irExpressionVisitCall;
        FqName fqNameForIrSerialization = AdditionalIrUtilsKt.getFqNameForIrSerialization(expression.getSymbol().getOwner());
        ComposeCallableIds composeCallableIds = ComposeCallableIds.INSTANCE;
        if (Intrinsics.areEqual(fqNameForIrSerialization, composeCallableIds.getComposableLambda().asSingleFqName())) {
            return transformComposableLambdaCall(irExpression);
        }
        return Intrinsics.areEqual(fqNameForIrSerialization, composeCallableIds.getComposableLambdaInstance().asSingleFqName()) ? transformComposableLambdaInstanceCall(irExpression) : irExpression;
    }
}
