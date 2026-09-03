package p041Ooooo0o;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o000OO.OooOOO0;
import p043OooooOO.o0O00O;
import p043OooooOO.o0OoO00O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000O0 {
    @NonNull
    public static String OooO00o(@NonNull String str, @NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            OooOOO0.OooO00o(capabilitiesForType != null);
            OooO0O0(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            sb.append("[" + mediaCodec.getName() + "] does not support mime " + str);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void OooO0O0(@NonNull StringBuilder sb, @NonNull MediaCodecInfo.CodecCapabilities codecCapabilities, @NonNull MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z;
        try {
            sb.append("[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
            sb.append("\n");
        } catch (ClassCastException unused) {
            sb.append("[CodecCaps] isFormatSupported=false");
            sb.append("\n");
        }
        sb.append("[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        sb.append("\n");
        boolean z2 = true;
        int i = 0;
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb2 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
            int length = codecProfileLevelArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i2];
                arrayList.add(codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile)));
            }
            sb2.append(TextUtils.join(", ", arrayList));
            sb2.append("]");
            sb.append("[CodecCaps] profileLevels = " + ((Object) sb2));
            sb.append("\n");
        }
        if (codecCapabilities.colorFormats != null) {
            sb.append("[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
            sb.append("\n");
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            sb.append("[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
            sb.append("\n");
            sb.append("[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
            sb.append("\n");
            sb.append("[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
            sb.append("\n");
            try {
                integer = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                integer2 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                OooOOO0.OooO00o(integer > 0 && integer2 > 0);
                z = true;
            } catch (IllegalArgumentException | NullPointerException unused2) {
                sb.append("[VideoCaps] mediaFormat does not contain valid width and height");
                sb.append("\n");
                integer = 0;
                integer2 = 0;
                z = false;
            }
            if (z) {
                try {
                    sb.append("[VideoCaps] getSupportedHeightsFor " + integer + " = " + videoCapabilities.getSupportedHeightsFor(integer));
                    sb.append("\n");
                } catch (IllegalArgumentException unused3) {
                    sb.append("[VideoCaps] could not getSupportedHeightsFor " + integer);
                    sb.append("\n");
                }
                try {
                    sb.append("[VideoCaps] getSupportedWidthsFor " + integer2 + " = " + videoCapabilities.getSupportedWidthsFor(integer2));
                    sb.append("\n");
                } catch (IllegalArgumentException unused4) {
                    sb.append("[VideoCaps] could not getSupportedWidthsFor " + integer2);
                    sb.append("\n");
                }
                StringBuilder sbOooO00o = o00000.OooO00o("[VideoCaps] isSizeSupported for ", integer, "x", integer2, " = ");
                sbOooO00o.append(videoCapabilities.isSizeSupported(integer, integer2));
                sb.append(sbOooO00o.toString());
                sb.append("\n");
            }
            sb.append("[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
            sb.append("\n");
            try {
                int integer3 = mediaFormat.getInteger("frame-rate");
                if (integer3 <= 0) {
                    z2 = false;
                }
                OooOOO0.OooO00o(z2);
                i = integer3;
            } catch (IllegalArgumentException | NullPointerException unused5) {
                sb.append("[VideoCaps] mediaFormat does not contain frame rate");
                sb.append("\n");
            }
            if (z) {
                StringBuilder sbOooO00o2 = o00000.OooO00o("[VideoCaps] getSupportedFrameRatesFor ", integer, "x", integer2, " = ");
                sbOooO00o2.append(videoCapabilities.getSupportedFrameRatesFor(integer, integer2));
                sb.append(sbOooO00o2.toString());
                sb.append("\n");
            }
            if (z && i > 0) {
                StringBuilder sbOooO00o3 = o00000.OooO00o("[VideoCaps] areSizeAndRateSupported for ", integer, "x", integer2, ", ");
                sbOooO00o3.append(i);
                sbOooO00o3.append(" = ");
                sbOooO00o3.append(videoCapabilities.areSizeAndRateSupported(integer, integer2, i));
                sb.append(sbOooO00o3.toString());
                sb.append("\n");
            }
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            sb.append("[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
            sb.append("\n");
            sb.append("[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
            sb.append("\n");
            if (Build.VERSION.SDK_INT >= 31) {
                sb.append("[AudioCaps] getMinInputChannelCount = " + o0O00O.OooO0O0(audioCapabilities));
                sb.append("\n");
                sb.append("[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(o0O00O.OooO00o(audioCapabilities)));
                sb.append("\n");
            }
            sb.append("[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
            sb.append("\n");
            sb.append("[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
            sb.append("\n");
            try {
                int integer4 = mediaFormat.getInteger("sample-rate");
                sb.append("[AudioCaps] isSampleRateSupported for " + integer4 + " = " + audioCapabilities.isSampleRateSupported(integer4));
                sb.append("\n");
            } catch (IllegalArgumentException | NullPointerException unused6) {
                sb.append("[AudioCaps] mediaFormat does not contain sample rate");
                sb.append("\n");
            }
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            sb.append("[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
            sb.append("\n");
            if (Build.VERSION.SDK_INT >= 28) {
                sb.append("[EncoderCaps] getQualityRange = " + o0OoO00O.OooO00o(encoderCapabilities));
                sb.append("\n");
            }
            try {
                sb.append("[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
                sb.append("\n");
            } catch (IllegalArgumentException | NullPointerException unused7) {
                sb.append("[EncoderCaps] mediaFormat does not contain bitrate mode");
                sb.append("\n");
            }
        }
    }

    @NonNull
    public static String OooO0OO(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }
}
