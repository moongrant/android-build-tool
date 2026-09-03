package androidx.media3.exoplayer.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.facebook.appevents.OooOOO;
import com.google.common.collect.ImmutableList;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O0O0.o000oOoO;
import o000O0O0.o0OoOo0;
import org.conscrypt.PSKKeyManager;
import p069o0000ooO.o0000;
import p069o0000ooO.o00000O0;
import p069o0000ooO.o000OO;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f7737OooO00o = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("MediaCodecUtil.class")
    public static final HashMap<OooO00o, List<androidx.media3.exoplayer.mediacodec.OooO0o>> f7738OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static int f7739OooO0OO = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    public interface OooO<T> {
        int OooO0OO(T t);
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f7740OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f7741OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f7742OooO0OO;

        public OooO00o(String str, boolean z, boolean z2) {
            this.f7740OooO00o = str;
            this.f7741OooO0O0 = z;
            this.f7742OooO0OO = z2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != OooO00o.class) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return TextUtils.equals(this.f7740OooO00o, oooO00o.f7740OooO00o) && this.f7741OooO0O0 == oooO00o.f7741OooO0O0 && this.f7742OooO0OO == oooO00o.f7742OooO0OO;
        }

        public final int hashCode() {
            return ((o0000.OooO00o(this.f7740OooO00o, 31, 31) + (this.f7741OooO0O0 ? 1231 : 1237)) * 31) + (this.f7742OooO0OO ? 1231 : 1237);
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
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final MediaCodecInfo OooO00o(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0O0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0OO(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final int OooO0Oo() {
            return MediaCodecList.getCodecCount();
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0o0() {
            return false;
        }
    }

    @RequiresApi(21)
    public static final class OooO0o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7743OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public MediaCodecInfo[] f7744OooO0O0;

        public OooO0o(boolean z, boolean z2) {
            this.f7743OooO00o = (z || z2) ? 1 : 0;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final MediaCodecInfo OooO00o(int i) {
            if (this.f7744OooO0O0 == null) {
                this.f7744OooO0O0 = new MediaCodecList(this.f7743OooO00o).getCodecInfos();
            }
            return this.f7744OooO0O0[i];
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0O0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0OO(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final int OooO0Oo() {
            if (this.f7744OooO0O0 == null) {
                this.f7744OooO0O0 = new MediaCodecList(this.f7743OooO00o).getCodecInfos();
            }
            return this.f7744OooO0O0.length;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.OooO0O0
        public final boolean OooO0o0() {
            return true;
        }
    }

    public static int OooO() throws DecoderQueryException {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        if (f7739OooO0OO == -1) {
            int iMax = 0;
            List<androidx.media3.exoplayer.mediacodec.OooO0o> listOooO0o0 = OooO0o0("video/avc", false, false);
            androidx.media3.exoplayer.mediacodec.OooO0o oooO0o = listOooO0o0.isEmpty() ? null : listOooO0o0.get(0);
            if (oooO0o != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = oooO0o.f7762OooO0Oo;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i2 = codecProfileLevelArr[iMax].level;
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
                            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                                i = 414720;
                                break;
                            case ConstantsKt.MINIMUM_BLOCK_SIZE /* 512 */:
                                i = 921600;
                                break;
                            case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                                i = 1310720;
                                break;
                            case 2048:
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
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
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
                iMax = Math.max(iMax2, o000OO00.f34965OooO00o >= 21 ? 345600 : 172800);
            }
            f7739OooO0OO = iMax;
        }
        return f7739OooO0OO;
    }

    public static void OooO00o(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (o000OO00.f34965OooO00o < 26 && o000OO00.f34966OooO0O0.equals("R9") && arrayList.size() == 1 && ((androidx.media3.exoplayer.mediacodec.OooO0o) arrayList.get(0)).f7759OooO00o.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(androidx.media3.exoplayer.mediacodec.OooO0o.OooO0oo("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new o0OoOo0(new o000oOoO()));
        }
        int i = o000OO00.f34965OooO00o;
        if (i < 21 && arrayList.size() > 1) {
            String str2 = ((androidx.media3.exoplayer.mediacodec.OooO0o) arrayList.get(0)).f7759OooO00o;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new o0OoOo0(new o00000O0()));
            }
        }
        if (i >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((androidx.media3.exoplayer.mediacodec.OooO0o) arrayList.get(0)).f7759OooO00o)) {
            return;
        }
        arrayList.add((androidx.media3.exoplayer.mediacodec.OooO0o) arrayList.remove(0));
    }

    @Nullable
    public static String OooO0O0(androidx.media3.common.OooOO0 oooOO1) {
        Pair<Integer, Integer> pairOooO0Oo;
        if ("audio/eac3-joc".equals(oooOO1.f6417OooOOOO)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(oooOO1.f6417OooOOOO) || (pairOooO0Oo = OooO0Oo(oooOO1)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairOooO0Oo.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    @Nullable
    public static String OooO0OO(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:133:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:149:0x0206  */
    /* JADX WARN: Code duplicated, block: B:186:0x0271  */
    /* JADX WARN: Code duplicated, block: B:243:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:244:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:272:0x035d A[PHI: r0
      0x035d: PHI (r0v28 int) = (r0v27 int), (r0v32 int), (r0v33 int), (r0v34 int), (r0v35 int), (r0v36 int) binds: [B:254:0x0334, B:256:0x0338, B:258:0x033c, B:260:0x0340, B:262:0x0344, B:264:0x0348] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:407:0x0518  */
    /* JADX WARN: Code duplicated, block: B:436:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104  */
    @Nullable
    public static Pair<Integer, Integer> OooO0Oo(androidx.media3.common.OooOO0 oooOO1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Integer numValueOf;
        int i10;
        int i11;
        int i12;
        int i13;
        Integer numValueOf2;
        Integer numValueOf3;
        String str = oooOO1.f6414OooOO0o;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(oooOO1.f6417OooOOOO);
        int i14 = ConstantsKt.MINIMUM_BLOCK_SIZE;
        int i15 = 4;
        String str2 = oooOO1.f6414OooOO0o;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                o000Oo0.o0OoOo0.OooO00o("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            } else {
                Matcher matcher = f7737OooO00o.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                numValueOf2 = 1;
                                break;
                            case "01":
                                numValueOf2 = 2;
                                break;
                            case "02":
                                numValueOf2 = 4;
                                break;
                            case "03":
                                numValueOf2 = 8;
                                break;
                            case "04":
                                numValueOf2 = 16;
                                break;
                            case "05":
                                numValueOf2 = 32;
                                break;
                            case "06":
                                numValueOf2 = 64;
                                break;
                            case "07":
                                numValueOf2 = 128;
                                break;
                            case "08":
                                numValueOf2 = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                break;
                            case "09":
                                numValueOf2 = Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE);
                                break;
                            default:
                                numValueOf2 = null;
                                break;
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 == null) {
                        o000Oo0.o0OoOo0.OooO00o("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3) {
                                case "01":
                                    numValueOf3 = 1;
                                    break;
                                case "02":
                                    numValueOf3 = 2;
                                    break;
                                case "03":
                                    numValueOf3 = 4;
                                    break;
                                case "04":
                                    numValueOf3 = 8;
                                    break;
                                case "05":
                                    numValueOf3 = 16;
                                    break;
                                case "06":
                                    numValueOf3 = 32;
                                    break;
                                case "07":
                                    numValueOf3 = 64;
                                    break;
                                case "08":
                                    numValueOf3 = 128;
                                    break;
                                case "09":
                                    numValueOf3 = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                    break;
                                case "10":
                                    numValueOf3 = Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE);
                                    break;
                                case "11":
                                    numValueOf3 = Integer.valueOf(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                                    break;
                                case "12":
                                    numValueOf3 = 2048;
                                    break;
                                case "13":
                                    numValueOf3 = 4096;
                                    break;
                                default:
                                    numValueOf3 = null;
                                    break;
                            }
                        } else {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            return new Pair<>(numValueOf2, numValueOf3);
                        }
                        o000Oo0.o0OoOo0.OooO00o("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                    }
                } else {
                    o000Oo0.o0OoOo0.OooO00o("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                }
            }
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "av01":
                if (strArrSplit.length < 4) {
                    o000Oo0.o0OoOo0.OooO00o("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        int i16 = Integer.parseInt(strArrSplit[1]);
                        int i17 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i18 = Integer.parseInt(strArrSplit[3]);
                        if (i16 != 0) {
                            OooOOO.OooO00o("Unknown AV1 profile: ", i16, "MediaCodecUtil");
                        } else if (i18 == 8 || i18 == 10) {
                            if (i18 == 8) {
                                i = 1;
                            } else {
                                androidx.media3.common.OooO0o oooO0o = oooOO1.f6429OooOoOO;
                                i = (oooO0o == null || !(oooO0o.f6370OooO0oO != null || (i2 = oooO0o.f6368OooO0o) == 7 || i2 == 6)) ? 2 : 4096;
                            }
                            switch (i17) {
                                case 0:
                                    i3 = -1;
                                    i4 = 1;
                                    break;
                                case 1:
                                    i14 = 2;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 2:
                                    i3 = -1;
                                    i4 = 4;
                                    break;
                                case 3:
                                    i14 = 8;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 4:
                                    i14 = 16;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 5:
                                    i14 = 32;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 6:
                                    i14 = 64;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 7:
                                    i14 = 128;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 8:
                                    i14 = 256;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 9:
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 10:
                                    i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 11:
                                    i3 = -1;
                                    i4 = 2048;
                                    break;
                                case 12:
                                    i3 = -1;
                                    i4 = 4096;
                                    break;
                                case 13:
                                    i14 = 8192;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 14:
                                    i14 = 16384;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 15:
                                    i14 = ShareRequest.THUMB_DATA_SIZE_LIMIT;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 16:
                                    i14 = 65536;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 17:
                                    i14 = 131072;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 18:
                                    i14 = 262144;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 19:
                                    i14 = 524288;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 20:
                                    i14 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 21:
                                    i14 = 2097152;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 22:
                                    i14 = Configuration.BLOCK_SIZE;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                case 23:
                                    i14 = 8388608;
                                    i3 = -1;
                                    i4 = i14;
                                    break;
                                default:
                                    i3 = -1;
                                    i4 = -1;
                                    break;
                            }
                            if (i4 != i3) {
                                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i4));
                            }
                            OooOOO.OooO00o("Unknown AV1 level: ", i17, "MediaCodecUtil");
                        } else {
                            OooOOO.OooO00o("Unknown AV1 bit depth: ", i18, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused) {
                        o000Oo0.o0OoOo0.OooO00o("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    o000Oo0.o0OoOo0.OooO00o("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i5 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i6 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (strArrSplit.length >= 3) {
                            i5 = Integer.parseInt(strArrSplit[1]);
                            i6 = Integer.parseInt(strArrSplit[2]);
                        } else {
                            Log.OooO0o("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
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
                            OooOOO.OooO00o("Unknown AVC profile: ", i5, "MediaCodecUtil");
                        } else {
                            switch (i6) {
                                case 10:
                                    i14 = 1;
                                    i8 = -1;
                                    break;
                                case 11:
                                    i14 = 4;
                                    i8 = -1;
                                    break;
                                case 12:
                                    i14 = 8;
                                    i8 = -1;
                                    break;
                                case 13:
                                    i14 = 16;
                                    i8 = -1;
                                    break;
                                default:
                                    switch (i6) {
                                        case 20:
                                            i14 = 32;
                                            i8 = -1;
                                            break;
                                        case 21:
                                            i14 = 64;
                                            i8 = -1;
                                            break;
                                        case 22:
                                            i14 = 128;
                                            i8 = -1;
                                            break;
                                        default:
                                            switch (i6) {
                                                case 30:
                                                    i14 = 256;
                                                    i8 = -1;
                                                    break;
                                                case 31:
                                                    i8 = -1;
                                                    break;
                                                case 32:
                                                    i14 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                                                    i8 = -1;
                                                    break;
                                                default:
                                                    switch (i6) {
                                                        case 40:
                                                            i8 = -1;
                                                            i14 = 2048;
                                                            break;
                                                        case 41:
                                                            i8 = -1;
                                                            i14 = 4096;
                                                            break;
                                                        case 42:
                                                            i14 = 8192;
                                                            i8 = -1;
                                                            break;
                                                        default:
                                                            switch (i6) {
                                                                case 50:
                                                                    i14 = 16384;
                                                                    i8 = -1;
                                                                    break;
                                                                case 51:
                                                                    i14 = ShareRequest.THUMB_DATA_SIZE_LIMIT;
                                                                    i8 = -1;
                                                                    break;
                                                                case 52:
                                                                    i14 = 65536;
                                                                    i8 = -1;
                                                                    break;
                                                                default:
                                                                    i8 = -1;
                                                                    i14 = -1;
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
                            if (i14 != i8) {
                                return new Pair<>(Integer.valueOf(i7), Integer.valueOf(i14));
                            }
                            OooOOO.OooO00o("Unknown AVC level: ", i6, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused2) {
                        o000Oo0.o0OoOo0.OooO00o("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    o000Oo0.o0OoOo0.OooO00o("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                } else {
                    Matcher matcher2 = f7737OooO00o.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i9 = 1;
                        } else if (FeedbackType.Suggestions.equals(strGroup2)) {
                            androidx.media3.common.OooO0o oooO0o2 = oooOO1.f6429OooOoOO;
                            i9 = (oooO0o2 == null || oooO0o2.f6368OooO0o != 6) ? 2 : 4096;
                        } else {
                            o000Oo0.o0OoOo0.OooO00o("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        }
                        String str5 = strArrSplit[3];
                        if (str5 != null) {
                            switch (str5) {
                                case "H30":
                                    numValueOf = 2;
                                    break;
                                case "H60":
                                    numValueOf = 8;
                                    break;
                                case "H63":
                                    numValueOf = 32;
                                    break;
                                case "H90":
                                    numValueOf = 128;
                                    break;
                                case "H93":
                                    numValueOf = Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE);
                                    break;
                                case "L30":
                                    numValueOf = 1;
                                    break;
                                case "L60":
                                    numValueOf = 4;
                                    break;
                                case "L63":
                                    numValueOf = 16;
                                    break;
                                case "L90":
                                    numValueOf = 64;
                                    break;
                                case "L93":
                                    numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                                    break;
                                case "H120":
                                    numValueOf = 2048;
                                    break;
                                case "H123":
                                    numValueOf = 8192;
                                    break;
                                case "H150":
                                    numValueOf = Integer.valueOf(ShareRequest.THUMB_DATA_SIZE_LIMIT);
                                    break;
                                case "H153":
                                    numValueOf = 131072;
                                    break;
                                case "H156":
                                    numValueOf = 524288;
                                    break;
                                case "H180":
                                    numValueOf = 2097152;
                                    break;
                                case "H183":
                                    numValueOf = 8388608;
                                    break;
                                case "H186":
                                    numValueOf = 33554432;
                                    break;
                                case "L120":
                                    numValueOf = Integer.valueOf(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                                    break;
                                case "L123":
                                    numValueOf = 4096;
                                    break;
                                case "L150":
                                    numValueOf = 16384;
                                    break;
                                case "L153":
                                    numValueOf = 65536;
                                    break;
                                case "L156":
                                    numValueOf = 262144;
                                    break;
                                case "L180":
                                    numValueOf = Integer.valueOf(ZegoConstants.ErrorMask.RoomServerErrorMask);
                                    break;
                                case "L183":
                                    numValueOf = Integer.valueOf(Configuration.BLOCK_SIZE);
                                    break;
                                case "L186":
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
                            return new Pair<>(Integer.valueOf(i9), numValueOf);
                        }
                        o000Oo0.o0OoOo0.OooO00o("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                    } else {
                        o000Oo0.o0OoOo0.OooO00o("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    o000Oo0.o0OoOo0.OooO00o("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(o000OO.OooO0Oo(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i19 = Integer.parseInt(strArrSplit[2]);
                            int i20 = 17;
                            if (i19 != 17) {
                                i20 = 20;
                                if (i19 != 20) {
                                    i20 = 23;
                                    if (i19 != 23) {
                                        i20 = 29;
                                        if (i19 != 29) {
                                            i20 = 39;
                                            if (i19 != 39) {
                                                i20 = 42;
                                                if (i19 != 42) {
                                                    switch (i19) {
                                                        case 1:
                                                            i15 = 1;
                                                            break;
                                                        case 2:
                                                            i15 = 2;
                                                            break;
                                                        case 3:
                                                            i10 = -1;
                                                            i11 = 3;
                                                            break;
                                                        case 4:
                                                            break;
                                                        case 5:
                                                            i10 = -1;
                                                            i11 = 5;
                                                            break;
                                                        case 6:
                                                            i10 = -1;
                                                            i11 = 6;
                                                            break;
                                                        default:
                                                            i10 = -1;
                                                            i11 = -1;
                                                            break;
                                                    }
                                                } else {
                                                    i15 = i20;
                                                }
                                                i10 = -1;
                                                i11 = i15;
                                            } else {
                                                i15 = i20;
                                                i10 = -1;
                                                i11 = i15;
                                            }
                                        } else {
                                            i15 = i20;
                                            i10 = -1;
                                            i11 = i15;
                                        }
                                    } else {
                                        i15 = i20;
                                        i10 = -1;
                                        i11 = i15;
                                    }
                                } else {
                                    i15 = i20;
                                    i10 = -1;
                                    i11 = i15;
                                }
                            } else {
                                i15 = i20;
                                i10 = -1;
                                i11 = i15;
                            }
                            if (i11 != i10) {
                                return new Pair<>(Integer.valueOf(i11), 0);
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        o000Oo0.o0OoOo0.OooO00o("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "vp09":
                if (strArrSplit.length < 3) {
                    o000Oo0.o0OoOo0.OooO00o("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        int i21 = Integer.parseInt(strArrSplit[1]);
                        int i22 = Integer.parseInt(strArrSplit[2]);
                        if (i21 == 0) {
                            i12 = 1;
                        } else if (i21 == 1) {
                            i12 = 2;
                        } else if (i21 != 2) {
                            i12 = i21 != 3 ? -1 : 8;
                        } else {
                            i12 = 4;
                        }
                        if (i12 == -1) {
                            OooOOO.OooO00o("Unknown VP9 profile: ", i21, "MediaCodecUtil");
                        } else {
                            if (i22 == 10) {
                                i14 = 1;
                            } else if (i22 == 11) {
                                i14 = 2;
                            } else if (i22 == 20) {
                                i14 = 4;
                            } else if (i22 == 21) {
                                i14 = 8;
                            } else if (i22 == 30) {
                                i14 = 16;
                            } else if (i22 == 31) {
                                i14 = 32;
                            } else if (i22 == 40) {
                                i14 = 64;
                            } else if (i22 == 41) {
                                i14 = 128;
                            } else if (i22 != 50) {
                                if (i22 != 51) {
                                    switch (i22) {
                                        case 60:
                                            i13 = -1;
                                            i14 = 2048;
                                            break;
                                        case 61:
                                            i13 = -1;
                                            i14 = 4096;
                                            break;
                                        case 62:
                                            i14 = 8192;
                                            break;
                                        default:
                                            i13 = -1;
                                            i14 = -1;
                                            break;
                                    }
                                }
                                if (i14 == i13) {
                                    return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i14));
                                }
                                OooOOO.OooO00o("Unknown VP9 level: ", i22, "MediaCodecUtil");
                            } else {
                                i14 = 256;
                            }
                            i13 = -1;
                            if (i14 == i13) {
                                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i14));
                            }
                            OooOOO.OooO00o("Unknown VP9 level: ", i22, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused4) {
                        o000Oo0.o0OoOo0.OooO00o("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static ArrayList<androidx.media3.exoplayer.mediacodec.OooO0o> OooO0o(OooO00o oooO00o, OooO0O0 oooO0O0) throws DecoderQueryException {
        String strOooO0OO;
        String str;
        String str2;
        int i;
        boolean z;
        boolean z2;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        OooO00o oooO00o2 = oooO00o;
        try {
            ArrayList<androidx.media3.exoplayer.mediacodec.OooO0o> arrayList = new ArrayList<>();
            String str3 = oooO00o2.f7740OooO00o;
            int iOooO0Oo = oooO0O0.OooO0Oo();
            boolean zOooO0o0 = oooO0O0.OooO0o0();
            int i2 = 0;
            while (i2 < iOooO0Oo) {
                MediaCodecInfo mediaCodecInfoOooO00o = oooO0O0.OooO00o(i2);
                int i3 = o000OO00.f34965OooO00o;
                if (!(i3 >= 29 && mediaCodecInfoOooO00o.isAlias())) {
                    String name = mediaCodecInfoOooO00o.getName();
                    if (OooO0oO(mediaCodecInfoOooO00o, name, zOooO0o0, str3) && (strOooO0OO = OooO0OO(mediaCodecInfoOooO00o, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoOooO00o.getCapabilitiesForType(strOooO0OO);
                            boolean zOooO0O0 = oooO0O0.OooO0O0("tunneled-playback", strOooO0OO, capabilitiesForType);
                            boolean zOooO0OO = oooO0O0.OooO0OO("tunneled-playback", capabilitiesForType);
                            boolean z3 = oooO00o2.f7742OooO0OO;
                            if ((z3 || !zOooO0OO) && (!z3 || zOooO0O0)) {
                                boolean zOooO0O1 = oooO0O0.OooO0O0("secure-playback", strOooO0OO, capabilitiesForType);
                                boolean zOooO0OO2 = oooO0O0.OooO0OO("secure-playback", capabilitiesForType);
                                boolean z4 = oooO00o2.f7741OooO0O0;
                                if ((z4 || !zOooO0OO2) && (!z4 || zOooO0O1)) {
                                    if (i3 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoOooO00o.isHardwareAccelerated();
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                        zIsHardwareAccelerated = !OooO0oo(mediaCodecInfoOooO00o, str3);
                                    }
                                    boolean zOooO0oo = OooO0oo(mediaCodecInfoOooO00o, str3);
                                    if (i3 >= 29) {
                                        zIsVendor = mediaCodecInfoOooO00o.isVendor();
                                    } else {
                                        String strOooO00o = com.google.common.base.OooO0OO.OooO00o(mediaCodecInfoOooO00o.getName());
                                        if (strOooO00o.startsWith("omx.google.") || strOooO00o.startsWith("c2.android.") || strOooO00o.startsWith("c2.google.")) {
                                            z2 = false;
                                        }
                                        zIsVendor = z2;
                                    }
                                    if (!(zOooO0o0 && z4 == zOooO0O1) && (zOooO0o0 || z4)) {
                                        str = strOooO0OO;
                                        str2 = name;
                                        i = i2;
                                        z = zOooO0o0;
                                        if (!z && zOooO0O1) {
                                            try {
                                                arrayList.add(androidx.media3.exoplayer.mediacodec.OooO0o.OooO0oo(str2 + ".secure", str3, str, capabilitiesForType, zIsHardwareAccelerated, zOooO0oo, zIsVendor, true));
                                                return arrayList;
                                            } catch (Exception e) {
                                                e = e;
                                                if (o000OO00.f34965OooO00o <= 23) {
                                                }
                                                Log.OooO0OO("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                    } else {
                                        str = strOooO0OO;
                                        i = i2;
                                        z = zOooO0o0;
                                        try {
                                            arrayList.add(androidx.media3.exoplayer.mediacodec.OooO0o.OooO0oo(name, str3, strOooO0OO, capabilitiesForType, zIsHardwareAccelerated, zOooO0oo, zIsVendor, false));
                                        } catch (Exception e2) {
                                            e = e2;
                                            str2 = name;
                                            if (o000OO00.f34965OooO00o <= 23 || arrayList.isEmpty()) {
                                                Log.OooO0OO("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            Log.OooO0OO("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        }
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str = strOooO0OO;
                            str2 = name;
                            i = i2;
                            z = zOooO0o0;
                        }
                    }
                    i2 = i + 1;
                    oooO00o2 = oooO00o;
                    zOooO0o0 = z;
                }
                i = i2;
                z = zOooO0o0;
                i2 = i + 1;
                oooO00o2 = oooO00o;
                zOooO0o0 = z;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new DecoderQueryException(e4);
        }
    }

    public static synchronized List<androidx.media3.exoplayer.mediacodec.OooO0o> OooO0o0(String str, boolean z, boolean z2) throws DecoderQueryException {
        OooO00o oooO00o = new OooO00o(str, z, z2);
        HashMap<OooO00o, List<androidx.media3.exoplayer.mediacodec.OooO0o>> map = f7738OooO0O0;
        List<androidx.media3.exoplayer.mediacodec.OooO0o> list = map.get(oooO00o);
        if (list != null) {
            return list;
        }
        int i = o000OO00.f34965OooO00o;
        ArrayList<androidx.media3.exoplayer.mediacodec.OooO0o> arrayListOooO0o = OooO0o(oooO00o, i >= 21 ? new OooO0o(z, z2) : new OooO0OO());
        if (z && arrayListOooO0o.isEmpty() && 21 <= i && i <= 23) {
            arrayListOooO0o = OooO0o(oooO00o, new OooO0OO());
            if (!arrayListOooO0o.isEmpty()) {
                Log.OooO0o("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListOooO0o.get(0).f7759OooO00o);
            }
        }
        OooO00o(str, arrayListOooO0o);
        ImmutableList immutableListOooOO0O = ImmutableList.OooOO0O(arrayListOooO0o);
        map.put(oooO00o, immutableListOooOO0O);
        return immutableListOooOO0O;
    }

    public static boolean OooO0oO(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = o000OO00.f34965OooO00o;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = o000OO00.f34966OooO0O0;
            if ("a70".equals(str3) || ("Xiaomi".equals(o000OO00.f34967OooO0OO) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = o000OO00.f34966OooO0O0;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = o000OO00.f34966OooO0O0;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(o000OO00.f34967OooO0OO))) {
            String str6 = o000OO00.f34966OooO0O0;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(o000OO00.f34967OooO0OO)) {
            String str7 = o000OO00.f34966OooO0O0;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && o000OO00.f34966OooO0O0.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean OooO0oo(MediaCodecInfo mediaCodecInfo, String str) {
        if (o000OO00.f34965OooO00o >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (o000OO.OooO0oo(str)) {
            return true;
        }
        String strOooO00o = com.google.common.base.OooO0OO.OooO00o(mediaCodecInfo.getName());
        if (strOooO00o.startsWith("arc.")) {
            return false;
        }
        if (strOooO00o.startsWith("omx.google.") || strOooO00o.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strOooO00o.startsWith("omx.sec.") && strOooO00o.contains(".sw.")) || strOooO00o.equals("omx.qcom.video.decoder.hevcswvdec") || strOooO00o.startsWith("c2.android.") || strOooO00o.startsWith("c2.google.")) {
            return true;
        }
        return (strOooO00o.startsWith("omx.") || strOooO00o.startsWith("c2.")) ? false : true;
    }
}
