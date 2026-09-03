package kotlin.sequences;

import com.google.firebase.components.OooO;
import com.google.firebase.components.o00oO0o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o implements OooO {
    public static Iterator OooO0O0(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO00o(o00oO0o o00oo0o2) {
        return ExecutorsRegistrar.f19383OooO0O0.get();
    }
}
