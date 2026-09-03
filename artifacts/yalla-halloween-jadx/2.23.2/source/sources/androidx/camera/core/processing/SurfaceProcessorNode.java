package androidx.camera.core.processing;

import OooOO0O.OooO;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.OooOO0O;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOO0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;
import p030OoooO.o000oOoO;
import p031OoooO0.o0OO00O;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0OOO0o;
import p037OoooOo0.o00;
import p037OoooOo0.o00O000;
import p037OoooOo0.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class SurfaceProcessorNode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o00O000 f3838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final CameraInternal f3839OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Out f3840OooO0OO;

    public class OooO00o implements OooOOO0<SurfaceOutput> {
        public OooO00o() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o00O0O0.OooO("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th);
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable SurfaceOutput surfaceOutput) {
            SurfaceOutput surfaceOutput2 = surfaceOutput;
            surfaceOutput2.getClass();
            try {
                SurfaceProcessorNode.this.f3838OooO00o.OooO0o(surfaceOutput2);
            } catch (ProcessingException e) {
                o00O0O0.OooO0OO("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
            }
        }
    }

    @AutoValue
    public static abstract class OooO0O0 {
        @NonNull
        public abstract List<OooO0OO> OooO00o();

        @NonNull
        public abstract o00 OooO0O0();
    }

    @AutoValue
    public static abstract class OooO0OO {
        @NonNull
        public abstract Rect OooO00o();

        public abstract int OooO0O0();

        public abstract boolean OooO0OO();

        public abstract int OooO0Oo();

        public abstract int OooO0o();

        @NonNull
        public abstract Size OooO0o0();

        @NonNull
        public abstract UUID OooO0oO();
    }

    public static class Out extends HashMap<OooO0OO, o00> {
    }

    public SurfaceProcessorNode(@NonNull CameraInternal cameraInternal, @NonNull o00O000 o00o001) {
        this.f3839OooO0O0 = cameraInternal;
        this.f3838OooO00o = o00o001;
    }

    public final void OooO00o(@NonNull o00 o00Var, Map.Entry<OooO0OO, o00> entry) {
        final o00 value = entry.getValue();
        final Size sizeOooO0Oo = o00Var.f1459OooO0oO.OooO0Oo();
        final int iOooO0O0 = entry.getKey().OooO0O0();
        final Rect rectOooO00o = entry.getKey().OooO00o();
        final int iOooO0Oo = entry.getKey().OooO0Oo();
        final boolean zOooO0OO = entry.getKey().OooO0OO();
        final CameraInternal cameraInternal = o00Var.f1455OooO0OO ? this.f3839OooO0O0 : null;
        value.getClass();
        o0Oo0oo.OooO00o();
        value.OooO0O0();
        o000OO.OooOOO0.OooO0o("Consumer can only be linked once.", !value.f1462OooOO0O);
        value.f1462OooOO0O = true;
        final o00.OooO00o oooO00o = value.f1465OooOOO0;
        OooOO0O<Surface> oooOO0OOooO0OO = oooO00o.OooO0OO();
        OooOO0 oooOO1 = new OooOO0() { // from class: OoooOo0.o000O0O0
            @Override // p030OoooO.OooOO0
            public final OooOO0O apply(Object obj) {
                final o00.OooO00o oooO00o2 = oooO00o;
                int i = iOooO0O0;
                Size size = sizeOooO0Oo;
                Rect rect = rectOooO00o;
                int i2 = iOooO0Oo;
                boolean z = zOooO0OO;
                CameraInternal cameraInternal2 = cameraInternal;
                Surface surface = (Surface) obj;
                o00 o00Var2 = value;
                o00Var2.getClass();
                surface.getClass();
                try {
                    oooO00o2.OooO0o0();
                    o00oOoo o00oooo2 = new o00oOoo(surface, i, o00Var2.f1459OooO0oO.OooO0Oo(), size, rect, i2, z, cameraInternal2);
                    o00oooo2.f1580OooOOO0.f57741OooO0o0.OooO0oo(new Runnable() { // from class: OoooOo0.o000O
                        @Override // java.lang.Runnable
                        public final void run() {
                            oooO00o2.OooO0O0();
                        }
                    }, o00oO0o.OooO00o());
                    o00Var2.f1461OooOO0 = o00oooo2;
                    return OooOo.OooO0Oo(o00oooo2);
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    return new o000oOoO.OooO00o(e);
                }
            }
        };
        o0OOO0o o0ooo0oOooO0OO = o00oO0o.OooO0OO();
        p030OoooO.OooOO0O oooOO0O = new p030OoooO.OooOO0O(oooOO1, oooOO0OOooO0OO);
        oooOO0OOooO0OO.OooO0oo(oooOO0O, o0ooo0oOooO0OO);
        oooOO0O.OooO0oo(new OooOo.OooO0O0(oooOO0O, new OooO00o()), o00oO0o.OooO0OO());
    }

    public final void OooO0O0() {
        this.f3838OooO00o.release();
        o00oO0o.OooO0OO().execute(new OooO(this, 1));
    }

    @NonNull
    @MainThread
    public final Out OooO0OO(@NonNull androidx.camera.core.processing.OooO00o oooO00o) {
        androidx.camera.core.processing.OooO00o oooO00o2 = oooO00o;
        o0Oo0oo.OooO00o();
        this.f3840OooO0OO = new Out();
        Iterator<OooO0OO> it = oooO00o2.f3830OooO0O0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            final o00 o00Var = oooO00o2.f3829OooO00o;
            if (!zHasNext) {
                Out out = this.f3840OooO0OO;
                SurfaceRequest surfaceRequestOooO0OO = o00Var.OooO0OO(this.f3839OooO0O0);
                surfaceRequestOooO0OO.OooO0OO(o00oO0o.OooO0OO(), new o00O000o(out));
                try {
                    this.f3838OooO00o.OooO0OO(surfaceRequestOooO0OO);
                } catch (ProcessingException e) {
                    o00O0O0.OooO0OO("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
                }
                for (final Map.Entry<OooO0OO, o00> entry : this.f3840OooO0OO.entrySet()) {
                    OooO00o(o00Var, entry);
                    entry.getValue().OooO00o(new Runnable() { // from class: OoooOo0.o00O00
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1564OooO0Oo.OooO00o(o00Var, entry);
                        }
                    });
                }
                return this.f3840OooO0OO;
            }
            OooO0OO next = it.next();
            Out out2 = this.f3840OooO0OO;
            Rect rectOooO00o = next.OooO00o();
            int iOooO0Oo = next.OooO0Oo();
            boolean zOooO0OO = next.OooO0OO();
            Matrix matrix = new Matrix(o00Var.f1454OooO0O0);
            matrix.postConcat(o0OO00O.OooO00o(iOooO0Oo, new RectF(rectOooO00o), o0OO00O.OooO0oO(next.OooO0o0()), zOooO0OO));
            o000OO.OooOOO0.OooO00o(o0OO00O.OooO0Oo(o0OO00O.OooO0o(iOooO0Oo, new Size(rectOooO00o.width(), rectOooO00o.height())), false, next.OooO0o0()));
            androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = o00Var.f1459OooO0oO.OooO0o0();
            Size sizeOooO0o0 = next.OooO0o0();
            if (sizeOooO0o0 == null) {
                oooO00oOooO0o0.getClass();
                throw new NullPointerException("Null resolution");
            }
            oooO00oOooO0o0.f3589OooO00o = sizeOooO0o0;
            androidx.camera.core.impl.OooOo oooOoOooO00o = oooO00oOooO0o0.OooO00o();
            int iOooO0o = next.OooO0o();
            int iOooO0O0 = next.OooO0O0();
            Size sizeOooO0o1 = next.OooO0o0();
            out2.put(next, new o00(iOooO0o, iOooO0O0, oooOoOooO00o, matrix, false, new Rect(0, 0, sizeOooO0o1.getWidth() + 0, sizeOooO0o1.getHeight() + 0), o00Var.f1452OooO - iOooO0Oo, -1, o00Var.f1458OooO0o0 != zOooO0OO));
            oooO00o2 = oooO00o;
        }
    }
}
