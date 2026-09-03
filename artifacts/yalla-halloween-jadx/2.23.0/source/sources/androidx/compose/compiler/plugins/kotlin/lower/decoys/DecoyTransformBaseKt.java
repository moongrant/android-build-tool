package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLoweringKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrConst;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.util.DeepCopyIrTreeWithSymbols;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DeepCopyTypeRemapper;
import org.jetbrains.kotlin.ir.util.DescriptorsRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.PatchDeclarationParentsKt;
import org.jetbrains.kotlin.ir.util.SymbolRemapper;
import org.jetbrains.kotlin.ir.util.TypeRemapper;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformer;
import org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid;
import org.jetbrains.kotlin.ir.visitors.IrVisitorsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\n\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0002¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\b*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\b*\u00020\u000e¨\u0006\u0010"}, d2 = {"copyWithNewTypeParams", "T", "Lorg/jetbrains/kotlin/ir/IrElement;", "source", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "target", "(Lorg/jetbrains/kotlin/ir/IrElement;Lorg/jetbrains/kotlin/ir/declarations/IrFunction;Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Lorg/jetbrains/kotlin/ir/IrElement;", "didDecoyHaveDefaultForValueParameter", "", "paramIndex", "", "getDecoyImplementationDefaultValuesBitMask", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Ljava/lang/Integer;", "isDecoy", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclaration;", "isDecoyImplementation", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDecoyTransformBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt\n+ 2 DeepCopyIrTreeWithSymbols.kt\norg/jetbrains/kotlin/ir/util/DeepCopyIrTreeWithSymbolsKt\n*L\n1#1,216:1\n27#2,10:217\n*S KotlinDebug\n*F\n+ 1 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBaseKt\n*L\n205#1:217,10\n*E\n"})
public final class DecoyTransformBaseKt {
    public static final /* synthetic */ <T extends IrElement> T copyWithNewTypeParams(T t, IrFunction source, IrFunction target) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        SymbolRemapper deepCopySymbolRemapper = new DeepCopySymbolRemapper((DescriptorsRemapper) null, 1, (DefaultConstructorMarker) null);
        IrVisitorsKt.acceptVoid(t, (IrElementVisitorVoid) deepCopySymbolRemapper);
        SymbolRemapper symbolRemapper = deepCopySymbolRemapper;
        DeepCopyTypeRemapper deepCopyTypeRemapper = (TypeRemapper) new DeepCopyTypeRemapper(symbolRemapper);
        IrElementTransformer deepCopyIrTreeWithSymbols = new DeepCopyIrTreeWithSymbols(symbolRemapper, new DecoyTransformBaseKt$copyWithNewTypeParams$1$typeParamRemapper$1(deepCopyTypeRemapper, source, target));
        deepCopyTypeRemapper.setDeepCopy(deepCopyIrTreeWithSymbols);
        T t2 = (T) PatchDeclarationParentsKt.patchDeclarationParents(t.transform(deepCopyIrTreeWithSymbols, (Object) null), (IrDeclarationParent) target);
        Intrinsics.reifiedOperationMarker(1, "T");
        return t2;
    }

    public static final boolean didDecoyHaveDefaultForValueParameter(@NotNull IrFunction irFunction, int i) {
        Intrinsics.checkNotNullParameter(irFunction, "<this>");
        Integer decoyImplementationDefaultValuesBitMask = getDecoyImplementationDefaultValuesBitMask(irFunction);
        return decoyImplementationDefaultValuesBitMask != null && ((decoyImplementationDefaultValuesBitMask.intValue() >> i) & 1) == 1;
    }

    private static final Integer getDecoyImplementationDefaultValuesBitMask(IrFunction irFunction) {
        IrConstructorCall annotation = IrUtilsKt.getAnnotation((IrAnnotationContainer) irFunction, DecoyFqNames.INSTANCE.getDecoyImplementationDefaultsBitMask());
        if (annotation == null) {
            return null;
        }
        IrConst valueArgument = annotation.getValueArgument(0);
        Intrinsics.checkNotNull(valueArgument, "null cannot be cast to non-null type org.jetbrains.kotlin.ir.expressions.IrConst<kotlin.Int>");
        return (Integer) valueArgument.getValue();
    }

    public static final boolean isDecoy(@NotNull IrDeclaration irDeclaration) {
        Intrinsics.checkNotNullParameter(irDeclaration, "<this>");
        return AbstractComposeLoweringKt.hasAnnotationSafe((IrAnnotationContainer) irDeclaration, DecoyFqNames.INSTANCE.getDecoy());
    }

    public static final boolean isDecoyImplementation(@NotNull IrDeclaration irDeclaration) {
        Intrinsics.checkNotNullParameter(irDeclaration, "<this>");
        return AbstractComposeLoweringKt.hasAnnotationSafe((IrAnnotationContainer) irDeclaration, DecoyFqNames.INSTANCE.getDecoyImplementation());
    }
}
