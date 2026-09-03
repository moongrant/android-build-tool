package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeClassIds;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.analysis.Stability;
import androidx.compose.compiler.plugins.kotlin.analysis.StabilityKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.ClassLoweringPass;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.jvm.ir.JvmIrTypeUtilsKt;
import org.jetbrains.kotlin.descriptors.DescriptorVisibilities;
import org.jetbrains.kotlin.descriptors.SourceElement;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrClass;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationParent;
import org.jetbrains.kotlin.ir.declarations.IrField;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.declarations.IrProperty;
import org.jetbrains.kotlin.ir.declarations.IrTypeParameter;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrConstructorCallImpl;
import org.jetbrains.kotlin.ir.expressions.impl.IrExpressionBodyImpl;
import org.jetbrains.kotlin.ir.symbols.IrClassSymbol;
import org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol;
import org.jetbrains.kotlin.ir.types.IrTypesKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoidKt;
import org.jetbrains.kotlin.platform.jvm.JvmPlatformKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/ClassStabilityTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Lorg/jetbrains/kotlin/backend/common/ClassLoweringPass;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;)V", "STABLE", "", "StabilityInferredClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "UNSTABLE", "lower", "", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "irFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitClass", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "addStabilityMarkerField", "stabilityExpression", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassStabilityTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassStabilityTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ClassStabilityTransformer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n1549#2:193\n1620#2,3:194\n*S KotlinDebug\n*F\n+ 1 ClassStabilityTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/ClassStabilityTransformer\n*L\n120#1:193\n120#1:194,3\n*E\n"})
public final class ClassStabilityTransformer extends AbstractComposeLowering implements ClassLoweringPass {
    private final int STABLE;

    @NotNull
    private final IrClassSymbol StabilityInferredClass;
    private final int UNSTABLE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassStabilityTransformer(@NotNull IrPluginContext context, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics) {
        super(context, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.StabilityInferredClass = getTopLevelClass(ComposeClassIds.INSTANCE.getStabilityInferred());
        this.UNSTABLE = StabilityBits.UNSTABLE.bitsForSlot(0);
        this.STABLE = StabilityBits.STABLE.bitsForSlot(0);
    }

    private final void addStabilityMarkerField(IrClass irClass, IrExpression irExpression) {
        IrField irFieldMakeStabilityField = makeStabilityField();
        IrDeclarationParent irDeclarationParent = (IrDeclarationParent) irClass;
        irFieldMakeStabilityField.setParent(irDeclarationParent);
        irFieldMakeStabilityField.setInitializer(new IrExpressionBodyImpl(-1, -1, irExpression));
        if (JvmPlatformKt.isJvm(getContext().getPlatform())) {
            irClass.getDeclarations().add(irFieldMakeStabilityField);
            return;
        }
        IrProperty irPropertyMakeStabilityProp = makeStabilityProp();
        irPropertyMakeStabilityProp.setParent(irDeclarationParent);
        irPropertyMakeStabilityProp.setBackingField(irFieldMakeStabilityField);
        irFieldMakeStabilityField.setCorrespondingPropertySymbol(irPropertyMakeStabilityProp.getSymbol());
        irClass.getDeclarations().add(irPropertyMakeStabilityProp);
    }

    public void lower(@NotNull IrClass irClass) {
        Intrinsics.checkNotNullParameter(irClass, "irClass");
    }

    @NotNull
    public IrStatement visitClass(@NotNull IrClass declaration) {
        IrExpression irExpressionIrStableExpression$default;
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        IrClass irClassVisitClass = super.visitClass(declaration);
        IrClass irClass = irClassVisitClass instanceof IrClass ? irClassVisitClass : null;
        if (irClass == null) {
            return irClassVisitClass;
        }
        if (!Intrinsics.areEqual(irClass.getVisibility(), DescriptorVisibilities.PUBLIC) || IrUtilsKt.isEnumClass(irClass) || IrUtilsKt.isEnumEntry(irClass) || IrUtilsKt.isInterface(irClass) || IrUtilsKt.isAnnotationClass(irClass) || IrUtilsKt.isAnonymousObject(irClass) || irClass.isExpect() || irClass.isInner() || IrUtilsKt.isFileClass((IrDeclaration) irClass) || irClass.isCompanion() || JvmIrTypeUtilsKt.isInlineClassType(IrUtilsKt.getDefaultType(irClass))) {
            return (IrStatement) irClass;
        }
        if (StabilityKt.hasStableMarker((IrAnnotationContainer) declaration)) {
            getMetrics().recordClass(declaration, true, Stability.INSTANCE.getStable());
            addStabilityMarkerField(irClass, (IrExpression) irConst(this.STABLE));
            return (IrStatement) irClass;
        }
        Stability stabilityNormalize = StabilityKt.normalize(StabilityKt.stabilityOf(IrUtilsKt.getDefaultType(declaration)));
        final Ref.IntRef intRef = new Ref.IntRef();
        if (!irClass.getTypeParameters().isEmpty()) {
            List typeParameters = irClass.getTypeParameters();
            final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
            Iterator it = typeParameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((IrTypeParameter) it.next()).getSymbol());
            }
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            StabilityKt.forEach(stabilityNormalize, new Function1<Stability, Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ClassStabilityTransformer.visitClass.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Stability stability) {
                    invoke2(stability);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Stability it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    if (it2 instanceof Stability.Parameter) {
                        int iIndexOf = arrayList.indexOf(((Stability.Parameter) it2).getParameter().getSymbol());
                        if (iIndexOf == -1) {
                            booleanRef.element = true;
                        } else {
                            Ref.IntRef intRef2 = intRef;
                            intRef2.element = (1 | intRef2.element) << iIndexOf;
                        }
                    }
                }
            });
            if (booleanRef.element || (irExpressionIrStableExpression$default = irStableExpression(stabilityNormalize, new Function1<IrTypeParameter, IrExpression>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.ClassStabilityTransformer.visitClass.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final IrExpression invoke(@NotNull IrTypeParameter it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    ClassStabilityTransformer classStabilityTransformer = ClassStabilityTransformer.this;
                    return classStabilityTransformer.irConst(classStabilityTransformer.STABLE);
                }
            })) == null) {
                irExpressionIrStableExpression$default = (IrExpression) irConst(this.UNSTABLE);
            }
        } else {
            irExpressionIrStableExpression$default = AbstractComposeLowering.irStableExpression$default(this, stabilityNormalize, null, 1, null);
            if (irExpressionIrStableExpression$default == null) {
                irExpressionIrStableExpression$default = (IrExpression) irConst(this.UNSTABLE);
            }
        }
        getMetrics().recordClass(declaration, false, stabilityNormalize);
        List annotations = irClass.getAnnotations();
        IrConstructorCallImpl irConstructorCallImpl = new IrConstructorCallImpl(-1, -1, IrTypesKt.getDefaultType(this.StabilityInferredClass), (IrConstructorSymbol) SequencesKt.first(IrUtilsKt.getConstructors(this.StabilityInferredClass)), 0, 0, 1, (IrStatementOrigin) null, (SourceElement) null, PSKKeyManager.MAX_KEY_LENGTH_BYTES, (DefaultConstructorMarker) null);
        irConstructorCallImpl.putValueArgument(0, irConst(intRef.element));
        Unit unit = Unit.INSTANCE;
        irClass.setAnnotations(CollectionsKt.plus((Collection<? extends IrConstructorCallImpl>) annotations, irConstructorCallImpl));
        addStabilityMarkerField(irClass, irExpressionIrStableExpression$default);
        return irClassVisitClass;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        Intrinsics.checkNotNullParameter(module, "module");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) module, this);
    }

    public void lower(@NotNull IrFile irFile) {
        Intrinsics.checkNotNullParameter(irFile, "irFile");
        IrElementTransformerVoidKt.transformChildrenVoid((IrElement) irFile, this);
    }
}
