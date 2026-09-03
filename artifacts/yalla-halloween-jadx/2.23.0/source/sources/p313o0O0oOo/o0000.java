package p313o0O0oOo;

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
import p671oo0oOOo.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Pattern f42531OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Pattern f42532OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f42533OooO00o = new HashSet();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f42534OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000000 f42535OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f42536OooO0Oo;

    static {
        Charset.forName("UTF-8");
        f42532OooO0o0 = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f42531OooO0o = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public o0000(ScheduledExecutorService scheduledExecutorService, o000000 o000000Var, o000000 o000000Var2) {
        this.f42534OooO0O0 = scheduledExecutorService;
        this.f42535OooO0OO = o000000Var;
        this.f42536OooO0Oo = o000000Var2;
    }

    @Nullable
    public static o000000O OooO0O0(o000000 o000000Var) {
        synchronized (o000000Var) {
            Task<o000000O> task = o000000Var.f42544OooO0OO;
            if (task != null && task.isSuccessful()) {
                return o000000Var.f42544OooO0OO.getResult();
            }
            try {
                return (o000000O) o000000.OooO00o(o000000Var.OooO0O0(), TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    public static HashSet OooO0OO(o000000 o000000Var) {
        HashSet hashSet = new HashSet();
        o000000O o000000oOooO0O0 = OooO0O0(o000000Var);
        if (o000000oOooO0O0 == null) {
            return hashSet;
        }
        Iterator<String> itKeys = o000000oOooO0O0.f42548OooO0O0.keys();
        while (itKeys.hasNext()) {
            hashSet.add(itKeys.next());
        }
        return hashSet;
    }

    public final void OooO00o(Oooo0 oooo0) {
        synchronized (this.f42533OooO00o) {
            this.f42533OooO00o.add(oooo0);
        }
    }
}
