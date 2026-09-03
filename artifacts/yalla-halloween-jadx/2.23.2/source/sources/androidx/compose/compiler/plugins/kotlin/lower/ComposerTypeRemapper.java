package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNamesKt;
import androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBaseKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.UtilsKt;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.builtins.StandardNames;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrTypeParametersContainer;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrTypeAliasSymbol;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeAbbreviation;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.IrTypeProjection;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.types.SimpleTypeNullability;
import org.jetbrains.kotlin.ir.types.impl.IrSimpleTypeImpl;
import org.jetbrains.kotlin.ir.types.impl.IrSimpleTypeImplKt;
import org.jetbrains.kotlin.ir.types.impl.IrTypeAbbreviationImpl;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.SymbolRemapper;
import org.jetbrains.kotlin.ir.util.TypeRemapper;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.types.KotlinType;
import org.jetbrains.kotlin.types.Variance;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001cH\u0002J\f\u0010\u001d\u001a\u00020\u001e*\u00020\u0007H\u0002J\f\u0010\u001f\u001a\u00020\u001e*\u00020\u0007H\u0002J\f\u0010 \u001a\u00020!*\u00020\"H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ComposerTypeRemapper;", "Lorg/jetbrains/kotlin/ir/util/TypeRemapper;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/SymbolRemapper;", "composerType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/SymbolRemapper;Lorg/jetbrains/kotlin/ir/types/IrType;)V", "deepCopy", "Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;", "getDeepCopy", "()Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;", "setDeepCopy", "(Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;)V", "scopeStack", "", "Lorg/jetbrains/kotlin/ir/declarations/IrTypeParametersContainer;", "enterScope", "", "irTypeParametersContainer", "leaveScope", "remapType", "type", "remapTypeArgument", "Lorg/jetbrains/kotlin/ir/types/IrTypeArgument;", "typeArgument", "underlyingRemapType", "Lorg/jetbrains/kotlin/ir/types/IrSimpleType;", "isComposableFunction", "", "isFunction", "remapTypeAbbreviation", "Lorg/jetbrains/kotlin/ir/types/impl/IrTypeAbbreviationImpl;", "Lorg/jetbrains/kotlin/ir/types/IrTypeAbbreviation;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTypeRemapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTypeRemapper.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerTypeRemapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n1549#2:516\n1620#2,3:517\n1549#2:520\n1620#2,3:521\n766#2:524\n857#2,2:525\n1549#2:527\n1620#2,3:528\n1549#2:531\n1620#2,3:532\n1549#2:535\n1620#2,3:536\n1549#2:539\n1620#2,3:540\n*S KotlinDebug\n*F\n+ 1 ComposableTypeRemapper.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposerTypeRemapper\n*L\n460#1:516\n460#1:517,3\n475#1:520\n475#1:521,3\n476#1:524\n476#1:525,2\n476#1:527\n476#1:528,3\n488#1:531\n488#1:532,3\n489#1:535\n489#1:536,3\n504#1:539\n504#1:540,3\n*E\n"})
public final class ComposerTypeRemapper implements TypeRemapper {

    @NotNull
    private final IrType composerType;

    @NotNull
    private final IrPluginContext context;
    public IrElementTransformerVoid deepCopy;

    @NotNull
    private final List<IrTypeParametersContainer> scopeStack = new ArrayList();

    @NotNull
    private final SymbolRemapper symbolRemapper;

    public ComposerTypeRemapper(@NotNull IrPluginContext irPluginContext, @NotNull SymbolRemapper symbolRemapper, @NotNull IrType irType) {
        this.context = irPluginContext;
        this.symbolRemapper = symbolRemapper;
        this.composerType = irType;
    }

    private final boolean isComposableFunction(IrType irType) {
        return IrInlineReferenceLocatorKt.isSyntheticComposableFunction(irType) || (isFunction(irType) && ComposeFqNamesKt.hasComposableAnnotation(irType));
    }

    private final boolean isFunction(IrType irType) {
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irType);
        if (classOrNull == null || !StringsKt__StringsJVMKt.startsWith$default(classOrNull.getOwner().getName().asString(), "Function", false, 2, null)) {
            return false;
        }
        FqName packageFqName = AdditionalIrUtilsKt.getPackageFqName(classOrNull.getOwner());
        return Intrinsics.areEqual(packageFqName, StandardNames.BUILT_INS_PACKAGE_FQ_NAME) || Intrinsics.areEqual(packageFqName, ComposableTypeRemapperKt.KotlinFunctionsBuiltInsPackageFqName);
    }

    private final IrTypeAbbreviationImpl remapTypeAbbreviation(IrTypeAbbreviation irTypeAbbreviation) {
        IrTypeAliasSymbol referencedTypeAlias = this.symbolRemapper.getReferencedTypeAlias(irTypeAbbreviation.getTypeAlias());
        boolean hasQuestionMark = irTypeAbbreviation.getHasQuestionMark();
        List arguments = irTypeAbbreviation.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(arguments));
        Iterator it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(remapTypeArgument((IrTypeArgument) it.next()));
        }
        return new IrTypeAbbreviationImpl(referencedTypeAlias, hasQuestionMark, arrayList, irTypeAbbreviation.getAnnotations());
    }

    private final IrTypeArgument remapTypeArgument(IrTypeArgument typeArgument) {
        if (!(typeArgument instanceof IrTypeProjection)) {
            return typeArgument;
        }
        IrTypeProjection irTypeProjection = (IrTypeProjection) typeArgument;
        return IrSimpleTypeImplKt.makeTypeProjection(remapType(irTypeProjection.getType()), irTypeProjection.getVariance());
    }

    private final IrType underlyingRemapType(IrSimpleType type) {
        IrClassifierSymbol referencedClassifier = this.symbolRemapper.getReferencedClassifier(type.getClassifier());
        SimpleTypeNullability nullability = type.getNullability();
        List arguments = type.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(arguments));
        Iterator it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(remapTypeArgument((IrTypeArgument) it.next()));
        }
        List annotations = type.getAnnotations();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(annotations));
        Iterator it2 = annotations.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            IrConstructorCall irConstructorCallTransform = ((IrConstructorCall) it2.next()).transform(getDeepCopy(), (Object) null);
            Intrinsics.checkNotNull(irConstructorCallTransform, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConstructorCall");
            arrayList2.add(irConstructorCallTransform);
        }
        IrTypeAbbreviation abbreviation = type.getAbbreviation();
        return new IrSimpleTypeImpl((KotlinType) null, referencedClassifier, nullability, arrayList, arrayList2, (IrTypeAbbreviation) (abbreviation != null ? remapTypeAbbreviation(abbreviation) : null));
    }

    public void enterScope(@NotNull IrTypeParametersContainer irTypeParametersContainer) {
        this.scopeStack.add(irTypeParametersContainer);
    }

    @NotNull
    public final IrElementTransformerVoid getDeepCopy() {
        IrElementTransformerVoid irElementTransformerVoid = this.deepCopy;
        if (irElementTransformerVoid != null) {
            return irElementTransformerVoid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deepCopy");
        return null;
    }

    public void leaveScope() {
        UtilsKt.pop(this.scopeStack);
    }

    @NotNull
    public IrType remapType(@NotNull IrType type) {
        if (!(type instanceof IrSimpleType)) {
            return type;
        }
        if (!isComposableFunction(type)) {
            return underlyingRemapType((IrSimpleType) type);
        }
        IrDeclaration irDeclaration = (IrTypeParametersContainer) UtilsKt.peek(this.scopeStack);
        if (irDeclaration != null && DecoyTransformBaseKt.isDecoy(irDeclaration)) {
            return underlyingRemapType((IrSimpleType) type);
        }
        IrSimpleType irSimpleType = (IrSimpleType) type;
        List arguments = irSimpleType.getArguments();
        int size = arguments.size() - 1;
        List listListOf = CollectionsKt.listOf(IrSimpleTypeImplKt.makeTypeProjection(this.composerType, Variance.INVARIANT));
        IntRange intRangeUntil = RangesKt.until(0, ComposableFunctionBodyTransformerKt.changedParamCount(size, 1));
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(intRangeUntil));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(IrSimpleTypeImplKt.makeTypeProjection(this.context.getIrBuiltIns().getIntType(), Variance.INVARIANT));
        }
        List listPlus = CollectionsKt.plus((Collection) listListOf, (Iterable) arrayList);
        List listPlus2 = CollectionsKt.plus((Collection<? extends Object>) CollectionsKt.plus((Collection) arguments.subList(0, arguments.size() - 1), (Iterable) listPlus), CollectionsKt.last(arguments));
        IrClassifierSymbol irClassifierSymbolFunction = AbstractComposeLoweringKt.function(this.context, listPlus.size() + (arguments.size() - 1));
        SimpleTypeNullability nullability = irSimpleType.getNullability();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(listPlus2));
        Iterator it2 = listPlus2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(remapTypeArgument((IrTypeArgument) it2.next()));
        }
        List annotations = type.getAnnotations();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : annotations) {
            if (!ComposableTypeRemapperKt.isComposableAnnotation((IrConstructorCall) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.OooO0oo(arrayList3));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            IrConstructorCall irConstructorCallTransform = ((IrConstructorCall) it3.next()).transform(getDeepCopy(), (Object) null);
            Intrinsics.checkNotNull(irConstructorCallTransform, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConstructorCall");
            arrayList4.add(irConstructorCallTransform);
        }
        return new IrSimpleTypeImpl((KotlinType) null, irClassifierSymbolFunction, nullability, arrayList2, arrayList4, (IrTypeAbbreviation) null);
    }

    public final void setDeepCopy(@NotNull IrElementTransformerVoid irElementTransformerVoid) {
        this.deepCopy = irElementTransformerVoid;
    }
}
