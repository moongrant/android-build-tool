package p234o00oOoOO;

import OooO00o.OooO00o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooO0o;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p214o00oO0.o00OO000;
import p214o00oO0.o00OOOO0;
import p221o00oOO.o000000;
import p227o00oOOoO.oOO00OO;
import p235o00oOoOo.oOOO00o0;
import p235o00oOoOo.oOOO0O0o;
import p237o00oOoo0.o0O000o0;
import p237o00oOoo0.o0OoOoOo;
import p241o00oo0.o0O00000;
import p243o00oo00O.o0000O0;
import p243o00oo00O.o0000O0O;
import p243o00oo00O.o000O000;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oOO0OOO<R> implements oOO0O0O0, oOOO00o0, oOO0OO {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final boolean f33986OooOooO = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Class<R> f33987OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f33988OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00000.OooO00o f33989OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f33990OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final oOO0O0O<R> f33991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f33992OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RequestCoordinator f33993OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f33994OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Object f33995OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final oOO0O0<?> f33996OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f33997OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f33998OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final oOOO0O0o<R> f33999OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Priority f34000OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final List<oOO0O0O<R>> f34001OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O000o0<? super R> f34002OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @GuardedBy("requestLock")
    public o00OOOO0<R> f34003OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Executor f34004OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @GuardedBy("requestLock")
    public o00OO000.OooO0o f34005OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f34006OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile o00OO000 f34007OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @GuardedBy("requestLock")
    public long f34008OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f34009OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f34010OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f34011OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f34012OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f34013OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public RuntimeException f34014OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f34015OooOoo0;

    public oOO0OOO(Context context, OooO oooO, @NonNull Object obj, @Nullable Object obj2, Class cls, oOO0O0 ooo0o0, int i, int i2, Priority priority, oOOO0O0o oooo0o0o, @Nullable List list, RequestCoordinator requestCoordinator, o00OO000 o00oo001) {
        o0O000o0<? super R> o0o000o1 = (o0O000o0<? super R>) o0OoOoOo.f34056OooO0O0;
        o0000O0.OooO00o oooO00o = o0000O0.f34159OooO00o;
        this.f33988OooO00o = f33986OooOooO ? String.valueOf(hashCode()) : null;
        this.f33989OooO0O0 = new o0O00000.OooO00o();
        this.f33990OooO0OO = obj;
        this.f33992OooO0o = context;
        this.f33994OooO0oO = oooO;
        this.f33995OooO0oo = obj2;
        this.f33987OooO = cls;
        this.f33996OooOO0 = ooo0o0;
        this.f33997OooOO0O = i;
        this.f33998OooOO0o = i2;
        this.f34000OooOOO0 = priority;
        this.f33999OooOOO = oooo0o0o;
        this.f33991OooO0Oo = null;
        this.f34001OooOOOO = list;
        this.f33993OooO0o0 = requestCoordinator;
        this.f34007OooOo0 = o00oo001;
        this.f34002OooOOOo = o0o000o1;
        this.f34004OooOOo0 = oooO00o;
        this.f34009OooOo0O = 1;
        if (this.f34014OooOoo == null && oooO.f12367OooO0oo.OooO00o(OooO0o.OooO0OO.class)) {
            this.f34014OooOoo = new RuntimeException("Glide request origin trace");
        }
    }

    @GuardedBy("requestLock")
    public final boolean OooO() {
        RequestCoordinator requestCoordinator = this.f33993OooO0o0;
        return requestCoordinator == null || !requestCoordinator.OooO0O0().OooO00o();
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f33990OooO0OO) {
            z = this.f34009OooOo0O == 4;
        }
        return z;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00fe */
    @Override // p235o00oOoOo.oOOO00o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(int i, int i2) throws Throwable {
        Object obj;
        int iRound = i;
        this.f33989OooO0O0.OooO00o();
        Object obj2 = this.f33990OooO0OO;
        synchronized (obj2) {
            try {
                boolean z = f33986OooOooO;
                if (z) {
                    OooOOO0("Got onSizeReady in " + o0000O0O.OooO00o(this.f34008OooOo00));
                }
                if (this.f34009OooOo0O == 3) {
                    this.f34009OooOo0O = 2;
                    float f = this.f33996OooOO0.f33962Oooo0oO;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f);
                    }
                    this.f34011OooOoO = iRound;
                    this.f34013OooOoOO = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                    if (z) {
                        OooOOO0("finished setup for calling load in " + o0000O0O.OooO00o(this.f34008OooOo00));
                    }
                    o00OO000 o00oo001 = this.f34007OooOo0;
                    OooO oooO = this.f33994OooO0oO;
                    Object obj3 = this.f33995OooO0oo;
                    oOO0O0<?> ooo0o0 = this.f33996OooOO0;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f34005OooOOoo = o00oo001.OooO0O0(oooO, obj3, ooo0o0.f33970OoooOOo, this.f34011OooOoO, this.f34013OooOoOO, ooo0o0.f33977OooooOO, this.f33987OooO, this.f34000OooOOO0, ooo0o0.f33963Oooo0oo, ooo0o0.f33976OooooO0, ooo0o0.f33971OoooOo0, ooo0o0.f33984o0OoOo0, ooo0o0.f33975Ooooo0o, ooo0o0.f33968OoooOO0, ooo0o0.f33981OoooooO, ooo0o0.f33985ooOO, ooo0o0.f33982Ooooooo, this, this.f34004OooOOo0);
                                if (this.f34009OooOo0O != 2) {
                                    this.f34005OooOOoo = null;
                                }
                                if (z) {
                                    OooOOO0("finished onSizeReady in " + o0000O0O.OooO00o(this.f34008OooOo00));
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

    @GuardedBy("requestLock")
    public final void OooO0OO() {
        if (this.f34015OooOoo0) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @GuardedBy("requestLock")
    public final void OooO0Oo() {
        OooO0OO();
        this.f33989OooO0O0.OooO00o();
        this.f33999OooOOO.removeCallback(this);
        o00OO000.OooO0o oooO0o = this.f34005OooOOoo;
        if (oooO0o != null) {
            synchronized (o00OO000.this) {
                oooO0o.f33463OooO00o.OooO0oo(oooO0o.f33464OooO0O0);
            }
            this.f34005OooOOoo = null;
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooO0o() {
        boolean z;
        synchronized (this.f33990OooO0OO) {
            z = this.f34009OooOo0O == 6;
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final Drawable OooO0o0() {
        int i;
        if (this.f34012OooOoO0 == null) {
            oOO0O0<?> ooo0o0 = this.f33996OooOO0;
            Drawable drawable = ooo0o0.f33973OoooOoo;
            this.f34012OooOoO0 = drawable;
            if (drawable == null && (i = ooo0o0.f33974Ooooo00) > 0) {
                this.f34012OooOoO0 = OooOO0o(i);
            }
        }
        return this.f34012OooOoO0;
    }

    @GuardedBy("requestLock")
    public final Drawable OooO0oO() {
        int i;
        if (this.f34006OooOo == null) {
            oOO0O0<?> ooo0o0 = this.f33996OooOO0;
            Drawable drawable = ooo0o0.f33967OoooO0O;
            this.f34006OooOo = drawable;
            if (drawable == null && (i = ooo0o0.f33964OoooO) > 0) {
                this.f34006OooOo = OooOO0o(i);
            }
        }
        return this.f34006OooOo;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void OooO0oo() {
        synchronized (this.f33990OooO0OO) {
            OooO0OO();
            this.f33989OooO0O0.OooO00o();
            int i = o0000O0O.f34164OooO0O0;
            this.f34008OooOo00 = SystemClock.elapsedRealtimeNanos();
            if (this.f33995OooO0oo == null) {
                if (o000O000.OooOO0(this.f33997OooOO0O, this.f33998OooOO0o)) {
                    this.f34011OooOoO = this.f33997OooOO0O;
                    this.f34013OooOoOO = this.f33998OooOO0o;
                }
                OooOOO(new GlideException("Received null model"), OooO0o0() == null ? 5 : 3);
                return;
            }
            int i2 = this.f34009OooOo0O;
            if (i2 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i2 == 4) {
                OooOOOO(this.f34003OooOOo, DataSource.MEMORY_CACHE, false);
                return;
            }
            this.f34009OooOo0O = 3;
            if (o000O000.OooOO0(this.f33997OooOO0O, this.f33998OooOO0o)) {
                OooO0O0(this.f33997OooOO0O, this.f33998OooOO0o);
            } else {
                this.f33999OooOOO.getSize(this);
            }
            int i3 = this.f34009OooOo0O;
            if (i3 == 2 || i3 == 3) {
                RequestCoordinator requestCoordinator = this.f33993OooO0o0;
                if (requestCoordinator == null || requestCoordinator.OooO0Oo(this)) {
                    this.f33999OooOOO.onLoadStarted(OooO0oO());
                }
            }
            if (f33986OooOooO) {
                OooOOO0("finished run method in " + o0000O0O.OooO00o(this.f34008OooOo00));
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooOO0() {
        boolean z;
        synchronized (this.f33990OooO0OO) {
            z = this.f34009OooOo0O == 4;
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean OooOO0O(oOO0O0O0 ooo0o0o0) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        oOO0O0<?> ooo0o0;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        oOO0O0<?> ooo0o1;
        Priority priority2;
        int size2;
        boolean zOooO00o;
        if (!(ooo0o0o0 instanceof oOO0OOO)) {
            return false;
        }
        synchronized (this.f33990OooO0OO) {
            i = this.f33997OooOO0O;
            i2 = this.f33998OooOO0o;
            obj = this.f33995OooO0oo;
            cls = this.f33987OooO;
            ooo0o0 = this.f33996OooOO0;
            priority = this.f34000OooOOO0;
            List<oOO0O0O<R>> list = this.f34001OooOOOO;
            size = list != null ? list.size() : 0;
        }
        oOO0OOO ooo0ooo = (oOO0OOO) ooo0o0o0;
        synchronized (ooo0ooo.f33990OooO0OO) {
            i3 = ooo0ooo.f33997OooOO0O;
            i4 = ooo0ooo.f33998OooOO0o;
            obj2 = ooo0ooo.f33995OooO0oo;
            cls2 = ooo0ooo.f33987OooO;
            ooo0o1 = ooo0ooo.f33996OooOO0;
            priority2 = ooo0ooo.f34000OooOOO0;
            List<oOO0O0O<R>> list2 = ooo0ooo.f34001OooOOOO;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = o000O000.f34177OooO00o;
            if (obj == null) {
                zOooO00o = obj2 == null;
            } else {
                zOooO00o = obj instanceof o000000 ? ((o000000) obj).OooO00o() : obj.equals(obj2);
            }
            if (zOooO00o && cls.equals(cls2) && ooo0o0.equals(ooo0o1) && priority == priority2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    @GuardedBy("requestLock")
    public final Drawable OooOO0o(@DrawableRes int i) {
        Resources.Theme theme = this.f33996OooOO0.f33980Oooooo0;
        if (theme == null) {
            theme = this.f33992OooO0o.getTheme();
        }
        OooO oooO = this.f33994OooO0oO;
        return oOO00OO.OooO00o(oooO, oooO, i, theme);
    }

    public final void OooOOO(GlideException glideException, int i) {
        this.f33989OooO0O0.OooO00o();
        synchronized (this.f33990OooO0OO) {
            Objects.requireNonNull(glideException);
            int i2 = this.f33994OooO0oO.f12359OooO;
            if (i2 <= i) {
                Log.w("Glide", "Load failed for " + this.f33995OooO0oo + " with size [" + this.f34011OooOoO + "x" + this.f34013OooOoOO + "]", glideException);
                if (i2 <= 4) {
                    glideException.OooO0o0();
                }
            }
            this.f34005OooOOoo = null;
            this.f34009OooOo0O = 5;
            this.f34015OooOoo0 = true;
            try {
                List<oOO0O0O<R>> list = this.f34001OooOOOO;
                if (list != null) {
                    for (oOO0O0O<R> ooo0o0o : list) {
                        OooO();
                        ooo0o0o.OooO0O0();
                    }
                }
                oOO0O0O<R> ooo0o0o2 = this.f33991OooO0Oo;
                if (ooo0o0o2 != null) {
                    OooO();
                    ooo0o0o2.OooO0O0();
                }
                OooOOo0();
                this.f34015OooOoo0 = false;
                RequestCoordinator requestCoordinator = this.f33993OooO0o0;
                if (requestCoordinator != null) {
                    requestCoordinator.OooO(this);
                }
            } catch (Throwable th) {
                this.f34015OooOoo0 = false;
                throw th;
            }
        }
    }

    public final void OooOOO0(String str) {
        StringBuilder sbOooO00o = Oooo0.OooO00o(str, " this: ");
        sbOooO00o.append(this.f33988OooO00o);
        Log.v("Request", sbOooO00o.toString());
    }

    public final void OooOOOO(o00OOOO0<?> o00oooo1, DataSource dataSource, boolean z) throws Throwable {
        oOO0OOO<R> ooo0ooo;
        Throwable th;
        this.f33989OooO0O0.OooO00o();
        o00OOOO0<?> o00oooo2 = null;
        try {
            synchronized (this.f33990OooO0OO) {
                try {
                    this.f34005OooOOoo = null;
                    if (o00oooo1 == null) {
                        OooOOO(new GlideException("Expected to receive a Resource<R> with an object of " + this.f33987OooO + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = o00oooo1.get();
                    try {
                        if (obj == null || !this.f33987OooO.isAssignableFrom(obj.getClass())) {
                            this.f34003OooOOo = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f33987OooO);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(o00oooo1);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            OooOOO(new GlideException(sb.toString()), 5);
                        } else {
                            RequestCoordinator requestCoordinator = this.f33993OooO0o0;
                            if (requestCoordinator == null || requestCoordinator.OooO0OO(this)) {
                                OooOOOo(o00oooo1, obj, dataSource);
                                return;
                            } else {
                                this.f34003OooOOo = null;
                                this.f34009OooOo0O = 4;
                            }
                        }
                        this.f34007OooOo0.OooO0o(o00oooo1);
                    } catch (Throwable th2) {
                        th = th2;
                        o00oooo2 = o00oooo1;
                        ooo0ooo = this;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (o00oooo2 != null) {
                                        ooo0ooo.f34007OooOo0.OooO0o(o00oooo2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                ooo0ooo = ooo0ooo;
                            }
                            th = th4;
                            ooo0ooo = ooo0ooo;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    ooo0ooo = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            ooo0ooo = this;
        }
    }

    @GuardedBy("requestLock")
    public final void OooOOOo(o00OOOO0 o00oooo1, Object obj, DataSource dataSource) {
        OooO();
        this.f34009OooOo0O = 4;
        this.f34003OooOOo = o00oooo1;
        if (this.f33994OooO0oO.f12359OooO <= 3) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Finished loading ");
            sbOooO0o0.append(obj.getClass().getSimpleName());
            sbOooO0o0.append(" from ");
            sbOooO0o0.append(dataSource);
            sbOooO0o0.append(" for ");
            sbOooO0o0.append(this.f33995OooO0oo);
            sbOooO0o0.append(" with size [");
            sbOooO0o0.append(this.f34011OooOoO);
            sbOooO0o0.append("x");
            sbOooO0o0.append(this.f34013OooOoOO);
            sbOooO0o0.append("] in ");
            sbOooO0o0.append(o0000O0O.OooO00o(this.f34008OooOo00));
            sbOooO0o0.append(" ms");
            Log.d("Glide", sbOooO0o0.toString());
        }
        this.f34015OooOoo0 = true;
        try {
            List<oOO0O0O<R>> list = this.f34001OooOOOO;
            if (list != null) {
                Iterator<oOO0O0O<R>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(obj);
                }
            }
            oOO0O0O<R> ooo0o0o = this.f33991OooO0Oo;
            if (ooo0o0o != null) {
                ooo0o0o.OooO00o(obj);
            }
            Objects.requireNonNull(this.f34002OooOOOo);
            this.f33999OooOOO.onResourceReady(obj, o0OoOoOo.f34055OooO00o);
            this.f34015OooOoo0 = false;
            RequestCoordinator requestCoordinator = this.f33993OooO0o0;
            if (requestCoordinator != null) {
                requestCoordinator.OooO0oO(this);
            }
        } catch (Throwable th) {
            this.f34015OooOoo0 = false;
            throw th;
        }
    }

    @GuardedBy("requestLock")
    public final void OooOOo0() {
        int i;
        RequestCoordinator requestCoordinator = this.f33993OooO0o0;
        if (requestCoordinator == null || requestCoordinator.OooO0Oo(this)) {
            Drawable drawableOooO0o0 = this.f33995OooO0oo == null ? OooO0o0() : null;
            if (drawableOooO0o0 == null) {
                if (this.f34010OooOo0o == null) {
                    oOO0O0<?> ooo0o0 = this.f33996OooOO0;
                    Drawable drawable = ooo0o0.f33966OoooO00;
                    this.f34010OooOo0o = drawable;
                    if (drawable == null && (i = ooo0o0.f33965OoooO0) > 0) {
                        this.f34010OooOo0o = OooOO0o(i);
                    }
                }
                drawableOooO0o0 = this.f34010OooOo0o;
            }
            if (drawableOooO0o0 == null) {
                drawableOooO0o0 = OooO0oO();
            }
            this.f33999OooOOO.onLoadFailed(drawableOooO0o0);
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void clear() {
        synchronized (this.f33990OooO0OO) {
            OooO0OO();
            this.f33989OooO0O0.OooO00o();
            if (this.f34009OooOo0O == 6) {
                return;
            }
            OooO0Oo();
            o00OOOO0<R> o00oooo1 = this.f34003OooOOo;
            if (o00oooo1 != null) {
                this.f34003OooOOo = null;
            } else {
                o00oooo1 = null;
            }
            RequestCoordinator requestCoordinator = this.f33993OooO0o0;
            if (requestCoordinator == null || requestCoordinator.OooO0o0(this)) {
                this.f33999OooOOO.onLoadCleared(OooO0oO());
            }
            this.f34009OooOo0O = 6;
            if (o00oooo1 != null) {
                this.f34007OooOo0.OooO0o(o00oooo1);
            }
        }
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f33990OooO0OO) {
            int i = this.f34009OooOo0O;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @Override // p234o00oOoOO.oOO0O0O0
    public final void pause() {
        synchronized (this.f33990OooO0OO) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
