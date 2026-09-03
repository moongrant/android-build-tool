package androidx.compose.compiler.plugins.kotlin.lower.decoys;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.builders.declarations.DeclarationBuildersKt;
import org.jetbrains.kotlin.ir.builders.declarations.IrFunctionBuilder;
import org.jetbrains.kotlin.ir.declarations.IrConstructor;
import org.jetbrains.kotlin.ir.declarations.IrFactory;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreateDecoysTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateDecoysTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer$visitConstructor$copied$1\n+ 2 declarationBuilders.kt\norg/jetbrains/kotlin/ir/builders/declarations/DeclarationBuildersKt\n*L\n1#1,317:1\n223#2,4:318\n*S KotlinDebug\n*F\n+ 1 CreateDecoysTransformer.kt\nandroidx/compose/compiler/plugins/kotlin/lower/decoys/CreateDecoysTransformer$visitConstructor$copied$1\n*L\n159#1:318,4\n*E\n"})
public /* synthetic */ class CreateDecoysTransformer$visitConstructor$copied$1 extends FunctionReferenceImpl implements Function1<Function1<? super IrFunctionBuilder, ? extends Unit>, IrConstructor> {
    public CreateDecoysTransformer$visitConstructor$copied$1(Object obj) {
        super(1, obj, DeclarationBuildersKt.class, "buildConstructor", "buildConstructor(Lorg/jetbrains/kotlin/ir/declarations/IrFactory;Lkotlin/jvm/functions/Function1;)Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IrConstructor invoke(Function1<? super IrFunctionBuilder, ? extends Unit> function1) {
        return invoke2((Function1<? super IrFunctionBuilder, Unit>) function1);
    }

    @NotNull
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final IrConstructor invoke2(@NotNull Function1<? super IrFunctionBuilder, Unit> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        IrFactory irFactory = (IrFactory) this.receiver;
        IrFunctionBuilder irFunctionBuilder = new IrFunctionBuilder();
        p0.invoke(irFunctionBuilder);
        return DeclarationBuildersKt.buildConstructor(irFactory, irFunctionBuilder);
    }
}
