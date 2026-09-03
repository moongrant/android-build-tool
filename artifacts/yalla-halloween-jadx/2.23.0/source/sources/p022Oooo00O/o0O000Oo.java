package p022Oooo00O;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Oooo0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O0;
import androidx.camera.core.impl.o000O0Oo;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00OOO0O;
import androidx.camera.core.impl.o0o0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import p023Oooo00o.oO00O0o0;
import p025Oooo0OO.o000OO;
import p026Oooo0o.OooOOOO;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo00;
import p033OoooO0O.o00oO0o;
import p034OoooOO0.o0OOO0o;
import p034OoooOO0.oo0o0Oo;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000O f690OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public SessionConfig f691OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f692OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Size f693OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooO0OO f694OooO0o0;

    public class OooO00o implements OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Surface f695OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f696OooO0O0;

        public OooO00o(Surface surface, SurfaceTexture surfaceTexture) {
            this.f695OooO00o = surface;
            this.f696OooO0O0 = surfaceTexture;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r1) {
            this.f695OooO00o.release();
            this.f696OooO0O0.release();
        }
    }

    public static class OooO0O0 implements o0o0Oo<Oooo0> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @NonNull
        public final o00O00O f697OooOooo;

        public OooO0O0() {
            o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
            o00o00oOooo0OO.Oooo0oO(o0o0Oo.f3773OooOo0o, new o00O0O00());
            this.f697OooOooo = o00o00oOooo0OO;
        }

        @Override // androidx.camera.core.impl.Config
        public final Object OooO0O0(Config.OooO00o oooO00o) {
            return ((o00O0) getConfig()).OooO0O0(oooO00o);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ Range OooO0Oo() {
            return o00OOO0O.OooO(this);
        }

        @Override // androidx.camera.core.impl.o000O0Oo
        public final int OooO0o() {
            return ((Integer) OooO0O0(o000O0Oo.f3702OooO)).intValue();
        }

        @Override // androidx.camera.core.impl.Config
        public final boolean OooO0o0(Config.OooO00o oooO00o) {
            return ((o00O0) getConfig()).OooO0o0(oooO00o);
        }

        @Override // androidx.camera.core.impl.Config
        public final Object OooO0oO(Config.OooO00o oooO00o, Config.OptionPriority optionPriority) {
            return ((o00O0) getConfig()).OooO0oO(oooO00o, optionPriority);
        }

        @Override // androidx.camera.core.impl.Config
        public final Set OooO0oo() {
            return ((o00O0) getConfig()).OooO0oo();
        }

        @Override // p034OoooOO0.o0Oo0oo
        public final /* synthetic */ String OooOO0(String str) {
            return o0OOO0o.OooO00o(this, str);
        }

        @Override // androidx.camera.core.impl.Config
        public final void OooOO0o(OooOOOO oooOOOO) {
            this.f697OooOooo.OooOO0o(oooOOOO);
        }

        @Override // androidx.camera.core.impl.Config
        public final Set OooOOO0(Config.OooO00o oooO00o) {
            return ((o00O0) getConfig()).OooOOO0(oooO00o);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ boolean OooOOoo() {
            return o00OOO0O.OooOO0O(this);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ SessionConfig OooOo() {
            return o00OOO0O.OooO0o0(this);
        }

        @Override // androidx.camera.core.impl.o000O0Oo
        public final /* synthetic */ DynamicRange OooOo0() {
            return o000O0.OooO00o(this);
        }

        @Override // p034OoooOO0.o0O0O00
        public final /* synthetic */ Oooo0.OooO0O0 OooOo00() {
            return oo0o0Oo.OooO00o(this);
        }

        @Override // androidx.camera.core.impl.o000O0Oo
        public final /* synthetic */ boolean OooOo0o() {
            return o000O0.OooO0O0(this);
        }

        @Override // androidx.camera.core.impl.Config
        public final Object OooOoO(Config.OooO00o oooO00o, Object obj) {
            return ((o00O0) getConfig()).OooOoO(oooO00o, obj);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ int OooOoO0() {
            return o00OOO0O.OooO0oO(this);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ SessionConfig.OooO0o OooOoOO() {
            return o00OOO0O.OooO0o(this);
        }

        @Override // androidx.camera.core.impl.Config
        public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
            return ((o00O0) getConfig()).OooOoo(oooO00o);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ CameraSelector OooOooO() {
            return o00OOO0O.OooO00o(this);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ boolean OooOooo() {
            return o00OOO0O.OooOO0(this);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ o000000O Oooo000() {
            return o00OOO0O.OooO0Oo(this);
        }

        @Override // p034OoooOO0.o0Oo0oo
        public final /* synthetic */ String Oooo00O() {
            return o0OOO0o.OooO0O0(this);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        public final /* synthetic */ int Oooo00o() {
            return o00OOO0O.OooO0oo(this);
        }

        @Override // androidx.camera.core.impl.o0o0Oo
        @NonNull
        public final UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.o00O0OO
        @NonNull
        public final Config getConfig() {
            return this.f697OooOooo;
        }
    }

    public interface OooO0OO {
    }

    public o0O000Oo(@NonNull oO00O0o0 oo00o0o0, @NonNull o0oOO o0ooo2, @Nullable o000000O o000000o2) {
        Size size;
        o000OO o000oo2 = new o000OO();
        this.f692OooO0OO = new OooO0O0();
        this.f694OooO0o0 = o000000o2;
        Size[] sizeArrOooO00o = oo00o0o0.OooO0O0().OooO00o(34);
        if (sizeArrOooO00o == null) {
            o00O0O0.OooO0O0("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (o000oo2.f1069OooO00o != null) {
                if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size2 : sizeArrOooO00o) {
                        if (o000OO.f1068OooO0OO.compare(size2, o000OO.f1067OooO0O0) >= 0) {
                            arrayList.add(size2);
                        }
                    }
                    sizeArrOooO00o = (Size[]) arrayList.toArray(new Size[0]);
                }
            }
            List listAsList = Arrays.asList(sizeArrOooO00o);
            Collections.sort(listAsList, new o0OoOoOo(0));
            Size sizeOooO0o0 = o0ooo2.OooO0o0();
            long jMin = Math.min(((long) sizeOooO0o0.getWidth()) * ((long) sizeOooO0o0.getHeight()), 307200L);
            int length = sizeArrOooO00o.length;
            Size size3 = null;
            int i = 0;
            while (i < length) {
                Size size4 = sizeArrOooO00o[i];
                long width = ((long) size4.getWidth()) * ((long) size4.getHeight());
                if (width == jMin) {
                    size = size4;
                } else if (width <= jMin) {
                    i++;
                    size3 = size4;
                } else if (size3 != null) {
                    size = size3;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.f693OooO0Oo = size;
        o00O0O0.OooO00o("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.f691OooO0O0 = OooO00o();
    }

    @NonNull
    public final SessionConfig OooO00o() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f693OooO0Oo;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(this.f692OooO0OO, size);
        oooO0O0OooO0o.f3626OooO0O0.f3657OooO0OO = 1;
        o000O o000o = new o000O(surface);
        this.f690OooO00o = o000o;
        com.google.common.util.concurrent.OooO00o<Void> oooO00oOooO0Oo = o000o.OooO0Oo();
        OooO00o oooO00o = new OooO00o(surface, surfaceTexture);
        oooO00oOooO0Oo.OooO(new OooOo00.OooO0O0(oooO00oOooO0Oo, oooO00o), o00oO0o.OooO00o());
        oooO0O0OooO0o.OooO0Oo(this.f690OooO00o, DynamicRange.f3400OooO0Oo);
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO() { // from class: Oooo00O.o0O000O
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                o0O000Oo o0o000oo2 = this.f689OooO00o;
                o0o000oo2.f691OooO0O0 = o0o000oo2.OooO00o();
                o0O000Oo.OooO0OO oooO0OO = o0o000oo2.f694OooO0o0;
                if (oooO0OO != null) {
                    final o000OO o000oo2 = (o000OO) ((o000000O) oooO0OO).f478OooO0Oo;
                    o000oo2.getClass();
                    try {
                        if (((Boolean) o00O000.OooO00o(new o00O000.OooO0OO() { // from class: Oooo00O.o0O0O00
                            @Override // o0ooOO0.o00O000.OooO0OO
                            public final Object OooO0o0(o00O000.OooO00o oooO00o2) {
                                o000OO o000oo3 = o000oo2;
                                o000oo3.getClass();
                                try {
                                    o000oo3.f551OooO0o.execute(new o00000(0, o000oo3, oooO00o2));
                                    return "isMeteringRepeatingAttached";
                                } catch (RejectedExecutionException unused) {
                                    oooO00o2.OooO0OO(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                                    return "isMeteringRepeatingAttached";
                                }
                            }
                        }).get()).booleanValue()) {
                            o0O000Oo o0o000oo3 = o000oo2.f568OooOo0O;
                            o000oo2.f551OooO0o.execute(new o0000(o000oo2, o000OO.OooOo0o(o0o000oo3), o0o000oo3.f691OooO0O0, o0o000oo3.f692OooO0OO));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
            }
        });
        return oooO0O0OooO0o.OooO0o0();
    }
}
