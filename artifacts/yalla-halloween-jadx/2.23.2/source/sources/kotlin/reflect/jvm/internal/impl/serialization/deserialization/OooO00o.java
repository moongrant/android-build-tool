package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import com.google.firebase.components.OooO;
import com.google.firebase.components.o00oO0o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o implements OooO {
    public static boolean OooO0O0(Flags.BooleanFlagField booleanFlagField, int i, String str) {
        Boolean bool = booleanFlagField.get(i);
        Intrinsics.checkNotNullExpressionValue(bool, str);
        return bool.booleanValue();
    }

    @Override // com.google.firebase.components.OooO
    public Object OooO00o(o00oO0o o00oo0o2) {
        return ExecutorsRegistrar.f19382OooO00o.get();
    }
}
