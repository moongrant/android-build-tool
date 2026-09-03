package p105o000oo0o;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 extends Lambda implements Function1<String, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f35747OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(Bundle bundle) {
        super(1);
        this.f35747OooO0Oo = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String argName = str;
        Intrinsics.checkNotNullParameter(argName, "argName");
        return Boolean.valueOf(!this.f35747OooO0Oo.containsKey(argName));
    }
}
