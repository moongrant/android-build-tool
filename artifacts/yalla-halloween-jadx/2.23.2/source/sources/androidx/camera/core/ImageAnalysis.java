package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageReader;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o00000O0;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O00;
import androidx.camera.core.impl.o000O0Oo;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOOOo;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;
import p028Oooo0oO.o000O00O;
import p028Oooo0oO.o00O0;
import p028Oooo0oO.o00O00;
import p033OoooO0O.o00oO0o;
import p034OoooOO0.o0OO00O;
import p034OoooOO0.o0Oo0oo;
import p036OoooOOo.o0000oo;
import p099o000oOoO.o000O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImageAnalysis extends Oooo0 {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO0O0 f3405OooOOOo = new OooO0O0();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public SessionConfig.OooO0O0 f3406OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o000O f3407OooOOOO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface BackpressureStrategy {
    }

    public static final class OooO00o implements o00Oo00.OooO00o<ImageAnalysis, o000O00, OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00O f3408OooO00o;

        public OooO00o(oOO00O ooo00o) {
            Object objOooO0O0;
            this.f3408OooO00o = ooo00o;
            Object objOooO0O1 = null;
            try {
                objOooO0O0 = ooo00o.OooO0O0(o0Oo0oo.f1432OooO0OO);
            } catch (IllegalArgumentException unused) {
                objOooO0O0 = null;
            }
            Class cls = (Class) objOooO0O0;
            if (cls != null && !cls.equals(ImageAnalysis.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.OooO0o oooO0o = o0Oo0oo.f1432OooO0OO;
            oOO00O ooo00o2 = this.f3408OooO00o;
            ooo00o2.Oooo0oO(oooO0o, ImageAnalysis.class);
            try {
                objOooO0O1 = ooo00o2.OooO0O0(o0Oo0oo.f1431OooO0O0);
            } catch (IllegalArgumentException unused2) {
            }
            if (objOooO0O1 == null) {
                ooo00o2.Oooo0oO(o0Oo0oo.f1431OooO0O0, ImageAnalysis.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // p028Oooo0oO.o00O000o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00O00O OooO00o() {
            return this.f3408OooO00o;
        }

        @Override // androidx.camera.core.impl.o00Oo00.OooO00o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00Oo00 OooO0O0() {
            return new o000O00(o00O0O00.Oooo0O0(this.f3408OooO00o));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000O00 f3409OooO00o;

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        static {
            Size size = new Size(640, 480);
            DynamicRange dynamicRange = DynamicRange.f3398OooO0Oo;
            ResolutionSelector resolutionSelector = new ResolutionSelector(AspectRatioStrategy.f3842OooO00o, new ResolutionStrategy(o0000oo.f1447OooO0OO), 0);
            oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
            new OooO00o(ooo00oOooo0OO);
            ooo00oOooo0OO.Oooo0oO(ImageOutputConfig.f3544OooOOOo, size);
            ooo00oOooo0OO.Oooo0oO(o00Oo00.f3756OooOoO0, 1);
            ooo00oOooo0OO.Oooo0oO(ImageOutputConfig.f3539OooOO0O, 0);
            ooo00oOooo0OO.Oooo0oO(ImageOutputConfig.f3547OooOOoo, resolutionSelector);
            ooo00oOooo0OO.Oooo0oO(o00Oo00.f3760OooOooO, UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            if (!dynamicRange.equals(dynamicRange)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            ooo00oOooo0OO.Oooo0oO(o000O0Oo.f3702OooOO0, dynamicRange);
            f3409OooO00o = new o000O00(o00O0O00.Oooo0O0(ooo00oOooo0OO));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OutputImageFormat {
    }

    @Override // androidx.camera.core.Oooo0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooO0o(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        f3405OooOOOo.getClass();
        o000O00 o000o01 = OooO0O0.f3409OooO00o;
        o000o01.getClass();
        Config configOooO00o = useCaseConfigFactory.OooO00o(o00OOOOo.OooO0OO(o000o01), 1);
        if (z) {
            configOooO00o = o00000O0.OooO00o(configOooO00o, o000o01);
        }
        if (configOooO00o == null) {
            return null;
        }
        return new o000O00(o00O0O00.Oooo0O0(((OooO00o) OooOO0O(configOooO00o)).f3408OooO00o));
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00.OooO00o<?, ?, ?> OooOO0O(@NonNull Config config) {
        return new OooO00o(oOO00O.Oooo0o0(config));
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOOoo() {
        throw null;
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.camera.core.impl.OooOo OooOo(@NonNull Config config) {
        this.f3406OooOOO.f3624OooO0O0.OooO0OO(config);
        OooOooO(this.f3406OooOOO.OooO0o0());
        androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = this.f3490OooO0oO.OooO0o0();
        oooO00oOooO0o0.f3592OooO0Oo = config;
        return oooO00oOooO0o0.OooO00o();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooOo0(@NonNull androidx.camera.core.impl.o0Oo0oo o0oo0oo2, @NonNull o00Oo00.OooO00o<?, ?, ?> oooO00o) {
        o000O00 o000o01 = (o000O00) this.f3488OooO0o;
        o000o01.getClass();
        Boolean bool = (Boolean) ((o00O0O00) o000o01.getConfig()).OooOoO(o000O00.f3687Oooo0O0, null);
        o0oo0oo2.OooO0oO().OooO00o(o000O000.class);
        if (bool == null) {
            throw null;
        }
        bool.booleanValue();
        throw null;
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOoO() {
        p031OoooO0.o0Oo0oo.OooO00o();
        o000O o000o = this.f3407OooOOOO;
        if (o000o == null) {
            throw null;
        }
        o000o.OooO00o();
        this.f3407OooOOOO = null;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x018e  */
    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final oo0O OooOoO0(@NonNull final oo0O oo0o) {
        p033OoooO0O.o0Oo0oo o0oo0oo2;
        int iIntValue;
        OooOo00 oooOo00;
        boolean z;
        boolean z2;
        final o000O00 o000o01 = (o000O00) this.f3488OooO0o;
        final String strOooO0o0 = OooO0o0();
        p031OoooO0.o0Oo0oo.OooO00o();
        Size sizeOooO0Oo = oo0o.OooO0Oo();
        if (p033OoooO0O.o0Oo0oo.f1412OooO0o0 != null) {
            o0oo0oo2 = p033OoooO0O.o0Oo0oo.f1412OooO0o0;
        } else {
            synchronized (p033OoooO0O.o0Oo0oo.class) {
                if (p033OoooO0O.o0Oo0oo.f1412OooO0o0 == null) {
                    p033OoooO0O.o0Oo0oo.f1412OooO0o0 = new p033OoooO0O.o0Oo0oo();
                }
            }
            o0oo0oo2 = p033OoooO0O.o0Oo0oo.f1412OooO0o0;
        }
        o000o01.getClass();
        Executor executor = (Executor) o000o01.OooOoO(o0OO00O.f1430OooO0Oo, o0oo0oo2);
        executor.getClass();
        o000O00 o000o02 = (o000O00) this.f3488OooO0o;
        o000o02.getClass();
        boolean z3 = true;
        if (((Integer) ((o00O0O00) o000o02.getConfig()).OooOoO(o000O00.f3684Oooo000, 0)).intValue() == 1) {
            o000O00 o000o03 = (o000O00) this.f3488OooO0o;
            o000o03.getClass();
            iIntValue = ((Integer) ((o00O0O00) o000o03.getConfig()).OooOoO(o000O00.f3685Oooo00O, 6)).intValue();
        } else {
            iIntValue = 4;
        }
        o00O0O00 o00o0o01 = (o00O0O00) o000o01.getConfig();
        androidx.camera.core.impl.OooO0o oooO0o = o000O00.f3686Oooo00o;
        if (((o00O0) o00o0o01.OooOoO(oooO0o, null)) != null) {
            o00O0 o00o1 = (o00O0) ((o00O0O00) o000o01.getConfig()).OooOoO(oooO0o, null);
            sizeOooO0Oo.getWidth();
            sizeOooO0Oo.getHeight();
            OooO0oO();
            oooOo00 = new OooOo00(o00o1.newInstance());
        } else {
            oooOo00 = new OooOo00(new o000O00O(ImageReader.newInstance(sizeOooO0Oo.getWidth(), sizeOooO0Oo.getHeight(), OooO0oO(), iIntValue)));
        }
        if (OooO0OO() != null) {
            CameraInternal cameraInternalOooO0OO = OooO0OO();
            o000O00 o000o04 = (o000O00) this.f3488OooO0o;
            Boolean bool = Boolean.FALSE;
            o000o04.getClass();
            if (!((Boolean) ((o00O0O00) o000o04.getConfig()).OooOoO(o000O00.f3688Oooo0OO, bool)).booleanValue() || OooO(cameraInternalOooO0OO, false) % 180 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        int height = z ? sizeOooO0Oo.getHeight() : sizeOooO0Oo.getWidth();
        int width = z ? sizeOooO0Oo.getWidth() : sizeOooO0Oo.getHeight();
        o000O00 o000o05 = (o000O00) this.f3488OooO0o;
        o000o05.getClass();
        androidx.camera.core.impl.OooO0o oooO0o2 = o000O00.f3683Oooo0;
        int i = ((Integer) ((o00O0O00) o000o05.getConfig()).OooOoO(oooO0o2, 1)).intValue() == 2 ? 1 : 35;
        if (OooO0oO() == 35) {
            o000O00 o000o06 = (o000O00) this.f3488OooO0o;
            o000o06.getClass();
            if (((Integer) ((o00O0O00) o000o06.getConfig()).OooOoO(oooO0o2, 1)).intValue() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (OooO0oO() != 35) {
            z3 = false;
        } else if (OooO0OO() == null || OooO(OooO0OO(), false) == 0) {
            Boolean bool2 = Boolean.TRUE;
            o000O00 o000o07 = (o000O00) this.f3488OooO0o;
            o000o07.getClass();
            if (!bool2.equals((Boolean) ((o00O0O00) o000o07.getConfig()).OooOoO(o000O00.f3687Oooo0O0, null))) {
                z3 = false;
            }
        }
        OooOo00 oooOo01 = (z2 || z3) ? new OooOo00(new o000O00O(ImageReader.newInstance(height, width, i, oooOo00.OooO0o0()))) : null;
        if (oooOo01 != null) {
            throw null;
        }
        CameraInternal cameraInternalOooO0OO2 = OooO0OO();
        if (cameraInternalOooO0OO2 != null) {
            OooO(cameraInternalOooO0OO2, false);
            throw null;
        }
        oooOo00.OooO0o(null, executor);
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(o000o01, oo0o.OooO0Oo());
        if (oo0o.OooO0OO() != null) {
            oooO0O0OooO0o.f3624OooO0O0.OooO0OO(oo0o.OooO0OO());
        }
        o000O o000o = this.f3407OooOOOO;
        if (o000o != null) {
            o000o.OooO00o();
        }
        o000O o000o2 = new o000O(oooOo00.getSurface(), sizeOooO0Oo, OooO0oO());
        this.f3407OooOOOO = o000o2;
        o000o2.OooO0Oo().OooO0oo(new o00O00(0, oooOo00, oooOo01), o00oO0o.OooO0OO());
        oooO0O0OooO0o.f3624OooO0O0.f3657OooO0Oo = oo0o.OooO0O0();
        oooO0O0OooO0o.OooO0Oo(this.f3407OooOOOO, oo0o.OooO00o());
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO(strOooO0o0, o000o01, oo0o) { // from class: Oooo0oO.o00O00O
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                ImageAnalysis imageAnalysis = this.f1124OooO00o;
                imageAnalysis.getClass();
                p031OoooO0.o0Oo0oo.OooO00o();
                o000O o000o3 = imageAnalysis.f3407OooOOOO;
                if (o000o3 == null) {
                    throw null;
                }
                o000o3.OooO00o();
                imageAnalysis.f3407OooOOOO = null;
                throw null;
            }
        });
        this.f3406OooOOO = oooO0O0OooO0o;
        OooOooO(oooO0O0OooO0o.OooO0o0());
        return oo0o;
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOoOO(@NonNull Matrix matrix) {
        super.OooOoOO(matrix);
        throw null;
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOoo0(@NonNull Rect rect) {
        this.f3483OooO = rect;
        throw null;
    }

    @NonNull
    public final String toString() {
        return "ImageAnalysis:".concat(OooO0oo());
    }
}
