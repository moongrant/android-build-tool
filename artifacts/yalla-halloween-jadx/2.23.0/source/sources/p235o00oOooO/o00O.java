package p235o00oOooO;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.OooO0O0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayList;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p244o00oo0Oo.o00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O implements o00O0O0, o00OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public o00OO00O.OooO00o f40226OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Extractor f40227OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOo f40228OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40229OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SparseArray<OooO00o> f40230OooO0oO = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f40231OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f40232OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00OO0OO f40233OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOo[] f40234OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final oo0oOO0 f40225OooOOO0 = new oo0oOO0();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o00OO0O0 f40224OooOOO = new o00OO0O0();

    public static final class OooO00o implements TrackOutput {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f40235OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooOo f40236OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0O0 f40237OooO0OO = new OooO0O0();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOo f40238OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f40239OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TrackOutput f40240OooO0o0;

        public OooO00o(int i, int i2, @Nullable OooOo oooOo) {
            this.f40235OooO00o = i2;
            this.f40236OooO0O0 = oooOo;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final int OooO00o(o00 o00Var, int i, boolean z) {
            return OooO0oO(o00Var, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0O0(int i, o00Oo00 o00oo00) {
            OooO0Oo(i, o00oo00);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0075  */
        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0OO(OooOo oooOo) {
            String str;
            String str2;
            float f;
            float f2;
            int i;
            boolean z;
            String string;
            OooOo oooOo2 = oooOo;
            OooOo oooOo3 = this.f40236OooO0O0;
            if (oooOo3 != null) {
                if (oooOo2 == oooOo3) {
                    oooOo.getClass();
                } else {
                    int iOooO0oo = p245o00oo0o.o00OO0OO.OooO0oo(oooOo2.f11211OooOOOO);
                    String str3 = oooOo3.f11203OooO0o0;
                    if (str3 == null) {
                        str3 = oooOo2.f11203OooO0o0;
                    }
                    if ((iOooO0oo != 3 && iOooO0oo != 1) || (str = oooOo3.f11202OooO0o) == null) {
                        str = oooOo2.f11202OooO0o;
                    }
                    int i2 = oooOo2.f11200OooO;
                    if (i2 == -1) {
                        i2 = oooOo3.f11200OooO;
                    }
                    int i3 = oooOo2.f11206OooOO0;
                    if (i3 == -1) {
                        i3 = oooOo3.f11206OooOO0;
                    }
                    String str4 = oooOo2.f11208OooOO0o;
                    if (str4 == null) {
                        String[] strArrOoooO0O = o0O00.OoooO0O(oooOo3.f11208OooOO0o);
                        if (strArrOoooO0O.length == 0) {
                            string = null;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            for (String str5 : strArrOoooO0O) {
                                if (iOooO0oo == p245o00oo0o.o00OO0OO.OooO0oo(p245o00oo0o.o00OO0OO.OooO0Oo(str5))) {
                                    if (sb.length() > 0) {
                                        sb.append(",");
                                    }
                                    sb.append(str5);
                                }
                            }
                            if (sb.length() > 0) {
                                string = sb.toString();
                            } else {
                                string = null;
                            }
                        }
                        if (o0O00.OoooO0O(string).length == 1) {
                            str4 = string;
                        }
                    }
                    Metadata metadataOooO00o = oooOo3.f11210OooOOO0;
                    Metadata metadata = oooOo2.f11210OooOOO0;
                    if (metadata != null) {
                        metadataOooO00o = metadataOooO00o == null ? metadata : metadata.OooO00o(metadataOooO00o.f12530OooO0Oo);
                    }
                    float f3 = oooOo2.f11219OooOo0O;
                    if (f3 == -1.0f && iOooO0oo == 2) {
                        f3 = oooOo3.f11219OooOo0O;
                    }
                    int i4 = oooOo2.f11204OooO0oO | oooOo3.f11204OooO0oO;
                    int i5 = oooOo2.f11205OooO0oo | oooOo3.f11205OooO0oo;
                    ArrayList arrayList = new ArrayList();
                    DrmInitData drmInitData = oooOo3.f11213OooOOo;
                    if (drmInitData != null) {
                        DrmInitData.SchemeData[] schemeDataArr = drmInitData.f11750OooO0Oo;
                        int length = schemeDataArr.length;
                        int i6 = 0;
                        while (i6 < length) {
                            int i7 = length;
                            DrmInitData.SchemeData schemeData = schemeDataArr[i6];
                            DrmInitData.SchemeData[] schemeDataArr2 = schemeDataArr;
                            if (schemeData.f11758OooO0oo != null) {
                                arrayList.add(schemeData);
                            }
                            i6++;
                            length = i7;
                            schemeDataArr = schemeDataArr2;
                        }
                        str2 = drmInitData.f11751OooO0o;
                    } else {
                        str2 = null;
                    }
                    DrmInitData drmInitData2 = oooOo2.f11213OooOOo;
                    if (drmInitData2 != null) {
                        if (str2 == null) {
                            str2 = drmInitData2.f11751OooO0o;
                        }
                        int size = arrayList.size();
                        DrmInitData.SchemeData[] schemeDataArr3 = drmInitData2.f11750OooO0Oo;
                        int length2 = schemeDataArr3.length;
                        String str6 = str2;
                        int i8 = 0;
                        while (i8 < length2) {
                            int i9 = length2;
                            DrmInitData.SchemeData schemeData2 = schemeDataArr3[i8];
                            DrmInitData.SchemeData[] schemeDataArr4 = schemeDataArr3;
                            if (schemeData2.f11758OooO0oo != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size) {
                                        f2 = f3;
                                        i = size;
                                        z = false;
                                        break;
                                    }
                                    i = size;
                                    f2 = f3;
                                    if (((DrmInitData.SchemeData) arrayList.get(i10)).f11756OooO0o0.equals(schemeData2.f11756OooO0o0)) {
                                        z = true;
                                        break;
                                    } else {
                                        i10++;
                                        f3 = f2;
                                        size = i;
                                    }
                                }
                                if (!z) {
                                    arrayList.add(schemeData2);
                                }
                            } else {
                                f2 = f3;
                                i = size;
                            }
                            i8++;
                            length2 = i9;
                            schemeDataArr3 = schemeDataArr4;
                            f3 = f2;
                            size = i;
                        }
                        f = f3;
                        str2 = str6;
                    } else {
                        f = f3;
                    }
                    DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
                    OooOo.OooO00o oooO00o = new OooOo.OooO00o(oooOo2);
                    oooO00o.f11235OooO00o = oooOo3.f11201OooO0Oo;
                    oooO00o.f11236OooO0O0 = str3;
                    oooO00o.f11237OooO0OO = str;
                    oooO00o.f11238OooO0Oo = i4;
                    oooO00o.f11240OooO0o0 = i5;
                    oooO00o.f11239OooO0o = i2;
                    oooO00o.f11241OooO0oO = i3;
                    oooO00o.f11242OooO0oo = str4;
                    oooO00o.f11234OooO = metadataOooO00o;
                    oooO00o.f11246OooOOO = drmInitData3;
                    oooO00o.f11250OooOOo = f;
                    oooOo2 = new OooOo(oooO00o);
                }
            }
            this.f40238OooO0Oo = oooOo2;
            TrackOutput trackOutput = this.f40240OooO0o0;
            int i11 = o0O00.f40595OooO00o;
            trackOutput.OooO0OO(oooOo2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0Oo(int i, o00Oo00 o00oo00) {
            TrackOutput trackOutput = this.f40240OooO0o0;
            int i2 = o0O00.f40595OooO00o;
            trackOutput.OooO0O0(i, o00oo00);
        }

        public final void OooO0o(@Nullable o00OO00O.OooO00o oooO00o, long j) {
            if (oooO00o == null) {
                this.f40240OooO0o0 = this.f40237OooO0OO;
                return;
            }
            this.f40239OooO0o = j;
            TrackOutput trackOutputOooO00o = ((o00O0OOO) oooO00o).OooO00o(this.f40235OooO00o);
            this.f40240OooO0o0 = trackOutputOooO00o;
            OooOo oooOo = this.f40238OooO0Oo;
            if (oooOo != null) {
                trackOutputOooO00o.OooO0OO(oooOo);
            }
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void OooO0o0(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
            long j2 = this.f40239OooO0o;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f40240OooO0o0 = this.f40237OooO0OO;
            }
            TrackOutput trackOutput = this.f40240OooO0o0;
            int i4 = o0O00.f40595OooO00o;
            trackOutput.OooO0o0(j, i, i2, i3, oooO00o);
        }

        public final int OooO0oO(o00 o00Var, int i, boolean z) throws IOException {
            TrackOutput trackOutput = this.f40240OooO0o0;
            int i2 = o0O00.f40595OooO00o;
            return trackOutput.OooO00o(o00Var, i, z);
        }
    }

    public o00O(Extractor extractor, int i, OooOo oooOo) {
        this.f40227OooO0Oo = extractor;
        this.f40229OooO0o0 = i;
        this.f40228OooO0o = oooOo;
    }

    @Override // p209o00o0oo0.o00O0O0
    public final void OooO00o() {
        SparseArray<OooO00o> sparseArray = this.f40230OooO0oO;
        OooOo[] oooOoArr = new OooOo[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            OooOo oooOo = sparseArray.valueAt(i).f40238OooO0Oo;
            o00O000o.OooO0o0(oooOo);
            oooOoArr[i] = oooOo;
        }
        this.f40234OooOO0o = oooOoArr;
    }

    @Override // p209o00o0oo0.o00O0O0
    public final void OooO0O0(o00OO0OO o00oo0oo) {
        this.f40233OooOO0O = o00oo0oo;
    }

    public final void OooO0OO(@Nullable o00OO00O.OooO00o oooO00o, long j, long j2) {
        this.f40226OooO = oooO00o;
        this.f40232OooOO0 = j2;
        boolean z = this.f40231OooO0oo;
        Extractor extractor = this.f40227OooO0Oo;
        if (!z) {
            extractor.OooO0oo(this);
            if (j != -9223372036854775807L) {
                extractor.OooO0O0(0L, j);
            }
            this.f40231OooO0oo = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        extractor.OooO0O0(0L, j);
        int i = 0;
        while (true) {
            SparseArray<OooO00o> sparseArray = this.f40230OooO0oO;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).OooO0o(oooO00o, j2);
            i++;
        }
    }

    @Override // p209o00o0oo0.o00O0O0
    public final TrackOutput OooOOO(int i, int i2) {
        SparseArray<OooO00o> sparseArray = this.f40230OooO0oO;
        OooO00o oooO00o = sparseArray.get(i);
        if (oooO00o == null) {
            o00O000o.OooO0Oo(this.f40234OooOO0o == null);
            oooO00o = new OooO00o(i, i2, i2 == this.f40229OooO0o0 ? this.f40228OooO0o : null);
            oooO00o.OooO0o(this.f40226OooO, this.f40232OooOO0);
            sparseArray.put(i, oooO00o);
        }
        return oooO00o;
    }
}
