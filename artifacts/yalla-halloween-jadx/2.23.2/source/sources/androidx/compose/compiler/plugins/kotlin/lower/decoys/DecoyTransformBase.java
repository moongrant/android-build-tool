package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.backend.common.serialization.signature.IdSignatureSerializer;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u000e*\u00020\u0011H\u0016J\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u0011H\u0002J\f\u0010\u001e\u001a\u00020\u000e*\u00020\u0011H\u0002J\f\u0010\u001f\u001a\u00020\u001a*\u00020\u0011H\u0016J\f\u0010\u001f\u001a\u00020\u001a*\u00020\u0018H\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBase;", "", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "getContext", "()Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "signatureBuilder", "Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "getSignatureBuilder", "()Lorg/jetbrains/kotlin/backend/common/serialization/signature/IdSignatureSerializer;", "irVarargString", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "valueArguments", "", "", "getComposableForDecoy", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "getDeclaration", "Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "Lorg/jetbrains/kotlin/ir/linkage/IrDeserializer;", "moduleDescriptor", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "idSignature", "Lorg/jetbrains/kotlin/ir/util/IdSignature;", "getDecoyImplementationId", "", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)Ljava/lang/Long;", "getDecoyImplementationName", "getDecoySignature", "getDecoyTargetName", "getSignatureId", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDecoyTransformBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1549#2:222\n1620#2,3:223\n800#2,11:226\n288#2,2:237\n800#2,11:239\n1549#2:250\n1620#2,3:251\n*S KotlinDebug\n*F\n+ 1 DecoyTransformBase.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/DecoyTransformBase\n*L\n92#1:222\n92#1:223,3\n101#1:226,11\n102#1:237,2\n129#1:239,11\n170#1:250\n170#1:251,3\n*E\n"})
public interface DecoyTransformBase {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static IrFunctionSymbol getComposableForDecoy(@NotNull DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
            return OooO00o.OooO00o(decoyTransformBase, irFunction);
        }

        @Deprecated
        @Nullable
        public static Long getDecoyImplementationId(@NotNull DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
            return OooO00o.OooO0O0(decoyTransformBase, irFunction);
        }

        @Deprecated
        @Nullable
        public static String getDecoyImplementationName(@NotNull DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
            return OooO00o.OooO0OO(decoyTransformBase, irFunction);
        }

        @Deprecated
        public static long getSignatureId(@NotNull DecoyTransformBase decoyTransformBase, @NotNull IrFunction irFunction) {
            return OooO00o.OooO0Oo(decoyTransformBase, irFunction);
        }

        @Deprecated
        @NotNull
        public static IrExpression irVarargString(@NotNull DecoyTransformBase decoyTransformBase, @NotNull List<String> list) {
            return OooO00o.OooO0o0(decoyTransformBase, list);
        }
    }

    @NotNull
    IrFunctionSymbol getComposableForDecoy(@NotNull IrFunction irFunction);

    @NotNull
    IrPluginContext getContext();

    @Nullable
    Long getDecoyImplementationId(@NotNull IrFunction irFunction);

    @Nullable
    String getDecoyImplementationName(@NotNull IrFunction irFunction);

    @NotNull
    IdSignatureSerializer getSignatureBuilder();

    long getSignatureId(@NotNull IrFunction irFunction);

    @NotNull
    IrExpression irVarargString(@NotNull List<String> valueArguments);
}
