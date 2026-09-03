package p076o000Oo;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.OooOO0;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000OOoO.OooOO0O;
import o000OOoO.Oooo0;
import o000OOoO.Oooo000;
import o000OOoO.o000000;
import o000OOoO.o000OOo;
import org.xmlpull.v1.XmlPullParserException;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOOO implements Extractor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOo f34760OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Oooo0 f34762OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34763OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f34766OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MotionPhotoMetadata f34767OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Oooo000 f34768OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Mp4Extractor f34769OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O000 f34761OooO00o = new o000O000(6);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f34765OooO0o = -1;

    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    @Override // androidx.media3.extractor.Extractor
    public final int OooO00o(Oooo000 oooo000, o000OOo o000ooo2) throws IOException {
        String strOooOOOo;
        OooOo00 oooOo00OooO00o;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        int i = this.f34763OooO0OO;
        o000O000 o000o001 = this.f34761OooO00o;
        if (i == 0) {
            o000o001.OooOooO(2);
            ((OooOO0O) oooo000).OooO0o(o000o001.f34962OooO00o, 0, 2, false);
            int iOooOoOO = o000o001.OooOoOO();
            this.f34764OooO0Oo = iOooOoOO;
            if (iOooOoOO == 65498) {
                if (this.f34765OooO0o != -1) {
                    this.f34763OooO0OO = 4;
                    return 0;
                }
                OooO0Oo();
                return 0;
            }
            if ((iOooOoOO >= 65488 && iOooOoOO <= 65497) || iOooOoOO == 65281) {
                return 0;
            }
            this.f34763OooO0OO = 1;
            return 0;
        }
        if (i == 1) {
            o000o001.OooOooO(2);
            ((OooOO0O) oooo000).OooO0o(o000o001.f34962OooO00o, 0, 2, false);
            this.f34766OooO0o0 = o000o001.OooOoOO() - 2;
            this.f34763OooO0OO = 2;
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
                if (this.f34760OooO == null || oooo000 != this.f34768OooO0oo) {
                    this.f34768OooO0oo = oooo000;
                    this.f34760OooO = new OooOo((OooOO0O) oooo000, this.f34765OooO0o);
                }
                Mp4Extractor mp4Extractor = this.f34769OooOO0;
                mp4Extractor.getClass();
                int iOooO00o = mp4Extractor.OooO00o(this.f34760OooO, o000ooo2);
                if (iOooO00o == 1) {
                    o000ooo2.f34713OooO00o += this.f34765OooO0o;
                }
                return iOooO00o;
            }
            OooOO0O oooOO0O = (OooOO0O) oooo000;
            long j2 = oooOO0O.f34678OooO0Oo;
            long j3 = this.f34765OooO0o;
            if (j2 != j3) {
                o000ooo2.f34713OooO00o = j3;
                return 1;
            }
            if (oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 1, true)) {
                oooOO0O.f34679OooO0o = 0;
                if (this.f34769OooOO0 == null) {
                    this.f34769OooOO0 = new Mp4Extractor();
                }
                OooOo oooOo = new OooOo(oooOO0O, this.f34765OooO0o);
                this.f34760OooO = oooOo;
                if (this.f34769OooOO0.OooO0o(oooOo)) {
                    Mp4Extractor mp4Extractor2 = this.f34769OooOO0;
                    long j4 = this.f34765OooO0o;
                    Oooo0 oooo0 = this.f34762OooO0O0;
                    oooo0.getClass();
                    mp4Extractor2.f8731OooOOo = new Oooo000(j4, oooo0);
                    MotionPhotoMetadata motionPhotoMetadata2 = this.f34767OooO0oO;
                    motionPhotoMetadata2.getClass();
                    OooO0o0(motionPhotoMetadata2);
                    this.f34763OooO0OO = 5;
                } else {
                    OooO0Oo();
                }
            } else {
                OooO0Oo();
            }
            return 0;
        }
        if (this.f34764OooO0Oo == 65505) {
            o000O000 o000o002 = new o000O000(this.f34766OooO0o0);
            OooOO0O oooOO0O2 = (OooOO0O) oooo000;
            oooOO0O2.OooO0o(o000o002.f34962OooO00o, 0, this.f34766OooO0o0, false);
            if (this.f34767OooO0oO == null && "http://ns.adobe.com/xap/1.0/".equals(o000o002.OooOOOo()) && (strOooOOOo = o000o002.OooOOOo()) != null) {
                long j5 = oooOO0O2.f34677OooO0OO;
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
                        List<OooOo00.OooO00o> list = oooOo00OooO00o.f34773OooO0O0;
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
                                boolean zEquals = MediaUtils.VIDEO_MP4.equals(oooO00o.f34774OooO00o) | z;
                                if (size == 0) {
                                    j5 -= oooO00o.f34776OooO0OO;
                                    j = 0;
                                } else {
                                    j = j5 - oooO00o.f34775OooO0O0;
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
                                motionPhotoMetadata = new MotionPhotoMetadata(j6, j7, oooOo00OooO00o.f34772OooO00o, j8, j9);
                            }
                        }
                    }
                }
                this.f34767OooO0oO = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                    this.f34765OooO0o = motionPhotoMetadata.f8491OooO0oO;
                }
            }
        } else {
            ((OooOO0O) oooo000).OooOO0(this.f34766OooO0o0);
        }
        this.f34763OooO0OO = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0O0(long j, long j2) {
        if (j == 0) {
            this.f34763OooO0OO = 0;
            this.f34769OooOO0 = null;
        } else if (this.f34763OooO0OO == 5) {
            Mp4Extractor mp4Extractor = this.f34769OooOO0;
            mp4Extractor.getClass();
            mp4Extractor.OooO0O0(j, j2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void OooO0OO(Oooo0 oooo0) {
        this.f34762OooO0O0 = oooo0;
    }

    public final void OooO0Oo() {
        OooO0o0(new Metadata.Entry[0]);
        Oooo0 oooo0 = this.f34762OooO0O0;
        oooo0.getClass();
        oooo0.OooOO0O();
        this.f34762OooO0O0.OooO(new o000000.OooO0O0(-9223372036854775807L));
        this.f34763OooO0OO = 6;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean OooO0o(Oooo000 oooo000) throws IOException {
        OooOO0O oooOO0O = (OooOO0O) oooo000;
        if (OooO0oO(oooOO0O) != 65496) {
            return false;
        }
        int iOooO0oO = OooO0oO(oooOO0O);
        this.f34764OooO0Oo = iOooO0oO;
        o000O000 o000o001 = this.f34761OooO00o;
        if (iOooO0oO == 65504) {
            o000o001.OooOooO(2);
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 2, false);
            oooOO0O.OooOO0o(o000o001.OooOoOO() - 2, false);
            this.f34764OooO0Oo = OooO0oO(oooOO0O);
        }
        if (this.f34764OooO0Oo != 65505) {
            return false;
        }
        oooOO0O.OooOO0o(2, false);
        o000o001.OooOooO(6);
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 6, false);
        return o000o001.OooOo0o() == 1165519206 && o000o001.OooOoOO() == 0;
    }

    public final void OooO0o0(Metadata.Entry... entryArr) {
        Oooo0 oooo0 = this.f34762OooO0O0;
        oooo0.getClass();
        TrackOutput trackOutputOooOOOO = oooo0.OooOOOO(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        oooO00o.f6444OooOO0 = "image/jpeg";
        oooO00o.f6435OooO = new Metadata(entryArr);
        trackOutputOooOOOO.OooO0O0(new OooOO0(oooO00o));
    }

    public final int OooO0oO(OooOO0O oooOO0O) throws IOException {
        o000O000 o000o001 = this.f34761OooO00o;
        o000o001.OooOooO(2);
        oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, 2, false);
        return o000o001.OooOoOO();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.f34769OooOO0;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }
}
