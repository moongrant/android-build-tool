package p205o00o0oO0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.OooOo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.o0;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0OO0;
import com.google.common.primitives.OooO0o;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p245o00oo0o.o00OO0OO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0000Ooo f39338OooO0OO = new o0000Ooo(new int[]{2}, 10);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O00 f39339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ImmutableMap<Integer, Integer> f39340OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f39341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39342OooO0O0;

    @RequiresApi(23)
    public static final class OooO00o {
        @DoNotInline
        private static final ImmutableSet<Integer> OooO00o() {
            ImmutableSet.OooO00o oooO00o = new ImmutableSet.OooO00o();
            oooO00o.OooO0Oo(8, 7);
            int i = p245o00oo0o.o0O00.f40595OooO00o;
            if (i >= 31) {
                oooO00o.OooO0Oo(26, 27);
            }
            if (i >= 33) {
                oooO00o.OooO00o(30);
            }
            return oooO00o.OooO();
        }

        @DoNotInline
        public static final boolean OooO0O0(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            ImmutableSet<Integer> immutableSetOooO00o = OooO00o();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetOooO00o.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    @RequiresApi(29)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final AudioAttributes f39343OooO00o = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        @DoNotInline
        public static ImmutableList<Integer> OooO00o() {
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            o0OO0<Integer> it = o0000Ooo.f39340OooO0o0.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (p245o00oo0o.o0O00.f40595OooO00o >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f39343OooO00o)) {
                        oooO00o.OooO0OO(Integer.valueOf(iIntValue));
                    }
                }
            }
            oooO00o.OooO0OO(2);
            return oooO00o.OooO0oo();
        }

        @DoNotInline
        public static int OooO0O0(int i, int i2) {
            for (int i3 = 10; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(p245o00oo0o.o0O00.OooOOO(i3)).build(), f39343OooO00o)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    static {
        Object[] objArr = {2, 5, 6};
        o0.OooO00o(3, objArr);
        f39339OooO0Oo = ImmutableList.OooO(3, objArr);
        ImmutableMap.OooO00o oooO00o = new ImmutableMap.OooO00o(4);
        oooO00o.OooO0OO(5, 6);
        oooO00o.OooO0OO(17, 6);
        oooO00o.OooO0OO(7, 6);
        oooO00o.OooO0OO(30, 10);
        oooO00o.OooO0OO(18, 6);
        oooO00o.OooO0OO(6, 8);
        oooO00o.OooO0OO(8, 8);
        oooO00o.OooO0OO(14, 8);
        f39340OooO0o0 = oooO00o.OooO00o(true);
    }

    public o0000Ooo(@Nullable int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f39341OooO00o = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f39341OooO00o = new int[0];
        }
        this.f39342OooO0O0 = i;
    }

    public static o0000Ooo OooO00o(Context context) {
        return OooO0O0(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if ((r0 >= 23 && r8.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) != false) goto L29;
     */
    @SuppressLint({"InlinedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o0000Ooo OooO0O0(Context context, @Nullable Intent intent) {
        boolean z;
        int i = p245o00oo0o.o0O00.f40595OooO00o;
        o0000Ooo o0000ooo = f39338OooO0OO;
        if (i >= 23 && OooO00o.OooO0O0(context)) {
            return o0000ooo;
        }
        ImmutableSet.OooO00o oooO00o = new ImmutableSet.OooO00o();
        if (i >= 17) {
            String str = p245o00oo0o.o0O00.f40597OooO0OO;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            o0O00 o0o01 = f39339OooO0Oo;
            o0o01.getClass();
            oooO00o.OooO0o(o0o01);
        }
        if (i >= 29) {
            if (!p245o00oo0o.o0O00.Oooo0(context)) {
            }
            ImmutableList<Integer> immutableListOooO00o = OooO0O0.OooO00o();
            immutableListOooO00o.getClass();
            oooO00o.OooO0o(immutableListOooO00o);
            return new o0000Ooo(OooO0o.OooO0Oo(oooO00o.OooO()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            ImmutableSet immutableSetOooO = oooO00o.OooO();
            return !immutableSetOooO.isEmpty() ? new o0000Ooo(OooO0o.OooO0Oo(immutableSetOooO), 10) : o0000ooo;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listEmptyList = intArrayExtra.length == 0 ? Collections.emptyList() : new OooO0o.OooO00o(0, intArrayExtra.length, intArrayExtra);
            listEmptyList.getClass();
            oooO00o.OooO0o(listEmptyList);
        }
        return new o0000Ooo(OooO0o.OooO0Oo(oooO00o.OooO()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    @Nullable
    public final Pair<Integer, Integer> OooO0OO(OooOo oooOo) {
        boolean z;
        boolean z2;
        int iIntValue;
        String str = oooOo.f11211OooOOOO;
        str.getClass();
        int iOooO0OO = o00OO0OO.OooO0OO(str, oooOo.f11208OooOO0o);
        Integer numValueOf = Integer.valueOf(iOooO0OO);
        ImmutableMap<Integer, Integer> immutableMap = f39340OooO0o0;
        if (!immutableMap.containsKey(numValueOf)) {
            return null;
        }
        int[] iArr = this.f39341OooO00o;
        int i = 6;
        if (iOooO0OO == 18) {
            if (!(Arrays.binarySearch(iArr, 18) >= 0)) {
                iOooO0OO = 6;
            } else if (iOooO0OO != 8) {
                if (Arrays.binarySearch(iArr, 8) >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    iOooO0OO = 7;
                } else if (iOooO0OO == 30) {
                    if (Arrays.binarySearch(iArr, 30) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        iOooO0OO = 7;
                    }
                }
            } else if (iOooO0OO == 30) {
                if (Arrays.binarySearch(iArr, 30) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    iOooO0OO = 7;
                }
            }
        } else if (iOooO0OO != 8) {
            if (Arrays.binarySearch(iArr, 8) >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                iOooO0OO = 7;
            } else if (iOooO0OO == 30) {
                if (Arrays.binarySearch(iArr, 30) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    iOooO0OO = 7;
                }
            }
        } else if (iOooO0OO == 30) {
            if (Arrays.binarySearch(iArr, 30) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                iOooO0OO = 7;
            }
        }
        if (!(Arrays.binarySearch(iArr, iOooO0OO) >= 0)) {
            return null;
        }
        int i2 = oooOo.f11225OooOoo0;
        if (i2 == -1 || iOooO0OO == 18) {
            int i3 = oooOo.f11224OooOoo;
            if (i3 == -1) {
                i3 = 48000;
            }
            if (p245o00oo0o.o0O00.f40595OooO00o >= 29) {
                iIntValue = OooO0O0.OooO0O0(iOooO0OO, i3);
            } else {
                Integer orDefault = immutableMap.getOrDefault(Integer.valueOf(iOooO0OO), 0);
                orDefault.getClass();
                iIntValue = orDefault.intValue();
            }
            i2 = iIntValue;
        } else if (oooOo.f11211OooOOOO.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (i2 > 10) {
                return null;
            }
        } else if (i2 > this.f39342OooO0O0) {
            return null;
        }
        int i4 = p245o00oo0o.o0O00.f40595OooO00o;
        if (i4 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i4 <= 26 && "fugu".equals(p245o00oo0o.o0O00.f40596OooO0O0) && i == 1) {
            i = 2;
        }
        int iOooOOO = p245o00oo0o.o0O00.OooOOO(i);
        if (iOooOOO == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iOooO0OO), Integer.valueOf(iOooOOO));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000Ooo)) {
            return false;
        }
        o0000Ooo o0000ooo = (o0000Ooo) obj;
        return Arrays.equals(this.f39341OooO00o, o0000ooo.f39341OooO00o) && this.f39342OooO0O0 == o0000ooo.f39342OooO0O0;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f39341OooO00o) * 31) + this.f39342OooO0O0;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f39342OooO0O0 + ", supportedEncodings=" + Arrays.toString(this.f39341OooO00o) + "]";
    }
}
