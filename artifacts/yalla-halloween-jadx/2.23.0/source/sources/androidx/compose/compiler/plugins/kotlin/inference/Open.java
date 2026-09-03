package androidx.compose.compiler.plugins.kotlin.inference;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0010¢\u0006\u0002\b\u0015J#\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0010¢\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001f"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Open;", "Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "index", "", "isUnspecified", "", "(IZ)V", "getIndex", "()I", "isAnonymous", "isAnonymous$compiler_hosted", "()Z", "isUnspecified$compiler_hosted", "equals", "other", "", "hashCode", "serializeTo", "", "writer", "Landroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter;", "serializeTo$compiler_hosted", "toBinding", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "bindings", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "context", "", "toBinding$compiler_hosted", "toString", "", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Open extends Item {
    private final int index;
    private final boolean isUnspecified;

    public Open(int i, boolean z) {
        super(null);
        this.index = i;
        this.isUnspecified = z;
    }

    public boolean equals(@Nullable Object other) {
        int i;
        int i2;
        return (other instanceof Open) && ((i = ((Open) other).index) == (i2 = this.index) || (i < 0 && i2 < 0));
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        int i = this.index;
        if (i < 0) {
            return -31;
        }
        return i * 31;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    public boolean isAnonymous$compiler_hosted() {
        return this.index < 0;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    /* JADX INFO: renamed from: isUnspecified$compiler_hosted, reason: from getter */
    public boolean getIsUnspecified() {
        return this.isUnspecified;
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    public void serializeTo$compiler_hosted(@NotNull SchemeStringSerializationWriter writer) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeNumber(this.index);
    }

    @Override // androidx.compose.compiler.plugins.kotlin.inference.Item
    @NotNull
    public Binding toBinding$compiler_hosted(@NotNull Bindings bindings, @NotNull List<Binding> context) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.index < 0) {
            return bindings.open();
        }
        while (this.index >= context.size()) {
            context.add(bindings.open());
        }
        return context.get(this.index);
    }

    @NotNull
    public String toString() {
        int i = this.index;
        return i < 0 ? "_" : String.valueOf(i);
    }

    public /* synthetic */ Open(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }
}
