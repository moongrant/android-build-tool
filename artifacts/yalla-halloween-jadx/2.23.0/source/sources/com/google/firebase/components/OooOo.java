package com.google.firebase.components;

import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Qualified<?> f19819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f19820OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f19821OooO0OO;

    public OooOo(int i, int i2, Class cls) {
        this((Qualified<?>) Qualified.OooO00o(cls), i, i2);
    }

    public static OooOo OooO00o(Class<?> cls) {
        return new OooOo(0, 1, cls);
    }

    public static OooOo OooO0O0(Class<?> cls) {
        return new OooOo(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f19819OooO00o.equals(oooOo.f19819OooO00o) && this.f19820OooO0O0 == oooOo.f19820OooO0O0 && this.f19821OooO0OO == oooOo.f19821OooO0OO;
    }

    public final int hashCode() {
        return ((((this.f19819OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f19820OooO0O0) * 1000003) ^ this.f19821OooO0OO;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f19819OooO00o);
        sb.append(", type=");
        int i = this.f19820OooO0O0;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f19821OooO0OO;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(android.support.v4.media.OooO00o.OooO00o("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return o0O00o0.OooO0O0(sb, str2, "}");
    }

    public OooOo(Qualified<?> qualified, int i, int i2) {
        this.f19819OooO00o = qualified;
        this.f19820OooO0O0 = i;
        this.f19821OooO0OO = i2;
    }
}
