package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
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
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class MergingMediaSource extends OooO0OO<Integer> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final androidx.media3.common.OooOOO0 f7859OooOOo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOOO[] f7860OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final androidx.media3.common.Oooo0[] f7861OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000O.OooO0o f7862OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<OooOOOO> f7863OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f7864OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long[][] f7865OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public IllegalMergeException f7866OooOOo0;

    public static final class IllegalMergeException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }
    }

    static {
        androidx.media3.common.OooOOO0.OooO0O0 oooO0O0 = new androidx.media3.common.OooOOO0.OooO0O0();
        oooO0O0.f6519OooO00o = "MergingMediaSource";
        f7859OooOOo = oooO0O0.OooO00o();
    }

    public MergingMediaSource(OooOOOO... oooOOOOArr) {
        o000O.OooO0o oooO0o = new o000O.OooO0o();
        this.f7860OooOO0O = oooOOOOArr;
        this.f7862OooOOO = oooO0o;
        this.f7863OooOOO0 = new ArrayList<>(Arrays.asList(oooOOOOArr));
        this.f7864OooOOOO = -1;
        this.f7861OooOO0o = new androidx.media3.common.Oooo0[oooOOOOArr.length];
        this.f7865OooOOOo = new long[0][];
        new HashMap();
        com.google.common.collect.oo000o.OooO0O0(8, "expectedKeys");
        new o00OOO00().OooO00o().OooO00o();
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final OooOOO OooO0OO(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        OooOOOO[] oooOOOOArr = this.f7860OooOO0O;
        int length = oooOOOOArr.length;
        OooOOO[] oooOOOArr = new OooOOO[length];
        androidx.media3.common.Oooo0[] oooo0Arr = this.f7861OooOO0o;
        int iOooO0o0 = oooo0Arr[0].OooO0o0(oooO0O0.f33816OooO00o);
        for (int i = 0; i < length; i++) {
            oooOOOArr[i] = oooOOOOArr[i].OooO0OO(oooO0O0.OooO0O0(oooo0Arr[i].OooOOOo(iOooO0o0)), o00oo1, j - this.f7865OooOOOo[iOooO0o0][i]);
        }
        return new OooOo(this.f7862OooOOO, this.f7865OooOOOo[iOooO0o0], oooOOOArr);
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final androidx.media3.common.OooOOO0 OooO0Oo() {
        OooOOOO[] oooOOOOArr = this.f7860OooOO0O;
        return oooOOOOArr.length > 0 ? oooOOOOArr[0].OooO0Oo() : f7859OooOOo;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oO(OooOOO oooOOO) {
        OooOo oooOo = (OooOo) oooOOO;
        int i = 0;
        while (true) {
            OooOOOO[] oooOOOOArr = this.f7860OooOO0O;
            if (i >= oooOOOOArr.length) {
                return;
            }
            OooOOOO oooOOOO = oooOOOOArr[i];
            OooOOO oooOOO2 = oooOo.f7942OooO0Oo[i];
            if (oooOOO2 instanceof OooOo.OooO0O0) {
                oooOOO2 = ((OooOo.OooO0O0) oooOOO2).f7952OooO0Oo;
            }
            oooOOOO.OooO0oO(oooOOO2);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO, androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0o() throws IOException {
        IllegalMergeException illegalMergeException = this.f7866OooOOo0;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.OooOO0o();
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    public final void OooOOo0(@Nullable o000O0O.OooOo oooOo) {
        this.f7891OooOO0 = oooOo;
        this.f7889OooO = o00.OooOO0o(null);
        int i = 0;
        while (true) {
            OooOOOO[] oooOOOOArr = this.f7860OooOO0O;
            if (i >= oooOOOOArr.length) {
                return;
            }
            OooOo(Integer.valueOf(i), oooOOOOArr[i]);
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO, androidx.media3.exoplayer.source.OooO00o
    public final void OooOOoo() {
        super.OooOOoo();
        Arrays.fill(this.f7861OooOO0o, (Object) null);
        this.f7864OooOOOO = -1;
        this.f7866OooOOo0 = null;
        ArrayList<OooOOOO> arrayList = this.f7863OooOOO0;
        arrayList.clear();
        Collections.addAll(arrayList, this.f7860OooOO0O);
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO
    @Nullable
    public final OooOOOO.OooO0O0 OooOo00(Integer num, OooOOOO.OooO0O0 oooO0O0) {
        if (num.intValue() == 0) {
            return oooO0O0;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO
    public final void OooOo0o(Integer num, OooOOOO oooOOOO, androidx.media3.common.Oooo0 oooo0) {
        Integer num2 = num;
        if (this.f7866OooOOo0 != null) {
            return;
        }
        if (this.f7864OooOOOO == -1) {
            this.f7864OooOOOO = oooo0.OooOO0o();
        } else if (oooo0.OooOO0o() != this.f7864OooOOOO) {
            this.f7866OooOOo0 = new IllegalMergeException();
            return;
        }
        int length = this.f7865OooOOOo.length;
        androidx.media3.common.Oooo0[] oooo0Arr = this.f7861OooOO0o;
        if (length == 0) {
            this.f7865OooOOOo = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f7864OooOOOO, oooo0Arr.length);
        }
        ArrayList<OooOOOO> arrayList = this.f7863OooOOO0;
        arrayList.remove(oooOOOO);
        oooo0Arr[num2.intValue()] = oooo0;
        if (arrayList.isEmpty()) {
            OooOOo(oooo0Arr[0]);
        }
    }
}
