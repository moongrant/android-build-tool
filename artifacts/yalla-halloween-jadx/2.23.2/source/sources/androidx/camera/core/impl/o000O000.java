package androidx.camera.core.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f3690OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final HashMap f3691OooO0O0 = new HashMap();

    @NonNull
    public static oo000o OooO00o(@NonNull o000Oo0 o000oo1) {
        oo000o oo000oVar;
        synchronized (f3690OooO00o) {
            oo000oVar = (oo000o) f3691OooO0O0.get(o000oo1);
        }
        return oo000oVar == null ? oo000o.f3779OooO00o : oo000oVar;
    }
}
