package io.opentelemetry.api.trace;

import com.google.auto.value.AutoValue;
import java.util.List;
import javax.annotation.concurrent.Immutable;
import p022Oooo00O.o0oOo0O0;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
abstract class ArrayBasedTraceState implements TraceState {
    @Override // io.opentelemetry.api.trace.TraceState
    public final void OooO00o(o0oOo0O0 o0ooo0o1) {
        List<String> listOooO0O0 = OooO0O0();
        for (int i = 0; i < listOooO0O0.size(); i += 2) {
            o0ooo0o1.accept(listOooO0O0.get(i), listOooO0O0.get(i + 1));
        }
    }

    public abstract List<String> OooO0O0();

    @Override // io.opentelemetry.api.trace.TraceState
    public final boolean isEmpty() {
        return OooO0O0().isEmpty();
    }
}
