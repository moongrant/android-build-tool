package com.zego.ve;

import OooO00o.OooO00o;
import android.annotation.TargetApi;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.Scopes;
import com.umeng.analytics.pro.ak;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 2.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 10;
    private static final int COLOR_FormatYUV420Flexible = 2135033992;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final String[] H264_HW_EXCEPTION_MODELS;
    private static final String H264_MIME_TYPE = "video/avc";
    private static final String[] H265_HW_EXCEPTION_MODELS;
    private static final String HEVC_MIME_TYPE = "video/hevc";
    private static final String[] HW_BLACKLISTS;
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "MediaCodecVideoEncoder";
    private static final int VIDEO_ControlRateConstant = 2;
    private static final int VIDEO_ControlRateVariable = 1;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static final MediaCodecProperties amlogicH264HwProperties;
    private static int codecErrors;
    private static boolean enableWhitelist;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosHEVCHwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties;
    private static final MediaCodecProperties freescaleH264HwProperties;
    private static final MediaCodecProperties[] h264HwList;
    private static final MediaCodecProperties[] hevcHwList;
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelH264HwProperties;
    private static final MediaCodecProperties intelVp8HwProperties;
    private static final MediaCodecProperties kirin960H264HwProperties;
    private static final MediaCodecProperties kirin960HEVCHwProperties;
    private static final MediaCodecProperties kirinH264HwProperties;
    private static final MediaCodecProperties kirinHEVCHwProperties;
    private static final MediaCodecProperties mstarH264HwProperties;
    private static final MediaCodecProperties mtkH264HwProperties;
    private static final MediaCodecProperties mtkHEVCHwProperties;
    private static final MediaCodecProperties nvidiaH264HwProperties;
    private static final MediaCodecProperties qcomH264HwProperties;
    private static final MediaCodecProperties qcomHEVCHwProperties;
    private static final MediaCodecProperties qcomVp8HwProperties;
    private static final MediaCodecProperties rkH264HwProperties;
    private static MediaCodecVideoEncoder runningInstance;
    private static final MediaCodecProperties sprdH264HwProperties;
    private static final int[] supportedColorList;
    private static final int[] supportedSurfaceColorList;
    private static final MediaCodecProperties tiH264HwProperties;
    private static final MediaCodecProperties[] vp8HwList;
    private static final MediaCodecProperties winnerH264HwProperties;
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private long forcedKeyFrameMs;
    private int height;
    private ByteBuffer[] inputBuffers;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    private MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private int originFps;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private ByteBuffer configData = null;
    private VImage cacheImage = new VImage();

    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;
        public final boolean supportedCBR;
        public final boolean supportedHighProfile;
        public final boolean supportedProfile;

        public EncoderProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType, boolean z, boolean z2, boolean z3) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
            this.supportedCBR = z;
            this.supportedProfile = z2;
            this.supportedHighProfile = z3;
        }
    }

    public static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        public MediaCodecProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    public static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;
        public final int size;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, int i2, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.size = i2;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
        }
    }

    public static class VImage {
        private boolean isI420;
        private ByteBuffer uBuffer;
        private int uStride;
        private ByteBuffer vBuffer;
        private int vStride;
        private ByteBuffer yBuffer;
        private int yStride;

        private VImage() {
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_H264_AVC,
        VIDEO_CODEC_H264_AVC_MULTILAYER,
        VIDEO_CODEC_H265,
        VIDEO_CODEC_VP8
    }

    static {
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        qcomVp8HwProperties = mediaCodecProperties;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties("OMX.Exynos.", 23, bitrateAdjustmentType);
        exynosVp8HwProperties = mediaCodecProperties2;
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties("OMX.Intel.", 21, bitrateAdjustmentType);
        intelVp8HwProperties = mediaCodecProperties3;
        vp8HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2, mediaCodecProperties3};
        MediaCodecProperties mediaCodecProperties4 = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        qcomH264HwProperties = mediaCodecProperties4;
        MediaCodecProperties mediaCodecProperties5 = new MediaCodecProperties("OMX.Exynos.", 21, bitrateAdjustmentType);
        exynosH264HwProperties = mediaCodecProperties5;
        MediaCodecProperties mediaCodecProperties6 = new MediaCodecProperties("OMX.MTK.", 19, bitrateAdjustmentType);
        mtkH264HwProperties = mediaCodecProperties6;
        MediaCodecProperties mediaCodecProperties7 = new MediaCodecProperties("OMX.IMG.", 19, bitrateAdjustmentType);
        kirinH264HwProperties = mediaCodecProperties7;
        MediaCodecProperties mediaCodecProperties8 = new MediaCodecProperties("OMX.rk.", 19, bitrateAdjustmentType);
        rkH264HwProperties = mediaCodecProperties8;
        MediaCodecProperties mediaCodecProperties9 = new MediaCodecProperties("OMX.hisi.", 19, bitrateAdjustmentType);
        kirin960H264HwProperties = mediaCodecProperties9;
        MediaCodecProperties mediaCodecProperties10 = new MediaCodecProperties("OMX.allwinner.", 19, bitrateAdjustmentType);
        winnerH264HwProperties = mediaCodecProperties10;
        MediaCodecProperties mediaCodecProperties11 = new MediaCodecProperties("OMX.TI.", 19, bitrateAdjustmentType);
        tiH264HwProperties = mediaCodecProperties11;
        MediaCodecProperties mediaCodecProperties12 = new MediaCodecProperties("OMX.MS.", 19, bitrateAdjustmentType);
        mstarH264HwProperties = mediaCodecProperties12;
        MediaCodecProperties mediaCodecProperties13 = new MediaCodecProperties("OMX.Freescale.", 19, bitrateAdjustmentType);
        freescaleH264HwProperties = mediaCodecProperties13;
        MediaCodecProperties mediaCodecProperties14 = new MediaCodecProperties("OMX.sprd.", 19, bitrateAdjustmentType);
        sprdH264HwProperties = mediaCodecProperties14;
        MediaCodecProperties mediaCodecProperties15 = new MediaCodecProperties("OMX.amlogic.", 19, bitrateAdjustmentType);
        amlogicH264HwProperties = mediaCodecProperties15;
        MediaCodecProperties mediaCodecProperties16 = new MediaCodecProperties("OMX.Intel.", 19, bitrateAdjustmentType);
        intelH264HwProperties = mediaCodecProperties16;
        MediaCodecProperties mediaCodecProperties17 = new MediaCodecProperties("OMX.Nvidia.", 19, bitrateAdjustmentType);
        nvidiaH264HwProperties = mediaCodecProperties17;
        h264HwList = new MediaCodecProperties[]{mediaCodecProperties4, mediaCodecProperties5, mediaCodecProperties6, mediaCodecProperties7, mediaCodecProperties9, mediaCodecProperties11, mediaCodecProperties16, mediaCodecProperties17, mediaCodecProperties8, mediaCodecProperties10, mediaCodecProperties12, mediaCodecProperties13, mediaCodecProperties14, mediaCodecProperties15};
        MediaCodecProperties mediaCodecProperties18 = new MediaCodecProperties("OMX.qcom.", 21, bitrateAdjustmentType);
        qcomHEVCHwProperties = mediaCodecProperties18;
        MediaCodecProperties mediaCodecProperties19 = new MediaCodecProperties("OMX.hisi.", 21, bitrateAdjustmentType);
        kirin960HEVCHwProperties = mediaCodecProperties19;
        MediaCodecProperties mediaCodecProperties20 = new MediaCodecProperties("OMX.IMG.", 21, bitrateAdjustmentType);
        kirinHEVCHwProperties = mediaCodecProperties20;
        MediaCodecProperties mediaCodecProperties21 = new MediaCodecProperties("OMX.MTK.", 21, bitrateAdjustmentType);
        mtkHEVCHwProperties = mediaCodecProperties21;
        MediaCodecProperties mediaCodecProperties22 = new MediaCodecProperties("OMX.Exynos.", 21, bitrateAdjustmentType);
        exynosHEVCHwProperties = mediaCodecProperties22;
        hevcHwList = new MediaCodecProperties[]{mediaCodecProperties18, mediaCodecProperties19, mediaCodecProperties20, mediaCodecProperties21, mediaCodecProperties22};
        H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "EML-AL00", "XT1079", "PACM00", "SM-G9250", "V1818CA"};
        H265_HW_EXCEPTION_MODELS = new String[]{"V1818CA", "X600"};
        enableWhitelist = true;
        HW_BLACKLISTS = new String[]{"omx.google.", "omx.ffmpeg.", "omx.pv", "omx.k3.ffmpeg.", "omx.avcodec.", "omx.ittiam.", "omx.sec.avc.sw.", "omx.marvell.video.h264encoder"};
        supportedColorList = new int[]{21, COLOR_FormatYUV420Flexible, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m, 19, 20, 2130706688, 2130708361};
        supportedSurfaceColorList = new int[]{2130708361};
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MediaCodecVideoEncoder previously operated on ");
        sbOooO0o0.append(this.mediaCodecThread);
        sbOooO0o0.append(" but is now called on ");
        sbOooO0o0.append(Thread.currentThread());
        throw new RuntimeException(sbOooO0o0.toString());
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void disableH264HwCodec() {
        android.util.Log.w(TAG, "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableHEVCHwCodec() {
        android.util.Log.w(TAG, "HEVC encoding is disabled by application.");
        hwEncoderDisabledTypes.add(HEVC_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        android.util.Log.w(TAG, "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        android.util.Log.w(TAG, "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo codecInfoAt;
        String name;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zIsFormatSupported;
        EncoderProperties encoderProperties = null;
        if (str.equals(H264_MIME_TYPE)) {
            List listAsList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
            String str2 = Build.MODEL;
            if (listAsList.contains(str2)) {
                android.util.Log.w(TAG, "Model: " + str2 + " has black listed H.264 encoder.");
                return null;
            }
        } else if (str.equals(HEVC_MIME_TYPE)) {
            List listAsList2 = Arrays.asList(H265_HW_EXCEPTION_MODELS);
            String str3 = Build.MODEL;
            if (listAsList2.contains(str3)) {
                android.util.Log.w(TAG, "Model: " + str3 + " has black listed H.265 encoder.");
                return null;
            }
        }
        int i = 0;
        while (i < MediaCodecList.getCodecCount()) {
            try {
                try {
                    codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException e) {
                    android.util.Log.e(TAG, "Cannot retrieve encoder codec info", e);
                    codecInfoAt = encoderProperties;
                }
                if (codecInfoAt != 0 && codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            name = encoderProperties;
                            break;
                        }
                        if (supportedTypes[i2].equals(str)) {
                            name = codecInfoAt.getName();
                            break;
                        }
                        i2++;
                    }
                    if (name != 0) {
                        android.util.Log.d(TAG, "Found candidate encoder " + name);
                        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                        if (enableWhitelist) {
                            int length2 = mediaCodecPropertiesArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    z2 = false;
                                    break;
                                }
                                MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i3];
                                if (name.startsWith(mediaCodecProperties.codecPrefix)) {
                                    int i4 = Build.VERSION.SDK_INT;
                                    if (i4 >= mediaCodecProperties.minSdk) {
                                        BitrateAdjustmentType bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                        if (bitrateAdjustmentType2 != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                            android.util.Log.w(TAG, "Codec " + name + " requires bitrate adjustment: " + bitrateAdjustmentType2);
                                            bitrateAdjustmentType = bitrateAdjustmentType2;
                                        }
                                        z2 = true;
                                        break;
                                    }
                                    android.util.Log.w(TAG, "Codec " + name + " is disabled due to SDK version " + i4);
                                }
                                i3++;
                            }
                        } else {
                            String lowerCase = name.toLowerCase();
                            String[] strArr = HW_BLACKLISTS;
                            int length3 = strArr.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= length3) {
                                    z = false;
                                    break;
                                }
                                if (lowerCase.startsWith(strArr[i5])) {
                                    z = true;
                                    break;
                                }
                                i5++;
                            }
                            z2 = !z;
                        }
                        if (z2) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                                for (int i6 : capabilitiesForType.colorFormats) {
                                    android.util.Log.d(TAG, "Color: 0x" + Integer.toHexString(i6));
                                }
                                for (int i7 : iArr) {
                                    for (int i8 : capabilitiesForType.colorFormats) {
                                        if (i8 == i7) {
                                            android.util.Log.d(TAG, "Found target encoder for mime " + str + " : " + name + ". Color: 0x" + Integer.toHexString(i8) + ". Bitrate adjustment: " + bitrateAdjustmentType);
                                            int i9 = Build.VERSION.SDK_INT;
                                            MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
                                            if (encoderCapabilities == null || !encoderCapabilities.isBitrateModeSupported(2)) {
                                                z3 = false;
                                            } else {
                                                android.util.Log.d(TAG, "is CBR Mode supported");
                                                z3 = true;
                                            }
                                            if (i9 < 23 || !str.equals(H264_MIME_TYPE)) {
                                                z4 = false;
                                                zIsFormatSupported = false;
                                            } else {
                                                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, 640, 480);
                                                mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, 1);
                                                boolean zIsFormatSupported2 = capabilitiesForType.isFormatSupported(mediaFormatCreateVideoFormat);
                                                mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, 8);
                                                zIsFormatSupported = capabilitiesForType.isFormatSupported(mediaFormatCreateVideoFormat);
                                                z4 = zIsFormatSupported2;
                                            }
                                            return new EncoderProperties(name, i8, bitrateAdjustmentType, z3, z4, zIsFormatSupported);
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException e2) {
                                android.util.Log.e(TAG, "Cannot retrieve encoder capabilities", e2);
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i++;
                encoderProperties = null;
            } catch (Exception unused) {
                printStackTrace();
                return null;
            }
        }
        return encoderProperties;
    }

    private double getBitrateScale(int i) {
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, ((double) i) / 10.0d);
    }

    public static String getCodecName() {
        return findHwEncoder(H264_MIME_TYPE, h264HwList, supportedColorList).codecName;
    }

    private int getProfileType(String str, int i, int i2) {
        int i3 = 8;
        if (i != 0) {
            i2 = 8;
        }
        if (str.equals("main")) {
            i3 = 2;
        } else if (!str.equals("high")) {
            if (str.equals("high10")) {
                i3 = 16;
            } else if (str.equals("high422")) {
                i3 = 32;
            } else if (str.equals("high444")) {
                i3 = 64;
            } else {
                i3 = str.equals("extended") ? 4 : i2;
            }
        }
        android.util.Log.d(TAG, "profile: " + str + ", " + i3);
        return i3;
    }

    public static boolean isH264HwSupported(boolean z) {
        enableWhitelist = z;
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HwList, supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isHEVCHwSupported(boolean z) {
        enableWhitelist = z;
        return (hwEncoderDisabledTypes.contains(HEVC_MIME_TYPE) || findHwEncoder(HEVC_MIME_TYPE, hevcHwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupported(boolean z) {
        return false;
    }

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            android.util.Log.d(TAG, "MediaCodecVideoEncoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                android.util.Log.d(TAG, stackTraceElement.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009a  */
    private void reportEncodedFrame(int i) {
        int i2 = this.targetFps;
        if (i2 == 0 || this.bitrateAdjustmentType != BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            return;
        }
        double d = (((double) i) - (((double) this.targetBitrateBps) / (((double) i2) * 8.0d))) + this.bitrateAccumulator;
        this.bitrateAccumulator = d;
        this.bitrateObservationTimeMs = (1000.0d / ((double) i2)) + this.bitrateObservationTimeMs;
        double d2 = this.bitrateAccumulatorMax * BITRATE_CORRECTION_SEC;
        double dMin = Math.min(d, d2);
        this.bitrateAccumulator = dMin;
        this.bitrateAccumulator = Math.max(dMin, -d2);
        if (this.bitrateObservationTimeMs > 3000.0d) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Acc: ");
            sbOooO0o0.append((int) this.bitrateAccumulator);
            sbOooO0o0.append(". Max: ");
            sbOooO0o0.append((int) this.bitrateAccumulatorMax);
            sbOooO0o0.append(". ExpScale: ");
            sbOooO0o0.append(this.bitrateAdjustmentScaleExp);
            android.util.Log.d(TAG, sbOooO0o0.toString());
            boolean z = false;
            double d3 = this.bitrateAccumulator;
            double d4 = this.bitrateAccumulatorMax;
            if (d3 <= d4) {
                if (d3 < (-d4)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-d3) / d4) + 0.5d);
                    this.bitrateAccumulator = -d4;
                }
                if (z) {
                    int iMin = Math.min(this.bitrateAdjustmentScaleExp, 10);
                    this.bitrateAdjustmentScaleExp = iMin;
                    this.bitrateAdjustmentScaleExp = Math.max(iMin, -10);
                    StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Adjusting bitrate scale to ");
                    sbOooO0o1.append(this.bitrateAdjustmentScaleExp);
                    sbOooO0o1.append(". Value: ");
                    sbOooO0o1.append(getBitrateScale(this.bitrateAdjustmentScaleExp));
                    android.util.Log.d(TAG, sbOooO0o1.toString());
                    setRates(this.targetBitrateBps / 1000, this.targetFps);
                }
                this.bitrateObservationTimeMs = 0.0d;
            }
            this.bitrateAdjustmentScaleExp -= (int) ((d3 / d4) + 0.5d);
            this.bitrateAccumulator = d4;
            z = true;
            if (z) {
                int iMin2 = Math.min(this.bitrateAdjustmentScaleExp, 10);
                this.bitrateAdjustmentScaleExp = iMin2;
                this.bitrateAdjustmentScaleExp = Math.max(iMin2, -10);
                StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Adjusting bitrate scale to ");
                sbOooO0o2.append(this.bitrateAdjustmentScaleExp);
                sbOooO0o2.append(". Value: ");
                sbOooO0o2.append(getBitrateScale(this.bitrateAdjustmentScaleExp));
                android.util.Log.d(TAG, sbOooO0o2.toString());
                setRates(this.targetBitrateBps / 1000, this.targetFps);
            }
            this.bitrateObservationTimeMs = 0.0d;
        }
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        android.util.Log.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    private boolean setRates(int i, int i2) {
        checkOnMediaCodecThread();
        BitrateAdjustmentType bitrateAdjustmentType = this.bitrateAdjustmentType;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            double d = i;
            this.bitrateAccumulatorMax = d / 8.0d;
            int i3 = this.targetBitrateBps;
            if (i3 > 0 && i < i3) {
                this.bitrateAccumulator = (this.bitrateAccumulator * d) / ((double) i3);
            }
        }
        this.targetBitrateBps = i;
        this.targetFps = i2;
        if (bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && i2 > 0) {
            int i4 = (this.originFps * i) / i2;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("setRates: ");
            sbOooO0o0.append(i / 1000);
            sbOooO0o0.append(" -> ");
            sbOooO0o0.append(i4 / 1000);
            sbOooO0o0.append(" kbps. Fps: ");
            sbOooO0o0.append(this.targetFps);
            android.util.Log.v(TAG, sbOooO0o0.toString());
            i = i4;
        } else if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("setRates: ");
            sbOooO0o1.append(i / 1000);
            sbOooO0o1.append(" kbps. Fps: ");
            sbOooO0o1.append(this.targetFps);
            sbOooO0o1.append(". ExpScale: ");
            sbOooO0o1.append(this.bitrateAdjustmentScaleExp);
            android.util.Log.v(TAG, sbOooO0o1.toString());
            int i5 = this.bitrateAdjustmentScaleExp;
            if (i5 != 0) {
                i = (int) (((double) i) * getBitrateScale(i5));
            }
        } else {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("setRates: ");
            sbOooO0o2.append(i / 1000);
            sbOooO0o2.append(" kbps. Fps: ");
            sbOooO0o2.append(this.targetFps);
            android.util.Log.v(TAG, sbOooO0o2.toString());
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "setRates failed", e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public void checkKeyFrameRequired(boolean z, long j) {
        boolean z2;
        long j2 = (j + 500) / 1000;
        if (this.lastKeyFrameMs < 0) {
            this.lastKeyFrameMs = j2;
        }
        if (z) {
            z2 = false;
        } else {
            long j3 = this.forcedKeyFrameMs;
            if (j3 <= 0 || j2 <= this.lastKeyFrameMs + j3) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z || z2) {
            if (z) {
                android.util.Log.d(TAG, "Sync frame request");
            } else {
                android.util.Log.d(TAG, "Sync frame forced");
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
            this.lastKeyFrameMs = j2;
        }
    }

    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("dequeueIntputBuffer failed");
            sbOooO0o0.append(e.getMessage());
            android.util.Log.e(TAG, sbOooO0o0.toString());
            return -2;
        }
    }

    public OutputBufferInfo dequeueOutputBuffer() {
        checkOnMediaCodecThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    android.util.Log.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    ByteBuffer byteBuffer = getByteBuffer(false, iDequeueOutputBuffer);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(byteBuffer);
                    this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                }
            }
            int i = iDequeueOutputBuffer;
            if (i >= 0) {
                ByteBuffer byteBufferDuplicate = getByteBuffer(false, i).duplicate();
                byteBufferDuplicate.position(bufferInfo.offset);
                byteBufferDuplicate.limit(bufferInfo.offset + bufferInfo.size);
                reportEncodedFrame(bufferInfo.size);
                return new OutputBufferInfo(i, byteBufferDuplicate.slice(), bufferInfo.size, (bufferInfo.flags & 1) != 0, bufferInfo.presentationTimeUs);
            }
            if (i == -3) {
                return dequeueOutputBuffer();
            }
            if (i == -2) {
                return dequeueOutputBuffer();
            }
            if (i == -1) {
                return null;
            }
            throw new RuntimeException("dequeueOutputBuffer: " + i);
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "dequeueOutputBuffer failed", e);
            return new OutputBufferInfo(-1, null, -1, false, -1L);
        }
    }

    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            android.util.Log.e(TAG, "encodeBuffer failed", e);
            return false;
        }
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            return true;
        } catch (RuntimeException e) {
            android.util.Log.e(TAG, "encodeTexture failed", e);
            return false;
        }
    }

    @TargetApi(21)
    public ByteBuffer getByteBuffer(boolean z, int i) {
        return z ? this.mediaCodec.getInputBuffer(i) : this.mediaCodec.getOutputBuffer(i);
    }

    @TargetApi(21)
    public VImage getImage(int i) {
        Image.Plane[] planes = this.mediaCodec.getInputImage(i).getPlanes();
        this.cacheImage.yBuffer = planes[0].getBuffer();
        this.cacheImage.yStride = planes[0].getRowStride();
        this.cacheImage.uBuffer = planes[1].getBuffer();
        this.cacheImage.uStride = planes[1].getRowStride();
        this.cacheImage.vBuffer = planes[2].getBuffer();
        this.cacheImage.vStride = planes[2].getRowStride();
        if (planes[1].getPixelStride() == 1 && planes[2].getPixelStride() == 1) {
            this.cacheImage.isI420 = true;
        } else {
            this.cacheImage.isI420 = false;
        }
        return this.cacheImage;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0192 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01cb A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01d2 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01f9 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0207 A[Catch: Error -> 0x023f, Exception -> 0x0247, IllegalStateException -> 0x0255, TryCatch #2 {Error -> 0x023f, IllegalStateException -> 0x0255, Exception -> 0x0247, blocks: (B:56:0x0159, B:59:0x016a, B:60:0x0170, B:62:0x0186, B:64:0x0192, B:65:0x01a9, B:67:0x01cb, B:69:0x01d2, B:71:0x01d9, B:72:0x01e1, B:74:0x01e8, B:76:0x01f9, B:77:0x01ff, B:79:0x0207, B:80:0x020d), top: B:98:0x0159 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public boolean initEncode(int i, int i2, int i3, int i4, int i5, boolean z, int i6, int i7, String str) {
        EncoderProperties encoderPropertiesFindHwEncoder;
        int i8;
        EncoderProperties encoderPropertiesFindHwEncoder2;
        int profileType;
        int i9;
        int iMin;
        MediaFormat mediaFormatCreateVideoFormat;
        MediaCodec mediaCodecCreateByCodecName;
        MediaFormat inputFormat;
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Java initEncode: ", i2, " x ", i3, ". @ ");
        sbOooO0O0.append(i4 / 1000);
        sbOooO0O0.append(" kbps. Fps: ");
        sbOooO0O0.append(i5);
        sbOooO0O0.append(" useSurface:");
        sbOooO0O0.append(z);
        android.util.Log.d(TAG, sbOooO0O0.toString());
        this.width = i2;
        this.height = i3;
        this.forcedKeyFrameMs = 0L;
        this.lastKeyFrameMs = -1L;
        if (this.mediaCodecThread != null) {
            throw new RuntimeException("Forgot to release()?");
        }
        VideoCodecType videoCodecType = VideoCodecType.values()[i];
        VideoCodecType videoCodecType2 = VideoCodecType.VIDEO_CODEC_H264_AVC;
        String str2 = VP8_MIME_TYPE;
        String str3 = H264_MIME_TYPE;
        if (videoCodecType == videoCodecType2) {
            android.util.Log.d(TAG, "init h264 encoder");
            encoderPropertiesFindHwEncoder2 = findHwEncoder(H264_MIME_TYPE, h264HwList, z ? supportedSurfaceColorList : supportedColorList);
            if (encoderPropertiesFindHwEncoder2.supportedProfile) {
                profileType = getProfileType(str, i7, encoderPropertiesFindHwEncoder2.supportedHighProfile ? 8 : 1);
                i9 = (i2 * i3) / 256 <= 8192 ? RecyclerView.oo0o0Oo.FLAG_MOVED : ShareRequest.THUMB_DATA_SIZE_LIMIT;
            }
            if (encoderPropertiesFindHwEncoder2 != null) {
                throw new RuntimeException("Can not find HW encoder for h264");
            }
            runningInstance = this;
            this.colorFormat = encoderPropertiesFindHwEncoder2.colorFormat;
            this.bitrateAdjustmentType = encoderPropertiesFindHwEncoder2.bitrateAdjustmentType;
            iMin = Math.min(i5, 30);
            if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT) {
                this.originFps = iMin;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Color format: ");
            sbOooO0o0.append(this.colorFormat);
            sbOooO0o0.append(". Bitrate adjustment: ");
            sbOooO0o0.append(this.bitrateAdjustmentType);
            sbOooO0o0.append(". Initial fps: ");
            sbOooO0o0.append(iMin);
            android.util.Log.d(TAG, sbOooO0o0.toString());
            this.targetBitrateBps = i4;
            this.targetFps = iMin;
            this.bitrateAccumulatorMax = ((double) i4) / 8.0d;
            this.bitrateAccumulator = 0.0d;
            this.bitrateObservationTimeMs = 0.0d;
            this.bitrateAdjustmentScaleExp = 0;
            this.mediaCodecThread = Thread.currentThread();
            try {
                mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str3, i2, i3);
                mediaFormatCreateVideoFormat.setInteger("bitrate", this.targetBitrateBps);
                if (encoderPropertiesFindHwEncoder2.supportedCBR && i7 == 0) {
                    mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
                }
                mediaFormatCreateVideoFormat.setInteger("color-format", encoderPropertiesFindHwEncoder2.colorFormat);
                mediaFormatCreateVideoFormat.setInteger("frame-rate", this.targetFps);
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i6);
                if (profileType != -1) {
                    mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, profileType);
                    mediaFormatCreateVideoFormat.setInteger("level", i9);
                    if (i7 != 0) {
                        mediaFormatCreateVideoFormat.setInteger("priority", 1);
                        mediaFormatCreateVideoFormat.setInteger(ak.aS, 3);
                        mediaFormatCreateVideoFormat.setInteger("max-bframes", i7);
                        mediaFormatCreateVideoFormat.setInteger("android._prefer-b-frames", 1);
                    }
                }
                android.util.Log.d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
                mediaCodecCreateByCodecName = createByCodecName(encoderPropertiesFindHwEncoder2.codecName);
                this.mediaCodec = mediaCodecCreateByCodecName;
                this.type = this.type;
                if (mediaCodecCreateByCodecName == null) {
                    android.util.Log.e(TAG, "Can not create media encoder");
                    return false;
                }
                mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                if (z) {
                    this.inputSurface = this.mediaCodec.createInputSurface();
                }
                this.mediaCodec.start();
                if (!z) {
                    return true;
                }
                this.stride = 0;
                this.sliceHeight = 0;
                inputFormat = this.mediaCodec.getInputFormat();
                if (inputFormat.containsKey("stride")) {
                    this.stride = inputFormat.getInteger("stride");
                }
                if (inputFormat.containsKey("slice-height")) {
                    this.sliceHeight = inputFormat.getInteger("slice-height");
                }
                android.util.Log.d(TAG, "Input frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(i2, this.stride);
                this.sliceHeight = Math.max(i3, this.sliceHeight);
                return true;
            } catch (Error e) {
                android.util.Log.e(TAG, "initEncode failed", e);
                return false;
            } catch (IllegalStateException e2) {
                android.util.Log.e(TAG, "initEncode failed", e2);
                printStackTrace();
                return false;
            } catch (Exception e3) {
                printStackTrace();
                android.util.Log.e(TAG, "initEncode failed", e3);
                printStackTrace();
                return false;
            }
        }
        if (videoCodecType == VideoCodecType.VIDEO_CODEC_H265) {
            android.util.Log.d(TAG, "init hevc encoder");
            encoderPropertiesFindHwEncoder = findHwEncoder(HEVC_MIME_TYPE, hevcHwList, z ? supportedSurfaceColorList : supportedColorList);
            str2 = HEVC_MIME_TYPE;
        } else {
            VideoCodecType videoCodecType3 = VideoCodecType.VIDEO_CODEC_VP8;
            if (videoCodecType != videoCodecType3) {
                android.util.Log.e(TAG, "not support this encoder: " + i);
                return false;
            }
            android.util.Log.d(TAG, "init vp8 encoder");
            encoderPropertiesFindHwEncoder = findHwEncoder(VP8_MIME_TYPE, vp8HwList, z ? supportedSurfaceColorList : supportedColorList);
            if (this.type == videoCodecType3 && encoderPropertiesFindHwEncoder.codecName.startsWith(qcomVp8HwProperties.codecPrefix) && ((i8 = Build.VERSION.SDK_INT) == 21 || i8 == 22 || i8 == 23 || i8 > 23)) {
                this.forcedKeyFrameMs = i6 * 1000;
            }
        }
        encoderPropertiesFindHwEncoder2 = encoderPropertiesFindHwEncoder;
        str3 = str2;
        profileType = -1;
        i9 = -1;
        if (encoderPropertiesFindHwEncoder2 != null) {
            throw new RuntimeException("Can not find HW encoder for h264");
        }
        runningInstance = this;
        this.colorFormat = encoderPropertiesFindHwEncoder2.colorFormat;
        this.bitrateAdjustmentType = encoderPropertiesFindHwEncoder2.bitrateAdjustmentType;
        iMin = Math.min(i5, 30);
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT) {
            this.originFps = iMin;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Color format: ");
        sbOooO0o1.append(this.colorFormat);
        sbOooO0o1.append(". Bitrate adjustment: ");
        sbOooO0o1.append(this.bitrateAdjustmentType);
        sbOooO0o1.append(". Initial fps: ");
        sbOooO0o1.append(iMin);
        android.util.Log.d(TAG, sbOooO0o1.toString());
        this.targetBitrateBps = i4;
        this.targetFps = iMin;
        this.bitrateAccumulatorMax = ((double) i4) / 8.0d;
        this.bitrateAccumulator = 0.0d;
        this.bitrateObservationTimeMs = 0.0d;
        this.bitrateAdjustmentScaleExp = 0;
        this.mediaCodecThread = Thread.currentThread();
        mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str3, i2, i3);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.targetBitrateBps);
        if (encoderPropertiesFindHwEncoder2.supportedCBR) {
            mediaFormatCreateVideoFormat.setInteger("bitrate-mode", 2);
        }
        mediaFormatCreateVideoFormat.setInteger("color-format", encoderPropertiesFindHwEncoder2.colorFormat);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.targetFps);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i6);
        if (profileType != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, profileType);
            mediaFormatCreateVideoFormat.setInteger("level", i9);
            if (i7 != 0) {
                mediaFormatCreateVideoFormat.setInteger("priority", 1);
                mediaFormatCreateVideoFormat.setInteger(ak.aS, 3);
                mediaFormatCreateVideoFormat.setInteger("max-bframes", i7);
                mediaFormatCreateVideoFormat.setInteger("android._prefer-b-frames", 1);
            }
        }
        android.util.Log.d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
        mediaCodecCreateByCodecName = createByCodecName(encoderPropertiesFindHwEncoder2.codecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.type = this.type;
        if (mediaCodecCreateByCodecName == null) {
            android.util.Log.e(TAG, "Can not create media encoder");
            return false;
        }
        mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        if (z) {
            this.inputSurface = this.mediaCodec.createInputSurface();
        }
        this.mediaCodec.start();
        if (!z) {
            return true;
        }
        this.stride = 0;
        this.sliceHeight = 0;
        inputFormat = this.mediaCodec.getInputFormat();
        if (inputFormat.containsKey("stride")) {
            this.stride = inputFormat.getInteger("stride");
        }
        if (inputFormat.containsKey("slice-height")) {
            this.sliceHeight = inputFormat.getInteger("slice-height");
        }
        android.util.Log.d(TAG, "Input frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
        this.stride = Math.max(i2, this.stride);
        this.sliceHeight = Math.max(i3, this.sliceHeight);
        return true;
    }

    public void release() {
        if (this.mediaCodecThread == null) {
            return;
        }
        android.util.Log.d(TAG, "Java releaseEncoder");
        checkOnMediaCodecThread();
        if (this.mediaCodec != null) {
            Surface surface = this.inputSurface;
            if (surface != null) {
                surface.release();
                this.inputSurface = null;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: com.zego.ve.MediaCodecVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        android.util.Log.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread");
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                        MediaCodecVideoEncoder.this.mediaCodec = null;
                        android.util.Log.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread done");
                    } catch (Exception e) {
                        android.util.Log.e(MediaCodecVideoEncoder.TAG, "Media encoder release failed", e);
                    }
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
                android.util.Log.e(TAG, "Media encoder release timeout");
                codecErrors++;
                if (errorCallback != null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Invoke codec error callback. Errors: ");
                    sbOooO0o0.append(codecErrors);
                    android.util.Log.e(TAG, sbOooO0o0.toString());
                    errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
                }
            }
        }
        this.mediaCodecThread = null;
        runningInstance = null;
        android.util.Log.d(TAG, "Java releaseEncoder done");
    }

    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "releaseOutputBuffer failed", e);
            return false;
        }
    }

    public void signalEOS() {
        MediaCodec mediaCodec = this.mediaCodec;
        if (mediaCodec == null) {
            return;
        }
        if (this.inputSurface != null) {
            mediaCodec.signalEndOfInputStream();
            return;
        }
        int iDequeueInputBuffer = dequeueInputBuffer();
        while (iDequeueInputBuffer == -1) {
            try {
                Thread.sleep(100L);
                iDequeueInputBuffer = dequeueInputBuffer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (iDequeueInputBuffer >= 0) {
            this.mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
        }
    }
}
