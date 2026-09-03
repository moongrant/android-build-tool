package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"isComposableAnnotation", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposableTypeRemapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableAnnotation(IrConstructorCall irConstructorCall) {
        return Intrinsics.areEqual(AdditionalIrUtilsKt.getFqNameForIrSerialization(irConstructorCall.getSymbol().getOwner().getParent()), ComposeFqNames.INSTANCE.getComposable());
    }
}
