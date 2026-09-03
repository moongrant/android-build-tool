package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.compose.compiler.plugins.kotlin.ComposeFqNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.builtins.StandardNames;
import org.jetbrains.kotlin.ir.expressions.IrConstructorCall;
import org.jetbrains.kotlin.ir.util.AdditionalIrUtilsKt;
import org.jetbrains.kotlin.name.FqName;
import org.jetbrains.kotlin.name.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"KotlinFunctionsBuiltInsPackageFqName", "Lorg/jetbrains/kotlin/name/FqName;", "isComposableAnnotation", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposableTypeRemapperKt {

    @NotNull
    private static final FqName KotlinFunctionsBuiltInsPackageFqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier("jvm")).child(Name.identifier("functions"));

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComposableAnnotation(IrConstructorCall irConstructorCall) {
        return Intrinsics.areEqual(AdditionalIrUtilsKt.getFqNameForIrSerialization(irConstructorCall.getSymbol().getOwner().getParent()), ComposeFqNames.INSTANCE.getComposable());
    }
}
