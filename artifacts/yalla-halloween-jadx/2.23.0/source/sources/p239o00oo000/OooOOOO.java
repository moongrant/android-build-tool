package p239o00oo000;

import androidx.annotation.Nullable;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.xmlpull.v1.XmlPullParserException;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;
import p209o00o0oo0.o00OO0OO;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOOOO implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOo f40358OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00O0O0 f40360OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f40361OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40364OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f40365OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00O0O00 f40366OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Mp4Extractor f40367OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo00 f40359OooO00o = new o00Oo00(6);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f40363OooO0o = -1;

    public final void OooO00o() {
        OooO0OO(new Metadata.Entry[0]);
        o00O0O0 o00o0o0 = this.f40360OooO0O0;
        o00o0o0.getClass();
        o00o0o0.OooO00o();
        this.f40360OooO0O0.OooO0O0(new o00OO0OO.OooO0O0(-9223372036854775807L));
        this.f40361OooO0OO = 6;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f40361OooO0OO = 0;
            this.f40367OooOO0 = null;
        } else if (this.f40361OooO0OO == 5) {
            Mp4Extractor mp4Extractor = this.f40367OooOO0;
            mp4Extractor.getClass();
            mp4Extractor.OooO0O0(j, j2);
        }
    }

    public final void OooO0OO(Metadata.Entry... entryArr) {
        o00O0O0 o00o0o0 = this.f40360OooO0O0;
        o00o0o0.getClass();
        TrackOutput trackOutputOooOOO = o00o0o0.OooOOO(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.f11243OooOO0 = "image/jpeg";
        oooO00o.f11234OooO = new Metadata(entryArr);
        trackOutputOooOOO.OooO0OO(new OooOo(oooO00o));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException {
        o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
        if (OooO0o0(o00o00o1) != 65496) {
            return false;
        }
        int iOooO0o0 = OooO0o0(o00o00o1);
        this.f40362OooO0Oo = iOooO0o0;
        o00Oo00 o00oo00 = this.f40359OooO00o;
        if (iOooO0o0 == 65504) {
            o00oo00.OooOooO(2);
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 2, false);
            o00o00o1.OooOO0o(o00oo00.OooOoOO() - 2, false);
            this.f40362OooO0Oo = OooO0o0(o00o00o1);
        }
        if (this.f40362OooO0Oo != 65505) {
            return false;
        }
        o00o00o1.OooOO0o(2, false);
        o00oo00.OooOooO(6);
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 6, false);
        return o00oo00.OooOo0o() == 1165519206 && o00oo00.OooOoOO() == 0;
    }

    public final int OooO0o0(o00O00o0 o00o00o1) throws IOException {
        o00Oo00 o00oo00 = this.f40359OooO00o;
        o00oo00.OooOooO(2);
        o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 2, false);
        return o00oo00.OooOoOO();
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException {
        String strOooOOOo;
        OooOo00 oooOo00OooO00o;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        int i = this.f40361OooO0OO;
        o00Oo00 o00oo00 = this.f40359OooO00o;
        if (i == 0) {
            o00oo00.OooOooO(2);
            ((o00O00o0) o00o0o01).OooO0oO(o00oo00.f40591OooO00o, 0, 2, false);
            int iOooOoOO = o00oo00.OooOoOO();
            this.f40362OooO0Oo = iOooOoOO;
            if (iOooOoOO == 65498) {
                if (this.f40363OooO0o != -1) {
                    this.f40361OooO0OO = 4;
                    return 0;
                }
                OooO00o();
                return 0;
            }
            if ((iOooOoOO >= 65488 && iOooOoOO <= 65497) || iOooOoOO == 65281) {
                return 0;
            }
            this.f40361OooO0OO = 1;
            return 0;
        }
        if (i == 1) {
            o00oo00.OooOooO(2);
            ((o00O00o0) o00o0o01).OooO0oO(o00oo00.f40591OooO00o, 0, 2, false);
            this.f40364OooO0o0 = o00oo00.OooOoOO() - 2;
            this.f40361OooO0OO = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f40358OooO == null || o00o0o01 != this.f40366OooO0oo) {
                    this.f40366OooO0oo = o00o0o01;
                    this.f40358OooO = new OooOo((o00O00o0) o00o0o01, this.f40363OooO0o);
                }
                Mp4Extractor mp4Extractor = this.f40367OooOO0;
                mp4Extractor.getClass();
                int iOooO0oO = mp4Extractor.OooO0oO(this.f40358OooO, o00oo0o1);
                if (iOooO0oO == 1) {
                    o00oo0o1.f39548OooO00o += this.f40363OooO0o;
                }
                return iOooO0oO;
            }
            o00O00o0 o00o00o1 = (o00O00o0) o00o0o01;
            long j2 = o00o00o1.f39532OooO0Oo;
            long j3 = this.f40363OooO0o;
            if (j2 != j3) {
                o00oo0o1.f39548OooO00o = j3;
                return 1;
            }
            if (o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, 1, true)) {
                o00o00o1.f39533OooO0o = 0;
                if (this.f40367OooOO0 == null) {
                    this.f40367OooOO0 = new Mp4Extractor();
                }
                OooOo oooOo = new OooOo(o00o00o1, this.f40363OooO0o);
                this.f40358OooO = oooOo;
                if (this.f40367OooOO0.OooO0Oo(oooOo)) {
                    Mp4Extractor mp4Extractor2 = this.f40367OooOO0;
                    long j4 = this.f40363OooO0o;
                    o00O0O0 o00o0o0 = this.f40360OooO0O0;
                    o00o0o0.getClass();
                    mp4Extractor2.f12039OooOOo = new Oooo000(j4, o00o0o0);
                    MotionPhotoMetadata motionPhotoMetadata2 = this.f40365OooO0oO;
                    motionPhotoMetadata2.getClass();
                    OooO0OO(motionPhotoMetadata2);
                    this.f40361OooO0OO = 5;
                } else {
                    OooO00o();
                }
            } else {
                OooO00o();
            }
            return 0;
        }
        if (this.f40362OooO0Oo == 65505) {
            o00Oo00 o00oo01 = new o00Oo00(this.f40364OooO0o0);
            o00O00o0 o00o00o2 = (o00O00o0) o00o0o01;
            o00o00o2.OooO0oO(o00oo01.f40591OooO00o, 0, this.f40364OooO0o0, false);
            if (this.f40365OooO0oO == null && "http://ns.adobe.com/xap/1.0/".equals(o00oo01.OooOOOo()) && (strOooOOOo = o00oo01.OooOOOo()) != null) {
                long j5 = o00o00o2.f39531OooO0OO;
                if (j5 == -1) {
                    motionPhotoMetadata = null;
                } else {
                    try {
                        oooOo00OooO00o = Oooo0.OooO00o(strOooOOOo);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        Log.OooO0o("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        oooOo00OooO00o = null;
                    }
                    if (oooOo00OooO00o == null) {
                        motionPhotoMetadata = null;
                    } else {
                        List<OooOo00.OooO00o> list = oooOo00OooO00o.f40371OooO0O0;
                        if (list.size() < 2) {
                            motionPhotoMetadata = null;
                        } else {
                            int size = list.size() - 1;
                            long j6 = -1;
                            long j7 = -1;
                            long j8 = -1;
                            long j9 = -1;
                            boolean z = false;
                            while (size >= 0) {
                                OooOo00.OooO00o oooO00o = list.get(size);
                                boolean zEquals = MediaUtils.VIDEO_MP4.equals(oooO00o.f40372OooO00o) | z;
                                if (size == 0) {
                                    j5 -= oooO00o.f40374OooO0OO;
                                    j = 0;
                                } else {
                                    j = j5 - oooO00o.f40373OooO0O0;
                                }
                                long j10 = j5;
                                j5 = j;
                                if (zEquals && j5 != j10) {
                                    j9 = j10 - j5;
                                    j8 = j5;
                                    zEquals = false;
                                }
                                if (size == 0) {
                                    j6 = j5;
                                    j7 = j10;
                                }
                                size--;
                                z = zEquals;
                            }
                            if (j8 == -1 || j9 == -1 || j6 == -1 || j7 == -1) {
                                motionPhotoMetadata = null;
                            } else {
                                motionPhotoMetadata = new MotionPhotoMetadata(j6, j7, oooOo00OooO00o.f40370OooO00o, j8, j9);
                            }
                        }
                    }
                }
                this.f40365OooO0oO = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f40363OooO0o = motionPhotoMetadata.f12616OooO0oO;
                }
            }
        } else {
            ((o00O00o0) o00o0o01).OooOO0(this.f40364OooO0o0);
        }
        this.f40361OooO0OO = 0;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO0oo(o00O0O0 o00o0o0) {
        this.f40360OooO0O0 = o00o0o0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.f40367OooOO0;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }
}
