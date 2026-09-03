package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Objects;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f14435OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f14436OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f14437OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f14438OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f14439OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f14440OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f14441OooO0oO;

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    public OooO00o(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        Objects.requireNonNull(str);
        this.f14435OooO00o = str;
        this.f14436OooO0O0 = str2;
        this.f14437OooO0OO = str3;
        this.f14438OooO0Oo = codecCapabilities;
        boolean z4 = false;
        if (z || codecCapabilities == null) {
            z3 = false;
        } else {
            if (o000OOo0.f36740OooO00o >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f14440OooO0o0 = z3;
        if (codecCapabilities != null && o000OOo0.f36740OooO00o >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z2) {
            z4 = true;
        } else if (codecCapabilities != null) {
            if (o000OOo0.f36740OooO00o >= 21 && codecCapabilities.isFeatureSupported("secure-playback")) {
                z4 = true;
            }
        }
        this.f14439OooO0o = z4;
        this.f14441OooO0oO = o000OO.OooO(str2);
    }

    public static OooO00o OooO(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new OooO00o(str, str2, str3, codecCapabilities, z4, z5);
    }

    @RequiresApi(21)
    public static Point OooO00o(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = o000OOo0.f36740OooO00o;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    public static boolean OooO0O0(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointOooO00o = OooO00o(videoCapabilities, i, i2);
        int i3 = pointOooO00o.x;
        int i4 = pointOooO00o.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final MediaCodecInfo.CodecProfileLevel[] OooO0OO() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14438OooO0Oo;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0258  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ce A[RETURN, SYNTHETIC] */
    public final boolean OooO0Oo(Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        o000OO.OooO0O0 oooO0O0OooO0Oo;
        String str = format.f13129OoooOO0;
        if (str == null || this.f14436OooO0O0 == null) {
            z = true;
        } else {
            ArrayList<o000OO.OooO00o> arrayList = o000OO.f36730OooO00o;
            String strOooO0OO = null;
            String strOooo0 = o000OOo0.Oooo0(str.trim());
            if (strOooo0.startsWith("avc1") || strOooo0.startsWith("avc3")) {
                strOooO0OO = "video/avc";
            } else if (strOooo0.startsWith("hev1") || strOooo0.startsWith("hvc1")) {
                strOooO0OO = "video/hevc";
            } else if (strOooo0.startsWith("dvav") || strOooo0.startsWith("dva1") || strOooo0.startsWith("dvhe") || strOooo0.startsWith("dvh1")) {
                strOooO0OO = "video/dolby-vision";
            } else if (strOooo0.startsWith("av01")) {
                strOooO0OO = "video/av01";
            } else if (strOooo0.startsWith("vp9") || strOooo0.startsWith("vp09")) {
                strOooO0OO = "video/x-vnd.on2.vp9";
            } else if (strOooo0.startsWith("vp8") || strOooo0.startsWith("vp08")) {
                strOooO0OO = "video/x-vnd.on2.vp8";
            } else if (strOooo0.startsWith("mp4a")) {
                if (strOooo0.startsWith("mp4a.") && (oooO0O0OooO0Oo = o000OO.OooO0Oo(strOooo0)) != null) {
                    strOooO0OO = o000OO.OooO0OO(oooO0O0OooO0Oo.f36732OooO00o);
                }
                if (strOooO0OO == null) {
                    strOooO0OO = "audio/mp4a-latm";
                }
            } else if (strOooo0.startsWith("ac-3") || strOooo0.startsWith("dac3")) {
                strOooO0OO = "audio/ac3";
            } else if (strOooo0.startsWith("ec-3") || strOooo0.startsWith("dec3")) {
                strOooO0OO = "audio/eac3";
            } else if (strOooo0.startsWith("ec+3")) {
                strOooO0OO = "audio/eac3-joc";
            } else if (strOooo0.startsWith("ac-4") || strOooo0.startsWith("dac4")) {
                strOooO0OO = "audio/ac4";
            } else if (strOooo0.startsWith("dtsc") || strOooo0.startsWith("dtse")) {
                strOooO0OO = "audio/vnd.dts";
            } else if (strOooo0.startsWith("dtsh") || strOooo0.startsWith("dtsl")) {
                strOooO0OO = "audio/vnd.dts.hd";
            } else if (strOooo0.startsWith("opus")) {
                strOooO0OO = "audio/opus";
            } else if (strOooo0.startsWith("vorbis")) {
                strOooO0OO = "audio/vorbis";
            } else if (strOooo0.startsWith("flac")) {
                strOooO0OO = "audio/flac";
            } else if (strOooo0.startsWith("stpp")) {
                strOooO0OO = "application/ttml+xml";
            } else if (strOooo0.startsWith("wvtt")) {
                strOooO0OO = "text/vtt";
            } else if (strOooo0.contains("cea708")) {
                strOooO0OO = "application/cea-708";
            } else if (strOooo0.contains("eia608") || strOooo0.contains("cea608")) {
                strOooO0OO = "application/cea-608";
            } else {
                int size = o000OO.f36730OooO00o.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull(o000OO.f36730OooO00o.get(i2));
                    if (strOooo0.startsWith(null)) {
                        break;
                    }
                }
            }
            if (strOooO0OO != null) {
                if (this.f14436OooO0O0.equals(strOooO0OO)) {
                    Pair<Integer, Integer> pairOooO0OO = MediaCodecUtil.OooO0OO(format);
                    if (pairOooO0OO != null) {
                        int iIntValue = ((Integer) pairOooO0OO.first).intValue();
                        int iIntValue2 = ((Integer) pairOooO0OO.second).intValue();
                        if (this.f14441OooO0oO || iIntValue == 42) {
                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrOooO0OO = OooO0OO();
                            int length = codecProfileLevelArrOooO0OO.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArrOooO0OO[i3];
                                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecProfileLevelArrOooO0OO;
                                    if (codecProfileLevel.profile != iIntValue || codecProfileLevel.level < iIntValue2) {
                                        i3++;
                                        codecProfileLevelArrOooO0OO = codecProfileLevelArr;
                                    }
                                } else {
                                    String str2 = format.f13129OoooOO0;
                                    StringBuilder sb = new StringBuilder(strOooO0OO.length() + o0OO00O.OooO00o(str2, 22));
                                    sb.append("codec.profileLevel, ");
                                    sb.append(str2);
                                    sb.append(", ");
                                    sb.append(strOooO0OO);
                                    OooO0oo(sb.toString());
                                }
                            }
                        }
                    }
                    z = true;
                } else {
                    String str3 = format.f13129OoooOO0;
                    StringBuilder sb2 = new StringBuilder(strOooO0OO.length() + o0OO00O.OooO00o(str3, 13));
                    sb2.append("codec.mime ");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(strOooO0OO);
                    OooO0oo(sb2.toString());
                }
                z = false;
            } else {
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        if (this.f14441OooO0oO) {
            int i4 = format.f13136Ooooo0o;
            if (i4 <= 0 || (i = format.f13137OooooO0) <= 0) {
                return true;
            }
            if (o000OOo0.f36740OooO00o >= 21) {
                return OooO0oO(i4, i, format.f13138OooooOO);
            }
            boolean z4 = i4 * i <= MediaCodecUtil.OooO();
            if (!z4) {
                int i5 = format.f13136Ooooo0o;
                int i6 = format.f13137OooooO0;
                StringBuilder sb3 = new StringBuilder(40);
                sb3.append("legacyFrameSize, ");
                sb3.append(i5);
                sb3.append("x");
                sb3.append(i6);
                OooO0oo(sb3.toString());
            }
            return z4;
        }
        int i7 = o000OOo0.f36740OooO00o;
        if (i7 >= 21) {
            int i8 = format.f13152ooOO;
            if (i8 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14438OooO0Oo;
                if (codecCapabilities == null) {
                    OooO0oo("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities != null) {
                        if (audioCapabilities.isSampleRateSupported(i8)) {
                            z3 = true;
                        } else {
                            StringBuilder sb4 = new StringBuilder(31);
                            sb4.append("sampleRate.support, ");
                            sb4.append(i8);
                            OooO0oo(sb4.toString());
                        }
                        if (z3) {
                        }
                        return false;
                    }
                    OooO0oo("sampleRate.aCaps");
                }
                z3 = false;
                if (z3) {
                }
                return false;
            }
            int i9 = format.f13150o0OoOo0;
            if (i9 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f14438OooO0Oo;
                if (codecCapabilities2 == null) {
                    OooO0oo("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        OooO0oo("channelCount.aCaps");
                    } else {
                        String str4 = this.f14435OooO00o;
                        String str5 = this.f14436OooO0O0;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i7 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                            int i10 = "audio/ac3".equals(str5) ? 6 : "audio/eac3".equals(str5) ? 16 : 30;
                            StringBuilder sb5 = new StringBuilder(o0OO00O.OooO00o(str4, 59));
                            sb5.append("AssumedMaxChannelAdjustment: ");
                            sb5.append(str4);
                            sb5.append(", [");
                            sb5.append(maxInputChannelCount);
                            sb5.append(" to ");
                            sb5.append(i10);
                            sb5.append("]");
                            Log.w("MediaCodecInfo", sb5.toString());
                            maxInputChannelCount = i10;
                        }
                        if (maxInputChannelCount < i9) {
                            StringBuilder sb6 = new StringBuilder(33);
                            sb6.append("channelCount.support, ");
                            sb6.append(i9);
                            OooO0oo(sb6.toString());
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            return false;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean OooO0o(Format format, Format format2, boolean z) {
        if (this.f14441OooO0oO) {
            String str = format.f13131OoooOOo;
            Objects.requireNonNull(str);
            return str.equals(format2.f13131OoooOOo) && format.f13139OooooOo == format2.f13139OooooOo && (this.f14440OooO0o0 || (format.f13136Ooooo0o == format2.f13136Ooooo0o && format.f13137OooooO0 == format2.f13137OooooO0)) && ((!z && format2.f13143Ooooooo == null) || o000OOo0.OooO00o(format.f13143Ooooooo, format2.f13143Ooooooo));
        }
        if ("audio/mp4a-latm".equals(this.f14436OooO0O0)) {
            String str2 = format.f13131OoooOOo;
            Objects.requireNonNull(str2);
            if (str2.equals(format2.f13131OoooOOo) && format.f13150o0OoOo0 == format2.f13150o0OoOo0 && format.f13152ooOO == format2.f13152ooOO) {
                Pair<Integer, Integer> pairOooO0OO = MediaCodecUtil.OooO0OO(format);
                Pair<Integer, Integer> pairOooO0OO2 = MediaCodecUtil.OooO0OO(format2);
                if (pairOooO0OO != null && pairOooO0OO2 != null) {
                    return ((Integer) pairOooO0OO.first).intValue() == 42 && ((Integer) pairOooO0OO2.first).intValue() == 42;
                }
            }
        }
        return false;
    }

    public final boolean OooO0o0(Format format) {
        if (this.f14441OooO0oO) {
            return this.f14440OooO0o0;
        }
        Pair<Integer, Integer> pairOooO0OO = MediaCodecUtil.OooO0OO(format);
        return pairOooO0OO != null && ((Integer) pairOooO0OO.first).intValue() == 42;
    }

    @RequiresApi(21)
    public final boolean OooO0oO(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f14438OooO0Oo;
        if (codecCapabilities == null) {
            OooO0oo("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            OooO0oo("sizeAndRate.vCaps");
            return false;
        }
        if (!OooO0O0(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f14435OooO00o) && "mcv5a".equals(o000OOo0.f36741OooO0O0)) ? false : true) && OooO0O0(videoCapabilities, i2, i, d)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(d);
                    String string = sb.toString();
                    String str = this.f14435OooO00o;
                    String str2 = this.f14436OooO0O0;
                    String str3 = o000OOo0.f36745OooO0o0;
                    StringBuilder sb2 = new StringBuilder(o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, o0OO00O.OooO00o(string, 25)))));
                    sb2.append("AssumedSupport [");
                    sb2.append(string);
                    sb2.append("] [");
                    sb2.append(str);
                    OooO0O0.OooO0O0.OooO00o(sb2, ", ", str2, "] [", str3);
                    sb2.append("]");
                    Log.d("MediaCodecInfo", sb2.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.support, ");
            sb3.append(i);
            sb3.append("x");
            sb3.append(i2);
            sb3.append("x");
            sb3.append(d);
            OooO0oo(sb3.toString());
            return false;
        }
        return true;
    }

    public final void OooO0oo(String str) {
        String str2 = this.f14435OooO00o;
        String str3 = this.f14436OooO0O0;
        String str4 = o000OOo0.f36745OooO0o0;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str4, o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 20)))));
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        OooO0O0.OooO0O0.OooO00o(sb, ", ", str3, "] [", str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    public final String toString() {
        return this.f14435OooO00o;
    }
}
