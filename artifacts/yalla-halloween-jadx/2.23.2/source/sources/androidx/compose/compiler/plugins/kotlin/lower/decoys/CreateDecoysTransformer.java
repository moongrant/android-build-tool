package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.camera.core.impl.OooOOOO;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.lower.DeepCopyPreservingMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.ir.IrInlineUtilsKt;
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.builders.ExpressionHelpersKt;
import org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder;
import org.jetbrains.kotlin.ir.builders.IrBuilderWithScope;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrBody;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.symbols.IrPropertySymbol;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DeepCopyTypeRemapper;
import org.jetbrains.kotlin.ir.util.DescriptorsRemapper;
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
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0006\u0010#\u001a\u00020 J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0017H\u0016J\u001c\u0010)\u001a\u00020 *\u00020\u001d2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J;\u0010.\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010/\u001a\u0002002%\b\u0002\u00101\u001a\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020 02¢\u0006\u0002\b4\u0012\u0004\u0012\u00020\u001d02H\u0002J\f\u00105\u001a\u000200*\u00020\u001dH\u0002J\u0014\u00106\u001a\u00020 *\u00020\u001d2\u0006\u00107\u001a\u00020+H\u0002J\f\u00108\u001a\u00020 *\u00020\u001dH\u0002J\u001c\u00109\u001a\u00020 *\u00020:2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001dH\u0002R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0015\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "signatureBuilder", "Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "decoyAnnotation", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "getDecoyAnnotation", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "decoyAnnotation$delegate", "Lkotlin/Lazy;", "decoyImplementationAnnotation", "getDecoyImplementationAnnotation", "decoyImplementationAnnotation$delegate", "decoyImplementationDefaultsBitmaskAnnotation", "decoyStub", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "getDecoyStub", "()Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "decoyStub$delegate", "originalFunctions", "", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclarationParent;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "updateParents", "visitConstructor", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", "visitSimpleFunction", "addDecoyImplementationAnnotation", "name", "", "signatureId", "", "copyWithName", "newName", "Lorg/jetbrains/kotlin/name/Name;", "factory", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/ir/builders/declarations/IrFunctionBuilder;", "Lkotlin/ExtensionFunctionType;", "decoyImplementationName", "setDecoyAnnotation", "implementationName", "stubBody", "transformDefaultValue", "Lorg/jetbrains/kotlin/ir/expressions/IrExpressionBody;", "originalFunction", "newFunction", "Companion", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateDecoysTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateDecoysTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt\n+ 6 DeepCopyIrTreeWithSymbols.kt\norg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbolsKt\n+ 7 ExpressionHelpers.kt\norg/jetbrains/kotlin/ir/builders/ExpressionHelpersKt\n+ 8 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder\n*L\n1#1,317:1\n215#2,2:318\n1855#3,2:320\n1549#3:322\n1620#3,2:323\n1622#3:352\n1855#3,2:399\n1549#3:413\n1620#3,3:414\n408#4,4:325\n206#5:329\n207#5,12:340\n206#5:353\n207#5,12:364\n206#5:376\n207#5,12:387\n26#6,10:330\n26#6,10:354\n26#6,10:377\n405#7,10:401\n72#8,2:411\n*S KotlinDebug\n*F\n+ 1 CreateDecoysTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer\n*L\n116#1:318,2\n145#1:320,2\n210#1:322\n210#1:323,2\n210#1:352\n231#1:399,2\n307#1:413\n307#1:414,3\n215#1:325,4\n218#1:329\n218#1:340,12\n224#1:353\n224#1:364,12\n227#1:376\n227#1:387,12\n218#1:330,10\n224#1:354,10\n227#1:377,10\n269#1:401,10\n269#1:411,2\n*E\n"})
public final class CreateDecoysTransformer extends AbstractDecoysLowering {

    @NotNull
    private static final String IMPLEMENTATION_FUNCTION_SUFFIX = "$composable";

    /* JADX INFO: renamed from: decoyAnnotation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoyAnnotation;

    /* JADX INFO: renamed from: decoyImplementationAnnotation$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoyImplementationAnnotation;

    @NotNull
    private final IrClass decoyImplementationDefaultsBitmaskAnnotation;

    /* JADX INFO: renamed from: decoyStub$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy decoyStub;

    @NotNull
    private final Map<IrFunction, IrDeclarationParent> originalFunctions;

    /* JADX INFO: renamed from: androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer$copyWithName$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCreateDecoysTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateDecoysTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer$copyWithName$1\n+ 2 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n*L\n1#1,317:1\n179#2,4:318\n*S KotlinDebug\n*F\n+ 1 CreateDecoysTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer$copyWithName$1\n*L\n183#1:318,4\n*E\n"})
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Function1<? super IrFunctionBuilder, ? extends Unit>, IrSimpleFunction> {
        public AnonymousClass1(Object obj) {
            super(1, obj, DeclarationBuildersKt.class, "buildFun", "buildFun(Lorg/jetbrains/kotlin/ir/declarations/IrFactory;Lkotlin/jvm/functions/Function1;)Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IrSimpleFunction invoke(Function1<? super IrFunctionBuilder, ? extends Unit> function1) {
            return invoke2((Function1<? super IrFunctionBuilder, Unit>) function1);
        }

        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final IrSimpleFunction invoke2(@NotNull Function1<? super IrFunctionBuilder, Unit> function1) {
            IrFactory irFactory = (IrFactory) this.receiver;
            IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
            function1.invoke(irFunctionBuilder);
            return DeclarationBuildersKt.buildFunction(irFactory, irFunctionBuilder);
        }
    }

    public CreateDecoysTransformer(@NotNull IrPluginContext irPluginContext, @NotNull DeepCopySymbolRemapper deepCopySymbolRemapper, @NotNull IdSignatureSerializer idSignatureSerializer, @NotNull ModuleMetrics moduleMetrics) {
        super(irPluginContext, deepCopySymbolRemapper, moduleMetrics, idSignatureSerializer);
        this.originalFunctions = new LinkedHashMap();
        this.decoyAnnotation = LazyKt.lazy(new Function0<IrClass>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer$decoyAnnotation$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrClass invoke() {
                return this.this$0.getTopLevelClass(DecoyClassIds.INSTANCE.getDecoy()).getOwner();
            }
        });
        this.decoyImplementationAnnotation = LazyKt.lazy(new Function0<IrClass>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer$decoyImplementationAnnotation$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrClass invoke() {
                return this.this$0.getTopLevelClass(DecoyClassIds.INSTANCE.getDecoyImplementation()).getOwner();
            }
        });
        this.decoyImplementationDefaultsBitmaskAnnotation = getTopLevelClass(DecoyClassIds.INSTANCE.getDecoyImplementationDefaultsBitMask()).getOwner();
        this.decoyStub = LazyKt.lazy(new Function0<IrSimpleFunction>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer$decoyStub$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IrSimpleFunction invoke() {
                return this.this$0.getTopLevelFunction(DecoyCallableIds.INSTANCE.getIllegalDecoyCallException()).getOwner();
            }
        });
    }

    private final void addDecoyImplementationAnnotation(IrFunction irFunction, String str, long j) {
        List annotations = irFunction.getAnnotations();
        IrConstructorCallImpl irConstructorCallImplFromSymbolOwner$default = IrConstructorCallImpl.Companion.fromSymbolOwner$default(IrConstructorCallImpl.Companion, IrUtilsKt.getDefaultType(getDecoyImplementationAnnotation()), ((IrConstructor) SequencesKt.first(IrUtilsKt.getConstructors(getDecoyImplementationAnnotation()))).getSymbol(), (IrStatementOrigin) null, 4, (Object) null);
        irConstructorCallImplFromSymbolOwner$default.putValueArgument(0, irConst(str));
        irConstructorCallImplFromSymbolOwner$default.putValueArgument(1, irConst(j));
        Unit unit = Unit.INSTANCE;
        irFunction.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCallImpl>) annotations, irConstructorCallImplFromSymbolOwner$default));
        List annotations2 = irFunction.getAnnotations();
        IrConstructorCallImpl irConstructorCallImplFromSymbolOwner$default2 = IrConstructorCallImpl.Companion.fromSymbolOwner$default(IrConstructorCallImpl.Companion, IrUtilsKt.getDefaultType(this.decoyImplementationDefaultsBitmaskAnnotation), ((IrConstructor) SequencesKt.first(IrUtilsKt.getConstructors(this.decoyImplementationDefaultsBitmaskAnnotation))).getSymbol(), (IrStatementOrigin) null, 4, (Object) null);
        List valueParameters = irFunction.getValueParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(valueParameters));
        Iterator it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(IrUtilsKt.hasDefaultValue((IrValueParameter) it.next())));
        }
        boolean[] booleanArray = CollectionsKt___CollectionsKt.toBooleanArray(arrayList);
        irConstructorCallImplFromSymbolOwner$default2.putValueArgument(0, irConst(bitMask(Arrays.copyOf(booleanArray, booleanArray.length))));
        Unit unit2 = Unit.INSTANCE;
        irFunction.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCallImpl>) annotations2, irConstructorCallImplFromSymbolOwner$default2));
    }

    private final IrFunction copyWithName(final IrFunction irFunction, final Name name, Function1<? super Function1<? super IrFunctionBuilder, Unit>, ? extends IrFunction> function1) {
        int i;
        DescriptorsRemapper descriptorsRemapper;
        IrValueParameter irValueParameter;
        DescriptorsRemapper descriptorsRemapper2;
        String strSubstring;
        IrExpressionBody irExpressionBody;
        IrSimpleFunction irSimpleFunction = (IrFunction) function1.invoke(new Function1<IrFunctionBuilder, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer$copyWithName$newFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IrFunctionBuilder irFunctionBuilder) {
                invoke2(irFunctionBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull IrFunctionBuilder irFunctionBuilder) {
                irFunctionBuilder.updateFrom(irFunction);
                irFunctionBuilder.setName(name);
                irFunctionBuilder.setReturnType(irFunction.getReturnType());
                IrConstructor irConstructor = irFunction;
                IrConstructor irConstructor2 = irConstructor instanceof IrConstructor ? irConstructor : null;
                irFunctionBuilder.setPrimary(irConstructor2 != null ? irConstructor2.isPrimary() : false);
                irFunctionBuilder.setOperator(false);
            }
        });
        irSimpleFunction.setAnnotations(irFunction.getAnnotations());
        irSimpleFunction.setMetadata(irFunction.getMetadata());
        IrExpressionBody irExpressionBody2 = null;
        if (irSimpleFunction instanceof IrSimpleFunction) {
            IrSimpleFunction irSimpleFunction2 = irSimpleFunction;
            Intrinsics.checkNotNull(irFunction, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
            irSimpleFunction2.setOverriddenSymbols(((IrSimpleFunction) irFunction).getOverriddenSymbols());
            irSimpleFunction2.setCorrespondingPropertySymbol((IrPropertySymbol) null);
        }
        irSimpleFunction.setOrigin(irFunction.getOrigin());
        IrTypeParametersContainer irTypeParametersContainer = (IrTypeParametersContainer) irSimpleFunction;
        IrTypeParametersContainer irTypeParametersContainer2 = (IrTypeParametersContainer) irFunction;
        IrUtilsKt.copyTypeParametersFrom$default(irTypeParametersContainer, irTypeParametersContainer2, (IrDeclarationOrigin) null, (Map) null, 6, (Object) null);
        irSimpleFunction.setReturnType(IrUtilsKt.remapTypeParameters$default(irSimpleFunction.getReturnType(), irTypeParametersContainer2, irTypeParametersContainer, (Map) null, 4, (Object) null));
        List<IrValueParameter> valueParameters = irFunction.getValueParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(valueParameters));
        for (IrValueParameter irValueParameter2 : valueParameters) {
            String strAsString = dexSafeName(irValueParameter2.getName()).asString();
            int length = strAsString.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    strSubstring = "";
                    break;
                }
                if (!(strAsString.charAt(i2) == '$')) {
                    strSubstring = strAsString.substring(i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    break;
                }
                i2++;
            }
            Name nameIdentifier = Name.identifier(strSubstring);
            IrType irTypeRemapTypeParameters$default = IrUtilsKt.remapTypeParameters$default(irValueParameter2.getType(), irTypeParametersContainer2, irTypeParametersContainer, (Map) null, 4, (Object) null);
            IrElement defaultValue = irValueParameter2.getDefaultValue();
            if (defaultValue != null) {
                IrElement irElement = defaultValue;
                SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper(irExpressionBody2, 1, irExpressionBody2);
                IrVisitorsKt.acceptVoid(irElement, (IrElementVisitorVoid) deepCopySymbolRemapper);
                SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
                DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
                IrElementTransformer irElementTransformer = (DeepCopyIrTreeWithSymbols) new DeepCopyPreservingMetadata(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, irFunction, irSimpleFunction), SymbolRenamer.DEFAULT.INSTANCE);
                deepCopyTypeRemapper.setDeepCopy(irElementTransformer);
                IrExpressionBody irExpressionBodyPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement.transform(irElementTransformer, irExpressionBody2), (IrDeclarationParent) irSimpleFunction);
                if (irExpressionBodyPatchDeclarationParents == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrExpressionBody");
                }
                irExpressionBody = (IrElement) irExpressionBodyPatchDeclarationParents;
            } else {
                irExpressionBody = irExpressionBody2;
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(IrUtilsKt.copyTo$default(irValueParameter2, irSimpleFunction, (IrDeclarationOrigin) null, 0, 0, 0, nameIdentifier, (Map) null, irTypeRemapTypeParameters$default, (IrType) null, irExpressionBody, false, false, false, 7518, (Object) null));
            arrayList = arrayList2;
            irExpressionBody2 = null;
        }
        irSimpleFunction.setValueParameters(arrayList);
        IrValueParameter dispatchReceiverParameter = irFunction.getDispatchReceiverParameter();
        irSimpleFunction.setDispatchReceiverParameter(dispatchReceiverParameter != null ? IrUtilsKt.copyTo$default(dispatchReceiverParameter, irSimpleFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null) : null);
        IrElement extensionReceiverParameter = irFunction.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            IrElement irElement2 = extensionReceiverParameter;
            i = 1;
            descriptorsRemapper = null;
            SymbolRemapper deepCopySymbolRemapper2 = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
            IrVisitorsKt.acceptVoid(irElement2, (IrElementVisitorVoid) deepCopySymbolRemapper2);
            SymbolRemapper symbolRemapper2 = deepCopySymbolRemapper2;
            DeepCopyTypeRemapper deepCopyTypeRemapper2 = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper2);
            IrElementTransformer irElementTransformer2 = (DeepCopyIrTreeWithSymbols) new DeepCopyPreservingMetadata(symbolRemapper2, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper2, irFunction, irSimpleFunction), SymbolRenamer.DEFAULT.INSTANCE);
            deepCopyTypeRemapper2.setDeepCopy(irElementTransformer2);
            IrElement irElementPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement2.transform(irElementTransformer2, (Object) null), (IrDeclarationParent) irSimpleFunction);
            if (irElementPatchDeclarationParents == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrValueParameter");
            }
            irValueParameter = (IrValueParameter) ((IrValueParameter) irElementPatchDeclarationParents);
        } else {
            i = 1;
            descriptorsRemapper = null;
            irValueParameter = null;
        }
        irSimpleFunction.setExtensionReceiverParameter(irValueParameter);
        IrElement irElementMoveBodyTo = IrInlineUtilsKt.moveBodyTo(irFunction, irSimpleFunction);
        if (irElementMoveBodyTo != null) {
            IrElement irElement3 = irElementMoveBodyTo;
            SymbolRemapper deepCopySymbolRemapper3 = new DeepCopySymbolRemapper(descriptorsRemapper, i, descriptorsRemapper);
            IrVisitorsKt.acceptVoid(irElement3, (IrElementVisitorVoid) deepCopySymbolRemapper3);
            SymbolRemapper symbolRemapper3 = deepCopySymbolRemapper3;
            DeepCopyTypeRemapper deepCopyTypeRemapper3 = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper3);
            IrElementTransformer irElementTransformer3 = (DeepCopyIrTreeWithSymbols) new DeepCopyPreservingMetadata(symbolRemapper3, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper3, irFunction, irSimpleFunction), SymbolRenamer.DEFAULT.INSTANCE);
            deepCopyTypeRemapper3.setDeepCopy(irElementTransformer3);
            DescriptorsRemapper descriptorsRemapperPatchDeclarationParents = PatchDeclarationParentsKt.patchDeclarationParents(irElement3.transform(irElementTransformer3, descriptorsRemapper), (IrDeclarationParent) irSimpleFunction);
            if (descriptorsRemapperPatchDeclarationParents == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrBody");
            }
            descriptorsRemapper2 = (IrBody) ((IrElement) ((IrBody) descriptorsRemapperPatchDeclarationParents));
        } else {
            descriptorsRemapper2 = descriptorsRemapper;
        }
        irSimpleFunction.setBody(descriptorsRemapper2);
        addDecoyImplementationAnnotation(irSimpleFunction, name.asString(), getSignatureId(irFunction));
        Iterator it = irSimpleFunction.getValueParameters().iterator();
        while (it.hasNext()) {
            IrExpressionBody defaultValue2 = ((IrValueParameter) it.next()).getDefaultValue();
            if (defaultValue2 != null) {
                transformDefaultValue(defaultValue2, irFunction, irSimpleFunction);
            }
        }
        return irSimpleFunction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IrFunction copyWithName$default(CreateDecoysTransformer createDecoysTransformer, IrFunction irFunction, Name name, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new AnonymousClass1(createDecoysTransformer.getContext().getIrFactory());
        }
        return createDecoysTransformer.copyWithName(irFunction, name, function1);
    }

    private final Name decoyImplementationName(IrFunction irFunction) {
        return dexSafeName(Name.identifier(OooOOOO.OooO00o(irFunction.getName().asString(), IMPLEMENTATION_FUNCTION_SUFFIX)));
    }

    private final IrClass getDecoyAnnotation() {
        return (IrClass) this.decoyAnnotation.getValue();
    }

    private final IrClass getDecoyImplementationAnnotation() {
        return (IrClass) this.decoyImplementationAnnotation.getValue();
    }

    private final IrSimpleFunction getDecoyStub() {
        return (IrSimpleFunction) this.decoyStub.getValue();
    }

    private final void setDecoyAnnotation(IrFunction irFunction, String str) {
        IrConstructorCallImpl irConstructorCallImplFromSymbolOwner$default = IrConstructorCallImpl.Companion.fromSymbolOwner$default(IrConstructorCallImpl.Companion, IrUtilsKt.getDefaultType(getDecoyAnnotation()), ((IrConstructor) SequencesKt.first(IrUtilsKt.getConstructors(getDecoyAnnotation()))).getSymbol(), (IrStatementOrigin) null, 4, (Object) null);
        irConstructorCallImplFromSymbolOwner$default.putValueArgument(0, irConst(str));
        irConstructorCallImplFromSymbolOwner$default.putValueArgument(1, irVarargString(CollectionsKt.emptyList()));
        irFunction.setAnnotations(CollectionsKt.listOf(irConstructorCallImplFromSymbolOwner$default));
    }

    private final void stubBody(IrFunction irFunction) {
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(getContext(), irFunction.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
        IrBuilderWithScope irBuilderWithScope = irBlockBodyBuilder;
        IrExpression irExpressionIrCall = ExpressionHelpersKt.irCall(irBuilderWithScope, getDecoyStub());
        irExpressionIrCall.putValueArgument(0, irConst(irFunction.getName().asString()));
        Unit unit = Unit.INSTANCE;
        irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irReturn(irBuilderWithScope, irExpressionIrCall));
        irFunction.setBody(irBlockBodyBuilder.doBuild());
    }

    private final void transformDefaultValue(IrExpressionBody irExpressionBody, final IrFunction irFunction, final IrFunction irFunction2) {
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) irExpressionBody, new IrElementTransformerVoid() { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.CreateDecoysTransformer.transformDefaultValue.1
            @NotNull
            public IrExpression visitGetValue(@NotNull IrGetValue expression) {
                IrExpression irExpressionVisitGetValue = super.visitGetValue(expression);
                IrValueParameter owner = expression.getSymbol().getOwner();
                IrValueParameter irValueParameter = owner instanceof IrValueParameter ? owner : null;
                if (irValueParameter == null) {
                    return irExpressionVisitGetValue;
                }
                int index = irValueParameter.getIndex();
                return (index < 0 || !Intrinsics.areEqual(irValueParameter.getParent(), irFunction)) ? super.visitGetValue(expression) : this.irGet((IrValueDeclaration) irFunction2.getValueParameters().get(index));
            }
        });
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        IrElement irElement = (IrElement) module;
        transformChildrenVoid(irElement);
        updateParents();
        PatchDeclarationParentsKt.patchDeclarationParents$default(irElement, (IrDeclarationParent) null, 1, (Object) null);
    }

    public final void updateParents() {
        for (Map.Entry<IrFunction, IrDeclarationParent> entry : this.originalFunctions.entrySet()) {
            IrDeclaration irDeclaration = (IrFunction) entry.getKey();
            IrDeclarationContainer irDeclarationContainer = (IrDeclarationParent) entry.getValue();
            IrDeclarationContainer irDeclarationContainer2 = irDeclarationContainer instanceof IrDeclarationContainer ? irDeclarationContainer : null;
            if (irDeclarationContainer2 != null) {
                IrUtilsKt.addChild(irDeclarationContainer2, irDeclaration);
            }
        }
        this.originalFunctions.clear();
    }

    @NotNull
    public IrStatement visitConstructor(@NotNull IrConstructor declaration) {
        IrFunction irFunction = (IrFunction) declaration;
        if (!shouldBeRemapped(irFunction)) {
            return super.visitConstructor(declaration);
        }
        Name nameDecoyImplementationName = decoyImplementationName(irFunction);
        IrFunction irFunctionCopyWithName = copyWithName(irFunction, nameDecoyImplementationName, new CreateDecoysTransformer$visitConstructor$copied$1(getContext().getIrFactory()));
        Intrinsics.checkNotNull(irFunctionCopyWithName, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrConstructor");
        IrConstructor irConstructor = (IrConstructor) irFunctionCopyWithName;
        irConstructor.setParent(declaration.getParent());
        Map<IrFunction, IrDeclarationParent> map = this.originalFunctions;
        Pair pair = TuplesKt.to(irConstructor, declaration.getParent());
        map.put((IrFunction) pair.getFirst(), (IrDeclarationParent) pair.getSecond());
        Intrinsics.checkNotNull(super.visitConstructor(irConstructor), "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrConstructor");
        IrFunction irFunction2 = (IrFunction) declaration;
        setDecoyAnnotation(irFunction2, nameDecoyImplementationName.asString());
        stubBody(irFunction2);
        return (IrStatement) declaration;
    }

    @NotNull
    public IrStatement visitSimpleFunction(@NotNull IrSimpleFunction declaration) {
        IrFunction irFunction = (IrFunction) declaration;
        if (!shouldBeRemapped(irFunction)) {
            return super.visitSimpleFunction(declaration);
        }
        Name nameDecoyImplementationName = decoyImplementationName(irFunction);
        IrFunction irFunctionCopyWithName$default = copyWithName$default(this, irFunction, nameDecoyImplementationName, null, 2, null);
        Intrinsics.checkNotNull(irFunctionCopyWithName$default, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
        IrSimpleFunction irSimpleFunction = (IrSimpleFunction) irFunctionCopyWithName$default;
        irSimpleFunction.setParent(declaration.getParent());
        Map<IrFunction, IrDeclarationParent> map = this.originalFunctions;
        Pair pair = TuplesKt.to(irSimpleFunction, declaration.getParent());
        map.put((IrFunction) pair.getFirst(), (IrDeclarationParent) pair.getSecond());
        Intrinsics.checkNotNull(super.visitSimpleFunction(irSimpleFunction), "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrSimpleFunction");
        IrFunction irFunction2 = (IrFunction) declaration;
        setDecoyAnnotation(irFunction2, nameDecoyImplementationName.asString());
        Iterator it = declaration.getValueParameters().iterator();
        while (it.hasNext()) {
            ((IrValueParameter) it.next()).setDefaultValue((IrExpressionBody) null);
        }
        if (declaration.getBody() != null) {
            stubBody(irFunction2);
        }
        return (IrStatement) declaration;
    }
}
