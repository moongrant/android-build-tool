package androidx.media3.common;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o00OOO0O;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0OO f6348OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f6351OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6352OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f6353OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f6341OooOO0 = new OooO00o(0, 0, 1, 1, 0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f6342OooOO0O = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f6343OooOO0o = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f6345OooOOO0 = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f6344OooOOO = o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f6346OooOOOO = o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @UnstableApi
    public static final o00OOO0O f6347OooOOOo = new o00OOO0O();

    /* JADX INFO: renamed from: androidx.media3.common.OooO00o$OooO00o, reason: collision with other inner class name */
    @RequiresApi(29)
    public static final class C0137OooO00o {
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
        public final AudioAttributes f6354OooO00o;

        public OooO0OO(OooO00o oooO00o) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(oooO00o.f6349OooO0Oo).setFlags(oooO00o.f6351OooO0o0).setUsage(oooO00o.f6350OooO0o);
            int i = o00.f34910OooO00o;
            if (i >= 29) {
                C0137OooO00o.OooO00o(usage, oooO00o.f6352OooO0oO);
            }
            if (i >= 32) {
                OooO0O0.OooO00o(usage, oooO00o.f6353OooO0oo);
            }
            this.f6354OooO00o = usage.build();
        }
    }

    public OooO00o(int i, int i2, int i3, int i4, int i5) {
        this.f6349OooO0Oo = i;
        this.f6351OooO0o0 = i2;
        this.f6350OooO0o = i3;
        this.f6352OooO0oO = i4;
        this.f6353OooO0oo = i5;
    }

    @RequiresApi(21)
    public final OooO0OO OooO0OO() {
        if (this.f6348OooO == null) {
            this.f6348OooO = new OooO0OO(this);
        }
        return this.f6348OooO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO00o.class != obj.getClass()) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f6349OooO0Oo == oooO00o.f6349OooO0Oo && this.f6351OooO0o0 == oooO00o.f6351OooO0o0 && this.f6350OooO0o == oooO00o.f6350OooO0o && this.f6352OooO0oO == oooO00o.f6352OooO0oO && this.f6353OooO0oo == oooO00o.f6353OooO0oo;
    }

    public final int hashCode() {
        return ((((((((527 + this.f6349OooO0Oo) * 31) + this.f6351OooO0o0) * 31) + this.f6350OooO0o) * 31) + this.f6352OooO0oO) * 31) + this.f6353OooO0oo;
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6342OooOO0O, this.f6349OooO0Oo);
        bundle.putInt(f6343OooOO0o, this.f6351OooO0o0);
        bundle.putInt(f6345OooOOO0, this.f6350OooO0o);
        bundle.putInt(f6344OooOOO, this.f6352OooO0oO);
        bundle.putInt(f6346OooOOOO, this.f6353OooO0oo);
        return bundle;
    }
}
