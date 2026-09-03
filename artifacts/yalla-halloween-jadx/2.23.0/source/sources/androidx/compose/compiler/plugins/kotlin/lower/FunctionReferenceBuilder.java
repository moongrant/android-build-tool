package androidx.compose.compiler.plugins.kotlin.lower;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.ir.IrInlineUtilsKt;
import org.jetbrains.kotlin.backend.common.lower.DeclarationIrBuilder;
import org.jetbrains.kotlin.backend.jvm.JvmLoweredDeclarationOrigin;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.DescriptorVisibility;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.ir.builders.ExpressionHelpersKt;
import org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder;
import org.jetbrains.kotlin.ir.builders.IrBlockBuilder;
import org.jetbrains.kotlin.ir.builders.IrBuilderWithScope;
import org.jetbrains.kotlin.ir.builders.IrElementBuilder;
import org.jetbrains.kotlin.ir.builders.IrElementBuilderKt;
import org.jetbrains.kotlin.ir.builders.IrGeneratorContext;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrClassBuilder;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;
import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFactory;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrExpressionBody;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrInstanceInitializerCallImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSymbol;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeSystemContext;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.name.Name;
import org.jetbrains.kotlin.name.SpecialNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\f\u0010\u001c\u001a\u00020\u001d*\u00020\u0012H\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/FunctionReferenceBuilder;", "", "irFunctionExpression", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "functionSuperClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "superType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "currentDeclarationParent", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclarationParent;", "generatorContext", "Lorg/jetbrains/kotlin/ir/builders/IrGeneratorContext;", "currentScopeOwnerSymbol", "Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "irTypeSystemContext", "Lorg/jetbrains/kotlin/ir/types/IrTypeSystemContext;", "(Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;Lorg/jetbrains/kotlin/ir/types/IrType;Lorg/jetbrains/kotlin/ir/declarations/IrDeclarationParent;Lorg/jetbrains/kotlin/ir/builders/IrGeneratorContext;Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;Lorg/jetbrains/kotlin/ir/types/IrTypeSystemContext;)V", "callee", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "functionReferenceClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "superMethod", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "build", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "createConstructor", "Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", "createInvokeMethod", "createLambdaInvokeMethod", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFunctionReferenceBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionReferenceBuilder.kt\nandroidx/compose/compiler/plugins/kotlin/lower/FunctionReferenceBuilder\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n+ 4 ExpressionHelpers.kt\norg/jetbrains/kotlin/ir/builders/ExpressionHelpersKt\n+ 5 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBuilder\n+ 6 IrBuilder.kt\norg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n346#2,12:137\n38#3,4:149\n229#3:168\n223#3,13:169\n191#3:189\n185#3:190\n179#3,10:191\n377#4,13:153\n410#4,5:182\n98#5,2:166\n72#6,2:187\n1179#7,2:201\n1253#7,4:203\n*S KotlinDebug\n*F\n+ 1 FunctionReferenceBuilder.kt\nandroidx/compose/compiler/plugins/kotlin/lower/FunctionReferenceBuilder\n*L\n66#1:137,12\n68#1:149,4\n95#1:168\n95#1:169,13\n115#1:189\n115#1:190\n115#1:191,10\n85#1:153,13\n102#1:182,5\n85#1:166,2\n102#1:187,2\n129#1:201,2\n129#1:203,4\n*E\n"})
public final class FunctionReferenceBuilder {

    @NotNull
    private final IrSimpleFunction callee;

    @NotNull
    private final IrDeclarationParent currentDeclarationParent;

    @NotNull
    private final IrSymbol currentScopeOwnerSymbol;

    @NotNull
    private final IrClass functionReferenceClass;

    @NotNull
    private final IrGeneratorContext generatorContext;

    @NotNull
    private final IrFunctionExpression irFunctionExpression;

    @NotNull
    private final IrTypeSystemContext irTypeSystemContext;

    @NotNull
    private final IrSimpleFunctionSymbol superMethod;

    @NotNull
    private final IrType superType;

    public FunctionReferenceBuilder(@NotNull IrFunctionExpression irFunctionExpression, @NotNull IrClassSymbol functionSuperClass, @NotNull IrType superType, @NotNull IrDeclarationParent currentDeclarationParent, @NotNull IrGeneratorContext generatorContext, @NotNull IrSymbol currentScopeOwnerSymbol, @NotNull IrTypeSystemContext irTypeSystemContext) {
        Intrinsics.checkNotNullParameter(irFunctionExpression, "irFunctionExpression");
        Intrinsics.checkNotNullParameter(functionSuperClass, "functionSuperClass");
        Intrinsics.checkNotNullParameter(superType, "superType");
        Intrinsics.checkNotNullParameter(currentDeclarationParent, "currentDeclarationParent");
        Intrinsics.checkNotNullParameter(generatorContext, "generatorContext");
        Intrinsics.checkNotNullParameter(currentScopeOwnerSymbol, "currentScopeOwnerSymbol");
        Intrinsics.checkNotNullParameter(irTypeSystemContext, "irTypeSystemContext");
        this.irFunctionExpression = irFunctionExpression;
        this.superType = superType;
        this.currentDeclarationParent = currentDeclarationParent;
        this.generatorContext = generatorContext;
        this.currentScopeOwnerSymbol = currentScopeOwnerSymbol;
        this.irTypeSystemContext = irTypeSystemContext;
        this.callee = irFunctionExpression.getFunction();
        Object obj = null;
        boolean z = false;
        for (Object obj2 : IrUtilsKt.getFunctions(functionSuperClass)) {
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
        this.superMethod = (IrSimpleFunctionSymbol) obj;
        IrFactory irFactory = this.generatorContext.getIrFactory();
        IrElementBuilder irClassBuilder = new IrClassBuilder();
        IrElementBuilderKt.setSourceRange(irClassBuilder, this.irFunctionExpression);
        DescriptorVisibility LOCAL = DescriptorVisibilities.LOCAL;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        irClassBuilder.setVisibility(LOCAL);
        irClassBuilder.setOrigin(JvmLoweredDeclarationOrigin.LAMBDA_IMPL.INSTANCE);
        irClassBuilder.setName(SpecialNames.NO_NAME_PROVIDED);
        IrAttributeContainer irAttributeContainerBuildClass = DeclarationBuildersKt.buildClass(irFactory, irClassBuilder);
        irAttributeContainerBuildClass.setParent(this.currentDeclarationParent);
        irAttributeContainerBuildClass.setSuperTypes(CollectionsKt.listOfNotNull(this.superType));
        IrUtilsKt.createImplicitParameterDeclarationWithWrappedDescriptor(irAttributeContainerBuildClass);
        IrDeclarationsKt.copyAttributes(irAttributeContainerBuildClass, this.irFunctionExpression);
        irAttributeContainerBuildClass.setMetadata(this.irFunctionExpression.getFunction().getMetadata());
        this.functionReferenceClass = irAttributeContainerBuildClass;
    }

    private final IrConstructor createConstructor() {
        IrDeclarationParent irDeclarationParent = this.functionReferenceClass;
        IrFactory factory = irDeclarationParent.getFactory();
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        irFunctionBuilder.setOrigin(JvmLoweredDeclarationOrigin.GENERATED_MEMBER_IN_CALLABLE_REFERENCE.INSTANCE);
        irFunctionBuilder.setReturnType(IrUtilsKt.getDefaultType(this.functionReferenceClass));
        irFunctionBuilder.setPrimary(true);
        irFunctionBuilder.setReturnType(IrUtilsKt.getDefaultType(irDeclarationParent));
        IrConstructor irConstructorBuildConstructor = DeclarationBuildersKt.buildConstructor(factory, irFunctionBuilder);
        irDeclarationParent.getDeclarations().add(irConstructorBuildConstructor);
        irConstructorBuildConstructor.setParent(irDeclarationParent);
        IrConstructor irConstructor = (IrConstructor) SequencesKt.single(IrUtilsKt.getConstructors(this.irTypeSystemContext.getIrBuiltIns().getAnyClass().getOwner()));
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(this.generatorContext, irConstructorBuildConstructor.getSymbol(), 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBuilderWithScope = declarationIrBuilder;
        IrBuilderWithScope irBlockBodyBuilder = new IrBlockBodyBuilder(irBuilderWithScope.getContext(), irBuilderWithScope.getScope(), declarationIrBuilder.getStartOffset(), declarationIrBuilder.getEndOffset());
        irBlockBodyBuilder.unaryPlus(ExpressionHelpersKt.irDelegatingConstructorCall(irBlockBodyBuilder, irConstructor));
        irBlockBodyBuilder.unaryPlus(new IrInstanceInitializerCallImpl(irBlockBodyBuilder.getStartOffset(), irBlockBodyBuilder.getEndOffset(), this.functionReferenceClass.getSymbol(), irBlockBodyBuilder.getContext().getIrBuiltIns().getUnitType()));
        irConstructorBuildConstructor.setBody(irBlockBodyBuilder.doBuild());
        return irConstructorBuildConstructor;
    }

    private final IrSimpleFunction createInvokeMethod() {
        IrDeclarationParent irDeclarationParent = this.functionReferenceClass;
        IrFactory factory = irDeclarationParent.getFactory();
        IrElementBuilder irFunctionBuilder = new IrFunctionBuilder();
        IrElementBuilderKt.setSourceRange(irFunctionBuilder, this.callee);
        irFunctionBuilder.setName(this.superMethod.getOwner().getName());
        irFunctionBuilder.setReturnType(this.callee.getReturnType());
        irFunctionBuilder.setSuspend(this.callee.isSuspend());
        IrFunction irFunctionBuildFunction = DeclarationBuildersKt.buildFunction(factory, irFunctionBuilder);
        IrDeclarationParent irDeclarationParent2 = (IrDeclarationContainer) irDeclarationParent;
        irDeclarationParent2.getDeclarations().add(irFunctionBuildFunction);
        irFunctionBuildFunction.setParent(irDeclarationParent2);
        irFunctionBuildFunction.setOverriddenSymbols(CollectionsKt.plus((Collection<? extends IrSimpleFunctionSymbol>) irFunctionBuildFunction.getOverriddenSymbols(), this.superMethod));
        IrValueParameter thisReceiver = IrUtilsKt.getParentAsClass((IrDeclaration) irFunctionBuildFunction).getThisReceiver();
        Intrinsics.checkNotNull(thisReceiver);
        irFunctionBuildFunction.setDispatchReceiverParameter(IrUtilsKt.copyTo$default(thisReceiver, irFunctionBuildFunction, (IrDeclarationOrigin) null, 0, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8190, (Object) null));
        createLambdaInvokeMethod(irFunctionBuildFunction);
        return irFunctionBuildFunction;
    }

    private final void createLambdaInvokeMethod(IrSimpleFunction irSimpleFunction) {
        irSimpleFunction.setAnnotations(CollectionsKt.plus((Collection) irSimpleFunction.getAnnotations(), (Iterable) this.callee.getAnnotations()));
        Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(IrUtilsKt.getExplicitParameters(this.callee));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
        for (IndexedValue indexedValue : iterableWithIndex) {
            int index = indexedValue.getIndex();
            IrValueParameter irValueParameter = (IrValueParameter) indexedValue.component2();
            Pair pair = TuplesKt.to(irValueParameter, IrUtilsKt.copyTo$default(irValueParameter, (IrFunction) irSimpleFunction, (IrDeclarationOrigin) null, index, 0, 0, (Name) null, (Map) null, (IrType) null, (IrType) null, (IrExpressionBody) null, false, false, false, 8186, (Object) null));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        irSimpleFunction.setValueParameters(CollectionsKt.plus((Collection) irSimpleFunction.getValueParameters(), (Iterable) linkedHashMap.values()));
        irSimpleFunction.setBody(IrInlineUtilsKt.moveBodyTo(this.callee, (IrFunction) irSimpleFunction, linkedHashMap));
    }

    @NotNull
    public final IrExpression build() {
        IrBuilderWithScope declarationIrBuilder = new DeclarationIrBuilder(this.generatorContext, this.currentScopeOwnerSymbol, 0, 0, 12, (DefaultConstructorMarker) null);
        IrBuilderWithScope irBlockBuilder = new IrBlockBuilder(declarationIrBuilder.getContext(), declarationIrBuilder.getScope(), this.irFunctionExpression.getStartOffset(), this.irFunctionExpression.getEndOffset(), (IrStatementOrigin) null, (IrType) null, false, 64, (DefaultConstructorMarker) null);
        IrConstructor irConstructorCreateConstructor = createConstructor();
        createInvokeMethod();
        IrUtilsKt.addFakeOverrides$default(this.functionReferenceClass, this.irTypeSystemContext, (List) null, (List) null, 6, (Object) null);
        irBlockBuilder.unaryPlus(this.functionReferenceClass);
        irBlockBuilder.unaryPlus(ExpressionHelpersKt.irCall(irBlockBuilder, irConstructorCreateConstructor.getSymbol()));
        return irBlockBuilder.doBuild();
    }
}
