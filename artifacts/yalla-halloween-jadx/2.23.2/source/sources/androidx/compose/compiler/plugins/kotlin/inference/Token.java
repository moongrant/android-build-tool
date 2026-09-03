package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0002\b\u0014J#\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0010¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Token;", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;)V", "isAnonymous", "", "isAnonymous$compiler_hosted", "()Z", "getValue", "()Ljava/lang/String;", "equals", "other", "", "hashCode", "", "serializeTo", "", "writer", "Landroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter;", "serializeTo$compiler_hosted", "toBinding", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "bindings", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "context", "", "toBinding$compiler_hosted", "toString", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Token extends Item {

    @NotNull
    private final String value;

    public Token(@NotNull String str) {
        super(null);
        this.value = str;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Token) && Intrinsics.areEqual(((Token) other).value, this.value);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() * 31;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    public boolean isAnonymous$compiler_hosted() {
        return false;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    public void serializeTo$compiler_hosted(@NotNull SchemeStringSerializationWriter writer) {
        writer.writeToken(this.value);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    @NotNull
    public Binding toBinding$compiler_hosted(@NotNull Bindings bindings, @NotNull List<Binding> context) {
        return bindings.closed(this.value);
    }

    @NotNull
    public String toString() {
        return this.value;
    }
}
