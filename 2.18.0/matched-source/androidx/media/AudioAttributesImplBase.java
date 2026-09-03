package androidx.media;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f8569OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f8570OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f8571OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8572OooO0Oo = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f8570OooO0O0 != audioAttributesImplBase.f8570OooO0O0) {
            return false;
        }
        int i = this.f8571OooO0OO;
        int i2 = audioAttributesImplBase.f8571OooO0OO;
        int i3 = audioAttributesImplBase.f8572OooO0Oo;
        int i4 = 4;
        if (i3 == -1) {
            int i5 = audioAttributesImplBase.f8569OooO00o;
            int i6 = AudioAttributesCompat.f8565OooO0O0;
            if ((i2 & 1) != 1) {
                if ((i2 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i4 = 0;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 2;
                            break;
                        case 11:
                            i4 = 10;
                            break;
                        case 12:
                        default:
                            i4 = 3;
                            break;
                        case 13:
                            i4 = 1;
                            break;
                    }
                } else {
                    i4 = 6;
                }
            } else {
                i4 = 7;
            }
        } else {
            i4 = i3;
        }
        if (i4 == 6) {
            i2 |= 4;
        } else if (i4 == 7) {
            i2 |= 1;
        }
        return i == (i2 & 273) && this.f8569OooO00o == audioAttributesImplBase.f8569OooO00o && this.f8572OooO0Oo == i3;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8570OooO0O0), Integer.valueOf(this.f8571OooO0OO), Integer.valueOf(this.f8569OooO00o), Integer.valueOf(this.f8572OooO0Oo)});
    }

    public final String toString() {
        String strOooO00o;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f8572OooO0Oo != -1) {
            sb.append(" stream=");
            sb.append(this.f8572OooO0Oo);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f8569OooO00o;
        int i2 = AudioAttributesCompat.f8565OooO0O0;
        switch (i) {
            case 0:
                strOooO00o = "USAGE_UNKNOWN";
                break;
            case 1:
                strOooO00o = "USAGE_MEDIA";
                break;
            case 2:
                strOooO00o = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strOooO00o = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strOooO00o = "USAGE_ALARM";
                break;
            case 5:
                strOooO00o = "USAGE_NOTIFICATION";
                break;
            case 6:
                strOooO00o = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strOooO00o = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strOooO00o = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strOooO00o = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strOooO00o = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strOooO00o = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strOooO00o = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strOooO00o = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strOooO00o = "USAGE_GAME";
                break;
            case 15:
            default:
                strOooO00o = android.support.v4.media.OooO00o.OooO00o("unknown usage ", i);
                break;
            case 16:
                strOooO00o = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strOooO00o);
        sb.append(" content=");
        sb.append(this.f8570OooO0O0);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f8571OooO0OO).toUpperCase());
        return sb.toString();
    }
}
