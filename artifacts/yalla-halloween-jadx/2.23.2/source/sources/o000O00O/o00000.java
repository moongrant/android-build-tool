package o000O00O;

import android.database.Cursor;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.extractor.Extractor;
import java.lang.reflect.Constructor;
import p233o00oOoOO.o0OoOoOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000 implements o000OoO.o00000O0.OooO00o, o000OOoO.OooOOO.OooO00o.InterfaceC0402OooO00o, o00oo0o0.o000OO00.OooO00o {
    @Override // o000OOoO.OooOOO.OooO00o.InterfaceC0402OooO00o
    public final Constructor OooO00o() {
        int[] iArr = o000OOoO.OooOOO.f34683OooO0o0;
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        o0OoOoOo o0oooooo = p248o00oo0o0.o000OO00.f40194OooO;
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerError(new ExoPlaybackException(2, new ExoTimeoutException(1), 1003));
    }
}
