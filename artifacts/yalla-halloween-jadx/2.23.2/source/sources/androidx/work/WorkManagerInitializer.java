package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import oo00o.o00000O0;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkManagerInitializer implements o00O000o.OooO0O0<WorkManager> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f11483OooO00o = o0Oo0oo.OooO0o("WrkMgrInitializer");

    @Override // o00O000o.OooO0O0
    @NonNull
    public final WorkManager create(@NonNull Context context) {
        o0Oo0oo.OooO0Oo().OooO00o(f11483OooO00o, "Initializing WorkManager with default configuration.");
        o00000O0.OooO0o0(context, new OooO00o(new OooO00o.C0184OooO00o()));
        return o00000O0.OooO0Oo(context);
    }

    @Override // o00O000o.OooO0O0
    @NonNull
    public final List<Class<? extends o00O000o.OooO0O0<?>>> dependencies() {
        return Collections.emptyList();
    }
}
