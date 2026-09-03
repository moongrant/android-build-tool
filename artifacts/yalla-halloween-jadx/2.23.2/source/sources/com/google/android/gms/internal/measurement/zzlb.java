package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkx;
import com.google.android.gms.internal.measurement.zzlb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzlb<MessageType extends zzlb<MessageType, BuilderType>, BuilderType extends zzkx<MessageType, BuilderType>> extends zzjk<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zznl zzc = zznl.zzc();

    public static void OooO(Class cls, zzlb zzlbVar) {
        zzlbVar.OooO0oo();
        zza.put(cls, zzlbVar);
    }

    public static zzli OooO0o(zzli zzliVar) {
        int size = zzliVar.size();
        return zzliVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzlb OooO0o0(Class cls) {
        Map map = zza;
        zzlb zzlbVar = (zzlb) map.get(cls);
        if (zzlbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzlbVar = (zzlb) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzlbVar == null) {
            zzlbVar = (zzlb) ((zzlb) o0oo0000.OooO(cls)).OooOO0o(6);
            if (zzlbVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzlbVar);
        }
        return zzlbVar;
    }

    public static Object OooO0oO(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjk
    public final int OooO00o(oo0oO0 oo0oo0) {
        if (OooOO0O()) {
            int iOooO0OO = OooO0OO(oo0oo0);
            if (iOooO0OO >= 0) {
                return iOooO0OO;
            }
            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("serialized size must be non-negative, was ", iOooO0OO));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iOooO0OO2 = OooO0OO(oo0oo0);
        if (iOooO0OO2 < 0) {
            throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("serialized size must be non-negative, was ", iOooO0OO2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iOooO0OO2;
        return iOooO0OO2;
    }

    public final int OooO0OO(oo0oO0 oo0oo0) {
        if (oo0oo0 != null) {
            return oo0oo0.OooO0o0(this);
        }
        return o0O.f15041OooO0OO.OooO00o(getClass()).OooO0o0(this);
    }

    public final zzkx OooO0Oo() {
        return (zzkx) OooOO0o(5);
    }

    public final void OooO0oo() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void OooOO0() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean OooOO0O() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object OooOO0o(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return o0O.f15041OooO0OO.OooO00o(getClass()).OooO0oO(this, (zzlb) obj);
    }

    public final int hashCode() {
        if (OooOO0O()) {
            return o0O.f15041OooO0OO.OooO00o(getClass()).OooO0OO(this);
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iOooO0OO = o0O.f15041OooO0OO.OooO00o(getClass()).OooO0OO(this);
        this.zzb = iOooO0OO;
        return iOooO0OO;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = oo0OOoo.f15162OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        oo0OOoo.OooO0OO(this, sb, 0);
        return sb.toString();
    }

    public final zzkx zzbB() {
        zzkx zzkxVar = (zzkx) OooOO0o(5);
        zzkxVar.zzaB(this);
        return zzkxVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final /* synthetic */ zzmh zzbJ() {
        return (zzkx) OooOO0o(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final void zzbQ(zzki zzkiVar) throws IOException {
        oo0oO0 oo0oo0OooO00o = o0O.f15041OooO0OO.OooO00o(getClass());
        o0O0000O o0o0000o2 = zzkiVar.f15270OooO00o;
        if (o0o0000o2 == null) {
            o0o0000o2 = new o0O0000O(zzkiVar);
        }
        oo0oo0OooO00o.OooO0O0(this, o0o0000o2);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* synthetic */ zzmi zzbV() {
        return (zzlb) OooOO0o(6);
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final int zzbz() {
        int iOooO0OO;
        if (OooOO0O()) {
            iOooO0OO = OooO0OO(null);
            if (iOooO0OO < 0) {
                throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("serialized size must be non-negative, was ", iOooO0OO));
            }
        } else {
            iOooO0OO = this.zzd & Integer.MAX_VALUE;
            if (iOooO0OO == Integer.MAX_VALUE) {
                iOooO0OO = OooO0OO(null);
                if (iOooO0OO < 0) {
                    throw new IllegalStateException(android.support.v4.media.OooO00o.OooO00o("serialized size must be non-negative, was ", iOooO0OO));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iOooO0OO;
            }
        }
        return iOooO0OO;
    }
}
