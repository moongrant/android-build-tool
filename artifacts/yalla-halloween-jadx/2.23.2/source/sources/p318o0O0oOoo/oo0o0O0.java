package p318o0O0oOoo;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p317o0O0oOoO.o00oOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f42013OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Pattern f42014OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f42015OooO00o = new HashSet();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f42016OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo00o f42017OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo00o f42018OooO0Oo;

    static {
        Charset.forName("UTF-8");
        f42014OooO0o0 = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f42013OooO0o = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public oo0o0O0(ScheduledExecutorService scheduledExecutorService, oo00o oo00oVar, oo00o oo00oVar2) {
        this.f42016OooO0O0 = scheduledExecutorService;
        this.f42017OooO0OO = oo00oVar;
        this.f42018OooO0Oo = oo00oVar2;
    }

    @Nullable
    public static o00O0 OooO0O0(oo00o oo00oVar) {
        synchronized (oo00oVar) {
            Task<o00O0> task = oo00oVar.f42011OooO0OO;
            if (task != null && task.isSuccessful()) {
                return oo00oVar.f42011OooO0OO.getResult();
            }
            try {
                return (o00O0) oo00o.OooO00o(oo00oVar.OooO0O0(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    public static HashSet OooO0OO(oo00o oo00oVar) {
        HashSet hashSet = new HashSet();
        o00O0 o00o0OooO0O0 = OooO0O0(oo00oVar);
        if (o00o0OooO0O0 == null) {
            return hashSet;
        }
        Iterator<String> itKeys = o00o0OooO0O0.f41973OooO0O0.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    public final void OooO00o(o00oOoo o00oooo2) {
        synchronized (this.f42015OooO00o) {
            this.f42015OooO00o.add(o00oooo2);
        }
    }
}
