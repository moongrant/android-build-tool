package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6065OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6066OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6067OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6068OooO0Oo = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplBase() {
    }

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f6066OooO0O0 != audioAttributesImplBase.f6066OooO0O0) {
            return false;
        }
        int i2 = this.f6067OooO0OO;
        int i3 = audioAttributesImplBase.f6067OooO0OO;
        int i4 = audioAttributesImplBase.f6068OooO0Oo;
        if (i4 == -1) {
            int i5 = audioAttributesImplBase.f6065OooO00o;
            int i6 = AudioAttributesCompat.f6061OooO0O0;
            if ((i3 & 1) != 1) {
                i = 4;
                if ((i3 & 4) != 4) {
                    switch (i5) {
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 11:
                            i = 10;
                            break;
                        case 12:
                        default:
                            i = 3;
                            break;
                        case 13:
                            i = 1;
                            break;
                    }
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
        } else {
            i = i4;
        }
        if (i == 6) {
            i3 |= 4;
        } else if (i == 7) {
            i3 |= 1;
        }
        return i2 == (i3 & 273) && this.f6065OooO00o == audioAttributesImplBase.f6065OooO00o && this.f6068OooO0Oo == i4;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6066OooO0O0), Integer.valueOf(this.f6067OooO0OO), Integer.valueOf(this.f6065OooO00o), Integer.valueOf(this.f6068OooO0Oo)});
    }

    @NonNull
    public final String toString() {
        String strOooO00o;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f6068OooO0Oo != -1) {
            sb.append(" stream=");
            sb.append(this.f6068OooO0Oo);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f6065OooO00o;
        int i2 = AudioAttributesCompat.f6061OooO0O0;
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
        sb.append(this.f6066OooO0O0);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f6067OooO0OO).toUpperCase());
        return sb.toString();
    }
}
