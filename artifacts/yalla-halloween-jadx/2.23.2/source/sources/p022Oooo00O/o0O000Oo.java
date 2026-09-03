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
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOOOo;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p023Oooo00o.oO000o00;
import p025Oooo0OO.o000OO;
import p026Oooo0o.OooOOOO;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;
import p033OoooO0O.o00oO0o;
import p034OoooOO0.o0OOO0o;
import p034OoooOO0.oo0o0Oo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000O f696OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public SessionConfig f697OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f698OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Size f699OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooO0OO f700OooO0o0;

    public class OooO00o implements OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Surface f701OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f702OooO0O0;

        public OooO00o(Surface surface, SurfaceTexture surfaceTexture) {
            this.f701OooO00o = surface;
            this.f702OooO0O0 = surfaceTexture;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(@Nullable Void r1) {
            this.f701OooO00o.release();
            this.f702OooO0O0.release();
        }
    }

    public static class OooO0O0 implements o00Oo00<Oooo0> {

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @NonNull
        public final oOO00O f703OooOooo;

        public OooO0O0() {
            oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
            ooo00oOooo0OO.Oooo0oO(o00Oo00.f3754OooOo0o, new o00O0O00());
            this.f703OooOooo = ooo00oOooo0OO;
        }

        @Override // androidx.camera.core.impl.Config
        public final Object OooO0O0(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooO0O0(oooO00o);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ Range OooO0Oo() {
            return o00OOOOo.OooO(this);
        }

        @Override // androidx.camera.core.impl.o000O0Oo
        public final int OooO0o() {
            return ((Integer) OooO0O0(o000O0Oo.f3701OooO)).intValue();
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
            return o0OOO0o.OooO00o(this, str);
        }

        @Override // androidx.camera.core.impl.Config
        public final void OooOO0o(OooOOOO oooOOOO) {
            this.f703OooOooo.OooOO0o(oooOOOO);
        }

        @Override // androidx.camera.core.impl.Config
        public final Set OooOOO0(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooOOO0(oooO00o);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ boolean OooOOoo() {
            return o00OOOOo.OooOO0O(this);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ SessionConfig OooOo() {
            return o00OOOOo.OooO0o0(this);
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
            return ((o00O0O00) getConfig()).OooOoO(oooO00o, obj);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ int OooOoO0() {
            return o00OOOOo.OooO0oO(this);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ SessionConfig.OooO0o OooOoOO() {
            return o00OOOOo.OooO0o(this);
        }

        @Override // androidx.camera.core.impl.Config
        public final Config.OptionPriority OooOoo(Config.OooO00o oooO00o) {
            return ((o00O0O00) getConfig()).OooOoo(oooO00o);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ CameraSelector OooOooO() {
            return o00OOOOo.OooO00o(this);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ boolean OooOooo() {
            return o00OOOOo.OooOO0(this);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ o000000O Oooo000() {
            return o00OOOOo.OooO0Oo(this);
        }

        @Override // p034OoooOO0.o0Oo0oo
        public final /* synthetic */ String Oooo00O() {
            return o0OOO0o.OooO0O0(this);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        public final /* synthetic */ int Oooo00o() {
            return o00OOOOo.OooO0oo(this);
        }

        @Override // androidx.camera.core.impl.o00Oo00
        @NonNull
        public final UseCaseConfigFactory.CaptureType getCaptureType() {
            return UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.o00O0OOO
        @NonNull
        public final Config getConfig() {
            return this.f703OooOooo;
        }
    }

    public interface OooO0OO {
    }

    public o0O000Oo(@NonNull oO000o00 oo000o00, @NonNull o0oOO o0ooo2, @Nullable o000000O o000000o2) {
        Size size;
        o000OO o000oo2 = new o000OO();
        this.f698OooO0OO = new OooO0O0();
        this.f700OooO0o0 = o000000o2;
        Size[] sizeArrOooO00o = oo000o00.OooO0O0().OooO00o(34);
        int i = 0;
        if (sizeArrOooO00o == null) {
            o00O0O0.OooO0O0("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (o000oo2.f1055OooO00o != null) {
                if ("Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size2 : sizeArrOooO00o) {
                        if (o000OO.f1054OooO0OO.compare(size2, o000OO.f1053OooO0O0) >= 0) {
                            arrayList.add(size2);
                        }
                    }
                    sizeArrOooO00o = (Size[]) arrayList.toArray(new Size[0]);
                }
            }
            List listAsList = Arrays.asList(sizeArrOooO00o);
            Collections.sort(listAsList, new o0OoOoOo(i));
            Size sizeOooO0o0 = o0ooo2.OooO0o0();
            long jMin = Math.min(((long) sizeOooO0o0.getWidth()) * ((long) sizeOooO0o0.getHeight()), 307200L);
            int length = sizeArrOooO00o.length;
            Size size3 = null;
            int i2 = 0;
            while (i2 < length) {
                Size size4 = sizeArrOooO00o[i2];
                long width = ((long) size4.getWidth()) * ((long) size4.getHeight());
                if (width == jMin) {
                    size = size4;
                } else if (width <= jMin) {
                    i2++;
                    size3 = size4;
                } else if (size3 != null) {
                    size = size3;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.f699OooO0Oo = size;
        o00O0O0.OooO00o("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.f697OooO0O0 = OooO00o();
    }

    @NonNull
    public final SessionConfig OooO00o() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f699OooO0Oo;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(this.f698OooO0OO, size);
        oooO0O0OooO0o.f3624OooO0O0.f3656OooO0OO = 1;
        o000O o000o = new o000O(surface);
        this.f696OooO00o = o000o;
        OooOO0O<Void> oooOO0OOooO0Oo = o000o.OooO0Oo();
        OooO00o oooO00o = new OooO00o(surface, surfaceTexture);
        oooOO0OOooO0Oo.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0Oo, oooO00o), o00oO0o.OooO00o());
        oooO0O0OooO0o.OooO0Oo(this.f696OooO00o, DynamicRange.f3398OooO0Oo);
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO() { // from class: Oooo00O.o0O000O
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                o0O000Oo o0o000oo2 = this.f695OooO00o;
                o0o000oo2.f697OooO0O0 = o0o000oo2.OooO00o();
                o0O000Oo.OooO0OO oooO0OO = o0o000oo2.f700OooO0o0;
                if (oooO0OO != null) {
                    o000OO o000oo2 = (o000OO) ((o000000O) oooO0OO).f479OooO0Oo;
                    o000oo2.getClass();
                    try {
                        if (((Boolean) o000Oo0.OooO00o(new o0O0O00(o000oo2, 0)).get()).booleanValue()) {
                            o0O000Oo o0o000oo3 = o000oo2.f567OooOo0O;
                            o000oo2.f550OooO0o.execute(new o0000(o000oo2, o000OO.OooOo0o(o0o000oo3), o0o000oo3.f697OooO0O0, o0o000oo3.f698OooO0OO));
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
