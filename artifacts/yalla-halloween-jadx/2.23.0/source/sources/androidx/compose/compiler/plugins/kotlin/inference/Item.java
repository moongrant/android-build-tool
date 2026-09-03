package androidx.compose.compiler.plugins.kotlin.inference;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH ¢\u0006\u0002\b\rJ#\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H ¢\u0006\u0002\b\u0014R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Item;", "", "()V", "isAnonymous", "", "isAnonymous$compiler_hosted", "()Z", "isUnspecified", "isUnspecified$compiler_hosted", "serializeTo", "", "writer", "Landroidx/compose/compiler/plugins/kotlin/inference/SchemeStringSerializationWriter;", "serializeTo$compiler_hosted", "toBinding", "Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "bindings", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "context", "", "toBinding$compiler_hosted", "Landroidx/compose/compiler/plugins/kotlin/inference/Open;", "Landroidx/compose/compiler/plugins/kotlin/inference/Token;", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Item {
    private Item() {
    }

    public /* synthetic */ Item(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean isAnonymous$compiler_hosted();

    /* JADX INFO: renamed from: isUnspecified$compiler_hosted */
    public boolean getIsUnspecified() {
        return false;
    }

    public abstract void serializeTo$compiler_hosted(@NotNull SchemeStringSerializationWriter writer);

    @NotNull
    public abstract Binding toBinding$compiler_hosted(@NotNull Bindings bindings, @NotNull List<Binding> context);
}
