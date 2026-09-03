package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o00000O0;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o000O0Oo;
import androidx.camera.core.impl.o000OO0O;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OO00O;
import androidx.camera.core.impl.o00OOOOo;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import com.google.common.util.concurrent.OooOO0O;
import java.io.File;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o00O0O0;
import p029Oooo0oo.o0O000o0;
import p029Oooo0oo.o0O00O0o;
import p029Oooo0oo.o0O00o00;
import p029Oooo0oo.o0O0O0O;
import p029Oooo0oo.o0OOO0;
import p029Oooo0oo.o0oO0O0o;
import p029Oooo0oo.oo0ooO;
import p031OoooO0.o0OO00O;
import p033OoooO0O.o00oO0o;
import p034OoooOO0.o0Oo0oo;
import p034OoooOO0.oo000o;
import p099o000oOoO.o000O0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImageCapture extends Oooo0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final OooO0OO f3410OooOo0o = new OooO0OO();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f3411OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @GuardedBy("mLockedFlashMode")
    public final AtomicReference<Integer> f3412OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f3413OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Rational f3414OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @GuardedBy("mLockedFlashMode")
    public int f3415OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public SessionConfig.OooO0O0 f3416OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public o0OOO0 f3417OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public o0oO0O0o f3418OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final OooO00o f3419OooOo0O;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CaptureMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface FlashType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ImageCaptureError {
    }

    public static abstract class OooO {
    }

    public class OooO00o implements o0O0O0O {
        public OooO00o() {
        }

        @MainThread
        public final void OooO00o() {
            ImageCapture imageCapture = ImageCapture.this;
            synchronized (imageCapture.f3412OooOOOO) {
                Integer andSet = imageCapture.f3412OooOOOO.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                if (andSet.intValue() != imageCapture.Oooo00O()) {
                    imageCapture.Oooo0o0();
                }
            }
        }
    }

    public static final class OooO0O0 implements o00Oo00.OooO00o<ImageCapture, o000O00O, OooO0O0> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00O f3421OooO00o;

        public OooO0O0() {
            this(oOO00O.Oooo0OO());
        }

        @Override // p028Oooo0oO.o00O000o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00O00O OooO00o() {
            return this.f3421OooO00o;
        }

        @Override // androidx.camera.core.impl.o00Oo00.OooO00o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00Oo00 OooO0O0() {
            return new o000O00O(o00O0O00.Oooo0O0(this.f3421OooO00o));
        }

        @NonNull
        public final ImageCapture OooO0OO() {
            Object objOooO0O0;
            Integer num;
            androidx.camera.core.impl.OooO0o oooO0o = o000O00O.f3692Oooo0;
            oOO00O ooo00o = this.f3421OooO00o;
            ooo00o.getClass();
            Object objOooO0O1 = null;
            try {
                objOooO0O0 = ooo00o.OooO0O0(oooO0o);
            } catch (IllegalArgumentException unused) {
                objOooO0O0 = null;
            }
            Integer num2 = (Integer) objOooO0O0;
            if (num2 != null) {
                ooo00o.Oooo0oO(o000O0Oo.f3701OooO, num2);
            } else {
                ooo00o.Oooo0oO(o000O0Oo.f3701OooO, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            }
            o000O00O o000o00o2 = new o000O00O(o00O0O00.Oooo0O0(ooo00o));
            o000OO0O.OooO0o(o000o00o2);
            ImageCapture imageCapture = new ImageCapture(o000o00o2);
            try {
                objOooO0O1 = ooo00o.OooO0O0(ImageOutputConfig.f3543OooOOOO);
            } catch (IllegalArgumentException unused2) {
            }
            Size size = (Size) objOooO0O1;
            if (size != null) {
                imageCapture.f3414OooOOo = new Rational(size.getWidth(), size.getHeight());
            }
            androidx.camera.core.impl.OooO0o oooO0o2 = oo000o.f1438OooO00o;
            Object objOooO0O2 = o00oO0o.OooO0O0();
            try {
                objOooO0O2 = ooo00o.OooO0O0(oooO0o2);
            } catch (IllegalArgumentException unused3) {
            }
            o000OO.OooOOO0.OooO0o0((Executor) objOooO0O2, "The IO executor can't be null");
            androidx.camera.core.impl.OooO0o oooO0o3 = o000O00O.f3694Oooo00O;
            if (!ooo00o.OooO0o0(oooO0o3) || ((num = (Integer) ooo00o.OooO0O0(oooO0o3)) != null && (num.intValue() == 0 || num.intValue() == 1 || num.intValue() == 2))) {
                return imageCapture;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
        }

        public OooO0O0(oOO00O ooo00o) {
            Object objOooO0O0;
            this.f3421OooO00o = ooo00o;
            Object objOooO0O1 = null;
            try {
                objOooO0O0 = ooo00o.OooO0O0(o0Oo0oo.f1432OooO0OO);
            } catch (IllegalArgumentException unused) {
                objOooO0O0 = null;
            }
            Class cls = (Class) objOooO0O0;
            if (cls != null && !cls.equals(ImageCapture.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.OooO0o oooO0o = o0Oo0oo.f1432OooO0OO;
            oOO00O ooo00o2 = this.f3421OooO00o;
            ooo00o2.Oooo0oO(oooO0o, ImageCapture.class);
            try {
                objOooO0O1 = ooo00o2.OooO0O0(o0Oo0oo.f1431OooO0O0);
            } catch (IllegalArgumentException unused2) {
            }
            if (objOooO0O1 == null) {
                this.f3421OooO00o.Oooo0oO(o0Oo0oo.f1431OooO0O0, ImageCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o000O00O f3422OooO00o;

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
            ResolutionSelector resolutionSelector = new ResolutionSelector(AspectRatioStrategy.f3842OooO00o, ResolutionStrategy.f3846OooO0OO, 0);
            DynamicRange dynamicRange = DynamicRange.f3398OooO0Oo;
            OooO0O0 oooO0O0 = new OooO0O0();
            androidx.camera.core.impl.OooO0o oooO0o = o00Oo00.f3756OooOoO0;
            oOO00O ooo00o = oooO0O0.f3421OooO00o;
            ooo00o.Oooo0oO(oooO0o, 4);
            ooo00o.Oooo0oO(ImageOutputConfig.f3539OooOO0O, 0);
            ooo00o.Oooo0oO(ImageOutputConfig.f3547OooOOoo, resolutionSelector);
            ooo00o.Oooo0oO(o00Oo00.f3760OooOooO, UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
            if (!dynamicRange.equals(dynamicRange)) {
                throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
            }
            ooo00o.Oooo0oO(o000O0Oo.f3702OooOO0, dynamicRange);
            f3422OooO00o = new o000O00O(o00O0O00.Oooo0O0(ooo00o));
        }
    }

    public static final class OooO0o {
        @NonNull
        public final String toString() {
            return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
        }
    }

    public interface OooOO0 {
        void OooO00o(@NonNull ImageCaptureException imageCaptureException);

        void OooO0O0(@NonNull OooOOO0 oooOOO0);
    }

    public static final class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final File f3423OooO00o;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public final OooO0o f3427OooO0o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final ContentResolver f3424OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Uri f3425OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final ContentValues f3426OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final OutputStream f3428OooO0o0 = null;

        public OooOO0O(@Nullable File file, @Nullable OooO0o oooO0o) {
            this.f3423OooO00o = file;
            this.f3427OooO0o = oooO0o == null ? new OooO0o() : oooO0o;
        }

        @NonNull
        public final String toString() {
            return "OutputFileOptions{mFile=" + this.f3423OooO00o + ", mContentResolver=" + this.f3424OooO0O0 + ", mSaveCollection=" + this.f3425OooO0OO + ", mContentValues=" + this.f3426OooO0Oo + ", mOutputStream=" + this.f3428OooO0o0 + ", mMetadata=" + this.f3427OooO0o + "}";
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Uri f3429OooO00o;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OooOOO0(@Nullable Uri uri) {
            this.f3429OooO00o = uri;
        }
    }

    public ImageCapture(@NonNull o000O00O o000o00o2) {
        super(o000o00o2);
        this.f3412OooOOOO = new AtomicReference<>(null);
        this.f3415OooOOo0 = -1;
        this.f3414OooOOo = null;
        this.f3419OooOo0O = new OooO00o();
        o000O00O o000o00o3 = (o000O00O) this.f3488OooO0o;
        androidx.camera.core.impl.OooO0o oooO0o = o000O00O.f3693Oooo000;
        o000o00o3.getClass();
        if (((o00O0O00) o000o00o3.getConfig()).OooO0o0(oooO0o)) {
            this.f3411OooOOO = ((Integer) ((o00O0O00) o000o00o3.getConfig()).OooO0O0(oooO0o)).intValue();
        } else {
            this.f3411OooOOO = 1;
        }
        this.f3413OooOOOo = ((Integer) ((o00O0O00) o000o00o3.getConfig()).OooOoO(o000O00O.f3699Oooo0o0, 0)).intValue();
    }

    public static boolean Oooo00o(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.Oooo0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooO0o(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        f3410OooOo0o.getClass();
        o000O00O o000o00o2 = OooO0OO.f3422OooO00o;
        o000o00o2.getClass();
        Config configOooO00o = useCaseConfigFactory.OooO00o(o00OOOOo.OooO0OO(o000o00o2), this.f3411OooOOO);
        if (z) {
            configOooO00o = o00000O0.OooO00o(configOooO00o, o000o00o2);
        }
        if (configOooO00o == null) {
            return null;
        }
        return new o000O00O(o00O0O00.Oooo0O0(((OooO0O0) OooOO0O(configOooO00o)).f3421OooO00o));
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<Integer> OooOO0() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00.OooO00o<?, ?, ?> OooOO0O(@NonNull Config config) {
        return new OooO0O0(oOO00O.Oooo0o0(config));
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOOoo() {
        o000OO.OooOOO0.OooO0o0(OooO0OO(), "Attached camera cannot be null");
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.camera.core.impl.OooOo OooOo(@NonNull Config config) {
        this.f3416OooOOoo.f3624OooO0O0.OooO0OO(config);
        OooOooO(this.f3416OooOOoo.OooO0o0());
        androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = this.f3490OooO0oO.OooO0o0();
        oooO00oOooO0o0.f3592OooO0Oo = config;
        return oooO00oOooO0o0.OooO00o();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooOo0(@NonNull androidx.camera.core.impl.o0Oo0oo o0oo0oo2, @NonNull o00Oo00.OooO00o<?, ?, ?> oooO00o) {
        boolean z;
        Object objOooO0O0;
        Object objOooO0O1;
        if (o0oo0oo2.OooO0oO().OooO00o(o000O0o.class)) {
            Boolean bool = Boolean.FALSE;
            Object objOooO00o = oooO00o.OooO00o();
            androidx.camera.core.impl.OooO0o oooO0o = o000O00O.f3697Oooo0OO;
            Object objOooO0O2 = Boolean.TRUE;
            o00O0O00 o00o0o01 = (o00O0O00) objOooO00o;
            o00o0o01.getClass();
            try {
                objOooO0O2 = o00o0o01.OooO0O0(oooO0o);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(objOooO0O2)) {
                o00O0O0.OooO0oo("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                o00O0O0.OooO0Oo("ImageCapture", "Requesting software JPEG due to device quirk.");
                ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O00O.f3697Oooo0OO, Boolean.TRUE);
            }
        }
        Object objOooO00o2 = oooO00o.OooO00o();
        Boolean bool2 = Boolean.TRUE;
        androidx.camera.core.impl.OooO0o oooO0o2 = o000O00O.f3697Oooo0OO;
        Object objOooO0O3 = Boolean.FALSE;
        o00O0O00 o00o0o02 = (o00O0O00) objOooO00o2;
        o00o0o02.getClass();
        try {
            objOooO0O3 = o00o0o02.OooO0O0(oooO0o2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean z2 = true;
        Object objOooO0O4 = null;
        if (bool2.equals(objOooO0O3)) {
            if (Oooo0()) {
                o00O0O0.OooO0oo("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            } else {
                z = true;
            }
            try {
                objOooO0O1 = o00o0o02.OooO0O0(o000O00O.f3692Oooo0);
            } catch (IllegalArgumentException unused3) {
                objOooO0O1 = null;
            }
            Integer num = (Integer) objOooO0O1;
            if (num != null && num.intValue() != 256) {
                o00O0O0.OooO0oo("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                o00O0O0.OooO0oo("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((oOO00O) objOooO00o2).Oooo0oO(o000O00O.f3697Oooo0OO, Boolean.FALSE);
            }
        } else {
            z = false;
        }
        Object objOooO00o3 = oooO00o.OooO00o();
        androidx.camera.core.impl.OooO0o oooO0o3 = o000O00O.f3692Oooo0;
        o00O0O00 o00o0o03 = (o00O0O00) objOooO00o3;
        o00o0o03.getClass();
        try {
            objOooO0O0 = o00o0o03.OooO0O0(oooO0o3);
        } catch (IllegalArgumentException unused4) {
            objOooO0O0 = null;
        }
        Integer num2 = (Integer) objOooO0O0;
        if (num2 != null) {
            if (Oooo0() && num2.intValue() != 256) {
                z2 = false;
            }
            o000OO.OooOOO0.OooO0O0(z2, "Cannot set non-JPEG buffer format with Extensions enabled.");
            ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O0Oo.f3701OooO, Integer.valueOf(z ? 35 : num2.intValue()));
        } else if (z) {
            ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O0Oo.f3701OooO, 35);
        } else {
            Object objOooO00o4 = oooO00o.OooO00o();
            androidx.camera.core.impl.OooO0o oooO0o4 = ImageOutputConfig.f3545OooOOo;
            o00O0O00 o00o0o04 = (o00O0O00) objOooO00o4;
            o00o0o04.getClass();
            try {
                objOooO0O4 = o00o0o04.OooO0O0(oooO0o4);
            } catch (IllegalArgumentException unused5) {
            }
            List list = (List) objOooO0O4;
            if (list == null) {
                ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O0Oo.f3701OooO, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            } else if (Oooo00o(PSKKeyManager.MAX_KEY_LENGTH_BYTES, list)) {
                ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O0Oo.f3701OooO, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
            } else if (Oooo00o(35, list)) {
                ((oOO00O) oooO00o.OooO00o()).Oooo0oO(o000O0Oo.f3701OooO, 35);
            }
        }
        return oooO00o.OooO0O0();
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOo00() {
        Oooo0o0();
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public final void OooOo0o() {
        o0OOO0 o0ooo1 = this.f3417OooOo0;
        if (o0ooo1 != null) {
            o0ooo1.OooO0O0();
        }
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOoO() {
        o0OOO0 o0ooo1 = this.f3417OooOo0;
        if (o0ooo1 != null) {
            o0ooo1.OooO0O0();
        }
        OooOooo(false);
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final oo0O OooOoO0(@NonNull oo0O oo0o) {
        SessionConfig.OooO0O0 oooO0O0Oooo000 = Oooo000(OooO0o0(), (o000O00O) this.f3488OooO0o, oo0o);
        this.f3416OooOOoo = oooO0O0Oooo000;
        OooOooO(oooO0O0Oooo000.OooO0o0());
        OooOOOo();
        return oo0o;
    }

    @MainThread
    public final void OooOooo(boolean z) {
        o0OOO0 o0ooo1;
        Log.d("ImageCapture", "clearPipeline");
        p031OoooO0.o0Oo0oo.OooO00o();
        o0oO0O0o o0oo0o0o2 = this.f3418OooOo00;
        if (o0oo0o0o2 != null) {
            p031OoooO0.o0Oo0oo.OooO00o();
            o0O00o00 o0o00o01 = o0oo0o0o2.f1311OooO0OO;
            o0o00o01.getClass();
            p031OoooO0.o0Oo0oo.OooO00o();
            o0O00o00.OooO0O0 oooO0O0 = o0o00o01.f1249OooO0o0;
            Objects.requireNonNull(oooO0O0);
            OooOo00 oooOo00 = o0o00o01.f1247OooO0OO;
            Objects.requireNonNull(oooOo00);
            o000O o000o = oooO0O0.f1253OooO0O0;
            Objects.requireNonNull(o000o);
            o000o.OooO00o();
            o000O o000o2 = oooO0O0.f1253OooO0O0;
            Objects.requireNonNull(o000o2);
            o000o2.OooO0Oo().OooO0oo(new o0O00O0o(oooOo00, 0), o00oO0o.OooO0OO());
            o0oo0o0o2.f1312OooO0Oo.getClass();
            o0oo0o0o2.f1314OooO0o0.getClass();
            this.f3418OooOo00 = null;
        }
        if (z || (o0ooo1 = this.f3417OooOo0) == null) {
            return;
        }
        o0ooo1.OooO0O0();
        this.f3417OooOo0 = null;
    }

    public final boolean Oooo0() {
        return (OooO0OO() == null || ((o00OO00O) ((o00O0O00) ((androidx.camera.core.impl.o00oO0o.OooO00o) OooO0OO().OooO0oO()).getConfig()).OooOoO(CameraConfig.f3524OooO0oo, null)) == null) ? false : true;
    }

    @OptIn(markerClass = {ExperimentalZeroShutterLag.class})
    @MainThread
    public final SessionConfig.OooO0O0 Oooo000(@NonNull final String str, @NonNull final o000O00O o000o00o2, @NonNull final oo0O oo0o) {
        p031OoooO0.o0Oo0oo.OooO00o();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, oo0o));
        Size sizeOooO0Oo = oo0o.OooO0Oo();
        o000OO.OooOOO0.OooO0o(null, this.f3418OooOo00 == null);
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        Objects.requireNonNull(cameraInternalOooO0OO);
        this.f3418OooOo00 = new o0oO0O0o(o000o00o2, sizeOooO0Oo, this.f3494OooOO0o, !cameraInternalOooO0OO.OooOOOO() || Oooo0());
        if (this.f3417OooOo0 == null) {
            this.f3417OooOo0 = new o0OOO0(this.f3419OooOo0O);
        }
        o0OOO0 o0ooo1 = this.f3417OooOo0;
        o0oO0O0o o0oo0o0o2 = this.f3418OooOo00;
        o0ooo1.getClass();
        p031OoooO0.o0Oo0oo.OooO00o();
        o0ooo1.f1293OooO0OO = o0oo0o0o2;
        o0oo0o0o2.getClass();
        p031OoooO0.o0Oo0oo.OooO00o();
        o0O00o00 o0o00o01 = o0oo0o0o2.f1311OooO0OO;
        o0o00o01.getClass();
        p031OoooO0.o0Oo0oo.OooO00o();
        o000OO.OooOOO0.OooO0o("The ImageReader is not initialized.", o0o00o01.f1247OooO0OO != null);
        OooOo00 oooOo00 = o0o00o01.f1247OooO0OO;
        synchronized (oooOo00.f3476OooO00o) {
            oooOo00.f3480OooO0o = o0ooo1;
        }
        o0oO0O0o o0oo0o0o3 = this.f3418OooOo00;
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(o0oo0o0o3.f1309OooO00o, oo0o.OooO0Oo());
        o000O o000o = o0oo0o0o3.f1313OooO0o.f1253OooO0O0;
        Objects.requireNonNull(o000o);
        oooO0O0OooO0o.OooO0O0(o000o, DynamicRange.f3398OooO0Oo);
        if (this.f3411OooOOO == 2) {
            OooO0Oo().OooO0oo(oooO0O0OooO0o);
        }
        if (oo0o.OooO0OO() != null) {
            oooO0O0OooO0o.f3624OooO0O0.OooO0OO(oo0o.OooO0OO());
        }
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO() { // from class: Oooo0oO.o00O00OO
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                ImageCapture imageCapture = this.f1125OooO00o;
                String str2 = str;
                if (!imageCapture.OooOO0o(str2)) {
                    imageCapture.OooOooo(false);
                    return;
                }
                o0OOO0 o0ooo2 = imageCapture.f3417OooOo0;
                o0ooo2.getClass();
                p031OoooO0.o0Oo0oo.OooO00o();
                o0ooo2.f1295OooO0o = true;
                oo0ooO oo0ooo = o0ooo2.f1294OooO0Oo;
                if (oo0ooo != null) {
                    p031OoooO0.o0Oo0oo.OooO00o();
                    if (!oo0ooo.f1322OooO0Oo.isDone()) {
                        ImageCaptureException imageCaptureException = new ImageCaptureException(null, "The request is aborted silently and retried.");
                        p031OoooO0.o0Oo0oo.OooO00o();
                        oo0ooo.f1325OooO0oO = true;
                        OooOO0O<Void> oooOO0O = oo0ooo.f1326OooO0oo;
                        Objects.requireNonNull(oooOO0O);
                        oooOO0O.cancel(true);
                        oo0ooo.f1324OooO0o0.OooO0OO(imageCaptureException);
                        oo0ooo.f1323OooO0o.OooO0O0(null);
                        o0OOO0 o0ooo3 = (o0OOO0) oo0ooo.f1320OooO0O0;
                        o0ooo3.getClass();
                        p031OoooO0.o0Oo0oo.OooO00o();
                        o00O0O0.OooO00o("TakePictureManager", "Add a new request for retrying.");
                        o0ooo3.f1291OooO00o.addFirst(oo0ooo.f1319OooO00o);
                        o0ooo3.OooO0OO();
                    }
                }
                imageCapture.OooOooo(true);
                SessionConfig.OooO0O0 oooO0O0Oooo000 = imageCapture.Oooo000(str2, o000o00o2, oo0o);
                imageCapture.f3416OooOOoo = oooO0O0Oooo000;
                imageCapture.OooOooO(oooO0O0Oooo000.OooO0o0());
                imageCapture.OooOOo0();
                o0OOO0 o0ooo4 = imageCapture.f3417OooOo0;
                o0ooo4.getClass();
                p031OoooO0.o0Oo0oo.OooO00o();
                o0ooo4.f1295OooO0o = false;
                o0ooo4.OooO0OO();
            }
        });
        return oooO0O0OooO0o;
    }

    public final int Oooo00O() {
        int iIntValue;
        synchronized (this.f3412OooOOOO) {
            iIntValue = this.f3415OooOOo0;
            if (iIntValue == -1) {
                o000O00O o000o00o2 = (o000O00O) this.f3488OooO0o;
                o000o00o2.getClass();
                iIntValue = ((Integer) ((o00O0O00) o000o00o2.getConfig()).OooOoO(o000O00O.f3694Oooo00O, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void Oooo0O0(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid flash mode: ", i));
        }
        synchronized (this.f3412OooOOOO) {
            this.f3415OooOOo0 = i;
            Oooo0o0();
        }
    }

    public final void Oooo0OO(@NonNull final OooOO0O oooOO0O, @NonNull final Executor executor, @NonNull final OooOO0 oooOO1) {
        int iIntValue;
        int i;
        int i2;
        int iRound;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oO.oOO00O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1191OooO0Oo.Oooo0OO(oooOO0O, executor, oooOO1);
                }
            });
            return;
        }
        p031OoooO0.o0Oo0oo.OooO00o();
        Log.d("ImageCapture", "takePictureInternal");
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        Rect rect = null;
        if (cameraInternalOooO0OO == null) {
            ImageCaptureException imageCaptureException = new ImageCaptureException(null, "Not bound to a valid Camera [" + this + "]");
            if (oooOO1 == null) {
                throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            oooOO1.OooO00o(imageCaptureException);
            return;
        }
        o0OOO0 o0ooo1 = this.f3417OooOo0;
        Objects.requireNonNull(o0ooo1);
        Rect rect2 = this.f3483OooO;
        Size sizeOooO0O0 = OooO0O0();
        Objects.requireNonNull(sizeOooO0O0);
        if (rect2 == null) {
            Rational rational = this.f3414OooOOo;
            if ((rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true) {
                CameraInternal cameraInternalOooO0OO2 = OooO0OO();
                Objects.requireNonNull(cameraInternalOooO0OO2);
                int iOooO = OooO(cameraInternalOooO0OO2, false);
                Rational rational2 = new Rational(this.f3414OooOOo.getDenominator(), this.f3414OooOOo.getNumerator());
                if (!o0OO00O.OooO0OO(iOooO)) {
                    rational2 = this.f3414OooOOo;
                }
                if ((rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) ? false : true) {
                    int width = sizeOooO0O0.getWidth();
                    int height = sizeOooO0O0.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        iRound = Math.round((f / numerator) * denominator);
                        i = (height - iRound) / 2;
                        i2 = 0;
                    } else {
                        int iRound2 = Math.round((f2 / denominator) * numerator);
                        i = 0;
                        i2 = (width - iRound2) / 2;
                        width = iRound2;
                        iRound = height;
                    }
                    rect = new Rect(i2, i, width + i2, iRound + i);
                } else {
                    o00O0O0.OooO0oo("ImageUtil", "Invalid view ratio.");
                }
                Objects.requireNonNull(rect);
            } else {
                rect = new Rect(0, 0, sizeOooO0O0.getWidth(), sizeOooO0O0.getHeight());
            }
            rect2 = rect;
        }
        Matrix matrix = this.f3492OooOO0;
        int iOooO2 = OooO(cameraInternalOooO0OO, false);
        o000O00O o000o00o2 = (o000O00O) this.f3488OooO0o;
        androidx.camera.core.impl.OooO0o oooO0o = o000O00O.f3698Oooo0o;
        o000o00o2.getClass();
        if (((o00O0O00) o000o00o2.getConfig()).OooO0o0(oooO0o)) {
            iIntValue = ((Integer) ((o00O0O00) o000o00o2.getConfig()).OooO0O0(oooO0o)).intValue();
        } else {
            int i3 = this.f3411OooOOO;
            if (i3 == 0) {
                iIntValue = 100;
            } else {
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException(OooO0OO.OooO00o.OooO00o("CaptureMode ", i3, " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i4 = iIntValue;
        int i5 = this.f3411OooOOO;
        List listUnmodifiableList = Collections.unmodifiableList(this.f3416OooOOoo.f3627OooO0o);
        o000OO.OooOOO0.OooO0O0((oooOO1 == null) == (oooOO0O == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        o000OO.OooOOO0.OooO0O0(true ^ (oooOO1 == null), "One and only one on-disk or in-memory callback should be present.");
        o0O000o0 o0o000o1 = new o0O000o0(executor, oooOO1, oooOO0O, rect2, matrix, iOooO2, i4, i5, listUnmodifiableList);
        p031OoooO0.o0Oo0oo.OooO00o();
        o0ooo1.f1291OooO00o.offer(o0o000o1);
        o0ooo1.OooO0OO();
    }

    public final void Oooo0o0() {
        synchronized (this.f3412OooOOOO) {
            if (this.f3412OooOOOO.get() != null) {
                return;
            }
            OooO0Oo().OooO0Oo(Oooo00O());
        }
    }

    @NonNull
    public final String toString() {
        return "ImageCapture:".concat(OooO0oo());
    }
}
