package o000O00O;

import android.net.Uri;
import androidx.media3.common.Player;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.yalla.yalla.model.http.ApiError;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O0O0 implements o000OoO.o00000O0.OooO00o, o000OOoO.o0OoOo0, androidx.media3.session.o000OOo0.OooO00o {
    public static ApiError OooO0Oo(String str, String str2, CancellationException cancellationException, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        p598o0oo00Oo.o0000O00.OooO0o0(str, str2, cancellationException);
        return new ApiError(i, str3, str4, i2, defaultConstructorMarker);
    }

    @Override // o000OOoO.o0OoOo0
    public Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0OO();
    }

    @Override // androidx.media3.session.o000OOo0.OooO00o
    public void OooO0O0(androidx.media3.session.o0000OO0 o0000oo1) {
        new o000Oo0.OooO0OO();
        o0000oo1.getClass();
        throw null;
    }

    public Extractor[] OooO0OO() {
        return new Extractor[]{new Mp3Extractor()};
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((Player.OooO0OO) obj).onRenderedFirstFrame();
    }
}
