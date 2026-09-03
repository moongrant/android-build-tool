package p022Oooo00O;

import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.compat.BiConsumer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0O implements o00O0O0O.OooO00o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f904OooO0Oo;

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        StringBuilder sb = (StringBuilder) this.f904OooO0Oo;
        String str = (String) obj;
        String str2 = (String) obj2;
        List<String> list = W3CTraceContextPropagator.f33070OooO00o;
        if (sb.length() != 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }
}
