package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.KtxNameConventions;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBaseKt;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.ir.IrInlineUtilsKt;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrTypeUtilsKt;
import org.jetbrains.kotlin.descriptors.FunctionDescriptor;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrValueParameterBuilder;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrLocalDelegatedProperty;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrExpressionsKt;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference;
import org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression;
import org.jetbrains.kotlin.ir.expressions.IrReturn;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrLocalDelegatedPropertyReferenceImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DeepCopyTypeRemapper;
import org.jetbrains.kotlin.ir.util.DescriptorsRemapper;
import org.jetbrains.kotlin.ir.util.InlineClassesKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.util.SymbolRemapper;
import org.jetbrains.kotlin.ir.util.SymbolRenamer;
import org.jetbrains.kotlin.ir.util.TypeRemapper;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid;
import org.jetbrains.kotlin.ir.visitors.IrVisitorsKt;
import org.jetbrains.kotlin.load.java.JvmAbi;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.name.StandardClassIds;
import org.jetbrains.kotlin.platform.JsPlatformKt;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;
import org.jetbrains.kotlin.resolve.DescriptorUtils;
import org.jetbrains.kotlin.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000fH\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0014H\u0016J\f\u0010-\u001a\u00020\u0014*\u00020\u0014H\u0002J\f\u0010.\u001a\u00020\u0014*\u00020\u0014H\u0002J \u0010/\u001a\u00020\u001a*\u00020\r2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000201H\u0002J\f\u00103\u001a\u00020\b*\u000204H\u0002J\u0014\u00105\u001a\u00020\b*\u00020\u00142\u0006\u00106\u001a\u000201H\u0002J\f\u00107\u001a\u00020\u0014*\u00020\u0014H\u0002J\f\u00108\u001a\u00020\b*\u00020\u0014H\u0002J\f\u00109\u001a\u00020\u0014*\u00020\u0014H\u0002J\u0012\u00109\u001a\u00020:*\u00020:2\u0006\u0010;\u001a\u00020\u001cR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposerParamTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "decoysEnabled", "", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;ZLandroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "composerType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "currentModule", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "inlineLambdaInfo", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposeInlineLambdaLocator;", "transformedFunctionSet", "", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "transformedFunctions", "", "createComposableAnnotation", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrConstructorCallImpl;", "defaultArgumentFor", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "param", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "defaultParameterType", "jvmNameAnnotation", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "name", "", "lower", "", "module", "visitLocalDelegatedProperty", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrLocalDelegatedProperty;", "visitLocalDelegatedPropertyReference", "expression", "Lorg/jetbrains/kotlin/ir/expressions/IrLocalDelegatedPropertyReference;", "visitSimpleFunction", "copy", "copyWithComposerParam", "defaultValue", "startOffset", "", "endOffset", "externallyTransformed", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "hasDefaultExpressionDefinedForValueParameter", "index", "lambdaInvokeWithComposerParam", "requiresDefaultParameter", "withComposerParamIfNeeded", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "composerParam", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposerParamTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerParamTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerParamTransformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt\n+ 6 DeepCopyIrTreeWithSymbols.kt\norg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbolsKt\n+ 7 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n*L\n1#1,652:1\n1#2:653\n1747#3,3:654\n1549#3:659\n1620#3,2:660\n1622#3:685\n1747#3,3:711\n1747#3,3:714\n1747#3,3:717\n1549#3:720\n1620#3,3:721\n288#3,2:733\n123#4,2:657\n123#4,2:709\n206#5:662\n207#5,12:673\n206#5:686\n207#5,12:697\n26#6,10:663\n26#6,10:687\n276#7,9:724\n*S KotlinDebug\n*F\n+ 1 ComposerParamTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerParamTransformer\n*L\n267#1:654,3\n413#1:659\n413#1:660,2\n413#1:685\n469#1:711,3\n470#1:714,3\n481#1:717,3\n500#1:720\n500#1:721,3\n648#1:733,2\n365#1:657,2\n444#1:709,2\n430#1:662\n430#1:673,12\n438#1:686\n438#1:697,12\n430#1:663,10\n438#1:687,10\n530#1:724,9\n*E\n"})
public final class ComposerParamTransformer extends AbstractComposeLowering {

    @NotNull
    private final IrType composerType;

    @Nullable
    private IrModuleFragment currentModule;
    private final boolean decoysEnabled;

    @NotNull
    private ComposeInlineLambdaLocator inlineLambdaInfo;

    @NotNull
    private final Set<IrSimpleFunction> transformedFunctionSet;

    @NotNull
    private final Map<IrSimpleFunction, IrSimpleFunction> transformedFunctions;

    public ComposerParamTransformer(@NotNull IrPluginContext irPluginContext, @NotNull DeepCopySymbolRemapper deepCopySymbolRemapper, boolean z, @NotNull ModuleMetrics moduleMetrics) {
        super(irPluginContext, deepCopySymbolRemapper, moduleMetrics);
        this.decoysEnabled = z;
        this.inlineLambdaInfo = new ComposeInlineLambdaLocator(irPluginContext);
        this.transformedFunctions = new LinkedHashMap();
        this.transformedFunctionSet = new LinkedHashSet();
        this.composerType = replaceArgumentsWithStarProjections((IrType) IrUtilsKt.getDefaultType(getComposerIrClass()));
    }

    private final IrSimpleFunction copy(IrSimpleFunction irSimpleFunction) {
        IrBody irBody;
        IrExpressionBody irExpressionBody;
        IrFunction irFunctionCreateFunction = getContext().getIrFactory().createFunction(irSimpleFunction.getStartOffset(), irSimpleFunction.getEndOffset(), irSimpleFunction.getOrigin(), new IrSimpleFunctionSymbolImpl((FunctionDescriptor) null, 1, (DefaultConstructorMarker) null), irSimpleFunction.getName(), irSimpleFunction.getVisibility(), irSimpleFunction.getModality(), irSimpleFunction.getReturnType(), irSimpleFunction.isInline(), irSimpleFunction.isExternal(), irSimpleFunction.isTailrec(), irSimpleFunction.isSuspend(), irSimpleFunction.isOperator(), irSimpleFunction.isInfix(), irSimpleFunction.isExpect(), irSimpleFunction.isFakeOverride(), irSimpleFunction.getContainerSource());
        IrDeclarationsKt.copyAttributes((IrAttributeContainer) irFunctionCreateFunction, (IrAttributeContainer) irSimpleFunction);
        IrPropertySymbol correspondingPropertySymbol = irSimpleFunction.getCorrespondingPropertySymbol();
        if (correspondingPropertySymbol != null) {
            irFunctionCreateFunction.setCorrespondingPropertySymbol(correspondingPropertySymbol);
            if (Intrinsics.areEqual(correspondingPropertySymbol.getOwner().getGetter(), irSimpleFunction)) {
                correspondingPropertySymbol.getOwner().setGetter(irFunctionCreateFunction);
            }
            if (Intrinsics.areEqual(correspondingPropertySymbol.getOwner().getSetter(), irSimpleFunction)) {
                correspondingPropertySymbol.getOwner().setSetter(irFunctionCreateFunction);
            }
        }
        irFunctionCreateFunction.setParent(irSimpleFunction.getParent());
        IrUtilsKt.copyTypeParametersFrom$default((IrTypeParametersContainer) irFunctionCreateFunction, (IrTypeParametersContainer) irSimpleFunction, (IrDeclarationOrigin) null, (Map) null, 6, (Object) null);
        irFunctionCreateFunction.setReturnType(copy$lambda$7$remapTypeParameters(irSimpleFunction.getReturnType(), irSimpleFunction, irFunctionCreateFunction));
        IrValueParameter dispatchReceiverParameter = irSimpleFunction.getDispatchReceiverParameter();
        irFunctionCreateFunction.setDispatchReceiverParameter(dispatchReceiverParameter != null ? IrUtilsKt.copyTo$default(dispatchReceiverParameter, irFunctionCreateFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null) : null);
        IrValueParameter extensionReceiverParameter = irSimpleFunction.getExtensionReceiverParameter();
        irFunctionCreateFunction.setExtensionReceiverParameter(extensionReceiverParameter != null ? IrUtilsKt.copyTo$default(extensionReceiverParameter, irFunctionCreateFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null) : null);
        List<IrValueParameter> valueParameters = irSimpleFunction.getValueParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(valueParameters));
        for (IrValueParameter irValueParameter : valueParameters) {
            Name nameDexSafeName = dexSafeName(irValueParameter.getName());
            IrType irTypeCopy$lambda$7$remapTypeParameters = copy$lambda$7$remapTypeParameters(defaultParameterType(irValueParameter), irSimpleFunction, irFunctionCreateFunction);
            boolean z = irValueParameter.getDefaultValue() != null;
            IrElement defaultValue = irValueParameter.getDefaultValue();
            if (defaultValue != null) {
                IrElement irElement = defaultValue;
                SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
                IrVisitorsKt.acceptVoid(irElement, (IrElementVisitorVoid) deepCopySymbolRemapper);
                SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
                DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
                IrFunction irFunction = irFunctionCreateFunction;
                IrElementTransformer irElementTransformer = (DeepCopyIrTreeWithSymbols) new DeepCopyPreservingMetadata(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, (IrFunction) irSimpleFunction, irFunction), SymbolRenamer.DEFAULT.INSTANCE);
                deepCopyTypeRemapper.setDeepCopy(irElementTransformer);
                IrElement irElementPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement.transform(irElementTransformer, (Object) null), (IrDeclarationParent) irFunction);
                if (irElementPatchDeclarationParents == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrExpressionBody");
                }
                irExpressionBody = (IrExpressionBody) ((IrExpressionBody) irElementPatchDeclarationParents);
            } else {
                irExpressionBody = null;
            }
            arrayList.add(IrUtilsKt.copyTo$default(irValueParameter, irFunctionCreateFunction, (IrDeclarationOrigin) null, 0, 0, 0, nameDexSafeName, (Map) null, irTypeCopy$lambda$7$remapTypeParameters, (IrType) null, irExpressionBody, false, false, z, 3422, (Object) null));
        }
        irFunctionCreateFunction.setValueParameters(arrayList);
        irFunctionCreateFunction.setContextReceiverParametersCount(irSimpleFunction.getContextReceiverParametersCount());
        irFunctionCreateFunction.setAnnotations(CollectionsKt.toList(irSimpleFunction.getAnnotations()));
        irFunctionCreateFunction.setMetadata(irSimpleFunction.getMetadata());
        IrFunction irFunction2 = (IrFunction) irSimpleFunction;
        IrFunction irFunction3 = irFunctionCreateFunction;
        IrElement irElementMoveBodyTo = IrInlineUtilsKt.moveBodyTo(irFunction2, irFunction3);
        if (irElementMoveBodyTo != null) {
            IrElement irElement2 = irElementMoveBodyTo;
            SymbolRemapper deepCopySymbolRemapper2 = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
            IrVisitorsKt.acceptVoid(irElement2, (IrElementVisitorVoid) deepCopySymbolRemapper2);
            SymbolRemapper symbolRemapper2 = deepCopySymbolRemapper2;
            DeepCopyTypeRemapper deepCopyTypeRemapper2 = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper2);
            IrElementTransformer irElementTransformer2 = (DeepCopyIrTreeWithSymbols) new DeepCopyPreservingMetadata(symbolRemapper2, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper2, irFunction2, irFunction3), SymbolRenamer.DEFAULT.INSTANCE);
            deepCopyTypeRemapper2.setDeepCopy(irElementTransformer2);
            IrElement irElementPatchDeclarationParents2 = PatchDeclarationParentsKt.patchDeclarationParents(irElement2.transform(irElementTransformer2, (Object) null), (IrDeclarationParent) irFunction3);
            if (irElementPatchDeclarationParents2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrBody");
            }
            irBody = (IrBody) ((IrBody) irElementPatchDeclarationParents2);
        } else {
            irBody = null;
        }
        irFunctionCreateFunction.setBody(irBody);
        return irFunctionCreateFunction;
    }

    private static final IrType copy$lambda$7$remapTypeParameters(IrType irType, IrSimpleFunction irSimpleFunction, IrSimpleFunction irSimpleFunction2) {
        return IrUtilsKt.remapTypeParameters$default(irType, (IrTypeParametersContainer) irSimpleFunction, (IrTypeParametersContainer) irSimpleFunction2, (Map) null, 4, (Object) null);
    }

    private final IrSimpleFunction copyWithComposerParam(final IrSimpleFunction irSimpleFunction) {
        IrValueParameter irValueParameter = (IrValueParameter) CollectionsKt.lastOrNull(IrUtilsKt.getExplicitParameters((IrFunction) irSimpleFunction));
        Intrinsics.areEqual(irValueParameter != null ? irValueParameter.getName() : null, KtxNameConventions.INSTANCE.getCOMPOSER_PARAMETER());
        final IrDeclaration irDeclarationCopy = copy(irSimpleFunction);
        this.transformedFunctionSet.add(irDeclarationCopy);
        this.transformedFunctions.put(irSimpleFunction, irDeclarationCopy);
        List overriddenSymbols = irSimpleFunction.getOverriddenSymbols();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(overriddenSymbols));
        Iterator it = overriddenSymbols.iterator();
        while (it.hasNext()) {
            arrayList.add(withComposerParamIfNeeded((IrSimpleFunction) ((IrSimpleFunctionSymbol) it.next()).getOwner()).getSymbol());
        }
        irDeclarationCopy.setOverriddenSymbols(arrayList);
        IrPropertySymbol correspondingPropertySymbol = irDeclarationCopy.getCorrespondingPropertySymbol();
        if (correspondingPropertySymbol != null && !IrUtilsKt.hasAnnotation((IrAnnotationContainer) irDeclarationCopy, DescriptorUtils.JVM_NAME)) {
            String identifier = correspondingPropertySymbol.getOwner().getName().getIdentifier();
            irDeclarationCopy.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCall>) irDeclarationCopy.getAnnotations(), jvmNameAnnotation(AdditionalIrUtilsKt.isGetter(irDeclarationCopy) ? JvmAbi.getterName(identifier) : JvmAbi.setterName(identifier))));
        }
        IrDeclarationParent irDeclarationParent = (IrFunction) irDeclarationCopy;
        final Map map = MapsKt.toMap(CollectionsKt.zip(IrUtilsKt.getExplicitParameters((IrFunction) irSimpleFunction), IrUtilsKt.getExplicitParameters(irDeclarationParent)));
        int size = irDeclarationCopy.getValueParameters().size();
        int contextReceiverParametersCount = size - irDeclarationCopy.getContextReceiverParametersCount();
        IrValueParameterBuilder irValueParameterBuilder = new IrValueParameterBuilder();
        KtxNameConventions ktxNameConventions = KtxNameConventions.INSTANCE;
        irValueParameterBuilder.setName(ktxNameConventions.getCOMPOSER_PARAMETER());
        irValueParameterBuilder.setType(IrTypesKt.makeNullable(this.composerType));
        irValueParameterBuilder.setOrigin(IrDeclarationOrigin.DEFINED.INSTANCE);
        irValueParameterBuilder.setAssignable(true);
        if (irValueParameterBuilder.getIndex() == -1) {
            irValueParameterBuilder.setIndex(irDeclarationParent.getValueParameters().size());
        }
        final IrValueParameter irValueParameterBuildValueParameter = DeclarationBuildersKt.buildValueParameter(irDeclarationParent.getFactory(), irValueParameterBuilder, irDeclarationParent);
        irDeclarationParent.setValueParameters(CollectionsKt.plus((Collection<? extends IrValueParameter>) irDeclarationParent.getValueParameters(), irValueParameterBuildValueParameter));
        String identifier2 = ktxNameConventions.getCHANGED_PARAMETER().getIdentifier();
        int iChangedParamCount = ComposableFunctionBodyTransformerKt.changedParamCount(contextReceiverParametersCount, ComposableFunctionBodyTransformerKt.getThisParamCount(irDeclarationParent));
        for (int i = 0; i < iChangedParamCount; i++) {
            DeclarationBuildersKt.addValueParameter$default(irDeclarationParent, i == 0 ? identifier2 : identifier2 + i, getContext().getIrBuiltIns().getIntType(), (IrDeclarationOrigin) null, 4, (Object) null);
        }
        if (requiresDefaultParameter(irSimpleFunction)) {
            String identifier3 = KtxNameConventions.INSTANCE.getDEFAULT_PARAMETER().getIdentifier();
            int iDefaultParamCount = ComposableFunctionBodyTransformerKt.defaultParamCount(size);
            for (int i2 = 0; i2 < iDefaultParamCount; i2++) {
                DeclarationBuildersKt.addValueParameter(irDeclarationParent, i2 == 0 ? identifier3 : identifier3 + i2, getContext().getIrBuiltIns().getIntType(), IrDeclarationOrigin.MASK_FOR_DEFAULT_FUNCTION.INSTANCE);
            }
        }
        IrElement irElement = (IrElement) irDeclarationCopy;
        this.inlineLambdaInfo.scan(irElement);
        IrElementTransformerVoidKt.transformChildrenVoid(irElement, new IrElementTransformerVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ComposerParamTransformer$copyWithComposerParam$2$3
            private boolean isNestedScope;

            /* JADX INFO: renamed from: isNestedScope, reason: from getter */
            public final boolean getIsNestedScope() {
                return this.isNestedScope;
            }

            public final void setNestedScope(boolean z) {
                this.isNestedScope = z;
            }

            @NotNull
            public IrExpression visitCall(@NotNull IrCall expression) {
                if (!this.isNestedScope) {
                    expression = this.withComposerParamIfNeeded(expression, irValueParameterBuildValueParameter);
                }
                return super.visitCall(expression);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0020  */
            @NotNull
            public IrStatement visitFunction(@NotNull IrFunction declaration) {
                boolean z;
                boolean z2 = this.isNestedScope;
                if (z2) {
                    z = true;
                } else {
                    try {
                        if (!this.inlineLambdaInfo.isInlineLambda(declaration) || this.hasComposableAnnotation((IrAnnotationContainer) declaration)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                        this.isNestedScope = z2;
                    }
                }
                this.isNestedScope = z;
                return super.visitFunction(declaration);
            }

            @NotNull
            public IrExpression visitReturn(@NotNull IrReturn expression) {
                return Intrinsics.areEqual(expression.getReturnTargetSymbol(), irSimpleFunction.getSymbol()) ? super.visitReturn(new IrReturnImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), irDeclarationCopy.getSymbol(), expression.getValue())) : super.visitReturn(expression);
            }

            @NotNull
            public IrGetValue visitGetValue(@NotNull IrGetValue expression) {
                IrValueParameter irValueParameter2 = map.get(expression.getSymbol().getOwner());
                return irValueParameter2 != null ? new IrGetValueImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), irValueParameter2.getSymbol(), expression.getOrigin()) : expression;
            }
        });
        return irDeclarationCopy;
    }

    private final IrConstructorCallImpl createComposableAnnotation() {
        IrType defaultType = IrUtilsKt.getDefaultType(getComposableIrClass());
        IrConstructor primaryConstructor = IrUtilsKt.getPrimaryConstructor(getComposableIrClass());
        Intrinsics.checkNotNull(primaryConstructor);
        return new IrConstructorCallImpl(-2, -2, defaultType, primaryConstructor.getSymbol(), 0, 0, 0, (IrStatementOrigin) null, (SourceElement) null, 384, (DefaultConstructorMarker) null);
    }

    private final IrExpression defaultArgumentFor(IrValueParameter param) {
        if (param.getVarargElementType() != null) {
            return null;
        }
        IrExpression irExpressionDefaultValue$default = defaultValue$default(this, param.getType(), 0, 0, 3, null);
        return new IrCompositeImpl(irExpressionDefaultValue$default.getStartOffset(), irExpressionDefaultValue$default.getEndOffset(), irExpressionDefaultValue$default.getType(), IrStatementOrigin.DEFAULT_VALUE.INSTANCE, CollectionsKt.listOf(irExpressionDefaultValue$default));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    private final IrType defaultParameterType(IrValueParameter param) {
        boolean z;
        IrClass owner;
        IrType type = param.getType();
        if (param.getDefaultValue() == null) {
            return type;
        }
        if (IrTypePredicatesKt.isPrimitiveType$default(type, false, 1, (Object) null)) {
            z = false;
        } else {
            IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(type);
            if (((classOrNull == null || (owner = classOrNull.getOwner()) == null) ? null : IrUtilsKt.getPrimaryConstructor(owner)) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        if (IrTypePredicatesKt.isPrimitiveType$default(type, false, 1, (Object) null)) {
            return type;
        }
        if (JvmIrTypeUtilsKt.isInlineClassType(type)) {
            return (JvmPlatformKt.isJvm(getContext().getPlatform()) || z) ? type : IrTypesKt.makeNullable(type);
        }
        return IrTypesKt.makeNullable(type);
    }

    private final IrExpression defaultValue(IrType irType, int i, int i2) {
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irType);
        if (!(irType instanceof IrSimpleType) || IrTypePredicatesKt.isMarkedNullable((IrSimpleType) irType) || !JvmIrTypeUtilsKt.isInlineClassType(irType)) {
            return IrTypePredicatesKt.isMarkedNullable(irType) ? IrConstImpl.Companion.constNull(i, i2, getContext().getIrBuiltIns().getNothingNType()) : IrConstImpl.Companion.defaultValueForType(i, i2, irType);
        }
        if (JvmPlatformKt.isJvm(getContext().getPlatform())) {
            IrType irTypeUnboxInlineClass = unboxInlineClass(irType);
            return coerceInlineClasses((IrExpression) IrConstImpl.Companion.defaultValueForType(i, i2, irTypeUnboxInlineClass), irTypeUnboxInlineClass, irType);
        }
        Intrinsics.checkNotNull(classOrNull);
        IrConstructorSymbol irConstructorSymbol = (IrConstructorSymbol) SequencesKt.first(IrUtilsKt.getConstructors(classOrNull));
        IrSimpleType inlineClassUnderlyingType = InlineClassesKt.getInlineClassUnderlyingType(classOrNull.getOwner());
        IrExpression irConstructorCallImpl = new IrConstructorCallImpl(i, i2, irType, irConstructorSymbol, 0, 0, 1, (IrStatementOrigin) null, (SourceElement) null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, (DefaultConstructorMarker) null);
        irConstructorCallImpl.putValueArgument(0, defaultValue((IrType) inlineClassUnderlyingType, i, i2));
        return irConstructorCallImpl;
    }

    public static /* synthetic */ IrExpression defaultValue$default(ComposerParamTransformer composerParamTransformer, IrType irType, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        return composerParamTransformer.defaultValue(irType, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d A[RETURN, SYNTHETIC] */
    private final boolean externallyTransformed(IrFunction irFunction) {
        if (this.decoysEnabled) {
            for (Object obj : irFunction.getValueParameters()) {
                if (Intrinsics.areEqual(((IrValueParameter) obj).getName(), KtxNameConventions.INSTANCE.getCOMPOSER_PARAMETER())) {
                    if (obj != null) {
                        return true;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasDefaultExpressionDefinedForValueParameter(IrSimpleFunction irSimpleFunction, int i) {
        if (((IrValueParameter) irSimpleFunction.getValueParameters().get(i)).getDefaultValue() != null) {
            return true;
        }
        if (JsPlatformKt.isJs(getContext().getPlatform()) && DecoyTransformBaseKt.isDecoyImplementation((IrDeclaration) irSimpleFunction) && DecoyTransformBaseKt.didDecoyHaveDefaultForValueParameter((IrFunction) irSimpleFunction, i)) {
            return true;
        }
        List overriddenSymbols = irSimpleFunction.getOverriddenSymbols();
        if (!(overriddenSymbols instanceof Collection) || !overriddenSymbols.isEmpty()) {
            Iterator it = overriddenSymbols.iterator();
            while (it.hasNext()) {
                if (hasDefaultExpressionDefinedForValueParameter((IrSimpleFunction) ((IrSimpleFunctionSymbol) it.next()).getOwner(), i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final IrConstructorCall jvmNameAnnotation(String name) {
        IrClassSymbol topLevelClass = getTopLevelClass(StandardClassIds.Annotations.INSTANCE.getJvmName());
        for (IrConstructorSymbol irConstructorSymbol : IrUtilsKt.getConstructors(topLevelClass)) {
            if (irConstructorSymbol.getOwner().isPrimary()) {
                IrConstructorCall irConstructorCallImpl = new IrConstructorCallImpl(-1, -1, IrTypesKt.createType(topLevelClass, false, CollectionsKt.emptyList()), irConstructorSymbol, 0, 0, 1, (IrStatementOrigin) null, (SourceElement) null, 384, (DefaultConstructorMarker) null);
                irConstructorCallImpl.putValueArgument(0, IrConstImpl.Companion.string(-1, -1, getBuiltIns().getStringType(), name));
                return irConstructorCallImpl;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final IrSimpleFunction lambdaInvokeWithComposerParam(IrSimpleFunction irSimpleFunction) {
        int size = irSimpleFunction.getValueParameters().size();
        for (IrSimpleFunction irSimpleFunction2 : IrUtilsKt.getFunctions(AbstractComposeLoweringKt.function(getContext(), size + ComposableFunctionBodyTransformerKt.composeSyntheticParamCount$default(size, 0, 2, null)).getOwner())) {
            if (Intrinsics.areEqual(irSimpleFunction2.getName(), OperatorNameConventions.INVOKE)) {
                return irSimpleFunction2;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private final boolean requiresDefaultParameter(IrSimpleFunction irSimpleFunction) {
        boolean z;
        boolean z2;
        List valueParameters = irSimpleFunction.getValueParameters();
        if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
            Iterator it = valueParameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((IrValueParameter) it.next()).getDefaultValue() != null) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (z) {
            return true;
        }
        List overriddenSymbols = irSimpleFunction.getOverriddenSymbols();
        if ((overriddenSymbols instanceof Collection) && overriddenSymbols.isEmpty()) {
            z2 = false;
        } else {
            Iterator it2 = overriddenSymbols.iterator();
            while (it2.hasNext()) {
                if (requiresDefaultParameter((IrSimpleFunction) ((IrSimpleFunctionSymbol) it2.next()).getOwner())) {
                    z2 = true;
                }
            }
            z2 = false;
        }
        return z2;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        this.currentModule = module;
        IrElement irElement = (IrElement) module;
        this.inlineLambdaInfo.scan(irElement);
        IrElementTransformerVoidKt.transformChildrenVoid(irElement, this);
        IrVisitorsKt.acceptVoid(irElement, getSymbolRemapper());
        ComposerTypeRemapper composerTypeRemapper = new ComposerTypeRemapper(getContext(), getSymbolRemapper(), this.composerType);
        IrElementTransformer deepCopyIrTreeWithRemappedComposableTypes = new DeepCopyIrTreeWithRemappedComposableTypes(getContext(), getSymbolRemapper(), composerTypeRemapper, null, 8, null);
        composerTypeRemapper.setDeepCopy((IrElementTransformerVoid) deepCopyIrTreeWithRemappedComposableTypes);
        module.transformChildren(deepCopyIrTreeWithRemappedComposableTypes, (Object) null);
        PatchDeclarationParentsKt.patchDeclarationParents$default((IrElement) module, (IrDeclarationParent) null, 1, (Object) null);
    }

    @NotNull
    public IrStatement visitLocalDelegatedProperty(@NotNull IrLocalDelegatedProperty declaration) {
        if (isComposableDelegatedAccessor((IrFunction) declaration.getGetter())) {
            IrSimpleFunction getter = declaration.getGetter();
            getter.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCallImpl>) getter.getAnnotations(), createComposableAnnotation()));
        }
        IrSimpleFunction setter = declaration.getSetter();
        boolean z = false;
        if (setter != null && isComposableDelegatedAccessor((IrFunction) setter)) {
            z = true;
        }
        if (z) {
            IrSimpleFunction setter2 = declaration.getSetter();
            Intrinsics.checkNotNull(setter2);
            setter2.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCallImpl>) setter2.getAnnotations(), createComposableAnnotation()));
        }
        return super.visitLocalDelegatedProperty(declaration);
    }

    @NotNull
    public IrExpression visitLocalDelegatedPropertyReference(@NotNull IrLocalDelegatedPropertyReference expression) {
        return super.visitLocalDelegatedPropertyReference((IrLocalDelegatedPropertyReference) new IrLocalDelegatedPropertyReferenceImpl(expression.getStartOffset(), expression.getEndOffset(), expression.getType(), expression.getSymbol(), expression.getDelegate(), withComposerParamIfNeeded((IrSimpleFunction) expression.getGetter().getOwner()).getSymbol(), expression.getSetter(), expression.getOrigin()));
    }

    @NotNull
    public IrStatement visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        return super.visitSimpleFunction(withComposerParamIfNeeded(declaration));
    }

    @NotNull
    public final IrCall withComposerParamIfNeeded(@NotNull IrCall irCall, @NotNull IrValueParameter irValueParameter) {
        IrSimpleFunction irSimpleFunctionWithComposerParamIfNeeded;
        boolean z;
        if (isComposableDelegatedAccessor(irCall.getSymbol().getOwner())) {
            if (!hasComposableAnnotation((IrAnnotationContainer) irCall.getSymbol().getOwner())) {
                IrSimpleFunction owner = irCall.getSymbol().getOwner();
                owner.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCallImpl>) owner.getAnnotations(), createComposableAnnotation()));
            }
            irSimpleFunctionWithComposerParamIfNeeded = withComposerParamIfNeeded((IrSimpleFunction) irCall.getSymbol().getOwner());
        } else if (isComposableLambdaInvoke(irCall)) {
            irSimpleFunctionWithComposerParamIfNeeded = lambdaInvokeWithComposerParam((IrSimpleFunction) irCall.getSymbol().getOwner());
        } else {
            if (!hasComposableAnnotation((IrAnnotationContainer) irCall.getSymbol().getOwner())) {
                return irCall;
            }
            irSimpleFunctionWithComposerParamIfNeeded = withComposerParamIfNeeded((IrSimpleFunction) irCall.getSymbol().getOwner());
        }
        IrCall irCallImpl = new IrCallImpl(irCall.getStartOffset(), irCall.getEndOffset(), irCall.getType(), irSimpleFunctionWithComposerParamIfNeeded.getSymbol(), irCall.getTypeArgumentsCount(), irSimpleFunctionWithComposerParamIfNeeded.getValueParameters().size(), irCall.getOrigin(), irCall.getSuperQualifierSymbol());
        IrDeclarationsKt.copyAttributes((IrAttributeContainer) irCallImpl, (IrAttributeContainer) irCall);
        IrExpressionsKt.copyTypeArgumentsFrom$default((IrMemberAccessExpression) irCallImpl, (IrMemberAccessExpression) irCall, 0, 2, (Object) null);
        irCallImpl.setDispatchReceiver(irCall.getDispatchReceiver());
        irCallImpl.setExtensionReceiver(irCall.getExtensionReceiver());
        ArrayList arrayList = new ArrayList();
        int valueArgumentsCount = irCall.getValueArgumentsCount();
        int i = 0;
        while (true) {
            if (i >= valueArgumentsCount) {
                break;
            }
            IrExpression valueArgument = irCall.getValueArgument(i);
            IrValueParameter irValueParameter2 = (IrValueParameter) irSimpleFunctionWithComposerParamIfNeeded.getValueParameters().get(i);
            arrayList.add(Boolean.valueOf(valueArgument == null && hasDefaultExpressionDefinedForValueParameter(irSimpleFunctionWithComposerParamIfNeeded, i)));
            if (valueArgument != null) {
                irCallImpl.putValueArgument(i, valueArgument);
            } else if (!AdditionalIrUtilsKt.isVararg(irValueParameter2)) {
                irCallImpl.putValueArgument(i, defaultArgumentFor(irValueParameter2));
            }
            i++;
        }
        int valueArgumentsCount2 = irCall.getValueArgumentsCount();
        int contextReceiverParametersCount = valueArgumentsCount2 - irSimpleFunctionWithComposerParamIfNeeded.getContextReceiverParametersCount();
        int valueArgumentsCount3 = irCall.getValueArgumentsCount();
        int i2 = valueArgumentsCount3 + 1;
        irCallImpl.putValueArgument(valueArgumentsCount3, new IrGetValueImpl(-1, -1, irValueParameter.getSymbol(), (IrStatementOrigin) null, 8, (DefaultConstructorMarker) null));
        int iChangedParamCount = ComposableFunctionBodyTransformerKt.changedParamCount(contextReceiverParametersCount, ComposableFunctionBodyTransformerKt.getThisParamCount((IrFunction) irSimpleFunctionWithComposerParamIfNeeded));
        int i3 = 0;
        while (i3 < iChangedParamCount) {
            if (i2 >= irSimpleFunctionWithComposerParamIfNeeded.getValueParameters().size()) {
                throw new IllegalStateException(("1. expected value parameter count to be higher: " + IrSourcePrinterKt.dumpSrc$default((IrElement) irCall, false, 1, null)).toString());
            }
            irCallImpl.putValueArgument(i2, irConst(0));
            i3++;
            i2++;
        }
        int iDefaultParamCount = ComposableFunctionBodyTransformerKt.defaultParamCount(valueArgumentsCount2);
        for (int i4 = 0; i4 < iDefaultParamCount; i4++) {
            int i5 = i4 * 31;
            int iMin = Math.min(i5 + 31, valueArgumentsCount2);
            if (i2 < irSimpleFunctionWithComposerParamIfNeeded.getValueParameters().size()) {
                boolean[] zArrSliceArray = ArraysKt.sliceArray(CollectionsKt___CollectionsKt.toBooleanArray(arrayList), RangesKt.until(i5, iMin));
                irCallImpl.putValueArgument(i2, irConst(bitMask(Arrays.copyOf(zArrSliceArray, zArrSliceArray.length))));
                i2++;
            } else {
                if (arrayList.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((Boolean) it.next()).booleanValue()) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    throw new IllegalStateException(("2. expected value parameter count to be higher: " + IrSourcePrinterKt.dumpSrc$default((IrElement) irCall, false, 1, null)).toString());
                }
            }
        }
        return irCallImpl;
    }

    private final IrSimpleFunction withComposerParamIfNeeded(IrSimpleFunction irSimpleFunction) {
        if (this.transformedFunctionSet.contains(irSimpleFunction) || DecoyTransformBaseKt.isDecoy((IrDeclaration) irSimpleFunction) || externallyTransformed((IrFunction) irSimpleFunction) || !hasComposableAnnotation((IrAnnotationContainer) irSimpleFunction) || irSimpleFunction.isExpect()) {
            return irSimpleFunction;
        }
        IrSimpleFunction irSimpleFunction2 = this.transformedFunctions.get(irSimpleFunction);
        return irSimpleFunction2 == null ? copyWithComposerParam(irSimpleFunction) : irSimpleFunction2;
    }
}
