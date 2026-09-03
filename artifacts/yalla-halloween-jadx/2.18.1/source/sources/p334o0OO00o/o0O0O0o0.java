package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzkm;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0O0o0 f37391OooO0OO = new o0O0O0o0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f37393OooO0O0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O00O0o f37392OooO00o = new o0O00O0o();

    public final o0O0OOOo OooO00o(Class cls) {
        o0O0O0O o0o0o0o;
        Class cls2;
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(cls, "messageType");
        o0O0OOOo o0o0ooooOooOoOO = (o0O0OOOo) this.f37393OooO0O0.get(cls);
        if (o0o0ooooOooOoOO == null) {
            o0O00O0o o0o00o0o = this.f37392OooO00o;
            Objects.requireNonNull(o0o00o0o);
            Class cls3 = oo0OOoo.f37460OooO00o;
            if (!zzke.class.isAssignableFrom(cls) && (cls2 = oo0OOoo.f37460OooO00o) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            o0O00OOO o0o00oooOooO00o = o0o00o0o.f37367OooO00o.OooO00o(cls);
            if (o0o00oooOooO00o.zzb()) {
                if (zzke.class.isAssignableFrom(cls)) {
                    o0OO00OO o0oo00oo2 = oo0OOoo.f37463OooO0Oo;
                    oo00oO oo00oo = o0oOOo.f37448OooO00o;
                    o0o0o0o = new o0O0O0O(o0oo00oo2, o0oOOo.f37448OooO00o, o0o00oooOooO00o.zza());
                } else {
                    oo0ooO oo0ooo = oo0OOoo.f37461OooO0O0;
                    o0O00o0 o0o00o1 = o0oOOo.f37449OooO0O0;
                    if (o0o00o1 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    o0o0o0o = new o0O0O0O(oo0ooo, o0o00o1, o0o00oooOooO00o.zza());
                }
                o0o0ooooOooOoOO = o0o0o0o;
            } else {
                if (zzke.class.isAssignableFrom(cls)) {
                    if (o0o00oooOooO00o.zzc() == 1) {
                        o0oO0O0o o0oo0o0o2 = o0O0oo0o.f37409OooO0O0;
                        o0OoOoOo o0oooooo2 = o0O000Oo.f37362OooO0O0;
                        o0OO00OO o0oo00oo3 = oo0OOoo.f37463OooO0Oo;
                        oo00oO oo00oo2 = o0oOOo.f37448OooO00o;
                        o0o0ooooOooOoOO = o0O00oO0.OooOoOO(o0o00oooOooO00o, o0oo0o0o2, o0oooooo2, o0oo00oo3, o0oOOo.f37448OooO00o, o0O00OO.f37369OooO0O0);
                    } else {
                        o0o0ooooOooOoOO = o0O00oO0.OooOoOO(o0o00oooOooO00o, o0O0oo0o.f37409OooO0O0, o0O000Oo.f37362OooO0O0, oo0OOoo.f37463OooO0Oo, null, o0O00OO.f37369OooO0O0);
                    }
                } else {
                    if (o0o00oooOooO00o.zzc() == 1) {
                        o0oO0O0o o0oo0o0o3 = o0O0oo0o.f37408OooO00o;
                        o0O000O o0o000o = o0O000Oo.f37361OooO00o;
                        oo0ooO oo0ooo2 = oo0OOoo.f37461OooO0O0;
                        o0O00o0 o0o00o2 = o0oOOo.f37449OooO0O0;
                        if (o0o00o2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        o0o0ooooOooOoOO = o0O00oO0.OooOoOO(o0o00oooOooO00o, o0oo0o0o3, o0o000o, oo0ooo2, o0o00o2, o0O00OO.f37368OooO00o);
                    } else {
                        o0o0ooooOooOoOO = o0O00oO0.OooOoOO(o0o00oooOooO00o, o0O0oo0o.f37408OooO00o, o0O000Oo.f37361OooO00o, oo0OOoo.f37462OooO0OO, null, o0O00OO.f37368OooO00o);
                    }
                }
            }
            o0O0OOOo o0o0oooo = (o0O0OOOo) this.f37393OooO0O0.putIfAbsent(cls, o0o0ooooOooOoOO);
            if (o0o0oooo != null) {
                return o0o0oooo;
            }
        }
        return o0o0ooooOooOoOO;
    }
}
