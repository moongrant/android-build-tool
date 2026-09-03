package p038OoooOoO;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.Oooo0;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.OooOo;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00000O0;
import androidx.camera.core.impl.o000O0Oo;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOOOo;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.processing.OooO0O0;
import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o000OO.OooOOO0;
import org.conscrypt.PSKKeyManager;
import p031OoooO0.o0OO00O;
import p037OoooOo0.o00;
import p037OoooOo0.o000;
import p037OoooOo0.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0000O extends Oooo0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final o000 f1587OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final o000O0o f1588OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public SurfaceProcessorNode f1589OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o00 f1590OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o00 f1591OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public SessionConfig.OooO0O0 f1592OooOOoo;

    public interface OooO00o {
    }

    public o0000O(@NonNull CameraInternal cameraInternal, @NonNull HashSet hashSet, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        super(Oooo00O(hashSet));
        this.f1587OooOOO = Oooo00O(hashSet);
        this.f1588OooOOOO = new o000O0o(cameraInternal, hashSet, useCaseConfigFactory, new o000OO(this));
    }

    public static o000 Oooo00O(HashSet hashSet) {
        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
        new o0000OO0(ooo00oOooo0OO);
        ooo00oOooo0OO.Oooo0oO(o000O0Oo.f3701OooO, 34);
        ooo00oOooo0OO.Oooo0oO(o00Oo00.f3760OooOooO, UseCaseConfigFactory.CaptureType.STREAM_SHARING);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Oooo0 oooo0 = (Oooo0) it.next();
            if (oooo0.f3488OooO0o.OooO0o0(o00Oo00.f3760OooOooO)) {
                arrayList.add(oooo0.f3488OooO0o.getCaptureType());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        ooo00oOooo0OO.Oooo0oO(o000.f1585Oooo000, arrayList);
        return new o000(o00O0O00.Oooo0O0(ooo00oOooo0OO));
    }

    @Override // androidx.camera.core.Oooo0
    @Nullable
    public final o00Oo00<?> OooO0o(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        o000 o000Var = this.f1587OooOOO;
        o000Var.getClass();
        Config configOooO00o = useCaseConfigFactory.OooO00o(o00OOOOo.OooO0OO(o000Var), 1);
        if (z) {
            configOooO00o = o00000O0.OooO00o(configOooO00o, o000Var.f1586OooOooo);
        }
        if (configOooO00o == null) {
            return null;
        }
        return ((o0000OO0) OooOO0O(configOooO00o)).OooO0O0();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    public final Set<Integer> OooOO0() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    public final o00Oo00.OooO00o<?, ?, ?> OooOO0O(@NonNull Config config) {
        return new o0000OO0(oOO00O.Oooo0o0(config));
    }

    @Override // androidx.camera.core.Oooo0
    public final void OooOOoo() {
        o000O0o o000o0o2 = this.f1588OooOOOO;
        for (Oooo0 oooo0 : o000o0o2.f1601OooO0Oo) {
            oooo0.OooO00o(o000o0o2, null, oooo0.OooO0o(true, o000o0o2.f1604OooO0oO));
        }
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final OooOo OooOo(@NonNull Config config) {
        this.f1592OooOOoo.f3624OooO0O0.OooO0OO(config);
        OooOooO(this.f1592OooOOoo.OooO0o0());
        OooOo.OooO00o oooO00oOooO0o0 = this.f3490OooO0oO.OooO0o0();
        oooO00oOooO0o0.f3592OooO0Oo = config;
        return oooO00oOooO0o0.OooO00o();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    public final o00Oo00<?> OooOo0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o00Oo00.OooO00o<?, ?, ?> oooO00o) {
        CameraInternal cameraInternal;
        o00O00O o00o00oOooO00o = oooO00o.OooO00o();
        o000O0o o000o0o2 = this.f1588OooOOOO;
        o000o0o2.getClass();
        HashSet hashSet = new HashSet();
        Iterator<Oooo0> it = o000o0o2.f1601OooO0Oo.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            cameraInternal = o000o0o2.f1605OooO0oo;
            if (!zHasNext) {
                break;
            }
            Oooo0 next = it.next();
            hashSet.add(next.OooOOOO(cameraInternal.OooO(), null, next.OooO0o(true, o000o0o2.f1604OooO0oO)));
        }
        List arrayList = new ArrayList(cameraInternal.OooO().OooO0oo(34));
        Rect rectOooO0OO = cameraInternal.OooO0o().OooO0OO();
        RectF rectF = o0OO00O.f1384OooO00o;
        new Size(rectOooO0OO.width(), rectOooO0OO.height());
        OooO0o oooO0o = ImageOutputConfig.f3548OooOo00;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            List list = (List) ((o00Oo00) it2.next()).OooOoO(ImageOutputConfig.f3548OooOo00, null);
            if (list != null) {
                arrayList = list;
                break;
            }
        }
        oOO00O ooo00o = (oOO00O) o00o00oOooO00o;
        ooo00o.Oooo0oO(oooO0o, arrayList);
        OooO0o oooO0o2 = o00Oo00.f3756OooOoO0;
        Iterator it3 = hashSet.iterator();
        int iMax = 0;
        while (it3.hasNext()) {
            iMax = Math.max(iMax, ((o00Oo00) it3.next()).OooOoO0());
        }
        ooo00o.Oooo0oO(oooO0o2, Integer.valueOf(iMax));
        return oooO00o.OooO0O0();
    }

    @Override // androidx.camera.core.Oooo0
    public final void OooOo0O() {
        Iterator<Oooo0> it = this.f1588OooOOOO.f1601OooO0Oo.iterator();
        while (it.hasNext()) {
            it.next().OooOo0O();
        }
    }

    @Override // androidx.camera.core.Oooo0
    public final void OooOo0o() {
        Iterator<Oooo0> it = this.f1588OooOOOO.f1601OooO0Oo.iterator();
        while (it.hasNext()) {
            it.next().OooOo0o();
        }
    }

    @Override // androidx.camera.core.Oooo0
    public final void OooOoO() {
        OooOooo();
        o000O0o o000o0o2 = this.f1588OooOOOO;
        Iterator<Oooo0> it = o000o0o2.f1601OooO0Oo.iterator();
        while (it.hasNext()) {
            it.next().OooOoo(o000o0o2);
        }
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    public final oo0O OooOoO0(@NonNull oo0O oo0o) {
        OooOooO(Oooo000(OooO0o0(), this.f3488OooO0o, oo0o));
        OooOOOo();
        return oo0o;
    }

    public final void OooOooo() {
        o00 o00Var = this.f1591OooOOo0;
        if (o00Var != null) {
            p031OoooO0.o0Oo0oo.OooO00o();
            o00Var.f1465OooOOO0.OooO00o();
            o00oOoo o00oooo2 = o00Var.f1461OooOO0;
            if (o00oooo2 != null) {
                o00oooo2.OooO00o();
                o00Var.f1461OooOO0 = null;
            }
            o00Var.f1466OooOOOO = true;
            this.f1591OooOOo0 = null;
        }
        o00 o00Var2 = this.f1590OooOOo;
        if (o00Var2 != null) {
            p031OoooO0.o0Oo0oo.OooO00o();
            o00Var2.f1465OooOOO0.OooO00o();
            o00oOoo o00oooo3 = o00Var2.f1461OooOO0;
            if (o00oooo3 != null) {
                o00oooo3.OooO00o();
                o00Var2.f1461OooOO0 = null;
            }
            o00Var2.f1466OooOOOO = true;
            this.f1590OooOOo = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f1589OooOOOo;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.OooO0O0();
            this.f1589OooOOOo = null;
        }
    }

    @NonNull
    @MainThread
    public final SessionConfig Oooo000(@NonNull final String str, @NonNull final o00Oo00<?> o00oo00, @NonNull final oo0O oo0o) {
        p031OoooO0.o0Oo0oo.OooO00o();
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        cameraInternalOooO0OO.getClass();
        Matrix matrix = this.f3492OooOO0;
        boolean zOooOOOO = cameraInternalOooO0OO.OooOOOO();
        Size sizeOooO0Oo = oo0o.OooO0Oo();
        Rect rect = this.f3483OooO;
        if (rect == null) {
            rect = new Rect(0, 0, sizeOooO0Oo.getWidth(), sizeOooO0Oo.getHeight());
        }
        o00 o00Var = new o00(3, 34, oo0o, matrix, zOooOOOO, rect, 0, -1, false);
        this.f1591OooOOo0 = o00Var;
        if (this.f3494OooOO0o != null) {
            throw null;
        }
        this.f1590OooOOo = o00Var;
        this.f1589OooOOOo = new SurfaceProcessorNode(cameraInternalOooO0OO, new o000(oo0o.OooO00o()));
        o00 o00Var2 = this.f1590OooOOo;
        o000O0o o000o0o2 = this.f1588OooOOOO;
        o000o0o2.getClass();
        HashMap map = new HashMap();
        Iterator<Oooo0> it = o000o0o2.f1601OooO0Oo.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Oooo0 next = it.next();
            boolean z = next instanceof OooOOOO;
            int iOooOOO = z ? o000o0o2.f1605OooO0oo.OooO00o().OooOOO(((ImageOutputConfig) ((OooOOOO) next).f3488OooO0o).OooOOO()) : 0;
            int i = z ? 1 : next instanceof ImageCapture ? 4 : 2;
            int i2 = next instanceof ImageCapture ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 34;
            Rect rect2 = o00Var2.f1456OooO0Oo;
            RectF rectF = o0OO00O.f1384OooO00o;
            map.put(next, new OooO0O0(UUID.randomUUID(), i, i2, rect2, o0OO00O.OooO0o(iOooOOO, new Size(rect2.width(), rect2.height())), iOooOOO, next.OooOOO(o000o0o2)));
        }
        SurfaceProcessorNode.Out outOooO0OO = this.f1589OooOOOo.OooO0OO(new androidx.camera.core.processing.OooO00o(this.f1590OooOOo, new ArrayList(map.values())));
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((Oooo0) entry.getKey(), outOooO0OO.get(entry.getValue()));
        }
        HashMap map3 = o000o0o2.f1603OooO0o0;
        map3.clear();
        map3.putAll(map2);
        for (Map.Entry entry2 : map3.entrySet()) {
            Oooo0 oooo0 = (Oooo0) entry2.getKey();
            o00 o00Var3 = (o00) entry2.getValue();
            oooo0.OooOoo0(o00Var3.f1456OooO0Oo);
            oooo0.OooOoOO(o00Var3.f1454OooO0O0);
            oooo0.f3490OooO0oO = oooo0.OooOoO0(o00Var3.f1459OooO0oO);
            oooo0.OooOOo();
        }
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(o00oo00, oo0o.OooO0Oo());
        o00 o00Var4 = this.f1591OooOOo0;
        o00Var4.getClass();
        p031OoooO0.o0Oo0oo.OooO00o();
        o00Var4.OooO0O0();
        OooOOO0.OooO0o("Consumer can only be linked once.", !o00Var4.f1462OooOO0O);
        o00Var4.f1462OooOO0O = true;
        oooO0O0OooO0o.OooO0Oo(o00Var4.f1465OooOOO0, DynamicRange.f3398OooO0Oo);
        o000000O.OooO00o oooO00o = oooO0O0OooO0o.f3624OooO0O0;
        oooO00o.OooO0O0(o000o0o2.f1600OooO);
        if (oo0o.OooO0OO() != null) {
            oooO00o.OooO0OO(oo0o.OooO0OO());
        }
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO() { // from class: OoooOoO.o0000O0O
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                o0000O o0000o2 = this.f1593OooO00o;
                o0000o2.OooOooo();
                String str2 = str;
                if (o0000o2.OooOO0o(str2)) {
                    o0000o2.OooOooO(o0000o2.Oooo000(str2, o00oo00, oo0o));
                    o0000o2.OooOOo0();
                }
            }
        });
        this.f1592OooOOoo = oooO0O0OooO0o;
        return oooO0O0OooO0o.OooO0o0();
    }
}
