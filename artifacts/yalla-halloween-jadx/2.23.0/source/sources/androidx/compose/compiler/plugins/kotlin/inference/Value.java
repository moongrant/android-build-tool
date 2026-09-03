package androidx.compose.compiler.plugins.kotlin.inference;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Value;", "", "token", "", "observers", "", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "(Ljava/lang/String;Ljava/util/Set;)V", "index", "", "getIndex", "()I", "getObservers", "()Ljava/util/Set;", "setObservers", "(Ljava/util/Set;)V", "size", "getSize", "setSize", "(I)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Value {
    private final int index;

    @NotNull
    private Set<Bindings> observers;
    private int size;

    @Nullable
    private String token;

    public Value(@Nullable String str, @NotNull Set<Bindings> observers) {
        Intrinsics.checkNotNullParameter(observers, "observers");
        this.token = str;
        this.observers = observers;
        this.size = 1;
        int i = BindingsKt.valueIndex;
        BindingsKt.valueIndex = i + 1;
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final Set<Bindings> getObservers() {
        return this.observers;
    }

    public final int getSize() {
        return this.size;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    public final void setObservers(@NotNull Set<Bindings> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.observers = set;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }
}
