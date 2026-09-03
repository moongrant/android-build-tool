package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p084o000Ooo0.o000oOoO;
import p084o000Ooo0.o00oO0o;
import p085o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkManagerInitializer implements o000OOo0.OooO0O0<o00oO0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f8391OooO00o = o000oOoO.OooO0o0("WrkMgrInitializer");

    @Override // o000OOo0.OooO0O0
    @NonNull
    public final o00oO0o create(@NonNull Context context) {
        o000oOoO.OooO0OO().OooO00o(f8391OooO00o, "Initializing WorkManager with default configuration.", new Throwable[0]);
        o0OOO0o.OooO0Oo(context, new OooO00o(new OooO00o.C0166OooO00o()));
        return o0OOO0o.OooO0OO(context);
    }

    @Override // o000OOo0.OooO0O0
    @NonNull
    public final List<Class<? extends o000OOo0.OooO0O0<?>>> dependencies() {
        return Collections.emptyList();
    }
}
