package p170o00Ooo0o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.OooO0o;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o00OoO.Oooo000;
import p037OoooOo0.o000O0o;
import p144o00Oo.o000O0;
import p144o00Oo.o00oOoo;
import p171o00OooO.o00oO0o;
import p171o00OooO.o0ooOOo;
import p172o00OooO0.o00000O;
import p172o00OooO0.o00000OO;
import p174o00OooOo.o00O0OOO;
import p174o00OooOo.o00OO0O0;
import p279o0O00o0.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo<R> implements Oooo0, o00000O, o00Oo0 {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final boolean f38282OooOooO = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Class<R> f38283OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f38284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO.OooO00o f38285OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f38286OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0OoOo0<R> f38287OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f38288OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RequestCoordinator f38289OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final com.bumptech.glide.OooO f38290OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Object f38291OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOo<?> f38292OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f38293OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f38294OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00000OO<R> f38295OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Priority f38296OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final List<o0OoOo0<R>> f38297OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0ooOOo<? super R> f38298OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @GuardedBy("requestLock")
    public o00oOoo<R> f38299OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Executor f38300OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @GuardedBy("requestLock")
    public o000O0.OooO0o f38301OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f38302OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o000O0 f38303OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @GuardedBy("requestLock")
    public long f38304OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @GuardedBy("requestLock")
    public OooO00o f38305OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f38306OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f38307OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f38308OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f38309OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final RuntimeException f38310OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f38311OooOoo0;

    public enum OooO00o {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public o00Ooo(Context context, com.bumptech.glide.OooO oooO, @NonNull Object obj, @Nullable Object obj2, Class cls, OooOo oooOo, int i, int i2, Priority priority, o00000OO o00000oo2, @Nullable o000oOoO o000oooo2, @Nullable ArrayList arrayList, RequestCoordinator requestCoordinator, o000O0 o000o0, o00oO0o.OooO00o oooO00o, Executor executor) {
        this.f38284OooO00o = f38282OooOooO ? String.valueOf(hashCode()) : null;
        this.f38285OooO0O0 = new OooO.OooO00o();
        this.f38286OooO0OO = obj;
        this.f38288OooO0o = context;
        this.f38290OooO0oO = oooO;
        this.f38291OooO0oo = obj2;
        this.f38283OooO = cls;
        this.f38292OooOO0 = oooOo;
        this.f38293OooOO0O = i;
        this.f38294OooOO0o = i2;
        this.f38296OooOOO0 = priority;
        this.f38295OooOOO = o00000oo2;
        this.f38287OooO0Oo = o000oooo2;
        this.f38297OooOOOO = arrayList;
        this.f38289OooO0o0 = requestCoordinator;
        this.f38303OooOo0 = o000o0;
        this.f38298OooOOOo = oooO00o;
        this.f38300OooOOo0 = executor;
        this.f38305OooOo0O = OooO00o.PENDING;
        if (this.f38310OooOoo == null && oooO.f12937OooO0oo.f12965OooO00o.containsKey(OooO0o.OooO0OO.class)) {
            this.f38310OooOoo = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    public final Drawable OooO(@DrawableRes int i) {
        Resources.Theme theme = this.f38292OooOO0.f38264OooOo;
        Context context = this.f38288OooO0o;
        if (theme == null) {
            theme = context.getTheme();
        }
        return p163o00OoOo0.o0ooOOo.OooO00o(context, context, i, theme);
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f38286OooO0OO) {
            z = this.f38305OooOo0O == OooO00o.COMPLETE;
        }
        return z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    @Override // p172o00OooO0.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f38285OooO0O0.OooO00o();
        Object obj2 = this.f38286OooO0OO;
        synchronized (obj2) {
            try {
                boolean z = f38282OooOooO;
                if (z) {
                    OooOO0O("Got onSizeReady in " + o00O0OOO.OooO00o(this.f38304OooOo00));
                }
                if (this.f38305OooOo0O == OooO00o.WAITING_FOR_SIZE) {
                    OooO00o oooO00o = OooO00o.RUNNING;
                    this.f38305OooOo0O = oooO00o;
                    float f = this.f38292OooOO0.f38251OooO0o0;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f);
                    }
                    this.f38307OooOoO = iRound;
                    this.f38309OooOoOO = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        OooOO0O("finished setup for calling load in " + o00O0OOO.OooO00o(this.f38304OooOo00));
                    }
                    o000O0 o000o0 = this.f38303OooOo0;
                    com.bumptech.glide.OooO oooO = this.f38290OooO0oO;
                    Object obj3 = this.f38291OooO0oo;
                    OooOo<?> oooOo = this.f38292OooOO0;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f38301OooOOoo = o000o0.OooO0O0(oooO, obj3, oooOo.f38259OooOOOO, this.f38307OooOoO, this.f38309OooOoOO, oooOo.f38267OooOo0O, this.f38283OooO, this.f38296OooOOO0, oooOo.f38250OooO0o, oooOo.f38265OooOo0, oooOo.f38260OooOOOo, oooOo.f38273OooOoo0, oooOo.f38266OooOo00, oooOo.f38256OooOO0o, oooOo.f38269OooOoO, oooOo.f38272OooOoo, oooOo.f38271OooOoOO, this, this.f38300OooOOo0);
                                if (this.f38305OooOo0O != oooO00o) {
                                    this.f38301OooOOoo = null;
                                }
                                if (z) {
                                    OooOO0O("finished onSizeReady in " + o00O0OOO.OooO00o(this.f38304OooOo00));
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0OO() {
        boolean z;
        synchronized (this.f38286OooO0OO) {
            z = this.f38305OooOo0O == OooO00o.CLEARED;
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f38286OooO0OO) {
            z = this.f38305OooOo0O == OooO00o.COMPLETE;
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final Drawable OooO0o() {
        int i;
        if (this.f38302OooOo == null) {
            OooOo<?> oooOo = this.f38292OooOO0;
            Drawable drawable = oooOo.f38254OooOO0;
            this.f38302OooOo = drawable;
            if (drawable == null && (i = oooOo.f38255OooOO0O) > 0) {
                this.f38302OooOo = OooO(i);
            }
        }
        return this.f38302OooOo;
    }

    @GuardedBy("requestLock")
    public final void OooO0o0() {
        if (this.f38311OooOoo0) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f38285OooO0O0.OooO00o();
        this.f38295OooOOO.OooOO0(this);
        o000O0.OooO0o oooO0o = this.f38301OooOOoo;
        if (oooO0o != null) {
            synchronized (o000O0.this) {
                oooO0o.f37580OooO00o.OooOO0(oooO0o.f37581OooO0O0);
            }
            this.f38301OooOOoo = null;
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean OooO0oO(Oooo0 oooo0) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        OooOo<?> oooOo;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        OooOo<?> oooOo2;
        Priority priority2;
        int size2;
        boolean zOooO00o;
        boolean zOooOOOO;
        if (!(oooo0 instanceof o00Ooo)) {
            return false;
        }
        synchronized (this.f38286OooO0OO) {
            i = this.f38293OooOO0O;
            i2 = this.f38294OooOO0o;
            obj = this.f38291OooO0oo;
            cls = this.f38283OooO;
            oooOo = this.f38292OooOO0;
            priority = this.f38296OooOOO0;
            List<o0OoOo0<R>> list = this.f38297OooOOOO;
            size = list != null ? list.size() : 0;
        }
        o00Ooo o00ooo2 = (o00Ooo) oooo0;
        synchronized (o00ooo2.f38286OooO0OO) {
            i3 = o00ooo2.f38293OooOO0O;
            i4 = o00ooo2.f38294OooOO0o;
            obj2 = o00ooo2.f38291OooO0oo;
            cls2 = o00ooo2.f38283OooO;
            oooOo2 = o00ooo2.f38292OooOO0;
            priority2 = o00ooo2.f38296OooOOO0;
            List<o0OoOo0<R>> list2 = o00ooo2.f38297OooOOOO;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = o00OO0O0.f38351OooO00o;
            if (obj == null) {
                zOooO00o = obj2 == null;
            } else {
                zOooO00o = obj instanceof Oooo000 ? ((Oooo000) obj).OooO00o() : obj.equals(obj2);
            }
            if (zOooO00o && cls.equals(cls2)) {
                if (oooOo == null) {
                    zOooOOOO = oooOo2 == null;
                } else {
                    zOooOOOO = oooOo.OooOOOO(oooOo2);
                }
                if (zOooOOOO && priority == priority2 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    @GuardedBy("requestLock")
    public final boolean OooO0oo() {
        RequestCoordinator requestCoordinator = this.f38289OooO0o0;
        return requestCoordinator == null || !requestCoordinator.getRoot().OooO00o();
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void OooOO0() {
        int i;
        synchronized (this.f38286OooO0OO) {
            try {
                if (this.f38311OooOoo0) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f38285OooO0O0.OooO00o();
                int i2 = o00O0OOO.f38347OooO0O0;
                this.f38304OooOo00 = SystemClock.elapsedRealtimeNanos();
                if (this.f38291OooO0oo == null) {
                    if (o00OO0O0.OooO0oo(this.f38293OooOO0O, this.f38294OooOO0o)) {
                        this.f38307OooOoO = this.f38293OooOO0O;
                        this.f38309OooOoOO = this.f38294OooOO0o;
                    }
                    if (this.f38308OooOoO0 == null) {
                        OooOo<?> oooOo = this.f38292OooOO0;
                        Drawable drawable = oooOo.f38261OooOOo;
                        this.f38308OooOoO0 = drawable;
                        if (drawable == null && (i = oooOo.f38263OooOOoo) > 0) {
                            this.f38308OooOoO0 = OooO(i);
                        }
                    }
                    OooOO0o(new GlideException("Received null model"), this.f38308OooOoO0 == null ? 5 : 3);
                    return;
                }
                OooO00o oooO00o = this.f38305OooOo0O;
                if (oooO00o == OooO00o.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (oooO00o == OooO00o.COMPLETE) {
                    OooOOO0(this.f38299OooOOo, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<o0OoOo0<R>> list = this.f38297OooOOOO;
                if (list != null) {
                    for (o0OoOo0<R> o0oooo1 : list) {
                        if (o0oooo1 instanceof Oooo000) {
                            ((Oooo000) o0oooo1).getClass();
                        }
                    }
                }
                OooO00o oooO00o2 = OooO00o.WAITING_FOR_SIZE;
                this.f38305OooOo0O = oooO00o2;
                if (o00OO0O0.OooO0oo(this.f38293OooOO0O, this.f38294OooOO0o)) {
                    OooO0O0(this.f38293OooOO0O, this.f38294OooOO0o);
                } else {
                    this.f38295OooOOO.OooO0o(this);
                }
                OooO00o oooO00o3 = this.f38305OooOo0O;
                if (oooO00o3 == OooO00o.RUNNING || oooO00o3 == oooO00o2) {
                    RequestCoordinator requestCoordinator = this.f38289OooO0o0;
                    if (requestCoordinator == null || requestCoordinator.OooO0O0(this)) {
                        this.f38295OooOOO.OooO0OO(OooO0o());
                    }
                }
                if (f38282OooOooO) {
                    OooOO0O("finished run method in " + o00O0OOO.OooO00o(this.f38304OooOo00));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0O(String str) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " this: ");
        sbOooO0O0.append(this.f38284OooO00o);
        Log.v("GlideRequest", sbOooO0O0.toString());
    }

    public final void OooOO0o(GlideException glideException, int i) {
        int i2;
        int i3;
        this.f38285OooO0O0.OooO00o();
        synchronized (this.f38286OooO0OO) {
            glideException.getClass();
            int i4 = this.f38290OooO0oO.f12929OooO;
            if (i4 <= i) {
                Log.w("Glide", "Load failed for [" + this.f38291OooO0oo + "] with dimensions [" + this.f38307OooOoO + "x" + this.f38309OooOoOO + "]", glideException);
                if (i4 <= 4) {
                    glideException.OooO0o0();
                }
            }
            Drawable drawableOooO0o = null;
            this.f38301OooOOoo = null;
            this.f38305OooOo0O = OooO00o.FAILED;
            RequestCoordinator requestCoordinator = this.f38289OooO0o0;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0oo(this);
            }
            boolean z = true;
            this.f38311OooOoo0 = true;
            try {
                List<o0OoOo0<R>> list = this.f38297OooOOOO;
                if (list != null) {
                    for (o0OoOo0<R> o0oooo1 : list) {
                        OooO0oo();
                        o0oooo1.OooO0oO(glideException);
                    }
                }
                o0OoOo0<R> o0oooo2 = this.f38287OooO0Oo;
                if (o0oooo2 != null) {
                    OooO0oo();
                    o0oooo2.OooO0oO(glideException);
                }
                RequestCoordinator requestCoordinator2 = this.f38289OooO0o0;
                if (requestCoordinator2 != null && !requestCoordinator2.OooO0O0(this)) {
                    z = false;
                }
                if (z) {
                    if (this.f38291OooO0oo == null) {
                        if (this.f38308OooOoO0 == null) {
                            OooOo<?> oooOo = this.f38292OooOO0;
                            Drawable drawable = oooOo.f38261OooOOo;
                            this.f38308OooOoO0 = drawable;
                            if (drawable == null && (i3 = oooOo.f38263OooOOoo) > 0) {
                                this.f38308OooOoO0 = OooO(i3);
                            }
                        }
                        drawableOooO0o = this.f38308OooOoO0;
                    }
                    if (drawableOooO0o == null) {
                        if (this.f38306OooOo0o == null) {
                            OooOo<?> oooOo2 = this.f38292OooOO0;
                            Drawable drawable2 = oooOo2.f38253OooO0oo;
                            this.f38306OooOo0o = drawable2;
                            if (drawable2 == null && (i2 = oooOo2.f38248OooO) > 0) {
                                this.f38306OooOo0o = OooO(i2);
                            }
                        }
                        drawableOooO0o = this.f38306OooOo0o;
                    }
                    if (drawableOooO0o == null) {
                        drawableOooO0o = OooO0o();
                    }
                    this.f38295OooOOO.OooOO0O(drawableOooO0o);
                }
                this.f38311OooOoo0 = false;
            } catch (Throwable th) {
                this.f38311OooOoo0 = false;
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    public final void OooOOO(o00oOoo<R> o00oooo2, R r, DataSource dataSource, boolean z) {
        boolean zOooO00o;
        OooO0oo();
        this.f38305OooOo0O = OooO00o.COMPLETE;
        this.f38299OooOOo = o00oooo2;
        if (this.f38290OooO0oO.f12929OooO <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + dataSource + " for " + this.f38291OooO0oo + " with size [" + this.f38307OooOoO + "x" + this.f38309OooOoOO + "] in " + o00O0OOO.OooO00o(this.f38304OooOo00) + " ms");
        }
        RequestCoordinator requestCoordinator = this.f38289OooO0o0;
        if (requestCoordinator != null) {
            requestCoordinator.OooO0o(this);
        }
        this.f38311OooOoo0 = true;
        try {
            List<o0OoOo0<R>> list = this.f38297OooOOOO;
            if (list != null) {
                zOooO00o = false;
                for (o0OoOo0<R> o0oooo1 : list) {
                    o0oooo1.OooO0o0(r);
                    zOooO00o |= false;
                    if (o0oooo1 instanceof Oooo000) {
                        zOooO00o |= ((Oooo000) o0oooo1).OooO00o();
                    }
                }
            } else {
                zOooO00o = false;
            }
            o0OoOo0<R> o0oooo2 = this.f38287OooO0Oo;
            if (o0oooo2 != null) {
                o0oooo2.OooO0o0(r);
            }
            if (!(zOooO00o | false)) {
                this.f38298OooOOOo.getClass();
                this.f38295OooOOO.OooO0O0(r);
            }
        } finally {
            this.f38311OooOoo0 = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o00Ooo0o.Oooo0, o00Ooo0o.o00Ooo, o00Ooo0o.o00Ooo<R>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o00Ooo0o.o00Ooo] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void OooOOO0(o00oOoo<?> o00oooo2, DataSource dataSource, boolean z) {
        ?? r9;
        Throwable th;
        this.f38285OooO0O0.OooO00o();
        o00oOoo<?> o00oooo3 = null;
        try {
            synchronized (this.f38286OooO0OO) {
                try {
                    this.f38301OooOOoo = null;
                    if (o00oooo2 == null) {
                        OooOO0o(new GlideException("Expected to receive a Resource<R> with an object of " + this.f38283OooO + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = o00oooo2.get();
                    try {
                        if (obj == null || !this.f38283OooO.isAssignableFrom(obj.getClass())) {
                            this.f38299OooOOo = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f38283OooO);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(o00oooo2);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            OooOO0o(new GlideException(sb.toString()), 5);
                        } else {
                            RequestCoordinator requestCoordinator = this.f38289OooO0o0;
                            if (requestCoordinator == null || requestCoordinator.OooO0o0(this)) {
                                OooOOO(o00oooo2, obj, dataSource, z);
                                return;
                            } else {
                                this.f38299OooOOo = null;
                                this.f38305OooOo0O = OooO00o.COMPLETE;
                            }
                        }
                        this.f38303OooOo0.getClass();
                        o000O0.OooO0oO(o00oooo2);
                    } catch (Throwable th2) {
                        th = th2;
                        o00oooo3 = o00oooo2;
                        r9 = this;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (o00oooo3 != null) {
                                        r9.f38303OooOo0.getClass();
                                        o000O0.OooO0oO(o00oooo3);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r9 = r9;
                            }
                            th = th4;
                            r9 = r9;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r9 = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            r9 = this;
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void clear() {
        synchronized (this.f38286OooO0OO) {
            if (this.f38311OooOoo0) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.f38285OooO0O0.OooO00o();
            OooO00o oooO00o = this.f38305OooOo0O;
            OooO00o oooO00o2 = OooO00o.CLEARED;
            if (oooO00o == oooO00o2) {
                return;
            }
            OooO0o0();
            o00oOoo<R> o00oooo2 = this.f38299OooOOo;
            if (o00oooo2 != null) {
                this.f38299OooOOo = null;
            } else {
                o00oooo2 = null;
            }
            RequestCoordinator requestCoordinator = this.f38289OooO0o0;
            if (requestCoordinator == null || requestCoordinator.OooO(this)) {
                this.f38295OooOOO.OooO0Oo(OooO0o());
            }
            this.f38305OooOo0O = oooO00o2;
            if (o00oooo2 != null) {
                this.f38303OooOo0.getClass();
                o000O0.OooO0oO(o00oooo2);
            }
        }
    }

    @Override // p170o00Ooo0o.Oooo0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f38286OooO0OO) {
            OooO00o oooO00o = this.f38305OooOo0O;
            z = oooO00o == OooO00o.RUNNING || oooO00o == OooO00o.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // p170o00Ooo0o.Oooo0
    public final void pause() {
        synchronized (this.f38286OooO0OO) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f38286OooO0OO) {
            obj = this.f38291OooO0oo;
            cls = this.f38283OooO;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
