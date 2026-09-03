package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00000O0;
import androidx.camera.core.impl.o000O0Oo;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00O0O0O;
import androidx.camera.core.impl.o00OOOOo;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.ULong;
import p028Oooo0oO.o00O0OOO;
import p028Oooo0oO.o0O00o0;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0OOO0o;
import p034OoooOO0.o0Oo0oo;
import p037OoooOo0.o00;
import p037OoooOo0.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOOO extends Oooo0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO0OO f3466OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public Executor f3467OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public SessionConfig.OooO0O0 f3468OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o00 f3469OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public o0O00o0 f3470OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public SurfaceRequest f3471OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO0O0 f3465OooOo00 = new OooO0O0();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final o0OOO0o f3464OooOo0 = o00oO0o.OooO0OO();

    public static final class OooO00o implements o00Oo00.OooO00o<OooOOOO, o00O0O0O, OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00O f3472OooO00o;

        public OooO00o() {
            this(oOO00O.Oooo0OO());
        }

        @Override // p028Oooo0oO.o00O000o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00O00O OooO00o() {
            return this.f3472OooO00o;
        }

        @Override // androidx.camera.core.impl.o00Oo00.OooO00o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00Oo00 OooO0O0() {
            return new o00O0O0O(o00O0O00.Oooo0O0(this.f3472OooO00o));
        }

        public OooO00o(oOO00O ooo00o) {
            Object objOooO0O0;
            this.f3472OooO00o = ooo00o;
            Object objOooO0O1 = null;
            try {
                objOooO0O0 = ooo00o.OooO0O0(o0Oo0oo.f1432OooO0OO);
            } catch (IllegalArgumentException unused) {
                objOooO0O0 = null;
            }
            Class cls = (Class) objOooO0O0;
            if (cls != null && !cls.equals(OooOOOO.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.OooO0o oooO0o = o0Oo0oo.f1432OooO0OO;
            oOO00O ooo00o2 = this.f3472OooO00o;
            ooo00o2.Oooo0oO(oooO0o, OooOOOO.class);
            try {
                objOooO0O1 = ooo00o2.OooO0O0(o0Oo0oo.f1431OooO0O0);
            } catch (IllegalArgumentException unused2) {
            }
            if (objOooO0O1 == null) {
                this.f3472OooO00o.Oooo0oO(o0Oo0oo.f1431OooO0O0, OooOOOO.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            ooo00o.Oooo0oO(ImageOutputConfig.f3541OooOOO, 2);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o00O0O0O f3473OooO00o;

        static {
            ResolutionSelector resolutionSelector = new ResolutionSelector(AspectRatioStrategy.f3842OooO00o, ResolutionStrategy.f3846OooO0OO, 0);
            OooO00o oooO00o = new OooO00o();
            androidx.camera.core.impl.OooO0o oooO0o = o00Oo00.f3756OooOoO0;
            oOO00O ooo00o = oooO00o.f3472OooO00o;
            ooo00o.Oooo0oO(oooO0o, 2);
            ooo00o.Oooo0oO(ImageOutputConfig.f3539OooOO0O, 0);
            ooo00o.Oooo0oO(ImageOutputConfig.f3547OooOOoo, resolutionSelector);
            ooo00o.Oooo0oO(o00Oo00.f3760OooOooO, UseCaseConfigFactory.CaptureType.PREVIEW);
            f3473OooO00o = new o00O0O0O(o00O0O00.Oooo0O0(ooo00o));
        }
    }

    public interface OooO0OO {
        void OooO00o(@NonNull SurfaceRequest surfaceRequest);
    }

    @MainThread
    public OooOOOO(@NonNull o00O0O0O o00o0o0o2) {
        super(o00o0o0o2);
        this.f3467OooOOOO = f3464OooOo0;
    }

    @Override // androidx.camera.core.Oooo0
    @IntRange(from = ULong.MIN_VALUE, to = 359)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int OooO(@NonNull CameraInternal cameraInternal, boolean z) {
        if (cameraInternal.OooOOOO()) {
            return super.OooO(cameraInternal, z);
        }
        return 0;
    }

    @Override // androidx.camera.core.Oooo0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooO0o(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        f3465OooOo00.getClass();
        o00O0O0O o00o0o0o2 = OooO0O0.f3473OooO00o;
        o00o0o0o2.getClass();
        Config configOooO00o = useCaseConfigFactory.OooO00o(o00OOOOo.OooO0OO(o00o0o0o2), 1);
        if (z) {
            configOooO00o = o00000O0.OooO00o(configOooO00o, o00o0o0o2);
        }
        if (configOooO00o == null) {
            return null;
        }
        return new o00O0O0O(o00O0O00.Oooo0O0(((OooO00o) OooOO0O(configOooO00o)).f3472OooO00o));
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<Integer> OooOO0() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00.OooO00o<?, ?, ?> OooOO0O(@NonNull Config config) {
        return new OooO00o(oOO00O.Oooo0o0(config));
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.camera.core.impl.OooOo OooOo(@NonNull Config config) {
        this.f3468OooOOOo.f3624OooO0O0.OooO0OO(config);
        OooOooO(this.f3468OooOOOo.OooO0o0());
        androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = this.f3490OooO0oO.OooO0o0();
        oooO00oOooO0o0.f3592OooO0Oo = config;
        return oooO00oOooO0o0.OooO00o();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooOo0(@NonNull androidx.camera.core.impl.o0Oo0oo o0oo0oo2, @NonNull o00Oo00.OooO00o<?, ?, ?> oooO00o) {
        ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O0Oo.f3701OooO, 34);
        return oooO00o.OooO0O0();
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOoO() {
        OooOooo();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final oo0O OooOoO0(@NonNull oo0O oo0o) {
        SessionConfig.OooO0O0 oooO0O0Oooo000 = Oooo000(OooO0o0(), (o00O0O0O) this.f3488OooO0o, oo0o);
        this.f3468OooOOOo = oooO0O0Oooo000;
        OooOooO(oooO0O0Oooo000.OooO0o0());
        return oo0o;
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooOoo0(@NonNull Rect rect) {
        this.f3483OooO = rect;
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        o00 o00Var = this.f3469OooOOo;
        if (cameraInternalOooO0OO == null || o00Var == null) {
            return;
        }
        o00Var.OooO0o(OooO(cameraInternalOooO0OO, OooOOO(cameraInternalOooO0OO)), ((ImageOutputConfig) this.f3488OooO0o).Oooo0());
    }

    public final void OooOooo() {
        o0O00o0 o0o00o1 = this.f3470OooOOo0;
        if (o0o00o1 != null) {
            o0o00o1.OooO00o();
            this.f3470OooOOo0 = null;
        }
        o00 o00Var = this.f3469OooOOo;
        if (o00Var != null) {
            p031OoooO0.o0Oo0oo.OooO00o();
            o00Var.f1465OooOOO0.OooO00o();
            o00oOoo o00oooo2 = o00Var.f1461OooOO0;
            if (o00oooo2 != null) {
                o00oooo2.OooO00o();
                o00Var.f1461OooOO0 = null;
            }
            o00Var.f1466OooOOOO = true;
            this.f3469OooOOo = null;
        }
        this.f3471OooOOoo = null;
    }

    @NonNull
    @MainThread
    public final SessionConfig.OooO0O0 Oooo000(@NonNull final String str, @NonNull final o00O0O0O o00o0o0o2, @NonNull final oo0O oo0o) {
        Rect rect;
        p031OoooO0.o0Oo0oo.OooO00o();
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        Objects.requireNonNull(cameraInternalOooO0OO);
        OooOooo();
        int i = 0;
        o000OO.OooOOO0.OooO0o(null, this.f3469OooOOo == null);
        Matrix matrix = this.f3492OooOO0;
        boolean zOooOOOO = cameraInternalOooO0OO.OooOOOO();
        Size sizeOooO0Oo = oo0o.OooO0Oo();
        Rect rect2 = this.f3483OooO;
        if (rect2 != null) {
            rect = rect2;
        } else if (sizeOooO0Oo != null) {
            rect2 = new Rect(0, 0, sizeOooO0Oo.getWidth(), sizeOooO0Oo.getHeight());
            rect = rect2;
        } else {
            rect = null;
        }
        Objects.requireNonNull(rect);
        o00 o00Var = new o00(1, 34, oo0o, matrix, zOooOOOO, rect, OooO(cameraInternalOooO0OO, OooOOO(cameraInternalOooO0OO)), ((ImageOutputConfig) this.f3488OooO0o).Oooo0(), cameraInternalOooO0OO.OooOOOO() && OooOOO(cameraInternalOooO0OO));
        this.f3469OooOOo = o00Var;
        if (this.f3494OooOO0o != null) {
            throw null;
        }
        o00Var.OooO00o(new Runnable() { // from class: Oooo0oO.o00O0OO
            @Override // java.lang.Runnable
            public final void run() {
                this.f1131OooO0Oo.OooOOo0();
            }
        });
        SurfaceRequest surfaceRequestOooO0OO = this.f3469OooOOo.OooO0OO(cameraInternalOooO0OO);
        this.f3471OooOOoo = surfaceRequestOooO0OO;
        this.f3470OooOOo0 = surfaceRequestOooO0OO.f3511OooOO0O;
        OooO0OO oooO0OO = this.f3466OooOOO;
        if (oooO0OO != null) {
            oooO0OO.getClass();
            SurfaceRequest surfaceRequest = this.f3471OooOOoo;
            surfaceRequest.getClass();
            this.f3467OooOOOO.execute(new o00O0OOO(i, oooO0OO, surfaceRequest));
            CameraInternal cameraInternalOooO0OO2 = OooO0OO();
            o00 o00Var2 = this.f3469OooOOo;
            if (cameraInternalOooO0OO2 != null && o00Var2 != null) {
                o00Var2.OooO0o(OooO(cameraInternalOooO0OO2, OooOOO(cameraInternalOooO0OO2)), ((ImageOutputConfig) this.f3488OooO0o).Oooo0());
            }
        }
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(o00o0o0o2, oo0o.OooO0Oo());
        Range<Integer> rangeOooO0O0 = oo0o.OooO0O0();
        o000000O.OooO00o oooO00o = oooO0O0OooO0o.f3624OooO0O0;
        oooO00o.f3657OooO0Oo = rangeOooO0O0;
        if (oo0o.OooO0OO() != null) {
            oooO00o.OooO0OO(oo0o.OooO0OO());
        }
        if (this.f3466OooOOO != null) {
            oooO0O0OooO0o.OooO0Oo(this.f3470OooOOo0, oo0o.OooO00o());
        }
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO() { // from class: Oooo0oO.oo0oOO0
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                OooOOOO oooOOOO = this.f1198OooO00o;
                String str2 = str;
                if (oooOOOO.OooOO0o(str2)) {
                    oooOOOO.OooOooO(oooOOOO.Oooo000(str2, o00o0o0o2, oo0o).OooO0o0());
                    oooOOOO.OooOOo0();
                }
            }
        });
        return oooO0O0OooO0o;
    }

    @UiThread
    public final void Oooo00O(@Nullable OooO0OO oooO0OO) {
        p031OoooO0.o0Oo0oo.OooO00o();
        if (oooO0OO == null) {
            this.f3466OooOOO = null;
            this.f3486OooO0OO = Oooo0.OooO0OO.INACTIVE;
            OooOOo();
            return;
        }
        this.f3466OooOOO = oooO0OO;
        this.f3467OooOOOO = f3464OooOo0;
        if (OooO0O0() != null) {
            SessionConfig.OooO0O0 oooO0O0Oooo000 = Oooo000(OooO0o0(), (o00O0O0O) this.f3488OooO0o, this.f3490OooO0oO);
            this.f3468OooOOOo = oooO0O0Oooo000;
            OooOooO(oooO0O0Oooo000.OooO0o0());
            OooOOo0();
        }
        OooOOOo();
    }

    @NonNull
    public final String toString() {
        return "Preview:".concat(OooO0oo());
    }
}
