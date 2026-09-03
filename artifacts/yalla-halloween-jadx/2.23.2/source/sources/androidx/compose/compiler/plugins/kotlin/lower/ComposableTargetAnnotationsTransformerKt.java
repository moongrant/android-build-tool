package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.descriptors.ClassKind;
import org.jetbrains.kotlin.descriptors.Modality;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrCall;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionExpression;
import org.jetbrains.kotlin.ir.expressions.IrTypeOperatorCall;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.IrTypeUtilsKt;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u001c\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\u0006\b\u0000\u0010\u0017\u0018\u0001*\u00020\bH\u0082\b¢\u0006\u0002\u0010\u0018\u001a\f\u0010\u0019\u001a\u00020\u0007*\u00020\u001aH\u0002\u001a\f\u0010\u001b\u001a\u00020\u0007*\u00020\u001aH\u0002\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u001eH\u0002\u001a&\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0001\"\u0004\b\u0000\u0010\u0017*\b\u0012\u0004\u0012\u0002H\u00170 2\u0006\u0010!\u001a\u00020\"H\u0002\" \u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\"\u0018\u0010\n\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t\"\u0018\u0010\u000b\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u0018\u0010\f\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\t\"\u0015\u0010\r\u001a\u00020\u0007*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006#"}, d2 = {"arguments", "", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "Lorg/jetbrains/kotlin/ir/expressions/IrCall;", "getArguments", "(Lorg/jetbrains/kotlin/ir/expressions/IrCall;)Ljava/util/List;", "isComposableInferredTarget", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "(Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;)Z", "isComposableOpenTarget", "isComposableTarget", "isComposableTargetMarked", "isGenericFunction", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "(Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;)Z", "inferenceNodeOf", "Landroidx/compose/compiler/plugins/kotlin/lower/InferenceNode;", "element", "Lorg/jetbrains/kotlin/ir/IrElement;", "transformer", "Landroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformer;", "firstParameterOrNull", "T", "(Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;)Ljava/lang/Object;", "hasOpenTypeParameters", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "hasOverlyWideParameters", "samOwnerOrNull", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "Lorg/jetbrains/kotlin/ir/types/IrType;", "takeUpTo", "", "n", "", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposableTargetAnnotationsTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformerKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1104:1\n381#2,11:1105\n1747#3,3:1116\n1747#3,3:1119\n*S KotlinDebug\n*F\n+ 1 ComposableTargetAnnotationsTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ComposableTargetAnnotationsTransformerKt\n*L\n1078#1:1105,11\n1096#1:1116,3\n1101#1:1119,3\n*E\n"})
public final class ComposableTargetAnnotationsTransformerKt {
    private static final /* synthetic */ <T> T firstParameterOrNull(IrConstructorCall irConstructorCall) {
        T t = null;
        if (irConstructorCall.getValueArgumentsCount() >= 1) {
            IrConst valueArgument = irConstructorCall.getValueArgument(0);
            IrConst irConst = valueArgument instanceof IrConst ? valueArgument : null;
            if (irConst != null) {
                t = (T) irConst.getValue();
            }
            Intrinsics.reifiedOperationMarker(2, "T");
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<IrExpression> getArguments(IrCall irCall) {
        int valueArgumentsCount = irCall.getValueArgumentsCount();
        IrExpression[] irExpressionArr = new IrExpression[valueArgumentsCount];
        for (int i = 0; i < valueArgumentsCount; i++) {
            irExpressionArr[i] = irCall.getValueArgument(i);
        }
        return ArraysKt.toList(irExpressionArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasOpenTypeParameters(IrFunction irFunction) {
        boolean z;
        IrType type;
        IrType type2;
        List valueParameters = irFunction.getValueParameters();
        if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
            Iterator it = valueParameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (IrTypeUtilsKt.isTypeParameter(((IrValueParameter) it.next()).getType())) {
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
        IrValueParameter dispatchReceiverParameter = irFunction.getDispatchReceiverParameter();
        if ((dispatchReceiverParameter == null || (type2 = dispatchReceiverParameter.getType()) == null || !IrTypeUtilsKt.isTypeParameter(type2)) ? false : true) {
            return true;
        }
        IrValueParameter extensionReceiverParameter = irFunction.getExtensionReceiverParameter();
        return extensionReceiverParameter != null && (type = extensionReceiverParameter.getType()) != null && IrTypeUtilsKt.isTypeParameter(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasOverlyWideParameters(IrFunction irFunction) {
        List<IrValueParameter> valueParameters = irFunction.getValueParameters();
        if ((valueParameters instanceof Collection) && valueParameters.isEmpty()) {
            return false;
        }
        for (IrValueParameter irValueParameter : valueParameters) {
            if (IrTypePredicatesKt.isAny(irValueParameter.getType()) || IrTypePredicatesKt.isNullableAny(irValueParameter.getType())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final InferenceNode inferenceNodeOf(@NotNull IrElement irElement, @NotNull ComposableTargetAnnotationsTransformer composableTargetAnnotationsTransformer) {
        if (irElement instanceof IrFunction) {
            return new InferenceFunctionDeclarationNode(composableTargetAnnotationsTransformer, (IrFunction) irElement);
        }
        if (irElement instanceof IrFunctionExpression) {
            return new InferenceFunctionExpressionNode(composableTargetAnnotationsTransformer, (IrFunctionExpression) irElement);
        }
        if (irElement instanceof IrTypeOperatorCall) {
            return inferenceNodeOf(((IrTypeOperatorCall) irElement).getArgument(), composableTargetAnnotationsTransformer);
        }
        if (irElement instanceof IrCall) {
            return new InferenceCallExpression(composableTargetAnnotationsTransformer, (IrCall) irElement);
        }
        return irElement instanceof IrExpression ? new InferenceElementExpression(composableTargetAnnotationsTransformer, (IrExpression) irElement) : new InferenceUnknownElement(irElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableInferredTarget(IrConstructorCall irConstructorCall) {
        IrClassifierSymbol annotationClass = AbstractComposeLoweringKt.getAnnotationClass(irConstructorCall);
        return annotationClass != null && IrTypePredicatesKt.isClassWithFqName(annotationClass, ComposeFqNames.INSTANCE.getComposableInferredTarget().toUnsafe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableOpenTarget(IrConstructorCall irConstructorCall) {
        IrClassifierSymbol annotationClass = AbstractComposeLoweringKt.getAnnotationClass(irConstructorCall);
        return annotationClass != null && IrTypePredicatesKt.isClassWithFqName(annotationClass, ComposeFqNames.INSTANCE.getComposableOpenTarget().toUnsafe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableTarget(IrConstructorCall irConstructorCall) {
        IrClassifierSymbol annotationClass = AbstractComposeLoweringKt.getAnnotationClass(irConstructorCall);
        return annotationClass != null && IrTypePredicatesKt.isClassWithFqName(annotationClass, ComposeFqNames.INSTANCE.getComposableTarget().toUnsafe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableTargetMarked(IrConstructorCall irConstructorCall) {
        IrClass owner;
        List annotations;
        IrClassSymbol annotationClass = AbstractComposeLoweringKt.getAnnotationClass(irConstructorCall);
        return (annotationClass == null || (owner = annotationClass.getOwner()) == null || (annotations = owner.getAnnotations()) == null || !AdditionalIrUtilsKt.hasAnnotation(annotations, ComposeFqNames.INSTANCE.getComposableTargetMarker())) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    public static final boolean isGenericFunction(@NotNull IrSimpleFunctionSymbol irSimpleFunctionSymbol) {
        boolean z;
        IrSimpleType type;
        if (!irSimpleFunctionSymbol.getOwner().getTypeParameters().isEmpty()) {
            return true;
        }
        IrValueParameter dispatchReceiverParameter = irSimpleFunctionSymbol.getOwner().getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null || (type = dispatchReceiverParameter.getType()) == null) {
            z = false;
        } else {
            if ((type instanceof IrSimpleType) && (type.getArguments().isEmpty() ^ true)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IrSimpleFunction samOwnerOrNull(IrType irType) {
        IrClassSymbol classOrNull = IrTypesKt.getClassOrNull(irType);
        if (classOrNull == null || classOrNull.getOwner().getKind() != ClassKind.INTERFACE) {
            return null;
        }
        Iterator it = IrUtilsKt.getFunctions(classOrNull).iterator();
        Object obj = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((IrSimpleFunctionSymbol) next).getOwner().getModality() == Modality.ABSTRACT) {
                if (!z) {
                    obj = next;
                    z = true;
                }
            }
            obj = null;
            break;
        }
        IrSimpleFunctionSymbol irSimpleFunctionSymbol = (IrSimpleFunctionSymbol) obj;
        if (irSimpleFunctionSymbol != null) {
            return irSimpleFunctionSymbol.getOwner();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<T> takeUpTo(Iterable<? extends T> iterable, int i) {
        return i <= 0 ? CollectionsKt.emptyList() : CollectionsKt.take(iterable, i);
    }
}
