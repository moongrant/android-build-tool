package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o00000O0;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.ULong;
import p031OoooO0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Rect f3483OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00Oo00<?> f3487OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public o00Oo00<?> f3488OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o00Oo00<?> f3489OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public oo0O f3490OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o00Oo00<?> f3491OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mCameraLock")
    public CameraInternal f3493OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public CameraEffect f3494OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashSet f3484OooO00o = new HashSet();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f3485OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0OO f3486OooO0OO = OooO0OO.INACTIVE;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public Matrix f3492OooOO0 = new Matrix();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public SessionConfig f3495OooOOO0 = SessionConfig.OooO00o();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f3496OooO00o;

        static {
            int[] iArr = new int[OooO0OO.values().length];
            f3496OooO00o = iArr;
            try {
                iArr[OooO0OO.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3496OooO00o[OooO0OO.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO0O0 {
        void OooO00o();

        void onBind();
    }

    public enum OooO0OO {
        ACTIVE,
        INACTIVE
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OooO0o {
        void OooO0Oo(@NonNull Oooo0 oooo0);

        void OooO0o0(@NonNull androidx.camera.video.OooOOOO oooOOOO);

        void OooOO0O(@NonNull Oooo0 oooo0);

        void OooOOOo(@NonNull Oooo0 oooo0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Oooo0(@NonNull o00Oo00<?> o00oo00) {
        this.f3489OooO0o0 = o00oo00;
        this.f3488OooO0o = o00oo00;
    }

    @IntRange(from = ULong.MIN_VALUE, to = 359)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int OooO(@NonNull CameraInternal cameraInternal, boolean z) {
        int iOooOOO = cameraInternal.OooO().OooOOO(((ImageOutputConfig) this.f3488OooO0o).OooOOO());
        if (!(!cameraInternal.OooOOOO() && z)) {
            return iOooOOO;
        }
        RectF rectF = o0OO00O.f1384OooO00o;
        return (((-iOooOOO) % 360) + 360) % 360;
    }

    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(@NonNull CameraInternal cameraInternal, @Nullable o00Oo00<?> o00oo00, @Nullable o00Oo00<?> o00oo01) {
        synchronized (this.f3485OooO0O0) {
            this.f3493OooOO0O = cameraInternal;
            this.f3484OooO00o.add(cameraInternal);
        }
        this.f3487OooO0Oo = o00oo00;
        this.f3491OooO0oo = o00oo01;
        o00Oo00<?> o00oo00OooOOOO = OooOOOO(cameraInternal.OooO(), this.f3487OooO0Oo, this.f3491OooO0oo);
        this.f3488OooO0o = o00oo00OooOOOO;
        OooO0O0 oooO0O0OooOo00 = o00oo00OooOOOO.OooOo00();
        if (oooO0O0OooOo00 != null) {
            cameraInternal.OooO();
            oooO0O0OooOo00.onBind();
        }
        OooOOoo();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Size OooO0O0() {
        oo0O oo0o = this.f3490OooO0oO;
        if (oo0o != null) {
            return oo0o.OooO0Oo();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final CameraInternal OooO0OO() {
        CameraInternal cameraInternal;
        synchronized (this.f3485OooO0O0) {
            cameraInternal = this.f3493OooOO0O;
        }
        return cameraInternal;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final CameraControlInternal OooO0Oo() {
        synchronized (this.f3485OooO0O0) {
            CameraInternal cameraInternal = this.f3493OooOO0O;
            if (cameraInternal == null) {
                return CameraControlInternal.f3525OooO00o;
            }
            return cameraInternal.OooO0o();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract o00Oo00<?> OooO0o(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory);

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String OooO0o0() {
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        o000OO.OooOOO0.OooO0o0(cameraInternalOooO0OO, "No camera attached to use case: " + this);
        return cameraInternalOooO0OO.OooO().OooO0Oo();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int OooO0oO() {
        return this.f3488OooO0o.OooO0o();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String OooO0oo() {
        String strOooOO0 = this.f3488OooO0o.OooOO0("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strOooOO0);
        return strOooOO0;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Set<Integer> OooOO0() {
        return Collections.emptySet();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract o00Oo00.OooO00o<?, ?, ?> OooOO0O(@NonNull Config config);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooOO0o(@NonNull String str) {
        if (OooO0OO() == null) {
            return false;
        }
        return Objects.equals(str, OooO0o0());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooOOO(@NonNull CameraInternal cameraInternal) {
        int iOooOo0O = ((ImageOutputConfig) this.f3488OooO0o).OooOo0O();
        if (iOooOo0O == 0) {
            return false;
        }
        if (iOooOo0O == 1) {
            return true;
        }
        if (iOooOo0O == 2) {
            return cameraInternal.OooOO0();
        }
        throw new AssertionError(android.support.v4.media.OooO00o.OooO00o("Unknown mirrorMode: ", iOooOo0O));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooOOO0(int i) {
        boolean z;
        Iterator<Integer> it = OooOO0().iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            int iIntValue = it.next().intValue();
            if ((i & iIntValue) == iIntValue) {
                z = true;
            }
        } while (!z);
        return true;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooOOOO(@NonNull o0Oo0oo o0oo0oo2, @Nullable o00Oo00<?> o00oo00, @Nullable o00Oo00<?> o00oo01) {
        oOO00O ooo00oOooo0OO;
        if (o00oo01 != null) {
            ooo00oOooo0OO = oOO00O.Oooo0o0(o00oo01);
            ooo00oOooo0OO.f3723OooOooo.remove(p034OoooOO0.o0Oo0oo.f1431OooO0O0);
        } else {
            ooo00oOooo0OO = oOO00O.Oooo0OO();
        }
        androidx.camera.core.impl.OooO0o oooO0o = ImageOutputConfig.f3539OooOO0O;
        o00Oo00<?> o00oo02 = this.f3489OooO0o0;
        if (o00oo02.OooO0o0(oooO0o) || o00oo02.OooO0o0(ImageOutputConfig.f3543OooOOOO)) {
            androidx.camera.core.impl.OooO0o oooO0o2 = ImageOutputConfig.f3547OooOOoo;
            if (ooo00oOooo0OO.OooO0o0(oooO0o2)) {
                ooo00oOooo0OO.f3723OooOooo.remove(oooO0o2);
            }
        }
        androidx.camera.core.impl.OooO0o oooO0o3 = ImageOutputConfig.f3547OooOOoo;
        if (o00oo02.OooO0o0(oooO0o3)) {
            androidx.camera.core.impl.OooO0o oooO0o4 = ImageOutputConfig.f3546OooOOo0;
            if (ooo00oOooo0OO.OooO0o0(oooO0o4) && ((ResolutionSelector) o00oo02.OooO0O0(oooO0o3)).f3844OooO0O0 != null) {
                ooo00oOooo0OO.f3723OooOooo.remove(oooO0o4);
            }
        }
        Iterator<Config.OooO00o<?>> it = o00oo02.OooO0oo().iterator();
        while (it.hasNext()) {
            o00000O0.OooO0O0(ooo00oOooo0OO, ooo00oOooo0OO, o00oo02, it.next());
        }
        if (o00oo00 != null) {
            for (Config.OooO00o<?> oooO00o : o00oo00.OooO0oo()) {
                if (!oooO00o.OooO0O0().equals(p034OoooOO0.o0Oo0oo.f1431OooO0O0.f3564OooO00o)) {
                    o00000O0.OooO0O0(ooo00oOooo0OO, ooo00oOooo0OO, o00oo00, oooO00o);
                }
            }
        }
        if (ooo00oOooo0OO.OooO0o0(ImageOutputConfig.f3543OooOOOO)) {
            androidx.camera.core.impl.OooO0o oooO0o5 = ImageOutputConfig.f3539OooOO0O;
            if (ooo00oOooo0OO.OooO0o0(oooO0o5)) {
                ooo00oOooo0OO.f3723OooOooo.remove(oooO0o5);
            }
        }
        androidx.camera.core.impl.OooO0o oooO0o6 = ImageOutputConfig.f3547OooOOoo;
        if (ooo00oOooo0OO.OooO0o0(oooO0o6) && ((ResolutionSelector) ooo00oOooo0OO.OooO0O0(oooO0o6)).f3845OooO0OO != 0) {
            ooo00oOooo0OO.Oooo0oO(o00Oo00.f3759OooOoo0, Boolean.TRUE);
        }
        return OooOo0(o0oo0oo2, OooOO0O(ooo00oOooo0OO));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOOOo() {
        this.f3486OooO0OO = OooO0OO.ACTIVE;
        OooOOo();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOOo() {
        int i = OooO00o.f3496OooO00o[this.f3486OooO0OO.ordinal()];
        HashSet hashSet = this.f3484OooO00o;
        if (i == 1) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((OooO0o) it.next()).OooOOOo(this);
            }
        } else {
            if (i != 2) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((OooO0o) it2.next()).OooO0Oo(this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOOo0() {
        Iterator it = this.f3484OooO00o.iterator();
        while (it.hasNext()) {
            ((OooO0o) it.next()).OooOO0O(this);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOOoo() {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.camera.core.impl.OooOo OooOo(@NonNull Config config) {
        oo0O oo0o = this.f3490OooO0oO;
        if (oo0o == null) {
            throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
        }
        androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = oo0o.OooO0o0();
        oooO00oOooO0o0.f3592OooO0Oo = config;
        return oooO00oOooO0o0.OooO00o();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o00Oo00<?> OooOo0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o00Oo00.OooO00o<?, ?, ?> oooO00o) {
        return oooO00o.OooO0O0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOo00() {
    }

    @CallSuper
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOo0O() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOo0o() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOoO() {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public oo0O OooOoO0(@NonNull oo0O oo0o) {
        return oo0o;
    }

    @CallSuper
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOoOO(@NonNull Matrix matrix) {
        this.f3492OooOO0 = new Matrix(matrix);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooOoo(@NonNull CameraInternal cameraInternal) {
        OooOoO();
        OooO0O0 oooO0O0OooOo00 = this.f3488OooO0o.OooOo00();
        if (oooO0O0OooOo00 != null) {
            oooO0O0OooOo00.OooO00o();
        }
        synchronized (this.f3485OooO0O0) {
            o000OO.OooOOO0.OooO00o(cameraInternal == this.f3493OooOO0O);
            this.f3484OooO00o.remove(this.f3493OooOO0O);
            this.f3493OooOO0O = null;
        }
        this.f3490OooO0oO = null;
        this.f3483OooO = null;
        this.f3488OooO0o = this.f3489OooO0o0;
        this.f3487OooO0Oo = null;
        this.f3491OooO0oo = null;
    }

    @CallSuper
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOoo0(@NonNull Rect rect) {
        this.f3483OooO = rect;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOooO(@NonNull SessionConfig sessionConfig) {
        this.f3495OooOOO0 = sessionConfig;
        for (DeferrableSurface deferrableSurface : sessionConfig.OooO0O0()) {
            if (deferrableSurface.f3537OooO0oo == null) {
                deferrableSurface.f3537OooO0oo = getClass();
            }
        }
    }
}
