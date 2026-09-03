package androidx.compose.compiler.plugins.kotlin.inference;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010\b\u001a\u00020\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "", "token", "", "observers", "", "Landroidx/compose/compiler/plugins/kotlin/inference/Bindings;", "(Ljava/lang/String;Ljava/util/Set;)V", "next", "getNext", "()Landroidx/compose/compiler/plugins/kotlin/inference/Binding;", "setNext", "(Landroidx/compose/compiler/plugins/kotlin/inference/Binding;)V", "getToken", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroidx/compose/compiler/plugins/kotlin/inference/Value;", "getValue", "()Landroidx/compose/compiler/plugins/kotlin/inference/Value;", "setValue", "(Landroidx/compose/compiler/plugins/kotlin/inference/Value;)V", "toString", "compiler-hosted"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bindings.kt\nandroidx/compose/compiler/plugins/kotlin/inference/Binding\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class Binding {

    @NotNull
    private Binding next;

    @NotNull
    private Value value;

    public Binding(@Nullable String str, @NotNull Set<Bindings> set) {
        this.value = new Value(str, set);
        this.next = this;
    }

    @NotNull
    public final Binding getNext() {
        return this.next;
    }

    @Nullable
    public final String getToken() {
        return this.value.getToken();
    }

    @NotNull
    public final Value getValue() {
        return this.value;
    }

    public final void setNext(@NotNull Binding binding) {
        this.next = binding;
    }

    public final void setValue(@NotNull Value value) {
        this.value = value;
    }

    @NotNull
    public String toString() {
        String strOooO0O0;
        String token = this.value.getToken();
        return (token == null || (strOooO0O0 = o000oOoO.OooO0O0("Binding(token = ", token, ")")) == null) ? OooO0OO.OooO00o.OooO00o("Binding(", this.value.getIndex(), ")") : strOooO0O0;
    }

    public /* synthetic */ Binding(String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, set);
    }
}
