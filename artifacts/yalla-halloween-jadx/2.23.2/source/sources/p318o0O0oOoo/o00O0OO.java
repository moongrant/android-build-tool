package p318o0O0oOoo;

import android.content.Context;
import androidx.annotation.GuardedBy;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import com.google.firebase.remoteconfig.internal.OooO0OO;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import p302o0O0o0OO.o0000O0O;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final LinkedHashSet f41993OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final OooO0OO f41994OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O0O f41995OooO0OO;

    public o00O0OO(o0OOO0o o0ooo0o2, o0000O0O o0000o0o2, ConfigFetchHandler configFetchHandler, oo00o oo00oVar, Context context, String str, OooO0O0 oooO0O0, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f41993OooO00o = linkedHashSet;
        this.f41994OooO0O0 = new OooO0OO(o0ooo0o2, o0000o0o2, configFetchHandler, oo00oVar, context, str, linkedHashSet, oooO0O0, scheduledExecutorService);
        this.f41995OooO0OO = o0000o0o2;
    }

    public final synchronized void OooO00o() {
        if (!this.f41993OooO00o.isEmpty()) {
            this.f41994OooO0O0.OooO0o0(0L);
        }
    }
}
