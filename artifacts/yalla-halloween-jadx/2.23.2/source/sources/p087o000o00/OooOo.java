package p087o000o00;

import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import io.opentelemetry.compat.Predicate;
import java.util.Map;
import o000OOoO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOo implements o0OoOo0, Predicate {
    @Override // o000OOoO.o0OoOo0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0OO();
    }

    @Override // io.opentelemetry.compat.Predicate
    public final boolean OooO0O0(Object obj) {
        return true;
    }

    public final Extractor[] OooO0OO() {
        return new Extractor[]{new MatroskaExtractor()};
    }
}
