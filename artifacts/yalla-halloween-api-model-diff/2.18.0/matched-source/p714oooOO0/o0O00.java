package p714oooOO0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.umeng.analytics.pro.bl;
import com.umeng.analytics.pro.bz;
import com.umeng.analytics.pro.o;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;
import net.sqlcipher.database.SQLiteDatabase;
import p319o0O0oOo.o00;
import p319o0O0oOo.o000O000;
import p325o0O0oo0O.o0000;
import p325o0O0oo0O.o0000O0;
import p325o0O0oo0O.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00 extends o0O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f53539OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f53541OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f53542OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public List<Cue> f53545OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public List<Cue> f53547OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f53548OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f53549OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f53550OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f53551OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f53552OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public byte f53553OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public byte f53554OooOo00;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f53556OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int[] f53532OooOoO0 = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final int[] f53531OooOoO = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final int[] f53533OooOoOO = {-1, -16711936, -16776961, -16711681, bl.a, -256, -65281};

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final int[] f53535OooOoo0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, SQLiteDatabase.MAX_SQL_CACHE_SIZE, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final int[] f53534OooOoo = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f53536OooOooO = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, o.a.B, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, IZegoLiveEventCallback.StreamEvent.PlayFail, IZegoLiveEventCallback.StreamEvent.RetryPlayStart, 235, IZegoLiveEventCallback.StreamEvent.PlayEnd, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f53537OooOooo = {195, 227, IZegoLiveEventCallback.StreamEvent.RetryPlayFail, IZegoLiveEventCallback.StreamEvent.RetryPlaySuccess, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final boolean[] f53538Oooo000 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O000 f53540OooO0oO = new o000O000();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList<OooO00o> f53544OooOO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooO00o f53546OooOOO0 = new OooO00o(0, 4);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f53555OooOo0O = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f53543OooOO0O = 16000000;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<C0444OooO00o> f53557OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<SpannableString> f53558OooO0O0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final StringBuilder f53559OooO0OO = new StringBuilder();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f53560OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f53561OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f53562OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f53563OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f53564OooO0oo;

        /* JADX INFO: renamed from: oooOO0.o0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0444OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f53565OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final boolean f53566OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f53567OooO0OO;

            public C0444OooO00o(int i, boolean z, int i2) {
                this.f53565OooO00o = i;
                this.f53566OooO0O0 = z;
                this.f53567OooO0OO = i2;
            }
        }

        public OooO00o(int i, int i2) {
            OooO0o(i);
            this.f53564OooO0oo = i2;
        }

        public final void OooO00o(char c) {
            if (this.f53559OooO0OO.length() < 32) {
                this.f53559OooO0OO.append(c);
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        public final void OooO0O0() {
            C0444OooO00o c0444OooO00o;
            int i;
            int length = this.f53559OooO0OO.length();
            if (length <= 0) {
                return;
            }
            this.f53559OooO0OO.delete(length - 1, length);
            int size = this.f53557OooO00o.size();
            while (true) {
                size--;
                if (size < 0 || (i = (c0444OooO00o = (C0444OooO00o) this.f53557OooO00o.get(size)).f53567OooO0OO) != length) {
                    return;
                } else {
                    c0444OooO00o.f53567OooO0OO = i - 1;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        @Nullable
        public final Cue OooO0OO(int i) {
            int i2;
            float f;
            int i3 = this.f53562OooO0o0 + this.f53561OooO0o;
            int i4 = 32 - i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i5 = 0; i5 < this.f53558OooO0O0.size(); i5++) {
                CharSequence charSequenceSubSequence = (CharSequence) this.f53558OooO0O0.get(i5);
                int i6 = o00.f36680OooO00o;
                if (charSequenceSubSequence.length() > i4) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i4);
                }
                spannableStringBuilder.append(charSequenceSubSequence);
                spannableStringBuilder.append('\n');
            }
            SpannableString spannableStringOooO0Oo = OooO0Oo();
            int i7 = o00.f36680OooO00o;
            int length = spannableStringOooO0Oo.length();
            SpannableString spannableStringSubSequence = spannableStringOooO0Oo;
            if (length > i4) {
                spannableStringSubSequence = spannableStringOooO0Oo.subSequence(0, i4);
            }
            spannableStringBuilder.append((CharSequence) spannableStringSubSequence);
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length2 = i4 - spannableStringBuilder.length();
            int i8 = i3 - length2;
            if (i != Integer.MIN_VALUE) {
                i2 = i;
            } else if (this.f53563OooO0oO != 2 || (Math.abs(i8) >= 3 && length2 >= 0)) {
                i2 = (this.f53563OooO0oO != 2 || i8 <= 0) ? 0 : 2;
            } else {
                i2 = 1;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i3 = 32 - length2;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i9 = this.f53560OooO0Oo;
            if (i9 > 7) {
                i9 = (i9 - 15) - 2;
            } else if (this.f53563OooO0oO == 1) {
                i9 -= this.f53564OooO0oo - 1;
            }
            return new Cue(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, i9, 1, Integer.MIN_VALUE, f, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE);
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r12v12, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        public final SpannableString OooO0Oo() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53559OooO0OO);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            boolean z = false;
            int i6 = -1;
            while (i < this.f53557OooO00o.size()) {
                C0444OooO00o c0444OooO00o = (C0444OooO00o) this.f53557OooO00o.get(i);
                boolean z2 = c0444OooO00o.f53566OooO0O0;
                int i7 = c0444OooO00o.f53565OooO00o;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = o0O00.f53533OooOoOO[i7];
                    }
                    z = z3;
                }
                int i8 = c0444OooO00o.f53567OooO0OO;
                i++;
                if (i8 != (i < this.f53557OooO00o.size() ? ((C0444OooO00o) this.f53557OooO00o.get(i)).f53567OooO0OO : length)) {
                    if (i2 != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i3, i8, 33);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        if (i5 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, i8, 33);
                        }
                        i4 = i8;
                        i5 = i6;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (i3 != -1 && i3 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, length, 33);
            }
            if (i4 != length && i5 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i4, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        public final void OooO0o(int i) {
            this.f53563OooO0oO = i;
            this.f53557OooO00o.clear();
            this.f53558OooO0O0.clear();
            this.f53559OooO0OO.setLength(0);
            this.f53560OooO0Oo = 15;
            this.f53562OooO0o0 = 0;
            this.f53561OooO0o = 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        public final boolean OooO0o0() {
            return this.f53557OooO00o.isEmpty() && this.f53558OooO0O0.isEmpty() && this.f53559OooO0OO.length() == 0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        public final void OooO0oO() {
            this.f53558OooO0O0.add(OooO0Oo());
            this.f53559OooO0OO.setLength(0);
            this.f53557OooO00o.clear();
            int iMin = Math.min(this.f53564OooO0oo, this.f53560OooO0Oo);
            while (this.f53558OooO0O0.size() >= iMin) {
                this.f53558OooO0O0.remove(0);
            }
        }
    }

    public o0O00(String str, int i) {
        this.f53541OooO0oo = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f53542OooOO0 = 0;
            this.f53539OooO = 0;
        } else if (i == 2) {
            this.f53542OooOO0 = 1;
            this.f53539OooO = 0;
        } else if (i == 3) {
            this.f53542OooOO0 = 0;
            this.f53539OooO = 1;
        } else if (i != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f53542OooOO0 = 0;
            this.f53539OooO = 0;
        } else {
            this.f53542OooOO0 = 1;
            this.f53539OooO = 1;
        }
        OooOO0o(0);
        OooOO0O();
        this.f53556OooOo0o = true;
        this.f53552OooOo = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2 A[FALL_THROUGH] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<oooOO0.o0O00$OooO00o$OooO00o>] */
    @Override // p714oooOO0.o0O00O
    public final void OooO0o(o0000O0 o0000o1) {
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer = o0000o1.f13661OoooO00;
        Objects.requireNonNull(byteBuffer);
        this.f53540OooO0oO.OooOoO0(byteBuffer.array(), byteBuffer.limit());
        boolean z3 = false;
        while (true) {
            o000O000 o000o001 = this.f53540OooO0oO;
            int i = o000o001.f36747OooO0OO - o000o001.f36746OooO0O0;
            int i2 = this.f53541OooO0oo;
            if (i < i2) {
                if (z3) {
                    int i3 = this.f53548OooOOOo;
                    if (i3 == 1 || i3 == 3) {
                        this.f53545OooOOO = OooOO0();
                        this.f53552OooOo = this.f53573OooO0o0;
                        return;
                    }
                    return;
                }
                return;
            }
            byte bOooOOo0 = i2 == 2 ? (byte) -4 : (byte) o000o001.OooOOo0();
            int iOooOOo0 = this.f53540OooO0oO.OooOOo0();
            int iOooOOo1 = this.f53540OooO0oO.OooOOo0();
            if ((bOooOOo0 & 2) == 0 && (bOooOOo0 & 1) == this.f53539OooO) {
                byte b = (byte) (iOooOOo0 & 127);
                byte b2 = (byte) (iOooOOo1 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.f53549OooOOo;
                    if ((bOooOOo0 & 4) == 4) {
                        boolean[] zArr = f53538Oooo000;
                        if (zArr[iOooOOo0] && zArr[iOooOOo1]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.f53549OooOOo = z;
                    if (z) {
                        if (!((b & 240) == 16)) {
                            this.f53551OooOOoo = false;
                        } else if (this.f53551OooOOoo && this.f53554OooOo00 == b && this.f53553OooOo0 == b2) {
                            this.f53551OooOOoo = false;
                            z2 = true;
                        } else {
                            this.f53551OooOOoo = true;
                            this.f53554OooOo00 = b;
                            this.f53553OooOo0 = b2;
                        }
                        z2 = false;
                    } else {
                        this.f53551OooOOoo = false;
                        z2 = false;
                    }
                    if (!z2) {
                        if (z) {
                            if (1 <= b && b <= 15) {
                                this.f53556OooOo0o = false;
                            } else if ((b & 247) == 20) {
                                if (b2 != 32 && b2 != 47) {
                                    switch (b2) {
                                        default:
                                            switch (b2) {
                                                case 42:
                                                case 43:
                                                    this.f53556OooOo0o = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f53556OooOo0o = true;
                                            break;
                                    }
                                } else {
                                    this.f53556OooOo0o = true;
                                }
                            }
                            if (this.f53556OooOo0o) {
                                int i4 = b & 224;
                                if (i4 == 0) {
                                    this.f53555OooOo0O = (b >> 3) & 1;
                                }
                                if (this.f53555OooOo0O == this.f53542OooOO0) {
                                    if (i4 == 0) {
                                        int i5 = b & 247;
                                        if (i5 == 17 && (b2 & 240) == 48) {
                                            this.f53546OooOOO0.OooO00o((char) f53534OooOoo[b2 & bz.m]);
                                        } else {
                                            int i6 = b & 246;
                                            if (i6 == 18 && (b2 & 224) == 32) {
                                                this.f53546OooOOO0.OooO0O0();
                                                this.f53546OooOOO0.OooO00o((char) ((b & 1) == 0 ? f53536OooOooO[b2 & 31] : f53537OooOooo[b2 & 31]));
                                            } else if (i5 == 17 && (b2 & 240) == 32) {
                                                this.f53546OooOOO0.OooO00o(' ');
                                                boolean z5 = (b2 & 1) == 1;
                                                OooO00o oooO00o = this.f53546OooOOO0;
                                                oooO00o.f53557OooO00o.add(new OooO00o.C0444OooO00o((b2 >> 1) & 7, z5, oooO00o.f53559OooO0OO.length()));
                                            } else if ((b & 240) == 16 && (b2 & 192) == 64) {
                                                int i7 = f53532OooOoO0[b & 7];
                                                if ((b2 & 32) != 0) {
                                                    i7++;
                                                }
                                                OooO00o oooO00o2 = this.f53546OooOOO0;
                                                if (i7 != oooO00o2.f53560OooO0Oo) {
                                                    if (this.f53548OooOOOo != 1 && !oooO00o2.OooO0o0()) {
                                                        OooO00o oooO00o3 = new OooO00o(this.f53548OooOOOo, this.f53550OooOOo0);
                                                        this.f53546OooOOO0 = oooO00o3;
                                                        this.f53544OooOO0o.add(oooO00o3);
                                                    }
                                                    this.f53546OooOOO0.f53560OooO0Oo = i7;
                                                }
                                                boolean z6 = (b2 & bz.n) == 16;
                                                boolean z7 = (b2 & 1) == 1;
                                                int i8 = (b2 >> 1) & 7;
                                                OooO00o oooO00o4 = this.f53546OooOOO0;
                                                oooO00o4.f53557OooO00o.add(new OooO00o.C0444OooO00o(z6 ? 8 : i8, z7, oooO00o4.f53559OooO0OO.length()));
                                                if (z6) {
                                                    this.f53546OooOOO0.f53562OooO0o0 = f53531OooOoO[i8];
                                                }
                                            } else if (i5 == 23 && b2 >= 33 && b2 <= 35) {
                                                this.f53546OooOOO0.f53561OooO0o = b2 - 32;
                                            } else if (i6 == 20 && (b2 & 240) == 32) {
                                                if (b2 == 32) {
                                                    OooOO0o(2);
                                                } else if (b2 != 41) {
                                                    switch (b2) {
                                                        case 37:
                                                            OooOO0o(1);
                                                            OooOOO0(2);
                                                            break;
                                                        case 38:
                                                            OooOO0o(1);
                                                            OooOOO0(3);
                                                            break;
                                                        case 39:
                                                            OooOO0o(1);
                                                            OooOOO0(4);
                                                            break;
                                                        default:
                                                            int i9 = this.f53548OooOOOo;
                                                            if (i9 != 0) {
                                                                if (b2 != 33) {
                                                                    switch (b2) {
                                                                        case 44:
                                                                            this.f53545OooOOO = Collections.emptyList();
                                                                            int i10 = this.f53548OooOOOo;
                                                                            if (i10 == 1 || i10 == 3) {
                                                                                OooOO0O();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i9 == 1 && !this.f53546OooOOO0.OooO0o0()) {
                                                                                this.f53546OooOOO0.OooO0oO();
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            OooOO0O();
                                                                            break;
                                                                        case 47:
                                                                            this.f53545OooOOO = OooOO0();
                                                                            OooOO0O();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f53546OooOOO0.OooO0O0();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    OooOO0o(3);
                                                }
                                            }
                                        }
                                    } else {
                                        OooO00o oooO00o5 = this.f53546OooOOO0;
                                        int i11 = (b & ByteCompanionObject.MAX_VALUE) - 32;
                                        int[] iArr = f53535OooOoo0;
                                        oooO00o5.OooO00o((char) iArr[i11]);
                                        if ((b2 & 224) != 0) {
                                            this.f53546OooOOO0.OooO00o((char) iArr[(b2 & ByteCompanionObject.MAX_VALUE) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            OooOO0O();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p714oooOO0.o0O00O
    public final o0000 OooO0o0() {
        List<Cue> list = this.f53545OooOOO;
        this.f53547OooOOOO = list;
        Objects.requireNonNull(list);
        return new o0O00OO(list);
    }

    @Override // p714oooOO0.o0O00O, p295o0O0Oo0o.oo0o0Oo
    @Nullable
    /* JADX INFO: renamed from: OooO0oO */
    public final o0000O0O OooO0O0() throws SubtitleDecoderException {
        o0000O0O o0000o0oPollFirst;
        o0000O0O o0000o0oOooO0O0 = super.OooO0O0();
        if (o0000o0oOooO0O0 != null) {
            return o0000o0oOooO0O0;
        }
        long j = this.f53543OooOO0O;
        boolean z = false;
        if (j != -9223372036854775807L) {
            long j2 = this.f53552OooOo;
            if (j2 != -9223372036854775807L && this.f53573OooO0o0 - j2 >= j) {
                z = true;
            }
        }
        if (!z || (o0000o0oPollFirst = this.f53569OooO0O0.pollFirst()) == null) {
            return null;
        }
        List<Cue> listEmptyList = Collections.emptyList();
        this.f53545OooOOO = listEmptyList;
        this.f53552OooOo = -9223372036854775807L;
        this.f53547OooOOOO = listEmptyList;
        Objects.requireNonNull(listEmptyList);
        o0000o0oPollFirst.OooO0o(this.f53573OooO0o0, new o0O00OO(listEmptyList), Long.MAX_VALUE);
        return o0000o0oPollFirst;
    }

    @Override // p714oooOO0.o0O00O
    public final boolean OooO0oo() {
        return this.f53545OooOOO != this.f53547OooOOOO;
    }

    public final List<Cue> OooOO0() {
        int size = this.f53544OooOO0o.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueOooO0OO = this.f53544OooOO0o.get(i).OooO0OO(Integer.MIN_VALUE);
            arrayList.add(cueOooO0OO);
            if (cueOooO0OO != null) {
                iMin = Math.min(iMin, cueOooO0OO.f14644OooO0oo);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueOooO0OO2 = (Cue) arrayList.get(i2);
            if (cueOooO0OO2 != null) {
                if (cueOooO0OO2.f14644OooO0oo != iMin) {
                    cueOooO0OO2 = this.f53544OooOO0o.get(i2).OooO0OO(iMin);
                    Objects.requireNonNull(cueOooO0OO2);
                }
                arrayList2.add(cueOooO0OO2);
            }
        }
        return arrayList2;
    }

    public final void OooOO0O() {
        this.f53546OooOOO0.OooO0o(this.f53548OooOOOo);
        this.f53544OooOO0o.clear();
        this.f53544OooOO0o.add(this.f53546OooOOO0);
    }

    public final void OooOO0o(int i) {
        int i2 = this.f53548OooOOOo;
        if (i2 == i) {
            return;
        }
        this.f53548OooOOOo = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f53544OooOO0o.size(); i3++) {
                this.f53544OooOO0o.get(i3).f53563OooO0oO = i;
            }
            return;
        }
        OooOO0O();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f53545OooOOO = Collections.emptyList();
        }
    }

    public final void OooOOO0(int i) {
        this.f53550OooOOo0 = i;
        this.f53546OooOOO0.f53564OooO0oo = i;
    }

    @Override // p714oooOO0.o0O00O, p295o0O0Oo0o.oo0o0Oo
    public final void flush() {
        super.flush();
        this.f53545OooOOO = null;
        this.f53547OooOOOO = null;
        OooOO0o(0);
        OooOOO0(4);
        OooOO0O();
        this.f53549OooOOo = false;
        this.f53551OooOOoo = false;
        this.f53554OooOo00 = (byte) 0;
        this.f53553OooOo0 = (byte) 0;
        this.f53555OooOo0O = 0;
        this.f53556OooOo0o = true;
        this.f53552OooOo = -9223372036854775807L;
    }

    @Override // p714oooOO0.o0O00O, p295o0O0Oo0o.oo0o0Oo
    public final void release() {
    }
}
