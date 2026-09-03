package com.fasterxml.jackson.core;

import java.io.Serializable;
import java.util.Arrays;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class Base64Variant implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f10725OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final transient int[] f10726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient byte[] f10727OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient char[] f10728OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f10729OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final char f10730OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f10731OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final PaddingReadBehaviour f10732OooOO0O;

    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this.f10726OooO0Oo = iArr;
        char[] cArr = new char[64];
        this.f10728OooO0o0 = cArr;
        this.f10727OooO0o = new byte[64];
        this.f10729OooO0oO = str;
        this.f10731OooOO0 = z;
        this.f10730OooO0oo = c;
        this.f10725OooO = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("Base64Alphabet length must be exactly 64 (was ", length, ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = this.f10728OooO0o0[i2];
            this.f10727OooO0o[i2] = (byte) c2;
            this.f10726OooO0Oo[c2] = i2;
        }
        if (z) {
            this.f10726OooO0Oo[c] = -2;
        }
        this.f10732OooOO0O = z ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != Base64Variant.class) {
            return false;
        }
        Base64Variant base64Variant = (Base64Variant) obj;
        return base64Variant.f10730OooO0oo == this.f10730OooO0oo && base64Variant.f10725OooO == this.f10725OooO && base64Variant.f10731OooOO0 == this.f10731OooOO0 && base64Variant.f10732OooOO0O == this.f10732OooOO0O && this.f10729OooO0oO.equals(base64Variant.f10729OooO0oO);
    }

    public final int hashCode() {
        return this.f10729OooO0oO.hashCode();
    }

    public Object readResolve() {
        Base64Variant base64Variant = OooO00o.f10734OooO00o;
        String str = base64Variant.f10729OooO0oO;
        String str2 = this.f10729OooO0oO;
        if (!str.equals(str2)) {
            base64Variant = OooO00o.f10735OooO0O0;
            if (!base64Variant.f10729OooO0oO.equals(str2)) {
                base64Variant = OooO00o.f10736OooO0OO;
                if (!base64Variant.f10729OooO0oO.equals(str2)) {
                    base64Variant = OooO00o.f10737OooO0Oo;
                    if (!base64Variant.f10729OooO0oO.equals(str2)) {
                        throw new IllegalArgumentException(o00O00OO.OooO00o("No Base64Variant with name ", str2 == null ? "<null>" : o000oOoO.OooO00o("'", str2, "'")));
                    }
                }
            }
        }
        Base64Variant base64Variant2 = base64Variant;
        boolean z = this.f10731OooOO0;
        boolean z2 = base64Variant2.f10731OooOO0;
        return (z == z2 && this.f10730OooO0oo == base64Variant2.f10730OooO0oo && this.f10732OooOO0O == base64Variant2.f10732OooOO0O && this.f10725OooO == base64Variant2.f10725OooO && z == z2) ? base64Variant2 : new Base64Variant(base64Variant2, this.f10729OooO0oO, z, this.f10730OooO0oo, this.f10732OooOO0O, this.f10725OooO);
    }

    public final String toString() {
        return this.f10729OooO0oO;
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this(base64Variant, str, z, c, base64Variant.f10732OooOO0O, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, PaddingReadBehaviour paddingReadBehaviour, int i) {
        int[] iArr = new int[128];
        this.f10726OooO0Oo = iArr;
        char[] cArr = new char[64];
        this.f10728OooO0o0 = cArr;
        byte[] bArr = new byte[64];
        this.f10727OooO0o = bArr;
        this.f10729OooO0oO = str;
        byte[] bArr2 = base64Variant.f10727OooO0o;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.f10728OooO0o0;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.f10726OooO0Oo;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f10731OooOO0 = z;
        this.f10730OooO0oo = c;
        this.f10725OooO = i;
        this.f10732OooOO0O = paddingReadBehaviour;
    }
}
