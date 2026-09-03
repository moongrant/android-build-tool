package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6097OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6098OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6099OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6100OooO0Oo = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
    }

    public final int OooO00o() {
        int i = this.f6099OooO0OO;
        int i2 = this.f6100OooO0Oo;
        if (i2 == -1) {
            int i3 = this.f6097OooO00o;
            int i4 = AudioAttributesCompat.f6093OooO0O0;
            if ((i & 1) != 1) {
                if ((i & 4) != 4) {
                    switch (i3) {
                        case 2:
                            i2 = 0;
                            break;
                        case 3:
                            i2 = 8;
                            break;
                        case 4:
                            i2 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 2;
                            break;
                        case 11:
                            i2 = 10;
                            break;
                        case 12:
                        default:
                            i2 = 3;
                            break;
                        case 13:
                            i2 = 1;
                            break;
                    }
                } else {
                    i2 = 6;
                }
            } else {
                i2 = 7;
            }
        }
        if (i2 == 6) {
            i |= 4;
        } else if (i2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f6098OooO0O0 == audioAttributesImplBase.f6098OooO0O0 && this.f6099OooO0OO == audioAttributesImplBase.OooO00o() && this.f6097OooO00o == audioAttributesImplBase.f6097OooO00o && this.f6100OooO0Oo == audioAttributesImplBase.f6100OooO0Oo;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6098OooO0O0), Integer.valueOf(this.f6099OooO0OO), Integer.valueOf(this.f6097OooO00o), Integer.valueOf(this.f6100OooO0Oo)});
    }

    @NonNull
    public final String toString() {
        String strOooO00o;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f6100OooO0Oo != -1) {
            sb.append(" stream=");
            sb.append(this.f6100OooO0Oo);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f6097OooO00o;
        int i2 = AudioAttributesCompat.f6093OooO0O0;
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
        sb.append(this.f6098OooO0O0);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6099OooO0OO).toUpperCase());
        return sb.toString();
    }
}
