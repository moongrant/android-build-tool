package androidx.compose.compiler.plugins.kotlin;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.declarations.IrAnnotationContainer;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.util.IrUtilsKt;
import org.jetbrains.kotlin.name.FqName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"internalRoot", "", "internalRootFqName", "Lorg/jetbrains/kotlin/name/FqName;", "root", "rootFqName", "hasComposableAnnotation", "", "Lorg/jetbrains/kotlin/ir/declarations/IrAnnotationContainer;", "Lorg/jetbrains/kotlin/ir/types/IrType;", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposeFqNamesKt {

    @NotNull
    private static final String root = "androidx.compose.runtime";

    @NotNull
    private static final FqName rootFqName = new FqName(root);

    @NotNull
    private static final String internalRoot = "androidx.compose.runtime.internal";

    @NotNull
    private static final FqName internalRootFqName = new FqName(internalRoot);

    public static final boolean hasComposableAnnotation(@NotNull IrType irType) {
        return IrUtilsKt.hasAnnotation((IrAnnotationContainer) irType, ComposeFqNames.INSTANCE.getComposable());
    }

    public static final boolean hasComposableAnnotation(@NotNull IrAnnotationContainer irAnnotationContainer) {
        return IrUtilsKt.hasAnnotation(irAnnotationContainer, ComposeFqNames.INSTANCE.getComposable());
    }
}
