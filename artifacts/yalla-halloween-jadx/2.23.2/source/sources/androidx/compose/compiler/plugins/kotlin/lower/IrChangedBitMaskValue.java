package androidx.compose.compiler.plugins.kotlin.lower;

import com.facebook.appevents.UserDataStore;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.ir.declarations.IrValueDeclaration;
import org.jetbrains.kotlin.ir.expressions.IrExpression;
import org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bH&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH&J\b\u0010\u0019\u001a\u00020\u0012H&J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H&J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0017H&J \u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "", "declarations", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "getDeclarations", "()Ljava/util/List;", "used", "", "getUsed", "()Z", "irCopyToTemporary", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskVariable;", "nameHint", "", "isVar", "exactName", "irHasDifferences", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "usedParams", "", "irIsolateBitsAtSlot", "slot", "", "includeStableBit", "irLowBit", "irShiftBits", "fromSlot", "toSlot", "irSlotAnd", "bits", "putAsValueArgumentInWithLowBit", "", UserDataStore.FIRST_NAME, "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionAccessExpression;", "startIndex", "lowBit", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IrChangedBitMaskValue {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @NotNull
    List<IrValueDeclaration> getDeclarations();

    boolean getUsed();

    @NotNull
    IrChangedBitMaskVariable irCopyToTemporary(@Nullable String nameHint, boolean isVar, boolean exactName);

    @NotNull
    IrExpression irHasDifferences(@NotNull boolean[] usedParams);

    @NotNull
    IrExpression irIsolateBitsAtSlot(int slot, boolean includeStableBit);

    @NotNull
    IrExpression irLowBit();

    @NotNull
    IrExpression irShiftBits(int fromSlot, int toSlot);

    @NotNull
    IrExpression irSlotAnd(int slot, int bits);

    void putAsValueArgumentInWithLowBit(@NotNull IrFunctionAccessExpression fn, int startIndex, boolean lowBit);
}
