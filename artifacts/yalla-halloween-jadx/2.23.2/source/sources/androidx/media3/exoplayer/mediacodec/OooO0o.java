package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.o00O0;
import androidx.compose.ui.platform.o00O0O0;
import androidx.compose.ui.platform.oo00o;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p004OooO0oO.o0OoOo0;
import p041Ooooo0o.o00000;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f7754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f7755OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f7756OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f7757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f7758OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f7759OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f7760OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f7761OooO0oo;

    @RequiresApi(29)
    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:18:0x003d  */
        @DoNotInline
        public static int OooO00o(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            boolean z;
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                String str = o00.f34911OooO0O0;
                if (str.equals("sabrina") || str.equals("boreal")) {
                    z = true;
                } else {
                    String str2 = o00.f34913OooO0Oo;
                    if (str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616")) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (!z) {
                    o00O0.OooO00o();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointOooO00o = oo00o.OooO00o(i, i2, (int) d);
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        if (o00O0O0.OooO00o(supportedPerformancePoints.get(i3)).covers(performancePointOooO00o)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        }
    }

    @VisibleForTesting
    public OooO0o(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f7754OooO00o = str;
        this.f7755OooO0O0 = str2;
        this.f7756OooO0OO = str3;
        this.f7757OooO0Oo = codecCapabilities;
        this.f7760OooO0oO = z;
        this.f7759OooO0o0 = z2;
        this.f7758OooO0o = z3;
        this.f7761OooO0oo = o0000oo.OooOO0(str2);
    }

    @RequiresApi(21)
    public static boolean OooO00o(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = o00.f34910OooO00o;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    public static OooO0o OooO0oo(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        if (codecCapabilities == null) {
            z5 = false;
        } else {
            int i = o00.f34910OooO00o;
            if (i >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i <= 22) {
                    String str4 = o00.f34913OooO0Oo;
                    if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (z7) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            } else {
                z5 = false;
            }
        }
        if (codecCapabilities != null && (o00.f34910OooO00o >= 21 && !codecCapabilities.isFeatureSupported("tunneled-playback"))) {
        }
        if (z4) {
            z6 = true;
        } else {
            if (codecCapabilities != null) {
                if (o00.f34910OooO00o >= 21 && codecCapabilities.isFeatureSupported("secure-playback")) {
                    z6 = true;
                }
            }
            z6 = false;
        }
        return new OooO0o(str, str2, str3, codecCapabilities, z, z5, z6);
    }

    public final DecoderReuseEvaluation OooO0O0(androidx.media3.common.OooOO0 oooOO1, androidx.media3.common.OooOO0 oooOO2) {
        boolean z = false;
        int i = !o00.OooO00o(oooOO1.f6412OooOOOO, oooOO2.f6412OooOOOO) ? 8 : 0;
        if (this.f7761OooO0oo) {
            if (oooOO1.f6421OooOo0o != oooOO2.f6421OooOo0o) {
                i |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            if (!this.f7759OooO0o0 && (oooOO1.f6419OooOo00 != oooOO2.f6419OooOo00 || oooOO1.f6418OooOo0 != oooOO2.f6418OooOo0)) {
                i |= ConstantsKt.MINIMUM_BLOCK_SIZE;
            }
            if (!o00.OooO00o(oooOO1.f6424OooOoOO, oooOO2.f6424OooOoOO)) {
                i |= 2048;
            }
            if (o00.f34913OooO0Oo.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f7754OooO00o)) {
                z = true;
            }
            if (z && !oooOO1.OooO0o0(oooOO2)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f7754OooO00o, oooOO1, oooOO2, oooOO1.OooO0o0(oooOO2) ? 3 : 2, 0);
            }
        } else {
            if (oooOO1.f6426OooOoo0 != oooOO2.f6426OooOoo0) {
                i |= 4096;
            }
            if (oooOO1.f6425OooOoo != oooOO2.f6425OooOoo) {
                i |= 8192;
            }
            if (oooOO1.f6427OooOooO != oooOO2.f6427OooOooO) {
                i |= 16384;
            }
            String str = this.f7755OooO0O0;
            if (i == 0 && "audio/mp4a-latm".equals(str)) {
                Pair<Integer, Integer> pairOooO0Oo = MediaCodecUtil.OooO0Oo(oooOO1);
                Pair<Integer, Integer> pairOooO0Oo2 = MediaCodecUtil.OooO0Oo(oooOO2);
                if (pairOooO0Oo != null && pairOooO0Oo2 != null) {
                    int iIntValue = ((Integer) pairOooO0Oo.first).intValue();
                    int iIntValue2 = ((Integer) pairOooO0Oo2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.f7754OooO00o, oooOO1, oooOO2, 3, 0);
                    }
                }
            }
            if (!oooOO1.OooO0o0(oooOO2)) {
                i |= 32;
            }
            if ("audio/opus".equals(str)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.f7754OooO00o, oooOO1, oooOO2, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.f7754OooO00o, oooOO1, oooOO2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x00fe  */
    public final boolean OooO0OO(androidx.media3.common.OooOO0 oooOO1, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair<Integer, Integer> pairOooO0Oo = MediaCodecUtil.OooO0Oo(oooOO1);
        if (pairOooO0Oo == null) {
            return true;
        }
        int iIntValue = ((Integer) pairOooO0Oo.first).intValue();
        int iIntValue2 = ((Integer) pairOooO0Oo.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(oooOO1.f6412OooOOOO);
        int i = 8;
        String str = this.f7755OooO0O0;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.f7761OooO0oo && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7757OooO0Oo;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (o00.f34910OooO00o <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            } else if (iIntValue3 >= 120000000) {
                i = ConstantsKt.MINIMUM_BLOCK_SIZE;
            } else if (iIntValue3 >= 60000000) {
                i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 < 3600000) {
                i = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = o00.f34911OooO0O0;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return true;
                }
            }
        }
        OooO0oO("codec.profileLevel, " + oooOO1.f6409OooOO0o + ", " + this.f7756OooO0OO);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final boolean OooO0Oo(androidx.media3.common.OooOO0 oooOO1) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i;
        boolean z2;
        int i2;
        String str = oooOO1.f6412OooOOOO;
        String str2 = this.f7755OooO0O0;
        if (!(str2.equals(str) || str2.equals(MediaCodecUtil.OooO0O0(oooOO1))) || !OooO0OO(oooOO1, true)) {
            return false;
        }
        if (this.f7761OooO0oo) {
            int i3 = oooOO1.f6419OooOo00;
            if (i3 <= 0 || (i2 = oooOO1.f6418OooOo0) <= 0) {
                return true;
            }
            if (o00.f34910OooO00o >= 21) {
                return OooO0o(oooOO1.f6420OooOo0O, i3, i2);
            }
            boolean z3 = i3 * i2 <= MediaCodecUtil.OooO();
            if (!z3) {
                OooO0oO("legacyFrameSize, " + i3 + "x" + i2);
            }
            return z3;
        }
        int i4 = o00.f34910OooO00o;
        if (i4 >= 21) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7757OooO0Oo;
            int i5 = oooOO1.f6425OooOoo;
            if (i5 != -1) {
                if (codecCapabilities == null) {
                    OooO0oO("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        OooO0oO("sampleRate.aCaps");
                    } else {
                        if (audioCapabilities.isSampleRateSupported(i5)) {
                            z2 = true;
                        } else {
                            OooO0oO("sampleRate.support, " + i5);
                        }
                        if (!z2) {
                            return false;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                    return false;
                }
            }
            int i6 = oooOO1.f6426OooOoo0;
            if (i6 != -1) {
                if (codecCapabilities == null) {
                    OooO0oO("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        OooO0oO("channelCount.aCaps");
                    } else {
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            Log.OooO0o("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f7754OooO00o + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i6) {
                            OooO0oO("channelCount.support, " + i6);
                        } else {
                            z = true;
                        }
                        if (!z) {
                            return false;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    @RequiresApi(21)
    public final boolean OooO0o(double d, int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7757OooO0Oo;
        if (codecCapabilities == null) {
            OooO0oO("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            OooO0oO("sizeAndRate.vCaps");
            return false;
        }
        if (o00.f34910OooO00o >= 29) {
            int iOooO00o = OooO00o.OooO00o(videoCapabilities, i, i2, d);
            if (iOooO00o == 2) {
                return true;
            }
            if (iOooO00o == 1) {
                StringBuilder sbOooO00o = o00000.OooO00o("sizeAndRate.cover, ", i, "x", i2, "@");
                sbOooO00o.append(d);
                OooO0oO(sbOooO00o.toString());
                return false;
            }
        }
        if (!OooO00o(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.f7754OooO00o;
                if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(o00.f34911OooO0O0)) ? false : true) && OooO00o(videoCapabilities, i2, i, d)) {
                    StringBuilder sbOooO00o2 = o00000.OooO00o("sizeAndRate.rotated, ", i, "x", i2, "@");
                    sbOooO00o2.append(d);
                    StringBuilder sbOooO00o3 = androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO00o("AssumedSupport [", sbOooO00o2.toString(), "] [", str, ", ");
                    sbOooO00o3.append(this.f7755OooO0O0);
                    sbOooO00o3.append("] [");
                    sbOooO00o3.append(o00.f34915OooO0o0);
                    sbOooO00o3.append("]");
                    Log.OooO0O0("MediaCodecInfo", sbOooO00o3.toString());
                }
            }
            StringBuilder sbOooO00o4 = o00000.OooO00o("sizeAndRate.support, ", i, "x", i2, "@");
            sbOooO00o4.append(d);
            OooO0oO(sbOooO00o4.toString());
            return false;
        }
        return true;
    }

    public final boolean OooO0o0(androidx.media3.common.OooOO0 oooOO1) {
        if (this.f7761OooO0oo) {
            return this.f7759OooO0o0;
        }
        Pair<Integer, Integer> pairOooO0Oo = MediaCodecUtil.OooO0Oo(oooOO1);
        return pairOooO0Oo != null && ((Integer) pairOooO0Oo.first).intValue() == 42;
    }

    public final void OooO0oO(String str) {
        StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("NoSupport [", str, "] [");
        sbOooO0O0.append(this.f7754OooO00o);
        sbOooO0O0.append(", ");
        sbOooO0O0.append(this.f7755OooO0O0);
        sbOooO0O0.append("] [");
        sbOooO0O0.append(o00.f34915OooO0o0);
        sbOooO0O0.append("]");
        Log.OooO0O0("MediaCodecInfo", sbOooO0O0.toString());
    }

    public final String toString() {
        return this.f7754OooO00o;
    }
}
