package p091o000o0O;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import net.sqlcipher.database.SQLiteDatabase;
import p080o000OoO.o0000OO0;
import p092o000o0O0.o000000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o000oOoO extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f35100OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f35102OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f35103OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public List<Cue> f35106OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public List<Cue> f35108OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f35109OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f35110OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f35111OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f35112OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f35113OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public byte f35114OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public byte f35115OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f35117OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f35093OooOoO0 = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final int[] f35092OooOoO = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final int[] f35094OooOoOO = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int[] f35096OooOoo0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f35095OooOoo = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f35097OooOooO = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, ComposerKt.reuseKey, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f35098OooOooo = {195, 227, IZegoLiveEventCallback.StreamEvent.RetryPlayFail, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final boolean[] f35099Oooo000 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0000OO0 f35101OooO0oO = new o0000OO0();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList<OooO00o> f35105OooOO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooO00o f35107OooOOO0 = new OooO00o(0, 4);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f35116OooOo0O = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f35104OooOO0O = 16000000;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f35118OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f35119OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final StringBuilder f35120OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f35121OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f35122OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f35123OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f35124OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f35125OooO0oo;

        /* JADX INFO: renamed from: o000o0O.o000oOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0404OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f35126OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final boolean f35127OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f35128OooO0OO;

            public C0404OooO00o(int i, boolean z, int i2) {
                this.f35126OooO00o = i;
                this.f35127OooO0O0 = z;
                this.f35128OooO0OO = i2;
            }
        }

        public OooO00o(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.f35118OooO00o = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f35119OooO0O0 = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.f35120OooO0OO = sb;
            this.f35124OooO0oO = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.f35121OooO0Oo = 15;
            this.f35123OooO0o0 = 0;
            this.f35122OooO0o = 0;
            this.f35125OooO0oo = i2;
        }

        public final void OooO00o(char c) {
            StringBuilder sb = this.f35120OooO0OO;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        public final void OooO0O0() {
            C0404OooO00o c0404OooO00o;
            int i;
            StringBuilder sb = this.f35120OooO0OO;
            int length = sb.length();
            if (length <= 0) {
                return;
            }
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f35118OooO00o;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0 || (i = (c0404OooO00o = (C0404OooO00o) arrayList.get(size)).f35128OooO0OO) != length) {
                    return;
                } else {
                    c0404OooO00o.f35128OooO0OO = i - 1;
                }
            }
        }

        @Nullable
        public final Cue OooO0OO(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f35119OooO0O0;
                if (i2 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i2));
                spannableStringBuilder.append('\n');
                i2++;
            }
            spannableStringBuilder.append((CharSequence) OooO0Oo());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.f35123OooO0o0 + this.f35122OooO0o;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f35124OooO0oO != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                    i = (this.f35124OooO0oO != 2 || i4 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.f35121OooO0Oo;
            if (i5 > 7) {
                i5 = (i5 - 15) - 2;
            } else if (this.f35124OooO0oO == 1) {
                i5 -= this.f35125OooO0oo - 1;
            }
            Cue.OooO00o oooO00o = new Cue.OooO00o();
            oooO00o.f6920OooO00o = spannableStringBuilder;
            oooO00o.f6922OooO0OO = Layout.Alignment.ALIGN_NORMAL;
            oooO00o.f6925OooO0o0 = i5;
            oooO00o.f6924OooO0o = 1;
            oooO00o.f6927OooO0oo = f;
            oooO00o.f6919OooO = i;
            return oooO00o.OooO00o();
        }

        public final SpannableString OooO0Oo() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f35120OooO0OO);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.f35118OooO00o;
                if (i5 >= arrayList.size()) {
                    break;
                }
                C0404OooO00o c0404OooO00o = (C0404OooO00o) arrayList.get(i5);
                boolean z2 = c0404OooO00o.f35127OooO0O0;
                int i7 = c0404OooO00o.f35126OooO00o;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = o000oOoO.f35094OooOoOO[i7];
                    }
                    z = z3;
                }
                int i8 = c0404OooO00o.f35128OooO0OO;
                i5++;
                if (i8 != (i5 < arrayList.size() ? ((C0404OooO00o) arrayList.get(i5)).f35128OooO0OO : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
            if (i6 != length && i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean OooO0o0() {
            return this.f35118OooO00o.isEmpty() && this.f35119OooO0O0.isEmpty() && this.f35120OooO0OO.length() == 0;
        }
    }

    public o000oOoO(String str, int i) {
        this.f35102OooO0oo = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f35103OooOO0 = 0;
            this.f35100OooO = 0;
        } else if (i == 2) {
            this.f35103OooOO0 = 1;
            this.f35100OooO = 0;
        } else if (i == 3) {
            this.f35103OooOO0 = 0;
            this.f35100OooO = 1;
        } else if (i != 4) {
            Log.OooO0o("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f35103OooOO0 = 0;
            this.f35100OooO = 0;
        } else {
            this.f35103OooOO0 = 1;
            this.f35100OooO = 1;
        }
        OooOO0O(0);
        OooOO0();
        this.f35117OooOo0o = true;
        this.f35113OooOo = -9223372036854775807L;
    }

    public final List<Cue> OooO() {
        ArrayList<OooO00o> arrayList = this.f35105OooOO0o;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueOooO0OO = arrayList.get(i).OooO0OO(Integer.MIN_VALUE);
            arrayList2.add(cueOooO0OO);
            if (cueOooO0OO != null) {
                iMin = Math.min(iMin, cueOooO0OO.f6910OooOO0o);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueOooO0OO2 = (Cue) arrayList2.get(i2);
            if (cueOooO0OO2 != null) {
                if (cueOooO0OO2.f6910OooOO0o != iMin) {
                    cueOooO0OO2 = arrayList.get(i2).OooO0OO(iMin);
                    cueOooO0OO2.getClass();
                }
                arrayList3.add(cueOooO0OO2);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb A[FALL_THROUGH] */
    @Override // p091o000o0O.o00Oo0
    public final void OooO0o(o00Oo0.OooO00o oooO00o) {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer = oooO00o.f7089OooO0o;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        o0000OO0 o0000oo1 = this.f35101OooO0oO;
        o0000oo1.OooOooo(iLimit, bArrArray);
        boolean z3 = false;
        while (true) {
            int i = o0000oo1.f34951OooO0OO - o0000oo1.f34950OooO0O0;
            int i2 = this.f35102OooO0oo;
            if (i < i2) {
                if (z3) {
                    int i3 = this.f35109OooOOOo;
                    if (i3 == 1 || i3 == 3) {
                        this.f35106OooOOO = OooO();
                        this.f35113OooOo = this.f35183OooO0o0;
                        return;
                    }
                    return;
                }
                return;
            }
            int iOooOo0O = i2 == 2 ? -4 : o0000oo1.OooOo0O();
            int iOooOo0O2 = o0000oo1.OooOo0O();
            int iOooOo0O3 = o0000oo1.OooOo0O();
            if ((iOooOo0O & 2) == 0 && (iOooOo0O & 1) == this.f35100OooO) {
                byte b = (byte) (iOooOo0O2 & 127);
                byte b2 = (byte) (iOooOo0O3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.f35110OooOOo;
                    if ((iOooOo0O & 4) == 4) {
                        boolean[] zArr = f35099Oooo000;
                        if (zArr[iOooOo0O2] && zArr[iOooOo0O3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f35110OooOOo = z;
                    if (z) {
                        if (!((b & 240) == 16)) {
                            this.f35112OooOOoo = false;
                        } else if (this.f35112OooOOoo && this.f35115OooOo00 == b && this.f35114OooOo0 == b2) {
                            this.f35112OooOOoo = false;
                            z2 = true;
                        } else {
                            this.f35112OooOOoo = true;
                            this.f35115OooOo00 = b;
                            this.f35114OooOo0 = b2;
                        }
                        z2 = false;
                    } else {
                        this.f35112OooOOoo = false;
                        z2 = false;
                    }
                    if (!z2) {
                        if (z) {
                            if (1 <= b && b <= 15) {
                                this.f35117OooOo0o = false;
                            } else if ((b & 246) == 20) {
                                if (b2 != 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.f35117OooOo0o = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f35117OooOo0o = true;
                                            break;
                                    }
                                } else {
                                    this.f35117OooOo0o = true;
                                }
                            }
                            if (this.f35117OooOo0o) {
                                int i4 = b & 224;
                                if (i4 == 0) {
                                    this.f35116OooOo0O = (b >> 3) & 1;
                                }
                                if (this.f35116OooOo0O == this.f35103OooOO0) {
                                    if (i4 == 0) {
                                        int i5 = b & 247;
                                        if (i5 == 17 && (b2 & 240) == 48) {
                                            this.f35107OooOOO0.OooO00o((char) f35095OooOoo[b2 & 15]);
                                        } else {
                                            int i6 = b & 246;
                                            if (i6 == 18 && (b2 & 224) == 32) {
                                                this.f35107OooOOO0.OooO0O0();
                                                this.f35107OooOOO0.OooO00o((char) ((b & 1) == 0 ? f35097OooOooO[b2 & 31] : f35098OooOooo[b2 & 31]));
                                            } else if (i5 == 17 && (b2 & 240) == 32) {
                                                this.f35107OooOOO0.OooO00o(' ');
                                                boolean z5 = (b2 & 1) == 1;
                                                OooO00o oooO00o2 = this.f35107OooOOO0;
                                                oooO00o2.f35118OooO00o.add(new OooO00o.C0404OooO00o((b2 >> 1) & 7, z5, oooO00o2.f35120OooO0OO.length()));
                                            } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                int i7 = f35093OooOoO0[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                OooO00o oooO00o3 = this.f35107OooOOO0;
                                                if (i7 != oooO00o3.f35121OooO0Oo) {
                                                    if (this.f35109OooOOOo != 1 && !oooO00o3.OooO0o0()) {
                                                        OooO00o oooO00o4 = new OooO00o(this.f35109OooOOOo, this.f35111OooOOo0);
                                                        this.f35107OooOOO0 = oooO00o4;
                                                        this.f35105OooOO0o.add(oooO00o4);
                                                    }
                                                    this.f35107OooOOO0.f35121OooO0Oo = i7;
                                                }
                                                boolean z6 = (b2 & 16) == 16;
                                                boolean z7 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                OooO00o oooO00o5 = this.f35107OooOOO0;
                                                oooO00o5.f35118OooO00o.add(new OooO00o.C0404OooO00o(z6 ? 8 : i8, z7, oooO00o5.f35120OooO0OO.length()));
                                                if (z6) {
                                                    this.f35107OooOOO0.f35123OooO0o0 = f35092OooOoO[i8];
                                                }
                                            } else if (i5 == 23 && b2 >= 33 && b2 <= 35) {
                                                this.f35107OooOOO0.f35122OooO0o = b2 - 32;
                                            } else if (i6 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    OooOO0O(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            OooOO0O(1);
                                                            this.f35111OooOOo0 = 2;
                                                            this.f35107OooOOO0.f35125OooO0oo = 2;
                                                            break;
                                                        case 38:
                                                            OooOO0O(1);
                                                            this.f35111OooOOo0 = 3;
                                                            this.f35107OooOOO0.f35125OooO0oo = 3;
                                                            break;
                                                        case 39:
                                                            OooOO0O(1);
                                                            this.f35111OooOOo0 = 4;
                                                            this.f35107OooOOO0.f35125OooO0oo = 4;
                                                            break;
                                                        default:
                                                            int i9 = this.f35109OooOOOo;
                                                            if (i9 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f35106OooOOO = Collections.emptyList();
                                                                            int i10 = this.f35109OooOOOo;
                                                                            if (i10 == 1 || i10 == 3) {
                                                                                OooOO0();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i9 == 1 && !this.f35107OooOOO0.OooO0o0()) {
                                                                                OooO00o oooO00o6 = this.f35107OooOOO0;
                                                                                ArrayList arrayList = oooO00o6.f35119OooO0O0;
                                                                                arrayList.add(oooO00o6.OooO0Oo());
                                                                                oooO00o6.f35120OooO0OO.setLength(0);
                                                                                oooO00o6.f35118OooO00o.clear();
                                                                                int iMin = Math.min(oooO00o6.f35125OooO0oo, oooO00o6.f35121OooO0Oo);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            OooOO0();
                                                                            break;
                                                                        case 47:
                                                                            this.f35106OooOOO = OooO();
                                                                            OooOO0();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f35107OooOOO0.OooO0O0();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    OooOO0O(3);
                                                }
                                            }
                                        }
                                    } else {
                                        OooO00o oooO00o7 = this.f35107OooOOO0;
                                        int i11 = (b & ByteCompanionObject.MAX_VALUE) - 32;
                                        int[] iArr = f35096OooOoo0;
                                        oooO00o7.OooO00o((char) iArr[i11]);
                                        if ((b2 & 224) != 0) {
                                            this.f35107OooOOO0.OooO00o((char) iArr[(b2 & ByteCompanionObject.MAX_VALUE) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            OooOO0();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p091o000o0O.o00Oo0
    public final o00Ooo OooO0o0() {
        List<Cue> list = this.f35106OooOOO;
        this.f35108OooOOOO = list;
        list.getClass();
        return new o00Ooo(list);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    @Override // p091o000o0O.o00Oo0, o000O00.OooOO0
    @Nullable
    /* JADX INFO: renamed from: OooO0oO */
    public final o000000 OooO0O0() throws SubtitleDecoderException {
        boolean z;
        o000000 o000000VarPollFirst;
        o000000 o000000VarOooO0O0 = super.OooO0O0();
        if (o000000VarOooO0O0 != null) {
            return o000000VarOooO0O0;
        }
        long j = this.f35104OooOO0O;
        if (j != -9223372036854775807L) {
            long j2 = this.f35113OooOo;
            if (j2 != -9223372036854775807L && this.f35183OooO0o0 - j2 >= j) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z || (o000000VarPollFirst = this.f35179OooO0O0.pollFirst()) == null) {
            return null;
        }
        this.f35106OooOOO = Collections.emptyList();
        this.f35113OooOo = -9223372036854775807L;
        o000000VarPollFirst.OooO(this.f35183OooO0o0, OooO0o0(), LongCompanionObject.MAX_VALUE);
        return o000000VarPollFirst;
    }

    @Override // p091o000o0O.o00Oo0
    public final boolean OooO0oo() {
        return this.f35106OooOOO != this.f35108OooOOOO;
    }

    public final void OooOO0() {
        OooO00o oooO00o = this.f35107OooOOO0;
        oooO00o.f35124OooO0oO = this.f35109OooOOOo;
        oooO00o.f35118OooO00o.clear();
        oooO00o.f35119OooO0O0.clear();
        oooO00o.f35120OooO0OO.setLength(0);
        oooO00o.f35121OooO0Oo = 15;
        oooO00o.f35123OooO0o0 = 0;
        oooO00o.f35122OooO0o = 0;
        ArrayList<OooO00o> arrayList = this.f35105OooOO0o;
        arrayList.clear();
        arrayList.add(this.f35107OooOOO0);
    }

    public final void OooOO0O(int i) {
        int i2 = this.f35109OooOOOo;
        if (i2 == i) {
            return;
        }
        this.f35109OooOOOo = i;
        if (i != 3) {
            OooOO0();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f35106OooOOO = Collections.emptyList();
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList<OooO00o> arrayList = this.f35105OooOO0o;
            if (i3 >= arrayList.size()) {
                return;
            }
            arrayList.get(i3).f35124OooO0oO = i;
            i3++;
        }
    }

    @Override // p091o000o0O.o00Oo0, o000O00.OooOO0
    public final void flush() {
        super.flush();
        this.f35106OooOOO = null;
        this.f35108OooOOOO = null;
        OooOO0O(0);
        this.f35111OooOOo0 = 4;
        this.f35107OooOOO0.f35125OooO0oo = 4;
        OooOO0();
        this.f35110OooOOo = false;
        this.f35112OooOOoo = false;
        this.f35115OooOo00 = (byte) 0;
        this.f35114OooOo0 = (byte) 0;
        this.f35116OooOo0O = 0;
        this.f35117OooOo0o = true;
        this.f35113OooOo = -9223372036854775807L;
    }

    @Override // p091o000o0O.o00Oo0, o000O00.OooOO0
    public final void release() {
    }
}
