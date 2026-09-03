package o0000O0O;

import androidx.media3.extractor.mp4.Track;
import com.yalla.yalla.model.http.Response;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import p475o0Ooooo0.oO0O000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements com.google.common.base.OooOOO {
    public static /* bridge */ /* synthetic */ void OooO00o(Object obj, int i, int i2, int i3) {
        throw null;
    }

    public static void OooO0O0(oO0O000o oo0o000o, Response response, CancellableContinuation cancellableContinuation) {
        oo0o000o.getClass();
        cancellableContinuation.resumeWith(Result.m4215constructorimpl(oO0O000o.OooO0O0(response)));
    }

    @Override // com.google.common.base.OooOOO
    public Object apply(Object obj) {
        return (Track) obj;
    }
}
