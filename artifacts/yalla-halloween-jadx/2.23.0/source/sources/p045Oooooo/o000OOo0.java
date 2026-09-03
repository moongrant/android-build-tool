package p045Oooooo;

import android.media.MediaFormat;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class o000OOo0 implements o00Ooo {

    @AutoValue.Builder
    public static abstract class OooO00o {
    }

    @NonNull
    public static OooOOOO.OooO00o OooO0Oo() {
        OooOOOO.OooO00o oooO00o = new OooOOOO.OooO00o();
        oooO00o.f1848OooO0O0 = -1;
        oooO00o.f1854OooO0oo = 1;
        oooO00o.f1852OooO0o0 = 2130708361;
        OooOo00 oooOo00 = o00.f1862OooO00o;
        if (oooOo00 == null) {
            throw new NullPointerException("Null dataSpace");
        }
        oooO00o.f1851OooO0o = oooOo00;
        return oooO00o;
    }

    public abstract int OooO();

    @Override // p045Oooooo.o00Ooo
    @NonNull
    public final MediaFormat OooO00o() {
        Size sizeOooOO0O = OooOO0O();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(((OooOOOO) this).f1838OooO00o, sizeOooOO0O.getWidth(), sizeOooOO0O.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", OooO0o());
        mediaFormatCreateVideoFormat.setInteger("bitrate", OooO0o0());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", OooO0oo());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", OooO());
        if (OooOO0() != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, OooOO0());
        }
        o00 o00VarOooO0oO = OooO0oO();
        if (o00VarOooO0oO.OooO0O0() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", o00VarOooO0oO.OooO0O0());
        }
        if (o00VarOooO0oO.OooO0OO() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", o00VarOooO0oO.OooO0OO());
        }
        if (o00VarOooO0oO.OooO00o() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", o00VarOooO0oO.OooO00o());
        }
        return mediaFormatCreateVideoFormat;
    }

    public abstract int OooO0o();

    public abstract int OooO0o0();

    @NonNull
    public abstract o00 OooO0oO();

    public abstract int OooO0oo();

    public abstract int OooOO0();

    @NonNull
    public abstract Size OooOO0O();
}
