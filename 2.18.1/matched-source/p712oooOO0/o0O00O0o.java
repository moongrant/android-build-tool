package p712oooOO0;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.text.Typography;
import p265o00ooo00.Oooo0;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;
import p324o0O0oo0O.o0000O00;
import p324o0O0oo0O.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O0o extends o0O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f53560OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000 f53561OooO0oO = new o000();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000OO0 f53562OooO0oo = new o0000OO0();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0[] f53563OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO0O0 f53564OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public List<Cue> f53565OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO0OO f53566OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public List<Cue> f53567OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f53568OooOOOO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Cue f53569OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53570OooO0O0;

        public OooO00o(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            boolean z2;
            int i5;
            if (z) {
                i5 = i3;
                z2 = true;
            } else {
                z2 = false;
                i5 = -16777216;
            }
            this.f53569OooO00o = new Cue(charSequence, alignment, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z2, i5, Integer.MIN_VALUE);
            this.f53570OooO0O0 = i4;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final int f53571OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final int f53572OooOo0o = OooO0Oo(2, 2, 2, 0);

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final int[] f53573OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final int[] f53574OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final int[] f53575OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final int[] f53576OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final boolean[] f53577OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final int[] f53578OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public static final int[] f53579OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public static final int[] f53580Oooo000;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f53581OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<SpannableString> f53582OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SpannableStringBuilder f53583OooO0O0 = new SpannableStringBuilder();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f53584OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f53585OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f53586OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f53587OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f53588OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f53589OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f53590OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f53591OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f53592OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f53593OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f53594OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f53595OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f53596OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f53597OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f53598OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f53599OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f53600OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f53601OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f53602OooOo0O;

        static {
            int iOooO0Oo = OooO0Oo(0, 0, 0, 0);
            f53571OooOo = iOooO0Oo;
            int iOooO0Oo2 = OooO0Oo(0, 0, 0, 3);
            f53574OooOoO0 = new int[]{0, 0, 0, 0, 0, 2, 0};
            f53573OooOoO = new int[]{0, 0, 0, 0, 0, 0, 2};
            f53575OooOoOO = new int[]{3, 3, 3, 3, 3, 3, 1};
            f53577OooOoo0 = new boolean[]{false, false, false, true, true, true, false};
            f53576OooOoo = new int[]{iOooO0Oo, iOooO0Oo2, iOooO0Oo, iOooO0Oo, iOooO0Oo2, iOooO0Oo, iOooO0Oo};
            f53578OooOooO = new int[]{0, 1, 2, 3, 4, 3, 4};
            f53579OooOooo = new int[]{0, 0, 0, 0, 0, 3, 3};
            f53580Oooo000 = new int[]{iOooO0Oo, iOooO0Oo, iOooO0Oo, iOooO0Oo, iOooO0Oo, iOooO0Oo2, iOooO0Oo2};
        }

        public OooO0O0() {
            OooO0o();
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        public static int OooO0Oo(int i, int i2, int i3, int i4) {
            int i5;
            o00000O0.OooO0OO(i, 4);
            o00000O0.OooO0OO(i2, 4);
            o00000O0.OooO0OO(i3, 4);
            o00000O0.OooO0OO(i4, 4);
            int i6 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i4 == 0 || i4 == 1) {
                i5 = KotlinVersion.MAX_COMPONENT_VALUE;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 != 3) {
                i5 = KotlinVersion.MAX_COMPONENT_VALUE;
            } else {
                i5 = 0;
            }
            int i7 = i > 1 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
            int i8 = i2 > 1 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
            if (i3 <= 1) {
                i6 = 0;
            }
            return Color.argb(i5, i7, i8, i6);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        public final void OooO00o(char c) {
            if (c != '\n') {
                this.f53583OooO0O0.append(c);
                return;
            }
            this.f53582OooO00o.add(OooO0O0());
            this.f53583OooO0O0.clear();
            if (this.f53596OooOOOo != -1) {
                this.f53596OooOOOo = 0;
            }
            if (this.f53598OooOOo0 != -1) {
                this.f53598OooOOo0 = 0;
            }
            if (this.f53597OooOOo != -1) {
                this.f53597OooOOo = 0;
            }
            if (this.f53601OooOo00 != -1) {
                this.f53601OooOo00 = 0;
            }
            while (true) {
                if ((!this.f53591OooOO0O || this.f53582OooO00o.size() < this.f53590OooOO0) && this.f53582OooO00o.size() < 15) {
                    return;
                } else {
                    this.f53582OooO00o.remove(0);
                }
            }
        }

        public final SpannableString OooO0O0() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53583OooO0O0);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f53596OooOOOo != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f53596OooOOOo, length, 33);
                }
                if (this.f53598OooOOo0 != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f53598OooOOo0, length, 33);
                }
                if (this.f53597OooOOo != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f53599OooOOoo), this.f53597OooOOo, length, 33);
                }
                if (this.f53601OooOo00 != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f53600OooOo0), this.f53601OooOo00, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        public final void OooO0OO() {
            this.f53582OooO00o.clear();
            this.f53583OooO0O0.clear();
            this.f53596OooOOOo = -1;
            this.f53598OooOOo0 = -1;
            this.f53597OooOOo = -1;
            this.f53601OooOo00 = -1;
            this.f53602OooOo0O = 0;
        }

        public final void OooO0o() {
            OooO0OO();
            this.f53584OooO0OO = false;
            this.f53585OooO0Oo = false;
            this.f53587OooO0o0 = 4;
            this.f53586OooO0o = false;
            this.f53588OooO0oO = 0;
            this.f53589OooO0oo = 0;
            this.f53581OooO = 0;
            this.f53590OooOO0 = 15;
            this.f53591OooOO0O = true;
            this.f53592OooOO0o = 0;
            this.f53594OooOOO0 = 0;
            this.f53593OooOOO = 0;
            int i = f53571OooOo;
            this.f53595OooOOOO = i;
            this.f53599OooOOoo = f53572OooOo0o;
            this.f53600OooOo0 = i;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
        public final boolean OooO0o0() {
            return !this.f53584OooO0OO || (this.f53582OooO00o.isEmpty() && this.f53583OooO0O0.length() == 0);
        }

        public final void OooO0oO(boolean z, boolean z2) {
            if (this.f53596OooOOOo != -1) {
                if (!z) {
                    this.f53583OooO0O0.setSpan(new StyleSpan(2), this.f53596OooOOOo, this.f53583OooO0O0.length(), 33);
                    this.f53596OooOOOo = -1;
                }
            } else if (z) {
                this.f53596OooOOOo = this.f53583OooO0O0.length();
            }
            if (this.f53598OooOOo0 == -1) {
                if (z2) {
                    this.f53598OooOOo0 = this.f53583OooO0O0.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.f53583OooO0O0.setSpan(new UnderlineSpan(), this.f53598OooOOo0, this.f53583OooO0O0.length(), 33);
                this.f53598OooOOo0 = -1;
            }
        }

        public final void OooO0oo(int i, int i2) {
            if (this.f53597OooOOo != -1 && this.f53599OooOOoo != i) {
                this.f53583OooO0O0.setSpan(new ForegroundColorSpan(this.f53599OooOOoo), this.f53597OooOOo, this.f53583OooO0O0.length(), 33);
            }
            if (i != f53572OooOo0o) {
                this.f53597OooOOo = this.f53583OooO0O0.length();
                this.f53599OooOOoo = i;
            }
            if (this.f53601OooOo00 != -1 && this.f53600OooOo0 != i2) {
                this.f53583OooO0O0.setSpan(new BackgroundColorSpan(this.f53600OooOo0), this.f53601OooOo00, this.f53583OooO0O0.length(), 33);
            }
            if (i2 != f53571OooOo) {
                this.f53601OooOo00 = this.f53583OooO0O0.length();
                this.f53600OooOo0 = i2;
            }
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f53603OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f53604OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f53605OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f53606OooO0Oo = 0;

        public OooO0OO(int i, int i2) {
            this.f53603OooO00o = i;
            this.f53604OooO0O0 = i2;
            this.f53605OooO0OO = new byte[(i2 * 2) - 1];
        }
    }

    public o0O00O0o(int i, @Nullable List<byte[]> list) {
        this.f53560OooO = i == -1 ? 1 : i;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f53563OooOO0 = new OooO0O0[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f53563OooOO0[i2] = new OooO0O0();
        }
        this.f53564OooOO0O = this.f53563OooOO0[0];
    }

    @Override // p712oooOO0.o0O00O
    public final void OooO0o(o0000O0O o0000o0o2) {
        ByteBuffer byteBuffer = o0000o0o2.f13642Oooo0oO;
        Objects.requireNonNull(byteBuffer);
        this.f53561OooO0oO.OooOoO0(byteBuffer.array(), byteBuffer.limit());
        while (true) {
            o000 o000Var = this.f53561OooO0oO;
            if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < 3) {
                return;
            }
            int iOooOOo0 = o000Var.OooOOo0() & 7;
            int i = iOooOOo0 & 3;
            boolean z = (iOooOOo0 & 4) == 4;
            byte bOooOOo0 = (byte) this.f53561OooO0oO.OooOOo0();
            byte bOooOOo1 = (byte) this.f53561OooO0oO.OooOOo0();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        OooOO0();
                        int i2 = (bOooOOo0 & 192) >> 6;
                        int i3 = bOooOOo0 & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        OooO0OO oooO0OO = new OooO0OO(i2, i3);
                        this.f53566OooOOO = oooO0OO;
                        byte[] bArr = oooO0OO.f53605OooO0OO;
                        int i4 = oooO0OO.f53606OooO0Oo;
                        oooO0OO.f53606OooO0Oo = i4 + 1;
                        bArr[i4] = bOooOOo1;
                    } else {
                        o00000O0.OooO00o(i == 2);
                        OooO0OO oooO0OO2 = this.f53566OooOOO;
                        if (oooO0OO2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = oooO0OO2.f53605OooO0OO;
                            int i5 = oooO0OO2.f53606OooO0Oo;
                            int i6 = i5 + 1;
                            oooO0OO2.f53606OooO0Oo = i6;
                            bArr2[i5] = bOooOOo0;
                            oooO0OO2.f53606OooO0Oo = i6 + 1;
                            bArr2[i6] = bOooOOo1;
                        }
                    }
                    OooO0OO oooO0OO3 = this.f53566OooOOO;
                    if (oooO0OO3.f53606OooO0Oo == (oooO0OO3.f53604OooO0O0 * 2) - 1) {
                        OooOO0();
                    }
                }
            }
        }
    }

    @Override // p712oooOO0.o0O00O
    public final o0000O00 OooO0o0() {
        List<Cue> list = this.f53565OooOO0o;
        this.f53567OooOOO0 = list;
        Objects.requireNonNull(list);
        return new o0O00OO(list);
    }

    @Override // p712oooOO0.o0O00O
    public final boolean OooO0oo() {
        return this.f53565OooOO0o != this.f53567OooOOO0;
    }

    /* JADX WARN: Type inference failed for: r0v104, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
    public final void OooOO0() {
        OooO0OO oooO0OO = this.f53566OooOOO;
        if (oooO0OO == null) {
            return;
        }
        int i = oooO0OO.f53606OooO0Oo;
        int i2 = (oooO0OO.f53604OooO0O0 * 2) - 1;
        if (i != i2) {
            int i3 = oooO0OO.f53603OooO00o;
            StringBuilder sb = new StringBuilder(131);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append(i2);
            sb.append(", but current index is ");
            sb.append(i);
            sb.append(" (sequence number ");
            sb.append(i3);
            sb.append("); ignoring packet");
            Log.w("Cea708Decoder", sb.toString());
        } else {
            this.f53562OooO0oo.OooOO0(oooO0OO.f53605OooO0OO, i);
            int i4 = 3;
            int iOooO0oO = this.f53562OooO0oo.OooO0oO(3);
            int iOooO0oO2 = this.f53562OooO0oo.OooO0oO(5);
            int i5 = 7;
            int i6 = 6;
            if (iOooO0oO == 7) {
                this.f53562OooO0oo.OooOOO0(2);
                iOooO0oO = this.f53562OooO0oo.OooO0oO(6);
                if (iOooO0oO < 7) {
                    o00O00O.OooO0OO.OooO0O0(44, "Invalid extended service number: ", iOooO0oO, "Cea708Decoder");
                }
            }
            if (iOooO0oO2 == 0) {
                if (iOooO0oO != 0) {
                    StringBuilder sb2 = new StringBuilder(59);
                    sb2.append("serviceNumber is non-zero (");
                    sb2.append(iOooO0oO);
                    sb2.append(") when blockSize is 0");
                    Log.w("Cea708Decoder", sb2.toString());
                }
            } else if (iOooO0oO == this.f53560OooO) {
                boolean z = false;
                while (this.f53562OooO0oo.OooO0O0() > 0) {
                    int iOooO0oO3 = this.f53562OooO0oo.OooO0oO(8);
                    if (iOooO0oO3 == 16) {
                        int iOooO0oO4 = this.f53562OooO0oo.OooO0oO(8);
                        if (iOooO0oO4 > 31) {
                            if (iOooO0oO4 <= 127) {
                                if (iOooO0oO4 == 32) {
                                    this.f53564OooOO0O.OooO00o(' ');
                                } else if (iOooO0oO4 == 33) {
                                    this.f53564OooOO0O.OooO00o(Typography.nbsp);
                                } else if (iOooO0oO4 == 37) {
                                    this.f53564OooOO0O.OooO00o(Typography.ellipsis);
                                } else if (iOooO0oO4 == 42) {
                                    this.f53564OooOO0O.OooO00o((char) 352);
                                } else if (iOooO0oO4 == 44) {
                                    this.f53564OooOO0O.OooO00o((char) 338);
                                } else if (iOooO0oO4 == 63) {
                                    this.f53564OooOO0O.OooO00o((char) 376);
                                } else if (iOooO0oO4 == 57) {
                                    this.f53564OooOO0O.OooO00o(Typography.tm);
                                } else if (iOooO0oO4 == 58) {
                                    this.f53564OooOO0O.OooO00o((char) 353);
                                } else if (iOooO0oO4 == 60) {
                                    this.f53564OooOO0O.OooO00o((char) 339);
                                } else if (iOooO0oO4 != 61) {
                                    switch (iOooO0oO4) {
                                        case 48:
                                            this.f53564OooOO0O.OooO00o((char) 9608);
                                            break;
                                        case 49:
                                            this.f53564OooOO0O.OooO00o(Typography.leftSingleQuote);
                                            break;
                                        case 50:
                                            this.f53564OooOO0O.OooO00o(Typography.rightSingleQuote);
                                            break;
                                        case 51:
                                            this.f53564OooOO0O.OooO00o(Typography.leftDoubleQuote);
                                            break;
                                        case 52:
                                            this.f53564OooOO0O.OooO00o(Typography.rightDoubleQuote);
                                            break;
                                        case 53:
                                            this.f53564OooOO0O.OooO00o(Typography.bullet);
                                            break;
                                        default:
                                            switch (iOooO0oO4) {
                                                case 118:
                                                    this.f53564OooOO0O.OooO00o((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f53564OooOO0O.OooO00o((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f53564OooOO0O.OooO00o((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f53564OooOO0O.OooO00o((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f53564OooOO0O.OooO00o((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f53564OooOO0O.OooO00o((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f53564OooOO0O.OooO00o((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f53564OooOO0O.OooO00o((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f53564OooOO0O.OooO00o((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f53564OooOO0O.OooO00o((char) 9484);
                                                    break;
                                                default:
                                                    o00O00O.OooO0OO.OooO0O0(33, "Invalid G2 character: ", iOooO0oO4, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f53564OooOO0O.OooO00o((char) 8480);
                                }
                            } else if (iOooO0oO4 <= 159) {
                                if (iOooO0oO4 <= 135) {
                                    this.f53562OooO0oo.OooOOO0(32);
                                } else if (iOooO0oO4 <= 143) {
                                    this.f53562OooO0oo.OooOOO0(40);
                                } else if (iOooO0oO4 <= 159) {
                                    this.f53562OooO0oo.OooOOO0(2);
                                    this.f53562OooO0oo.OooOOO0(this.f53562OooO0oo.OooO0oO(6) * 8);
                                }
                            } else if (iOooO0oO4 > 255) {
                                o00O00O.OooO0OO.OooO0O0(37, "Invalid extended command: ", iOooO0oO4, "Cea708Decoder");
                            } else if (iOooO0oO4 == 160) {
                                this.f53564OooOO0O.OooO00o((char) 13252);
                            } else {
                                o00O00O.OooO0OO.OooO0O0(33, "Invalid G3 character: ", iOooO0oO4, "Cea708Decoder");
                                this.f53564OooOO0O.OooO00o('_');
                            }
                            z = true;
                        } else if (iOooO0oO4 > 7) {
                            if (iOooO0oO4 <= 15) {
                                this.f53562OooO0oo.OooOOO0(8);
                            } else if (iOooO0oO4 <= 23) {
                                this.f53562OooO0oo.OooOOO0(16);
                            } else if (iOooO0oO4 <= 31) {
                                this.f53562OooO0oo.OooOOO0(24);
                            }
                        }
                    } else if (iOooO0oO3 > 31) {
                        if (iOooO0oO3 <= 127) {
                            if (iOooO0oO3 == 127) {
                                this.f53564OooOO0O.OooO00o((char) 9835);
                            } else {
                                this.f53564OooOO0O.OooO00o((char) (iOooO0oO3 & KotlinVersion.MAX_COMPONENT_VALUE));
                            }
                        } else if (iOooO0oO3 <= 159) {
                            switch (iOooO0oO3) {
                                case 128:
                                case Constants.ERR_WATERMARK_READ /* 129 */:
                                case Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED /* 130 */:
                                case 131:
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                    int i7 = iOooO0oO3 - 128;
                                    if (this.f53568OooOOOO != i7) {
                                        this.f53568OooOOOO = i7;
                                        this.f53564OooOO0O = this.f53563OooOO0[i7];
                                    }
                                    break;
                                case 136:
                                    for (int i8 = 1; i8 <= 8; i8++) {
                                        if (this.f53562OooO0oo.OooO0o()) {
                                            this.f53563OooOO0[8 - i8].OooO0OO();
                                        }
                                    }
                                    break;
                                case 137:
                                    for (int i9 = 1; i9 <= 8; i9++) {
                                        if (this.f53562OooO0oo.OooO0o()) {
                                            this.f53563OooOO0[8 - i9].f53585OooO0Oo = true;
                                        }
                                    }
                                    break;
                                case 138:
                                    for (int i10 = 1; i10 <= 8; i10++) {
                                        if (this.f53562OooO0oo.OooO0o()) {
                                            this.f53563OooOO0[8 - i10].f53585OooO0Oo = false;
                                        }
                                    }
                                    break;
                                case 139:
                                    for (int i11 = 1; i11 <= 8; i11++) {
                                        if (this.f53562OooO0oo.OooO0o()) {
                                            OooO0O0 oooO0O0 = this.f53563OooOO0[8 - i11];
                                            oooO0O0.f53585OooO0Oo = !oooO0O0.f53585OooO0Oo;
                                        }
                                    }
                                    break;
                                case 140:
                                    for (int i12 = 1; i12 <= 8; i12++) {
                                        if (this.f53562OooO0oo.OooO0o()) {
                                            this.f53563OooOO0[8 - i12].OooO0o();
                                        }
                                    }
                                    break;
                                case ZegoConstants.RoomError.SessionError /* 141 */:
                                    this.f53562OooO0oo.OooOOO0(8);
                                    break;
                                case 142:
                                    break;
                                case 143:
                                    OooOO0o();
                                    break;
                                case 144:
                                    if (this.f53564OooOO0O.f53584OooO0OO) {
                                        this.f53562OooO0oo.OooO0oO(4);
                                        this.f53562OooO0oo.OooO0oO(2);
                                        this.f53562OooO0oo.OooO0oO(2);
                                        boolean zOooO0o = this.f53562OooO0oo.OooO0o();
                                        boolean zOooO0o2 = this.f53562OooO0oo.OooO0o();
                                        this.f53562OooO0oo.OooO0oO(3);
                                        this.f53562OooO0oo.OooO0oO(3);
                                        this.f53564OooOO0O.OooO0oO(zOooO0o, zOooO0o2);
                                    } else {
                                        this.f53562OooO0oo.OooOOO0(16);
                                    }
                                    break;
                                case 145:
                                    if (this.f53564OooOO0O.f53584OooO0OO) {
                                        int iOooO0Oo = OooO0O0.OooO0Oo(this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2));
                                        int iOooO0Oo2 = OooO0O0.OooO0Oo(this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2));
                                        this.f53562OooO0oo.OooOOO0(2);
                                        OooO0O0.OooO0Oo(this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), 0);
                                        this.f53564OooOO0O.OooO0oo(iOooO0Oo, iOooO0Oo2);
                                    } else {
                                        this.f53562OooO0oo.OooOOO0(24);
                                    }
                                    break;
                                case 146:
                                    if (this.f53564OooOO0O.f53584OooO0OO) {
                                        this.f53562OooO0oo.OooOOO0(4);
                                        int iOooO0oO5 = this.f53562OooO0oo.OooO0oO(4);
                                        this.f53562OooO0oo.OooOOO0(2);
                                        this.f53562OooO0oo.OooO0oO(6);
                                        OooO0O0 oooO0O1 = this.f53564OooOO0O;
                                        if (oooO0O1.f53602OooOo0O != iOooO0oO5) {
                                            oooO0O1.OooO00o('\n');
                                        }
                                        oooO0O1.f53602OooOo0O = iOooO0oO5;
                                    } else {
                                        this.f53562OooO0oo.OooOOO0(16);
                                    }
                                    break;
                                case 147:
                                case 148:
                                case 149:
                                case 150:
                                default:
                                    o00O00O.OooO0OO.OooO0O0(31, "Invalid C1 command: ", iOooO0oO3, "Cea708Decoder");
                                    break;
                                case Constants.ERR_PUBLISH_STREAM_CDN_ERROR /* 151 */:
                                    if (this.f53564OooOO0O.f53584OooO0OO) {
                                        int iOooO0Oo3 = OooO0O0.OooO0Oo(this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2));
                                        this.f53562OooO0oo.OooO0oO(2);
                                        OooO0O0.OooO0Oo(this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), this.f53562OooO0oo.OooO0oO(2), 0);
                                        this.f53562OooO0oo.OooO0o();
                                        this.f53562OooO0oo.OooO0o();
                                        this.f53562OooO0oo.OooO0oO(2);
                                        this.f53562OooO0oo.OooO0oO(2);
                                        int iOooO0oO6 = this.f53562OooO0oo.OooO0oO(2);
                                        this.f53562OooO0oo.OooOOO0(8);
                                        OooO0O0 oooO0O2 = this.f53564OooOO0O;
                                        oooO0O2.f53595OooOOOO = iOooO0Oo3;
                                        oooO0O2.f53592OooOO0o = iOooO0oO6;
                                    } else {
                                        this.f53562OooO0oo.OooOOO0(32);
                                    }
                                    break;
                                case Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT /* 152 */:
                                case Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED /* 153 */:
                                case Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR /* 154 */:
                                case Constants.ERR_PUBLISH_STREAM_NOT_FOUND /* 155 */:
                                case Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED /* 156 */:
                                case Constants.ERR_MODULE_NOT_FOUND /* 157 */:
                                case 158:
                                case 159:
                                    int i13 = iOooO0oO3 - 152;
                                    OooO0O0 oooO0O3 = this.f53563OooOO0[i13];
                                    this.f53562OooO0oo.OooOOO0(2);
                                    boolean zOooO0o3 = this.f53562OooO0oo.OooO0o();
                                    boolean zOooO0o4 = this.f53562OooO0oo.OooO0o();
                                    this.f53562OooO0oo.OooO0o();
                                    int iOooO0oO7 = this.f53562OooO0oo.OooO0oO(i4);
                                    boolean zOooO0o5 = this.f53562OooO0oo.OooO0o();
                                    int iOooO0oO8 = this.f53562OooO0oo.OooO0oO(i5);
                                    int iOooO0oO9 = this.f53562OooO0oo.OooO0oO(8);
                                    int iOooO0oO10 = this.f53562OooO0oo.OooO0oO(4);
                                    int iOooO0oO11 = this.f53562OooO0oo.OooO0oO(4);
                                    this.f53562OooO0oo.OooOOO0(2);
                                    this.f53562OooO0oo.OooO0oO(i6);
                                    this.f53562OooO0oo.OooOOO0(2);
                                    int iOooO0oO12 = this.f53562OooO0oo.OooO0oO(i4);
                                    int iOooO0oO13 = this.f53562OooO0oo.OooO0oO(i4);
                                    oooO0O3.f53584OooO0OO = true;
                                    oooO0O3.f53585OooO0Oo = zOooO0o3;
                                    oooO0O3.f53591OooOO0O = zOooO0o4;
                                    oooO0O3.f53587OooO0o0 = iOooO0oO7;
                                    oooO0O3.f53586OooO0o = zOooO0o5;
                                    oooO0O3.f53588OooO0oO = iOooO0oO8;
                                    oooO0O3.f53589OooO0oo = iOooO0oO9;
                                    oooO0O3.f53581OooO = iOooO0oO10;
                                    int i14 = iOooO0oO11 + 1;
                                    if (oooO0O3.f53590OooOO0 != i14) {
                                        oooO0O3.f53590OooOO0 = i14;
                                        while (true) {
                                            if ((zOooO0o4 && oooO0O3.f53582OooO00o.size() >= oooO0O3.f53590OooOO0) || oooO0O3.f53582OooO00o.size() >= 15) {
                                                oooO0O3.f53582OooO00o.remove(0);
                                            }
                                        }
                                    }
                                    if (iOooO0oO12 != 0 && oooO0O3.f53594OooOOO0 != iOooO0oO12) {
                                        oooO0O3.f53594OooOOO0 = iOooO0oO12;
                                        int i15 = iOooO0oO12 - 1;
                                        int i16 = OooO0O0.f53576OooOoo[i15];
                                        boolean z2 = OooO0O0.f53577OooOoo0[i15];
                                        int i17 = OooO0O0.f53573OooOoO[i15];
                                        int i18 = OooO0O0.f53575OooOoOO[i15];
                                        int i19 = OooO0O0.f53574OooOoO0[i15];
                                        oooO0O3.f53595OooOOOO = i16;
                                        oooO0O3.f53592OooOO0o = i19;
                                    }
                                    if (iOooO0oO13 != 0 && oooO0O3.f53593OooOOO != iOooO0oO13) {
                                        oooO0O3.f53593OooOOO = iOooO0oO13;
                                        int i20 = iOooO0oO13 - 1;
                                        int i21 = OooO0O0.f53579OooOooo[i20];
                                        int i22 = OooO0O0.f53578OooOooO[i20];
                                        oooO0O3.OooO0oO(false, false);
                                        int i23 = OooO0O0.f53572OooOo0o;
                                        int i24 = OooO0O0.f53580Oooo000[i20];
                                        int i25 = OooO0O0.f53571OooOo;
                                        oooO0O3.OooO0oo(i23, i24);
                                    }
                                    if (this.f53568OooOOOO != i13) {
                                        this.f53568OooOOOO = i13;
                                        this.f53564OooOO0O = this.f53563OooOO0[i13];
                                    }
                                    break;
                            }
                        } else if (iOooO0oO3 <= 255) {
                            this.f53564OooOO0O.OooO00o((char) (iOooO0oO3 & KotlinVersion.MAX_COMPONENT_VALUE));
                        } else {
                            o00O00O.OooO0OO.OooO0O0(33, "Invalid base command: ", iOooO0oO3, "Cea708Decoder");
                        }
                        z = true;
                    } else if (iOooO0oO3 != 0) {
                        if (iOooO0oO3 == i4) {
                            this.f53565OooOO0o = OooOO0O();
                        } else if (iOooO0oO3 != 8) {
                            switch (iOooO0oO3) {
                                case 12:
                                    OooOO0o();
                                    break;
                                case 13:
                                    this.f53564OooOO0O.OooO00o('\n');
                                    break;
                                case 14:
                                    break;
                                default:
                                    if (iOooO0oO3 >= 17 && iOooO0oO3 <= 23) {
                                        o00O00O.OooO0OO.OooO0O0(55, "Currently unsupported COMMAND_EXT1 Command: ", iOooO0oO3, "Cea708Decoder");
                                        this.f53562OooO0oo.OooOOO0(8);
                                    } else if (iOooO0oO3 < 24 || iOooO0oO3 > 31) {
                                        o00O00O.OooO0OO.OooO0O0(31, "Invalid C0 command: ", iOooO0oO3, "Cea708Decoder");
                                    } else {
                                        o00O00O.OooO0OO.OooO0O0(54, "Currently unsupported COMMAND_P16 Command: ", iOooO0oO3, "Cea708Decoder");
                                        this.f53562OooO0oo.OooOOO0(16);
                                    }
                                    break;
                            }
                        } else {
                            OooO0O0 oooO0O4 = this.f53564OooOO0O;
                            int length = oooO0O4.f53583OooO0O0.length();
                            if (length > 0) {
                                oooO0O4.f53583OooO0O0.delete(length - 1, length);
                            }
                        }
                    }
                    i4 = 3;
                    i5 = 7;
                    i6 = 6;
                }
                if (z) {
                    this.f53565OooOO0o = OooOO0O();
                }
            }
        }
        this.f53566OooOOO = null;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<android.text.SpannableString>] */
    public final List<Cue> OooOO0O() {
        Layout.Alignment alignment;
        float f;
        float f2;
        OooO00o oooO00o;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f53563OooOO0[i].OooO0o0()) {
                OooO0O0[] oooO0O0Arr = this.f53563OooOO0;
                if (oooO0O0Arr[i].f53585OooO0Oo) {
                    OooO0O0 oooO0O0 = oooO0O0Arr[i];
                    if (oooO0O0.OooO0o0()) {
                        oooO00o = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < oooO0O0.f53582OooO00o.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) oooO0O0.f53582OooO00o.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) oooO0O0.OooO0O0());
                        int i3 = oooO0O0.f53592OooOO0o;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalArgumentException(Oooo0.OooO00o(43, "Unexpected justification value: ", oooO0O0.f53592OooOO0o));
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        if (oooO0O0.f53586OooO0o) {
                            f = oooO0O0.f53589OooO0oo / 99.0f;
                            f2 = oooO0O0.f53588OooO0oO / 99.0f;
                        } else {
                            f = oooO0O0.f53589OooO0oo / 209.0f;
                            f2 = oooO0O0.f53588OooO0oO / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i4 = oooO0O0.f53581OooO;
                        int i5 = i4 % 3;
                        int i6 = i5 == 0 ? 0 : i5 == 1 ? 1 : 2;
                        int i7 = i4 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = oooO0O0.f53595OooOOOO;
                        oooO00o = new OooO00o(spannableStringBuilder, alignment2, f4, i6, f3, i8, i9 != OooO0O0.f53571OooOo, i9, oooO0O0.f53587OooO0o0);
                    }
                    if (oooO00o != null) {
                        arrayList.add(oooO00o);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: oooOO0.o0OoO00O
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((o0O00O0o.OooO00o) obj).f53570OooO0O0, ((o0O00O0o.OooO00o) obj2).f53570OooO0O0);
            }
        });
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(((OooO00o) arrayList.get(i10)).f53569OooO00o);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void OooOO0o() {
        for (int i = 0; i < 8; i++) {
            this.f53563OooOO0[i].OooO0o();
        }
    }

    @Override // p712oooOO0.o0O00O, p294o0O0Oo0o.oo0o0Oo
    public final void flush() {
        super.flush();
        this.f53565OooOO0o = null;
        this.f53567OooOOO0 = null;
        this.f53568OooOOOO = 0;
        this.f53564OooOO0O = this.f53563OooOO0[0];
        OooOO0o();
        this.f53566OooOOO = null;
    }
}
