package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationOrigin;
import org.jetbrains.kotlin.ir.declarations.IrDeclarationsKt;
import org.jetbrains.kotlin.ir.declarations.IrFile;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrSimpleFunction;
import org.jetbrains.kotlin.ir.declarations.IrValueParameter;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;
import org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypeArgument;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0002J\f\u0010\u0016\u001a\u00020\u0012*\u00020\u0015H\u0002J\f\u0010\u0017\u001a\u00020\u0012*\u00020\u0015H\u0002J\f\u0010\u0018\u001a\u00020\u0012*\u00020\u0019H\u0002J\f\u0010\u001a\u001a\u00020\u0012*\u00020\u0015H\u0004R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBase;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "signatureBuilder", "Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;)V", "getSignatureBuilder", "()Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "visitFile", "Lorg/jetbrains/kotlin/ir/declarations/IrFile;", "declaration", "hasComposable", "", "Lorg/jetbrains/kotlin/ir/types/IrType;", "hasComposableParameter", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "isEnumConstructor", "isLocalFunction", "overridesComposable", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "shouldBeRemapped", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbstractDecoysLowering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoysLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering\n+ 2 AbstractComposeLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/AbstractComposeLoweringKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1146#2,6:94\n1747#3,3:100\n1747#3,3:103\n1747#3,3:106\n*S KotlinDebug\n*F\n+ 1 AbstractDecoysLowering.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering\n*L\n50#1:94,6\n72#1:100,3\n77#1:103,3\n89#1:106,3\n*E\n"})
public abstract class AbstractDecoysLowering extends AbstractComposeLowering implements DecoyTransformBase {

    @NotNull
    private final IdSignatureSerializer signatureBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDecoysLowering(@NotNull IrPluginContext pluginContext, @NotNull DeepCopySymbolRemapper symbolRemapper, @NotNull ModuleMetrics metrics, @NotNull IdSignatureSerializer signatureBuilder) {
        super(pluginContext, symbolRemapper, metrics);
        Intrinsics.checkNotNullParameter(pluginContext, "pluginContext");
        Intrinsics.checkNotNullParameter(symbolRemapper, "symbolRemapper");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(signatureBuilder, "signatureBuilder");
        this.signatureBuilder = signatureBuilder;
    }

    private final boolean hasComposable(IrType irType) {
        if (IrUtilsKt.hasAnnotation((IrAnnotationContainer) irType, ComposeFqNames.INSTANCE.getComposable())) {
            return true;
        }
        if (irType instanceof IrSimpleType) {
            List<IrTypeArgument> arguments = ((IrSimpleType) irType).getArguments();
            if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                for (IrTypeArgument irTypeArgument : arguments) {
                    IrType irType2 = irTypeArgument instanceof IrType ? (IrType) irTypeArgument : null;
                    if (irType2 != null && hasComposable(irType2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean hasComposableParameter(IrFunction irFunction) {
        boolean z;
        IrType type;
        List valueParameters = irFunction.getValueParameters();
        if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
            Iterator it = valueParameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (hasComposable(((IrValueParameter) it.next()).getType())) {
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
        IrValueParameter extensionReceiverParameter = irFunction.getExtensionReceiverParameter();
        return extensionReceiverParameter != null && (type = extensionReceiverParameter.getType()) != null && hasComposable(type);
    }

    private final boolean isEnumConstructor(IrFunction irFunction) {
        return (irFunction instanceof IrConstructor) && IrUtilsKt.isEnumClass(IrUtilsKt.getParentAsClass((IrDeclaration) irFunction));
    }

    private final boolean isLocalFunction(IrFunction irFunction) {
        return Intrinsics.areEqual(irFunction.getOrigin(), IrDeclarationOrigin.LOCAL_FUNCTION_FOR_LAMBDA.INSTANCE) || (AdditionalIrUtilsKt.isLocal((IrDeclaration) irFunction) && (irFunction instanceof IrSimpleFunction) && !overridesComposable((IrSimpleFunction) irFunction));
    }

    private final boolean overridesComposable(IrSimpleFunction irSimpleFunction) {
        List<IrSimpleFunctionSymbol> overriddenSymbols = irSimpleFunction.getOverriddenSymbols();
        if ((overriddenSymbols instanceof Collection) && overriddenSymbols.isEmpty()) {
            return false;
        }
        for (IrSimpleFunctionSymbol irSimpleFunctionSymbol : overriddenSymbols) {
            if (DecoyTransformBaseKt.isDecoy(irSimpleFunctionSymbol.getOwner()) || shouldBeRemapped(irSimpleFunctionSymbol.getOwner())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    public final /* synthetic */ IrFunctionSymbol getComposableForDecoy(IrFunction irFunction) {
        return OooO00o.OooO00o(this, irFunction);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    public final /* synthetic */ Long getDecoyImplementationId(IrFunction irFunction) {
        return OooO00o.OooO0O0(this, irFunction);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    public final /* synthetic */ String getDecoyImplementationName(IrFunction irFunction) {
        return OooO00o.OooO0OO(this, irFunction);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    @NotNull
    public IdSignatureSerializer getSignatureBuilder() {
        return this.signatureBuilder;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    public final /* synthetic */ long getSignatureId(IrFunction irFunction) {
        return OooO00o.OooO0Oo(this, irFunction);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    public final /* synthetic */ IrExpression irVarargString(List list) {
        return OooO00o.OooO0o0(this, list);
    }

    public final boolean shouldBeRemapped(@NotNull IrFunction irFunction) {
        Intrinsics.checkNotNullParameter(irFunction, "<this>");
        return (isLocalFunction(irFunction) || isEnumConstructor(irFunction) || (!hasComposableAnnotation((IrAnnotationContainer) irFunction) && !hasComposableParameter(irFunction))) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.jetbrains.kotlin.com.intellij.openapi.progress.ProcessCanceledException */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public IrFile visitFile(@NotNull final IrFile declaration) throws Exception {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        try {
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = declaration;
            getSignatureBuilder().inFile(declaration.getSymbol(), new Function0<Unit>() { // from class: androidx.compose.compiler.plugins.kotlin.lower.decoys.AbstractDecoysLowering$visitFile$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, org.jetbrains.kotlin.ir.declarations.IrFile] */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.element = super/*androidx.compose.compiler.plugins.kotlin.lower.AbstractComposeLowering*/.visitFile(declaration);
                }
            });
            return (IrFile) objectRef.element;
        } catch (ProcessCanceledException e) {
            throw e;
        } catch (Exception e2) {
            throw new Exception(o00O00OO.OooO00o("IR lowering failed at: ", IrDeclarationsKt.getName(declaration)), e2);
        }
    }
}
