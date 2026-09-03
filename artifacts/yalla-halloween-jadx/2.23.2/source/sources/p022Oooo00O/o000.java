package p022Oooo00O;

import Oooo0.OooO;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.OooO0O0;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.o0000O;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oo0o0O0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o000OO.OooOOO0;
import p023Oooo00o.oO000o00;
import p023Oooo00o.oO00o000;
import p023Oooo00o.oO0OO00o;
import p023Oooo00o.oOo00o0o;
import p024Oooo0O0.o0000;
import p026Oooo0o.OooOOO;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o0O0o;
import p031OoooO0.OooOo;
import p033OoooO0O.o0ooOOo;
import p034OoooOO0.o00Ooo;
import p440o0OoOo0.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public final class o000 implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final oo0o0O0 f456OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO000o00 f458OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO f459OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public o0Oo0oo f462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final OooO00o<CameraState> f463OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final oo00o f465OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f460OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public OooO00o<o0O0o> f461OooO0o = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public ArrayList f464OooO0oo = null;

    public static class OooO00o<T> extends MediatorLiveData<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public LiveData<T> f466OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final T f467OooO0O0;

        public OooO00o(T t) {
            this.f467OooO0O0 = t;
        }

        public final void OooO00o(@NonNull MutableLiveData mutableLiveData) {
            LiveData<T> liveData = this.f466OooO00o;
            if (liveData != null) {
                super.removeSource(liveData);
            }
            this.f466OooO00o = mutableLiveData;
            super.addSource(mutableLiveData, new o0000OO0(this, 0));
        }

        @Override // androidx.lifecycle.MediatorLiveData
        public final <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<? super S> observer) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.lifecycle.LiveData
        public final T getValue() {
            LiveData<T> liveData = this.f466OooO00o;
            return liveData == null ? this.f467OooO0O0 : liveData.getValue();
        }
    }

    public o000(@NonNull String str, @NonNull oO00o000 oo00o000) throws CameraAccessExceptionCompat {
        str.getClass();
        this.f457OooO00o = str;
        oO000o00 oo000o00OooO0O0 = oo00o000.OooO0O0(str);
        this.f458OooO0O0 = oo000o00OooO0O0;
        this.f459OooO0OO = new OooOOO(this);
        this.f456OooO = o0000.OooO00o(oo000o00OooO0O0);
        this.f465OooOO0 = new oo00o(str);
        this.f463OooO0oO = new OooO00o<>(new OooO0O0(CameraState.Type.CLOSED, null));
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final void OooO(@NonNull o0ooOOo o0ooooo, @NonNull o00Oo0 o00oo1) {
        synchronized (this.f460OooO0Oo) {
            o0Oo0oo o0oo0oo2 = this.f462OooO0o0;
            if (o0oo0oo2 != null) {
                o0oo0oo2.f847OooO0OO.execute(new o00O0O(o0oo0oo2, o0ooooo, o00oo1));
            } else {
                if (this.f464OooO0oo == null) {
                    this.f464OooO0oo = new ArrayList();
                }
                this.f464OooO0oo.add(new Pair(o00oo1, o0ooooo));
            }
        }
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final Set<DynamicRange> OooO00o() {
        return OooO.OooO00o(this.f458OooO0O0).f399OooO00o.OooO00o();
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public final LiveData<CameraState> OooO0O0() {
        return this.f463OooO0oO;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int OooO0OO() {
        return OooOOO(0);
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final String OooO0Oo() {
        return this.f457OooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final List<Size> OooO0o(int i) {
        Size[] sizeArr;
        oOo00o0o ooo00o0oOooO0O0 = this.f458OooO0O0.OooO0O0();
        HashMap map = ooo00o0oOooO0O0.f998OooO0Oo;
        if (!map.containsKey(Integer.valueOf(i))) {
            Size[] sizeArrOooO00o = oO0OO00o.OooO00o.OooO00o(ooo00o0oOooO0O0.f995OooO00o.f971OooO00o, i);
            if (sizeArrOooO00o != null && sizeArrOooO00o.length > 0) {
                sizeArrOooO00o = ooo00o0oOooO0O0.f996OooO0O0.OooO00o(sizeArrOooO00o, i);
            }
            map.put(Integer.valueOf(i), sizeArrOooO00o);
            if (sizeArrOooO00o != null) {
                sizeArr = (Size[]) sizeArrOooO00o.clone();
            } else {
                sizeArr = null;
            }
        } else if (((Size[]) map.get(Integer.valueOf(i))) == null) {
            sizeArr = null;
        } else {
            sizeArr = (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.emptyList();
    }

    @Override // androidx.camera.core.CameraInfo
    public final int OooO0o0() {
        Integer num = (Integer) this.f458OooO0O0.OooO00o(CameraCharacteristics.LENS_FACING);
        OooOOO0.OooO0O0(num != null, "Unable to get the lens facing of the camera.");
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("The given lens facing integer: ", iIntValue, " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final oo0o0O0 OooO0oO() {
        return this.f456OooO;
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final List<Size> OooO0oo(int i) {
        Size[] sizeArrOooO00o = this.f458OooO0O0.OooO0O0().OooO00o(i);
        return sizeArrOooO00o != null ? Arrays.asList(sizeArrOooO00o) : Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final void OooOO0(@NonNull final o000oOoO o000oooo2) {
        synchronized (this.f460OooO0Oo) {
            final o0Oo0oo o0oo0oo2 = this.f462OooO0o0;
            if (o0oo0oo2 != null) {
                o0oo0oo2.f847OooO0OO.execute(new Runnable() { // from class: Oooo00O.Oooo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0Oo0oo.OooO00o oooO00o = o0oo0oo2.f863OooOo;
                        HashSet hashSet = oooO00o.f868OooO00o;
                        o000oOoO o000oooo3 = o000oooo2;
                        hashSet.remove(o000oooo3);
                        oooO00o.f869OooO0O0.remove(o000oooo3);
                    }
                });
                return;
            }
            ArrayList arrayList = this.f464OooO0oo;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Pair) it.next()).first == o000oooo2) {
                    it.remove();
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    public final o0Oo0oo OooOO0O() {
        return this;
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final Timebase OooOO0o() {
        Integer num = (Integer) this.f458OooO0O0.OooO00o(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? Timebase.UPTIME : Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int OooOOO(int i) {
        Integer num = (Integer) this.f458OooO0O0.OooO00o(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return OooOo.OooO00o(OooOo.OooO0O0(i), num.intValue(), 1 == OooO0o0());
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public final String OooOOO0() {
        return OooOOo0() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.impl.o0Oo0oo
    @NonNull
    public final o0000O OooOOOO() {
        return this.f465OooOO0;
    }

    @Override // androidx.camera.core.CameraInfo
    @NonNull
    public final LiveData<o0O0o> OooOOOo() {
        synchronized (this.f460OooO0Oo) {
            o0Oo0oo o0oo0oo2 = this.f462OooO0o0;
            if (o0oo0oo2 != null) {
                OooO00o<o0O0o> oooO00o = this.f461OooO0o;
                if (oooO00o != null) {
                    return oooO00o;
                }
                return o0oo0oo2.f845OooO.f822OooO0Oo;
            }
            if (this.f461OooO0o == null) {
                o0OO0o00.OooO0O0 oooO0O0OooO00o = o0OO0o00.OooO00o(this.f458OooO0O0);
                o0OO0o o0oo0o2 = new o0OO0o(oooO0O0OooO00o.OooO0o0(), oooO0O0OooO00o.OooO0OO());
                o0oo0o2.OooO0O0(1.0f);
                this.f461OooO0o = new OooO00o<>(o00Ooo.OooO0O0(o0oo0o2));
            }
            return this.f461OooO0o;
        }
    }

    public final void OooOOo(@NonNull o0Oo0oo o0oo0oo2) {
        String strOooO00o;
        synchronized (this.f460OooO0Oo) {
            this.f462OooO0o0 = o0oo0oo2;
            OooO00o<o0O0o> oooO00o = this.f461OooO0o;
            if (oooO00o != null) {
                oooO00o.OooO00o(o0oo0oo2.f845OooO.f822OooO0Oo);
            }
            ArrayList<Pair> arrayList = this.f464OooO0oo;
            if (arrayList != null) {
                for (Pair pair : arrayList) {
                    o0Oo0oo o0oo0oo3 = this.f462OooO0o0;
                    Executor executor = (Executor) pair.second;
                    o000oOoO o000oooo2 = (o000oOoO) pair.first;
                    o0oo0oo3.getClass();
                    o0oo0oo3.f847OooO0OO.execute(new o00O0O(o0oo0oo3, executor, o000oooo2));
                }
                this.f464OooO0oo = null;
            }
        }
        int iOooOOo0 = OooOOo0();
        if (iOooOOo0 == 0) {
            strOooO00o = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iOooOOo0 == 1) {
            strOooO00o = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iOooOOo0 == 2) {
            strOooO00o = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iOooOOo0 != 3) {
            strOooO00o = iOooOOo0 != 4 ? android.support.v4.media.OooO00o.OooO00o("Unknown value: ", iOooOOo0) : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else {
            strOooO00o = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        }
        o00O0O0.OooO0Oo("Camera2CameraInfo", "Device Level: " + strOooO00o);
    }

    public final int OooOOo0() {
        Integer num = (Integer) this.f458OooO0O0.OooO00o(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }
}
