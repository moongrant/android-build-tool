package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.o000000;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o00OO0O0;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p028Oooo0oO.o00OO;
import p028Oooo0oO.o00OOO0;
import p028Oooo0oO.o00OOO00;
import p028Oooo0oO.o00OOOOo;
import p028Oooo0oO.o00Oo00;
import p028Oooo0oO.o0o0Oo;
import p028Oooo0oO.o0oOO;
import p028Oooo0oO.oo00oO;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p037OoooOo0.o000OO0O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SurfaceRequest {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Range<Integer> f3502OooOOOO = o00OO0O0.f3743OooO00o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final o00O000.OooO00o<Void> f3503OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3504OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Size f3505OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final DynamicRange f3506OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Range<Integer> f3507OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O000.OooO0o f3508OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CameraInternal f3509OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O000.OooO00o<Surface> f3510OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00O000.OooO0o f3511OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00O000.OooO00o<Void> f3512OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0oOO f3513OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO0OO f3514OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public Executor f3515OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO0o f3516OooOOO0;

    public class OooO00o implements p030OoooO.OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f3517OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Surface f3518OooO0O0;

        public OooO00o(o000OO.OooO00o oooO00o, Surface surface) {
            this.f3517OooO00o = oooO00o;
            this.f3518OooO0O0 = surface;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o000OO.OooOOO0.OooO0o("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof OooO0O0);
            this.f3517OooO00o.accept(new OooO(1, this.f3518OooO0O0));
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r3) {
            this.f3517OooO00o.accept(new OooO(0, this.f3518OooO0O0));
        }
    }

    public static final class OooO0O0 extends RuntimeException {
    }

    @AutoValue
    public static abstract class OooO0OO {
        @NonNull
        public abstract Rect OooO00o();

        public abstract int OooO0O0();

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract Matrix OooO0OO();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract int OooO0Oo();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract boolean OooO0o0();
    }

    public interface OooO0o {
        void OooO00o(@NonNull OooO0OO oooO0OO);
    }

    @AutoValue
    public static abstract class Result {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface ResultCode {
        }

        public abstract int OooO00o();

        @NonNull
        public abstract Surface OooO0O0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceRequest(@NonNull Size size, @NonNull CameraInternal cameraInternal, @NonNull DynamicRange dynamicRange, @NonNull Range range, @NonNull o000OO0O o000oo0o2) {
        this.f3505OooO0O0 = size;
        this.f3509OooO0o0 = cameraInternal;
        this.f3506OooO0OO = dynamicRange;
        this.f3507OooO0Oo = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        o00O000.OooO0o oooO0oOooO00o = o00O000.OooO00o(new o00OO(atomicReference, str));
        o00O000.OooO00o<Void> oooO00o = (o00O000.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f3512OooOO0 = oooO00o;
        AtomicReference atomicReference2 = new AtomicReference(null);
        o00O000.OooO0o oooO0oOooO00o2 = o00O000.OooO00o(new o00OOO00(atomicReference2, str));
        this.f3511OooO0oo = oooO0oOooO00o2;
        oooO0oOooO00o2.OooO(new OoooO.OooOo00.OooO0O0(oooO0oOooO00o2, new OooOo(oooO00o, oooO0oOooO00o)), o00oO0o.OooO00o());
        o00O000.OooO00o oooO00o2 = (o00O000.OooO00o) atomicReference2.get();
        oooO00o2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        o00O000.OooO0o oooO0oOooO00o3 = o00O000.OooO00o(new o00OOO0(atomicReference3, str));
        this.f3508OooO0o = oooO0oOooO00o3;
        o00O000.OooO00o<Surface> oooO00o3 = (o00O000.OooO00o) atomicReference3.get();
        oooO00o3.getClass();
        this.f3510OooO0oO = oooO00o3;
        o0oOO o0ooo2 = new o0oOO(this, size);
        this.f3513OooOO0O = o0ooo2;
        com.google.common.util.concurrent.OooO00o<Void> oooO00oOooO0Oo = o0ooo2.OooO0Oo();
        oooO0oOooO00o3.OooO(new OoooO.OooOo00.OooO0O0(oooO0oOooO00o3, new Oooo000(oooO00oOooO0Oo, oooO00o2, str)), o00oO0o.OooO00o());
        oooO00oOooO0Oo.OooO(new Runnable() { // from class: Oooo0oO.o00OOO0O
            @Override // java.lang.Runnable
            public final void run() {
                this.f1169OooO0Oo.f3508OooO0o.cancel(true);
            }
        }, o00oO0o.OooO00o());
        o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
        AtomicReference atomicReference4 = new AtomicReference(null);
        o00O000.OooO0o oooO0oOooO00o4 = o00O000.OooO00o(new o00OOOOo(this, atomicReference4));
        oooO0oOooO00o4.OooO(new OoooO.OooOo00.OooO0O0(oooO0oOooO00o4, new oo00oO(o000oo0o2)), o0oooooOooO00o);
        o00O000.OooO00o<Void> oooO00o4 = (o00O000.OooO00o) atomicReference4.get();
        oooO00o4.getClass();
        this.f3503OooO = oooO00o4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO00o() {
        return this.f3508OooO0o.isDone();
    }

    public final void OooO0O0(@NonNull Surface surface, @NonNull Executor executor, @NonNull o000OO.OooO00o<Result> oooO00o) {
        if (!this.f3510OooO0oO.OooO0O0(surface)) {
            o00O000.OooO0o oooO0o = this.f3508OooO0o;
            if (!oooO0o.isCancelled()) {
                o000OO.OooOOO0.OooO0o(null, oooO0o.isDone());
                try {
                    oooO0o.get();
                    executor.execute(new o00Oo00(oooO00o, surface, 0));
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new o000000(1, oooO00o, surface));
                    return;
                }
            }
        }
        OooO00o oooO00o2 = new OooO00o(oooO00o, surface);
        o00O000.OooO0o oooO0o2 = this.f3511OooO0oo;
        oooO0o2.OooO(new OoooO.OooOo00.OooO0O0(oooO0o2, oooO00o2), executor);
    }

    public final void OooO0OO(@NonNull Executor executor, @NonNull OooO0o oooO0o) {
        OooO0OO oooO0OO;
        synchronized (this.f3504OooO00o) {
            this.f3516OooOOO0 = oooO0o;
            this.f3515OooOOO = executor;
            oooO0OO = this.f3514OooOO0o;
        }
        if (oooO0OO != null) {
            executor.execute(new o0o0Oo(0, oooO0o, oooO0OO));
        }
    }

    public final void OooO0Oo() {
        this.f3510OooO0oO.OooO0OO(new DeferrableSurface.SurfaceUnavailableException());
    }
}
