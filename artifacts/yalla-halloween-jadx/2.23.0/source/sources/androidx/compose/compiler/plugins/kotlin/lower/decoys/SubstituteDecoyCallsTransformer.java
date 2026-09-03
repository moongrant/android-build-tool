package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.lower.ComposerParamTransformer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.declarations.lazy.IrLazyFunctionBase;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrDelegatingConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionReference;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DeepCopyTypeRemapper;
import org.jetbrains.kotlin.ir.util.DescriptorsRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.util.SymbolRemapper;
import org.jetbrains.kotlin.ir.util.TypeRemapper;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid;
import org.jetbrains.kotlin.ir.visitors.IrVisitorsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\r\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u00020\u0014*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/SubstituteDecoyCallsTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "signatureBuilder", "Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "addComposerParameterInplace", "androidx/compose/compiler/plugins/kotlin/lower/decoys/SubstituteDecoyCallsTransformer$addComposerParameterInplace$1", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/SubstituteDecoyCallsTransformer$addComposerParameterInplace$1;", "decoysTransformer", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer;", "lazyDeclarationsCache", "", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "decoyOwner", "getDecoyOwner", "(Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;)Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitCall", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "visitConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "visitDelegatingConstructorCall", "Lorg/jetbrains/kotlin/ir/expressions/IrDelegatingConstructorCall;", "visitFunctionReference", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionReference;", "visitGetValue", "Lorg/jetbrains/kotlin/ir/expressions/IrGetValue;", "visitSimpleFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubstituteDecoyCallsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubstituteDecoyCallsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/SubstituteDecoyCallsTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt\n+ 4 DeepCopyIrTreeWithSymbols.kt\norg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbolsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,267:1\n1549#2:268\n1620#2,3:269\n205#3:272\n206#3,9:283\n205#3:292\n206#3,9:303\n205#3:312\n206#3,9:323\n205#3:332\n206#3,9:343\n27#4,10:273\n27#4,10:293\n27#4,10:313\n27#4,10:333\n361#5,7:352\n*S KotlinDebug\n*F\n+ 1 SubstituteDecoyCallsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/SubstituteDecoyCallsTransformer\n*L\n117#1:268\n117#1:269,3\n150#1:272\n150#1:283,9\n175#1:292\n175#1:303,9\n200#1:312\n200#1:323,9\n224#1:332\n224#1:343,9\n150#1:273,10\n175#1:293,10\n200#1:313,10\n224#1:333,10\n253#1:352,7\n*E\n"})
public final class SubstituteDecoyCallsTransformer extends AbstractDecoysLowering {

    @NotNull
    private final SubstituteDecoyCallsTransformer$addComposerParameterInplace$1 addComposerParameterInplace;

    @NotNull
    private final CreateDecoysTransformer decoysTransformer;

    @NotNull
    private final Map<IrFunctionSymbol, IrFunction> lazyDeclarationsCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.compiler.plugins.kotlin.lower.decoys.SubstituteDecoyCallsTransformer$addComposerParameterInplace$1] */
    public SubstituteDecoyCallsTransformer(@NotNull IrPluginContext pluginContext, @NotNull final DeepCopySymbolRemapper symbolRemapper, @NotNull IdSignatureSerializer signatureBuilder, @NotNull final ModuleMetrics metrics) {
        super(pluginContext, symbolRemapper, metrics, signatureBuilder);
        Intrinsics.checkNotNullParameter(pluginContext, "pluginContext");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(signatureBuilder, "signatureBuilder");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.decoysTransformer = new CreateDecoysTransformer(pluginContext, symbolRemapper, signatureBuilder, metrics);
        this.lazyDeclarationsCache = new LinkedHashMap();
        this.addComposerParameterInplace = new IrElementTransformerVoid(this, symbolRemapper, metrics) { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.SubstituteDecoyCallsTransformer$addComposerParameterInplace$1

            @NotNull
            private final ComposerParamTransformer сomposerParamTransformer;

            {
                this.сomposerParamTransformer = new ComposerParamTransformer(this.getContext(), symbolRemapper, true, metrics);
            }

            @NotNull
            public IrStatement visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
                Intrinsics.checkNotNullParameter(declaration, "declaration");
                return this.сomposerParamTransformer.visitSimpleFunction(declaration);
            }
        };
    }

    private final IrFunction getDecoyOwner(IrFunctionSymbol irFunctionSymbol) {
        IrStatement irStatementVisitConstructor;
        if (!(irFunctionSymbol.getOwner() instanceof IrLazyFunctionBase) || DecoyTransformBaseKt.isDecoy(irFunctionSymbol.getOwner())) {
            return irFunctionSymbol.getOwner();
        }
        Map<IrFunctionSymbol, IrFunction> map = this.lazyDeclarationsCache;
        IrFunction owner = map.get(irFunctionSymbol);
        if (owner == null) {
            IrSimpleFunction owner2 = irFunctionSymbol.getOwner();
            if (shouldBeRemapped(owner2)) {
                if (owner2 instanceof IrSimpleFunction) {
                    irStatementVisitConstructor = this.decoysTransformer.visitSimpleFunction(owner2);
                } else {
                    irStatementVisitConstructor = owner2 instanceof IrConstructor ? this.decoysTransformer.visitConstructor((IrConstructor) owner2) : this.decoysTransformer.visitFunction(owner2);
                }
                this.decoysTransformer.updateParents();
                IrElementTransformerVoidKt.transformChildrenVoid(irFunctionSymbol.getOwner().getParent(), this.addComposerParameterInplace);
                Intrinsics.checkNotNull(irStatementVisitConstructor, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrFunction");
                owner = (IrFunction) irStatementVisitConstructor;
            } else {
                owner = irFunctionSymbol.getOwner();
            }
            map.put(irFunctionSymbol, owner);
        }
        return owner;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElement irElement = (IrElement) module;
        transformChildrenVoid(irElement);
        PatchDeclarationParentsKt.patchDeclarationParents$default(irElement, (IrDeclarationParent) null, 1, (Object) null);
    }

    @NotNull
    public IrExpression visitCall(@NotNull IrCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrTypeParametersContainer decoyOwner = getDecoyOwner((IrFunctionSymbol) expression.getSymbol());
        if (!DecoyTransformBaseKt.isDecoy((IrDeclaration) decoyOwner)) {
            return super.visitCall(expression);
        }
        IrDeclarationParent owner = getComposableForDecoy(decoyOwner).getOwner();
        Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
        IrDeclarationParent irDeclarationParent = (IrSimpleFunction) owner;
        IrElement irCallImpl = new IrCallImpl(expression.getStartOffset(), expression.getEndOffset(), IrUtilsKt.remapTypeParameters$default(expression.getType(), decoyOwner, (IrTypeParametersContainer) irDeclarationParent, (Map) null, 4, (Object) null), irDeclarationParent.getSymbol(), expression.getTypeArgumentsCount(), expression.getValueArgumentsCount(), expression.getOrigin(), expression.getSuperQualifierSymbol());
        IrUtilsKt.copyTypeAndValueArgumentsFrom$default((IrMemberAccessExpression) irCallImpl, (IrMemberAccessExpression) expression, false, false, 6, (Object) null);
        IrElement irElement = irCallImpl;
        SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
        IrVisitorsKt.acceptVoid(irElement, (IrElementVisitorVoid) deepCopySymbolRemapper);
        SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
        DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
        IrDeclarationParent irDeclarationParent2 = (IrFunction) irDeclarationParent;
        IrElementTransformer deepCopyIrTreeWithSymbols = new DeepCopyIrTreeWithSymbols(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, decoyOwner, irDeclarationParent2));
        deepCopyTypeRemapper.setDeepCopy(deepCopyIrTreeWithSymbols);
        IrCallImpl irCallImplPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement.transform(deepCopyIrTreeWithSymbols, (Object) null), irDeclarationParent2);
        if (irCallImplPatchDeclarationParents != null) {
            return super.visitCall((IrCall) ((IrElement) irCallImplPatchDeclarationParents));
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl");
    }

    @NotNull
    public IrExpression visitConstructorCall(@NotNull IrConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrTypeParametersContainer decoyOwner = getDecoyOwner((IrFunctionSymbol) expression.getSymbol());
        if (!DecoyTransformBaseKt.isDecoy((IrDeclaration) decoyOwner)) {
            return super.visitConstructorCall(expression);
        }
        IrDeclarationParent owner = getComposableForDecoy(decoyOwner).getOwner();
        Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrConstructor");
        IrDeclarationParent irDeclarationParent = (IrConstructor) owner;
        IrConstructorSymbol symbol = irDeclarationParent.getSymbol();
        IrStatementOrigin origin = expression.getOrigin();
        IrElement irConstructorCallImpl = new IrConstructorCallImpl(expression.getStartOffset(), expression.getEndOffset(), IrUtilsKt.remapTypeParameters$default(expression.getType(), decoyOwner, (IrTypeParametersContainer) irDeclarationParent, (Map) null, 4, (Object) null), symbol, expression.getTypeArgumentsCount(), expression.getConstructorTypeArgumentsCount(), expression.getValueArgumentsCount(), origin, (SourceElement) null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, (DefaultConstructorMarker) null);
        IrUtilsKt.copyTypeAndValueArgumentsFrom$default((IrMemberAccessExpression) irConstructorCallImpl, (IrMemberAccessExpression) expression, false, false, 6, (Object) null);
        IrElement irElement = irConstructorCallImpl;
        SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
        IrVisitorsKt.acceptVoid(irElement, (IrElementVisitorVoid) deepCopySymbolRemapper);
        SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
        DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
        IrDeclarationParent irDeclarationParent2 = (IrFunction) irDeclarationParent;
        IrElementTransformer deepCopyIrTreeWithSymbols = new DeepCopyIrTreeWithSymbols(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, decoyOwner, irDeclarationParent2));
        deepCopyTypeRemapper.setDeepCopy(deepCopyIrTreeWithSymbols);
        IrConstructorCallImpl irConstructorCallImplPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement.transform(deepCopyIrTreeWithSymbols, (Object) null), irDeclarationParent2);
        if (irConstructorCallImplPatchDeclarationParents != null) {
            return super.visitConstructorCall((IrConstructorCall) ((IrElement) irConstructorCallImplPatchDeclarationParents));
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl");
    }

    @NotNull
    public IrExpression visitDelegatingConstructorCall(@NotNull IrDelegatingConstructorCall expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrTypeParametersContainer decoyOwner = getDecoyOwner((IrFunctionSymbol) expression.getSymbol());
        if (!DecoyTransformBaseKt.isDecoy((IrDeclaration) decoyOwner)) {
            return super.visitDelegatingConstructorCall(expression);
        }
        IrDeclarationParent owner = getComposableForDecoy(decoyOwner).getOwner();
        Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrConstructor");
        IrDeclarationParent irDeclarationParent = (IrConstructor) owner;
        IrElement irDelegatingConstructorCallImpl = new IrDelegatingConstructorCallImpl(expression.getStartOffset(), expression.getEndOffset(), IrUtilsKt.remapTypeParameters$default(expression.getType(), decoyOwner, (IrTypeParametersContainer) irDeclarationParent, (Map) null, 4, (Object) null), irDeclarationParent.getSymbol(), expression.getTypeArgumentsCount(), expression.getValueArgumentsCount());
        IrUtilsKt.copyTypeAndValueArgumentsFrom$default((IrMemberAccessExpression) irDelegatingConstructorCallImpl, (IrMemberAccessExpression) expression, false, false, 6, (Object) null);
        IrElement irElement = irDelegatingConstructorCallImpl;
        SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
        IrVisitorsKt.acceptVoid(irElement, (IrElementVisitorVoid) deepCopySymbolRemapper);
        SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
        DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
        IrDeclarationParent irDeclarationParent2 = (IrFunction) irDeclarationParent;
        IrElementTransformer deepCopyIrTreeWithSymbols = new DeepCopyIrTreeWithSymbols(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, decoyOwner, irDeclarationParent2));
        deepCopyTypeRemapper.setDeepCopy(deepCopyIrTreeWithSymbols);
        IrDelegatingConstructorCallImpl irDelegatingConstructorCallImplPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement.transform(deepCopyIrTreeWithSymbols, (Object) null), irDeclarationParent2);
        if (irDelegatingConstructorCallImplPatchDeclarationParents != null) {
            return super.visitDelegatingConstructorCall((IrDelegatingConstructorCall) ((IrElement) irDelegatingConstructorCallImplPatchDeclarationParents));
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl");
    }

    @NotNull
    public IrExpression visitFunctionReference(@NotNull IrFunctionReference expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrTypeParametersContainer decoyOwner = getDecoyOwner((IrFunctionSymbol) expression.getSymbol());
        if (!DecoyTransformBaseKt.isDecoy((IrDeclaration) decoyOwner)) {
            return super.visitFunctionReference(expression);
        }
        IrDeclarationParent owner = getComposableForDecoy(decoyOwner).getOwner();
        Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
        IrDeclarationParent irDeclarationParent = (IrSimpleFunction) owner;
        IrFunctionSymbol symbol = irDeclarationParent.getSymbol();
        IrFunctionSymbol irFunctionSymbol = symbol;
        IrElement irFunctionReferenceImpl = new IrFunctionReferenceImpl(expression.getStartOffset(), expression.getEndOffset(), IrUtilsKt.remapTypeParameters$default(expression.getType(), decoyOwner, (IrTypeParametersContainer) irDeclarationParent, (Map) null, 4, (Object) null), irFunctionSymbol, expression.getTypeArgumentsCount(), expression.getValueArgumentsCount(), expression.getReflectionTarget(), expression.getOrigin());
        IrUtilsKt.copyTypeAndValueArgumentsFrom$default((IrMemberAccessExpression) irFunctionReferenceImpl, (IrMemberAccessExpression) expression, false, false, 6, (Object) null);
        IrElement irElement = irFunctionReferenceImpl;
        SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
        IrVisitorsKt.acceptVoid(irElement, (IrElementVisitorVoid) deepCopySymbolRemapper);
        SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
        DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
        IrDeclarationParent irDeclarationParent2 = (IrFunction) irDeclarationParent;
        IrElementTransformer deepCopyIrTreeWithSymbols = new DeepCopyIrTreeWithSymbols(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, decoyOwner, irDeclarationParent2));
        deepCopyTypeRemapper.setDeepCopy(deepCopyIrTreeWithSymbols);
        IrFunctionReferenceImpl irFunctionReferenceImplPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement.transform(deepCopyIrTreeWithSymbols, (Object) null), irDeclarationParent2);
        if (irFunctionReferenceImplPatchDeclarationParents != null) {
            return super.visitFunctionReference((IrFunctionReference) ((IrElement) irFunctionReferenceImplPatchDeclarationParents));
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.impl.IrFunctionReferenceImpl");
    }

    @NotNull
    public IrExpression visitGetValue(@NotNull IrGetValue expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        IrExpression irExpressionVisitGetValue = super.visitGetValue(expression);
        IrValueParameter owner = expression.getSymbol().getOwner();
        IrValueParameter irValueParameter = owner instanceof IrValueParameter ? owner : null;
        if (irValueParameter == null) {
            return irExpressionVisitGetValue;
        }
        IrConstructor parent = irValueParameter.getParent();
        IrConstructor irConstructor = parent instanceof IrConstructor ? parent : null;
        if (irConstructor == null || !DecoyTransformBaseKt.isDecoy((IrDeclaration) irConstructor)) {
            return irExpressionVisitGetValue;
        }
        IrConstructor owner2 = getComposableForDecoy((IrFunction) irConstructor).getOwner();
        Intrinsics.checkNotNull(owner2, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrConstructor");
        return irGet((IrValueDeclaration) ((IrValueParameter) owner2.getValueParameters().get(irValueParameter.getIndex())));
    }

    @NotNull
    public IrStatement visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (DecoyTransformBaseKt.isDecoy((IrDeclaration) declaration)) {
            return super.visitSimpleFunction(declaration);
        }
        List<IrSimpleFunctionSymbol> overriddenSymbols = declaration.getOverriddenSymbols();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(overriddenSymbols, 10));
        for (IrSimpleFunctionSymbol irSimpleFunctionSymbol : overriddenSymbols) {
            IrDeclaration decoyOwner = getDecoyOwner((IrFunctionSymbol) irSimpleFunctionSymbol);
            if (DecoyTransformBaseKt.isDecoy(decoyOwner)) {
                IrFunctionSymbol composableForDecoy = getComposableForDecoy(decoyOwner);
                Intrinsics.checkNotNull(composableForDecoy, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol");
                irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) composableForDecoy;
            }
            arrayList.add(irSimpleFunctionSymbol);
        }
        declaration.setOverriddenSymbols(arrayList);
        return super.visitSimpleFunction(declaration);
    }
}
