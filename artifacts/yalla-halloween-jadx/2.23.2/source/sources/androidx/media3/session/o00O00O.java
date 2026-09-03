package androidx.media3.session;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final String f9333Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final o00O00O f9334Oooo0;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final String f9335Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final String f9336Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final String f9337Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final String f9338Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final String f9339Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String f9340Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final String f9341OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final String f9342OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final String f9343OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final String f9344OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final String f9345OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final String f9346OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public static final String f9347OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final String f9348OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static final String f9349OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final String f9350OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final String f9351Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final String f9352Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final String f9353OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final String f9354OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final String f9355OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final String f9356Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final String f9357Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final String f9358OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final String f9359Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final String f9360o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final String f9361o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final String f9362o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final o00O00 f9363o00Ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public static final String f9364o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final String f9365ooOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f9366OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final PlaybackException f9367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O0O00 f9368OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9369OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Player.OooO0o f9370OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Player.OooO0o f9371OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final androidx.media3.common.OooOOOO f9372OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f9373OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f9374OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f9375OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final androidx.media3.common.Oooo0 f9376OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final androidx.media3.common.o00Ooo f9377OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final MediaMetadata f9378OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final androidx.media3.common.OooO00o f9379OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f9380OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o000O000.OooO0O0 f9381OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f9382OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f9383OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final DeviceInfo f9384OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f9385OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f9386OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f9387OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f9388OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f9389OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final MediaMetadata f9390OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f9391OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f9392OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final long f9393OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final long f9394Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final androidx.media3.common.o00Oo0 f9395Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final androidx.media3.common.o00O0O f9396Oooo00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f9397OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public PlaybackException f9398OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f9399OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00O0O00 f9400OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Player.OooO0o f9401OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f9402OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Player.OooO0o f9403OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public androidx.media3.common.OooOOOO f9404OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f9405OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public androidx.media3.common.Oooo0 f9406OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f9407OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final androidx.media3.common.o00Ooo f9408OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final float f9409OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final MediaMetadata f9410OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final androidx.media3.common.OooO00o f9411OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final o000O000.OooO0O0 f9412OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final int f9413OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final DeviceInfo f9414OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final boolean f9415OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f9416OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f9417OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f9418OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public boolean f9419OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final boolean f9420OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final MediaMetadata f9421OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f9422OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final long f9423OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public final long f9424OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final long f9425OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public androidx.media3.common.o00Oo0 f9426OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public androidx.media3.common.o00O0O f9427OooOooo;

        public OooO00o(o00O00O o00o00o2) {
            this.f9398OooO00o = o00o00o2.f9367OooO0Oo;
            this.f9399OooO0O0 = o00o00o2.f9369OooO0o0;
            this.f9400OooO0OO = o00o00o2.f9368OooO0o;
            this.f9401OooO0Oo = o00o00o2.f9370OooO0oO;
            this.f9403OooO0o0 = o00o00o2.f9371OooO0oo;
            this.f9402OooO0o = o00o00o2.f9366OooO;
            this.f9404OooO0oO = o00o00o2.f9372OooOO0;
            this.f9405OooO0oo = o00o00o2.f9373OooOO0O;
            this.f9397OooO = o00o00o2.f9374OooOO0o;
            this.f9406OooOO0 = o00o00o2.f9376OooOOO0;
            this.f9407OooOO0O = o00o00o2.f9375OooOOO;
            this.f9408OooOO0o = o00o00o2.f9377OooOOOO;
            this.f9410OooOOO0 = o00o00o2.f9378OooOOOo;
            this.f9409OooOOO = o00o00o2.f9380OooOOo0;
            this.f9411OooOOOO = o00o00o2.f9379OooOOo;
            this.f9412OooOOOo = o00o00o2.f9381OooOOoo;
            this.f9414OooOOo0 = o00o00o2.f9384OooOo00;
            this.f9413OooOOo = o00o00o2.f9383OooOo0;
            this.f9415OooOOoo = o00o00o2.f9385OooOo0O;
            this.f9418OooOo00 = o00o00o2.f9386OooOo0o;
            this.f9417OooOo0 = o00o00o2.f9382OooOo;
            this.f9419OooOo0O = o00o00o2.f9388OooOoO0;
            this.f9420OooOo0o = o00o00o2.f9387OooOoO;
            this.f9416OooOo = o00o00o2.f9389OooOoOO;
            this.f9422OooOoO0 = o00o00o2.f9391OooOoo0;
            this.f9421OooOoO = o00o00o2.f9390OooOoo;
            this.f9423OooOoOO = o00o00o2.f9392OooOooO;
            this.f9425OooOoo0 = o00o00o2.f9393OooOooo;
            this.f9424OooOoo = o00o00o2.f9394Oooo000;
            this.f9426OooOooO = o00o00o2.f9395Oooo00O;
            this.f9427OooOooo = o00o00o2.f9396Oooo00o;
        }

        public final o00O00O OooO00o() {
            p080o000OoO.o00Oo0.OooO0Oo(this.f9406OooOO0.OooOo00() || this.f9400OooO0OO.f9447OooO0Oo.f6718OooO0o0 < this.f9406OooOO0.OooOOoo());
            return new o00O00O(this.f9398OooO00o, this.f9399OooO0O0, this.f9400OooO0OO, this.f9401OooO0Oo, this.f9403OooO0o0, this.f9402OooO0o, this.f9404OooO0oO, this.f9405OooO0oo, this.f9397OooO, this.f9408OooOO0o, this.f9406OooOO0, this.f9407OooOO0O, this.f9410OooOOO0, this.f9409OooOOO, this.f9411OooOOOO, this.f9412OooOOOo, this.f9414OooOOo0, this.f9413OooOOo, this.f9415OooOOoo, this.f9418OooOo00, this.f9417OooOo0, this.f9416OooOo, this.f9422OooOoO0, this.f9419OooOo0O, this.f9420OooOo0o, this.f9421OooOoO, this.f9423OooOoOO, this.f9425OooOoo0, this.f9424OooOoo, this.f9426OooOooO, this.f9427OooOooo);
        }
    }

    public static class OooO0O0 implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final String f9428OooO0o = p080o000OoO.o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final String f9429OooO0oO = p080o000OoO.o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f9430OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f9431OooO0o0;

        static {
            new androidx.media3.session.OooO00o(1);
        }

        public OooO0O0(boolean z, boolean z2) {
            this.f9430OooO0Oo = z;
            this.f9431OooO0o0 = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f9430OooO0Oo == oooO0O0.f9430OooO0Oo && this.f9431OooO0o0 == oooO0O0.f9431OooO0o0;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9430OooO0Oo), Boolean.valueOf(this.f9431OooO0o0)});
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBoolean(f9428OooO0o, this.f9430OooO0Oo);
            bundle.putBoolean(f9429OooO0oO, this.f9431OooO0o0);
            return bundle;
        }
    }

    static {
        o00O0O00 o00o0o01 = o00O0O00.f9434OooOOOO;
        Player.OooO0o oooO0o = o00O0O00.f9433OooOOO;
        androidx.media3.common.OooOOOO oooOOOO = androidx.media3.common.OooOOOO.f6616OooO0oO;
        androidx.media3.common.o00Ooo o00ooo2 = androidx.media3.common.o00Ooo.f6864OooO0oo;
        androidx.media3.common.Oooo0.OooO00o oooO00o = androidx.media3.common.Oooo0.f6629OooO0Oo;
        MediaMetadata mediaMetadata = MediaMetadata.f6236Oooo0o0;
        f9334Oooo0 = new o00O00O(null, 0, o00o0o01, oooO0o, oooO0o, 0, oooOOOO, 0, false, o00ooo2, oooO00o, 0, mediaMetadata, 1.0f, androidx.media3.common.OooO00o.f6341OooOO0, o000O000.OooO0O0.f33949OooO0o, DeviceInfo.f6212OooO0oo, 0, false, false, 1, 0, 1, false, false, mediaMetadata, 0L, 0L, 0L, androidx.media3.common.o00Oo0.f6850OooO0o0, androidx.media3.common.o00O0O.f6770OooOooO);
        f9335Oooo0O0 = p080o000OoO.o00.Oooo00o(1);
        f9336Oooo0OO = p080o000OoO.o00.Oooo00o(2);
        f9338Oooo0o0 = p080o000OoO.o00.Oooo00o(3);
        f9337Oooo0o = p080o000OoO.o00.Oooo00o(4);
        f9339Oooo0oO = p080o000OoO.o00.Oooo00o(5);
        f9340Oooo0oo = p080o000OoO.o00.Oooo00o(6);
        f9333Oooo = p080o000OoO.o00.Oooo00o(7);
        f9343OoooO00 = p080o000OoO.o00.Oooo00o(8);
        f9342OoooO0 = p080o000OoO.o00.Oooo00o(9);
        f9344OoooO0O = p080o000OoO.o00.Oooo00o(10);
        f9341OoooO = p080o000OoO.o00.Oooo00o(11);
        f9345OoooOO0 = p080o000OoO.o00.Oooo00o(12);
        f9360o000oOoO = p080o000OoO.o00.Oooo00o(13);
        f9346OoooOOO = p080o000OoO.o00.Oooo00o(14);
        f9347OoooOOo = p080o000OoO.o00.Oooo00o(15);
        f9348OoooOo0 = p080o000OoO.o00.Oooo00o(16);
        f9349OoooOoO = p080o000OoO.o00.Oooo00o(17);
        f9350OoooOoo = p080o000OoO.o00.Oooo00o(18);
        f9351Ooooo00 = p080o000OoO.o00.Oooo00o(19);
        f9352Ooooo0o = p080o000OoO.o00.Oooo00o(20);
        f9353OooooO0 = p080o000OoO.o00.Oooo00o(21);
        f9354OooooOO = p080o000OoO.o00.Oooo00o(22);
        f9355OooooOo = p080o000OoO.o00.Oooo00o(23);
        f9357Oooooo0 = p080o000OoO.o00.Oooo00o(24);
        f9356Oooooo = p080o000OoO.o00.Oooo00o(25);
        f9358OoooooO = p080o000OoO.o00.Oooo00o(26);
        f9359Ooooooo = p080o000OoO.o00.Oooo00o(27);
        f9364o0OoOo0 = p080o000OoO.o00.Oooo00o(28);
        f9365ooOO = p080o000OoO.o00.Oooo00o(29);
        f9361o00O0O = p080o000OoO.o00.Oooo00o(30);
        f9362o00Oo0 = p080o000OoO.o00.Oooo00o(31);
        f9363o00Ooo = new o00O00();
    }

    public o00O00O(@Nullable PlaybackException playbackException, int i, o00O0O00 o00o0o01, Player.OooO0o oooO0o, Player.OooO0o oooO0o2, int i2, androidx.media3.common.OooOOOO oooOOOO, int i3, boolean z, androidx.media3.common.o00Ooo o00ooo2, androidx.media3.common.Oooo0 oooo0, int i4, MediaMetadata mediaMetadata, float f, androidx.media3.common.OooO00o oooO00o, o000O000.OooO0O0 oooO0O0, DeviceInfo deviceInfo, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, MediaMetadata mediaMetadata2, long j, long j2, long j3, androidx.media3.common.o00Oo0 o00oo1, androidx.media3.common.o00O0O o00o0o2) {
        this.f9367OooO0Oo = playbackException;
        this.f9369OooO0o0 = i;
        this.f9368OooO0o = o00o0o01;
        this.f9370OooO0oO = oooO0o;
        this.f9371OooO0oo = oooO0o2;
        this.f9366OooO = i2;
        this.f9372OooOO0 = oooOOOO;
        this.f9373OooOO0O = i3;
        this.f9374OooOO0o = z;
        this.f9377OooOOOO = o00ooo2;
        this.f9376OooOOO0 = oooo0;
        this.f9375OooOOO = i4;
        this.f9378OooOOOo = mediaMetadata;
        this.f9380OooOOo0 = f;
        this.f9379OooOOo = oooO00o;
        this.f9381OooOOoo = oooO0O0;
        this.f9384OooOo00 = deviceInfo;
        this.f9383OooOo0 = i5;
        this.f9385OooOo0O = z2;
        this.f9386OooOo0o = z3;
        this.f9382OooOo = i6;
        this.f9389OooOoOO = i7;
        this.f9391OooOoo0 = i8;
        this.f9388OooOoO0 = z4;
        this.f9387OooOoO = z5;
        this.f9390OooOoo = mediaMetadata2;
        this.f9392OooOooO = j;
        this.f9393OooOooo = j2;
        this.f9394Oooo000 = j3;
        this.f9395Oooo00O = o00oo1;
        this.f9396Oooo00o = o00o0o2;
    }

    @Nullable
    public final androidx.media3.common.OooOOO0 OooO0OO() {
        androidx.media3.common.Oooo0 oooo0 = this.f9376OooOOO0;
        if (oooo0.OooOo00()) {
            return null;
        }
        return oooo0.OooOOo0(this.f9368OooO0o.f9447OooO0Oo.f6718OooO0o0, new androidx.media3.common.Oooo0.OooO0o()).f6670OooO0o;
    }

    public final Bundle OooO0Oo(Player.OooO00o oooO00o) {
        int i;
        Bundle bundle = new Bundle();
        boolean zOooO0OO = oooO00o.OooO0OO(16);
        boolean zOooO0OO2 = oooO00o.OooO0OO(17);
        PlaybackException playbackException = this.f9367OooO0Oo;
        if (playbackException != null) {
            bundle.putBundle(f9350OoooOoo, playbackException.toBundle());
        }
        bundle.putInt(f9352Ooooo0o, this.f9369OooO0o0);
        o00O0O00 o00o0o01 = this.f9368OooO0o;
        bundle.putBundle(f9351Ooooo00, o00o0o01.OooO0OO(zOooO0OO, zOooO0OO2));
        bundle.putBundle(f9353OooooO0, this.f9370OooO0oO.OooO0OO(zOooO0OO, zOooO0OO2));
        bundle.putBundle(f9354OooooOO, this.f9371OooO0oo.OooO0OO(zOooO0OO, zOooO0OO2));
        bundle.putInt(f9355OooooOo, this.f9366OooO);
        bundle.putBundle(f9335Oooo0O0, this.f9372OooOO0.toBundle());
        bundle.putInt(f9336Oooo0OO, this.f9373OooOO0O);
        bundle.putBoolean(f9338Oooo0o0, this.f9374OooOO0o);
        String str = f9337Oooo0o;
        androidx.media3.common.Oooo0 oooo0 = this.f9376OooOOO0;
        if (zOooO0OO2) {
            bundle.putBundle(str, oooo0.toBundle());
        } else if (!zOooO0OO2 && zOooO0OO && !oooo0.OooOo00()) {
            androidx.media3.common.Oooo0.OooO0o oooO0oOooOOo = oooo0.OooOOo(o00o0o01.f9447OooO0Oo.f6718OooO0o0, new androidx.media3.common.Oooo0.OooO0o(), 0L);
            ArrayList arrayList = new ArrayList();
            androidx.media3.common.Oooo0.OooO0O0 oooO0O0 = new androidx.media3.common.Oooo0.OooO0O0();
            int i2 = oooO0oOooOOo.f6681OooOOo;
            while (true) {
                i = oooO0oOooOOo.f6683OooOOoo;
                if (i2 > i) {
                    break;
                }
                oooo0.OooOO0(i2, oooO0O0, false);
                oooO0O0.f6642OooO0o = 0;
                arrayList.add(oooO0O0.toBundle());
                i2++;
            }
            oooO0oOooOOo.f6683OooOOoo = i - oooO0oOooOOo.f6681OooOOo;
            oooO0oOooOOo.f6681OooOOo = 0;
            Bundle bundle2 = oooO0oOooOOo.toBundle();
            Bundle bundle3 = new Bundle();
            p080o000OoO.oo000o.OooO0O0(bundle3, androidx.media3.common.Oooo0.f6631OooO0o0, new p069o0000ooO.o000000O(ImmutableList.OooOOOo(bundle2)));
            p080o000OoO.oo000o.OooO0O0(bundle3, androidx.media3.common.Oooo0.f6630OooO0o, new p069o0000ooO.o000000O(arrayList));
            bundle3.putIntArray(androidx.media3.common.Oooo0.f6632OooO0oO, new int[]{0});
            bundle.putBundle(str, bundle3);
        }
        bundle.putInt(f9362o00Oo0, this.f9375OooOOO);
        bundle.putBundle(f9339Oooo0oO, this.f9377OooOOOO.toBundle());
        if (oooO00o.OooO0OO(18)) {
            bundle.putBundle(f9340Oooo0oo, this.f9378OooOOOo.toBundle());
        }
        if (oooO00o.OooO0OO(22)) {
            bundle.putFloat(f9333Oooo, this.f9380OooOOo0);
        }
        if (oooO00o.OooO0OO(21)) {
            bundle.putBundle(f9343OoooO00, this.f9379OooOOo.toBundle());
        }
        if (oooO00o.OooO0OO(28)) {
            bundle.putBundle(f9357Oooooo0, this.f9381OooOOoo.toBundle());
        }
        bundle.putBundle(f9342OoooO0, this.f9384OooOo00.toBundle());
        if (oooO00o.OooO0OO(23)) {
            bundle.putInt(f9344OoooO0O, this.f9383OooOo0);
            bundle.putBoolean(f9341OoooO, this.f9385OooOo0O);
        }
        bundle.putBoolean(f9345OoooOO0, this.f9386OooOo0o);
        bundle.putInt(f9346OoooOOO, this.f9389OooOoOO);
        bundle.putInt(f9347OoooOOo, this.f9391OooOoo0);
        bundle.putBoolean(f9348OoooOo0, this.f9388OooOoO0);
        bundle.putBoolean(f9349OoooOoO, this.f9387OooOoO);
        if (oooO00o.OooO0OO(18)) {
            bundle.putBundle(f9356Oooooo, this.f9390OooOoo.toBundle());
        }
        bundle.putLong(f9358OoooooO, this.f9392OooOooO);
        bundle.putLong(f9359Ooooooo, this.f9393OooOooo);
        bundle.putLong(f9364o0OoOo0, this.f9394Oooo000);
        if (oooO00o.OooO0OO(30)) {
            bundle.putBundle(f9361o00O0O, this.f9395Oooo00O.toBundle());
        }
        bundle.putBundle(f9365ooOO, this.f9396Oooo00o.toBundle());
        return bundle;
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : Player.OooO00o.C0140OooO00o.f6704OooO0O0) {
            p080o000OoO.o00Oo0.OooO0Oo(!false);
            sparseBooleanArray.append(i, true);
        }
        p080o000OoO.o00Oo0.OooO0Oo(!false);
        return OooO0Oo(new Player.OooO00o(new androidx.media3.common.OooO(sparseBooleanArray)));
    }
}
