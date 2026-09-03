package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O f15041OooO0OO = new o0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f15043OooO0O0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O0Oo f15042OooO00o = new o0O0O0Oo();

    public final oo0oO0 OooO00o(Class cls) {
        o0O0o00O o0o0o00o;
        Class cls2;
        Charset charset = zzlj.f15277OooO00o;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f15043OooO0O0;
        oo0oO0 oo0oo0OooOoo0 = (oo0oO0) concurrentHashMap.get(cls);
        if (oo0oo0OooOoo0 == null) {
            o0O0O0Oo o0o0o0oo = this.f15042OooO00o;
            o0o0o0oo.getClass();
            Class cls3 = oo0ooO.f15166OooO00o;
            if (!zzlb.class.isAssignableFrom(cls) && (cls2 = oo0ooO.f15166OooO00o) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            o0O0OOO0 o0o0ooo0OooO00o = o0o0o0oo.f15075OooO00o.OooO00o(cls);
            if (o0o0ooo0OooO00o.zzb()) {
                if (zzlb.class.isAssignableFrom(cls)) {
                    o0o0o00o = new o0O0o00O(oo0ooO.f15168OooO0OO, o0O000o0.f15055OooO00o, o0o0ooo0OooO00o.zza());
                } else {
                    o0OOO00 o0ooo00 = oo0ooO.f15167OooO0O0;
                    o0OoOoOo o0oooooo = o0O000o0.f15056OooO0O0;
                    if (o0oooooo == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    o0o0o00o = new o0O0o00O(o0ooo00, o0oooooo, o0o0ooo0OooO00o.zza());
                }
                oo0oo0OooOoo0 = o0o0o00o;
            } else {
                if (zzlb.class.isAssignableFrom(cls)) {
                    if (o0o0ooo0OooO00o.zzc() == 1) {
                        int i = o0oOo0O0.f15141OooO00o;
                        o0oO0Ooo o0oo0ooo2 = o0O00o00.f15068OooO0O0;
                        o0OOO0 o0ooo1 = oo0ooO.f15168OooO0OO;
                        o0O000Oo o0o000oo2 = o0O000o0.f15055OooO00o;
                        int i2 = o0O0OO0.f15076OooO00o;
                        oo0oo0OooOoo0 = o0O0o000.OooOoo0(o0o0ooo0OooO00o, o0oo0ooo2, o0ooo1, o0o000oo2);
                    } else {
                        int i3 = o0oOo0O0.f15141OooO00o;
                        o0oO0Ooo o0oo0ooo3 = o0O00o00.f15068OooO0O0;
                        o0OOO0 o0ooo2 = oo0ooO.f15168OooO0OO;
                        int i4 = o0O0OO0.f15076OooO00o;
                        oo0oo0OooOoo0 = o0O0o000.OooOoo0(o0o0ooo0OooO00o, o0oo0ooo3, o0ooo2, null);
                    }
                } else {
                    if (o0o0ooo0OooO00o.zzc() == 1) {
                        int i5 = o0oOo0O0.f15141OooO00o;
                        o0O00OOO o0o00ooo2 = o0O00o00.f15067OooO00o;
                        o0OOO00 o0ooo01 = oo0ooO.f15167OooO0O0;
                        o0OoOoOo o0oooooo2 = o0O000o0.f15056OooO0O0;
                        if (o0oooooo2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        int i6 = o0O0OO0.f15076OooO00o;
                        oo0oo0OooOoo0 = o0O0o000.OooOoo0(o0o0ooo0OooO00o, o0o00ooo2, o0ooo01, o0oooooo2);
                    } else {
                        int i7 = o0oOo0O0.f15141OooO00o;
                        o0O00OOO o0o00ooo3 = o0O00o00.f15067OooO00o;
                        o0OOO00 o0ooo02 = oo0ooO.f15167OooO0O0;
                        int i8 = o0O0OO0.f15076OooO00o;
                        oo0oo0OooOoo0 = o0O0o000.OooOoo0(o0o0ooo0OooO00o, o0o00ooo3, o0ooo02, null);
                    }
                }
            }
            oo0oO0 oo0oo0 = (oo0oO0) concurrentHashMap.putIfAbsent(cls, oo0oo0OooOoo0);
            if (oo0oo0 != null) {
                return oo0oo0;
            }
        }
        return oo0oo0OooOoo0;
    }
}
