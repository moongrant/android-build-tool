package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrInlineUtilsKt;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrAnonymousInitializer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationBase;
import org.jetbrains.kotlin.ir.declarations.IrEnumEntry;
import org.jetbrains.kotlin.ir.declarations.IrErrorDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrExternalPackageFragment;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrPackageFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrScript;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeAlias;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.expressions.IrBlock;
import org.jetbrains.kotlin.ir.expressions.IrBlockBody;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrBranch;
import org.jetbrains.kotlin.ir.expressions.IrBreak;
import org.jetbrains.kotlin.ir.expressions.IrBreakContinue;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrCallableReference;
import org.jetbrains.kotlin.ir.expressions.IrCatch;
import org.jetbrains.kotlin.ir.expressions.IrClassReference;
import org.jetbrains.kotlin.ir.expressions.IrComposite;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstantArray;
import org.jetbrains.kotlin.ir.expressions.IrConstantObject;
import org.jetbrains.kotlin.ir.expressions.IrConstantPrimitive;
import org.jetbrains.kotlin.ir.expressions.IrConstantValue;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrContainerExpression;
import org.jetbrains.kotlin.ir.expressions.IrContinue;
import org.jetbrains.kotlin.ir.expressions.IrDeclarationReference;
import org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrDoWhileLoop;
import org.jetbrains.kotlin.ir.expressions.IrDynamicExpression;
import org.jetbrains.kotlin.ir.expressions.IrDynamicMemberExpression;
import org.jetbrains.kotlin.ir.expressions.IrDynamicOperatorExpression;
import org.jetbrains.kotlin.ir.expressions.IrElseBranch;
import org.jetbrains.kotlin.ir.expressions.IrEnumConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrErrorCallExpression;
import org.jetbrains.kotlin.ir.expressions.IrErrorExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrFieldAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrGetClass;
import org.jetbrains.kotlin.ir.expressions.IrGetEnumValue;
import org.jetbrains.kotlin.ir.expressions.IrGetField;
import org.jetbrains.kotlin.ir.expressions.IrGetObjectValue;
import org.jetbrains.kotlin.ir.expressions.IrGetSingletonValue;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrInstanceInitializerCall;
import org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference;
import org.jetbrains.kotlin.ir.expressions.IrLoop;
import org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrPropertyReference;
import org.jetbrains.kotlin.ir.expressions.IrRawFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrReturn;
import org.jetbrains.kotlin.ir.expressions.IrSetField;
import org.jetbrains.kotlin.ir.expressions.IrSetValue;
import org.jetbrains.kotlin.ir.expressions.IrSpreadElement;
import org.jetbrains.kotlin.ir.expressions.IrStringConcatenation;
import org.jetbrains.kotlin.ir.expressions.IrSuspendableExpression;
import org.jetbrains.kotlin.ir.expressions.IrSuspensionPoint;
import org.jetbrains.kotlin.ir.expressions.IrSyntheticBody;
import org.jetbrains.kotlin.ir.expressions.IrThrow;
import org.jetbrains.kotlin.ir.expressions.IrTry;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall;
import org.jetbrains.kotlin.ir.expressions.IrValueAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrVararg;
import org.jetbrains.kotlin.ir.expressions.IrWhen;
import org.jetbrains.kotlin.ir.expressions.IrWhileLoop;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid;
import org.jetbrains.kotlin.ir.visitors.IrVisitorsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposeInlineLambdaLocator;", "", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;)V", "inlineLambdaToParameter", "", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "isInlineLambda", "", "irFunction", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "preservesComposableScope", "scan", "", "element", "Lorg/jetbrains/kotlin/ir/IrElement;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposeInlineLambdaLocator {

    @NotNull
    private final IrPluginContext context;

    @NotNull
    private final Map<IrFunctionSymbol, IrValueParameter> inlineLambdaToParameter;

    public ComposeInlineLambdaLocator(@NotNull IrPluginContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.inlineLambdaToParameter = new LinkedHashMap();
    }

    public final boolean isInlineLambda(@NotNull IrFunction irFunction) {
        Intrinsics.checkNotNullParameter(irFunction, "irFunction");
        return this.inlineLambdaToParameter.keySet().contains(irFunction.getSymbol());
    }

    public final boolean preservesComposableScope(@NotNull IrFunction irFunction) {
        Intrinsics.checkNotNullParameter(irFunction, "irFunction");
        IrValueParameter irValueParameter = this.inlineLambdaToParameter.get(irFunction.getSymbol());
        return (irValueParameter == null || irValueParameter.isCrossinline() || IrUtilsKt.hasAnnotation(irValueParameter.getType(), ComposeFqNames.INSTANCE.getDisallowComposableCalls())) ? false : true;
    }

    public final void scan(@NotNull IrElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        IrVisitorsKt.acceptVoid(element, new IrElementVisitorVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposeInlineLambdaLocator.scan.1
            public /* bridge */ /* synthetic */ Object visitAnonymousInitializer(IrAnonymousInitializer irAnonymousInitializer, Object obj) {
                visitAnonymousInitializer(irAnonymousInitializer, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitBlock(IrBlock irBlock, Object obj) {
                visitBlock(irBlock, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitBlockBody(IrBlockBody irBlockBody, Object obj) {
                visitBlockBody(irBlockBody, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitBody(IrBody irBody, Object obj) {
                visitBody(irBody, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitBranch(IrBranch irBranch, Object obj) {
                visitBranch(irBranch, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitBreak(IrBreak irBreak, Object obj) {
                visitBreak(irBreak, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitBreakContinue(IrBreakContinue irBreakContinue, Object obj) {
                visitBreakContinue(irBreakContinue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitCall(IrCall irCall, Object obj) {
                visitCall(irCall, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitCallableReference(IrCallableReference irCallableReference, Object obj) {
                visitCallableReference((IrCallableReference<?>) irCallableReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitCatch(IrCatch irCatch, Object obj) {
                visitCatch(irCatch, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitClass(IrClass irClass, Object obj) {
                visitClass(irClass, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitClassReference(IrClassReference irClassReference, Object obj) {
                visitClassReference(irClassReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitComposite(IrComposite irComposite, Object obj) {
                visitComposite(irComposite, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConst(IrConst irConst, Object obj) {
                visitConst((IrConst<?>) irConst, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConstantArray(IrConstantArray irConstantArray, Object obj) {
                visitConstantArray(irConstantArray, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConstantObject(IrConstantObject irConstantObject, Object obj) {
                visitConstantObject(irConstantObject, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConstantPrimitive(IrConstantPrimitive irConstantPrimitive, Object obj) {
                visitConstantPrimitive(irConstantPrimitive, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConstantValue(IrConstantValue irConstantValue, Object obj) {
                visitConstantValue(irConstantValue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConstructor(IrConstructor irConstructor, Object obj) {
                visitConstructor(irConstructor, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitConstructorCall(IrConstructorCall irConstructorCall, Object obj) {
                visitConstructorCall(irConstructorCall, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitContainerExpression(IrContainerExpression irContainerExpression, Object obj) {
                visitContainerExpression(irContainerExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitContinue(IrContinue irContinue, Object obj) {
                visitContinue(irContinue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDeclaration(IrDeclarationBase irDeclarationBase, Object obj) {
                visitDeclaration(irDeclarationBase, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDeclarationReference(IrDeclarationReference irDeclarationReference, Object obj) {
                visitDeclarationReference(irDeclarationReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDelegatingConstructorCall(IrDelegatingConstructorCall irDelegatingConstructorCall, Object obj) {
                visitDelegatingConstructorCall(irDelegatingConstructorCall, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDoWhileLoop(IrDoWhileLoop irDoWhileLoop, Object obj) {
                visitDoWhileLoop(irDoWhileLoop, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDynamicExpression(IrDynamicExpression irDynamicExpression, Object obj) {
                visitDynamicExpression(irDynamicExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDynamicMemberExpression(IrDynamicMemberExpression irDynamicMemberExpression, Object obj) {
                visitDynamicMemberExpression(irDynamicMemberExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitDynamicOperatorExpression(IrDynamicOperatorExpression irDynamicOperatorExpression, Object obj) {
                visitDynamicOperatorExpression(irDynamicOperatorExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitElement(IrElement irElement, Object obj) {
                visitElement(irElement, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitElseBranch(IrElseBranch irElseBranch, Object obj) {
                visitElseBranch(irElseBranch, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitEnumConstructorCall(IrEnumConstructorCall irEnumConstructorCall, Object obj) {
                visitEnumConstructorCall(irEnumConstructorCall, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitEnumEntry(IrEnumEntry irEnumEntry, Object obj) {
                visitEnumEntry(irEnumEntry, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitErrorCallExpression(IrErrorCallExpression irErrorCallExpression, Object obj) {
                visitErrorCallExpression(irErrorCallExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitErrorDeclaration(IrErrorDeclaration irErrorDeclaration, Object obj) {
                visitErrorDeclaration(irErrorDeclaration, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitErrorExpression(IrErrorExpression irErrorExpression, Object obj) {
                visitErrorExpression(irErrorExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitExpression(IrExpression irExpression, Object obj) {
                visitExpression(irExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitExpressionBody(IrExpressionBody irExpressionBody, Object obj) {
                visitExpressionBody(irExpressionBody, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitExternalPackageFragment(IrExternalPackageFragment irExternalPackageFragment, Object obj) {
                visitExternalPackageFragment(irExternalPackageFragment, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitField(IrField irField, Object obj) {
                visitField(irField, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitFieldAccess(IrFieldAccessExpression irFieldAccessExpression, Object obj) {
                visitFieldAccess(irFieldAccessExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitFile(IrFile irFile, Object obj) {
                visitFile(irFile, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitFunction(IrFunction irFunction, Object obj) {
                visitFunction(irFunction, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitFunctionAccess(IrFunctionAccessExpression irFunctionAccessExpression, Object obj) {
                visitFunctionAccess(irFunctionAccessExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitFunctionExpression(IrFunctionExpression irFunctionExpression, Object obj) {
                visitFunctionExpression(irFunctionExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitFunctionReference(IrFunctionReference irFunctionReference, Object obj) {
                visitFunctionReference(irFunctionReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitGetClass(IrGetClass irGetClass, Object obj) {
                visitGetClass(irGetClass, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitGetEnumValue(IrGetEnumValue irGetEnumValue, Object obj) {
                visitGetEnumValue(irGetEnumValue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitGetField(IrGetField irGetField, Object obj) {
                visitGetField(irGetField, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitGetObjectValue(IrGetObjectValue irGetObjectValue, Object obj) {
                visitGetObjectValue(irGetObjectValue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitGetValue(IrGetValue irGetValue, Object obj) {
                visitGetValue(irGetValue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitInstanceInitializerCall(IrInstanceInitializerCall irInstanceInitializerCall, Object obj) {
                visitInstanceInitializerCall(irInstanceInitializerCall, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitLocalDelegatedProperty(IrLocalDelegatedProperty irLocalDelegatedProperty, Object obj) {
                visitLocalDelegatedProperty(irLocalDelegatedProperty, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitLocalDelegatedPropertyReference(IrLocalDelegatedPropertyReference irLocalDelegatedPropertyReference, Object obj) {
                visitLocalDelegatedPropertyReference(irLocalDelegatedPropertyReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitLoop(IrLoop irLoop, Object obj) {
                visitLoop(irLoop, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitMemberAccess(IrMemberAccessExpression irMemberAccessExpression, Object obj) {
                visitMemberAccess((IrMemberAccessExpression<?>) irMemberAccessExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitModuleFragment(IrModuleFragment irModuleFragment, Object obj) {
                visitModuleFragment(irModuleFragment, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitPackageFragment(IrPackageFragment irPackageFragment, Object obj) {
                visitPackageFragment(irPackageFragment, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitProperty(IrProperty irProperty, Object obj) {
                visitProperty(irProperty, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitPropertyReference(IrPropertyReference irPropertyReference, Object obj) {
                visitPropertyReference(irPropertyReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitRawFunctionReference(IrRawFunctionReference irRawFunctionReference, Object obj) {
                visitRawFunctionReference(irRawFunctionReference, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitReturn(IrReturn irReturn, Object obj) {
                visitReturn(irReturn, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitScript(IrScript irScript, Object obj) {
                visitScript(irScript, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSetField(IrSetField irSetField, Object obj) {
                visitSetField(irSetField, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSetValue(IrSetValue irSetValue, Object obj) {
                visitSetValue(irSetValue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSimpleFunction(IrSimpleFunction irSimpleFunction, Object obj) {
                visitSimpleFunction(irSimpleFunction, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSingletonReference(IrGetSingletonValue irGetSingletonValue, Object obj) {
                visitSingletonReference(irGetSingletonValue, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSpreadElement(IrSpreadElement irSpreadElement, Object obj) {
                visitSpreadElement(irSpreadElement, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitStringConcatenation(IrStringConcatenation irStringConcatenation, Object obj) {
                visitStringConcatenation(irStringConcatenation, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSuspendableExpression(IrSuspendableExpression irSuspendableExpression, Object obj) {
                visitSuspendableExpression(irSuspendableExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSuspensionPoint(IrSuspensionPoint irSuspensionPoint, Object obj) {
                visitSuspensionPoint(irSuspensionPoint, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitSyntheticBody(IrSyntheticBody irSyntheticBody, Object obj) {
                visitSyntheticBody(irSyntheticBody, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitThrow(IrThrow irThrow, Object obj) {
                visitThrow(irThrow, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitTry(IrTry irTry, Object obj) {
                visitTry(irTry, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitTypeAlias(IrTypeAlias irTypeAlias, Object obj) {
                visitTypeAlias(irTypeAlias, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitTypeOperator(IrTypeOperatorCall irTypeOperatorCall, Object obj) {
                visitTypeOperator(irTypeOperatorCall, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitTypeParameter(IrTypeParameter irTypeParameter, Object obj) {
                visitTypeParameter(irTypeParameter, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitValueAccess(IrValueAccessExpression irValueAccessExpression, Object obj) {
                visitValueAccess(irValueAccessExpression, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitValueParameter(IrValueParameter irValueParameter, Object obj) {
                visitValueParameter(irValueParameter, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitVararg(IrVararg irVararg, Object obj) {
                visitVararg(irVararg, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitVariable(IrVariable irVariable, Object obj) {
                visitVariable(irVariable, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitWhen(IrWhen irWhen, Object obj) {
                visitWhen(irWhen, (Void) obj);
                return Unit.INSTANCE;
            }

            public /* bridge */ /* synthetic */ Object visitWhileLoop(IrWhileLoop irWhileLoop, Object obj) {
                visitWhileLoop(irWhileLoop, (Void) obj);
                return Unit.INSTANCE;
            }

            public void visitAnonymousInitializer(@NotNull IrAnonymousInitializer irAnonymousInitializer) {
                IrElementVisitorVoid.DefaultImpls.visitAnonymousInitializer(this, irAnonymousInitializer);
            }

            public void visitBlock(@NotNull IrBlock irBlock) {
                IrElementVisitorVoid.DefaultImpls.visitBlock(this, irBlock);
            }

            public void visitBlockBody(@NotNull IrBlockBody irBlockBody) {
                IrElementVisitorVoid.DefaultImpls.visitBlockBody(this, irBlockBody);
            }

            public void visitBody(@NotNull IrBody irBody) {
                IrElementVisitorVoid.DefaultImpls.visitBody(this, irBody);
            }

            public void visitBranch(@NotNull IrBranch irBranch) {
                IrElementVisitorVoid.DefaultImpls.visitBranch(this, irBranch);
            }

            public void visitBreak(@NotNull IrBreak irBreak) {
                IrElementVisitorVoid.DefaultImpls.visitBreak(this, irBreak);
            }

            public void visitBreakContinue(@NotNull IrBreakContinue irBreakContinue) {
                IrElementVisitorVoid.DefaultImpls.visitBreakContinue(this, irBreakContinue);
            }

            public void visitCall(@NotNull IrCall irCall) {
                IrElementVisitorVoid.DefaultImpls.visitCall(this, irCall);
            }

            public void visitCallableReference(@NotNull IrCallableReference<?> irCallableReference) {
                IrElementVisitorVoid.DefaultImpls.visitCallableReference(this, irCallableReference);
            }

            public void visitCatch(@NotNull IrCatch irCatch) {
                IrElementVisitorVoid.DefaultImpls.visitCatch(this, irCatch);
            }

            public void visitClass(@NotNull IrClass irClass) {
                IrElementVisitorVoid.DefaultImpls.visitClass(this, irClass);
            }

            public void visitClassReference(@NotNull IrClassReference irClassReference) {
                IrElementVisitorVoid.DefaultImpls.visitClassReference(this, irClassReference);
            }

            public void visitComposite(@NotNull IrComposite irComposite) {
                IrElementVisitorVoid.DefaultImpls.visitComposite(this, irComposite);
            }

            public void visitConst(@NotNull IrConst<?> irConst) {
                IrElementVisitorVoid.DefaultImpls.visitConst(this, irConst);
            }

            public void visitConstantArray(@NotNull IrConstantArray irConstantArray) {
                IrElementVisitorVoid.DefaultImpls.visitConstantArray(this, irConstantArray);
            }

            public void visitConstantObject(@NotNull IrConstantObject irConstantObject) {
                IrElementVisitorVoid.DefaultImpls.visitConstantObject(this, irConstantObject);
            }

            public void visitConstantPrimitive(@NotNull IrConstantPrimitive irConstantPrimitive) {
                IrElementVisitorVoid.DefaultImpls.visitConstantPrimitive(this, irConstantPrimitive);
            }

            public void visitConstantValue(@NotNull IrConstantValue irConstantValue) {
                IrElementVisitorVoid.DefaultImpls.visitConstantValue(this, irConstantValue);
            }

            public void visitConstructor(@NotNull IrConstructor irConstructor) {
                IrElementVisitorVoid.DefaultImpls.visitConstructor(this, irConstructor);
            }

            public void visitConstructorCall(@NotNull IrConstructorCall irConstructorCall) {
                IrElementVisitorVoid.DefaultImpls.visitConstructorCall(this, irConstructorCall);
            }

            public void visitContainerExpression(@NotNull IrContainerExpression irContainerExpression) {
                IrElementVisitorVoid.DefaultImpls.visitContainerExpression(this, irContainerExpression);
            }

            public void visitContinue(@NotNull IrContinue irContinue) {
                IrElementVisitorVoid.DefaultImpls.visitContinue(this, irContinue);
            }

            public void visitDeclaration(@NotNull IrDeclarationBase irDeclarationBase) {
                IrElementVisitorVoid.DefaultImpls.visitDeclaration(this, irDeclarationBase);
            }

            public void visitDeclarationReference(@NotNull IrDeclarationReference irDeclarationReference) {
                IrElementVisitorVoid.DefaultImpls.visitDeclarationReference(this, irDeclarationReference);
            }

            public void visitDelegatingConstructorCall(@NotNull IrDelegatingConstructorCall irDelegatingConstructorCall) {
                IrElementVisitorVoid.DefaultImpls.visitDelegatingConstructorCall(this, irDelegatingConstructorCall);
            }

            public void visitDoWhileLoop(@NotNull IrDoWhileLoop irDoWhileLoop) {
                IrElementVisitorVoid.DefaultImpls.visitDoWhileLoop(this, irDoWhileLoop);
            }

            public void visitDynamicExpression(@NotNull IrDynamicExpression irDynamicExpression) {
                IrElementVisitorVoid.DefaultImpls.visitDynamicExpression(this, irDynamicExpression);
            }

            public void visitDynamicMemberExpression(@NotNull IrDynamicMemberExpression irDynamicMemberExpression) {
                IrElementVisitorVoid.DefaultImpls.visitDynamicMemberExpression(this, irDynamicMemberExpression);
            }

            public void visitDynamicOperatorExpression(@NotNull IrDynamicOperatorExpression irDynamicOperatorExpression) {
                IrElementVisitorVoid.DefaultImpls.visitDynamicOperatorExpression(this, irDynamicOperatorExpression);
            }

            public void visitElement(@NotNull IrElement irElement, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitElement(this, irElement, r2);
            }

            public void visitElseBranch(@NotNull IrElseBranch irElseBranch) {
                IrElementVisitorVoid.DefaultImpls.visitElseBranch(this, irElseBranch);
            }

            public void visitEnumConstructorCall(@NotNull IrEnumConstructorCall irEnumConstructorCall) {
                IrElementVisitorVoid.DefaultImpls.visitEnumConstructorCall(this, irEnumConstructorCall);
            }

            public void visitEnumEntry(@NotNull IrEnumEntry irEnumEntry) {
                IrElementVisitorVoid.DefaultImpls.visitEnumEntry(this, irEnumEntry);
            }

            public void visitErrorCallExpression(@NotNull IrErrorCallExpression irErrorCallExpression) {
                IrElementVisitorVoid.DefaultImpls.visitErrorCallExpression(this, irErrorCallExpression);
            }

            public void visitErrorDeclaration(@NotNull IrErrorDeclaration irErrorDeclaration) {
                IrElementVisitorVoid.DefaultImpls.visitErrorDeclaration(this, irErrorDeclaration);
            }

            public void visitErrorExpression(@NotNull IrErrorExpression irErrorExpression) {
                IrElementVisitorVoid.DefaultImpls.visitErrorExpression(this, irErrorExpression);
            }

            public void visitExpression(@NotNull IrExpression irExpression) {
                IrElementVisitorVoid.DefaultImpls.visitExpression(this, irExpression);
            }

            public void visitExpressionBody(@NotNull IrExpressionBody irExpressionBody) {
                IrElementVisitorVoid.DefaultImpls.visitExpressionBody(this, irExpressionBody);
            }

            public void visitExternalPackageFragment(@NotNull IrExternalPackageFragment irExternalPackageFragment) {
                IrElementVisitorVoid.DefaultImpls.visitExternalPackageFragment(this, irExternalPackageFragment);
            }

            public void visitField(@NotNull IrField irField) {
                IrElementVisitorVoid.DefaultImpls.visitField(this, irField);
            }

            public void visitFieldAccess(@NotNull IrFieldAccessExpression irFieldAccessExpression) {
                IrElementVisitorVoid.DefaultImpls.visitFieldAccess(this, irFieldAccessExpression);
            }

            public void visitFile(@NotNull IrFile irFile) {
                IrElementVisitorVoid.DefaultImpls.visitFile(this, irFile);
            }

            public void visitFunction(@NotNull IrFunction irFunction) {
                IrElementVisitorVoid.DefaultImpls.visitFunction(this, irFunction);
            }

            public void visitFunctionAccess(@NotNull IrFunctionAccessExpression irFunctionAccessExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitFunctionAccess(this, irFunctionAccessExpression, r2);
            }

            public void visitFunctionExpression(@NotNull IrFunctionExpression irFunctionExpression) {
                IrElementVisitorVoid.DefaultImpls.visitFunctionExpression(this, irFunctionExpression);
            }

            public void visitFunctionReference(@NotNull IrFunctionReference irFunctionReference) {
                IrElementVisitorVoid.DefaultImpls.visitFunctionReference(this, irFunctionReference);
            }

            public void visitGetClass(@NotNull IrGetClass irGetClass) {
                IrElementVisitorVoid.DefaultImpls.visitGetClass(this, irGetClass);
            }

            public void visitGetEnumValue(@NotNull IrGetEnumValue irGetEnumValue) {
                IrElementVisitorVoid.DefaultImpls.visitGetEnumValue(this, irGetEnumValue);
            }

            public void visitGetField(@NotNull IrGetField irGetField) {
                IrElementVisitorVoid.DefaultImpls.visitGetField(this, irGetField);
            }

            public void visitGetObjectValue(@NotNull IrGetObjectValue irGetObjectValue) {
                IrElementVisitorVoid.DefaultImpls.visitGetObjectValue(this, irGetObjectValue);
            }

            public void visitGetValue(@NotNull IrGetValue irGetValue) {
                IrElementVisitorVoid.DefaultImpls.visitGetValue(this, irGetValue);
            }

            public void visitInstanceInitializerCall(@NotNull IrInstanceInitializerCall irInstanceInitializerCall) {
                IrElementVisitorVoid.DefaultImpls.visitInstanceInitializerCall(this, irInstanceInitializerCall);
            }

            public void visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty irLocalDelegatedProperty) {
                IrElementVisitorVoid.DefaultImpls.visitLocalDelegatedProperty(this, irLocalDelegatedProperty);
            }

            public void visitLocalDelegatedPropertyReference(@NotNull IrLocalDelegatedPropertyReference irLocalDelegatedPropertyReference) {
                IrElementVisitorVoid.DefaultImpls.visitLocalDelegatedPropertyReference(this, irLocalDelegatedPropertyReference);
            }

            public void visitLoop(@NotNull IrLoop irLoop) {
                IrElementVisitorVoid.DefaultImpls.visitLoop(this, irLoop);
            }

            public void visitMemberAccess(@NotNull IrMemberAccessExpression<?> irMemberAccessExpression) {
                IrElementVisitorVoid.DefaultImpls.visitMemberAccess(this, irMemberAccessExpression);
            }

            public void visitModuleFragment(@NotNull IrModuleFragment irModuleFragment) {
                IrElementVisitorVoid.DefaultImpls.visitModuleFragment(this, irModuleFragment);
            }

            public void visitPackageFragment(@NotNull IrPackageFragment irPackageFragment) {
                IrElementVisitorVoid.DefaultImpls.visitPackageFragment(this, irPackageFragment);
            }

            public void visitProperty(@NotNull IrProperty irProperty) {
                IrElementVisitorVoid.DefaultImpls.visitProperty(this, irProperty);
            }

            public void visitPropertyReference(@NotNull IrPropertyReference irPropertyReference) {
                IrElementVisitorVoid.DefaultImpls.visitPropertyReference(this, irPropertyReference);
            }

            public void visitRawFunctionReference(@NotNull IrRawFunctionReference irRawFunctionReference) {
                IrElementVisitorVoid.DefaultImpls.visitRawFunctionReference(this, irRawFunctionReference);
            }

            public void visitReturn(@NotNull IrReturn irReturn) {
                IrElementVisitorVoid.DefaultImpls.visitReturn(this, irReturn);
            }

            public void visitScript(@NotNull IrScript irScript) {
                IrElementVisitorVoid.DefaultImpls.visitScript(this, irScript);
            }

            public void visitSetField(@NotNull IrSetField irSetField) {
                IrElementVisitorVoid.DefaultImpls.visitSetField(this, irSetField);
            }

            public void visitSetValue(@NotNull IrSetValue irSetValue) {
                IrElementVisitorVoid.DefaultImpls.visitSetValue(this, irSetValue);
            }

            public void visitSimpleFunction(@NotNull IrSimpleFunction irSimpleFunction) {
                IrElementVisitorVoid.DefaultImpls.visitSimpleFunction(this, irSimpleFunction);
            }

            public void visitSingletonReference(@NotNull IrGetSingletonValue irGetSingletonValue) {
                IrElementVisitorVoid.DefaultImpls.visitSingletonReference(this, irGetSingletonValue);
            }

            public void visitSpreadElement(@NotNull IrSpreadElement irSpreadElement) {
                IrElementVisitorVoid.DefaultImpls.visitSpreadElement(this, irSpreadElement);
            }

            public void visitStringConcatenation(@NotNull IrStringConcatenation irStringConcatenation) {
                IrElementVisitorVoid.DefaultImpls.visitStringConcatenation(this, irStringConcatenation);
            }

            public void visitSuspendableExpression(@NotNull IrSuspendableExpression irSuspendableExpression) {
                IrElementVisitorVoid.DefaultImpls.visitSuspendableExpression(this, irSuspendableExpression);
            }

            public void visitSuspensionPoint(@NotNull IrSuspensionPoint irSuspensionPoint) {
                IrElementVisitorVoid.DefaultImpls.visitSuspensionPoint(this, irSuspensionPoint);
            }

            public void visitSyntheticBody(@NotNull IrSyntheticBody irSyntheticBody) {
                IrElementVisitorVoid.DefaultImpls.visitSyntheticBody(this, irSyntheticBody);
            }

            public void visitThrow(@NotNull IrThrow irThrow) {
                IrElementVisitorVoid.DefaultImpls.visitThrow(this, irThrow);
            }

            public void visitTry(@NotNull IrTry irTry) {
                IrElementVisitorVoid.DefaultImpls.visitTry(this, irTry);
            }

            public void visitTypeAlias(@NotNull IrTypeAlias irTypeAlias) {
                IrElementVisitorVoid.DefaultImpls.visitTypeAlias(this, irTypeAlias);
            }

            public void visitTypeOperator(@NotNull IrTypeOperatorCall irTypeOperatorCall) {
                IrElementVisitorVoid.DefaultImpls.visitTypeOperator(this, irTypeOperatorCall);
            }

            public void visitTypeParameter(@NotNull IrTypeParameter irTypeParameter) {
                IrElementVisitorVoid.DefaultImpls.visitTypeParameter(this, irTypeParameter);
            }

            public void visitValueAccess(@NotNull IrValueAccessExpression irValueAccessExpression) {
                IrElementVisitorVoid.DefaultImpls.visitValueAccess(this, irValueAccessExpression);
            }

            public void visitValueParameter(@NotNull IrValueParameter irValueParameter, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitValueParameter(this, irValueParameter, r2);
            }

            public void visitVararg(@NotNull IrVararg irVararg) {
                IrElementVisitorVoid.DefaultImpls.visitVararg(this, irVararg);
            }

            public void visitVariable(@NotNull IrVariable irVariable) {
                IrElementVisitorVoid.DefaultImpls.visitVariable(this, irVariable);
            }

            public void visitWhen(@NotNull IrWhen irWhen) {
                IrElementVisitorVoid.DefaultImpls.visitWhen(this, irWhen);
            }

            public void visitWhileLoop(@NotNull IrWhileLoop irWhileLoop) {
                IrElementVisitorVoid.DefaultImpls.visitWhileLoop(this, irWhileLoop);
            }

            public void visitAnonymousInitializer(@NotNull IrAnonymousInitializer irAnonymousInitializer, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitAnonymousInitializer(this, irAnonymousInitializer, r2);
            }

            public void visitBlock(@NotNull IrBlock irBlock, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitBlock(this, irBlock, r2);
            }

            public void visitBlockBody(@NotNull IrBlockBody irBlockBody, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitBlockBody(this, irBlockBody, r2);
            }

            public void visitBody(@NotNull IrBody irBody, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitBody(this, irBody, r2);
            }

            public void visitBranch(@NotNull IrBranch irBranch, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitBranch(this, irBranch, r2);
            }

            public void visitBreak(@NotNull IrBreak irBreak, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitBreak(this, irBreak, r2);
            }

            public void visitBreakContinue(@NotNull IrBreakContinue irBreakContinue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitBreakContinue(this, irBreakContinue, r2);
            }

            public void visitCall(@NotNull IrCall irCall, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitCall(this, irCall, r2);
            }

            public void visitCallableReference(@NotNull IrCallableReference<?> irCallableReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitCallableReference(this, irCallableReference, r2);
            }

            public void visitCatch(@NotNull IrCatch irCatch, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitCatch(this, irCatch, r2);
            }

            public void visitClass(@NotNull IrClass irClass, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitClass(this, irClass, r2);
            }

            public void visitClassReference(@NotNull IrClassReference irClassReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitClassReference(this, irClassReference, r2);
            }

            public void visitComposite(@NotNull IrComposite irComposite, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitComposite(this, irComposite, r2);
            }

            public void visitConst(@NotNull IrConst<?> irConst, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConst(this, irConst, r2);
            }

            public void visitConstantArray(@NotNull IrConstantArray irConstantArray, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConstantArray(this, irConstantArray, r2);
            }

            public void visitConstantObject(@NotNull IrConstantObject irConstantObject, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConstantObject(this, irConstantObject, r2);
            }

            public void visitConstantPrimitive(@NotNull IrConstantPrimitive irConstantPrimitive, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConstantPrimitive(this, irConstantPrimitive, r2);
            }

            public void visitConstantValue(@NotNull IrConstantValue irConstantValue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConstantValue(this, irConstantValue, r2);
            }

            public void visitConstructor(@NotNull IrConstructor irConstructor, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConstructor(this, irConstructor, r2);
            }

            public void visitConstructorCall(@NotNull IrConstructorCall irConstructorCall, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitConstructorCall(this, irConstructorCall, r2);
            }

            public void visitContainerExpression(@NotNull IrContainerExpression irContainerExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitContainerExpression(this, irContainerExpression, r2);
            }

            public void visitContinue(@NotNull IrContinue irContinue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitContinue(this, irContinue, r2);
            }

            public void visitDeclaration(@NotNull IrDeclarationBase irDeclarationBase, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDeclaration(this, irDeclarationBase, r2);
            }

            public void visitDeclarationReference(@NotNull IrDeclarationReference irDeclarationReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDeclarationReference(this, irDeclarationReference, r2);
            }

            public void visitDelegatingConstructorCall(@NotNull IrDelegatingConstructorCall irDelegatingConstructorCall, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDelegatingConstructorCall(this, irDelegatingConstructorCall, r2);
            }

            public void visitDoWhileLoop(@NotNull IrDoWhileLoop irDoWhileLoop, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDoWhileLoop(this, irDoWhileLoop, r2);
            }

            public void visitDynamicExpression(@NotNull IrDynamicExpression irDynamicExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDynamicExpression(this, irDynamicExpression, r2);
            }

            public void visitDynamicMemberExpression(@NotNull IrDynamicMemberExpression irDynamicMemberExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDynamicMemberExpression(this, irDynamicMemberExpression, r2);
            }

            public void visitDynamicOperatorExpression(@NotNull IrDynamicOperatorExpression irDynamicOperatorExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitDynamicOperatorExpression(this, irDynamicOperatorExpression, r2);
            }

            public void visitElement(@NotNull IrElement element2) {
                Intrinsics.checkNotNullParameter(element2, "element");
                IrVisitorsKt.acceptChildrenVoid(element2, this);
            }

            public void visitElseBranch(@NotNull IrElseBranch irElseBranch, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitElseBranch(this, irElseBranch, r2);
            }

            public void visitEnumConstructorCall(@NotNull IrEnumConstructorCall irEnumConstructorCall, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitEnumConstructorCall(this, irEnumConstructorCall, r2);
            }

            public void visitEnumEntry(@NotNull IrEnumEntry irEnumEntry, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitEnumEntry(this, irEnumEntry, r2);
            }

            public void visitErrorCallExpression(@NotNull IrErrorCallExpression irErrorCallExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitErrorCallExpression(this, irErrorCallExpression, r2);
            }

            public void visitErrorDeclaration(@NotNull IrErrorDeclaration irErrorDeclaration, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitErrorDeclaration(this, irErrorDeclaration, r2);
            }

            public void visitErrorExpression(@NotNull IrErrorExpression irErrorExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitErrorExpression(this, irErrorExpression, r2);
            }

            public void visitExpression(@NotNull IrExpression irExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitExpression(this, irExpression, r2);
            }

            public void visitExpressionBody(@NotNull IrExpressionBody irExpressionBody, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitExpressionBody(this, irExpressionBody, r2);
            }

            public void visitExternalPackageFragment(@NotNull IrExternalPackageFragment irExternalPackageFragment, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitExternalPackageFragment(this, irExternalPackageFragment, r2);
            }

            public void visitField(@NotNull IrField irField, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitField(this, irField, r2);
            }

            public void visitFieldAccess(@NotNull IrFieldAccessExpression irFieldAccessExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitFieldAccess(this, irFieldAccessExpression, r2);
            }

            public void visitFile(@NotNull IrFile irFile, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitFile(this, irFile, r2);
            }

            public void visitFunction(@NotNull IrFunction irFunction, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitFunction(this, irFunction, r2);
            }

            public void visitFunctionAccess(@NotNull IrFunctionAccessExpression expression) {
                IrExpression valueArgument;
                IrFunctionSymbol irFunctionSymbolUnwrapInlineLambda;
                Intrinsics.checkNotNullParameter(expression, "expression");
                IrVisitorsKt.acceptChildrenVoid((IrElement) expression, this);
                IrFunction owner = expression.getSymbol().getOwner();
                if (IrInlineReferenceLocatorKt.isInlineFunctionCall(owner, ComposeInlineLambdaLocator.this.context)) {
                    for (IrValueParameter irValueParameter : owner.getValueParameters()) {
                        if (JvmIrInlineUtilsKt.isInlineParameter(irValueParameter) && (valueArgument = expression.getValueArgument(irValueParameter.getIndex())) != null && (irFunctionSymbolUnwrapInlineLambda = IrInlineReferenceLocatorKt.unwrapInlineLambda(valueArgument)) != null) {
                            ComposeInlineLambdaLocator.this.inlineLambdaToParameter.put(irFunctionSymbolUnwrapInlineLambda, irValueParameter);
                        }
                    }
                }
            }

            public void visitFunctionExpression(@NotNull IrFunctionExpression irFunctionExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitFunctionExpression(this, irFunctionExpression, r2);
            }

            public void visitFunctionReference(@NotNull IrFunctionReference irFunctionReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitFunctionReference(this, irFunctionReference, r2);
            }

            public void visitGetClass(@NotNull IrGetClass irGetClass, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitGetClass(this, irGetClass, r2);
            }

            public void visitGetEnumValue(@NotNull IrGetEnumValue irGetEnumValue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitGetEnumValue(this, irGetEnumValue, r2);
            }

            public void visitGetField(@NotNull IrGetField irGetField, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitGetField(this, irGetField, r2);
            }

            public void visitGetObjectValue(@NotNull IrGetObjectValue irGetObjectValue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitGetObjectValue(this, irGetObjectValue, r2);
            }

            public void visitGetValue(@NotNull IrGetValue irGetValue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitGetValue(this, irGetValue, r2);
            }

            public void visitInstanceInitializerCall(@NotNull IrInstanceInitializerCall irInstanceInitializerCall, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitInstanceInitializerCall(this, irInstanceInitializerCall, r2);
            }

            public void visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty irLocalDelegatedProperty, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitLocalDelegatedProperty(this, irLocalDelegatedProperty, r2);
            }

            public void visitLocalDelegatedPropertyReference(@NotNull IrLocalDelegatedPropertyReference irLocalDelegatedPropertyReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitLocalDelegatedPropertyReference(this, irLocalDelegatedPropertyReference, r2);
            }

            public void visitLoop(@NotNull IrLoop irLoop, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitLoop(this, irLoop, r2);
            }

            public void visitMemberAccess(@NotNull IrMemberAccessExpression<?> irMemberAccessExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitMemberAccess(this, irMemberAccessExpression, r2);
            }

            public void visitModuleFragment(@NotNull IrModuleFragment irModuleFragment, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitModuleFragment(this, irModuleFragment, r2);
            }

            public void visitPackageFragment(@NotNull IrPackageFragment irPackageFragment, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitPackageFragment(this, irPackageFragment, r2);
            }

            public void visitProperty(@NotNull IrProperty irProperty, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitProperty(this, irProperty, r2);
            }

            public void visitPropertyReference(@NotNull IrPropertyReference irPropertyReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitPropertyReference(this, irPropertyReference, r2);
            }

            public void visitRawFunctionReference(@NotNull IrRawFunctionReference irRawFunctionReference, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitRawFunctionReference(this, irRawFunctionReference, r2);
            }

            public void visitReturn(@NotNull IrReturn irReturn, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitReturn(this, irReturn, r2);
            }

            public void visitScript(@NotNull IrScript irScript, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitScript(this, irScript, r2);
            }

            public void visitSetField(@NotNull IrSetField irSetField, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSetField(this, irSetField, r2);
            }

            public void visitSetValue(@NotNull IrSetValue irSetValue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSetValue(this, irSetValue, r2);
            }

            public void visitSimpleFunction(@NotNull IrSimpleFunction irSimpleFunction, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSimpleFunction(this, irSimpleFunction, r2);
            }

            public void visitSingletonReference(@NotNull IrGetSingletonValue irGetSingletonValue, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSingletonReference(this, irGetSingletonValue, r2);
            }

            public void visitSpreadElement(@NotNull IrSpreadElement irSpreadElement, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSpreadElement(this, irSpreadElement, r2);
            }

            public void visitStringConcatenation(@NotNull IrStringConcatenation irStringConcatenation, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitStringConcatenation(this, irStringConcatenation, r2);
            }

            public void visitSuspendableExpression(@NotNull IrSuspendableExpression irSuspendableExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSuspendableExpression(this, irSuspendableExpression, r2);
            }

            public void visitSuspensionPoint(@NotNull IrSuspensionPoint irSuspensionPoint, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSuspensionPoint(this, irSuspensionPoint, r2);
            }

            public void visitSyntheticBody(@NotNull IrSyntheticBody irSyntheticBody, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitSyntheticBody(this, irSyntheticBody, r2);
            }

            public void visitThrow(@NotNull IrThrow irThrow, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitThrow(this, irThrow, r2);
            }

            public void visitTry(@NotNull IrTry irTry, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitTry(this, irTry, r2);
            }

            public void visitTypeAlias(@NotNull IrTypeAlias irTypeAlias, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitTypeAlias(this, irTypeAlias, r2);
            }

            public void visitTypeOperator(@NotNull IrTypeOperatorCall irTypeOperatorCall, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitTypeOperator(this, irTypeOperatorCall, r2);
            }

            public void visitTypeParameter(@NotNull IrTypeParameter irTypeParameter, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitTypeParameter(this, irTypeParameter, r2);
            }

            public void visitValueAccess(@NotNull IrValueAccessExpression irValueAccessExpression, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitValueAccess(this, irValueAccessExpression, r2);
            }

            public void visitValueParameter(@NotNull IrValueParameter declaration) {
                IrExpressionBody defaultValue;
                IrExpression expression;
                IrFunctionSymbol irFunctionSymbolUnwrapInlineLambda;
                Intrinsics.checkNotNullParameter(declaration, "declaration");
                IrVisitorsKt.acceptChildrenVoid((IrElement) declaration, this);
                IrFunction parent = declaration.getParent();
                IrFunction irFunction = parent instanceof IrFunction ? parent : null;
                boolean z = false;
                if (irFunction != null && IrInlineReferenceLocatorKt.isInlineFunctionCall(irFunction, ComposeInlineLambdaLocator.this.context)) {
                    z = true;
                }
                if (!z || !JvmIrInlineUtilsKt.isInlineParameter(declaration) || (defaultValue = declaration.getDefaultValue()) == null || (expression = defaultValue.getExpression()) == null || (irFunctionSymbolUnwrapInlineLambda = IrInlineReferenceLocatorKt.unwrapInlineLambda(expression)) == null) {
                    return;
                }
                ComposeInlineLambdaLocator.this.inlineLambdaToParameter.put(irFunctionSymbolUnwrapInlineLambda, declaration);
            }

            public void visitVararg(@NotNull IrVararg irVararg, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitVararg(this, irVararg, r2);
            }

            public void visitVariable(@NotNull IrVariable irVariable, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitVariable(this, irVariable, r2);
            }

            public void visitWhen(@NotNull IrWhen irWhen, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitWhen(this, irWhen, r2);
            }

            public void visitWhileLoop(@NotNull IrWhileLoop irWhileLoop, @Nullable Void r2) {
                IrElementVisitorVoid.DefaultImpls.visitWhileLoop(this, irWhileLoop, r2);
            }
        });
    }
}
