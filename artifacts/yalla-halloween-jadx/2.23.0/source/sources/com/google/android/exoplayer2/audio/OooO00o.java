package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o implements com.google.android.exoplayer2.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0OO f11586OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f11587OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f11588OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f11589OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f11590OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f11591OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f11580OooOO0 = new OooO00o(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f11581OooOO0O = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f11582OooOO0o = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f11584OooOOO0 = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f11583OooOOO = o0O00.Oooo00O(3);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f11585OooOOOO = o0O00.Oooo00O(4);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(29)
    public static final class C0199OooO00o {
        @DoNotInline
        public static void OooO00o(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    @RequiresApi(32)
    public static final class OooO0O0 {
        @DoNotInline
        public static void OooO00o(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    @RequiresApi(21)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioAttributes f11592OooO00o;

        public OooO0OO(OooO00o oooO00o) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(oooO00o.f11587OooO0Oo).setFlags(oooO00o.f11589OooO0o0).setUsage(oooO00o.f11588OooO0o);
            int i = o0O00.f40595OooO00o;
            if (i >= 29) {
                C0199OooO00o.OooO00o(usage, oooO00o.f11590OooO0oO);
            }
            if (i >= 32) {
                OooO0O0.OooO00o(usage, oooO00o.f11591OooO0oo);
            }
            this.f11592OooO00o = usage.build();
        }
    }

    public OooO00o(int i, int i2, int i3, int i4, int i5) {
        this.f11587OooO0Oo = i;
        this.f11589OooO0o0 = i2;
        this.f11588OooO0o = i3;
        this.f11590OooO0oO = i4;
        this.f11591OooO0oo = i5;
    }

    @RequiresApi(21)
    public final OooO0OO OooO00o() {
        if (this.f11586OooO == null) {
            this.f11586OooO = new OooO0OO(this);
        }
        return this.f11586OooO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO00o.class != obj.getClass()) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f11587OooO0Oo == oooO00o.f11587OooO0Oo && this.f11589OooO0o0 == oooO00o.f11589OooO0o0 && this.f11588OooO0o == oooO00o.f11588OooO0o && this.f11590OooO0oO == oooO00o.f11590OooO0oO && this.f11591OooO0oo == oooO00o.f11591OooO0oo;
    }

    public final int hashCode() {
        return ((((((((527 + this.f11587OooO0Oo) * 31) + this.f11589OooO0o0) * 31) + this.f11588OooO0o) * 31) + this.f11590OooO0oO) * 31) + this.f11591OooO0oo;
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f11581OooOO0O, this.f11587OooO0Oo);
        bundle.putInt(f11582OooOO0o, this.f11589OooO0o0);
        bundle.putInt(f11584OooOOO0, this.f11588OooO0o);
        bundle.putInt(f11583OooOOO, this.f11590OooO0oO);
        bundle.putInt(f11585OooOOOO, this.f11591OooO0oo);
        return bundle;
    }
}
