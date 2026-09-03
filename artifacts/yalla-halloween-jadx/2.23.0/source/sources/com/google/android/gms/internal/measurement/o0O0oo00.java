package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0oo00 f15553OooO0OO = new o0O0oo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f15555OooO0O0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0oo0o f15554OooO00o = new o0O0oo0o();

    public final o0OO000o OooO00o(Class cls) {
        o0O0o000 o0o0o000;
        Class cls2;
        Charset charset = zzlj.f15753OooO00o;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f15555OooO0O0;
        o0OO000o o0oo000oOooOoo0 = (o0OO000o) concurrentHashMap.get(cls);
        if (o0oo000oOooOoo0 == null) {
            o0O0oo0o o0o0oo0o = this.f15554OooO00o;
            o0o0oo0o.getClass();
            Class cls3 = oo0oO0.f15639OooO00o;
            if (!zzlb.class.isAssignableFrom(cls) && (cls2 = oo0oO0.f15639OooO00o) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            o0O0OO0 o0o0oo0OooO00o = o0o0oo0o.f15557OooO00o.OooO00o(cls);
            if (o0o0oo0OooO00o.zzb()) {
                if (zzlb.class.isAssignableFrom(cls)) {
                    o0o0o000 = new o0O0o000(oo0oO0.f15641OooO0OO, o0O000Oo.f15527OooO00o, o0o0oo0OooO00o.zza());
                } else {
                    o0OOO00 o0ooo00 = oo0oO0.f15640OooO0O0;
                    o0O000O o0o000o = o0O000Oo.f15528OooO0O0;
                    if (o0o000o == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    o0o0o000 = new o0O0o000(o0ooo00, o0o000o, o0o0oo0OooO00o.zza());
                }
                o0oo000oOooOoo0 = o0o0o000;
            } else {
                if (zzlb.class.isAssignableFrom(cls)) {
                    if (o0o0oo0OooO00o.zzc() == 1) {
                        int i = o0O0o0.f15548OooO00o;
                        o0O00OOO o0o00ooo2 = o0oO0Ooo.f15597OooO0O0;
                        o0OOO0 o0ooo1 = oo0oO0.f15641OooO0OO;
                        o0OoOoOo o0oooooo = o0O000Oo.f15527OooO00o;
                        int i2 = o0O0O0o0.f15544OooO00o;
                        o0oo000oOooOoo0 = oo0OOoo.OooOoo0(o0o0oo0OooO00o, o0o00ooo2, o0ooo1, o0oooooo);
                    } else {
                        int i3 = o0O0o0.f15548OooO00o;
                        o0O00OOO o0o00ooo3 = o0oO0Ooo.f15597OooO0O0;
                        o0OOO0 o0ooo2 = oo0oO0.f15641OooO0OO;
                        int i4 = o0O0O0o0.f15544OooO00o;
                        o0oo000oOooOoo0 = oo0OOoo.OooOoo0(o0o0oo0OooO00o, o0o00ooo3, o0ooo2, null);
                    }
                } else {
                    if (o0o0oo0OooO00o.zzc() == 1) {
                        int i5 = o0O0o0.f15548OooO00o;
                        o0O00OO o0o00oo2 = o0oO0Ooo.f15596OooO00o;
                        o0OOO00 o0ooo01 = oo0oO0.f15640OooO0O0;
                        o0O000O o0o000o2 = o0O000Oo.f15528OooO0O0;
                        if (o0o000o2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        int i6 = o0O0O0o0.f15544OooO00o;
                        o0oo000oOooOoo0 = oo0OOoo.OooOoo0(o0o0oo0OooO00o, o0o00oo2, o0ooo01, o0o000o2);
                    } else {
                        int i7 = o0O0o0.f15548OooO00o;
                        o0O00OO o0o00oo3 = o0oO0Ooo.f15596OooO00o;
                        o0OOO00 o0ooo02 = oo0oO0.f15640OooO0O0;
                        int i8 = o0O0O0o0.f15544OooO00o;
                        o0oo000oOooOoo0 = oo0OOoo.OooOoo0(o0o0oo0OooO00o, o0o00oo3, o0ooo02, null);
                    }
                }
            }
            o0OO000o o0oo000o = (o0OO000o) concurrentHashMap.putIfAbsent(cls, o0oo000oOooOoo0);
            if (o0oo000o != null) {
                return o0oo000o;
            }
        }
        return o0oo000oOooOoo0;
    }
}
