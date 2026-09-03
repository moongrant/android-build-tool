package p045Oooooo;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.OooOOOO;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class OooOO0O implements o00Ooo {

    @AutoValue.Builder
    public static abstract class OooO00o {
        @NonNull
        public final OooOOO OooO00o() {
            OooOOO.OooO00o oooO00o = (OooOOO.OooO00o) this;
            String strOooO00o = oooO00o.f1818OooO00o == null ? " mimeType" : "";
            if (oooO00o.f1819OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" profile");
            }
            if (oooO00o.f1820OooO0OO == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " inputTimebase");
            }
            if (oooO00o.f1821OooO0Oo == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " bitrate");
            }
            if (oooO00o.f1823OooO0o0 == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " sampleRate");
            }
            if (oooO00o.f1822OooO0o == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " channelCount");
            }
            if (!strOooO00o.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
            }
            OooOOO oooOOO = new OooOOO(oooO00o.f1818OooO00o, oooO00o.f1819OooO0O0.intValue(), oooO00o.f1820OooO0OO, oooO00o.f1821OooO0Oo.intValue(), oooO00o.f1823OooO0o0.intValue(), oooO00o.f1822OooO0o.intValue());
            if (Objects.equals(oooOOO.f1812OooO00o, "audio/mp4a-latm") && oooOOO.f1813OooO0O0 == -1) {
                throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
            }
            return oooOOO;
        }
    }

    @Override // p045Oooooo.o00Ooo
    @NonNull
    public final MediaFormat OooO00o() {
        int iOooO0oO = OooO0oO();
        int iOooO0o0 = OooO0o0();
        String str = ((OooOOO) this).f1812OooO00o;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, iOooO0oO, iOooO0o0);
        mediaFormatCreateAudioFormat.setInteger("bitrate", OooO0Oo());
        if (OooO0o() != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", OooO0o());
            } else {
                mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, OooO0o());
            }
        }
        return mediaFormatCreateAudioFormat;
    }

    public abstract int OooO0Oo();

    public abstract int OooO0o();

    public abstract int OooO0o0();

    public abstract int OooO0oO();
}
