package p028Oooo0oO;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00O0OO;
import androidx.camera.core.impl.o0OOO0o;
import androidx.camera.core.impl.o0ooOOo;
import androidx.camera.core.impl.oOO00O;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p026Oooo0o.OooOOOO;
import p034OoooOO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00oOoo implements o0Oo0oo<o0O0ooO> {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final o00O0O00 f1166OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final OooO0o f1160Oooo000 = Config.OooO00o.OooO00o(o0OOO0o.OooO00o.class, "camerax.core.appConfig.cameraFactoryProvider");

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final OooO0o f1161Oooo00O = Config.OooO00o.OooO00o(o0ooOOo.OooO00o.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final OooO0o f1162Oooo00o = Config.OooO00o.OooO00o(UseCaseConfigFactory.OooO0O0.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO0o f1159Oooo0 = Config.OooO00o.OooO00o(Executor.class, "camerax.core.appConfig.cameraExecutor");

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final OooO0o f1163Oooo0O0 = Config.OooO00o.OooO00o(Handler.class, "camerax.core.appConfig.schedulerHandler");

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final OooO0o f1164Oooo0OO = Config.OooO00o.OooO00o(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final OooO0o f1165Oooo0o0 = Config.OooO00o.OooO00o(CameraSelector.class, "camerax.core.appConfig.availableCamerasLimiter");

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00O f1167OooO00o;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooO00o() {
            Object objOooO0O0;
            oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
            this.f1167OooO00o = ooo00oOooo0OO;
            Object objOooO0O1 = null;
            try {
                objOooO0O0 = ooo00oOooo0OO.OooO0O0(o0Oo0oo.f1432OooO0OO);
            } catch (IllegalArgumentException unused) {
                objOooO0O0 = null;
            }
            Class cls = (Class) objOooO0O0;
            if (cls != null && !cls.equals(o0O0ooO.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            OooO0o oooO0o = o0Oo0oo.f1432OooO0OO;
            oOO00O ooo00o = this.f1167OooO00o;
            ooo00o.Oooo0oO(oooO0o, o0O0ooO.class);
            try {
                objOooO0O1 = ooo00o.OooO0O0(o0Oo0oo.f1431OooO0O0);
            } catch (IllegalArgumentException unused2) {
            }
            if (objOooO0O1 == null) {
                ooo00o.Oooo0oO(o0Oo0oo.f1431OooO0O0, o0O0ooO.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    public interface OooO0O0 {
        @NonNull
        o00oOoo getCameraXConfig();
    }

    public o00oOoo(o00O0O00 o00o0o01) {
        this.f1166OooOooo = o00o0o01;
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0O0(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooO0O0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean OooO0o0(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooO0o0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooO0oO(Config.OooO00o oooO00o, Config.OptionPriority optionPriority) {
        return ((o00O0O00) getConfig()).OooO0oO(oooO00o, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooO0oo() {
        return ((o00O0O00) getConfig()).OooO0oo();
    }

    @Override // p034OoooOO0.o0Oo0oo
    public final /* synthetic */ String OooOO0(String str) {
        throw null;
    }

    @Override // androidx.camera.core.impl.Config
    public final /* synthetic */ void OooOO0o(OooOOOO oooOOOO) {
        o00O0OO.OooO00o(this, oooOOOO);
    }

    @Override // androidx.camera.core.impl.Config
    public final Set OooOOO0(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooOOO0(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final Object OooOoO(Config.OooO00o oooO00o, Object obj) {
        return ((o00O0O00) getConfig()).OooOoO(oooO00o, obj);
    }

    @Override // androidx.camera.core.impl.Config
    public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
        return ((o00O0O00) getConfig()).OooOoo(oooO00o);
    }

    @Override // p034OoooOO0.o0Oo0oo
    public final /* synthetic */ String Oooo00O() {
        throw null;
    }

    @Nullable
    public final CameraSelector Oooo0O0() {
        Object objOooO0O0;
        OooO0o oooO0o = f1165Oooo0o0;
        o00O0O00 o00o0o01 = this.f1166OooOooo;
        o00o0o01.getClass();
        try {
            objOooO0O0 = o00o0o01.OooO0O0(oooO0o);
        } catch (IllegalArgumentException unused) {
            objOooO0O0 = null;
        }
        return (CameraSelector) objOooO0O0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o0OOO0o.OooO00o Oooo0OO() {
        Object objOooO0O0;
        OooO0o oooO0o = f1160Oooo000;
        o00O0O00 o00o0o01 = this.f1166OooOooo;
        o00o0o01.getClass();
        try {
            objOooO0O0 = o00o0o01.OooO0O0(oooO0o);
        } catch (IllegalArgumentException unused) {
            objOooO0O0 = null;
        }
        return (o0OOO0o.OooO00o) objOooO0O0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final UseCaseConfigFactory.OooO0O0 Oooo0o() {
        Object objOooO0O0;
        OooO0o oooO0o = f1162Oooo00o;
        o00O0O00 o00o0o01 = this.f1166OooOooo;
        o00o0o01.getClass();
        try {
            objOooO0O0 = o00o0o01.OooO0O0(oooO0o);
        } catch (IllegalArgumentException unused) {
            objOooO0O0 = null;
        }
        return (UseCaseConfigFactory.OooO0O0) objOooO0O0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o0ooOOo.OooO00o Oooo0o0() {
        Object objOooO0O0;
        OooO0o oooO0o = f1161Oooo00O;
        o00O0O00 o00o0o01 = this.f1166OooOooo;
        o00o0o01.getClass();
        try {
            objOooO0O0 = o00o0o01.OooO0O0(oooO0o);
        } catch (IllegalArgumentException unused) {
            objOooO0O0 = null;
        }
        return (o0ooOOo.OooO00o) objOooO0O0;
    }

    @Override // androidx.camera.core.impl.o00O0OOO
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Config getConfig() {
        return this.f1166OooOooo;
    }
}
