package p313o0O0oOo;

import android.content.Context;
import androidx.annotation.GuardedBy;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import com.google.firebase.remoteconfig.internal.OooO0OO;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;
import o0O0o0.OooO;
import p281o0O0O0oO.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public final LinkedHashSet f42566OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final OooO0OO f42567OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f42568OooO0OO;

    public o0000O00(OooOO0 oooOO1, OooO oooO, ConfigFetchHandler configFetchHandler, o000000 o000000Var, Context context, String str, OooO0O0 oooO0O0, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f42566OooO00o = linkedHashSet;
        this.f42567OooO0O0 = new OooO0OO(oooOO1, oooO, configFetchHandler, o000000Var, context, str, linkedHashSet, oooO0O0, scheduledExecutorService);
        this.f42568OooO0OO = oooO;
    }

    public final synchronized void OooO00o() {
        if (!this.f42566OooO00o.isEmpty()) {
            this.f42567OooO0O0.OooO0o0(0L);
        }
    }
}
