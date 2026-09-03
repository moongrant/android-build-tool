package p048Ooooooo;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o0oOO;
import p041Ooooo0o.o00000O0;
import p044OooooOo.o0O0OOOo;
import p044OooooOo.o0O0oo00;
import p044OooooOo.o0oOo0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OOooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f2055OooO00o;

    public o0OOooO0() {
        this.f2055OooO00o = ((o0O0oo00) o0O0OOOo.OooO00o(o0O0oo00.class)) != null;
    }

    @Nullable
    public static String OooO0O0(@NonNull MediaFormat mediaFormat, @NonNull MediaCodecInfo[] mediaCodecInfoArr) throws Throwable {
        Integer numValueOf;
        int iIntValue;
        String string = mediaFormat.getString("mime");
        Integer num = null;
        if (string == null) {
            o00O0O0.OooO0oo("EncoderFinder", "MediaFormat does not contain mime info.");
            return null;
        }
        int length = mediaCodecInfoArr.length;
        for (int i = 0; i < length; i++) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
            if (mediaCodecInfo.isEncoder()) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    OooOOO0.OooO0O0(capabilitiesForType != null, "MIME type is not supported");
                    if (mediaFormat.containsKey("bitrate")) {
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        OooOOO0.OooO0O0(videoCapabilities != null, "Not video codec");
                        numValueOf = Integer.valueOf(mediaFormat.getInteger("bitrate"));
                        try {
                            iIntValue = ((Integer) videoCapabilities.getBitrateRange().clamp(numValueOf)).intValue();
                            mediaFormat.setInteger("bitrate", iIntValue);
                        } catch (IllegalArgumentException unused) {
                            if (numValueOf != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            num = numValueOf;
                            if (num != null) {
                                mediaFormat.setInteger("bitrate", num.intValue());
                            }
                            throw th;
                        }
                    } else {
                        iIntValue = -1;
                        numValueOf = null;
                    }
                    if (capabilitiesForType.isFormatSupported(mediaFormat)) {
                        o00O0O0.OooO0oo("EncoderFinder", String.format("No encoder found that supports requested bitrate. Adjusting bitrate to nearest supported bitrate [requested: %dbps, nearest: %dbps]", numValueOf, Integer.valueOf(iIntValue)));
                        String name = mediaCodecInfo.getName();
                        if (numValueOf != null) {
                            mediaFormat.setInteger("bitrate", numValueOf.intValue());
                        }
                        return name;
                    }
                    if (numValueOf != null) {
                        mediaFormat.setInteger("bitrate", numValueOf.intValue());
                    }
                } catch (IllegalArgumentException unused2) {
                    numValueOf = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x018b  */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0295  */
    /* JADX WARN: Code duplicated, block: B:145:0x029e  */
    @NonNull
    public final MediaCodec OooO00o(@NonNull MediaFormat mediaFormat) throws Throwable {
        Integer numValueOf;
        Integer numValueOf2;
        boolean zEqualsIgnoreCase;
        boolean z = true;
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        Integer num = null;
        try {
            if (this.f2055OooO00o && mediaFormat.containsKey("frame-rate")) {
                numValueOf2 = Integer.valueOf(mediaFormat.getInteger("frame-rate"));
                try {
                    mediaFormat.setString("frame-rate", null);
                } catch (Throwable th) {
                    th = th;
                    numValueOf = num;
                    num = numValueOf2;
                    if (num != null) {
                        mediaFormat.setInteger("frame-rate", num.intValue());
                    }
                    if (numValueOf != null) {
                        mediaFormat.setInteger("aac-profile", numValueOf.intValue());
                    }
                    throw th;
                }
            } else {
                numValueOf2 = null;
            }
            if (Build.VERSION.SDK_INT <= 23 && mediaFormat.containsKey("aac-profile")) {
                numValueOf = Integer.valueOf(mediaFormat.getInteger("aac-profile"));
                try {
                    mediaFormat.setString("aac-profile", null);
                    num = numValueOf;
                } catch (Throwable th2) {
                    th = th2;
                    num = numValueOf2;
                    if (num != null) {
                        mediaFormat.setInteger("frame-rate", num.intValue());
                    }
                    if (numValueOf != null) {
                        mediaFormat.setInteger("aac-profile", numValueOf.intValue());
                    }
                    throw th;
                }
            }
            String strFindEncoderForFormat = mediaCodecList.findEncoderForFormat(mediaFormat);
            if (strFindEncoderForFormat == null) {
                strFindEncoderForFormat = OooO0O0(mediaFormat, mediaCodecList.getCodecInfos());
            }
            if (numValueOf2 != null) {
                mediaFormat.setInteger("frame-rate", numValueOf2.intValue());
            }
            if (num != null) {
                mediaFormat.setInteger("aac-profile", num.intValue());
            }
            int i = 0;
            try {
                if (!TextUtils.isEmpty(strFindEncoderForFormat)) {
                    return MediaCodec.createByCodecName(strFindEncoderForFormat);
                }
                String string = mediaFormat.getString("mime");
                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(string);
                o00O0O0.OooO0oo("EncoderFinder", String.format("No encoder found that supports requested MediaFormat %s. Create encoder by MIME type. Dump codec info:\n%s", mediaFormat, o00000O0.OooO00o(string, mediaCodecCreateEncoderByType, mediaFormat)));
                return mediaCodecCreateEncoderByType;
            } catch (IOException | IllegalArgumentException | NullPointerException e) {
                if (((o0oOo0O0) o0O0OOOo.OooO00o(o0oOo0O0.class)) == null) {
                    zEqualsIgnoreCase = false;
                } else {
                    List<String> list = o0oOo0O0.f1810OooO00o;
                    String str = Build.BRAND;
                    if ("Nokia".equalsIgnoreCase(str) && "Nokia 1".equalsIgnoreCase(Build.MODEL)) {
                        zEqualsIgnoreCase = "video/mp4v-es".equalsIgnoreCase(mediaFormat.getString("mime"));
                    } else {
                        if ("motorola".equalsIgnoreCase(str) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                            zEqualsIgnoreCase = "video/mp4v-es".equalsIgnoreCase(mediaFormat.getString("mime"));
                        } else {
                            if ("infinix".equalsIgnoreCase(str) && "infinix x650".equalsIgnoreCase(Build.MODEL)) {
                                zEqualsIgnoreCase = "video/mp4v-es".equalsIgnoreCase(mediaFormat.getString("mime"));
                            } else {
                                if ("LGE".equalsIgnoreCase(str) && "LG-X230".equalsIgnoreCase(Build.MODEL)) {
                                    zEqualsIgnoreCase = "video/mp4v-es".equalsIgnoreCase(mediaFormat.getString("mime"));
                                } else {
                                    if ("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
                                        zEqualsIgnoreCase = "video/mp4v-es".equalsIgnoreCase(mediaFormat.getString("mime"));
                                    } else {
                                        if ("Huawei".equalsIgnoreCase(str) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                                            String string2 = mediaFormat.getString("mime");
                                            if (string2 != null && string2.contains("video/")) {
                                                if (mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 3840 && mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 2160) {
                                                    zEqualsIgnoreCase = true;
                                                }
                                            }
                                            zEqualsIgnoreCase = false;
                                        } else {
                                            if (o0oOo0O0.f1810OooO00o.contains(Build.MODEL.toLowerCase(Locale.US)) && "video/avc".equalsIgnoreCase(mediaFormat.getString("mime"))) {
                                                if (mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) == 1920 && mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) == 1080) {
                                                    zEqualsIgnoreCase = true;
                                                }
                                            }
                                            zEqualsIgnoreCase = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
                sb.append("\n");
                String string3 = mediaFormat.getString("mime");
                MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
                int length = codecInfos.length;
                boolean z2 = false;
                while (i < length) {
                    MediaCodecInfo mediaCodecInfo = codecInfos[i];
                    if (mediaCodecInfo.isEncoder()) {
                        try {
                            OooOOO0.OooO00o(string3 != null ? z : z2);
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string3);
                            if (capabilitiesForType == null) {
                                z = z2;
                            }
                            OooOOO0.OooO00o(z);
                            sb.append("[Start] [" + mediaCodecInfo.getName() + "]");
                            sb.append("\n");
                            o00000O0.OooO0O0(sb, capabilitiesForType, mediaFormat);
                            sb.append("[End] [" + mediaCodecInfo.getName() + "]");
                            sb.append("\n");
                        } catch (IllegalArgumentException unused) {
                            sb.append("[" + mediaCodecInfo.getName() + "] does not support mime " + string3);
                            sb.append("\n");
                        }
                    }
                    i++;
                    z = true;
                    z2 = false;
                }
                String strOooO0O0 = o0oOO.OooO0O0(sb, "[End] Dump MediaCodecList", "\n");
                if (o00O0O0.OooO0o(4, o00O0O0.OooO0oO("DebugUtils"))) {
                    Scanner scanner = new Scanner(strOooO0O0);
                    while (scanner.hasNextLine()) {
                        o00O0O0.OooO0Oo("DebugUtils", scanner.nextLine());
                    }
                }
                throw new InvalidConfigException("Encoder cannot created: " + strFindEncoderForFormat + ", isMediaFormatInQuirk: " + zEqualsIgnoreCase + "\n" + strOooO0O0, e);
            }
        } catch (Throwable th3) {
            th = th3;
            numValueOf = null;
        }
    }
}
