package o00OO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o00OO00O.Oooo000;
import p037OoooOo0.o000Oo0;
import p127o00O0oo.o0000;
import p127o00O0oo.o0O0O00;
import p532o0o0Oo.o00000O;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0<R> implements OooO0OO, o00OOO00.OooOO0O, OooOO0O {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final boolean f37025OooOooO = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Class<R> f37026OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f37027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OOO.OooO0o.OooO00o f37028OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f37029OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO<R> f37030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f37031OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RequestCoordinator f37032OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final com.bumptech.glide.OooO f37033OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Object f37034OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00OO.OooO00o<?> f37035OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f37036OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f37037OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00OOO00.OooOOO0<R> f37038OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Priority f37039OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final List<OooO<R>> f37040OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o00OOO0.OooO0O0<? super R> f37041OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @GuardedBy("requestLock")
    public o0000<R> f37042OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Executor f37043OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @GuardedBy("requestLock")
    public o0O0O00.OooO0o f37044OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f37045OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o0O0O00 f37046OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @GuardedBy("requestLock")
    public long f37047OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @GuardedBy("requestLock")
    public OooO00o f37048OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f37049OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f37050OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f37051OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f37052OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final RuntimeException f37053OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f37054OooOoo0;

    public enum OooO00o {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public OooOOO0(Context context, com.bumptech.glide.OooO oooO, @NonNull Object obj, @Nullable Object obj2, Class cls, o00OO.OooO00o oooO00o, int i, int i2, Priority priority, o00OOO00.OooOOO0 oooOOO0, @Nullable OooO0o oooO0o, @Nullable ArrayList arrayList, RequestCoordinator requestCoordinator, o0O0O00 o0o0o00, o00OOO0.OooO00o.C0434OooO00o c0434OooO00o, Executor executor) {
        this.f37027OooO00o = f37025OooOooO ? String.valueOf(hashCode()) : null;
        this.f37028OooO0O0 = new o00OOO.OooO0o.OooO00o();
        this.f37029OooO0OO = obj;
        this.f37031OooO0o = context;
        this.f37033OooO0oO = oooO;
        this.f37034OooO0oo = obj2;
        this.f37026OooO = cls;
        this.f37035OooOO0 = oooO00o;
        this.f37036OooOO0O = i;
        this.f37037OooOO0o = i2;
        this.f37039OooOOO0 = priority;
        this.f37038OooOOO = oooOOO0;
        this.f37030OooO0Oo = oooO0o;
        this.f37040OooOOOO = arrayList;
        this.f37032OooO0o0 = requestCoordinator;
        this.f37046OooOo0 = o0o0o00;
        this.f37041OooOOOo = c0434OooO00o;
        this.f37043OooOOo0 = executor;
        this.f37048OooOo0O = OooO00o.PENDING;
        if (this.f37053OooOoo == null && oooO.f9846OooO0oo.f9874OooO00o.containsKey(com.bumptech.glide.OooO0o.OooO0OO.class)) {
            this.f37053OooOoo = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    public final Drawable OooO(@DrawableRes int i) {
        Resources.Theme theme = this.f37035OooOO0.f37007OooOo;
        Context context = this.f37031OooO0o;
        if (theme == null) {
            theme = context.getTheme();
        }
        return o00OO0OO.OooOOO0.OooO00o(context, context, i, theme);
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f37029OooO0OO) {
            z = this.f37048OooOo0O == OooO00o.COMPLETE;
        }
        return z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    @Override // o00OOO00.OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f37028OooO0O0.OooO00o();
        Object obj2 = this.f37029OooO0OO;
        synchronized (obj2) {
            try {
                boolean z = f37025OooOooO;
                if (z) {
                    OooOO0O("Got onSizeReady in " + o00000O.OooO00o(this.f37047OooOo00));
                }
                if (this.f37048OooOo0O == OooO00o.WAITING_FOR_SIZE) {
                    OooO00o oooO00o = OooO00o.RUNNING;
                    this.f37048OooOo0O = oooO00o;
                    float f = this.f37035OooOO0.f36994OooO0o0;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f);
                    }
                    this.f37050OooOoO = iRound;
                    this.f37052OooOoOO = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        OooOO0O("finished setup for calling load in " + o00000O.OooO00o(this.f37047OooOo00));
                    }
                    o0O0O00 o0o0o00 = this.f37046OooOo0;
                    com.bumptech.glide.OooO oooO = this.f37033OooO0oO;
                    Object obj3 = this.f37034OooO0oo;
                    o00OO.OooO00o<?> oooO00o2 = this.f37035OooOO0;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f37044OooOOoo = o0o0o00.OooO0O0(oooO, obj3, oooO00o2.f37002OooOOOO, this.f37050OooOoO, this.f37052OooOoOO, oooO00o2.f37010OooOo0O, this.f37026OooO, this.f37039OooOOO0, oooO00o2.f36993OooO0o, oooO00o2.f37008OooOo0, oooO00o2.f37003OooOOOo, oooO00o2.f37016OooOoo0, oooO00o2.f37009OooOo00, oooO00o2.f36999OooOO0o, oooO00o2.f37012OooOoO, oooO00o2.f37015OooOoo, oooO00o2.f37014OooOoOO, this, this.f37043OooOOo0);
                                if (this.f37048OooOo0O != oooO00o) {
                                    this.f37044OooOOoo = null;
                                }
                                if (z) {
                                    OooOO0O("finished onSizeReady in " + o00000O.OooO00o(this.f37047OooOo00));
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

    @Override // o00OO.OooO0OO
    public final boolean OooO0OO(OooO0OO oooO0OO) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        o00OO.OooO00o<?> oooO00o;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        o00OO.OooO00o<?> oooO00o2;
        Priority priority2;
        int size2;
        boolean zOooO00o;
        if (!(oooO0OO instanceof OooOOO0)) {
            return false;
        }
        synchronized (this.f37029OooO0OO) {
            i = this.f37036OooOO0O;
            i2 = this.f37037OooOO0o;
            obj = this.f37034OooO0oo;
            cls = this.f37026OooO;
            oooO00o = this.f37035OooOO0;
            priority = this.f37039OooOOO0;
            List<OooO<R>> list = this.f37040OooOOOO;
            size = list != null ? list.size() : 0;
        }
        OooOOO0 oooOOO0 = (OooOOO0) oooO0OO;
        synchronized (oooOOO0.f37029OooO0OO) {
            i3 = oooOOO0.f37036OooOO0O;
            i4 = oooOOO0.f37037OooOO0o;
            obj2 = oooOOO0.f37034OooO0oo;
            cls2 = oooOOO0.f37026OooO;
            oooO00o2 = oooOOO0.f37035OooOO0;
            priority2 = oooOOO0.f37039OooOOO0;
            List<OooO<R>> list2 = oooOOO0.f37040OooOOOO;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = o0000oo.f54571OooO00o;
            if (obj == null) {
                zOooO00o = obj2 == null;
            } else {
                zOooO00o = obj instanceof Oooo000 ? ((Oooo000) obj).OooO00o() : obj.equals(obj2);
            }
            if (zOooO00o && cls.equals(cls2) && oooO00o.equals(oooO00o2) && priority == priority2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    @GuardedBy("requestLock")
    public final void OooO0Oo() {
        if (this.f37054OooOoo0) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f37028OooO0O0.OooO00o();
        this.f37038OooOOO.OooO0O0(this);
        o0O0O00.OooO0o oooO0o = this.f37044OooOOoo;
        if (oooO0o != null) {
            synchronized (o0O0O00.this) {
                oooO0o.f36866OooO00o.OooOO0(oooO0o.f36867OooO0O0);
            }
            this.f37044OooOOoo = null;
        }
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.f37029OooO0OO) {
            z = this.f37048OooOo0O == OooO00o.CLEARED;
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final Drawable OooO0o0() {
        int i;
        if (this.f37045OooOo == null) {
            o00OO.OooO00o<?> oooO00o = this.f37035OooOO0;
            Drawable drawable = oooO00o.f36997OooOO0;
            this.f37045OooOo = drawable;
            if (drawable == null && (i = oooO00o.f36998OooOO0O) > 0) {
                this.f37045OooOo = OooO(i);
            }
        }
        return this.f37045OooOo;
    }

    @GuardedBy("requestLock")
    public final boolean OooO0oO() {
        RequestCoordinator requestCoordinator = this.f37032OooO0o0;
        return requestCoordinator == null || !requestCoordinator.getRoot().OooO00o();
    }

    @Override // o00OO.OooO0OO
    public final boolean OooO0oo() {
        boolean z;
        synchronized (this.f37029OooO0OO) {
            z = this.f37048OooOo0O == OooO00o.COMPLETE;
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final void OooOO0() {
        int i;
        synchronized (this.f37029OooO0OO) {
            try {
                if (this.f37054OooOoo0) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f37028OooO0O0.OooO00o();
                int i2 = o00000O.f54564OooO0O0;
                this.f37047OooOo00 = SystemClock.elapsedRealtimeNanos();
                if (this.f37034OooO0oo == null) {
                    if (o0000oo.OooO(this.f37036OooOO0O, this.f37037OooOO0o)) {
                        this.f37050OooOoO = this.f37036OooOO0O;
                        this.f37052OooOoOO = this.f37037OooOO0o;
                    }
                    if (this.f37051OooOoO0 == null) {
                        o00OO.OooO00o<?> oooO00o = this.f37035OooOO0;
                        Drawable drawable = oooO00o.f37004OooOOo;
                        this.f37051OooOoO0 = drawable;
                        if (drawable == null && (i = oooO00o.f37006OooOOoo) > 0) {
                            this.f37051OooOoO0 = OooO(i);
                        }
                    }
                    OooOO0o(new GlideException("Received null model"), this.f37051OooOoO0 == null ? 5 : 3);
                    return;
                }
                OooO00o oooO00o2 = this.f37048OooOo0O;
                if (oooO00o2 == OooO00o.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (oooO00o2 == OooO00o.COMPLETE) {
                    OooOOO0(this.f37042OooOOo, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<OooO<R>> list = this.f37040OooOOOO;
                if (list != null) {
                    for (OooO<R> oooO : list) {
                        if (oooO instanceof OooO0O0) {
                            ((OooO0O0) oooO).getClass();
                        }
                    }
                }
                OooO00o oooO00o3 = OooO00o.WAITING_FOR_SIZE;
                this.f37048OooOo0O = oooO00o3;
                if (o0000oo.OooO(this.f37036OooOO0O, this.f37037OooOO0o)) {
                    OooO0O0(this.f37036OooOO0O, this.f37037OooOO0o);
                } else {
                    this.f37038OooOOO.OooOO0(this);
                }
                OooO00o oooO00o4 = this.f37048OooOo0O;
                if (oooO00o4 == OooO00o.RUNNING || oooO00o4 == oooO00o3) {
                    RequestCoordinator requestCoordinator = this.f37032OooO0o0;
                    if (requestCoordinator == null || requestCoordinator.OooO0oO(this)) {
                        this.f37038OooOOO.OooO0o0(OooO0o0());
                    }
                }
                if (f37025OooOooO) {
                    OooOO0O("finished run method in " + o00000O.OooO00o(this.f37047OooOo00));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooOO0O(String str) {
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, " this: ");
        sbOooO0O0.append(this.f37027OooO00o);
        Log.v("GlideRequest", sbOooO0O0.toString());
    }

    public final void OooOO0o(GlideException glideException, int i) {
        int i2;
        int i3;
        this.f37028OooO0O0.OooO00o();
        synchronized (this.f37029OooO0OO) {
            glideException.getClass();
            int i4 = this.f37033OooO0oO.f9838OooO;
            if (i4 <= i) {
                Log.w("Glide", "Load failed for [" + this.f37034OooO0oo + "] with dimensions [" + this.f37050OooOoO + "x" + this.f37052OooOoOO + "]", glideException);
                if (i4 <= 4) {
                    glideException.OooO0o0();
                }
            }
            Drawable drawableOooO0o0 = null;
            this.f37044OooOOoo = null;
            this.f37048OooOo0O = OooO00o.FAILED;
            RequestCoordinator requestCoordinator = this.f37032OooO0o0;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0O0(this);
            }
            boolean z = true;
            this.f37054OooOoo0 = true;
            try {
                List<OooO<R>> list = this.f37040OooOOOO;
                if (list != null) {
                    for (OooO<R> oooO : list) {
                        OooO0oO();
                        oooO.OooO0oo(glideException);
                    }
                }
                OooO<R> oooO2 = this.f37030OooO0Oo;
                if (oooO2 != null) {
                    OooO0oO();
                    oooO2.OooO0oo(glideException);
                }
                RequestCoordinator requestCoordinator2 = this.f37032OooO0o0;
                if (requestCoordinator2 != null && !requestCoordinator2.OooO0oO(this)) {
                    z = false;
                }
                if (z) {
                    if (this.f37034OooO0oo == null) {
                        if (this.f37051OooOoO0 == null) {
                            o00OO.OooO00o<?> oooO00o = this.f37035OooOO0;
                            Drawable drawable = oooO00o.f37004OooOOo;
                            this.f37051OooOoO0 = drawable;
                            if (drawable == null && (i3 = oooO00o.f37006OooOOoo) > 0) {
                                this.f37051OooOoO0 = OooO(i3);
                            }
                        }
                        drawableOooO0o0 = this.f37051OooOoO0;
                    }
                    if (drawableOooO0o0 == null) {
                        if (this.f37049OooOo0o == null) {
                            o00OO.OooO00o<?> oooO00o2 = this.f37035OooOO0;
                            Drawable drawable2 = oooO00o2.f36996OooO0oo;
                            this.f37049OooOo0o = drawable2;
                            if (drawable2 == null && (i2 = oooO00o2.f36991OooO) > 0) {
                                this.f37049OooOo0o = OooO(i2);
                            }
                        }
                        drawableOooO0o0 = this.f37049OooOo0o;
                    }
                    if (drawableOooO0o0 == null) {
                        drawableOooO0o0 = OooO0o0();
                    }
                    this.f37038OooOOO.OooOO0O(drawableOooO0o0);
                }
                this.f37054OooOoo0 = false;
            } catch (Throwable th) {
                this.f37054OooOoo0 = false;
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    public final void OooOOO(o0000 o0000Var, Object obj, DataSource dataSource) {
        OooO0oO();
        this.f37048OooOo0O = OooO00o.COMPLETE;
        this.f37042OooOOo = o0000Var;
        if (this.f37033OooO0oO.f9838OooO <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + this.f37034OooO0oo + " with size [" + this.f37050OooOoO + "x" + this.f37052OooOoOO + "] in " + o00000O.OooO00o(this.f37047OooOo00) + " ms");
        }
        RequestCoordinator requestCoordinator = this.f37032OooO0o0;
        if (requestCoordinator != null) {
            requestCoordinator.OooO0o0(this);
        }
        this.f37054OooOoo0 = true;
        try {
            List<OooO<R>> list = this.f37040OooOOOO;
            if (list != null) {
                Iterator<OooO<R>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().OooO0oO(obj);
                }
            }
            OooO<R> oooO = this.f37030OooO0Oo;
            if (oooO != null) {
                oooO.OooO0oO(obj);
            }
            this.f37041OooOOOo.getClass();
            this.f37038OooOOO.OooO0OO(obj);
        } finally {
            this.f37054OooOoo0 = false;
        }
    }

    public final void OooOOO0(o0000<?> o0000Var, DataSource dataSource, boolean z) {
        OooOOO0<R> oooOOO0;
        Throwable th;
        this.f37028OooO0O0.OooO00o();
        o0000<?> o0000Var2 = null;
        try {
            synchronized (this.f37029OooO0OO) {
                try {
                    this.f37044OooOOoo = null;
                    if (o0000Var == null) {
                        OooOO0o(new GlideException("Expected to receive a Resource<R> with an object of " + this.f37026OooO + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = o0000Var.get();
                    try {
                        if (obj == null || !this.f37026OooO.isAssignableFrom(obj.getClass())) {
                            this.f37042OooOOo = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f37026OooO);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(o0000Var);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            OooOO0o(new GlideException(sb.toString()), 5);
                        } else {
                            RequestCoordinator requestCoordinator = this.f37032OooO0o0;
                            if (requestCoordinator == null || requestCoordinator.OooO0Oo(this)) {
                                OooOOO(o0000Var, obj, dataSource);
                                return;
                            } else {
                                this.f37042OooOOo = null;
                                this.f37048OooOo0O = OooO00o.COMPLETE;
                            }
                        }
                        this.f37046OooOo0.getClass();
                        o0O0O00.OooO0oO(o0000Var);
                    } catch (Throwable th2) {
                        th = th2;
                        o0000Var2 = o0000Var;
                        oooOOO0 = this;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (o0000Var2 != null) {
                                        oooOOO0.f37046OooOo0.getClass();
                                        o0O0O00.OooO0oO(o0000Var2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                oooOOO0 = oooOOO0;
                            }
                            th = th4;
                            oooOOO0 = oooOOO0;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    oooOOO0 = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            oooOOO0 = this;
        }
    }

    @Override // o00OO.OooO0OO
    public final void clear() {
        synchronized (this.f37029OooO0OO) {
            if (this.f37054OooOoo0) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.f37028OooO0O0.OooO00o();
            OooO00o oooO00o = this.f37048OooOo0O;
            OooO00o oooO00o2 = OooO00o.CLEARED;
            if (oooO00o == oooO00o2) {
                return;
            }
            OooO0Oo();
            o0000<R> o0000Var = this.f37042OooOOo;
            if (o0000Var != null) {
                this.f37042OooOOo = null;
            } else {
                o0000Var = null;
            }
            RequestCoordinator requestCoordinator = this.f37032OooO0o0;
            if (requestCoordinator == null || requestCoordinator.OooO(this)) {
                this.f37038OooOOO.OooO0o(OooO0o0());
            }
            this.f37048OooOo0O = oooO00o2;
            if (o0000Var != null) {
                this.f37046OooOo0.getClass();
                o0O0O00.OooO0oO(o0000Var);
            }
        }
    }

    @Override // o00OO.OooO0OO
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f37029OooO0OO) {
            OooO00o oooO00o = this.f37048OooOo0O;
            z = oooO00o == OooO00o.RUNNING || oooO00o == OooO00o.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // o00OO.OooO0OO
    public final void pause() {
        synchronized (this.f37029OooO0OO) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f37029OooO0OO) {
            obj = this.f37034OooO0oo;
            cls = this.f37026OooO;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
