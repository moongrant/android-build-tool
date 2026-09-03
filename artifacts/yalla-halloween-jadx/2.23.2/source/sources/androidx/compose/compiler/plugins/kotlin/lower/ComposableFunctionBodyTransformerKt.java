package androidx.compose.compiler.plugins.kotlin.lower;

import androidx.camera.core.impl.OooOOOO;
import com.facebook.appevents.UserDataStore;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext;
import org.jetbrains.kotlin.builtins.StandardNames;
import org.jetbrains.kotlin.ir.declarations.IrFunction;
import org.jetbrains.kotlin.ir.expressions.IrContainerExpression;
import org.jetbrains.kotlin.ir.expressions.IrStatementOrigin;
import org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl;
import org.jetbrains.kotlin.ir.types.IrSimpleType;
import org.jetbrains.kotlin.ir.types.IrType;
import org.jetbrains.kotlin.ir.types.IrTypePredicatesKt;
import org.jetbrains.kotlin.name.FqNameUnsafe;
import org.jetbrains.kotlin.name.SpecialNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001\u001a\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001\u001a\u000e\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001a\u000e\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001\u001ae\u0010\u0016\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019\"\u0004\b\u0002\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001c2\u001e\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00170 H\u0086\b\u001a\"\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0000\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0%H\u0002\u001a\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002\u001a4\u0010*\u001a\u0002H#\"\u0004\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0\"2\b\u0010+\u001a\u0004\u0018\u00010,2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0082\n¢\u0006\u0002\u0010/\u001a%\u00100\u001a\u000201*\u0002022\u0006\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0002\u00106\u001a\f\u00107\u001a\u000201*\u00020\u0005H\u0002\u001a\u0014\u00108\u001a\u000201*\u0002022\u0006\u00103\u001a\u000204H\u0002\u001a\u0014\u00109\u001a\u000201*\u0002022\u0006\u00103\u001a\u000204H\u0002\u001a\n\u0010:\u001a\u000201*\u000202\u001a\n\u0010;\u001a\u000201*\u000202\u001a\u001c\u0010<\u001a\u00020=*\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020=H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006@"}, d2 = {"BITS_PER_INT", "", "BITS_PER_SLOT", "SLOTS_PER_INT", "thisParamCount", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "getThisParamCount", "(Lorg/jetbrains/kotlin/ir/declarations/IrFunction;)I", "bitsForSlot", "bits", "slot", "changedParamCount", "realValueParams", "thisParams", "changedParamCountFromTotal", "totalParamsIncludingThisParams", "composeSyntheticParamCount", "defaultParamCount", "valueParams", "defaultsBitIndex", "index", "defaultsParamIndex", "forEachWith", "", "A", "B", "C", "a", "", "b", "c", UserDataStore.FIRST_NAME, "Lkotlin/Function3;", "guardedLazy", "Landroidx/compose/compiler/plugins/kotlin/lower/GuardedLazy;", "T", "initializer", "Lkotlin/Function0;", "mutableStatementContainer", "Lorg/jetbrains/kotlin/ir/expressions/IrContainerExpression;", "context", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "getValue", "thisRef", "", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/compose/compiler/plugins/kotlin/lower/GuardedLazy;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "isClassType", "", "Lorg/jetbrains/kotlin/ir/types/IrType;", "fqName", "Lorg/jetbrains/kotlin/name/FqNameUnsafe;", "hasQuestionMark", "(Lorg/jetbrains/kotlin/ir/types/IrType;Lorg/jetbrains/kotlin/name/FqNameUnsafe;Ljava/lang/Boolean;)Z", "isLambda", "isNotNullClassType", "isNullableClassType", "isNullableUnit", "isUnitOrNullableUnit", "replacePrefix", "", "prefix", "replacement", "compiler-hosted"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposableFunctionBodyTransformerKt {
    public static final int BITS_PER_INT = 31;
    public static final int BITS_PER_SLOT = 3;
    public static final int SLOTS_PER_INT = 10;

    public static final int bitsForSlot(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final int changedParamCount(int i, int i2) {
        int i3 = i + i2;
        if (i3 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) i3) / 10.0d);
    }

    public static final int changedParamCountFromTotal(int i) {
        int i2 = (i - 1) - 1;
        int i3 = 0;
        do {
            i2 -= 10;
            i3++;
        } while (i2 > 0);
        return i3;
    }

    public static final int composeSyntheticParamCount(int i, int i2) {
        return changedParamCount(i, i2) + 1;
    }

    public static /* synthetic */ int composeSyntheticParamCount$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return composeSyntheticParamCount(i, i2);
    }

    public static final int defaultParamCount(int i) {
        return (int) Math.ceil(((double) i) / 31.0d);
    }

    public static final int defaultsBitIndex(int i) {
        return i % 31;
    }

    public static final int defaultsParamIndex(int i) {
        return i / 31;
    }

    public static final <A, B, C> void forEachWith(@NotNull List<? extends A> list, @NotNull List<? extends B> list2, @NotNull List<? extends C> list3, @NotNull Function3<? super A, ? super B, ? super C, Unit> function3) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function3.invoke(list.get(i), list2.get(i), list3.get(i));
        }
    }

    public static final int getThisParamCount(@NotNull IrFunction irFunction) {
        return irFunction.getContextReceiverParametersCount() + (irFunction.getDispatchReceiverParameter() != null ? 1 : 0) + (irFunction.getExtensionReceiverParameter() == null ? 0 : 1);
    }

    private static final <T> T getValue(GuardedLazy<? extends T> guardedLazy, Object obj, KProperty<?> kProperty) {
        return guardedLazy.value(kProperty.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> GuardedLazy<T> guardedLazy(Function0<? extends T> function0) {
        return new GuardedLazy<>(function0);
    }

    private static final boolean isClassType(IrType irType, FqNameUnsafe fqNameUnsafe, Boolean bool) {
        if (!(irType instanceof IrSimpleType)) {
            return false;
        }
        if (bool == null || !Intrinsics.areEqual(Boolean.valueOf(IrTypePredicatesKt.isMarkedNullable((IrSimpleType) irType)), bool)) {
            return IrTypePredicatesKt.isClassWithFqName(((IrSimpleType) irType).getClassifier(), fqNameUnsafe);
        }
        return false;
    }

    public static /* synthetic */ boolean isClassType$default(IrType irType, FqNameUnsafe fqNameUnsafe, Boolean bool, int i, Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return isClassType(irType, fqNameUnsafe, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLambda(IrFunction irFunction) {
        return Intrinsics.areEqual(irFunction.getName(), SpecialNames.ANONYMOUS);
    }

    private static final boolean isNotNullClassType(IrType irType, FqNameUnsafe fqNameUnsafe) {
        return isClassType(irType, fqNameUnsafe, Boolean.FALSE);
    }

    private static final boolean isNullableClassType(IrType irType, FqNameUnsafe fqNameUnsafe) {
        return isClassType(irType, fqNameUnsafe, Boolean.TRUE);
    }

    public static final boolean isNullableUnit(@NotNull IrType irType) {
        return isNullableClassType(irType, StandardNames.FqNames.unit);
    }

    public static final boolean isUnitOrNullableUnit(@NotNull IrType irType) {
        return IrTypePredicatesKt.isUnit(irType) || isNullableUnit(irType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IrContainerExpression mutableStatementContainer(IrPluginContext irPluginContext) {
        return new IrCompositeImpl(-1, -1, irPluginContext.getIrBuiltIns().getUnitType(), (IrStatementOrigin) null, 8, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefix(String str, String str2, String str3) {
        if (!StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return OooOOOO.OooO00o(str3, strSubstring);
    }
}
