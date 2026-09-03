package oo00o;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Oo0 implements OooO, oo0o0O0.OooO00o {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f60266OooOOOo = p115o00O00oO.o0Oo0oo.OooO0o("Processor");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final androidx.work.OooO00o f60269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f60270OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p119o00O0Oo0.o0OoOo0 f60271OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final WorkDatabase f60272OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final List<oo000o> f60275OooOO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f60273OooOO0 = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f60267OooO = new HashMap();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final HashSet f60277OooOOO0 = new HashSet();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList f60276OooOOO = new ArrayList();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public PowerManager.WakeLock f60268OooO0Oo = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Object f60278OooOOOO = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final HashMap f60274OooOO0O = new HashMap();

    public static class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final OooO f60279OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public final com.google.common.util.concurrent.OooOO0O<Boolean> f60280OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final o00O0OO.OooOo f60281OooO0o0;

        public OooO00o(@NonNull OooO oooO, @NonNull o00O0OO.OooOo oooOo, @NonNull p117o00O0OOo.o00000O o00000o) {
            this.f60279OooO0Oo = oooO;
            this.f60281OooO0o0 = oooOo;
            this.f60280OooO0o = o00000o;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f60280OooO0o.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f60279OooO0Oo.OooO0Oo(this.f60281OooO0o0, zBooleanValue);
        }
    }

    public o00Oo0(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull p119o00O0Oo0.o00O0O o00o0o2, @NonNull WorkDatabase workDatabase, @NonNull List list) {
        this.f60270OooO0o0 = context;
        this.f60269OooO0o = oooO00o;
        this.f60271OooO0oO = o00o0o2;
        this.f60272OooO0oo = workDatabase;
        this.f60275OooOO0o = list;
    }

    public static boolean OooO0OO(@Nullable o0000O00 o0000o00, @NonNull String str) {
        if (o0000o00 == null) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60266OooOOOo, "WorkerWrapper could not be found for " + str);
            return false;
        }
        o0000o00.f60247OooOo00 = true;
        o0000o00.OooO0oo();
        o0000o00.f60246OooOOoo.cancel(true);
        if (o0000o00.f60236OooO0oo == null || !(o0000o00.f60246OooOOoo.f36334OooO0Oo instanceof o00O0OOo.o00000.OooO0O0)) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(o0000O00.f60230OooOo0, "WorkSpec " + o0000o00.f60235OooO0oO + " is already done. Not interrupting.");
        } else {
            o0000o00.f60236OooO0oo.OooO0o0();
        }
        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60266OooOOOo, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void OooO(@NonNull String str, @NonNull p115o00O00oO.o00O0O o00o0o2) {
        synchronized (this.f60278OooOOOO) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(f60266OooOOOo, "Moving WorkSpec (" + str + ") to the foreground");
            o0000O00 o0000o00 = (o0000O00) this.f60273OooOO0.remove(str);
            if (o0000o00 != null) {
                if (this.f60268OooO0Oo == null) {
                    PowerManager.WakeLock wakeLockOooO00o = o00O0OOO.o0Oo0oo.OooO00o(this.f60270OooO0o0, "ProcessorForegroundLck");
                    this.f60268OooO0Oo = wakeLockOooO00o;
                    wakeLockOooO00o.acquire();
                }
                this.f60267OooO.put(str, o0000o00);
                ContextCompat.OooO0Oo(this.f60270OooO0o0, androidx.work.impl.foreground.OooO00o.OooO0O0(this.f60270OooO0o0, o00O0OO.o0ooOOo.OooO00o(o0000o00.f60235OooO0oO), o00o0o2));
            }
        }
    }

    public final void OooO00o(@NonNull OooO oooO) {
        synchronized (this.f60278OooOOOO) {
            this.f60276OooOOO.add(oooO);
        }
    }

    @Nullable
    public final o00O0OO.o00Ooo OooO0O0(@NonNull String str) {
        synchronized (this.f60278OooOOOO) {
            o0000O00 o0000o00 = (o0000O00) this.f60267OooO.get(str);
            if (o0000o00 == null) {
                o0000o00 = (o0000O00) this.f60273OooOO0.get(str);
            }
            if (o0000o00 == null) {
                return null;
            }
            return o0000o00.f60235OooO0oO;
        }
    }

    @Override // oo00o.OooO
    public final void OooO0Oo(@NonNull o00O0OO.OooOo oooOo, boolean z) {
        synchronized (this.f60278OooOOOO) {
            o0000O00 o0000o00 = (o0000O00) this.f60273OooOO0.get(oooOo.f36202OooO00o);
            if (o0000o00 != null && oooOo.equals(o00O0OO.o0ooOOo.OooO00o(o0000o00.f60235OooO0oO))) {
                this.f60273OooOO0.remove(oooOo.f36202OooO00o);
            }
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60266OooOOOo, o00Oo0.class.getSimpleName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + oooOo.f36202OooO00o + " executed; reschedule = " + z);
            Iterator it = this.f60276OooOOO.iterator();
            while (it.hasNext()) {
                ((OooO) it.next()).OooO0Oo(oooOo, z);
            }
        }
    }

    public final boolean OooO0o(@NonNull String str) {
        boolean z;
        synchronized (this.f60278OooOOOO) {
            z = this.f60273OooOO0.containsKey(str) || this.f60267OooO.containsKey(str);
        }
        return z;
    }

    public final boolean OooO0o0(@NonNull String str) {
        boolean zContains;
        synchronized (this.f60278OooOOOO) {
            zContains = this.f60277OooOOO0.contains(str);
        }
        return zContains;
    }

    public final void OooO0oO(@NonNull OooO oooO) {
        synchronized (this.f60278OooOOOO) {
            this.f60276OooOOO.remove(oooO);
        }
    }

    public final void OooO0oo(@NonNull final o00O0OO.OooOo oooOo) {
        ((p119o00O0Oo0.o00O0O) this.f60271OooO0oO).f36416OooO0OO.execute(new Runnable() { // from class: oo00o.o00O0O

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f60264OooO0o = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.f60263OooO0Oo.OooO0Oo(oooOo, this.f60264OooO0o);
            }
        });
    }

    public final boolean OooOO0(@NonNull o0ooOOo o0ooooo, @Nullable WorkerParameters.OooO00o oooO00o) {
        o00O0OO.OooOo oooOo = o0ooooo.f60300OooO00o;
        final String str = oooOo.f36202OooO00o;
        final ArrayList arrayList = new ArrayList();
        o00O0OO.o00Ooo o00ooo2 = (o00O0OO.o00Ooo) this.f60272OooO0oo.OooOOO0(new Callable() { // from class: oo00o.o0OoOo0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.f60297OooO00o.f60272OooO0oo;
                o00O0OO.o0Oo0oo o0oo0ooOooOo0O = workDatabase.OooOo0O();
                String str2 = str;
                arrayList.addAll(o0oo0ooOooOo0O.OooO00o(str2));
                return workDatabase.OooOo0().OooO0oo(str2);
            }
        });
        if (o00ooo2 == null) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0oO(f60266OooOOOo, "Didn't find WorkSpec for id " + oooOo);
            OooO0oo(oooOo);
            return false;
        }
        synchronized (this.f60278OooOOOO) {
            if (OooO0o(str)) {
                Set set = (Set) this.f60274OooOO0O.get(str);
                if (((o0ooOOo) set.iterator().next()).f60300OooO00o.f36203OooO0O0 == oooOo.f36203OooO0O0) {
                    set.add(o0ooooo);
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60266OooOOOo, "Work " + oooOo + " is already enqueued for processing");
                } else {
                    OooO0oo(oooOo);
                }
                return false;
            }
            if (o00ooo2.f36234OooOo00 != oooOo.f36203OooO0O0) {
                OooO0oo(oooOo);
                return false;
            }
            o0000O00.OooO00o oooO00o2 = new o0000O00.OooO00o(this.f60270OooO0o0, this.f60269OooO0o, this.f60271OooO0oO, this, this.f60272OooO0oo, o00ooo2, arrayList);
            oooO00o2.f60255OooO0oO = this.f60275OooOO0o;
            if (oooO00o != null) {
                oooO00o2.f60248OooO = oooO00o;
            }
            o0000O00 o0000o00 = new o0000O00(oooO00o2);
            p117o00O0OOo.o00000O<Boolean> o00000o = o0000o00.f60244OooOOo;
            o00000o.OooO0oo(new OooO00o(this, o0ooooo.f60300OooO00o, o00000o), ((p119o00O0Oo0.o00O0O) this.f60271OooO0oO).f36416OooO0OO);
            this.f60273OooOO0.put(str, o0000o00);
            HashSet hashSet = new HashSet();
            hashSet.add(o0ooooo);
            this.f60274OooOO0O.put(str, hashSet);
            ((p119o00O0Oo0.o00O0O) this.f60271OooO0oO).f36414OooO00o.execute(o0000o00);
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60266OooOOOo, o00Oo0.class.getSimpleName() + ": processing " + oooOo);
            return true;
        }
    }

    public final void OooOO0O(@NonNull String str) {
        synchronized (this.f60278OooOOOO) {
            this.f60267OooO.remove(str);
            OooOO0o();
        }
    }

    public final void OooOO0o() {
        synchronized (this.f60278OooOOOO) {
            if (!(!this.f60267OooO.isEmpty())) {
                Context context = this.f60270OooO0o0;
                String str = androidx.work.impl.foreground.OooO00o.f11555OooOOO0;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f60270OooO0o0.startService(intent);
                } catch (Throwable th) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0OO(f60266OooOOOo, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f60268OooO0Oo;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f60268OooO0Oo = null;
                }
            }
        }
    }

    public final boolean OooOOO0(@NonNull o0ooOOo o0ooooo) {
        o0000O00 o0000o00;
        String str = o0ooooo.f60300OooO00o.f36202OooO00o;
        synchronized (this.f60278OooOOOO) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60266OooOOOo, "Processor stopping foreground work " + str);
            o0000o00 = (o0000O00) this.f60267OooO.remove(str);
            if (o0000o00 != null) {
                this.f60274OooOO0O.remove(str);
            }
        }
        return OooO0OO(o0000o00, str);
    }
}
