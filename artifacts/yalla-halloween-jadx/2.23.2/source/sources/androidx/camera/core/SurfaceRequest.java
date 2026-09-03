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
import androidx.camera.core.OooO;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.oo0O;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p028Oooo0oO.o00OOO0;
import p028Oooo0oO.o00OOO00;
import p028Oooo0oO.o00OOOO0;
import p028Oooo0oO.o00Oo00;
import p028Oooo0oO.o0O00o0;
import p028Oooo0oO.oo00oO;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p037OoooOo0.o000O0Oo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SurfaceRequest {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Range<Integer> f3500OooOOOO = oo0O.f3780OooO00o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final o000Oo0.OooO00o<Void> f3501OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3502OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Size f3503OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final DynamicRange f3504OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Range<Integer> f3505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000Oo0.OooO0o f3506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final CameraInternal f3507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000Oo0.OooO00o<Surface> f3508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000Oo0.OooO0o f3509OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000Oo0.OooO00o<Void> f3510OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o0O00o0 f3511OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO0OO f3512OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public Executor f3513OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO0o f3514OooOOO0;

    public class OooO00o implements p030OoooO.OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000OO.OooO00o f3515OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Surface f3516OooO0O0;

        public OooO00o(o000OO.OooO00o oooO00o, Surface surface) {
            this.f3515OooO00o = oooO00o;
            this.f3516OooO0O0 = surface;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o000OO.OooOOO0.OooO0o("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof OooO0O0);
            this.f3515OooO00o.accept(new OooO(1, this.f3516OooO0O0));
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r3) {
            this.f3515OooO00o.accept(new OooO(0, this.f3516OooO0O0));
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
    public SurfaceRequest(@NonNull Size size, @NonNull CameraInternal cameraInternal, @NonNull DynamicRange dynamicRange, @NonNull Range range, @NonNull o000O0Oo o000o0oo2) {
        this.f3503OooO0O0 = size;
        this.f3507OooO0o0 = cameraInternal;
        this.f3504OooO0OO = dynamicRange;
        this.f3505OooO0Oo = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        o000Oo0.OooO0o oooO0oOooO00o = o000Oo0.OooO00o(new p028Oooo0oO.oo0O(atomicReference, str));
        o000Oo0.OooO00o<Void> oooO00o = (o000Oo0.OooO00o) atomicReference.get();
        oooO00o.getClass();
        this.f3510OooOO0 = oooO00o;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        o000Oo0.OooO0o oooO0oOooO00o2 = o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: Oooo0oO.o00OO
            @Override // o0ooOO0.o000Oo0.OooO0OO
            public final Object OooO0o0(o000Oo0.OooO00o oooO00o2) {
                atomicReference2.set(oooO00o2);
                return o0oOO.OooO0O0(new StringBuilder(), str, "-status");
            }
        });
        this.f3509OooO0oo = oooO0oOooO00o2;
        oooO0oOooO00o2.OooO0oo(new OoooO.OooOo.OooO0O0(oooO0oOooO00o2, new OooOo(oooO00o, oooO0oOooO00o)), o00oO0o.OooO00o());
        o000Oo0.OooO00o oooO00o2 = (o000Oo0.OooO00o) atomicReference2.get();
        oooO00o2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        o000Oo0.OooO0o oooO0oOooO00o3 = o000Oo0.OooO00o(new o00OOO00(atomicReference3, str));
        this.f3506OooO0o = oooO0oOooO00o3;
        o000Oo0.OooO00o<Surface> oooO00o3 = (o000Oo0.OooO00o) atomicReference3.get();
        oooO00o3.getClass();
        this.f3508OooO0oO = oooO00o3;
        o0O00o0 o0o00o1 = new o0O00o0(this, size);
        this.f3511OooOO0O = o0o00o1;
        com.google.common.util.concurrent.OooOO0O<Void> oooOO0OOooO0Oo = o0o00o1.OooO0Oo();
        oooO0oOooO00o3.OooO0oo(new OoooO.OooOo.OooO0O0(oooO0oOooO00o3, new Oooo000(oooOO0OOooO0Oo, oooO00o2, str)), o00oO0o.OooO00o());
        oooOO0OOooO0Oo.OooO0oo(new o00OOO0(this, 0), o00oO0o.OooO00o());
        o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
        AtomicReference atomicReference4 = new AtomicReference(null);
        o000Oo0.OooO0o oooO0oOooO00o4 = o000Oo0.OooO00o(new o00OOOO0(this, atomicReference4));
        oooO0oOooO00o4.OooO0oo(new OoooO.OooOo.OooO0O0(oooO0oOooO00o4, new oo00oO(o000o0oo2)), o0oooooOooO00o);
        o000Oo0.OooO00o<Void> oooO00o4 = (o000Oo0.OooO00o) atomicReference4.get();
        oooO00o4.getClass();
        this.f3501OooO = oooO00o4;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO00o() {
        return this.f3506OooO0o.isDone();
    }

    public final void OooO0O0(@NonNull final Surface surface, @NonNull Executor executor, @NonNull final o000OO.OooO00o<Result> oooO00o) {
        if (!this.f3508OooO0oO.OooO0O0(surface)) {
            o000Oo0.OooO0o oooO0o = this.f3506OooO0o;
            if (!oooO0o.isCancelled()) {
                o000OO.OooOOO0.OooO0o(null, oooO0o.isDone());
                try {
                    oooO0o.get();
                    executor.execute(new Runnable() { // from class: Oooo0oO.o00OOOOo
                        @Override // java.lang.Runnable
                        public final void run() {
                            oooO00o.accept(new OooO(3, surface));
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new o00Oo00(0, oooO00o, surface));
                    return;
                }
            }
        }
        OooO00o oooO00o2 = new OooO00o(oooO00o, surface);
        o000Oo0.OooO0o oooO0o2 = this.f3509OooO0oo;
        oooO0o2.OooO0oo(new OoooO.OooOo.OooO0O0(oooO0o2, oooO00o2), executor);
    }

    public final void OooO0OO(@NonNull Executor executor, @NonNull final OooO0o oooO0o) {
        final OooO0OO oooO0OO;
        synchronized (this.f3502OooO00o) {
            this.f3514OooOOO0 = oooO0o;
            this.f3513OooOOO = executor;
            oooO0OO = this.f3512OooOO0o;
        }
        if (oooO0OO != null) {
            executor.execute(new Runnable() { // from class: Oooo0oO.o00OOO0O
                @Override // java.lang.Runnable
                public final void run() {
                    oooO0o.OooO00o(oooO0OO);
                }
            });
        }
    }

    public final void OooO0Oo() {
        this.f3508OooO0oO.OooO0OO(new DeferrableSurface.SurfaceUnavailableException());
    }
}
