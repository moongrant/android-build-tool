package com.google.firebase.components;

import com.zego.zegoavkit2.ZegoConstants;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class Qualified<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? extends Annotation> f19832OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Class<T> f19833OooO0O0;

    public @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f19832OooO00o = cls;
        this.f19833OooO0O0 = cls2;
    }

    public static <T> Qualified<T> OooO00o(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (this.f19833OooO0O0.equals(qualified.f19833OooO0O0)) {
            return this.f19832OooO00o.equals(qualified.f19832OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19832OooO00o.hashCode() + (this.f19833OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f19833OooO0O0;
        Class<? extends Annotation> cls2 = this.f19832OooO00o;
        if (cls2 == Unqualified.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + cls.getName();
    }
}
