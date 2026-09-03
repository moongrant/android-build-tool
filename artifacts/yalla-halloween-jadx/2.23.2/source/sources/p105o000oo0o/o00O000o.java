package p105o000oo0o;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o extends Lambda implements Function1<String, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f35760OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(Bundle bundle) {
        super(1);
        this.f35760OooO0Oo = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String key = str;
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.valueOf(!this.f35760OooO0Oo.containsKey(key));
    }
}
