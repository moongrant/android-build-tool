package o000O00;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Lambda implements Function1<String, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f34416OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(Bundle bundle) {
        super(1);
        this.f34416OooO0Oo = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        String argName = str;
        Intrinsics.checkNotNullParameter(argName, "argName");
        return Boolean.valueOf(!this.f34416OooO0Oo.containsKey(argName));
    }
}
