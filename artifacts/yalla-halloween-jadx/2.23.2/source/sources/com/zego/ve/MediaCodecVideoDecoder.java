package com.zego.ve;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o000O0Oo.OooOOO0;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(16)
public class MediaCodecVideoDecoder {
    private static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    private static final String FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String FORMAT_KEY_STRIDE = "stride";
    private static final String H264_MIME_TYPE = "video/avc";
    private static final String HEVC_MIME_TYPE = "video/hevc";
    private static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "MediaCodecVideoDecoder";
    private static final int VIDEO_CODEC_H264 = 2;
    private static final int VIDEO_CODEC_HEVC = 3;
    private static final int VIDEO_CODEC_VP8 = 0;
    private static final int VIDEO_CODEC_VP9 = 1;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors;
    private static MediaCodecVideoDecoderErrorCallback errorCallback;
    private static MediaCodecVideoDecoder runningInstance;
    private int colorFormat;
    private int cropLeft;
    private int cropTop;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    private boolean isImageReader;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private int width;
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.hisi.", "OMX.IMG.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    private static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    private static final String[] supportedH264HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.MTK.", "OMX.hisi.", "OMX.IMG.", "OMX.k3.", "OMX.TI.", "OMX.rk.", "OMX.amlogic.", "OMX.Intel.", "OMX.Nvidia.", "OMX.allwinner.", "OMX.MS.", "OMX.realtek.", "OMX.Freescale.", "OMX.sprd.", "c2.qti."};
    private static final String[] supportedHEVCHwCodecPrefixes = {"OMX.qcom.", "OMX.hisi.", "OMX.IMG.", "OMX.Intel.", "OMX.MTK", "OMX.Exynos.", "c2.qti."};
    private static final int COLOR_FormatYUV420Flexible = 2135033992;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int COLOR_QCOM_FormatYUV420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    private static final int[] supportedColorList = {19, COLOR_FormatYUV420Flexible, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m, COLOR_QCOM_FormatYUV420PackedSemiPlanar64x32Tile2m8ka, 2130706688, 2130708361};
    private static final int[] supportedSurfaceColorList = {2130708361, COLOR_FormatYUV420Flexible};
    private static boolean enableWhitelist = true;
    private static final String[] HW_BLACKLISTS = {"omx.google.", "omx.ffmpeg.", "omx.pv", "omx.k3.ffmpeg.", "omx.avcodec.", "omx.ittiam.", "omx.sec.avc.sw.", "omx.marvell.video.h264decoder"};
    private static final String[] HW_SURFACE_BLACKLISTS = {"OMX.MS.", "OMX.MTK"};
    private static final String[] H264_HW_EXCEPTION_MODELS = {"V1818CA"};
    private static final String[] H265_HW_EXCEPTION_MODELS = {"V1818CA"};
    private Thread mediaCodecThread = null;
    private MediaCodec mediaCodec = null;
    private String codecName = null;
    private Surface surface = null;

    public static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    private void checkOnMediaCodecThread() throws IllegalStateException {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new IllegalStateException("MediaCodecVideoDecoder previously operated on " + this.mediaCodecThread + " but is now called on " + Thread.currentThread());
    }

    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000L);
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    private DecodedOutputBuffer dequeueOutputBuffer(int i) {
        int integer;
        int integer2;
        int integer3;
        int integer4;
        checkOnMediaCodecThread();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i));
            if (iDequeueOutputBuffer != -3) {
                if (iDequeueOutputBuffer != -2) {
                    if (iDequeueOutputBuffer == -1) {
                        return null;
                    }
                    boolean z = !this.hasDecodedFirstFrame;
                    this.hasDecodedFirstFrame = true;
                    boolean z2 = (bufferInfo.flags & 4) != 0;
                    if (z2) {
                        android.util.Log.d(TAG, "output EOS");
                    }
                    if (this.colorFormat == COLOR_FormatYUV420Flexible) {
                        Image.Plane[] planes = this.mediaCodec.getOutputImage(iDequeueOutputBuffer).getPlanes();
                        return new DecodedOutputBuffer(iDequeueOutputBuffer, planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), planes[1].getPixelStride() == 1 && planes[2].getPixelStride() == 1, bufferInfo.presentationTimeUs, z, z2);
                    }
                    ByteBuffer byteBuffer = getByteBuffer(false, iDequeueOutputBuffer);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    return new DecodedOutputBuffer(iDequeueOutputBuffer, byteBuffer, bufferInfo.presentationTimeUs, z, z2);
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                android.util.Log.d(TAG, "Decoder format changed: " + outputFormat.toString());
                if (outputFormat.containsKey(FORMAT_KEY_CROP_LEFT) && outputFormat.containsKey(FORMAT_KEY_CROP_RIGHT) && outputFormat.containsKey(FORMAT_KEY_CROP_BOTTOM) && outputFormat.containsKey(FORMAT_KEY_CROP_TOP)) {
                    this.cropTop = outputFormat.getInteger(FORMAT_KEY_CROP_TOP);
                    this.cropLeft = outputFormat.getInteger(FORMAT_KEY_CROP_LEFT);
                    integer = (outputFormat.getInteger(FORMAT_KEY_CROP_RIGHT) - this.cropLeft) + 1;
                    integer2 = (outputFormat.getInteger(FORMAT_KEY_CROP_BOTTOM) - this.cropTop) + 1;
                } else {
                    this.cropTop = 0;
                    this.cropLeft = 0;
                    integer = 0;
                    integer2 = 0;
                }
                if (outputFormat.containsKey(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) && outputFormat.containsKey(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
                    integer3 = outputFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                    integer4 = outputFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                } else {
                    integer3 = 0;
                    integer4 = 0;
                }
                if (!this.hasDecodedFirstFrame) {
                    if (integer3 != 0 && integer4 != 0 && integer3 <= this.width && integer4 <= this.height) {
                        this.width = integer3;
                        this.height = integer4;
                    }
                    if (integer != 0 && integer2 != 0 && integer <= this.width && integer2 <= this.height) {
                        this.width = integer;
                        this.height = integer2;
                    }
                } else if (integer3 != this.width || integer4 != this.height) {
                    StringBuilder sb = new StringBuilder("Unexpected size change. Configured ");
                    sb.append(this.width);
                    sb.append("*");
                    OooOOO0.OooO00o(sb, this.height, ". New ", integer3, "*");
                    sb.append(integer4);
                    throw new RuntimeException(sb.toString());
                }
                if (integer4 != 0) {
                    this.sliceHeight = integer4;
                }
                if (this.codecName.startsWith("OMX.rk") && this.colorFormat == 21) {
                    this.colorFormat = 21;
                } else if (outputFormat.containsKey("color-format")) {
                    this.colorFormat = outputFormat.getInteger("color-format");
                    android.util.Log.d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                }
                if (outputFormat.containsKey(FORMAT_KEY_STRIDE)) {
                    this.stride = outputFormat.getInteger(FORMAT_KEY_STRIDE);
                } else {
                    this.stride = integer3;
                }
                if (outputFormat.containsKey(FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = outputFormat.getInteger(FORMAT_KEY_SLICE_HEIGHT);
                }
                android.util.Log.d(TAG, "Output frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(this.width, this.stride);
                int i2 = this.colorFormat;
                if ((19 == i2 || 21 == i2) && integer4 != this.sliceHeight) {
                    this.sliceHeight = this.height;
                } else {
                    this.sliceHeight = Math.max(this.height, this.sliceHeight);
                }
                this.hasDecodedFirstFrame = false;
            }
        }
    }

    public static void disableH264HwCodec() {
        android.util.Log.w(TAG, "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableHEVCHwCodec() {
        android.util.Log.w(TAG, "HEVC decoding is disabled by application.");
        hwDecoderDisabledTypes.add(HEVC_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        android.util.Log.w(TAG, "VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        android.util.Log.w(TAG, "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    private static DecoderProperties findDecoder(String str, String[] strArr, int[] iArr) {
        String name;
        boolean z;
        android.util.Log.d(TAG, "Trying to find HW decoder for mime " + str);
        if (str.equals(H264_MIME_TYPE)) {
            List listAsList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
            String str2 = Build.MODEL;
            if (listAsList.contains(str2)) {
                android.util.Log.w(TAG, "Model: " + str2 + " has black listed H.264 decoder.");
                return null;
            }
        } else if (str.equals(HEVC_MIME_TYPE)) {
            List listAsList2 = Arrays.asList(H265_HW_EXCEPTION_MODELS);
            String str3 = Build.MODEL;
            if (listAsList2.contains(str3)) {
                android.util.Log.w(TAG, "Model: " + str3 + " has black listed H.265 decoder.");
                return null;
            }
        }
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (!codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            name = null;
                            break;
                        }
                        if (supportedTypes[i2].equals(str)) {
                            name = codecInfoAt.getName();
                            break;
                        }
                        i2++;
                    }
                    if (name != null) {
                        android.util.Log.d(TAG, "Found candidate decoder " + name);
                        boolean z2 = true;
                        if (enableWhitelist) {
                            int length2 = strArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length2) {
                                    z2 = false;
                                    break;
                                }
                                if (name.startsWith(strArr[i3])) {
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            String lowerCase = name.toLowerCase();
                            String[] strArr2 = HW_BLACKLISTS;
                            int length3 = strArr2.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length3) {
                                    z = false;
                                    break;
                                }
                                if (lowerCase.startsWith(strArr2[i4])) {
                                    z = true;
                                    break;
                                }
                                i4++;
                            }
                            z2 = true ^ z;
                        }
                        if (z2) {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                            for (int i5 : capabilitiesForType.colorFormats) {
                                android.util.Log.d(TAG, "Color: 0x" + Integer.toHexString(i5));
                            }
                            for (int i6 : iArr) {
                                for (int i7 : capabilitiesForType.colorFormats) {
                                    if (i7 == i6) {
                                        android.util.Log.d(TAG, "Found target decoder " + name + ". Color: 0x" + Integer.toHexString(i7));
                                        return new DecoderProperties(name, i7);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        android.util.Log.d(TAG, "No HW decoder found for mime ".concat(str));
        return null;
    }

    private void flush() {
        android.util.Log.d(TAG, "Java flushDecoder");
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            android.util.Log.d(TAG, "Java decoder flush already release");
            return;
        }
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.flush();
        } catch (Exception e) {
            android.util.Log.e(TAG, "Media decoder flush failed", e);
        }
    }

    public static String getCodecName() {
        return findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes, supportedColorList).codecName;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[Catch: Error -> 0x010c, Exception -> 0x0114, TRY_ENTER, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0088 A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0090 A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5 A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5 A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea A[Catch: Error -> 0x010c, Exception -> 0x0114, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[Catch: Error -> 0x010c, Exception -> 0x0114, TRY_LEAVE, TryCatch #2 {Error -> 0x010c, Exception -> 0x0114, blocks: (B:18:0x0079, B:21:0x0082, B:36:0x00cc, B:37:0x00d1, B:39:0x00ea, B:41:0x00f2, B:22:0x0088, B:24:0x0090, B:26:0x009a, B:27:0x009d, B:28:0x00a5, B:30:0x00ad, B:34:0x00c7, B:33:0x00c5), top: B:49:0x0079 }] */
    private boolean initDecode(int i, int i2, int i3, ByteBuffer byteBuffer, Object obj) {
        String str;
        DecoderProperties decoderPropertiesFindDecoder;
        String str2;
        String str3;
        String str4;
        MediaFormat mediaFormatCreateVideoFormat;
        int i4;
        SurfaceTexture surfaceTexture;
        MediaCodec mediaCodecCreateByCodecName;
        if (this.mediaCodecThread != null) {
            return false;
        }
        if (i != 0) {
            str3 = "h264";
            if (i == 2) {
                decoderPropertiesFindDecoder = findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes, supportedColorList);
                str4 = H264_MIME_TYPE;
            } else if (i != 3) {
                str4 = "";
                decoderPropertiesFindDecoder = null;
            } else {
                String[] strArr = supportedHEVCHwCodecPrefixes;
                int[] iArr = supportedColorList;
                str = HEVC_MIME_TYPE;
                decoderPropertiesFindDecoder = findDecoder(HEVC_MIME_TYPE, strArr, iArr);
                str2 = "hevc";
            }
            if (decoderPropertiesFindDecoder == null) {
                return false;
            }
            StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Java initDecode, codec: ", str3, " Color: 0x");
            sbOooO0O0.append(Integer.toHexString(decoderPropertiesFindDecoder.colorFormat));
            android.util.Log.d(TAG, sbOooO0O0.toString());
            runningInstance = this;
            this.mediaCodecThread = Thread.currentThread();
            try {
                mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str4, i2, i3);
                if (obj == null) {
                    mediaFormatCreateVideoFormat.setInteger("color-format", decoderPropertiesFindDecoder.colorFormat);
                } else if (SurfaceTexture.class.isInstance(obj)) {
                    this.isImageReader = false;
                    surfaceTexture = (SurfaceTexture) obj;
                    if (Build.VERSION.SDK_INT >= 24) {
                        surfaceTexture.setDefaultBufferSize(i2, i3);
                    }
                    this.surface = new Surface(surfaceTexture);
                } else if (ImageReader.class.isInstance(obj)) {
                    this.isImageReader = true;
                    this.surface = ((ImageReader) obj).getSurface();
                    if (decoderPropertiesFindDecoder.codecName.startsWith("OMX")) {
                        i4 = COLOR_FormatYUV420Flexible;
                    } else {
                        i4 = decoderPropertiesFindDecoder.colorFormat;
                    }
                    mediaFormatCreateVideoFormat.setInteger("color-format", i4);
                }
                if (byteBuffer != null) {
                    mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBuffer);
                }
                android.util.Log.d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
                mediaCodecCreateByCodecName = MediaCodecVideoEncoder.createByCodecName(decoderPropertiesFindDecoder.codecName);
                this.mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodecCreateByCodecName == null) {
                    android.util.Log.e(TAG, "Can not create media decoder: ".concat(str3));
                    return false;
                }
                mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, this.surface, (MediaCrypto) null, 0);
                this.mediaCodec.start();
                this.codecName = decoderPropertiesFindDecoder.codecName;
                this.colorFormat = decoderPropertiesFindDecoder.colorFormat;
                this.hasDecodedFirstFrame = false;
                this.width = i2;
                this.height = i3;
                return true;
            } catch (Error e) {
                android.util.Log.e(TAG, "initDecode failed", e);
                printStackTrace();
                return false;
            } catch (Exception e2) {
                android.util.Log.e(TAG, "initDecode failed", e2);
                return false;
            }
        }
        String[] strArr2 = supportedVp8HwCodecPrefixes;
        int[] iArr2 = supportedColorList;
        str = VP8_MIME_TYPE;
        decoderPropertiesFindDecoder = findDecoder(VP8_MIME_TYPE, strArr2, iArr2);
        str2 = "vp8";
        String str5 = str;
        str3 = str2;
        str4 = str5;
        if (decoderPropertiesFindDecoder == null) {
            return false;
        }
        StringBuilder sbOooO0O1 = o0OoOo0.OooO0O0("Java initDecode, codec: ", str3, " Color: 0x");
        sbOooO0O1.append(Integer.toHexString(decoderPropertiesFindDecoder.colorFormat));
        android.util.Log.d(TAG, sbOooO0O1.toString());
        runningInstance = this;
        this.mediaCodecThread = Thread.currentThread();
        mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str4, i2, i3);
        if (obj == null) {
            mediaFormatCreateVideoFormat.setInteger("color-format", decoderPropertiesFindDecoder.colorFormat);
        } else if (SurfaceTexture.class.isInstance(obj)) {
            this.isImageReader = false;
            surfaceTexture = (SurfaceTexture) obj;
            if (Build.VERSION.SDK_INT >= 24) {
                surfaceTexture.setDefaultBufferSize(i2, i3);
            }
            this.surface = new Surface(surfaceTexture);
        } else if (ImageReader.class.isInstance(obj)) {
            this.isImageReader = true;
            this.surface = ((ImageReader) obj).getSurface();
            if (decoderPropertiesFindDecoder.codecName.startsWith("OMX")) {
                i4 = COLOR_FormatYUV420Flexible;
            } else {
                i4 = decoderPropertiesFindDecoder.colorFormat;
            }
            mediaFormatCreateVideoFormat.setInteger("color-format", i4);
        }
        if (byteBuffer != null) {
            mediaFormatCreateVideoFormat.setByteBuffer("csd-0", byteBuffer);
        }
        android.util.Log.d(TAG, "  Format: " + mediaFormatCreateVideoFormat);
        mediaCodecCreateByCodecName = MediaCodecVideoEncoder.createByCodecName(decoderPropertiesFindDecoder.codecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        if (mediaCodecCreateByCodecName == null) {
            android.util.Log.e(TAG, "Can not create media decoder: ".concat(str3));
            return false;
        }
        mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, this.surface, (MediaCrypto) null, 0);
        this.mediaCodec.start();
        this.codecName = decoderPropertiesFindDecoder.codecName;
        this.colorFormat = decoderPropertiesFindDecoder.colorFormat;
        this.hasDecodedFirstFrame = false;
        this.width = i2;
        this.height = i3;
        return true;
    }

    public static boolean isH264HwSupported(boolean z) {
        enableWhitelist = z;
        return (hwDecoderDisabledTypes.contains(H264_MIME_TYPE) || findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        boolean z;
        DecoderProperties decoderPropertiesFindDecoder = findDecoder(H264_MIME_TYPE, supportedH264HwCodecPrefixes, supportedSurfaceColorList);
        if (decoderPropertiesFindDecoder == null) {
            z = false;
            break;
        }
        String[] strArr = HW_SURFACE_BLACKLISTS;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (decoderPropertiesFindDecoder.codecName.startsWith(strArr[i])) {
                z = false;
                break;
            }
            i++;
        }
        return (hwDecoderDisabledTypes.contains(H264_MIME_TYPE) || decoderPropertiesFindDecoder == null || !z) ? false : true;
    }

    public static boolean isHEVCHwSupported(boolean z) {
        enableWhitelist = z;
        return (hwDecoderDisabledTypes.contains(HEVC_MIME_TYPE) || findDecoder(HEVC_MIME_TYPE, supportedHEVCHwCodecPrefixes, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupported(boolean z) {
        return (hwDecoderDisabledTypes.contains(VP8_MIME_TYPE) || findDecoder(VP8_MIME_TYPE, supportedVp8HwCodecPrefixes, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupported(boolean z) {
        return (hwDecoderDisabledTypes.contains(VP9_MIME_TYPE) || findDecoder(VP9_MIME_TYPE, supportedVp9HwCodecPrefixes, supportedColorList) == null) ? false : true;
    }

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder == null || (thread = mediaCodecVideoDecoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            android.util.Log.d(TAG, "MediaCodecVideoDecoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                android.util.Log.d(TAG, stackTraceElement.toString());
            }
        }
    }

    private boolean queueConfig(int i, int i2) {
        checkOnMediaCodecThread();
        try {
            ByteBuffer byteBuffer = getByteBuffer(true, i);
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            this.mediaCodec.queueInputBuffer(i, 0, i2, 0L, 2);
            return true;
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "decode failed", e);
            return false;
        }
    }

    private boolean queueEOS(int i) {
        checkOnMediaCodecThread();
        try {
            ByteBuffer byteBuffer = getByteBuffer(true, i);
            byteBuffer.position(0);
            byteBuffer.limit(0);
            this.mediaCodec.queueInputBuffer(i, 0, 0, 0L, 4);
            return true;
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "decode failed", e);
            return false;
        }
    }

    private boolean queueInputBuffer(int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            ByteBuffer byteBuffer = getByteBuffer(true, i);
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "decode failed", e);
            return false;
        }
    }

    private void release() {
        android.util.Log.d(TAG, "Java releaseDecoder");
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            android.util.Log.d(TAG, "Java decoder already release");
            return;
        }
        checkOnMediaCodecThread();
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: com.zego.ve.MediaCodecVideoDecoder.1
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
                @Override // java.lang.Runnable
                public void run() {
                    String str = "Java releaseDecoder on release thread done";
                    try {
                        try {
                            android.util.Log.d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread");
                            MediaCodecVideoDecoder.this.mediaCodec.stop();
                        } catch (Exception e) {
                            android.util.Log.e(MediaCodecVideoDecoder.TAG, "Media decoder stop failed", e);
                        }
                        MediaCodecVideoDecoder.this.mediaCodec.release();
                        MediaCodecVideoDecoder.this.mediaCodec = null;
                        android.util.Log.d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread done");
                        str = MediaCodecVideoDecoder.this.isImageReader;
                        if (str == 0 && MediaCodecVideoDecoder.this.surface != null) {
                            MediaCodecVideoDecoder.this.surface.release();
                            MediaCodecVideoDecoder.this.surface = null;
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        MediaCodecVideoDecoder.this.mediaCodec.release();
                        MediaCodecVideoDecoder.this.mediaCodec = null;
                        android.util.Log.d(MediaCodecVideoDecoder.TAG, str);
                        throw th;
                    }
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
                android.util.Log.e(TAG, "Media decoder release timeout");
                codecErrors++;
                if (errorCallback != null) {
                    android.util.Log.e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
                    errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
                }
            }
        }
        this.mediaCodecThread = null;
        runningInstance = null;
        android.util.Log.d(TAG, "Java releaseDecoder done");
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        android.util.Log.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private boolean surfaceIsImageReader(Object obj) {
        return ImageReader.class.isInstance(obj);
    }

    @TargetApi(21)
    public ByteBuffer getByteBuffer(boolean z, int i) {
        return z ? this.mediaCodec.getInputBuffer(i) : this.mediaCodec.getOutputBuffer(i);
    }

    public boolean returnDecodedOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, this.surface != null);
            return true;
        } catch (IllegalStateException e) {
            android.util.Log.e(TAG, "releaseOutputBuffer failed", e);
            return false;
        }
    }

    public static class DecodedOutputBuffer {
        private ByteBuffer buffer;
        private final boolean eos;
        public final boolean formatChanged;
        private final int index;
        private boolean isI420;
        private final long presentationTimeStampUs;
        private ByteBuffer uBuffer;
        private int uStride;
        private ByteBuffer vBuffer;
        private int vStride;
        private ByteBuffer yBuffer;
        private int yStride;

        public DecodedOutputBuffer(int i, ByteBuffer byteBuffer, long j, boolean z, boolean z2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.presentationTimeStampUs = j;
            this.formatChanged = z;
            this.eos = z2;
        }

        public DecodedOutputBuffer(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, boolean z, long j, boolean z2, boolean z3) {
            this.index = i;
            this.yBuffer = byteBuffer;
            this.uBuffer = byteBuffer2;
            this.vBuffer = byteBuffer3;
            this.yStride = i2;
            this.uStride = i3;
            this.vStride = i4;
            this.presentationTimeStampUs = j;
            this.formatChanged = z2;
            this.eos = z3;
        }
    }
}
