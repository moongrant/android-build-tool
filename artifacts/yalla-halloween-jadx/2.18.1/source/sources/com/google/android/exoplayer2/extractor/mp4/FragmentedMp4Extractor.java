package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Track;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.UByte;
import o00O00O.OooO0OO;
import o0OOOO0o.OooO;
import p265o00ooo00.Oooo0;
import p293o0O0Oo0O.OooOO0O;
import p296o0O0OoO0.OooOo00;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.o0ooOOo;
import p296o0O0OoO0.oo0o0Oo;
import p300o0O0OooO.o000O0;
import p300o0O0OooO.o000O00;
import p300o0O0OooO.o000O00O;
import p300o0O0OooO.o000O0Oo;
import p300o0O0OooO.o000OO0O;
import p305o0O0o0OO.o000O000;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentedMp4Extractor implements Extractor {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final byte[] f13919Oooo000 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final Format f13920Oooo00O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000O000 f13921OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f13922OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Format> f13923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseArray<OooO0O0> f13924OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000 f13925OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000 f13926OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000 f13927OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final byte[] f13928OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000 f13929OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000 f13930OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayDeque<com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o> f13931OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayDeque<OooO00o> f13932OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f13933OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f13934OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f13935OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13936OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f13937OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000 f13938OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f13939OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f13940OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f13941OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13942OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f13943OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public OooO0O0 f13944OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f13945OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f13946OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f13947OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TrackOutput[] f13948OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o0OoOo0 f13949OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public TrackOutput[] f13950OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f13951OooOooo;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13952OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13953OooO0O0;

        public OooO00o(long j, int i) {
            this.f13952OooO00o = j;
            this.f13953OooO0O0 = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f13954OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final TrackOutput f13955OooO00o;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o000OO0O f13958OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f13959OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public p300o0O0OooO.o000 f13960OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13961OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f13962OooO0oo;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f13965OooOO0o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O0Oo f13956OooO0O0 = new o000O0Oo();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000 f13957OooO0OO = new o000();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final o000 f13963OooOO0 = new o000(1);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final o000 f13964OooOO0O = new o000();

        public OooO0O0(TrackOutput trackOutput, o000OO0O o000oo0o2, p300o0O0OooO.o000 o000Var) {
            this.f13955OooO00o = trackOutput;
            this.f13958OooO0Oo = o000oo0o2;
            this.f13960OooO0o0 = o000Var;
            this.f13958OooO0Oo = o000oo0o2;
            this.f13960OooO0o0 = o000Var;
            trackOutput.OooO0o0(o000oo0o2.f36029OooO00o.f14023OooO0o);
            OooO0o0();
        }

        public final long OooO00o() {
            return !this.f13965OooOO0o ? this.f13958OooO0Oo.f36031OooO0OO[this.f13959OooO0o] : this.f13956OooO0O0.f36015OooO0o[this.f13962OooO0oo];
        }

        @Nullable
        public final o000O0 OooO0O0() {
            if (!this.f13965OooOO0o) {
                return null;
            }
            o000O0Oo o000o0oo2 = this.f13956OooO0O0;
            p300o0O0OooO.o000 o000Var = o000o0oo2.f36011OooO00o;
            int i = o000OOo0.f36740OooO00o;
            int i2 = o000Var.f35996OooO00o;
            o000O0 o000o0OooO00o = o000o0oo2.f36022OooOOO;
            if (o000o0OooO00o == null) {
                o000o0OooO00o = this.f13958OooO0Oo.f36029OooO00o.OooO00o(i2);
            }
            if (o000o0OooO00o == null || !o000o0OooO00o.f36000OooO00o) {
                return null;
            }
            return o000o0OooO00o;
        }

        public final boolean OooO0OO() {
            this.f13959OooO0o++;
            if (!this.f13965OooOO0o) {
                return false;
            }
            int i = this.f13961OooO0oO + 1;
            this.f13961OooO0oO = i;
            int[] iArr = this.f13956OooO0O0.f36017OooO0oO;
            int i2 = this.f13962OooO0oo;
            if (i != iArr[i2]) {
                return true;
            }
            this.f13962OooO0oo = i2 + 1;
            this.f13961OooO0oO = 0;
            return false;
        }

        public final int OooO0Oo(int i, int i2) {
            o000 o000Var;
            o000O0 o000o0OooO0O0 = OooO0O0();
            if (o000o0OooO0O0 == null) {
                return 0;
            }
            int length = o000o0OooO0O0.f36003OooO0Oo;
            if (length != 0) {
                o000Var = this.f13956OooO0O0.f36024OooOOOO;
            } else {
                byte[] bArr = o000o0OooO0O0.f36004OooO0o0;
                int i3 = o000OOo0.f36740OooO00o;
                this.f13964OooOO0O.OooOoO0(bArr, bArr.length);
                o000 o000Var2 = this.f13964OooOO0O;
                length = bArr.length;
                o000Var = o000Var2;
            }
            o000O0Oo o000o0oo2 = this.f13956OooO0O0;
            boolean z = o000o0oo2.f36021OooOO0o && o000o0oo2.f36023OooOOO0[this.f13959OooO0o];
            boolean z2 = z || i2 != 0;
            o000 o000Var3 = this.f13963OooOO0;
            o000Var3.f36661OooO00o[0] = (byte) ((z2 ? 128 : 0) | length);
            o000Var3.OooOoOO(0);
            this.f13955OooO00o.OooO00o(this.f13963OooOO0, 1);
            this.f13955OooO00o.OooO00o(o000Var, length);
            if (!z2) {
                return length + 1;
            }
            if (!z) {
                this.f13957OooO0OO.OooOo(8);
                o000 o000Var4 = this.f13957OooO0OO;
                byte[] bArr2 = o000Var4.f36661OooO00o;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[4] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[5] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[6] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[7] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f13955OooO00o.OooO00o(o000Var4, 8);
                return length + 1 + 8;
            }
            o000 o000Var5 = this.f13956OooO0O0.f36024OooOOOO;
            int iOooOo0O = o000Var5.OooOo0O();
            o000Var5.OooOoo0(-2);
            int i4 = (iOooOo0O * 6) + 2;
            if (i2 != 0) {
                this.f13957OooO0OO.OooOo(i4);
                byte[] bArr3 = this.f13957OooO0OO.f36661OooO00o;
                o000Var5.OooO0OO(bArr3, 0, i4);
                int i5 = (((bArr3[2] & UByte.MAX_VALUE) << 8) | (bArr3[3] & UByte.MAX_VALUE)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
                o000Var5 = this.f13957OooO0OO;
            }
            this.f13955OooO00o.OooO00o(o000Var5, i4);
            return length + 1 + i4;
        }

        public final void OooO0o0() {
            o000O0Oo o000o0oo2 = this.f13956OooO0O0;
            o000o0oo2.f36014OooO0Oo = 0;
            o000o0oo2.f36027OooOOo0 = 0L;
            o000o0oo2.f36026OooOOo = false;
            o000o0oo2.f36021OooOO0o = false;
            o000o0oo2.f36025OooOOOo = false;
            o000o0oo2.f36022OooOOO = null;
            this.f13959OooO0o = 0;
            this.f13962OooO0oo = 0;
            this.f13961OooO0oO = 0;
            this.f13954OooO = 0;
            this.f13965OooOO0o = false;
        }
    }

    static {
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13163OooOO0O = "application/x-emsg";
        f13920Oooo00O = oooO0O0.OooO00o();
    }

    public FragmentedMp4Extractor() {
        List listEmptyList = Collections.emptyList();
        this.f13922OooO00o = 0;
        this.f13923OooO0O0 = Collections.unmodifiableList(listEmptyList);
        this.f13921OooO = new o000O000();
        this.f13930OooOO0 = new o000(16);
        this.f13925OooO0Oo = new o000(o0000O.f36673OooO00o);
        this.f13927OooO0o0 = new o000(5);
        this.f13926OooO0o = new o000();
        byte[] bArr = new byte[16];
        this.f13928OooO0oO = bArr;
        this.f13929OooO0oo = new o000(bArr);
        this.f13931OooOO0O = new ArrayDeque<>();
        this.f13932OooOO0o = new ArrayDeque<>();
        this.f13924OooO0OO = new SparseArray<>();
        this.f13941OooOo0 = -9223372036854775807L;
        this.f13942OooOo00 = -9223372036854775807L;
        this.f13943OooOo0O = -9223372036854775807L;
        this.f13949OooOoo0 = o0OoOo0.f35935OooO0oo;
        this.f13948OooOoo = new TrackOutput[0];
        this.f13950OooOooO = new TrackOutput[0];
    }

    public static int OooO00o(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        throw new ParserException(Oooo0.OooO00o(37, "Unexpected negtive value: ", i));
    }

    @Nullable
    public static DrmInitData OooO0oO(List<com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0 = list.get(i);
            if (oooO0O0.f13995OooO00o == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = oooO0O0.f13999OooO0O0.f36661OooO00o;
                o000O00.OooO00o OooO00o2 = o000O00.OooO00o(bArr);
                UUID uuid = OooO00o2 == null ? null : OooO00o2.f36005OooO00o;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void OooO0oo(o000 o000Var, int i, o000O0Oo o000o0oo2) throws ParserException {
        o000Var.OooOoOO(i + 8);
        int iOooO0Oo = o000Var.OooO0Oo() & 16777215;
        if ((iOooO0Oo & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iOooO0Oo & 2) != 0;
        int iOooOo00 = o000Var.OooOo00();
        if (iOooOo00 == 0) {
            Arrays.fill(o000o0oo2.f36023OooOOO0, 0, o000o0oo2.f36016OooO0o0, false);
            return;
        }
        if (iOooOo00 != o000o0oo2.f36016OooO0o0) {
            int i2 = o000o0oo2.f36016OooO0o0;
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(iOooOo00);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw new ParserException(sb.toString());
        }
        Arrays.fill(o000o0oo2.f36023OooOOO0, 0, iOooOo00, z);
        o000o0oo2.f36024OooOOOO.OooOo(o000Var.f36663OooO0OO - o000Var.f36662OooO0O0);
        o000o0oo2.f36021OooOO0o = true;
        o000o0oo2.f36025OooOOOo = true;
        o000 o000Var2 = o000o0oo2.f36024OooOOOO;
        o000Var.OooO0OO(o000Var2.f36661OooO00o, 0, o000Var2.f36663OooO0OO);
        o000o0oo2.f36024OooOOOO.OooOoOO(0);
        o000o0oo2.f36025OooOOOo = false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        int i;
        this.f13949OooOoo0 = o0oooo1;
        OooO0O0();
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f13948OooOoo = trackOutputArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.f13922OooO00o & 4) != 0) {
            trackOutputArr[0] = this.f13949OooOoo0.OooO00o(100);
            i2 = 101;
            i = 1;
        } else {
            i = 0;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) o000OOo0.OooOoo(this.f13948OooOoo, i);
        this.f13948OooOoo = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.OooO0o0(f13920Oooo00O);
        }
        this.f13950OooOooO = new TrackOutput[this.f13923OooO0O0.size()];
        while (i3 < this.f13950OooOooO.length) {
            TrackOutput trackOutputOooO00o = this.f13949OooOoo0.OooO00o(i2);
            trackOutputOooO00o.OooO0o0(this.f13923OooO0O0.get(i3));
            this.f13950OooOooO[i3] = trackOutputOooO00o;
            i3++;
            i2++;
        }
    }

    public final void OooO0O0() {
        this.f13934OooOOO0 = 0;
        this.f13936OooOOOo = 0;
    }

    public final p300o0O0OooO.o000 OooO0OO(SparseArray<p300o0O0OooO.o000> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        p300o0O0OooO.o000 o000Var = sparseArray.get(i);
        Objects.requireNonNull(o000Var);
        return o000Var;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0Oo(long j, long j2) {
        int size = this.f13924OooO0OO.size();
        for (int i = 0; i < size; i++) {
            this.f13924OooO0OO.valueAt(i).OooO0o0();
        }
        this.f13932OooOO0o.clear();
        this.f13939OooOOoo = 0;
        this.f13942OooOo00 = j2;
        this.f13931OooOO0O.clear();
        OooO0O0();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        return o000O00O.OooO00o(o000oooo2, true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:103:0x022a  */
    /* JADX WARN: Code duplicated, block: B:106:0x023e A[LOOP:10: B:106:0x023e->B:108:0x0244, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:108:0x0244 A[LOOP:10: B:106:0x023e->B:108:0x0244, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0254  */
    /* JADX WARN: Code duplicated, block: B:112:0x025d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0267  */
    /* JADX WARN: Code duplicated, block: B:115:0x0269  */
    /* JADX WARN: Code duplicated, block: B:118:0x0270  */
    /* JADX WARN: Code duplicated, block: B:121:0x027a  */
    /* JADX WARN: Code duplicated, block: B:122:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x028f  */
    /* JADX WARN: Code duplicated, block: B:128:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:209:0x0589  */
    /* JADX WARN: Code duplicated, block: B:210:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:212:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:219:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:222:0x05da  */
    /* JADX WARN: Code duplicated, block: B:230:0x0605  */
    /* JADX WARN: Code duplicated, block: B:232:0x060e A[LOOP:1: B:231:0x060c->B:232:0x060e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x0626  */
    /* JADX WARN: Code duplicated, block: B:236:0x0633  */
    /* JADX WARN: Code duplicated, block: B:255:0x0660  */
    /* JADX WARN: Code duplicated, block: B:257:0x0663  */
    /* JADX WARN: Code duplicated, block: B:259:0x0682  */
    /* JADX WARN: Code duplicated, block: B:260:0x0687  */
    /* JADX WARN: Code duplicated, block: B:261:0x068c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0715  */
    /* JADX WARN: Code duplicated, block: B:320:0x071b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0721  */
    /* JADX WARN: Code duplicated, block: B:324:0x0727  */
    /* JADX WARN: Code duplicated, block: B:329:0x074d  */
    /* JADX WARN: Code duplicated, block: B:331:0x0753  */
    /* JADX WARN: Code duplicated, block: B:346:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0745 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x075e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0766 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:386:0x0250 A[EDGE_INSN: B:386:0x0250->B:109:0x0250 BREAK  A[LOOP:10: B:106:0x023e->B:108:0x0244], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163  */
    /* JADX WARN: Code duplicated, block: B:78:0x0179  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        char c;
        o000OO0O o000oo0o2;
        Track track;
        TrackOutput trackOutput;
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        o000O0 o000o0OooO0O0;
        TrackOutput.OooO00o oooO00o;
        OooO00o oooO00oRemoveFirst;
        long j3;
        TrackOutput[] trackOutputArr;
        int length;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        int i8;
        int iOooO0O0;
        int iOooO0Oo;
        boolean z;
        String str;
        byte b;
        int i9;
        o000O0 o000o0OooO0O1;
        o000 o000Var;
        int i10;
        o000O0Oo o000o0oo2;
        boolean z2;
        String strOooOO0o;
        String strOooOO0o2;
        long jOooOooo;
        long jOooOooo2;
        long jOooOOo;
        long j4;
        long jOooOo0;
        long jOooOo1;
        long j5;
        long jOooO00o;
        long position;
        int i11;
        int i12;
        boolean z3;
        boolean z4;
        long j6;
        long position2;
        boolean z5;
        int size;
        int i13;
        o000oOoO o000oooo3 = o000oooo2;
        while (true) {
            int i14 = this.f13934OooOOO0;
            int i15 = 1;
            if (i14 == 0) {
                if (this.f13936OooOOOo == 0) {
                    z5 = false;
                    if (o000oooo3.OooO0O0(this.f13930OooOO0.f36661OooO00o, 0, 8, true)) {
                        this.f13936OooOOOo = 8;
                        this.f13930OooOO0.OooOoOO(0);
                        this.f13935OooOOOO = this.f13930OooOO0.OooOOo();
                        this.f13933OooOOO = this.f13930OooOO0.OooO0Oo();
                        j5 = this.f13935OooOOOO;
                        if (j5 == 1) {
                            o000oooo3.readFully(this.f13930OooOO0.f36661OooO00o, 8, 8);
                            this.f13936OooOOOo += 8;
                            this.f13935OooOOOO = this.f13930OooOO0.OooOo0();
                        } else if (j5 == 0) {
                            jOooO00o = o000oooo2.OooO00o();
                            if (jOooO00o == -1 && !this.f13931OooOO0O.isEmpty()) {
                                jOooO00o = this.f13931OooOO0O.peek().f13996OooO0O0;
                            }
                            if (jOooO00o != -1) {
                                this.f13935OooOOOO = (jOooO00o - o000oooo2.getPosition()) + ((long) this.f13936OooOOOo);
                            }
                        }
                        if (this.f13935OooOOOO >= this.f13936OooOOOo) {
                            throw new ParserException("Atom size less than header length (unsupported).");
                        }
                        position = o000oooo2.getPosition() - ((long) this.f13936OooOOOo);
                        i11 = this.f13933OooOOO;
                        if ((i11 != 1836019558 || i11 == 1835295092) && !this.f13951OooOooo) {
                            this.f13949OooOoo0.OooOO0O(new oo0o0Oo.OooO0O0(this.f13941OooOo0, position));
                            this.f13951OooOooo = true;
                        }
                        if (this.f13933OooOOO == 1836019558) {
                            size = this.f13924OooO0OO.size();
                            for (i13 = 0; i13 < size; i13++) {
                                o000O0Oo o000o0oo3 = this.f13924OooO0OO.valueAt(i13).f13956OooO0O0;
                                Objects.requireNonNull(o000o0oo3);
                                o000o0oo3.f36013OooO0OO = position;
                                o000o0oo3.f36012OooO0O0 = position;
                            }
                        }
                        i12 = this.f13933OooOOO;
                        if (i12 == 1835295092) {
                            this.f13944OooOo0o = null;
                            this.f13937OooOOo = position + this.f13935OooOOOO;
                            this.f13934OooOOO0 = 2;
                        } else {
                            if (i12 != 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1836019558 || i12 == 1953653094 || i12 == 1836475768 || i12 == 1701082227) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                position2 = (o000oooo2.getPosition() + this.f13935OooOOOO) - 8;
                                this.f13931OooOO0O.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o(this.f13933OooOOO, position2));
                                if (this.f13935OooOOOO == this.f13936OooOOOo) {
                                    OooOO0(position2);
                                } else {
                                    OooO0O0();
                                }
                            } else {
                                if (i12 != 1751411826 || i12 == 1835296868 || i12 == 1836476516 || i12 == 1936286840 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1668576371 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1937011571 || i12 == 1952867444 || i12 == 1952868452 || i12 == 1953196132 || i12 == 1953654136 || i12 == 1953658222 || i12 == 1886614376 || i12 == 1935763834 || i12 == 1935763823 || i12 == 1936027235 || i12 == 1970628964 || i12 == 1935828848 || i12 == 1936158820 || i12 == 1701606260 || i12 == 1835362404 || i12 == 1701671783) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    if (this.f13936OooOOOo == 8) {
                                        throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                                    }
                                    j6 = this.f13935OooOOOO;
                                    if (j6 <= 2147483647L) {
                                        throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                                    }
                                    o000 o000Var2 = new o000((int) j6);
                                    System.arraycopy(this.f13930OooOO0.f36661OooO00o, 0, o000Var2.f36661OooO00o, 0, 8);
                                    this.f13938OooOOo0 = o000Var2;
                                    this.f13934OooOOO0 = 1;
                                } else {
                                    if (this.f13935OooOOOO <= 2147483647L) {
                                        throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
                                    }
                                    this.f13938OooOOo0 = null;
                                    this.f13934OooOOO0 = 1;
                                }
                            }
                        }
                        z5 = true;
                    }
                } else {
                    j5 = this.f13935OooOOOO;
                    if (j5 == 1) {
                        o000oooo3.readFully(this.f13930OooOO0.f36661OooO00o, 8, 8);
                        this.f13936OooOOOo += 8;
                        this.f13935OooOOOO = this.f13930OooOO0.OooOo0();
                    } else if (j5 == 0) {
                        jOooO00o = o000oooo2.OooO00o();
                        if (jOooO00o == -1) {
                            jOooO00o = this.f13931OooOO0O.peek().f13996OooO0O0;
                        }
                        if (jOooO00o != -1) {
                            this.f13935OooOOOO = (jOooO00o - o000oooo2.getPosition()) + ((long) this.f13936OooOOOo);
                        }
                    }
                    if (this.f13935OooOOOO >= this.f13936OooOOOo) {
                        throw new ParserException("Atom size less than header length (unsupported).");
                    }
                    position = o000oooo2.getPosition() - ((long) this.f13936OooOOOo);
                    i11 = this.f13933OooOOO;
                    if (i11 != 1836019558) {
                        this.f13949OooOoo0.OooOO0O(new oo0o0Oo.OooO0O0(this.f13941OooOo0, position));
                        this.f13951OooOooo = true;
                    } else {
                        this.f13949OooOoo0.OooOO0O(new oo0o0Oo.OooO0O0(this.f13941OooOo0, position));
                        this.f13951OooOooo = true;
                    }
                    if (this.f13933OooOOO == 1836019558) {
                        size = this.f13924OooO0OO.size();
                        while (i13 < size) {
                            o000O0Oo o000o0oo4 = this.f13924OooO0OO.valueAt(i13).f13956OooO0O0;
                            Objects.requireNonNull(o000o0oo4);
                            o000o0oo4.f36013OooO0OO = position;
                            o000o0oo4.f36012OooO0O0 = position;
                        }
                    }
                    i12 = this.f13933OooOOO;
                    if (i12 == 1835295092) {
                        this.f13944OooOo0o = null;
                        this.f13937OooOOo = position + this.f13935OooOOOO;
                        this.f13934OooOOO0 = 2;
                    } else {
                        if (i12 != 1836019574) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            position2 = (o000oooo2.getPosition() + this.f13935OooOOOO) - 8;
                            this.f13931OooOO0O.push(new com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o(this.f13933OooOOO, position2));
                            if (this.f13935OooOOOO == this.f13936OooOOOo) {
                                OooOO0(position2);
                            } else {
                                OooO0O0();
                            }
                        } else {
                            if (i12 != 1751411826) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                if (this.f13936OooOOOo == 8) {
                                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                                }
                                j6 = this.f13935OooOOOO;
                                if (j6 <= 2147483647L) {
                                    throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                o000 o000Var3 = new o000((int) j6);
                                System.arraycopy(this.f13930OooOO0.f36661OooO00o, 0, o000Var3.f36661OooO00o, 0, 8);
                                this.f13938OooOOo0 = o000Var3;
                                this.f13934OooOOO0 = 1;
                            } else {
                                if (this.f13935OooOOOO <= 2147483647L) {
                                    throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                this.f13938OooOOo0 = null;
                                this.f13934OooOOO0 = 1;
                            }
                        }
                    }
                    z5 = true;
                }
                if (!z5) {
                    return -1;
                }
            } else if (i14 != 1) {
                long j7 = Long.MAX_VALUE;
                if (i14 != 2) {
                    OooO0O0 oooO0O0 = this.f13944OooOo0o;
                    if (oooO0O0 == null) {
                        SparseArray<OooO0O0> sparseArray = this.f13924OooO0OO;
                        int size2 = sparseArray.size();
                        long j8 = Long.MAX_VALUE;
                        OooO0O0 oooO0O1 = null;
                        for (int i16 = 0; i16 < size2; i16++) {
                            OooO0O0 oooO0O0ValueAt = sparseArray.valueAt(i16);
                            boolean z6 = oooO0O0ValueAt.f13965OooOO0o;
                            if ((z6 || oooO0O0ValueAt.f13959OooO0o != oooO0O0ValueAt.f13958OooO0Oo.f36030OooO0O0) && (!z6 || oooO0O0ValueAt.f13962OooO0oo != oooO0O0ValueAt.f13956OooO0O0.f36014OooO0Oo)) {
                                long jOooO00o2 = oooO0O0ValueAt.OooO00o();
                                if (jOooO00o2 < j8) {
                                    oooO0O1 = oooO0O0ValueAt;
                                    j8 = jOooO00o2;
                                }
                            }
                        }
                        if (oooO0O1 == null) {
                            int position3 = (int) (this.f13937OooOOo - o000oooo2.getPosition());
                            if (position3 < 0) {
                                throw new ParserException("Offset to end of mdat was negative.");
                            }
                            o000oooo3.OooOO0(position3);
                            OooO0O0();
                            i15 = 0;
                        } else {
                            int iOooO00o = (int) (oooO0O1.OooO00o() - o000oooo2.getPosition());
                            if (iOooO00o < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iOooO00o = 0;
                            }
                            o000oooo3.OooOO0(iOooO00o);
                            this.f13944OooOo0o = oooO0O1;
                            oooO0O0 = oooO0O1;
                            c = 6;
                            if (this.f13934OooOOO0 != 3) {
                                o000oo0o2 = oooO0O0.f13958OooO0Oo;
                                track = o000oo0o2.f36029OooO00o;
                                trackOutput = oooO0O0.f13955OooO00o;
                                if (oooO0O0.f13965OooOO0o) {
                                    o000O0Oo o000o0oo5 = oooO0O0.f13956OooO0O0;
                                    int i17 = oooO0O0.f13959OooO0o;
                                    j = ((long) o000o0oo5.f36010OooO[i17]) + o000o0oo5.f36019OooOO0[i17];
                                } else {
                                    j = o000oo0o2.f36033OooO0o[oooO0O0.f13959OooO0o];
                                }
                                j2 = j;
                                i = track.f14027OooOO0;
                                if (i != 0) {
                                    while (true) {
                                        i2 = this.f13946OooOoO0;
                                        i3 = this.f13940OooOo;
                                        if (i2 < i3) {
                                            break;
                                        }
                                        this.f13946OooOoO0 += trackOutput.OooO0O0(o000oooo3, i3 - i2, false);
                                    }
                                } else {
                                    bArr = this.f13927OooO0o0.f36661OooO00o;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i6 = i + 1;
                                    i7 = 4 - i;
                                    while (this.f13946OooOoO0 < this.f13940OooOo) {
                                        i8 = this.f13945OooOoO;
                                        if (i8 == 0) {
                                            o000oooo3.readFully(bArr, i7, i6);
                                            this.f13927OooO0o0.OooOoOO(0);
                                            iOooO0Oo = this.f13927OooO0o0.OooO0Oo();
                                            if (iOooO0Oo >= i15) {
                                                throw new ParserException("Invalid NAL length");
                                            }
                                            this.f13945OooOoO = iOooO0Oo - 1;
                                            this.f13925OooO0Oo.OooOoOO(0);
                                            trackOutput.OooO0OO(this.f13925OooO0Oo, 4);
                                            trackOutput.OooO0OO(this.f13927OooO0o0, i15);
                                            if (this.f13950OooOooO.length > 0) {
                                                str = track.f14023OooO0o.f13131OoooOOo;
                                                b = bArr[4];
                                                byte[] bArr2 = o0000O.f36673OooO00o;
                                                if ((!"video/avc".equals(str) && (b & 31) == c) || ("video/hevc".equals(str) && ((b & 126) >> i15) == 39)) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            } else {
                                                z = false;
                                            }
                                            this.f13947OooOoOO = z;
                                            this.f13946OooOoO0 += 5;
                                            this.f13940OooOo += i7;
                                        } else {
                                            if (this.f13947OooOoOO) {
                                                this.f13926OooO0o.OooOo(i8);
                                                o000oooo3.readFully(this.f13926OooO0o.f36661OooO00o, 0, this.f13945OooOoO);
                                                trackOutput.OooO0OO(this.f13926OooO0o, this.f13945OooOoO);
                                                iOooO0O0 = this.f13945OooOoO;
                                                o000 o000Var4 = this.f13926OooO0o;
                                                int iOooO0o0 = o0000O.OooO0o0(o000Var4.f36661OooO00o, o000Var4.f36663OooO0OO);
                                                this.f13926OooO0o.OooOoOO("video/hevc".equals(track.f14023OooO0o.f13131OoooOOo) ? 1 : 0);
                                                this.f13926OooO0o.OooOoO(iOooO0o0);
                                                com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, this.f13926OooO0o, this.f13950OooOooO);
                                            } else {
                                                iOooO0O0 = trackOutput.OooO0O0(o000oooo3, i8, false);
                                            }
                                            this.f13946OooOoO0 += iOooO0O0;
                                            this.f13945OooOoO -= iOooO0O0;
                                        }
                                        c = 6;
                                        i15 = 1;
                                    }
                                }
                                if (!oooO0O0.f13965OooOO0o) {
                                    i4 = oooO0O0.f13958OooO0Oo.f36035OooO0oO[oooO0O0.f13959OooO0o];
                                } else if (oooO0O0.f13956OooO0O0.f36020OooOO0O[oooO0O0.f13959OooO0o]) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if (oooO0O0.OooO0O0() != null) {
                                    i4 |= 1073741824;
                                }
                                int i18 = i4;
                                o000o0OooO0O0 = oooO0O0.OooO0O0();
                                if (o000o0OooO0O0 != null) {
                                    oooO00o = o000o0OooO0O0.f36002OooO0OO;
                                } else {
                                    oooO00o = null;
                                }
                                trackOutput.OooO0Oo(j2, i18, this.f13940OooOo, 0, oooO00o);
                                while (!this.f13932OooOO0o.isEmpty()) {
                                    oooO00oRemoveFirst = this.f13932OooOO0o.removeFirst();
                                    this.f13939OooOOoo -= oooO00oRemoveFirst.f13953OooO0O0;
                                    j3 = oooO00oRemoveFirst.f13952OooO00o + j2;
                                    trackOutputArr = this.f13948OooOoo;
                                    i5 = 0;
                                    for (length = trackOutputArr.length; i5 < length; length = length) {
                                        trackOutputArr[i5].OooO0Oo(j3, 1, oooO00oRemoveFirst.f13953OooO0O0, this.f13939OooOOoo, null);
                                        i5++;
                                    }
                                }
                                if (!oooO0O0.OooO0OO()) {
                                    this.f13944OooOo0o = null;
                                }
                                this.f13934OooOOO0 = 3;
                                i15 = 1;
                            } else {
                                if (oooO0O0.f13965OooOO0o) {
                                    i9 = oooO0O0.f13956OooO0O0.f36018OooO0oo[oooO0O0.f13959OooO0o];
                                } else {
                                    i9 = oooO0O0.f13958OooO0Oo.f36032OooO0Oo[oooO0O0.f13959OooO0o];
                                }
                                this.f13940OooOo = i9;
                                if (oooO0O0.f13959OooO0o < oooO0O0.f13954OooO) {
                                    o000oooo3.OooOO0(i9);
                                    o000o0OooO0O1 = oooO0O0.OooO0O0();
                                    if (o000o0OooO0O1 != null) {
                                        o000Var = oooO0O0.f13956OooO0O0.f36024OooOOOO;
                                        i10 = o000o0OooO0O1.f36003OooO0Oo;
                                        if (i10 != 0) {
                                            o000Var.OooOoo0(i10);
                                        }
                                        o000o0oo2 = oooO0O0.f13956OooO0O0;
                                        int i19 = oooO0O0.f13959OooO0o;
                                        if (o000o0oo2.f36021OooOO0o || !o000o0oo2.f36023OooOOO0[i19]) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            o000Var.OooOoo0(o000Var.OooOo0O() * 6);
                                        }
                                    }
                                    if (!oooO0O0.OooO0OO()) {
                                        this.f13944OooOo0o = null;
                                    }
                                    this.f13934OooOOO0 = 3;
                                } else {
                                    if (oooO0O0.f13958OooO0Oo.f36029OooO00o.f14025OooO0oO == 1) {
                                        this.f13940OooOo = i9 - 8;
                                        o000oooo3.OooOO0(8);
                                    }
                                    if ("audio/ac4".equals(oooO0O0.f13958OooO0Oo.f36029OooO00o.f14023OooO0o.f13131OoooOOo)) {
                                        this.f13946OooOoO0 = oooO0O0.OooO0Oo(this.f13940OooOo, 7);
                                        OooOO0O.OooO00o(this.f13940OooOo, this.f13929OooO0oo);
                                        oooO0O0.f13955OooO00o.OooO0OO(this.f13929OooO0oo, 7);
                                        this.f13946OooOoO0 += 7;
                                    } else {
                                        this.f13946OooOoO0 = oooO0O0.OooO0Oo(this.f13940OooOo, 0);
                                    }
                                    this.f13940OooOo += this.f13946OooOoO0;
                                    this.f13934OooOOO0 = 4;
                                    this.f13945OooOoO = 0;
                                    o000oo0o2 = oooO0O0.f13958OooO0Oo;
                                    track = o000oo0o2.f36029OooO00o;
                                    trackOutput = oooO0O0.f13955OooO00o;
                                    if (oooO0O0.f13965OooOO0o) {
                                        j = o000oo0o2.f36033OooO0o[oooO0O0.f13959OooO0o];
                                    } else {
                                        o000O0Oo o000o0oo6 = oooO0O0.f13956OooO0O0;
                                        int i110 = oooO0O0.f13959OooO0o;
                                        j = ((long) o000o0oo6.f36010OooO[i110]) + o000o0oo6.f36019OooOO0[i110];
                                    }
                                    j2 = j;
                                    i = track.f14027OooOO0;
                                    if (i != 0) {
                                        while (true) {
                                            i2 = this.f13946OooOoO0;
                                            i3 = this.f13940OooOo;
                                            if (i2 < i3) {
                                                break;
                                                break;
                                            }
                                            this.f13946OooOoO0 += trackOutput.OooO0O0(o000oooo3, i3 - i2, false);
                                        }
                                    } else {
                                        bArr = this.f13927OooO0o0.f36661OooO00o;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i6 = i + 1;
                                        i7 = 4 - i;
                                        while (this.f13946OooOoO0 < this.f13940OooOo) {
                                            i8 = this.f13945OooOoO;
                                            if (i8 == 0) {
                                                o000oooo3.readFully(bArr, i7, i6);
                                                this.f13927OooO0o0.OooOoOO(0);
                                                iOooO0Oo = this.f13927OooO0o0.OooO0Oo();
                                                if (iOooO0Oo >= i15) {
                                                    throw new ParserException("Invalid NAL length");
                                                }
                                                this.f13945OooOoO = iOooO0Oo - 1;
                                                this.f13925OooO0Oo.OooOoOO(0);
                                                trackOutput.OooO0OO(this.f13925OooO0Oo, 4);
                                                trackOutput.OooO0OO(this.f13927OooO0o0, i15);
                                                if (this.f13950OooOooO.length > 0) {
                                                    str = track.f14023OooO0o.f13131OoooOOo;
                                                    b = bArr[4];
                                                    byte[] bArr3 = o0000O.f36673OooO00o;
                                                    if ((!"video/avc".equals(str) && (b & 31) == c) || ("video/hevc".equals(str) && ((b & 126) >> i15) == 39)) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                this.f13947OooOoOO = z;
                                                this.f13946OooOoO0 += 5;
                                                this.f13940OooOo += i7;
                                            } else {
                                                if (this.f13947OooOoOO) {
                                                    this.f13926OooO0o.OooOo(i8);
                                                    o000oooo3.readFully(this.f13926OooO0o.f36661OooO00o, 0, this.f13945OooOoO);
                                                    trackOutput.OooO0OO(this.f13926OooO0o, this.f13945OooOoO);
                                                    iOooO0O0 = this.f13945OooOoO;
                                                    o000 o000Var5 = this.f13926OooO0o;
                                                    int iOooO0o1 = o0000O.OooO0o0(o000Var5.f36661OooO00o, o000Var5.f36663OooO0OO);
                                                    this.f13926OooO0o.OooOoOO("video/hevc".equals(track.f14023OooO0o.f13131OoooOOo) ? 1 : 0);
                                                    this.f13926OooO0o.OooOoO(iOooO0o1);
                                                    com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, this.f13926OooO0o, this.f13950OooOooO);
                                                } else {
                                                    iOooO0O0 = trackOutput.OooO0O0(o000oooo3, i8, false);
                                                }
                                                this.f13946OooOoO0 += iOooO0O0;
                                                this.f13945OooOoO -= iOooO0O0;
                                            }
                                            c = 6;
                                            i15 = 1;
                                        }
                                    }
                                    if (!oooO0O0.f13965OooOO0o) {
                                        i4 = oooO0O0.f13958OooO0Oo.f36035OooO0oO[oooO0O0.f13959OooO0o];
                                    } else if (oooO0O0.f13956OooO0O0.f36020OooOO0O[oooO0O0.f13959OooO0o]) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    if (oooO0O0.OooO0O0() != null) {
                                        i4 |= 1073741824;
                                    }
                                    int i111 = i4;
                                    o000o0OooO0O0 = oooO0O0.OooO0O0();
                                    if (o000o0OooO0O0 != null) {
                                        oooO00o = o000o0OooO0O0.f36002OooO0OO;
                                    } else {
                                        oooO00o = null;
                                    }
                                    trackOutput.OooO0Oo(j2, i111, this.f13940OooOo, 0, oooO00o);
                                    while (!this.f13932OooOO0o.isEmpty()) {
                                        oooO00oRemoveFirst = this.f13932OooOO0o.removeFirst();
                                        this.f13939OooOOoo -= oooO00oRemoveFirst.f13953OooO0O0;
                                        j3 = oooO00oRemoveFirst.f13952OooO00o + j2;
                                        trackOutputArr = this.f13948OooOoo;
                                        i5 = 0;
                                        while (i5 < length) {
                                            trackOutputArr[i5].OooO0Oo(j3, 1, oooO00oRemoveFirst.f13953OooO0O0, this.f13939OooOOoo, null);
                                            i5++;
                                        }
                                    }
                                    if (!oooO0O0.OooO0OO()) {
                                        this.f13944OooOo0o = null;
                                    }
                                    this.f13934OooOOO0 = 3;
                                    i15 = 1;
                                }
                            }
                        }
                    } else {
                        c = 6;
                        if (this.f13934OooOOO0 != 3) {
                            o000oo0o2 = oooO0O0.f13958OooO0Oo;
                            track = o000oo0o2.f36029OooO00o;
                            trackOutput = oooO0O0.f13955OooO00o;
                            if (oooO0O0.f13965OooOO0o) {
                                j = o000oo0o2.f36033OooO0o[oooO0O0.f13959OooO0o];
                            } else {
                                o000O0Oo o000o0oo7 = oooO0O0.f13956OooO0O0;
                                int i112 = oooO0O0.f13959OooO0o;
                                j = ((long) o000o0oo7.f36010OooO[i112]) + o000o0oo7.f36019OooOO0[i112];
                            }
                            j2 = j;
                            i = track.f14027OooOO0;
                            if (i != 0) {
                                while (true) {
                                    i2 = this.f13946OooOoO0;
                                    i3 = this.f13940OooOo;
                                    if (i2 < i3) {
                                        break;
                                        break;
                                    }
                                    this.f13946OooOoO0 += trackOutput.OooO0O0(o000oooo3, i3 - i2, false);
                                }
                            } else {
                                bArr = this.f13927OooO0o0.f36661OooO00o;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                i6 = i + 1;
                                i7 = 4 - i;
                                while (this.f13946OooOoO0 < this.f13940OooOo) {
                                    i8 = this.f13945OooOoO;
                                    if (i8 == 0) {
                                        o000oooo3.readFully(bArr, i7, i6);
                                        this.f13927OooO0o0.OooOoOO(0);
                                        iOooO0Oo = this.f13927OooO0o0.OooO0Oo();
                                        if (iOooO0Oo >= i15) {
                                            throw new ParserException("Invalid NAL length");
                                        }
                                        this.f13945OooOoO = iOooO0Oo - 1;
                                        this.f13925OooO0Oo.OooOoOO(0);
                                        trackOutput.OooO0OO(this.f13925OooO0Oo, 4);
                                        trackOutput.OooO0OO(this.f13927OooO0o0, i15);
                                        if (this.f13950OooOooO.length > 0) {
                                            str = track.f14023OooO0o.f13131OoooOOo;
                                            b = bArr[4];
                                            byte[] bArr4 = o0000O.f36673OooO00o;
                                            if ((!"video/avc".equals(str) && (b & 31) == c) || ("video/hevc".equals(str) && ((b & 126) >> i15) == 39)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        } else {
                                            z = false;
                                        }
                                        this.f13947OooOoOO = z;
                                        this.f13946OooOoO0 += 5;
                                        this.f13940OooOo += i7;
                                    } else {
                                        if (this.f13947OooOoOO) {
                                            this.f13926OooO0o.OooOo(i8);
                                            o000oooo3.readFully(this.f13926OooO0o.f36661OooO00o, 0, this.f13945OooOoO);
                                            trackOutput.OooO0OO(this.f13926OooO0o, this.f13945OooOoO);
                                            iOooO0O0 = this.f13945OooOoO;
                                            o000 o000Var6 = this.f13926OooO0o;
                                            int iOooO0o2 = o0000O.OooO0o0(o000Var6.f36661OooO00o, o000Var6.f36663OooO0OO);
                                            this.f13926OooO0o.OooOoOO("video/hevc".equals(track.f14023OooO0o.f13131OoooOOo) ? 1 : 0);
                                            this.f13926OooO0o.OooOoO(iOooO0o2);
                                            com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, this.f13926OooO0o, this.f13950OooOooO);
                                        } else {
                                            iOooO0O0 = trackOutput.OooO0O0(o000oooo3, i8, false);
                                        }
                                        this.f13946OooOoO0 += iOooO0O0;
                                        this.f13945OooOoO -= iOooO0O0;
                                    }
                                    c = 6;
                                    i15 = 1;
                                }
                            }
                            if (!oooO0O0.f13965OooOO0o) {
                                i4 = oooO0O0.f13958OooO0Oo.f36035OooO0oO[oooO0O0.f13959OooO0o];
                            } else if (oooO0O0.f13956OooO0O0.f36020OooOO0O[oooO0O0.f13959OooO0o]) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            if (oooO0O0.OooO0O0() != null) {
                                i4 |= 1073741824;
                            }
                            int i113 = i4;
                            o000o0OooO0O0 = oooO0O0.OooO0O0();
                            if (o000o0OooO0O0 != null) {
                                oooO00o = o000o0OooO0O0.f36002OooO0OO;
                            } else {
                                oooO00o = null;
                            }
                            trackOutput.OooO0Oo(j2, i113, this.f13940OooOo, 0, oooO00o);
                            while (!this.f13932OooOO0o.isEmpty()) {
                                oooO00oRemoveFirst = this.f13932OooOO0o.removeFirst();
                                this.f13939OooOOoo -= oooO00oRemoveFirst.f13953OooO0O0;
                                j3 = oooO00oRemoveFirst.f13952OooO00o + j2;
                                trackOutputArr = this.f13948OooOoo;
                                i5 = 0;
                                while (i5 < length) {
                                    trackOutputArr[i5].OooO0Oo(j3, 1, oooO00oRemoveFirst.f13953OooO0O0, this.f13939OooOOoo, null);
                                    i5++;
                                }
                            }
                            if (!oooO0O0.OooO0OO()) {
                                this.f13944OooOo0o = null;
                            }
                            this.f13934OooOOO0 = 3;
                            i15 = 1;
                        } else {
                            if (oooO0O0.f13965OooOO0o) {
                                i9 = oooO0O0.f13958OooO0Oo.f36032OooO0Oo[oooO0O0.f13959OooO0o];
                            } else {
                                i9 = oooO0O0.f13956OooO0O0.f36018OooO0oo[oooO0O0.f13959OooO0o];
                            }
                            this.f13940OooOo = i9;
                            if (oooO0O0.f13959OooO0o < oooO0O0.f13954OooO) {
                                o000oooo3.OooOO0(i9);
                                o000o0OooO0O1 = oooO0O0.OooO0O0();
                                if (o000o0OooO0O1 != null) {
                                    o000Var = oooO0O0.f13956OooO0O0.f36024OooOOOO;
                                    i10 = o000o0OooO0O1.f36003OooO0Oo;
                                    if (i10 != 0) {
                                        o000Var.OooOoo0(i10);
                                    }
                                    o000o0oo2 = oooO0O0.f13956OooO0O0;
                                    int i114 = oooO0O0.f13959OooO0o;
                                    if (o000o0oo2.f36021OooOO0o) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        o000Var.OooOoo0(o000Var.OooOo0O() * 6);
                                    }
                                }
                                if (!oooO0O0.OooO0OO()) {
                                    this.f13944OooOo0o = null;
                                }
                                this.f13934OooOOO0 = 3;
                            } else {
                                if (oooO0O0.f13958OooO0Oo.f36029OooO00o.f14025OooO0oO == 1) {
                                    this.f13940OooOo = i9 - 8;
                                    o000oooo3.OooOO0(8);
                                }
                                if ("audio/ac4".equals(oooO0O0.f13958OooO0Oo.f36029OooO00o.f14023OooO0o.f13131OoooOOo)) {
                                    this.f13946OooOoO0 = oooO0O0.OooO0Oo(this.f13940OooOo, 7);
                                    OooOO0O.OooO00o(this.f13940OooOo, this.f13929OooO0oo);
                                    oooO0O0.f13955OooO00o.OooO0OO(this.f13929OooO0oo, 7);
                                    this.f13946OooOoO0 += 7;
                                } else {
                                    this.f13946OooOoO0 = oooO0O0.OooO0Oo(this.f13940OooOo, 0);
                                }
                                this.f13940OooOo += this.f13946OooOoO0;
                                this.f13934OooOOO0 = 4;
                                this.f13945OooOoO = 0;
                                o000oo0o2 = oooO0O0.f13958OooO0Oo;
                                track = o000oo0o2.f36029OooO00o;
                                trackOutput = oooO0O0.f13955OooO00o;
                                if (oooO0O0.f13965OooOO0o) {
                                    j = o000oo0o2.f36033OooO0o[oooO0O0.f13959OooO0o];
                                } else {
                                    o000O0Oo o000o0oo8 = oooO0O0.f13956OooO0O0;
                                    int i115 = oooO0O0.f13959OooO0o;
                                    j = ((long) o000o0oo8.f36010OooO[i115]) + o000o0oo8.f36019OooOO0[i115];
                                }
                                j2 = j;
                                i = track.f14027OooOO0;
                                if (i != 0) {
                                    while (true) {
                                        i2 = this.f13946OooOoO0;
                                        i3 = this.f13940OooOo;
                                        if (i2 < i3) {
                                            break;
                                            break;
                                        }
                                        this.f13946OooOoO0 += trackOutput.OooO0O0(o000oooo3, i3 - i2, false);
                                    }
                                } else {
                                    bArr = this.f13927OooO0o0.f36661OooO00o;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i6 = i + 1;
                                    i7 = 4 - i;
                                    while (this.f13946OooOoO0 < this.f13940OooOo) {
                                        i8 = this.f13945OooOoO;
                                        if (i8 == 0) {
                                            o000oooo3.readFully(bArr, i7, i6);
                                            this.f13927OooO0o0.OooOoOO(0);
                                            iOooO0Oo = this.f13927OooO0o0.OooO0Oo();
                                            if (iOooO0Oo >= i15) {
                                                throw new ParserException("Invalid NAL length");
                                            }
                                            this.f13945OooOoO = iOooO0Oo - 1;
                                            this.f13925OooO0Oo.OooOoOO(0);
                                            trackOutput.OooO0OO(this.f13925OooO0Oo, 4);
                                            trackOutput.OooO0OO(this.f13927OooO0o0, i15);
                                            if (this.f13950OooOooO.length > 0) {
                                                str = track.f14023OooO0o.f13131OoooOOo;
                                                b = bArr[4];
                                                byte[] bArr5 = o0000O.f36673OooO00o;
                                                if ((!"video/avc".equals(str) && (b & 31) == c) || ("video/hevc".equals(str) && ((b & 126) >> i15) == 39)) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            } else {
                                                z = false;
                                            }
                                            this.f13947OooOoOO = z;
                                            this.f13946OooOoO0 += 5;
                                            this.f13940OooOo += i7;
                                        } else {
                                            if (this.f13947OooOoOO) {
                                                this.f13926OooO0o.OooOo(i8);
                                                o000oooo3.readFully(this.f13926OooO0o.f36661OooO00o, 0, this.f13945OooOoO);
                                                trackOutput.OooO0OO(this.f13926OooO0o, this.f13945OooOoO);
                                                iOooO0O0 = this.f13945OooOoO;
                                                o000 o000Var7 = this.f13926OooO0o;
                                                int iOooO0o3 = o0000O.OooO0o0(o000Var7.f36661OooO00o, o000Var7.f36663OooO0OO);
                                                this.f13926OooO0o.OooOoOO("video/hevc".equals(track.f14023OooO0o.f13131OoooOOo) ? 1 : 0);
                                                this.f13926OooO0o.OooOoO(iOooO0o3);
                                                com.google.android.exoplayer2.extractor.OooO00o.OooO00o(j2, this.f13926OooO0o, this.f13950OooOooO);
                                            } else {
                                                iOooO0O0 = trackOutput.OooO0O0(o000oooo3, i8, false);
                                            }
                                            this.f13946OooOoO0 += iOooO0O0;
                                            this.f13945OooOoO -= iOooO0O0;
                                        }
                                        c = 6;
                                        i15 = 1;
                                    }
                                }
                                if (!oooO0O0.f13965OooOO0o) {
                                    i4 = oooO0O0.f13958OooO0Oo.f36035OooO0oO[oooO0O0.f13959OooO0o];
                                } else if (oooO0O0.f13956OooO0O0.f36020OooOO0O[oooO0O0.f13959OooO0o]) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                if (oooO0O0.OooO0O0() != null) {
                                    i4 |= 1073741824;
                                }
                                int i116 = i4;
                                o000o0OooO0O0 = oooO0O0.OooO0O0();
                                if (o000o0OooO0O0 != null) {
                                    oooO00o = o000o0OooO0O0.f36002OooO0OO;
                                } else {
                                    oooO00o = null;
                                }
                                trackOutput.OooO0Oo(j2, i116, this.f13940OooOo, 0, oooO00o);
                                while (!this.f13932OooOO0o.isEmpty()) {
                                    oooO00oRemoveFirst = this.f13932OooOO0o.removeFirst();
                                    this.f13939OooOOoo -= oooO00oRemoveFirst.f13953OooO0O0;
                                    j3 = oooO00oRemoveFirst.f13952OooO00o + j2;
                                    trackOutputArr = this.f13948OooOoo;
                                    i5 = 0;
                                    while (i5 < length) {
                                        trackOutputArr[i5].OooO0Oo(j3, 1, oooO00oRemoveFirst.f13953OooO0O0, this.f13939OooOOoo, null);
                                        i5++;
                                    }
                                }
                                if (!oooO0O0.OooO0OO()) {
                                    this.f13944OooOo0o = null;
                                }
                                this.f13934OooOOO0 = 3;
                                i15 = 1;
                            }
                        }
                    }
                    if (i15 != 0) {
                        return 0;
                    }
                } else {
                    int size3 = this.f13924OooO0OO.size();
                    OooO0O0 oooO0O0ValueAt2 = null;
                    for (int i20 = 0; i20 < size3; i20++) {
                        o000O0Oo o000o0oo9 = this.f13924OooO0OO.valueAt(i20).f13956OooO0O0;
                        if (o000o0oo9.f36025OooOOOo) {
                            long j9 = o000o0oo9.f36013OooO0OO;
                            if (j9 < j7) {
                                oooO0O0ValueAt2 = this.f13924OooO0OO.valueAt(i20);
                                j7 = j9;
                            }
                        }
                    }
                    if (oooO0O0ValueAt2 == null) {
                        this.f13934OooOOO0 = 3;
                    } else {
                        int position4 = (int) (j7 - o000oooo2.getPosition());
                        if (position4 < 0) {
                            throw new ParserException("Offset to encryption data was negative.");
                        }
                        o000oooo3.OooOO0(position4);
                        o000O0Oo o000o0oo10 = oooO0O0ValueAt2.f13956OooO0O0;
                        o000 o000Var8 = o000o0oo10.f36024OooOOOO;
                        o000oooo3.readFully(o000Var8.f36661OooO00o, 0, o000Var8.f36663OooO0OO);
                        o000o0oo10.f36024OooOOOO.OooOoOO(0);
                        o000o0oo10.f36025OooOOOo = false;
                    }
                }
            } else {
                int i21 = ((int) this.f13935OooOOOO) - this.f13936OooOOOo;
                o000 o000Var9 = this.f13938OooOOo0;
                if (o000Var9 != null) {
                    o000oooo3.readFully(o000Var9.f36661OooO00o, 8, i21);
                    int i22 = this.f13933OooOOO;
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O2 = new com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0(i22, o000Var9);
                    long position5 = o000oooo2.getPosition();
                    if (this.f13931OooOO0O.isEmpty()) {
                        if (i22 == 1936286840) {
                            o000Var9.OooOoOO(8);
                            int iOooO0Oo2 = (o000Var9.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            o000Var9.OooOoo0(4);
                            long jOooOOo2 = o000Var9.OooOOo();
                            if (iOooO0Oo2 == 0) {
                                jOooOo0 = o000Var9.OooOOo();
                                jOooOo1 = o000Var9.OooOOo();
                            } else {
                                jOooOo0 = o000Var9.OooOo0();
                                jOooOo1 = o000Var9.OooOo0();
                            }
                            long j10 = jOooOo1 + position5;
                            long jOooOooo3 = o000OOo0.OooOooo(jOooOo0, 1000000L, jOooOOo2);
                            o000Var9.OooOoo0(2);
                            int iOooOo0O = o000Var9.OooOo0O();
                            int[] iArr = new int[iOooOo0O];
                            long[] jArr = new long[iOooOo0O];
                            long[] jArr2 = new long[iOooOo0O];
                            long[] jArr3 = new long[iOooOo0O];
                            long jOooOooo4 = jOooOooo3;
                            int i23 = 0;
                            while (i23 < iOooOo0O) {
                                int iOooO0Oo3 = o000Var9.OooO0Oo();
                                if ((iOooO0Oo3 & Integer.MIN_VALUE) != 0) {
                                    throw new ParserException("Unhandled indirect reference");
                                }
                                long jOooOOo3 = o000Var9.OooOOo();
                                iArr[i23] = iOooO0Oo3 & Integer.MAX_VALUE;
                                jArr[i23] = j10;
                                jArr3[i23] = jOooOooo4;
                                long j11 = jOooOo0 + jOooOOo3;
                                int i24 = iOooOo0O;
                                long[] jArr4 = jArr3;
                                int i25 = i23;
                                long[] jArr5 = jArr2;
                                jOooOooo4 = o000OOo0.OooOooo(j11, 1000000L, jOooOOo2);
                                jArr5[i25] = jOooOooo4 - jArr4[i25];
                                o000Var9.OooOoo0(4);
                                j10 += (long) iArr[i25];
                                i23 = i25 + 1;
                                jArr3 = jArr4;
                                jArr2 = jArr5;
                                jOooOo0 = j11;
                                iOooOo0O = i24;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jOooOooo3), new OooOo00(iArr, jArr, jArr2, jArr3));
                            this.f13943OooOo0O = ((Long) pairCreate.first).longValue();
                            this.f13949OooOoo0.OooOO0O((oo0o0Oo) pairCreate.second);
                            this.f13951OooOooo = true;
                        } else if (i22 == 1701671783 && this.f13948OooOoo.length != 0) {
                            o000Var9.OooOoOO(8);
                            int iOooO0Oo4 = (o000Var9.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                            if (iOooO0Oo4 == 0) {
                                strOooOO0o = o000Var9.OooOO0o();
                                Objects.requireNonNull(strOooOO0o);
                                strOooOO0o2 = o000Var9.OooOO0o();
                                Objects.requireNonNull(strOooOO0o2);
                                long jOooOOo4 = o000Var9.OooOOo();
                                jOooOooo = o000OOo0.OooOooo(o000Var9.OooOOo(), 1000000L, jOooOOo4);
                                long j12 = this.f13943OooOo0O;
                                long j13 = j12 != -9223372036854775807L ? j12 + jOooOooo : -9223372036854775807L;
                                jOooOooo2 = o000OOo0.OooOooo(o000Var9.OooOOo(), 1000L, jOooOOo4);
                                jOooOOo = o000Var9.OooOOo();
                                j4 = j13;
                            } else if (iOooO0Oo4 != 1) {
                                OooO0OO.OooO0O0(46, "Skipping unsupported emsg version: ", iOooO0Oo4, "FragmentedMp4Extractor");
                            } else {
                                long jOooOOo5 = o000Var9.OooOOo();
                                long jOooOooo5 = o000OOo0.OooOooo(o000Var9.OooOo0(), 1000000L, jOooOOo5);
                                jOooOooo2 = o000OOo0.OooOooo(o000Var9.OooOOo(), 1000L, jOooOOo5);
                                jOooOOo = o000Var9.OooOOo();
                                strOooOO0o = o000Var9.OooOO0o();
                                Objects.requireNonNull(strOooOO0o);
                                strOooOO0o2 = o000Var9.OooOO0o();
                                Objects.requireNonNull(strOooOO0o2);
                                j4 = jOooOooo5;
                                jOooOooo = -9223372036854775807L;
                            }
                            int i26 = o000Var9.f36663OooO0OO - o000Var9.f36662OooO0O0;
                            byte[] bArr6 = new byte[i26];
                            o000Var9.OooO0OO(bArr6, 0, i26);
                            o000O000 o000o001 = this.f13921OooO;
                            o000o001.f36244OooO00o.reset();
                            try {
                                DataOutputStream dataOutputStream = o000o001.f36245OooO0O0;
                                dataOutputStream.writeBytes(strOooOO0o);
                                dataOutputStream.writeByte(0);
                                DataOutputStream dataOutputStream2 = o000o001.f36245OooO0O0;
                                dataOutputStream2.writeBytes(strOooOO0o2);
                                dataOutputStream2.writeByte(0);
                                o000O000.OooO00o(o000o001.f36245OooO0O0, jOooOooo2);
                                o000O000.OooO00o(o000o001.f36245OooO0O0, jOooOOo);
                                o000o001.f36245OooO0O0.write(bArr6);
                                o000o001.f36245OooO0O0.flush();
                                o000 o000Var10 = new o000(o000o001.f36244OooO00o.toByteArray());
                                int i27 = o000Var10.f36663OooO0OO - o000Var10.f36662OooO0O0;
                                for (TrackOutput trackOutput2 : this.f13948OooOoo) {
                                    o000Var10.OooOoOO(0);
                                    trackOutput2.OooO0OO(o000Var10, i27);
                                }
                                if (j4 == -9223372036854775807L) {
                                    this.f13932OooOO0o.addLast(new OooO00o(jOooOooo, i27));
                                    this.f13939OooOOoo += i27;
                                } else {
                                    for (TrackOutput trackOutput3 : this.f13948OooOoo) {
                                        trackOutput3.OooO0Oo(j4, 1, i27, 0, null);
                                    }
                                }
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        o000oooo3 = o000oooo2;
                    } else {
                        this.f13931OooOO0O.peek().f13997OooO0OO.add(oooO0O2);
                    }
                } else {
                    o000oooo3.OooOO0(i21);
                }
                OooOO0(o000oooo2.getPosition());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0380  */
    /* JADX WARN: Code duplicated, block: B:147:0x038f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0391  */
    /* JADX WARN: Code duplicated, block: B:149:0x0396  */
    /* JADX WARN: Code duplicated, block: B:152:0x039d  */
    /* JADX WARN: Code duplicated, block: B:153:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x03af  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:163:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0409  */
    /* JADX WARN: Code duplicated, block: B:173:0x041d  */
    /* JADX WARN: Code duplicated, block: B:282:0x06a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList, java.util.List, java.util.List<com.google.android.exoplayer2.extractor.mp4.OooO00o$OooO0O0>] */
    public final void OooOO0(long j) throws ParserException {
        FragmentedMp4Extractor fragmentedMp4Extractor;
        SparseArray<OooO0O0> sparseArray;
        com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00o;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        int i6;
        o000O0Oo o000o0oo2;
        OooO0O0 oooO0O0;
        int i7;
        long jOooOooo;
        int[] iArr;
        int[] iArr2;
        OooO0O0 oooO0O1;
        long[] jArr;
        boolean[] zArr;
        long j2;
        boolean z;
        int i8;
        long j3;
        long j4;
        int iOooO0Oo;
        int iOooO0Oo2;
        int iOooO0Oo3;
        OooO0O0 oooO0O2;
        boolean z2;
        FragmentedMp4Extractor fragmentedMp4Extractor2 = this;
        final FragmentedMp4Extractor fragmentedMp4Extractor3 = fragmentedMp4Extractor2;
        while (!fragmentedMp4Extractor3.f13931OooOO0O.isEmpty() && fragmentedMp4Extractor3.f13931OooOO0O.peek().f13996OooO0O0 == j) {
            com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oPop = fragmentedMp4Extractor3.f13931OooOO0O.pop();
            int i9 = c0100OooO00oPop.f13995OooO00o;
            int i10 = 12;
            if (i9 == 1836019574) {
                DrmInitData drmInitDataOooO0oO = OooO0oO(c0100OooO00oPop.f13997OooO0OO);
                com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00oOooO0O0 = c0100OooO00oPop.OooO0O0(1836475768);
                Objects.requireNonNull(c0100OooO00oOooO0O0);
                SparseArray<p300o0O0OooO.o000> sparseArray2 = new SparseArray<>();
                int size = c0100OooO00oOooO0O0.f13997OooO0OO.size();
                long jOooOOo = -9223372036854775807L;
                int i11 = 0;
                while (i11 < size) {
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O3 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) c0100OooO00oOooO0O0.f13997OooO0OO.get(i11);
                    int i12 = oooO0O3.f13995OooO00o;
                    if (i12 == 1953654136) {
                        o000 o000Var = oooO0O3.f13999OooO0O0;
                        o000Var.OooOoOO(i10);
                        Pair pairCreate = Pair.create(Integer.valueOf(o000Var.OooO0Oo()), new p300o0O0OooO.o000(o000Var.OooO0Oo() - 1, o000Var.OooO0Oo(), o000Var.OooO0Oo(), o000Var.OooO0Oo()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (p300o0O0OooO.o000) pairCreate.second);
                    } else if (i12 == 1835362404) {
                        o000 o000Var2 = oooO0O3.f13999OooO0O0;
                        o000Var2.OooOoOO(8);
                        jOooOOo = ((o000Var2.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? o000Var2.OooOOo() : o000Var2.OooOo0();
                    }
                    i11++;
                    i10 = 12;
                }
                ArrayList arrayList = (ArrayList) com.google.android.exoplayer2.extractor.mp4.OooO0O0.OooO0o0(c0100OooO00oPop, new o0ooOOo(), jOooOOo, drmInitDataOooO0oO, (fragmentedMp4Extractor3.f13922OooO00o & 16) != 0, false, new OooO() { // from class: o0O0OooO.o000O000
                    @Override // o0OOOO0o.OooO
                    public final Object apply(Object obj) {
                        Track track = (Track) obj;
                        Objects.requireNonNull(this.f36008Oooo0o);
                        return track;
                    }
                });
                int size2 = arrayList.size();
                if (fragmentedMp4Extractor3.f13924OooO0OO.size() == 0) {
                    for (int i13 = 0; i13 < size2; i13++) {
                        o000OO0O o000oo0o2 = (o000OO0O) arrayList.get(i13);
                        Track track = o000oo0o2.f36029OooO00o;
                        o0OoOo0 o0oooo1 = fragmentedMp4Extractor3.f13949OooOoo0;
                        int i14 = track.f14020OooO0O0;
                        fragmentedMp4Extractor3.f13924OooO0OO.put(track.f14019OooO00o, new OooO0O0(o0oooo1.OooO00o(i13), o000oo0o2, fragmentedMp4Extractor3.OooO0OO(sparseArray2, track.f14019OooO00o)));
                        fragmentedMp4Extractor3.f13941OooOo0 = Math.max(fragmentedMp4Extractor3.f13941OooOo0, track.f14024OooO0o0);
                    }
                    fragmentedMp4Extractor3.f13949OooOoo0.OooOOO0();
                } else {
                    o00000O0.OooO0Oo(fragmentedMp4Extractor3.f13924OooO0OO.size() == size2);
                    for (int i15 = 0; i15 < size2; i15++) {
                        o000OO0O o000oo0o3 = (o000OO0O) arrayList.get(i15);
                        Track track2 = o000oo0o3.f36029OooO00o;
                        OooO0O0 oooO0O4 = fragmentedMp4Extractor3.f13924OooO0OO.get(track2.f14019OooO00o);
                        p300o0O0OooO.o000 o000VarOooO0OO = fragmentedMp4Extractor3.OooO0OO(sparseArray2, track2.f14019OooO00o);
                        oooO0O4.f13958OooO0Oo = o000oo0o3;
                        oooO0O4.f13960OooO0o0 = o000VarOooO0OO;
                        oooO0O4.f13955OooO00o.OooO0o0(o000oo0o3.f36029OooO00o.f14023OooO0o);
                        oooO0O4.OooO0o0();
                    }
                }
                fragmentedMp4Extractor = fragmentedMp4Extractor2;
            } else if (i9 == 1836019558) {
                SparseArray<OooO0O0> sparseArray3 = fragmentedMp4Extractor3.f13924OooO0OO;
                int i16 = fragmentedMp4Extractor3.f13922OooO00o;
                byte[] bArr4 = fragmentedMp4Extractor3.f13928OooO0oO;
                int size3 = c0100OooO00oPop.f13998OooO0Oo.size();
                int i17 = 0;
                while (i17 < size3) {
                    com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o c0100OooO00o2 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.C0100OooO00o) c0100OooO00oPop.f13998OooO0Oo.get(i17);
                    if (c0100OooO00o2.f13995OooO00o == 1953653094) {
                        com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO = c0100OooO00o2.OooO0OO(1952868452);
                        Objects.requireNonNull(oooO0O0OooO0OO);
                        o000 o000Var3 = oooO0O0OooO0OO.f13999OooO0O0;
                        o000Var3.OooOoOO(8);
                        int iOooO0Oo4 = o000Var3.OooO0Oo() & 16777215;
                        OooO0O0 oooO0O0ValueAt = sparseArray3.size() == 1 ? sparseArray3.valueAt(0) : sparseArray3.get(o000Var3.OooO0Oo());
                        if (oooO0O0ValueAt == null) {
                            oooO0O0ValueAt = null;
                        } else {
                            if ((iOooO0Oo4 & 1) != 0) {
                                long jOooOo0 = o000Var3.OooOo0();
                                o000O0Oo o000o0oo3 = oooO0O0ValueAt.f13956OooO0O0;
                                o000o0oo3.f36012OooO0O0 = jOooOo0;
                                o000o0oo3.f36013OooO0OO = jOooOo0;
                            }
                            p300o0O0OooO.o000 o000Var4 = oooO0O0ValueAt.f13960OooO0o0;
                            oooO0O0ValueAt.f13956OooO0O0.f36011OooO00o = new p300o0O0OooO.o000((iOooO0Oo4 & 2) != 0 ? o000Var3.OooO0Oo() - 1 : o000Var4.f35996OooO00o, (iOooO0Oo4 & 8) != 0 ? o000Var3.OooO0Oo() : o000Var4.f35997OooO0O0, (iOooO0Oo4 & 16) != 0 ? o000Var3.OooO0Oo() : o000Var4.f35998OooO0OO, (iOooO0Oo4 & 32) != 0 ? o000Var3.OooO0Oo() : o000Var4.f35999OooO0Oo);
                        }
                        if (oooO0O0ValueAt == null) {
                            sparseArray = sparseArray3;
                            c0100OooO00o = c0100OooO00oPop;
                            i = i16;
                            i2 = size3;
                            i3 = i17;
                            bArr = bArr4;
                        } else {
                            o000O0Oo o000o0oo4 = oooO0O0ValueAt.f13956OooO0O0;
                            long j5 = o000o0oo4.f36027OooOOo0;
                            boolean z3 = o000o0oo4.f36026OooOOo;
                            oooO0O0ValueAt.OooO0o0();
                            oooO0O0ValueAt.f13965OooOO0o = true;
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO2 = c0100OooO00o2.OooO0OO(1952867444);
                            if (oooO0O0OooO0OO2 == null || (i16 & 2) != 0) {
                                o000o0oo4.f36027OooOOo0 = j5;
                                o000o0oo4.f36026OooOOo = z3;
                            } else {
                                o000 o000Var5 = oooO0O0OooO0OO2.f13999OooO0O0;
                                o000Var5.OooOoOO(8);
                                o000o0oo4.f36027OooOOo0 = ((o000Var5.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 1 ? o000Var5.OooOo0() : o000Var5.OooOOo();
                                o000o0oo4.f36026OooOOo = true;
                            }
                            ?? r9 = c0100OooO00o2.f13997OooO0OO;
                            int size4 = r9.size();
                            int i18 = 0;
                            int i19 = 0;
                            int i20 = 0;
                            while (true) {
                                i4 = 1953658222;
                                if (i18 >= size4) {
                                    break;
                                }
                                SparseArray<OooO0O0> sparseArray4 = sparseArray3;
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O5 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) r9.get(i18);
                                int i21 = size3;
                                if (oooO0O5.f13995OooO00o == 1953658222) {
                                    o000 o000Var6 = oooO0O5.f13999OooO0O0;
                                    o000Var6.OooOoOO(12);
                                    int iOooOo00 = o000Var6.OooOo00();
                                    if (iOooOo00 > 0) {
                                        i20 += iOooOo00;
                                        i19++;
                                    }
                                }
                                i18++;
                                size3 = i21;
                                sparseArray3 = sparseArray4;
                            }
                            sparseArray = sparseArray3;
                            i2 = size3;
                            oooO0O0ValueAt.f13962OooO0oo = 0;
                            oooO0O0ValueAt.f13961OooO0oO = 0;
                            oooO0O0ValueAt.f13959OooO0o = 0;
                            o000O0Oo o000o0oo5 = oooO0O0ValueAt.f13956OooO0O0;
                            o000o0oo5.f36014OooO0Oo = i19;
                            o000o0oo5.f36016OooO0o0 = i20;
                            if (o000o0oo5.f36017OooO0oO.length < i19) {
                                o000o0oo5.f36015OooO0o = new long[i19];
                                o000o0oo5.f36017OooO0oO = new int[i19];
                            }
                            if (o000o0oo5.f36018OooO0oo.length < i20) {
                                int i22 = (i20 * 125) / 100;
                                o000o0oo5.f36018OooO0oo = new int[i22];
                                o000o0oo5.f36010OooO = new int[i22];
                                o000o0oo5.f36019OooOO0 = new long[i22];
                                o000o0oo5.f36020OooOO0O = new boolean[i22];
                                o000o0oo5.f36023OooOOO0 = new boolean[i22];
                            }
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            ?? r10 = r9;
                            while (i23 < size4) {
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O6 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) r10.get(i23);
                                if (oooO0O6.f13995OooO00o == i4) {
                                    int i26 = i24 + 1;
                                    o000 o000Var7 = oooO0O6.f13999OooO0O0;
                                    o000Var7.OooOoOO(8);
                                    int iOooO0Oo5 = o000Var7.OooO0Oo() & 16777215;
                                    Track track3 = oooO0O0ValueAt.f13958OooO0Oo.f36029OooO00o;
                                    o000O0Oo o000o0oo6 = oooO0O0ValueAt.f13956OooO0O0;
                                    p300o0O0OooO.o000 o000Var8 = o000o0oo6.f36011OooO00o;
                                    int i27 = o000OOo0.f36740OooO00o;
                                    o000o0oo6.f36017OooO0oO[i24] = o000Var7.OooOo00();
                                    long[] jArr2 = o000o0oo6.f36015OooO0o;
                                    jArr2[i24] = o000o0oo6.f36012OooO0O0;
                                    if ((iOooO0Oo5 & 1) != 0) {
                                        jArr2[i24] = jArr2[i24] + ((long) o000Var7.OooO0Oo());
                                    }
                                    boolean z4 = (iOooO0Oo5 & 4) != 0;
                                    int iOooO0Oo6 = o000Var8.f35999OooO0Oo;
                                    if (z4) {
                                        iOooO0Oo6 = o000Var7.OooO0Oo();
                                    }
                                    boolean z5 = (iOooO0Oo5 & 256) != 0;
                                    boolean z6 = (iOooO0Oo5 & 512) != 0;
                                    boolean z7 = (iOooO0Oo5 & 1024) != 0;
                                    boolean z8 = (iOooO0Oo5 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0;
                                    long[] jArr3 = track3.f14026OooO0oo;
                                    if (jArr3 != null) {
                                        i7 = iOooO0Oo6;
                                        o000o0oo2 = o000o0oo4;
                                        if (jArr3.length == 1 && jArr3[0] == 0) {
                                            z8 = z8;
                                            jOooOooo = o000OOo0.OooOooo(track3.f14018OooO[0], 1000000L, track3.f14021OooO0OO);
                                        }
                                        iArr = o000o0oo6.f36018OooO0oo;
                                        iArr2 = o000o0oo6.f36010OooO;
                                        oooO0O1 = oooO0O0ValueAt;
                                        jArr = o000o0oo6.f36019OooOO0;
                                        zArr = o000o0oo6.f36020OooOO0O;
                                        j2 = jOooOooo;
                                        if (track3.f14020OooO0O0 == 2 || (i16 & 1) == 0) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        i8 = o000o0oo6.f36017OooO0oO[i24] + i25;
                                        j3 = track3.f14021OooO0OO;
                                        boolean z9 = z;
                                        j4 = o000o0oo6.f36027OooOOo0;
                                        while (i25 < i8) {
                                            if (z5) {
                                                iOooO0Oo = o000Var7.OooO0Oo();
                                            } else {
                                                iOooO0Oo = o000Var8.f35997OooO0O0;
                                            }
                                            OooO00o(iOooO0Oo);
                                            if (z6) {
                                                iOooO0Oo2 = o000Var7.OooO0Oo();
                                            } else {
                                                iOooO0Oo2 = o000Var8.f35998OooO0OO;
                                            }
                                            OooO00o(iOooO0Oo2);
                                            if (z7) {
                                                iOooO0Oo3 = o000Var7.OooO0Oo();
                                            } else if (i25 == 0 || !z4) {
                                                iOooO0Oo3 = o000Var8.f35999OooO0Oo;
                                            } else {
                                                iOooO0Oo3 = i7;
                                            }
                                            if (z8) {
                                                iArr2[i25] = (int) ((((long) o000Var7.OooO0Oo()) * 1000000) / j3);
                                            } else {
                                                iArr2[i25] = 0;
                                            }
                                            jArr[i25] = o000OOo0.OooOooo(j4, 1000000L, j3) - j2;
                                            if (o000o0oo6.f36026OooOOo) {
                                                oooO0O2 = oooO0O1;
                                            } else {
                                                oooO0O2 = oooO0O1;
                                                jArr[i25] = jArr[i25] + oooO0O2.f13958OooO0Oo.f36036OooO0oo;
                                            }
                                            iArr[i25] = iOooO0Oo2;
                                            if (((iOooO0Oo3 >> 16) & 1) == 0 || (z9 && i25 != 0)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            zArr[i25] = z2;
                                            j4 += (long) iOooO0Oo;
                                            i25++;
                                            i8 = i8;
                                            z7 = z7;
                                            z5 = z5;
                                            z4 = z4;
                                            i16 = i16;
                                            z6 = z6;
                                            oooO0O1 = oooO0O2;
                                            z8 = z8;
                                        }
                                        i6 = i16;
                                        oooO0O0 = oooO0O1;
                                        int i28 = i8;
                                        o000o0oo6.f36027OooOOo0 = j4;
                                        i24 = i26;
                                        i25 = i28;
                                    } else {
                                        i7 = iOooO0Oo6;
                                        o000o0oo2 = o000o0oo4;
                                    }
                                    jOooOooo = 0;
                                    iArr = o000o0oo6.f36018OooO0oo;
                                    iArr2 = o000o0oo6.f36010OooO;
                                    oooO0O1 = oooO0O0ValueAt;
                                    jArr = o000o0oo6.f36019OooOO0;
                                    zArr = o000o0oo6.f36020OooOO0O;
                                    j2 = jOooOooo;
                                    if (track3.f14020OooO0O0 == 2) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    i8 = o000o0oo6.f36017OooO0oO[i24] + i25;
                                    j3 = track3.f14021OooO0OO;
                                    boolean z10 = z;
                                    j4 = o000o0oo6.f36027OooOOo0;
                                    while (i25 < i8) {
                                        if (z5) {
                                            iOooO0Oo = o000Var7.OooO0Oo();
                                        } else {
                                            iOooO0Oo = o000Var8.f35997OooO0O0;
                                        }
                                        OooO00o(iOooO0Oo);
                                        if (z6) {
                                            iOooO0Oo2 = o000Var7.OooO0Oo();
                                        } else {
                                            iOooO0Oo2 = o000Var8.f35998OooO0OO;
                                        }
                                        OooO00o(iOooO0Oo2);
                                        if (z7) {
                                            iOooO0Oo3 = o000Var7.OooO0Oo();
                                        } else if (i25 == 0) {
                                            iOooO0Oo3 = o000Var8.f35999OooO0Oo;
                                        } else {
                                            iOooO0Oo3 = o000Var8.f35999OooO0Oo;
                                        }
                                        if (z8) {
                                            iArr2[i25] = (int) ((((long) o000Var7.OooO0Oo()) * 1000000) / j3);
                                        } else {
                                            iArr2[i25] = 0;
                                        }
                                        jArr[i25] = o000OOo0.OooOooo(j4, 1000000L, j3) - j2;
                                        if (o000o0oo6.f36026OooOOo) {
                                            oooO0O2 = oooO0O1;
                                            jArr[i25] = jArr[i25] + oooO0O2.f13958OooO0Oo.f36036OooO0oo;
                                        } else {
                                            oooO0O2 = oooO0O1;
                                        }
                                        iArr[i25] = iOooO0Oo2;
                                        if (((iOooO0Oo3 >> 16) & 1) == 0) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        zArr[i25] = z2;
                                        j4 += (long) iOooO0Oo;
                                        i25++;
                                        i8 = i8;
                                        z7 = z7;
                                        z5 = z5;
                                        z4 = z4;
                                        i16 = i16;
                                        z6 = z6;
                                        oooO0O1 = oooO0O2;
                                        z8 = z8;
                                    }
                                    i6 = i16;
                                    oooO0O0 = oooO0O1;
                                    int i29 = i8;
                                    o000o0oo6.f36027OooOOo0 = j4;
                                    i24 = i26;
                                    i25 = i29;
                                } else {
                                    bArr4 = bArr4;
                                    i23 = i23;
                                    c0100OooO00oPop = c0100OooO00oPop;
                                    i6 = i16;
                                    o000o0oo2 = o000o0oo4;
                                    oooO0O0 = oooO0O0ValueAt;
                                }
                                i23++;
                                i4 = 1953658222;
                                oooO0O0ValueAt = oooO0O0;
                                r10 = r10;
                                size4 = size4;
                                i17 = i17;
                                c0100OooO00o2 = c0100OooO00o2;
                                c0100OooO00oPop = c0100OooO00oPop;
                                bArr4 = bArr4;
                                o000o0oo4 = o000o0oo2;
                                i16 = i6;
                            }
                            byte[] bArr5 = bArr4;
                            c0100OooO00o = c0100OooO00oPop;
                            i = i16;
                            i3 = i17;
                            o000O0Oo o000o0oo7 = o000o0oo4;
                            Track track4 = oooO0O0ValueAt.f13958OooO0Oo.f36029OooO00o;
                            p300o0O0OooO.o000 o000Var9 = o000o0oo7.f36011OooO00o;
                            Objects.requireNonNull(o000Var9);
                            o000O0 o000o0OooO00o = track4.OooO00o(o000Var9.f35996OooO00o);
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO3 = c0100OooO00o2.OooO0OO(1935763834);
                            if (oooO0O0OooO0OO3 != null) {
                                Objects.requireNonNull(o000o0OooO00o);
                                o000 o000Var10 = oooO0O0OooO0OO3.f13999OooO0O0;
                                int i30 = o000o0OooO00o.f36003OooO0Oo;
                                o000Var10.OooOoOO(8);
                                if ((o000Var10.OooO0Oo() & 16777215 & 1) == 1) {
                                    o000Var10.OooOoo0(8);
                                }
                                int iOooOOo0 = o000Var10.OooOOo0();
                                int iOooOo01 = o000Var10.OooOo00();
                                if (iOooOo01 > o000o0oo7.f36016OooO0o0) {
                                    int i31 = o000o0oo7.f36016OooO0o0;
                                    StringBuilder sb = new StringBuilder(78);
                                    sb.append("Saiz sample count ");
                                    sb.append(iOooOo01);
                                    sb.append(" is greater than fragment sample count");
                                    sb.append(i31);
                                    throw new ParserException(sb.toString());
                                }
                                if (iOooOOo0 == 0) {
                                    boolean[] zArr2 = o000o0oo7.f36023OooOOO0;
                                    i5 = 0;
                                    for (int i32 = 0; i32 < iOooOo01; i32++) {
                                        int iOooOOo1 = o000Var10.OooOOo0();
                                        i5 += iOooOOo1;
                                        zArr2[i32] = iOooOOo1 > i30;
                                    }
                                } else {
                                    i5 = (iOooOOo0 * iOooOo01) + 0;
                                    Arrays.fill(o000o0oo7.f36023OooOOO0, 0, iOooOo01, iOooOOo0 > i30);
                                }
                                Arrays.fill(o000o0oo7.f36023OooOOO0, iOooOo01, o000o0oo7.f36016OooO0o0, false);
                                if (i5 > 0) {
                                    o000o0oo7.f36024OooOOOO.OooOo(i5);
                                    o000o0oo7.f36021OooOO0o = true;
                                    o000o0oo7.f36025OooOOOo = true;
                                }
                            }
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO4 = c0100OooO00o2.OooO0OO(1935763823);
                            if (oooO0O0OooO0OO4 != null) {
                                o000 o000Var11 = oooO0O0OooO0OO4.f13999OooO0O0;
                                o000Var11.OooOoOO(8);
                                int iOooO0Oo7 = o000Var11.OooO0Oo();
                                if ((16777215 & iOooO0Oo7 & 1) == 1) {
                                    o000Var11.OooOoo0(8);
                                }
                                int iOooOo02 = o000Var11.OooOo00();
                                if (iOooOo02 != 1) {
                                    throw new ParserException(Oooo0.OooO00o(40, "Unexpected saio entry count: ", iOooOo02));
                                }
                                o000o0oo7.f36013OooO0OO += ((iOooO0Oo7 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) == 0 ? o000Var11.OooOOo() : o000Var11.OooOo0();
                            }
                            com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O0OooO0OO5 = c0100OooO00o2.OooO0OO(1936027235);
                            if (oooO0O0OooO0OO5 != null) {
                                OooO0oo(oooO0O0OooO0OO5.f13999OooO0O0, 0, o000o0oo7);
                            }
                            String str = o000o0OooO00o != null ? o000o0OooO00o.f36001OooO0O0 : null;
                            o000 o000Var12 = null;
                            o000 o000Var13 = null;
                            for (int i33 = 0; i33 < c0100OooO00o2.f13997OooO0OO.size(); i33++) {
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O7 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) c0100OooO00o2.f13997OooO0OO.get(i33);
                                o000 o000Var14 = oooO0O7.f13999OooO0O0;
                                int i34 = oooO0O7.f13995OooO00o;
                                if (i34 == 1935828848) {
                                    o000Var14.OooOoOO(12);
                                    if (o000Var14.OooO0Oo() == 1936025959) {
                                        o000Var12 = o000Var14;
                                    }
                                } else if (i34 == 1936158820) {
                                    o000Var14.OooOoOO(12);
                                    if (o000Var14.OooO0Oo() == 1936025959) {
                                        o000Var13 = o000Var14;
                                    }
                                }
                            }
                            if (o000Var12 != null && o000Var13 != null) {
                                o000Var12.OooOoOO(8);
                                int iOooO0Oo8 = (o000Var12.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                o000Var12.OooOoo0(4);
                                if (iOooO0Oo8 == 1) {
                                    o000Var12.OooOoo0(4);
                                }
                                if (o000Var12.OooO0Oo() != 1) {
                                    throw new ParserException("Entry count in sbgp != 1 (unsupported).");
                                }
                                o000Var13.OooOoOO(8);
                                int iOooO0Oo9 = (o000Var13.OooO0Oo() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
                                o000Var13.OooOoo0(4);
                                if (iOooO0Oo9 == 1) {
                                    if (o000Var13.OooOOo() == 0) {
                                        throw new ParserException("Variable length description in sgpd found (unsupported)");
                                    }
                                } else if (iOooO0Oo9 >= 2) {
                                    o000Var13.OooOoo0(4);
                                }
                                if (o000Var13.OooOOo() != 1) {
                                    throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                                }
                                o000Var13.OooOoo0(1);
                                int iOooOOo2 = o000Var13.OooOOo0();
                                int i35 = (iOooOOo2 & 240) >> 4;
                                int i36 = iOooOOo2 & 15;
                                boolean z11 = o000Var13.OooOOo0() == 1;
                                if (z11) {
                                    int iOooOOo3 = o000Var13.OooOOo0();
                                    byte[] bArr6 = new byte[16];
                                    o000Var13.OooO0OO(bArr6, 0, 16);
                                    if (iOooOOo3 == 0) {
                                        int iOooOOo4 = o000Var13.OooOOo0();
                                        byte[] bArr7 = new byte[iOooOOo4];
                                        o000Var13.OooO0OO(bArr7, 0, iOooOOo4);
                                        bArr3 = bArr7;
                                    } else {
                                        bArr3 = null;
                                    }
                                    o000o0oo7.f36021OooOO0o = true;
                                    o000o0oo7.f36022OooOOO = new o000O0(z11, str, iOooOOo3, bArr6, i35, i36, bArr3);
                                }
                            }
                            int size5 = c0100OooO00o2.f13997OooO0OO.size();
                            int i37 = 0;
                            while (i37 < size5) {
                                com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0 oooO0O8 = (com.google.android.exoplayer2.extractor.mp4.OooO00o.OooO0O0) c0100OooO00o2.f13997OooO0OO.get(i37);
                                if (oooO0O8.f13995OooO00o == 1970628964) {
                                    o000 o000Var15 = oooO0O8.f13999OooO0O0;
                                    o000Var15.OooOoOO(8);
                                    bArr2 = bArr5;
                                    o000Var15.OooO0OO(bArr2, 0, 16);
                                    if (Arrays.equals(bArr2, f13919Oooo000)) {
                                        OooO0oo(o000Var15, 16, o000o0oo7);
                                    }
                                } else {
                                    bArr2 = bArr5;
                                }
                                i37++;
                                bArr5 = bArr2;
                            }
                            bArr = bArr5;
                        }
                    } else {
                        sparseArray = sparseArray3;
                        c0100OooO00o = c0100OooO00oPop;
                        i = i16;
                        i2 = size3;
                        i3 = i17;
                        bArr = bArr4;
                    }
                    bArr4 = bArr;
                    size3 = i2;
                    sparseArray3 = sparseArray;
                    c0100OooO00oPop = c0100OooO00o;
                    i16 = i;
                    i17 = i3 + 1;
                }
                DrmInitData drmInitDataOooO0oO2 = OooO0oO(c0100OooO00oPop.f13997OooO0OO);
                fragmentedMp4Extractor = this;
                if (drmInitDataOooO0oO2 != null) {
                    int size6 = fragmentedMp4Extractor.f13924OooO0OO.size();
                    for (int i38 = 0; i38 < size6; i38++) {
                        OooO0O0 oooO0O0ValueAt2 = fragmentedMp4Extractor.f13924OooO0OO.valueAt(i38);
                        Track track5 = oooO0O0ValueAt2.f13958OooO0Oo.f36029OooO00o;
                        p300o0O0OooO.o000 o000Var16 = oooO0O0ValueAt2.f13956OooO0O0.f36011OooO00o;
                        int i39 = o000OOo0.f36740OooO00o;
                        o000O0 o000o0OooO00o2 = track5.OooO00o(o000Var16.f35996OooO00o);
                        DrmInitData drmInitDataOooO00o = drmInitDataOooO0oO2.OooO00o(o000o0OooO00o2 != null ? o000o0OooO00o2.f36001OooO0O0 : null);
                        Format.OooO0O0 oooO0O9 = new Format.OooO0O0(oooO0O0ValueAt2.f13958OooO0Oo.f36029OooO00o.f14023OooO0o);
                        oooO0O9.f13165OooOOO = drmInitDataOooO00o;
                        oooO0O0ValueAt2.f13955OooO00o.OooO0o0(new Format(oooO0O9));
                    }
                }
                if (fragmentedMp4Extractor.f13942OooOo00 != -9223372036854775807L) {
                    int size7 = fragmentedMp4Extractor.f13924OooO0OO.size();
                    for (int i40 = 0; i40 < size7; i40++) {
                        OooO0O0 oooO0O0ValueAt3 = fragmentedMp4Extractor.f13924OooO0OO.valueAt(i40);
                        long j6 = fragmentedMp4Extractor.f13942OooOo00;
                        int i41 = oooO0O0ValueAt3.f13959OooO0o;
                        while (true) {
                            o000O0Oo o000o0oo8 = oooO0O0ValueAt3.f13956OooO0O0;
                            if (i41 >= o000o0oo8.f36016OooO0o0 || o000o0oo8.f36019OooOO0[i41] + ((long) o000o0oo8.f36010OooO[i41]) >= j6) {
                                break;
                            }
                            if (o000o0oo8.f36020OooOO0O[i41]) {
                                oooO0O0ValueAt3.f13954OooO = i41;
                            }
                            i41++;
                        }
                    }
                    fragmentedMp4Extractor.f13942OooOo00 = -9223372036854775807L;
                }
                fragmentedMp4Extractor3 = fragmentedMp4Extractor;
            } else {
                fragmentedMp4Extractor = fragmentedMp4Extractor2;
                if (!fragmentedMp4Extractor3.f13931OooOO0O.isEmpty()) {
                    fragmentedMp4Extractor3.f13931OooOO0O.peek().f13998OooO0Oo.add(c0100OooO00oPop);
                }
            }
            fragmentedMp4Extractor2 = fragmentedMp4Extractor;
        }
        OooO0O0();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
