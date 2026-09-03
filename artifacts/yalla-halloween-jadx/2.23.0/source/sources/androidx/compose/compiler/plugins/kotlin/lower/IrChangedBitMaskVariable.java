package androidx.compose.compiler.plugins.kotlin.lower;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.ir.IrStatement;
import org.jetbrains.kotlin.ir.expressions.IrExpression;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskVariable;", "Landroidx/compose/compiler/plugins/kotlin/lower/IrChangedBitMaskValue;", "asStatements", "", "Lorg/jetbrains/kotlin/ir/IrStatement;", "irOrSetBitsAtSlot", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "slot", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "irSetSlotUncertain", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IrChangedBitMaskVariable extends IrChangedBitMaskValue {
    @NotNull
    List<IrStatement> asStatements();

    @NotNull
    IrExpression irOrSetBitsAtSlot(int slot, @NotNull IrExpression value);

    @NotNull
    IrExpression irSetSlotUncertain(int slot);
}
