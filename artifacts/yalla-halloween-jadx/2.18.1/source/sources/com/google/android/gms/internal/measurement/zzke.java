package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzke;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p334o0OO00o.o00OOOOo;
import p334o0OO00o.o0O00o00;
import p334o0OO00o.o0O0O0o0;
import p334o0OO00o.o0O0OOOo;
import p334o0OO00o.o0OO0oO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzke<MessageType extends zzke<MessageType, BuilderType>, BuilderType extends zzka<MessageType, BuilderType>> extends zzin<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    public zzmo zzc = zzmo.zzc();
    public int zzd = -1;

    public static zzke OooO(Class cls) {
        Map map = zza;
        zzke zzkeVar = (zzke) map.get(cls);
        if (zzkeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkeVar = (zzke) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzkeVar == null) {
            zzkeVar = (zzke) ((zzke) o0OO0oO0.OooO(cls)).OooOO0(6);
            if (zzkeVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzkeVar);
        }
        return zzkeVar;
    }

    public static zzkk OooO0Oo(zzkk zzkkVar) {
        int size = zzkkVar.size();
        return zzkkVar.zze(size == 0 ? 10 : size + size);
    }

    public static Object OooO0o(Method method, Object obj, Object... objArr) {
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

    public static zzkl OooO0o0(zzkl zzklVar) {
        int size = zzklVar.size();
        return zzklVar.zzd(size == 0 ? 10 : size + size);
    }

    public static void OooO0oO(Class cls, zzke zzkeVar) {
        zza.put(cls, zzkeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzin
    public final int OooO00o() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzin
    public final void OooO0OO(int i) {
        this.zzd = i;
    }

    public final zzka OooO0oo() {
        return (zzka) OooOO0(5);
    }

    public abstract Object OooOO0(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return o0O0O0o0.f37391OooO0OO.OooO00o(getClass()).OooO0oo(this, (zzke) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iOooO0o0 = o0O0O0o0.f37391OooO0OO.OooO00o(getClass()).OooO0o0(this);
        this.zzb = iOooO0o0;
        return iOooO0o0;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        o0O00o00.OooO0OO(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzlk zzbF() {
        return (zzka) OooOO0(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzlk zzbG() {
        zzka zzkaVar = (zzka) OooOO0(5);
        zzkaVar.zzaC(this);
        return zzkaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzbK(zzjl zzjlVar) throws IOException {
        o0O0OOOo o0o0ooooOooO00o = o0O0O0o0.f37391OooO0OO.OooO00o(getClass());
        o00OOOOo o00ooooo2 = zzjlVar.f15972OooO00o;
        if (o00ooooo2 == null) {
            o00ooooo2 = new o00OOOOo(zzjlVar);
        }
        o0o0ooooOooO00o.OooO0OO(this, o00ooooo2);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzll zzbO() {
        return (zzke) OooOO0(6);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzbw() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int iOooO0o = o0O0O0o0.f37391OooO0OO.OooO00o(getClass()).OooO0o(this);
        this.zzd = iOooO0o;
        return iOooO0o;
    }

    public final zzka zzby() {
        zzka zzkaVar = (zzka) OooOO0(5);
        zzkaVar.zzaC(this);
        return zzkaVar;
    }
}
