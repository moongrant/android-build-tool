package p022Oooo00O;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.OooO;
import androidx.camera.core.impl.OooOO0;
import androidx.camera.core.impl.o0000O;
import androidx.camera.core.impl.o0000OO0;
import java.util.ArrayList;
import java.util.HashMap;
import p021Oooo.OooOO0O;
import p024Oooo0O0.o000O0O0;
import p024Oooo0O0.o000OO;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo00o implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f895OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f896OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f897OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f898OooO0Oo = new HashMap();

    @RequiresApi(31)
    public static class OooO00o {
        @DoNotInline
        public static EncoderProfiles OooO00o(String str, int i) {
            return CamcorderProfile.getAll(str, i);
        }
    }

    public oo00o(@NonNull String str) {
        boolean z;
        int i;
        this.f896OooO0O0 = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            o00O0O0.OooO0oo("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.f895OooO00o = z;
        this.f897OooO0OO = i;
    }

    @Override // androidx.camera.core.impl.o0000O
    public final boolean OooO00o(int i) {
        if (this.f895OooO00o) {
            return CamcorderProfile.hasProfile(this.f897OooO0OO, i);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00a0, please report this as an issue */
    @Override // androidx.camera.core.impl.o0000O
    @Nullable
    public final EncoderProfilesProxy OooO0O0(int i) {
        CamcorderProfile camcorderProfile;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        OooOO0 oooOO0OooO00o;
        OooOO0 oooOO0OooO0o0 = null;
        if (!this.f895OooO00o) {
            return null;
        }
        int i6 = this.f897OooO0OO;
        if (!CamcorderProfile.hasProfile(i6, i)) {
            return null;
        }
        HashMap map = this.f898OooO0Oo;
        if (map.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31) {
            try {
                camcorderProfile = CamcorderProfile.get(i6, i);
            } catch (RuntimeException e) {
                o00O0O0.OooO("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i, e);
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    o00O0O0.OooO0oo("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                }
                int i8 = camcorderProfile.duration;
                int i9 = camcorderProfile.fileFormat;
                ArrayList arrayList = new ArrayList();
                i3 = camcorderProfile.audioCodec;
                switch (i3) {
                    case 1:
                        str = "audio/3gpp";
                        break;
                    case 2:
                        str = "audio/amr-wb";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str = "audio/mp4a-latm";
                        break;
                    case 6:
                        str = "audio/vorbis";
                        break;
                    case 7:
                        str = "audio/opus";
                        break;
                    default:
                        str = "audio/none";
                        break;
                }
                String str2 = str;
                int i10 = camcorderProfile.audioBitRate;
                int i11 = camcorderProfile.audioSampleRate;
                int i12 = camcorderProfile.audioChannels;
                if (i3 != 3) {
                    i5 = 5;
                    if (i3 != 4) {
                        if (i3 != 5) {
                            i4 = -1;
                        } else {
                            i4 = 39;
                        }
                    }
                    arrayList.add(new OooO(i3, str2, i10, i11, i12, i5));
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = camcorderProfile.videoCodec;
                    arrayList2.add(EncoderProfilesProxy.VideoProfileProxy.OooO00o(i13, o0000OO0.OooO00o(i13), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(i8, i9, arrayList, arrayList2);
                } else {
                    i4 = 2;
                }
                i5 = i4;
                arrayList.add(new OooO(i3, str2, i10, i11, i12, i5));
                ArrayList arrayList3 = new ArrayList();
                int i14 = camcorderProfile.videoCodec;
                arrayList3.add(EncoderProfilesProxy.VideoProfileProxy.OooO00o(i14, o0000OO0.OooO00o(i14), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(i8, i9, arrayList, arrayList3);
            }
        } else {
            EncoderProfiles encoderProfilesOooO00o = OooO00o.OooO00o(this.f896OooO0O0, i);
            if (encoderProfilesOooO00o != null) {
                if (o000OO.OooO00o(o000O0O0.class) != null) {
                    o00O0O0.OooO00o("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                } else {
                    try {
                        if (i7 >= 33) {
                            oooOO0OooO00o = OooOO0O.OooO00o(encoderProfilesOooO00o);
                        } else {
                            if (i7 < 31) {
                                throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i7 + ". Version 31 or higher required.");
                            }
                            oooOO0OooO00o = p021Oooo.OooOO0.OooO00o(encoderProfilesOooO00o);
                        }
                        oooOO0OooO0o0 = oooOO0OooO00o;
                    } catch (NullPointerException e2) {
                        o00O0O0.OooO("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e2);
                        camcorderProfile = CamcorderProfile.get(i6, i);
                        if (camcorderProfile != null) {
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                o00O0O0.OooO0oo("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                            }
                            int i15 = camcorderProfile.duration;
                            int i16 = camcorderProfile.fileFormat;
                            ArrayList arrayList4 = new ArrayList();
                            i3 = camcorderProfile.audioCodec;
                            switch (i3) {
                                case 1:
                                    str = "audio/3gpp";
                                    break;
                                case 2:
                                    str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    str = "audio/mp4a-latm";
                                    break;
                                case 6:
                                    str = "audio/vorbis";
                                    break;
                                case 7:
                                    str = "audio/opus";
                                    break;
                                default:
                                    str = "audio/none";
                                    break;
                            }
                            String str3 = str;
                            int i17 = camcorderProfile.audioBitRate;
                            int i18 = camcorderProfile.audioSampleRate;
                            int i19 = camcorderProfile.audioChannels;
                            if (i3 != 3) {
                                i5 = 5;
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        i4 = -1;
                                    } else {
                                        i4 = 39;
                                    }
                                }
                                arrayList4.add(new OooO(i3, str3, i17, i18, i19, i5));
                                ArrayList arrayList5 = new ArrayList();
                                int i110 = camcorderProfile.videoCodec;
                                arrayList5.add(EncoderProfilesProxy.VideoProfileProxy.OooO00o(i110, o0000OO0.OooO00o(i110), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                                oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(i15, i16, arrayList4, arrayList5);
                            } else {
                                i4 = 2;
                            }
                            i5 = i4;
                            arrayList4.add(new OooO(i3, str3, i17, i18, i19, i5));
                            ArrayList arrayList6 = new ArrayList();
                            int i111 = camcorderProfile.videoCodec;
                            arrayList6.add(EncoderProfilesProxy.VideoProfileProxy.OooO00o(i111, o0000OO0.OooO00o(i111), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(i15, i16, arrayList4, arrayList6);
                        }
                    }
                }
                camcorderProfile = CamcorderProfile.get(i6, i);
                if (camcorderProfile != null) {
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        o00O0O0.OooO0oo("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                    }
                    int i112 = camcorderProfile.duration;
                    int i113 = camcorderProfile.fileFormat;
                    ArrayList arrayList7 = new ArrayList();
                    i3 = camcorderProfile.audioCodec;
                    switch (i3) {
                        case 1:
                            str = "audio/3gpp";
                            break;
                        case 2:
                            str = "audio/amr-wb";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = "audio/mp4a-latm";
                            break;
                        case 6:
                            str = "audio/vorbis";
                            break;
                        case 7:
                            str = "audio/opus";
                            break;
                        default:
                            str = "audio/none";
                            break;
                    }
                    String str4 = str;
                    int i114 = camcorderProfile.audioBitRate;
                    int i115 = camcorderProfile.audioSampleRate;
                    int i116 = camcorderProfile.audioChannels;
                    if (i3 != 3) {
                        i5 = 5;
                        if (i3 != 4) {
                            if (i3 != 5) {
                                i4 = -1;
                            } else {
                                i4 = 39;
                            }
                        }
                        arrayList7.add(new OooO(i3, str4, i114, i115, i116, i5));
                        ArrayList arrayList8 = new ArrayList();
                        int i117 = camcorderProfile.videoCodec;
                        arrayList8.add(EncoderProfilesProxy.VideoProfileProxy.OooO00o(i117, o0000OO0.OooO00o(i117), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(i112, i113, arrayList7, arrayList8);
                    } else {
                        i4 = 2;
                    }
                    i5 = i4;
                    arrayList7.add(new OooO(i3, str4, i114, i115, i116, i5));
                    ArrayList arrayList9 = new ArrayList();
                    int i118 = camcorderProfile.videoCodec;
                    arrayList9.add(EncoderProfilesProxy.VideoProfileProxy.OooO00o(i118, o0000OO0.OooO00o(i118), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(i112, i113, arrayList7, arrayList9);
                }
            }
        }
        map.put(Integer.valueOf(i), oooOO0OooO0o0);
        return oooOO0OooO0o0;
    }
}
