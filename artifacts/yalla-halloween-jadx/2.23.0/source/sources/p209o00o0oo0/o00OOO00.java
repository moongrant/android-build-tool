package p209o00o0oo0;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import java.util.List;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOO00 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f39553OooO00o;

        public OooO00o(String[] strArr) {
            this.f39553OooO00o = strArr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f39554OooO00o;

        public OooO0O0(boolean z) {
            this.f39554OooO00o = z;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f39555OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f39556OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f39557OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f39558OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f39559OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f39560OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final byte[] f39561OooO0oO;

        public OooO0OO(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f39555OooO00o = i;
            this.f39556OooO0O0 = i2;
            this.f39557OooO0OO = i3;
            this.f39558OooO0Oo = i4;
            this.f39560OooO0o0 = i5;
            this.f39559OooO0o = i6;
            this.f39561OooO0oO = bArr;
        }
    }

    @Nullable
    public static Metadata OooO00o(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = o0O00.f40595OooO00o;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.OooO0o("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.OooO00o(new o00Oo00(Base64.decode(strArrSplit[1], 0))));
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

    public static OooO00o OooO0O0(o00Oo00 o00oo00, boolean z, boolean z2) throws ParserException {
        if (z) {
            OooO0OO(3, o00oo00, false);
        }
        o00oo00.OooOOoo((int) o00oo00.OooOO0o());
        long jOooOO0o = o00oo00.OooOO0o();
        String[] strArr = new String[(int) jOooOO0o];
        for (int i = 0; i < jOooOO0o; i++) {
            strArr[i] = o00oo00.OooOOoo((int) o00oo00.OooOO0o());
        }
        if (z2 && (o00oo00.OooOo0O() & 1) == 0) {
            throw ParserException.OooO00o("framing bit expected to be set", null);
        }
        return new OooO00o(strArr);
    }

    public static boolean OooO0OO(int i, o00Oo00 o00oo00, boolean z) throws ParserException {
        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 7) {
            if (z) {
                return false;
            }
            throw ParserException.OooO00o("too short header: " + (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0), null);
        }
        if (o00oo00.OooOo0O() != i) {
            if (z) {
                return false;
            }
            throw ParserException.OooO00o("expected header type " + Integer.toHexString(i), null);
        }
        if (o00oo00.OooOo0O() == 118 && o00oo00.OooOo0O() == 111 && o00oo00.OooOo0O() == 114 && o00oo00.OooOo0O() == 98 && o00oo00.OooOo0O() == 105 && o00oo00.OooOo0O() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.OooO00o("expected characters 'vorbis'", null);
    }
}
