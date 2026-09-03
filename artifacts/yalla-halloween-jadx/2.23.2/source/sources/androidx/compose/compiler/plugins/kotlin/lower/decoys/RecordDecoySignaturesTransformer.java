package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import androidx.compose.compiler.plugins.kotlin.ModuleMetrics;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.declarations.IrDeclaration;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.util.DeepCopySymbolRemapper;
import org.jetbrains.kotlin.ir.util.DumpIrTreeKt;
import org.jetbrains.kotlin.ir.util.IdSignature;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.ir.util.KotlinMangler;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\f\u0010\u001e\u001a\u00020\u001f*\u00020 H\u0002R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/RecordDecoySignaturesTransformer;", "Landroidx/compose/compiler/plugins/kotlin/lower/decoys/AbstractDecoysLowering;", "Landroidx/compose/compiler/plugins/kotlin/lower/ModuleLoweringPass;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "symbolRemapper", "Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;", "signatureBuilder", "Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "metrics", "Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;", "mangler", "Lorg/jetbrains/kotlin/ir/util/KotlinMangler$IrMangler;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlin/ir/util/DeepCopySymbolRemapper;Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;Landroidx/compose/compiler/plugins/kotlin/ModuleMetrics;Lorg/jetbrains/kotlin/ir/util/KotlinMangler$IrMangler;)V", "getMangler", "()Lorg/jetbrains/kotlin/ir/util/KotlinMangler$IrMangler;", "getSignatureBuilder", "()Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "findNearestCommonSignature", "Lorg/jetbrains/kotlin/ir/util/IdSignature$CommonSignature;", "sig", "Lorg/jetbrains/kotlin/ir/util/IdSignature;", "lower", "", "module", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "visitFunction", "Lorg/jetbrains/kotlin/ir/IrStatement;", "declaration", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "canBeLinkedAgainst", "", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclaration;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecordDecoySignaturesTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordDecoySignaturesTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/RecordDecoySignaturesTransformer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
public final class RecordDecoySignaturesTransformer extends AbstractDecoysLowering {

    @NotNull
    private final KotlinMangler.IrMangler mangler;

    @NotNull
    private final IdSignatureSerializer signatureBuilder;

    public RecordDecoySignaturesTransformer(@NotNull IrPluginContext irPluginContext, @NotNull DeepCopySymbolRemapper deepCopySymbolRemapper, @NotNull IdSignatureSerializer idSignatureSerializer, @NotNull ModuleMetrics moduleMetrics, @NotNull KotlinMangler.IrMangler irMangler) {
        super(irPluginContext, deepCopySymbolRemapper, moduleMetrics, idSignatureSerializer);
        this.signatureBuilder = idSignatureSerializer;
        this.mangler = irMangler;
    }

    private final boolean canBeLinkedAgainst(IrDeclaration irDeclaration) {
        return this.mangler.isExported(irDeclaration, false);
    }

    private final IdSignature.CommonSignature findNearestCommonSignature(IdSignature sig) {
        if (sig instanceof IdSignature.CommonSignature) {
            return (IdSignature.CommonSignature) sig;
        }
        if (sig instanceof IdSignature.CompositeSignature) {
            return findNearestCommonSignature(((IdSignature.CompositeSignature) sig).getInner());
        }
        return null;
    }

    @NotNull
    public final KotlinMangler.IrMangler getMangler() {
        return this.mangler;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.decoys.AbstractDecoysLowering, androidx.compose.compiler.plugins.kotlin.lower.decoys.DecoyTransformBase
    @NotNull
    public IdSignatureSerializer getSignatureBuilder() {
        return this.signatureBuilder;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.lower.ModuleLoweringPass
    public void lower(@NotNull IrModuleFragment module) {
        transformChildrenVoid((IrElement) module);
    }

    @NotNull
    public IrStatement visitFunction(@NotNull IrFunction declaration) {
        IrDeclaration irDeclaration = (IrDeclaration) declaration;
        if (!DecoyTransformBaseKt.isDecoy(irDeclaration) || !canBeLinkedAgainst(irDeclaration)) {
            return super.visitFunction(declaration);
        }
        IrConstructorCall annotation = IrUtilsKt.getAnnotation((IrAnnotationContainer) declaration, DecoyFqNames.INSTANCE.getDecoy());
        Intrinsics.checkNotNull(annotation);
        IdSignature idSignatureComputeSignature = getSignatureBuilder().computeSignature(getSymbolRemapper().getReferencedFunction(getComposableForDecoy(declaration)).getOwner());
        IdSignature.CommonSignature commonSignatureFindNearestCommonSignature = findNearestCommonSignature(idSignatureComputeSignature);
        if (commonSignatureFindNearestCommonSignature != null) {
            annotation.putValueArgument(1, irVarargString(CollectionsKt.listOf((Object[]) new String[]{commonSignatureFindNearestCommonSignature.getPackageFqName(), commonSignatureFindNearestCommonSignature.getDeclarationFqName(), String.valueOf(commonSignatureFindNearestCommonSignature.getId()), String.valueOf(commonSignatureFindNearestCommonSignature.getMask())})));
            return super.visitFunction(declaration);
        }
        throw new IllegalStateException((DumpIrTreeKt.dump$default((IrElement) declaration, false, false, 3, (Object) null) + " produced unsupported signature " + idSignatureComputeSignature).toString());
    }
}
