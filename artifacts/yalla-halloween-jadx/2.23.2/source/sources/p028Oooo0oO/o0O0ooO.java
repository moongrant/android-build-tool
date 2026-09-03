package p028Oooo0oO;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o0OO00O;
import androidx.camera.core.impl.o0OOO0o;
import androidx.camera.core.impl.o0ooOOo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import o000OO.OooOOO0;
import p030OoooO.OooOo;
import p031OoooO0.o000oOoO;
import p063o0000oO.oo000o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@MainThread
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object f1169OooOO0o = new Object();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("MIN_LOG_LEVEL_LOCK")
    public static final SparseArray<Integer> f1170OooOOO0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Context f1171OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00oOoo f1174OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f1175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0OOO0o f1176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Handler f1177OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0ooOOo f1178OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public UseCaseConfigFactory f1179OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000Oo0.OooO0o f1180OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O f1172OooO00o = new o0OO00O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f1173OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mInitializeLock")
    public OooO00o f1181OooOO0O = OooO00o.UNINITIALIZED;

    public enum OooO00o {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0O0ooO(@NonNull Context context) {
        o00oOoo.OooO0O0 oooO0O0;
        Object objOooO0O0;
        Object objOooO0O1;
        OooOo.OooO0Oo(null);
        ComponentCallbacks2 componentCallbacks2OooO0O0 = o000oOoO.OooO0O0(context);
        if (componentCallbacks2OooO0O0 instanceof o00oOoo.OooO0O0) {
            oooO0O0 = (o00oOoo.OooO0O0) componentCallbacks2OooO0O0;
        } else {
            try {
                Context contextOooO00o = o000oOoO.OooO00o(context);
                Bundle bundle = contextOooO00o.getPackageManager().getServiceInfo(new ComponentName(contextOooO00o, (Class<?>) MetadataHolderService.class), 640).metaData;
                String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
                if (string == null) {
                    o00O0O0.OooO0O0("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                    oooO0O0 = null;
                } else {
                    oooO0O0 = (o00oOoo.OooO0O0) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                o00O0O0.OooO0OO("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
        }
        if (oooO0O0 == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        o00oOoo cameraXConfig = oooO0O0.getCameraXConfig();
        this.f1174OooO0OO = cameraXConfig;
        OooO0o oooO0o = o00oOoo.f1159Oooo0;
        o00O0O00 o00o0o01 = cameraXConfig.f1166OooOooo;
        o00o0o01.getClass();
        try {
            objOooO0O0 = o00o0o01.OooO0O0(oooO0o);
        } catch (IllegalArgumentException unused) {
            objOooO0O0 = null;
        }
        Executor executor = (Executor) objOooO0O0;
        o00oOoo o00oooo2 = this.f1174OooO0OO;
        OooO0o oooO0o2 = o00oOoo.f1163Oooo0O0;
        o00O0O00 o00o0o02 = o00oooo2.f1166OooOooo;
        o00o0o02.getClass();
        try {
            objOooO0O1 = o00o0o02.OooO0O0(oooO0o2);
        } catch (IllegalArgumentException unused2) {
            objOooO0O1 = null;
        }
        Handler handler = (Handler) objOooO0O1;
        this.f1175OooO0Oo = executor == null ? new o000O0O0() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            handlerThread.start();
            this.f1177OooO0o0 = oo000o.OooO00o(handlerThread.getLooper());
        } else {
            this.f1177OooO0o0 = handler;
        }
        o00oOoo o00oooo3 = this.f1174OooO0OO;
        OooO0o oooO0o3 = o00oOoo.f1164Oooo0OO;
        o00oooo3.getClass();
        Integer num = (Integer) ((o00O0O00) o00oooo3.getConfig()).OooOoO(oooO0o3, null);
        synchronized (f1169OooOO0o) {
            try {
                if (num != null) {
                    OooOOO0.OooO0OO(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray<Integer> sparseArray = f1170OooOOO0;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                    if (sparseArray.size() == 0 || sparseArray.get(3) != null) {
                        o00O0O0.f1129OooO00o = 3;
                    } else if (sparseArray.get(4) != null) {
                        o00O0O0.f1129OooO00o = 4;
                    } else if (sparseArray.get(5) != null) {
                        o00O0O0.f1129OooO00o = 5;
                    } else if (sparseArray.get(6) != null) {
                        o00O0O0.f1129OooO00o = 6;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1180OooOO0 = OooO0O0(context);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o0OOO0o OooO00o() {
        o0OOO0o o0ooo0o2 = this.f1176OooO0o;
        if (o0ooo0o2 != null) {
            return o0ooo0o2;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public final o000Oo0.OooO0o OooO0O0(@NonNull final Context context) {
        o000Oo0.OooO0o oooO0oOooO00o;
        synchronized (this.f1173OooO0O0) {
            OooOOO0.OooO0o("CameraX.initInternal() should only be called once per instance", this.f1181OooOO0O == OooO00o.UNINITIALIZED);
            this.f1181OooOO0O = OooO00o.INITIALIZING;
            oooO0oOooO00o = o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: Oooo0oO.o000OO00
                @Override // o0ooOO0.o000Oo0.OooO0OO
                public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
                    Context context2 = context;
                    o0O0ooO o0o0ooo = this;
                    Executor executor = o0o0ooo.f1175OooO0Oo;
                    executor.execute(new o000OOo0(o0o0ooo, context2, executor, oooO00o, SystemClock.elapsedRealtime()));
                    return "CameraX initInternal";
                }
            });
        }
        return oooO0oOooO00o;
    }

    public final void OooO0OO() {
        synchronized (this.f1173OooO0O0) {
            this.f1181OooOO0O = OooO00o.INITIALIZED;
        }
    }
}
