package o000OOoO;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.List;
import p080o000OoO.o00;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00000O0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f34704OooO00o;

        public OooO00o(String[] strArr) {
            this.f34704OooO00o = strArr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f34705OooO00o;

        public OooO0O0(boolean z) {
            this.f34705OooO00o = z;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f34706OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34707OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f34708OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f34709OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f34710OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f34711OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final byte[] f34712OooO0oO;

        public OooO0OO(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f34706OooO00o = i;
            this.f34707OooO0O0 = i2;
            this.f34708OooO0OO = i3;
            this.f34709OooO0Oo = i4;
            this.f34711OooO0o0 = i5;
            this.f34710OooO0o = i6;
            this.f34712OooO0oO = bArr;
        }
    }

    @Nullable
    public static Metadata OooO00o(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = o00.f34910OooO00o;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.OooO0o("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.OooO00o(new o000O000(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    Log.OooO0oO("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static OooO00o OooO0O0(o000O000 o000o001, boolean z, boolean z2) throws ParserException {
        if (z) {
            OooO0OO(3, o000o001, false);
        }
        o000o001.OooOOoo((int) o000o001.OooOO0o());
        long jOooOO0o = o000o001.OooOO0o();
        String[] strArr = new String[(int) jOooOO0o];
        for (int i = 0; i < jOooOO0o; i++) {
            strArr[i] = o000o001.OooOOoo((int) o000o001.OooOO0o());
        }
        if (z2 && (o000o001.OooOo0O() & 1) == 0) {
            throw ParserException.OooO00o("framing bit expected to be set", null);
        }
        return new OooO00o(strArr);
    }

    public static boolean OooO0OO(int i, o000O000 o000o001, boolean z) throws ParserException {
        if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 7) {
            if (z) {
                return false;
            }
            throw ParserException.OooO00o("too short header: " + (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0), null);
        }
        if (o000o001.OooOo0O() != i) {
            if (z) {
                return false;
            }
            throw ParserException.OooO00o("expected header type " + Integer.toHexString(i), null);
        }
        if (o000o001.OooOo0O() == 118 && o000o001.OooOo0O() == 111 && o000o001.OooOo0O() == 114 && o000o001.OooOo0O() == 98 && o000o001.OooOo0O() == 105 && o000o001.OooOo0O() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.OooO00o("expected characters 'vorbis'", null);
    }
}
