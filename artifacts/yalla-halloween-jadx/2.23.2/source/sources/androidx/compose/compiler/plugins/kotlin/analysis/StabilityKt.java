package androidx.compose.compiler.plugins.kotlin.analysis;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLoweringKt;
import androidx.compose.compiler.plugins.kotlin.lower.IrInlineReferenceLocatorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrTypeUtilsKt;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationWithName;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.declarations.IrVariable;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrComposite;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrGetValue;
import org.jetbrains.kotlin.ir.expressions.IrLocalDelegatedPropertyReference;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrTypeParameterSymbol;
import org.jetbrains.kotlin.ir.types.IrDynamicType;
import org.jetbrains.kotlin.ir.types.IrErrorType;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrStarProjection;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeAbbreviation;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.types.IrTypeProjection;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.InlineClassesKt;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.name.FqName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0010\u001a2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013\u001a2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u001e\u0010\u0016\u001a\u00020\u0017*\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\u001c\u001a\n\u0010\u001d\u001a\u00020\u0001*\u00020\u0005\u001a\f\u0010\u001e\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u001f\u001a\u00020\u0001*\u00020 H\u0002\u001a\n\u0010!\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\"\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010#\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010$\u001a\u00020\u0005*\u00020\u0005\u001a\u0013\u0010%\u001a\u0004\u0018\u00010&*\u00020\u001cH\u0002¢\u0006\u0002\u0010'\u001a\u0018\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007*\u00020)H\u0002¨\u0006*"}, d2 = {"canInferStability", "", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "stabilityOf", "Landroidx/compose/compiler/plugins/kotlin/analysis/Stability;", "substitutions", "", "Lorg/jetbrains/kotlin/ir/symbols/IrTypeParameterSymbol;", "Lorg/jetbrains/kotlin/ir/types/IrTypeArgument;", "currentlyAnalyzing", "", "Lorg/jetbrains/kotlin/ir/symbols/IrClassifierSymbol;", "expr", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "baseStability", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "classifier", "irType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "type", "argument", "forEach", "", "callback", "Lkotlin/Function1;", "hasStableMarkedDescendant", "hasStableMarker", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "isExpressible", "isProtobufType", "isStableMarker", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "isUncertain", "knownStable", "knownUnstable", "normalize", "stabilityParamBitmask", "", "(Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;)Ljava/lang/Integer;", "substitutionMap", "Lorg/jetbrains/kotlin/ir/types/IrSimpleType;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stability.kt\nandroidx/compose/compiler/plugins/kotlin/analysis/StabilityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n1747#2,3:457\n1726#2,3:460\n1747#2,3:463\n1726#2,3:466\n1855#2,2:469\n1747#2,3:471\n1747#2,3:474\n533#2,6:477\n1569#2,11:483\n1864#2,2:494\n1866#2:497\n1580#2:498\n1549#2:499\n1620#2,3:500\n766#2:503\n857#2,2:504\n1603#2,9:506\n1855#2:515\n1856#2:517\n1612#2:518\n1726#2,3:520\n1#3:496\n1#3:516\n1#3:519\n*S KotlinDebug\n*F\n+ 1 Stability.kt\nandroidx/compose/compiler/plugins/kotlin/analysis/StabilityKt\n*L\n131#1:457,3\n139#1:460,3\n147#1:463,3\n155#1:466,3\n199#1:469,2\n206#1:471,3\n213#1:474,3\n222#1:477,6\n268#1:483,11\n268#1:494,2\n268#1:497\n268#1:498\n401#1:499\n401#1:500,3\n403#1:503\n403#1:504,2\n416#1:506,9\n416#1:515\n416#1:517\n416#1:518\n447#1:520,3\n268#1:496\n416#1:516\n*E\n"})
public final class StabilityKt {
    private static final boolean canInferStability(IrClass irClass) {
        String string;
        FqName fqNameWhenAvailable = IrUtilsKt.getFqNameWhenAvailable((IrDeclarationWithName) irClass);
        if (fqNameWhenAvailable == null || (string = fqNameWhenAvailable.toString()) == null) {
            string = "";
        }
        return KnownStableConstructs.INSTANCE.getStableTypes().containsKey(string) || Intrinsics.areEqual(irClass.getOrigin(), IrDeclarationOrigin.IR_EXTERNAL_DECLARATION_STUB.INSTANCE);
    }

    public static final void forEach(@NotNull Stability stability, @NotNull Function1<? super Stability, Unit> function1) {
        if (!(stability instanceof Stability.Combined)) {
            function1.invoke(stability);
            return;
        }
        Iterator<T> it = ((Stability.Combined) stability).getElements().iterator();
        while (it.hasNext()) {
            forEach((Stability) it.next(), function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    private static final boolean hasStableMarkedDescendant(IrClass irClass) {
        boolean z;
        IrClass owner;
        if (hasStableMarker((IrAnnotationContainer) irClass)) {
            return true;
        }
        List<IrType> superTypes = irClass.getSuperTypes();
        if (!(superTypes instanceof Collection) || !superTypes.isEmpty()) {
            for (IrType irType : superTypes) {
                if (IrTypePredicatesKt.isAny(irType)) {
                    z = false;
                } else {
                    IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irType);
                    if ((classOrNull == null || (owner = classOrNull.getOwner()) == null || !hasStableMarkedDescendant(owner)) ? false : true) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean hasStableMarker(@NotNull IrAnnotationContainer irAnnotationContainer) {
        List annotations = irAnnotationContainer.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (isStableMarker((IrConstructorCall) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isExpressible(@NotNull Stability stability) {
        if ((stability instanceof Stability.Certain) || (stability instanceof Stability.Runtime)) {
            return true;
        }
        if (!(stability instanceof Stability.Unknown)) {
            if (stability instanceof Stability.Parameter) {
                return true;
            }
            if (!(stability instanceof Stability.Combined)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Stability> elements = ((Stability.Combined) stability).getElements();
            if ((elements instanceof Collection) && elements.isEmpty()) {
                return true;
            }
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!isExpressible((Stability) it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    private static final boolean isProtobufType(IrClass irClass) {
        String string;
        Object objPrevious;
        IrClassSymbol classOrNull;
        IrDeclarationWithName irDeclarationWithName;
        FqName fqNameWhenAvailable;
        if (!IrUtilsKt.isFinalClass(irClass)) {
            return false;
        }
        List superTypes = irClass.getSuperTypes();
        ListIterator listIterator = superTypes.listIterator(superTypes.size());
        do {
            string = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(!IrTypeUtilsKt.isInterface((IrType) objPrevious)));
        IrType irType = (IrType) objPrevious;
        if (irType != null && (classOrNull = IrTypesKt.getClassOrNull(irType)) != null && (irDeclarationWithName = (IrClass) classOrNull.getOwner()) != null && (fqNameWhenAvailable = IrUtilsKt.getFqNameWhenAvailable(irDeclarationWithName)) != null) {
            string = fqNameWhenAvailable.toString();
        }
        return Intrinsics.areEqual(string, "com.google.protobuf.GeneratedMessageLite") || Intrinsics.areEqual(string, "com.google.protobuf.GeneratedMessage");
    }

    private static final boolean isStableMarker(IrConstructorCall irConstructorCall) {
        IrAnnotationContainer irAnnotationContainer;
        IrClassSymbol annotationClass = AbstractComposeLoweringKt.getAnnotationClass(irConstructorCall);
        return (annotationClass == null || (irAnnotationContainer = (IrClass) annotationClass.getOwner()) == null || !IrUtilsKt.hasAnnotation(irAnnotationContainer, ComposeFqNames.INSTANCE.getStableMarker())) ? false : true;
    }

    public static final boolean isUncertain(@NotNull Stability stability) {
        if (stability instanceof Stability.Certain) {
            return false;
        }
        if (!(stability instanceof Stability.Runtime) && !(stability instanceof Stability.Unknown) && !(stability instanceof Stability.Parameter)) {
            if (!(stability instanceof Stability.Combined)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Stability> elements = ((Stability.Combined) stability).getElements();
            if ((elements instanceof Collection) && elements.isEmpty()) {
                return false;
            }
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (isUncertain((Stability) it.next())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean knownStable(@NotNull Stability stability) {
        if (stability instanceof Stability.Certain) {
            return ((Stability.Certain) stability).getStable();
        }
        if (!(stability instanceof Stability.Runtime) && !(stability instanceof Stability.Unknown) && !(stability instanceof Stability.Parameter)) {
            if (!(stability instanceof Stability.Combined)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Stability> elements = ((Stability.Combined) stability).getElements();
            if (!(elements instanceof Collection) || !elements.isEmpty()) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    if (!knownStable((Stability) it.next())) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean knownUnstable(@NotNull Stability stability) {
        if (stability instanceof Stability.Certain) {
            if (!((Stability.Certain) stability).getStable()) {
                return true;
            }
        } else if (!(stability instanceof Stability.Runtime) && !(stability instanceof Stability.Unknown) && !(stability instanceof Stability.Parameter)) {
            if (!(stability instanceof Stability.Combined)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Stability> elements = ((Stability.Combined) stability).getElements();
            if (!(elements instanceof Collection) || !elements.isEmpty()) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    if (knownUnstable((Stability) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final Stability normalize(@NotNull Stability stability) {
        if (stability instanceof Stability.Certain ? true : stability instanceof Stability.Parameter ? true : stability instanceof Stability.Runtime ? true : stability instanceof Stability.Unknown) {
            return stability;
        }
        boolean z = stability instanceof Stability.Combined;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        List listMutableListOf = CollectionsKt.mutableListOf(stability);
        while (!listMutableListOf.isEmpty()) {
            Stability stability2 = (Stability) listMutableListOf.remove(listMutableListOf.size() - 1);
            if (stability2 instanceof Stability.Combined) {
                listMutableListOf.addAll(((Stability.Combined) stability2).getElements());
            } else if (stability2 instanceof Stability.Certain) {
                if (!((Stability.Certain) stability2).getStable()) {
                    return Stability.INSTANCE.getUnstable();
                }
            } else if (stability2 instanceof Stability.Parameter) {
                Stability.Parameter parameter = (Stability.Parameter) stability2;
                if (linkedHashSet.contains(parameter.getParameter().getSymbol())) {
                    linkedHashSet.add(parameter.getParameter().getSymbol());
                    arrayList.add(stability2);
                }
            } else if (stability2 instanceof Stability.Runtime) {
                arrayList.add(stability2);
            } else {
                boolean z2 = stability2 instanceof Stability.Unknown;
            }
        }
        return new Stability.Combined(arrayList);
    }

    @NotNull
    public static final Stability stabilityOf(@NotNull IrType irType) {
        return stabilityOf(irType, (Map<IrTypeParameterSymbol, ? extends IrTypeArgument>) MapsKt.emptyMap(), (Set<? extends IrClassifierSymbol>) SetsKt.emptySet());
    }

    private static final Integer stabilityParamBitmask(IrAnnotationContainer irAnnotationContainer) {
        IrConstructorCall irConstructorCallFindAnnotation = AdditionalIrUtilsKt.findAnnotation(irAnnotationContainer.getAnnotations(), ComposeFqNames.INSTANCE.getStabilityInferred());
        IrExpression valueArgument = irConstructorCallFindAnnotation != null ? irConstructorCallFindAnnotation.getValueArgument(0) : null;
        IrConst irConst = valueArgument instanceof IrConst ? (IrConst) valueArgument : null;
        Object value = irConst != null ? irConst.getValue() : null;
        if (value instanceof Integer) {
            return (Integer) value;
        }
        return null;
    }

    private static final Map<IrTypeParameterSymbol, IrTypeArgument> substitutionMap(IrSimpleType irSimpleType) {
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull((IrType) irSimpleType);
        if (classOrNull == null) {
            return MapsKt.emptyMap();
        }
        List typeParameters = classOrNull.getOwner().getTypeParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(typeParameters));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((IrTypeParameter) it.next()).getSymbol());
        }
        List listZip = CollectionsKt.zip(arrayList, irSimpleType.getArguments());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listZip) {
            Pair pair = (Pair) obj;
            IrTypeParameterSymbol irTypeParameterSymbol = (IrTypeParameterSymbol) pair.component1();
            IrSimpleType irSimpleType2 = (IrTypeArgument) pair.component2();
            IrSimpleType irSimpleType3 = irSimpleType2 instanceof IrSimpleType ? irSimpleType2 : null;
            if (!Intrinsics.areEqual(irTypeParameterSymbol, irSimpleType3 != null ? irSimpleType3.getClassifier() : null)) {
                arrayList2.add(obj);
            }
        }
        return MapsKt.toMap(arrayList2);
    }

    private static final Stability stabilityOf(IrClass irClass, Map<IrTypeParameterSymbol, ? extends IrTypeArgument> map, Set<? extends IrClassifierSymbol> set) {
        String string;
        int iIntValue;
        Stability runtime;
        Stability stabilityStabilityOf;
        IrClassSymbol symbol = irClass.getSymbol();
        if (set.contains(symbol)) {
            return Stability.INSTANCE.getUnstable();
        }
        if (hasStableMarkedDescendant(irClass)) {
            return Stability.INSTANCE.getStable();
        }
        if (IrUtilsKt.isEnumClass(irClass) || IrUtilsKt.isEnumEntry(irClass)) {
            return Stability.INSTANCE.getStable();
        }
        int i = 0;
        if (!IrTypePredicatesKt.isPrimitiveType$default(IrUtilsKt.getDefaultType(irClass), false, 1, (Object) null) && !isProtobufType(irClass)) {
            if (Intrinsics.areEqual(irClass.getOrigin(), IrDeclarationOrigin.IR_BUILTINS_STUB.INSTANCE)) {
                throw new IllegalStateException(("Builtins Stub: " + irClass.getName()).toString());
            }
            Set setPlus = SetsKt.plus((Set<? extends IrClassSymbol>) set, symbol);
            if (!canInferStability(irClass)) {
                if (Intrinsics.areEqual(irClass.getOrigin(), IrDeclarationOrigin.IR_EXTERNAL_JAVA_DECLARATION_STUB.INSTANCE)) {
                    return Stability.INSTANCE.getUnstable();
                }
                if (IrUtilsKt.isInterface(irClass)) {
                    return new Stability.Unknown(irClass);
                }
                Stability stable = Stability.INSTANCE.getStable();
                for (IrField irField : irClass.getDeclarations()) {
                    if (irField instanceof IrProperty) {
                        IrProperty irProperty = (IrProperty) irField;
                        IrField backingField = irProperty.getBackingField();
                        if (backingField == null) {
                            continue;
                        } else {
                            if (irProperty.isVar() && !irProperty.isDelegated()) {
                                return Stability.INSTANCE.getUnstable();
                            }
                            stable = stable.plus(stabilityOf(backingField.getType(), map, (Set<? extends IrClassifierSymbol>) setPlus));
                        }
                    } else if (irField instanceof IrField) {
                        stable = stable.plus(stabilityOf(irField.getType(), map, (Set<? extends IrClassifierSymbol>) setPlus));
                    }
                }
                return stable;
            }
            FqName fqNameWhenAvailable = IrUtilsKt.getFqNameWhenAvailable((IrDeclarationWithName) irClass);
            if (fqNameWhenAvailable == null || (string = fqNameWhenAvailable.toString()) == null) {
                string = "";
            }
            KnownStableConstructs knownStableConstructs = KnownStableConstructs.INSTANCE;
            if (knownStableConstructs.getStableTypes().containsKey(string)) {
                Integer num = knownStableConstructs.getStableTypes().get(string);
                iIntValue = num != null ? num.intValue() : 0;
                runtime = Stability.INSTANCE.getStable();
            } else {
                Integer numStabilityParamBitmask = stabilityParamBitmask((IrAnnotationContainer) irClass);
                if (numStabilityParamBitmask == null) {
                    return Stability.INSTANCE.getUnstable();
                }
                iIntValue = numStabilityParamBitmask.intValue();
                runtime = new Stability.Runtime(irClass);
            }
            if (iIntValue == 0) {
                return runtime;
            }
            List typeParameters = irClass.getTypeParameters();
            ArrayList arrayList = new ArrayList();
            for (Object obj : typeParameters) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                IrTypeParameter irTypeParameter = (IrTypeParameter) obj;
                if (((1 << i) & iIntValue) != 0) {
                    IrTypeArgument irTypeArgument = map.get(irTypeParameter.getSymbol());
                    stabilityStabilityOf = irTypeArgument != null ? stabilityOf(irTypeArgument, map, (Set<? extends IrClassifierSymbol>) setPlus) : new Stability.Parameter(irTypeParameter);
                } else {
                    stabilityStabilityOf = null;
                }
                if (stabilityStabilityOf != null) {
                    arrayList.add(stabilityStabilityOf);
                }
                i = i2;
            }
            return runtime.plus(new Stability.Combined(arrayList));
        }
        return Stability.INSTANCE.getStable();
    }

    private static final Stability stabilityOf(IrClassifierSymbol irClassifierSymbol, Map<IrTypeParameterSymbol, ? extends IrTypeArgument> map, Set<? extends IrClassifierSymbol> set) {
        IrClass owner = irClassifierSymbol.getOwner();
        if (owner instanceof IrClass) {
            return stabilityOf(owner, map, set);
        }
        if (owner instanceof IrTypeParameter) {
            return Stability.INSTANCE.getUnstable();
        }
        throw new IllegalStateException(("Unexpected IrClassifier: " + owner).toString());
    }

    private static final Stability stabilityOf(IrTypeArgument irTypeArgument, Map<IrTypeParameterSymbol, ? extends IrTypeArgument> map, Set<? extends IrClassifierSymbol> set) {
        if (irTypeArgument instanceof IrStarProjection) {
            return Stability.INSTANCE.getUnstable();
        }
        if (irTypeArgument instanceof IrTypeProjection) {
            return stabilityOf(((IrTypeProjection) irTypeArgument).getType(), map, set);
        }
        throw new IllegalStateException(("Unexpected IrTypeArgument: " + irTypeArgument).toString());
    }

    private static final Stability stabilityOf(IrType irType, Map<IrTypeParameterSymbol, ? extends IrTypeArgument> map, Set<? extends IrClassifierSymbol> set) {
        if (!(irType instanceof IrErrorType) && !(irType instanceof IrDynamicType)) {
            if (!IrTypePredicatesKt.isUnit(irType) && !IrTypePredicatesKt.isPrimitiveType$default(irType, false, 1, (Object) null) && !IrTypeUtilsKt.isFunctionOrKFunction(irType) && !IrInlineReferenceLocatorKt.isSyntheticComposableFunction(irType) && !IrTypePredicatesKt.isString(irType)) {
                if (IrTypeUtilsKt.isTypeParameter(irType)) {
                    IrTypeParameterSymbol classifierOrNull = IrTypesKt.getClassifierOrNull(irType);
                    Intrinsics.checkNotNull(classifierOrNull, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.symbols.IrTypeParameterSymbol");
                    IrTypeArgument irTypeArgument = map.get(classifierOrNull);
                    if (irTypeArgument != null) {
                        return stabilityOf(irTypeArgument, map, set);
                    }
                    IrTypeParameter owner = IrTypesKt.getClassifierOrFail(irType).getOwner();
                    Intrinsics.checkNotNull(owner, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.declarations.IrTypeParameter");
                    return new Stability.Parameter(owner);
                }
                if (org.jetbrains.kotlin.ir.types.IrTypeUtilsKt.isNullable(irType)) {
                    return stabilityOf(IrTypesKt.makeNotNull(irType), map, set);
                }
                if (JvmIrTypeUtilsKt.isInlineClassType(irType)) {
                    IrAnnotationContainer irAnnotationContainer = IrTypesKt.getClass(irType);
                    if (irAnnotationContainer != null) {
                        if (hasStableMarker(irAnnotationContainer)) {
                            return Stability.INSTANCE.getStable();
                        }
                        return stabilityOf(InlineClassesKt.getInlineClassUnderlyingType(irAnnotationContainer), map, set);
                    }
                    throw new IllegalStateException(("Failed to resolve the class definition of inline type " + irType).toString());
                }
                if (irType instanceof IrSimpleType) {
                    IrSimpleType irSimpleType = (IrSimpleType) irType;
                    return stabilityOf(irSimpleType.getClassifier(), (Map<IrTypeParameterSymbol, ? extends IrTypeArgument>) MapsKt.plus(map, substitutionMap(irSimpleType)), set);
                }
                if (irType instanceof IrTypeAbbreviation) {
                    return stabilityOf(((IrTypeAbbreviation) irType).getTypeAlias().getOwner().getExpandedType(), map, set);
                }
                throw new IllegalStateException(("Unexpected IrType: " + irType).toString());
            }
            return Stability.INSTANCE.getStable();
        }
        return Stability.INSTANCE.getUnstable();
    }

    private static final Stability stabilityOf(IrCall irCall, Stability stability) {
        Stability unstable;
        Integer num = KnownStableConstructs.INSTANCE.getStableFunctions().get(AdditionalIrUtilsKt.getKotlinFqName((IrSimpleFunction) irCall.getSymbol().getOwner()).asString());
        if (num == null) {
            return stability;
        }
        if (num.intValue() == 0) {
            return Stability.INSTANCE.getStable();
        }
        IntRange intRangeUntil = RangesKt.until(0, irCall.getTypeArgumentsCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if ((num.intValue() & (1 << iNextInt)) != 0) {
                IrType typeArgument = irCall.getTypeArgument(iNextInt);
                if (typeArgument != null) {
                    unstable = stabilityOf(typeArgument);
                } else {
                    unstable = Stability.INSTANCE.getUnstable();
                }
            } else {
                unstable = null;
            }
            if (unstable != null) {
                arrayList.add(unstable);
            }
        }
        return new Stability.Combined(arrayList);
    }

    @NotNull
    public static final Stability stabilityOf(@NotNull IrExpression irExpression) {
        IrExpression initializer;
        Stability stabilityStabilityOf;
        Stability stabilityStabilityOf2 = stabilityOf(irExpression.getType());
        if (knownStable(stabilityStabilityOf2)) {
            return stabilityStabilityOf2;
        }
        if (irExpression instanceof IrConst) {
            return Stability.INSTANCE.getStable();
        }
        if (irExpression instanceof IrCall) {
            return stabilityOf((IrCall) irExpression, stabilityStabilityOf2);
        }
        if (irExpression instanceof IrGetValue) {
            IrVariable owner = ((IrGetValue) irExpression).getSymbol().getOwner();
            if (!(owner instanceof IrVariable)) {
                return stabilityStabilityOf2;
            }
            IrVariable irVariable = owner;
            return (irVariable.isVar() || (initializer = irVariable.getInitializer()) == null || (stabilityStabilityOf = stabilityOf(initializer)) == null) ? stabilityStabilityOf2 : stabilityStabilityOf;
        }
        if (irExpression instanceof IrLocalDelegatedPropertyReference) {
            return Stability.INSTANCE.getStable();
        }
        if (!(irExpression instanceof IrComposite)) {
            return stabilityStabilityOf2;
        }
        List<IrExpression> statements = ((IrComposite) irExpression).getStatements();
        boolean z = true;
        if (!(statements instanceof Collection) || !statements.isEmpty()) {
            for (IrExpression irExpression2 : statements) {
                if (!((irExpression2 instanceof IrExpression) && knownStable(stabilityOf(irExpression2)))) {
                    z = false;
                    break;
                }
            }
        }
        return z ? Stability.INSTANCE.getStable() : stabilityStabilityOf2;
    }
}
