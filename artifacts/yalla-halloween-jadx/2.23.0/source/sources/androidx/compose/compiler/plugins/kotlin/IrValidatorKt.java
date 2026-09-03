package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.IrValidatorConfig;
import org.jetbrains.kotlin.ir.IrBuiltIns;
import org.jetbrains.kotlin.ir.IrElement;
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"validateIr", "", "fragment", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "irBuiltIns", "Lorg/jetbrains/kotlin/ir/IrBuiltIns;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IrValidatorKt {
    public static final void validateIr(@NotNull IrModuleFragment fragment, @NotNull IrBuiltIns irBuiltIns) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(irBuiltIns, "irBuiltIns");
        fragment.accept(new IrValidator(irBuiltIns, new IrValidatorConfig(true, true, false, false, true, false)), (Object) null);
        org.jetbrains.kotlin.backend.common.IrValidatorKt.checkDeclarationParents((IrElement) fragment);
    }
}
