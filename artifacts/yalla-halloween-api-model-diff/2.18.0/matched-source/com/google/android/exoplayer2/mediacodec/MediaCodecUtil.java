package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.appevents.OooOOOO;
import com.facebook.appevents.OooOo00;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.ColorInfo;
import com.umeng.analytics.pro.bz;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p086o000OooO.o0O0O00;
import p319o0O0oOo.o00;
import p319o0O0oOo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f14445OooO00o = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap<OooO00o, List<com.google.android.exoplayer2.mediacodec.OooO00o>> f14446OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static int f14447OooO0OO = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface OooO<T> {
        int OooO00o(T t);
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f14448OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f14449OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f14450OooO0OO;

        public OooO00o(String str, boolean z, boolean z2) {
            this.f14448OooO00o = str;
            this.f14449OooO0O0 = z;
            this.f14450OooO0OO = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != OooO00o.class) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return TextUtils.equals(this.f14448OooO00o, oooO00o.f14448OooO00o) && this.f14449OooO0O0 == oooO00o.f14449OooO0O0 && this.f14450OooO0OO == oooO00o.f14450OooO0OO;
        }

        public final int hashCode() {
            return ((o0O0O00.OooO0O0(this.f14448OooO00o, 31, 31) + (this.f14449OooO0O0 ? 1231 : 1237)) * 31) + (this.f14450OooO0OO ? 1231 : 1237);
        }
    }

    public interface OooO0O0 {
        MediaCodecInfo OooO00o(int i);

        boolean OooO0O0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean OooO0OO(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int OooO0Oo();

        boolean OooO0o0();
    }

    public static final class OooO0OO implements OooO0O0 {
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final MediaCodecInfo OooO00o(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0O0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0OO(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final int OooO0Oo() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0o0() {
            return false;
        }
    }

    @RequiresApi(21)
    public static final class OooO0o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14451OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public MediaCodecInfo[] f14452OooO0O0;

        public OooO0o(boolean z, boolean z2) {
            this.f14451OooO00o = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final MediaCodecInfo OooO00o(int i) {
            if (this.f14452OooO0O0 == null) {
                this.f14452OooO0O0 = new MediaCodecList(this.f14451OooO00o).getCodecInfos();
            }
            return this.f14452OooO0O0[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0O0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0OO(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final int OooO0Oo() {
            if (this.f14452OooO0O0 == null) {
                this.f14452OooO0O0 = new MediaCodecList(this.f14451OooO00o).getCodecInfos();
            }
            return this.f14452OooO0O0.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0o0() {
            return true;
        }
    }

    public static int OooO() throws DecoderQueryException {
        int i;
        if (f14447OooO0OO == -1) {
            int iMax = 0;
            List<com.google.android.exoplayer2.mediacodec.OooO00o> listOooO0Oo = OooO0Oo("video/avc", false, false);
            com.google.android.exoplayer2.mediacodec.OooO00o oooO00o = listOooO0Oo.isEmpty() ? null : listOooO0Oo.get(0);
            if (oooO00o != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrOooO0OO = oooO00o.OooO0OO();
                int length = codecProfileLevelArrOooO0OO.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArrOooO0OO[iMax].level;
                    if (i2 != 1 && i2 != 2) {
                        switch (i2) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                break;
                            case 64:
                                i = 202752;
                                break;
                            case 128:
                            case 256:
                                i = 414720;
                                break;
                            case 512:
                                i = 921600;
                                break;
                            case 1024:
                                i = 1310720;
                                break;
                            case RecyclerView.oo0o0Oo.FLAG_MOVED /* 2048 */:
                            case 4096:
                                i = 2097152;
                                break;
                            case 8192:
                                i = 2228224;
                                break;
                            case 16384:
                                i = 5652480;
                                break;
                            case ShareRequest.THUMB_DATA_SIZE_LIMIT /* 32768 */:
                            case 65536:
                                i = 9437184;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                    } else {
                        i = 25344;
                    }
                    iMax2 = Math.max(i, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, o00.f36680OooO00o >= 21 ? 345600 : 172800);
            }
            f14447OooO0OO = iMax;
        }
        return f14447OooO0OO;
    }

    public static void OooO00o(String str, List<com.google.android.exoplayer2.mediacodec.OooO00o> list) {
        if ("audio/raw".equals(str)) {
            if (o00.f36680OooO00o < 26 && o00.f36681OooO0O0.equals("R9") && list.size() == 1 && list.get(0).f14453OooO00o.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(com.google.android.exoplayer2.mediacodec.OooO00o.OooO("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            OooOO0(list, OooOo00.f12744OoooO00);
        }
        int i = o00.f36680OooO00o;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f14453OooO00o;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                OooOO0(list, OooOOOO.f12740OoooO00);
            }
        }
        if (i >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f14453OooO00o)) {
            return;
        }
        list.add(list.remove(0));
    }

    @Nullable
    public static String OooO0O0(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:182:0x026a  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ed A[Catch: NumberFormatException -> 0x03fd, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x03fd, blocks: (B:260:0x0385, B:262:0x0399, B:273:0x03b6, B:289:0x03ed), top: B:610:0x0385 }] */
    /* JADX WARN: Code duplicated, block: B:426:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:455:0x0691  */
    /* JADX WARN: Code duplicated, block: B:563:0x085a  */
    /* JADX WARN: Code duplicated, block: B:564:0x085c  */
    /* JADX WARN: Code duplicated, block: B:572:0x086d  */
    /* JADX WARN: Code duplicated, block: B:574:0x0871  */
    /* JADX WARN: Code duplicated, block: B:575:0x0875  */
    /* JADX WARN: Code duplicated, block: B:576:0x0878  */
    /* JADX WARN: Code duplicated, block: B:577:0x087b  */
    /* JADX WARN: Code duplicated, block: B:578:0x087e  */
    /* JADX WARN: Code duplicated, block: B:579:0x0881  */
    /* JADX WARN: Code duplicated, block: B:580:0x0884  */
    /* JADX WARN: Code duplicated, block: B:581:0x0887  */
    /* JADX WARN: Code duplicated, block: B:582:0x088a  */
    /* JADX WARN: Code duplicated, block: B:583:0x088d  */
    /* JADX WARN: Code duplicated, block: B:584:0x0891  */
    /* JADX WARN: Code duplicated, block: B:585:0x0894  */
    /* JADX WARN: Code duplicated, block: B:586:0x0898  */
    /* JADX WARN: Code duplicated, block: B:587:0x089c  */
    /* JADX WARN: Code duplicated, block: B:588:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:589:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:590:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:591:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:592:0x08af  */
    /* JADX WARN: Code duplicated, block: B:593:0x08b3 A[PHI: r2
      0x08b3: PHI (r2v4 int) = 
      (r2v3 int)
      (r2v5 int)
      (r2v6 int)
      (r2v7 int)
      (r2v8 int)
      (r2v9 int)
      (r2v10 int)
      (r2v11 int)
      (r2v12 int)
      (r2v13 int)
      (r2v14 int)
      (r2v15 int)
     binds: [B:573:0x086e, B:588:0x08a0, B:584:0x0891, B:583:0x088d, B:582:0x088a, B:581:0x0887, B:580:0x0884, B:579:0x0881, B:578:0x087e, B:577:0x087b, B:576:0x0878, B:575:0x0875] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:594:0x08b6  */
    /* JADX WARN: Code duplicated, block: B:595:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:596:0x08be  */
    /* JADX WARN: Code duplicated, block: B:597:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:598:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:600:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:601:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:623:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static Pair<Integer, Integer> OooO0OO(Format format) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer numValueOf;
        int i11;
        int i12;
        int i13;
        Integer num;
        Integer num2;
        String str = format.f13145OoooOOo;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        int i14 = 512;
        if ("video/dolby-vision".equals(format.f13148OoooOoo)) {
            String str2 = format.f13145OoooOOo;
            if (strArrSplit.length < 3) {
                String strValueOf = String.valueOf(str2);
                Log.w("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            } else {
                Matcher matcher = f14445OooO00o.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                num = 1;
                                break;
                            case "01":
                                num = 2;
                                break;
                            case "02":
                                num = 4;
                                break;
                            case "03":
                                num = 8;
                                break;
                            case "04":
                                num = 16;
                                break;
                            case "05":
                                num = 32;
                                break;
                            case "06":
                                num = 64;
                                break;
                            case "07":
                                num = 128;
                                break;
                            case "08":
                                num = 256;
                                break;
                            case "09":
                                num = 512;
                                break;
                            default:
                                num = null;
                                break;
                        }
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        String strValueOf2 = String.valueOf(strGroup);
                        Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf2) : new String("Unknown Dolby Vision profile string: "));
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3) {
                                case "01":
                                    num2 = 1;
                                    break;
                                case "02":
                                    num2 = 2;
                                    break;
                                case "03":
                                    num2 = 4;
                                    break;
                                case "04":
                                    num2 = 8;
                                    break;
                                case "05":
                                    num2 = 16;
                                    break;
                                case "06":
                                    num2 = 32;
                                    break;
                                case "07":
                                    num2 = 64;
                                    break;
                                case "08":
                                    num2 = 128;
                                    break;
                                case "09":
                                    num2 = 256;
                                    break;
                                default:
                                    num2 = null;
                                    break;
                            }
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            return new Pair<>(num, num2);
                        }
                        String strValueOf3 = String.valueOf(str3);
                        Log.w("MediaCodecUtil", strValueOf3.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf3) : new String("Unknown Dolby Vision level string: "));
                    }
                } else {
                    String strValueOf4 = String.valueOf(str2);
                    Log.w("MediaCodecUtil", strValueOf4.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf4) : new String("Ignoring malformed Dolby Vision codec string: "));
                }
            }
            return null;
        }
        String str4 = strArrSplit[0];
        Objects.requireNonNull(str4);
        switch (str4) {
            case "av01":
                b = 0;
                break;
            case "avc1":
                b = 1;
                break;
            case "avc2":
                b = 2;
                break;
            case "hev1":
                b = 3;
                break;
            case "hvc1":
                b = 4;
                break;
            case "mp4a":
                b = 5;
                break;
            case "vp09":
                b = 6;
                break;
            default:
                b = -1;
                break;
        }
        byte b2 = 20;
        switch (b) {
            case 0:
                String str5 = format.f13145OoooOOo;
                ColorInfo colorInfo = format.f13159o00O0O;
                if (strArrSplit.length < 4) {
                    String strValueOf5 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf5.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf5) : new String("Ignoring malformed AV1 codec string: "));
                    return null;
                }
                try {
                    int i15 = Integer.parseInt(strArrSplit[1]);
                    int i16 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                    int i17 = Integer.parseInt(strArrSplit[3]);
                    if (i15 != 0) {
                        p468o0OooO0.o0O0O00.OooO00o(32, "Unknown AV1 profile: ", i15, "MediaCodecUtil");
                    } else {
                        int i18 = 8;
                        int i19 = 32;
                        if (i17 == 8) {
                            if (i17 == i18) {
                                i = 1;
                            } else if (colorInfo == null && (colorInfo.f14917OoooO0O != null || (i2 = colorInfo.f14915OoooO0) == 7 || i2 == 6)) {
                                i = 4096;
                            } else {
                                i = 2;
                            }
                            switch (i16) {
                                case 0:
                                    i3 = -1;
                                    i4 = 1;
                                    break;
                                case 1:
                                    i3 = -1;
                                    i4 = 2;
                                    break;
                                case 2:
                                    i3 = -1;
                                    i4 = 4;
                                    break;
                                case 3:
                                    i3 = -1;
                                    i4 = 8;
                                    break;
                                case 4:
                                    i3 = -1;
                                    i4 = 16;
                                    break;
                                case 5:
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 6:
                                    i3 = -1;
                                    i4 = 64;
                                    break;
                                case 7:
                                    i3 = -1;
                                    i4 = 128;
                                    break;
                                case 8:
                                    i3 = -1;
                                    i4 = 256;
                                    break;
                                case 9:
                                    i3 = -1;
                                    i4 = 512;
                                    break;
                                case 10:
                                    i19 = 1024;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 11:
                                    i3 = -1;
                                    i4 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                                    break;
                                case 12:
                                    i3 = -1;
                                    i4 = 4096;
                                    break;
                                case 13:
                                    i3 = -1;
                                    i4 = 8192;
                                    break;
                                case 14:
                                    i19 = 16384;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 15:
                                    i19 = ShareRequest.THUMB_DATA_SIZE_LIMIT;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 16:
                                    i19 = 65536;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 17:
                                    i19 = 131072;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 18:
                                    i19 = 262144;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 19:
                                    i19 = 524288;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 20:
                                    i19 = 1048576;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 21:
                                    i19 = 2097152;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 22:
                                    i19 = 4194304;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 23:
                                    i19 = 8388608;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                default:
                                    i3 = -1;
                                    i4 = -1;
                                    break;
                            }
                            if (i4 == i3) {
                                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i4));
                            }
                            p468o0OooO0.o0O0O00.OooO00o(30, "Unknown AV1 level: ", i16, "MediaCodecUtil");
                        } else if (i17 != 10) {
                            p468o0OooO0.o0O0O00.OooO00o(34, "Unknown AV1 bit depth: ", i17, "MediaCodecUtil");
                        } else {
                            i18 = 8;
                            if (i17 == i18) {
                                i = 1;
                            } else if (colorInfo == null) {
                                i = 2;
                            } else {
                                i = 2;
                            }
                            switch (i16) {
                                case 0:
                                    i3 = -1;
                                    i4 = 1;
                                    break;
                                case 1:
                                    i3 = -1;
                                    i4 = 2;
                                    break;
                                case 2:
                                    i3 = -1;
                                    i4 = 4;
                                    break;
                                case 3:
                                    i3 = -1;
                                    i4 = 8;
                                    break;
                                case 4:
                                    i3 = -1;
                                    i4 = 16;
                                    break;
                                case 5:
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 6:
                                    i3 = -1;
                                    i4 = 64;
                                    break;
                                case 7:
                                    i3 = -1;
                                    i4 = 128;
                                    break;
                                case 8:
                                    i3 = -1;
                                    i4 = 256;
                                    break;
                                case 9:
                                    i3 = -1;
                                    i4 = 512;
                                    break;
                                case 10:
                                    i19 = 1024;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 11:
                                    i3 = -1;
                                    i4 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                                    break;
                                case 12:
                                    i3 = -1;
                                    i4 = 4096;
                                    break;
                                case 13:
                                    i3 = -1;
                                    i4 = 8192;
                                    break;
                                case 14:
                                    i19 = 16384;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 15:
                                    i19 = ShareRequest.THUMB_DATA_SIZE_LIMIT;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 16:
                                    i19 = 65536;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 17:
                                    i19 = 131072;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 18:
                                    i19 = 262144;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 19:
                                    i19 = 524288;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 20:
                                    i19 = 1048576;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 21:
                                    i19 = 2097152;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 22:
                                    i19 = 4194304;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                case 23:
                                    i19 = 8388608;
                                    i3 = -1;
                                    i4 = i19;
                                    break;
                                default:
                                    i3 = -1;
                                    i4 = -1;
                                    break;
                            }
                            if (i4 == i3) {
                                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i4));
                            }
                            p468o0OooO0.o0O0O00.OooO00o(30, "Unknown AV1 level: ", i16, "MediaCodecUtil");
                        }
                    }
                } catch (NumberFormatException unused) {
                    String strValueOf6 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", strValueOf6.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf6) : new String("Ignoring malformed AV1 codec string: "));
                }
                return null;
            case 1:
            case 2:
                String str6 = format.f13145OoooOOo;
                if (strArrSplit.length < 2) {
                    String strValueOf7 = String.valueOf(str6);
                    Log.w("MediaCodecUtil", strValueOf7.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf7) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                try {
                    if (strArrSplit[1].length() == 6) {
                        i5 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                        i6 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                    } else {
                        if (strArrSplit.length < 3) {
                            String strValueOf8 = String.valueOf(str6);
                            Log.w("MediaCodecUtil", strValueOf8.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf8) : new String("Ignoring malformed AVC codec string: "));
                            return null;
                        }
                        i5 = Integer.parseInt(strArrSplit[1]);
                        i6 = Integer.parseInt(strArrSplit[2]);
                    }
                    if (i5 == 66) {
                        i7 = 1;
                    } else if (i5 == 77) {
                        i7 = 2;
                    } else if (i5 == 88) {
                        i7 = 4;
                    } else if (i5 == 100) {
                        i7 = 8;
                    } else if (i5 == 110) {
                        i7 = 16;
                    } else if (i5 != 122) {
                        i7 = i5 != 244 ? -1 : 64;
                    } else {
                        i7 = 32;
                    }
                    if (i7 == -1) {
                        p468o0OooO0.o0O0O00.OooO00o(32, "Unknown AVC profile: ", i5, "MediaCodecUtil");
                        return null;
                    }
                    switch (i6) {
                        case 10:
                            i8 = -1;
                            i9 = 1;
                            break;
                        case 11:
                            i8 = -1;
                            i9 = 4;
                            break;
                        case 12:
                            i8 = -1;
                            i9 = 8;
                            break;
                        case 13:
                            i8 = -1;
                            i9 = 16;
                            break;
                        default:
                            switch (i6) {
                                case 20:
                                    i8 = -1;
                                    i9 = 32;
                                    break;
                                case 21:
                                    i8 = -1;
                                    i9 = 64;
                                    break;
                                case 22:
                                    i8 = -1;
                                    i9 = 128;
                                    break;
                                default:
                                    switch (i6) {
                                        case 30:
                                            i8 = -1;
                                            i9 = 256;
                                            break;
                                        case 31:
                                            i9 = i14;
                                            i8 = -1;
                                            break;
                                        case 32:
                                            i14 = 1024;
                                            i9 = i14;
                                            i8 = -1;
                                            break;
                                        default:
                                            switch (i6) {
                                                case 40:
                                                    i8 = -1;
                                                    i9 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                                                    break;
                                                case 41:
                                                    i8 = -1;
                                                    i9 = 4096;
                                                    break;
                                                case 42:
                                                    i8 = -1;
                                                    i9 = 8192;
                                                    break;
                                                default:
                                                    switch (i6) {
                                                        case 50:
                                                            i14 = 16384;
                                                            i9 = i14;
                                                            i8 = -1;
                                                            break;
                                                        case 51:
                                                            i14 = ShareRequest.THUMB_DATA_SIZE_LIMIT;
                                                            i9 = i14;
                                                            i8 = -1;
                                                            break;
                                                        case 52:
                                                            i14 = 65536;
                                                            i9 = i14;
                                                            i8 = -1;
                                                            break;
                                                        default:
                                                            i8 = -1;
                                                            i9 = -1;
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    if (i9 != i8) {
                        return new Pair<>(Integer.valueOf(i7), Integer.valueOf(i9));
                    }
                    p468o0OooO0.o0O0O00.OooO00o(30, "Unknown AVC level: ", i6, "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused2) {
                    String strValueOf9 = String.valueOf(str6);
                    Log.w("MediaCodecUtil", strValueOf9.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf9) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
            case 3:
            case 4:
                String str7 = format.f13145OoooOOo;
                if (strArrSplit.length < 4) {
                    String strValueOf10 = String.valueOf(str7);
                    Log.w("MediaCodecUtil", strValueOf10.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf10) : new String("Ignoring malformed HEVC codec string: "));
                    return null;
                }
                Matcher matcher2 = f14445OooO00o.matcher(strArrSplit[1]);
                if (!matcher2.matches()) {
                    String strValueOf11 = String.valueOf(str7);
                    Log.w("MediaCodecUtil", strValueOf11.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf11) : new String("Ignoring malformed HEVC codec string: "));
                    return null;
                }
                String strGroup2 = matcher2.group(1);
                if ("1".equals(strGroup2)) {
                    i10 = 1;
                } else {
                    if (!FeedbackType.Suggestions.equals(strGroup2)) {
                        String strValueOf12 = String.valueOf(strGroup2);
                        Log.w("MediaCodecUtil", strValueOf12.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf12) : new String("Unknown HEVC profile string: "));
                        return null;
                    }
                    i10 = 2;
                }
                String str8 = strArrSplit[3];
                if (str8 != null) {
                    switch (str8.hashCode()) {
                        case 70821:
                            if (!str8.equals("H30")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 70914:
                            if (!str8.equals("H60")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 70917:
                            if (!str8.equals("H63")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 71007:
                            if (!str8.equals("H90")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        case 71010:
                            if (!str8.equals("H93")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 74665:
                            if (!str8.equals("L30")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 74758:
                            if (!str8.equals("L60")) {
                                b2 = -1;
                            } else {
                                b2 = 6;
                            }
                            break;
                        case 74761:
                            if (!str8.equals("L63")) {
                                b2 = -1;
                            } else {
                                b2 = 7;
                            }
                            break;
                        case 74851:
                            if (!str8.equals("L90")) {
                                b2 = -1;
                            } else {
                                b2 = 8;
                            }
                            break;
                        case 74854:
                            if (!str8.equals("L93")) {
                                b2 = -1;
                            } else {
                                b2 = 9;
                            }
                            break;
                        case 2193639:
                            if (!str8.equals("H120")) {
                                b2 = -1;
                            } else {
                                b2 = 10;
                            }
                            break;
                        case 2193642:
                            if (!str8.equals("H123")) {
                                b2 = -1;
                            } else {
                                b2 = 11;
                            }
                            break;
                        case 2193732:
                            if (!str8.equals("H150")) {
                                b2 = -1;
                            } else {
                                b2 = 12;
                            }
                            break;
                        case 2193735:
                            if (!str8.equals("H153")) {
                                b2 = -1;
                            } else {
                                b2 = bz.k;
                            }
                            break;
                        case 2193738:
                            if (!str8.equals("H156")) {
                                b2 = -1;
                            } else {
                                b2 = bz.l;
                            }
                            break;
                        case 2193825:
                            if (!str8.equals("H180")) {
                                b2 = -1;
                            } else {
                                b2 = bz.m;
                            }
                            break;
                        case 2193828:
                            if (!str8.equals("H183")) {
                                b2 = -1;
                            } else {
                                b2 = bz.n;
                            }
                            break;
                        case 2193831:
                            if (!str8.equals("H186")) {
                                b2 = -1;
                            } else {
                                b2 = 17;
                            }
                            break;
                        case 2312803:
                            if (!str8.equals("L120")) {
                                b2 = -1;
                            } else {
                                b2 = 18;
                            }
                            break;
                        case 2312806:
                            if (!str8.equals("L123")) {
                                b2 = -1;
                            } else {
                                b2 = 19;
                            }
                            break;
                        case 2312896:
                            if (!str8.equals("L150")) {
                                b2 = -1;
                            }
                            break;
                        case 2312899:
                            if (!str8.equals("L153")) {
                                b2 = -1;
                            } else {
                                b2 = 21;
                            }
                            break;
                        case 2312902:
                            if (!str8.equals("L156")) {
                                b2 = -1;
                            } else {
                                b2 = 22;
                            }
                            break;
                        case 2312989:
                            if (!str8.equals("L180")) {
                                b2 = -1;
                            } else {
                                b2 = 23;
                            }
                            break;
                        case 2312992:
                            if (!str8.equals("L183")) {
                                b2 = -1;
                            } else {
                                b2 = 24;
                            }
                            break;
                        case 2312995:
                            if (!str8.equals("L186")) {
                                b2 = -1;
                            } else {
                                b2 = 25;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            numValueOf = 2;
                            break;
                        case 1:
                            numValueOf = 8;
                            break;
                        case 2:
                            numValueOf = 32;
                            break;
                        case 3:
                            numValueOf = 128;
                            break;
                        case 4:
                            numValueOf = 512;
                            break;
                        case 5:
                            numValueOf = 1;
                            break;
                        case 6:
                            numValueOf = 4;
                            break;
                        case 7:
                            numValueOf = 16;
                            break;
                        case 8:
                            numValueOf = 64;
                            break;
                        case 9:
                            numValueOf = 256;
                            break;
                        case 10:
                            numValueOf = Integer.valueOf(RecyclerView.oo0o0Oo.FLAG_MOVED);
                            break;
                        case 11:
                            numValueOf = 8192;
                            break;
                        case 12:
                            numValueOf = Integer.valueOf(ShareRequest.THUMB_DATA_SIZE_LIMIT);
                            break;
                        case 13:
                            numValueOf = 131072;
                            break;
                        case 14:
                            numValueOf = 524288;
                            break;
                        case 15:
                            numValueOf = 2097152;
                            break;
                        case 16:
                            numValueOf = 8388608;
                            break;
                        case 17:
                            numValueOf = 33554432;
                            break;
                        case 18:
                            numValueOf = 1024;
                            break;
                        case 19:
                            numValueOf = 4096;
                            break;
                        case 20:
                            numValueOf = 16384;
                            break;
                        case 21:
                            numValueOf = 65536;
                            break;
                        case 22:
                            numValueOf = 262144;
                            break;
                        case 23:
                            numValueOf = 1048576;
                            break;
                        case 24:
                            numValueOf = 4194304;
                            break;
                        case 25:
                            numValueOf = 16777216;
                            break;
                        default:
                            numValueOf = null;
                            break;
                    }
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    return new Pair<>(Integer.valueOf(i10), numValueOf);
                }
                String strValueOf13 = String.valueOf(str8);
                Log.w("MediaCodecUtil", strValueOf13.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf13) : new String("Unknown HEVC level string: "));
                return null;
            case 5:
                String str9 = format.f13145OoooOOo;
                if (strArrSplit.length != 3) {
                    String strValueOf14 = String.valueOf(str9);
                    Log.w("MediaCodecUtil", strValueOf14.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf14) : new String("Ignoring malformed MP4A codec string: "));
                    return null;
                }
                try {
                    if (!"audio/mp4a-latm".equals(o0000O.OooO0OO(Integer.parseInt(strArrSplit[1], 16)))) {
                        return null;
                    }
                    int i20 = Integer.parseInt(strArrSplit[2]);
                    if (i20 != 17) {
                        if (i20 == 20) {
                            i12 = -1;
                            i11 = 20;
                        } else if (i20 == 23) {
                            i11 = 23;
                        } else if (i20 == 29) {
                            i11 = 29;
                        } else if (i20 == 39) {
                            i11 = 39;
                        } else if (i20 != 42) {
                            switch (i20) {
                                case 1:
                                    i12 = -1;
                                    i11 = 1;
                                    break;
                                case 2:
                                    i12 = -1;
                                    i11 = 2;
                                    break;
                                case 3:
                                    i12 = -1;
                                    i11 = 3;
                                    break;
                                case 4:
                                    i12 = -1;
                                    i11 = 4;
                                    break;
                                case 5:
                                    i12 = -1;
                                    i11 = 5;
                                    break;
                                case 6:
                                    i12 = -1;
                                    i11 = 6;
                                    break;
                                default:
                                    i12 = -1;
                                    i11 = -1;
                                    break;
                            }
                        } else {
                            i11 = 42;
                        }
                        if (i11 != i12) {
                            return new Pair<>(Integer.valueOf(i11), 0);
                        }
                        return null;
                    }
                    i11 = 17;
                    i12 = -1;
                    if (i11 != i12) {
                        return new Pair<>(Integer.valueOf(i11), 0);
                    }
                    return null;
                } catch (NumberFormatException unused3) {
                    String strValueOf15 = String.valueOf(str9);
                    Log.w("MediaCodecUtil", strValueOf15.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf15) : new String("Ignoring malformed MP4A codec string: "));
                    return null;
                }
            case 6:
                String str10 = format.f13145OoooOOo;
                if (strArrSplit.length < 3) {
                    String strValueOf16 = String.valueOf(str10);
                    Log.w("MediaCodecUtil", strValueOf16.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf16) : new String("Ignoring malformed VP9 codec string: "));
                    return null;
                }
                try {
                    int i21 = Integer.parseInt(strArrSplit[1]);
                    int i22 = Integer.parseInt(strArrSplit[2]);
                    if (i21 == 0) {
                        i13 = 1;
                    } else if (i21 == 1) {
                        i13 = 2;
                    } else if (i21 != 2) {
                        i13 = i21 != 3 ? -1 : 8;
                    } else {
                        i13 = 4;
                    }
                    if (i13 == -1) {
                        p468o0OooO0.o0O0O00.OooO00o(32, "Unknown VP9 profile: ", i21, "MediaCodecUtil");
                        return null;
                    }
                    if (i22 != 10) {
                        if (i22 != 11) {
                            if (i22 != 20) {
                                if (i22 != 21) {
                                    if (i22 != 30) {
                                        if (i22 != 31) {
                                            if (i22 != 40) {
                                                if (i22 != 41) {
                                                    if (i22 != 50) {
                                                        if (i22 != 51) {
                                                            switch (i22) {
                                                                case 60:
                                                                    i14 = RecyclerView.oo0o0Oo.FLAG_MOVED;
                                                                    break;
                                                                case 61:
                                                                    i14 = 4096;
                                                                    break;
                                                                case 62:
                                                                    i14 = 8192;
                                                                    break;
                                                                default:
                                                                    i14 = -1;
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        i14 = 256;
                                                    }
                                                } else {
                                                    i14 = 128;
                                                }
                                            } else {
                                                i14 = 64;
                                            }
                                        } else {
                                            i14 = 32;
                                        }
                                    } else {
                                        i14 = 16;
                                    }
                                } else {
                                    i14 = 8;
                                }
                            } else {
                                i14 = 4;
                            }
                        } else {
                            i14 = 2;
                        }
                    } else {
                        i14 = 1;
                    }
                    if (i14 != -1) {
                        return new Pair<>(Integer.valueOf(i13), Integer.valueOf(i14));
                    }
                    p468o0OooO0.o0O0O00.OooO00o(30, "Unknown VP9 level: ", i22, "MediaCodecUtil");
                    return null;
                } catch (NumberFormatException unused4) {
                    String strValueOf17 = String.valueOf(str10);
                    Log.w("MediaCodecUtil", strValueOf17.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf17) : new String("Ignoring malformed VP9 codec string: "));
                    return null;
                }
            default:
                return null;
        }
    }

    public static synchronized List<com.google.android.exoplayer2.mediacodec.OooO00o> OooO0Oo(String str, boolean z, boolean z2) throws DecoderQueryException {
        OooO00o oooO00o = new OooO00o(str, z, z2);
        HashMap<OooO00o, List<com.google.android.exoplayer2.mediacodec.OooO00o>> map = f14446OooO0O0;
        List<com.google.android.exoplayer2.mediacodec.OooO00o> list = map.get(oooO00o);
        if (list != null) {
            return list;
        }
        int i = o00.f36680OooO00o;
        ArrayList<com.google.android.exoplayer2.mediacodec.OooO00o> arrayListOooO0o0 = OooO0o0(oooO00o, i >= 21 ? new OooO0o(z, z2) : new OooO0OO());
        if (z && arrayListOooO0o0.isEmpty() && 21 <= i && i <= 23) {
            arrayListOooO0o0 = OooO0o0(oooO00o, new OooO0OO());
            if (!arrayListOooO0o0.isEmpty()) {
                String str2 = arrayListOooO0o0.get(0).f14453OooO00o;
                StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        OooO00o(str, arrayListOooO0o0);
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listUnmodifiableList = Collections.unmodifiableList(arrayListOooO0o0);
        map.put(oooO00o, listUnmodifiableList);
        return listUnmodifiableList;
    }

    @Nullable
    public static com.google.android.exoplayer2.mediacodec.OooO00o OooO0o() throws DecoderQueryException {
        List<com.google.android.exoplayer2.mediacodec.OooO00o> listOooO0Oo = OooO0Oo("audio/raw", false, false);
        if (listOooO0Oo.isEmpty()) {
            return null;
        }
        return listOooO0Oo.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    public static ArrayList<com.google.android.exoplayer2.mediacodec.OooO00o> OooO0o0(OooO00o oooO00o, OooO0O0 oooO0O0) throws DecoderQueryException {
        String strOooO0O0;
        String str;
        String str2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        try {
            ArrayList<com.google.android.exoplayer2.mediacodec.OooO00o> arrayList = new ArrayList<>();
            String str3 = oooO00o.f14448OooO00o;
            boolean zOooO0o0 = oooO0O0.OooO0o0();
            int i3 = 0;
            for (int iOooO0Oo = oooO0O0.OooO0Oo(); i3 < iOooO0Oo; iOooO0Oo = i2) {
                MediaCodecInfo mediaCodecInfoOooO00o = oooO0O0.OooO00o(i3);
                int i4 = o00.f36680OooO00o;
                if (!(i4 >= 29 && mediaCodecInfoOooO00o.isAlias())) {
                    String name = mediaCodecInfoOooO00o.getName();
                    if (OooO0oO(mediaCodecInfoOooO00o, name, zOooO0o0, str3) && (strOooO0O0 = OooO0O0(mediaCodecInfoOooO00o, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoOooO00o.getCapabilitiesForType(strOooO0O0);
                            boolean zOooO0O0 = oooO0O0.OooO0O0("tunneled-playback", strOooO0O0, capabilitiesForType);
                            boolean zOooO0OO = oooO0O0.OooO0OO("tunneled-playback", capabilitiesForType);
                            boolean z3 = oooO00o.f14450OooO0OO;
                            if ((z3 || !zOooO0OO) && (!z3 || zOooO0O0)) {
                                boolean zOooO0O1 = oooO0O0.OooO0O0("secure-playback", strOooO0O0, capabilitiesForType);
                                boolean zOooO0OO2 = oooO0O0.OooO0OO("secure-playback", capabilitiesForType);
                                boolean z4 = oooO00o.f14449OooO0O0;
                                if ((z4 || !zOooO0OO2) && (!z4 || zOooO0O1)) {
                                    if (i4 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoOooO00o.isHardwareAccelerated();
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                        zIsHardwareAccelerated = !OooO0oo(mediaCodecInfoOooO00o);
                                    }
                                    boolean zOooO0oo = OooO0oo(mediaCodecInfoOooO00o);
                                    if (i4 >= 29) {
                                        zIsVendor = mediaCodecInfoOooO00o.isVendor();
                                    } else {
                                        String strOooo0 = o00.Oooo0(mediaCodecInfoOooO00o.getName());
                                        zIsVendor = (strOooo0.startsWith("omx.google.") || strOooo0.startsWith("c2.android.") || strOooo0.startsWith("c2.google.")) ? false : true;
                                    }
                                    if (i4 <= 22) {
                                        String str4 = o00.f36683OooO0Oo;
                                        if ((!"ODROID-XU3".equals(str4) && !"Nexus 10".equals(str4)) || (!"OMX.Exynos.AVC.Decoder".equals(name) && !"OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                            z2 = false;
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    if (!(zOooO0o0 && oooO00o.f14449OooO0O0 == zOooO0O1) && (zOooO0o0 || oooO00o.f14449OooO0O0)) {
                                        str = strOooO0O0;
                                        str2 = name;
                                        i = i3;
                                        z = zOooO0o0;
                                        i2 = iOooO0Oo;
                                        if (!z && zOooO0O1) {
                                            arrayList.add(com.google.android.exoplayer2.mediacodec.OooO00o.OooO(String.valueOf(str2).concat(".secure"), str3, str, capabilitiesForType, zIsHardwareAccelerated, zOooO0oo, zIsVendor, z2, true));
                                            return arrayList;
                                        }
                                    } else {
                                        str = strOooO0O0;
                                        str2 = name;
                                        i = i3;
                                        z = zOooO0o0;
                                        i2 = iOooO0Oo;
                                        try {
                                            arrayList.add(com.google.android.exoplayer2.mediacodec.OooO00o.OooO(name, str3, strOooO0O0, capabilitiesForType, zIsHardwareAccelerated, zOooO0oo, zIsVendor, z2, false));
                                        } catch (Exception e) {
                                            e = e;
                                            if (o00.f36680OooO00o > 23 || arrayList.isEmpty()) {
                                                String str5 = str2;
                                                StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 25 + str.length());
                                                sb.append("Failed to query codec ");
                                                sb.append(str5);
                                                sb.append(" (");
                                                sb.append(str);
                                                sb.append(")");
                                                Log.e("MediaCodecUtil", sb.toString());
                                                throw e;
                                            }
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 46);
                                            sb2.append("Skipping codec ");
                                            sb2.append(str2);
                                            sb2.append(" (failed to query capabilities)");
                                            Log.e("MediaCodecUtil", sb2.toString());
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = strOooO0O0;
                            str2 = name;
                            i = i3;
                            z = zOooO0o0;
                            i2 = iOooO0Oo;
                        }
                    }
                    i3 = i + 1;
                    zOooO0o0 = z;
                }
                i = i3;
                z = zOooO0o0;
                i2 = iOooO0Oo;
                i3 = i + 1;
                zOooO0o0 = z;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new DecoderQueryException(e3);
        }
    }

    public static boolean OooO0oO(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = o00.f36680OooO00o;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = o00.f36681OooO0O0;
            if ("a70".equals(str3) || ("Xiaomi".equals(o00.f36682OooO0OO) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = o00.f36681OooO0O0;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = o00.f36681OooO0O0;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(o00.f36682OooO0OO))) {
            String str6 = o00.f36681OooO0O0;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(o00.f36682OooO0OO)) {
            String str7 = o00.f36681OooO0O0;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && o00.f36681OooO0O0.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean OooO0oo(MediaCodecInfo mediaCodecInfo) {
        if (o00.f36680OooO00o >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String strOooo0 = o00.Oooo0(mediaCodecInfo.getName());
        if (strOooo0.startsWith("arc.")) {
            return false;
        }
        return strOooo0.startsWith("omx.google.") || strOooo0.startsWith("omx.ffmpeg.") || (strOooo0.startsWith("omx.sec.") && strOooo0.contains(".sw.")) || strOooo0.equals("omx.qcom.video.decoder.hevcswvdec") || strOooo0.startsWith("c2.android.") || strOooo0.startsWith("c2.google.") || !(strOooo0.startsWith("omx.") || strOooo0.startsWith("c2."));
    }

    public static <T> void OooOO0(List<T> list, final OooO<T> oooO) {
        Collections.sort(list, new Comparator() { // from class: o0O0o00o.Oooo000
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MediaCodecUtil.OooO oooO2 = oooO;
                return oooO2.OooO00o(obj2) - oooO2.OooO00o(obj);
            }
        });
    }
}
