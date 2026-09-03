package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.common.collect.o00OOO00;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p226o00oOo00.o000OOo;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class MergingMediaSource extends OooO0OO<Integer> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final com.google.android.exoplayer2.o000oOoO f12960OooOOo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOOO[] f12961OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final oo0o0Oo[] f12962OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000OOo f12963OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<OooOOOO> f12964OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f12965OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long[][] f12966OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public IllegalMergeException f12967OooOOo0;

    public static final class IllegalMergeException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }
    }

    static {
        com.google.android.exoplayer2.o000oOoO.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.o000oOoO.OooO0O0();
        oooO0O0.f12703OooO00o = "MergingMediaSource";
        f12960OooOOo = oooO0O0.OooO00o();
    }

    public MergingMediaSource(OooOOOO... oooOOOOArr) {
        o000OOo o000ooo2 = new o000OOo();
        this.f12961OooOO0O = oooOOOOArr;
        this.f12963OooOOO = o000ooo2;
        this.f12964OooOOO0 = new ArrayList<>(Arrays.asList(oooOOOOArr));
        this.f12965OooOOOO = -1;
        this.f12962OooOO0o = new oo0o0Oo[oooOOOOArr.length];
        this.f12966OooOOOo = new long[0][];
        new HashMap();
        com.google.common.collect.oo000o.OooO0O0(8, "expectedKeys");
        new o00OOO00().OooO00o().OooO00o();
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final com.google.android.exoplayer2.o000oOoO OooO0Oo() {
        OooOOOO[] oooOOOOArr = this.f12961OooOO0O;
        return oooOOOOArr.length > 0 ? oooOOOOArr[0].OooO0Oo() : f12960OooOOo;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        OooOo oooOo = (OooOo) oooOOO;
        int i = 0;
        while (true) {
            OooOOOO[] oooOOOOArr = this.f12961OooOO0O;
            if (i >= oooOOOOArr.length) {
                return;
            }
            OooOOOO oooOOOO = oooOOOOArr[i];
            OooOOO oooOOO2 = oooOo.f13043OooO0Oo[i];
            if (oooOOO2 instanceof OooOo.OooO0O0) {
                oooOOO2 = ((OooOo.OooO0O0) oooOOO2).f13053OooO0Oo;
            }
            oooOOOO.OooO0o0(oooOOO2);
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final OooOOO OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        OooOOOO[] oooOOOOArr = this.f12961OooOO0O;
        int length = oooOOOOArr.length;
        OooOOO[] oooOOOArr = new OooOOO[length];
        oo0o0Oo[] oo0o0ooArr = this.f12962OooOO0o;
        int iOooO0O0 = oo0o0ooArr[0].OooO0O0(oooO0O0.f39859OooO00o);
        for (int i = 0; i < length; i++) {
            oooOOOArr[i] = oooOOOOArr[i].OooO0oo(oooO0O0.OooO0O0(oo0o0ooArr[i].OooOOO0(iOooO0O0)), o000oo0o2, j - this.f12966OooOOOo[iOooO0O0][i]);
        }
        return new OooOo(this.f12963OooOOO, this.f12966OooOOOo[iOooO0O0], oooOOOArr);
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO, com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0o() throws IOException {
        IllegalMergeException illegalMergeException = this.f12967OooOOo0;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.OooOO0o();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOo0(@Nullable o00O0OO0 o00o0oo1) {
        this.f12992OooOO0 = o00o0oo1;
        this.f12990OooO = o0O00.OooOO0O(null);
        int i = 0;
        while (true) {
            OooOOOO[] oooOOOOArr = this.f12961OooOO0O;
            if (i >= oooOOOOArr.length) {
                return;
            }
            OooOo(Integer.valueOf(i), oooOOOOArr[i]);
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO, com.google.android.exoplayer2.source.OooO00o
    public final void OooOOoo() {
        super.OooOOoo();
        Arrays.fill(this.f12962OooOO0o, (Object) null);
        this.f12965OooOOOO = -1;
        this.f12967OooOOo0 = null;
        ArrayList<OooOOOO> arrayList = this.f12964OooOOO0;
        arrayList.clear();
        Collections.addAll(arrayList, this.f12961OooOO0O);
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO
    @Nullable
    public final OooOOOO.OooO0O0 OooOo00(Integer num, OooOOOO.OooO0O0 oooO0O0) {
        if (num.intValue() == 0) {
            return oooO0O0;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO
    public final void OooOo0o(Integer num, OooOOOO oooOOOO, oo0o0Oo oo0o0oo) {
        Integer num2 = num;
        if (this.f12967OooOOo0 != null) {
            return;
        }
        if (this.f12965OooOOOO == -1) {
            this.f12965OooOOOO = oo0o0oo.OooO();
        } else if (oo0o0oo.OooO() != this.f12965OooOOOO) {
            this.f12967OooOOo0 = new IllegalMergeException();
            return;
        }
        int length = this.f12966OooOOOo.length;
        oo0o0Oo[] oo0o0ooArr = this.f12962OooOO0o;
        if (length == 0) {
            this.f12966OooOOOo = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f12965OooOOOO, oo0o0ooArr.length);
        }
        ArrayList<OooOOOO> arrayList = this.f12964OooOOO0;
        arrayList.remove(oooOOOO);
        oo0o0ooArr[num2.intValue()] = oo0o0oo;
        if (arrayList.isEmpty()) {
            OooOOo(oo0o0ooArr[0]);
        }
    }
}
