package o000O;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import androidx.media3.extractor.Extractor;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o implements androidx.media3.exoplayer.source.Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.o0OoOo0 f33829OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Extractor f33830OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o000OOoO.OooOO0O f33831OooO0OO;

    public OooO00o(o000OOoO.o0OoOo0 o0oooo1) {
        this.f33829OooO00o = o0oooo1;
    }

    public final long OooO00o() {
        o000OOoO.OooOO0O oooOO0O = this.f33831OooO0OO;
        if (oooOO0O != null) {
            return oooOO0O.f34678OooO0Oo;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    public final void OooO0O0(androidx.media3.datasource.OooO00o oooO00o, Uri uri, Map map, long j, long j2, o000OOoO.Oooo0 oooo0) throws IOException {
        o000OOoO.OooOO0O oooOO0O = new o000OOoO.OooOO0O(oooO00o, j, j2);
        this.f33831OooO0OO = oooOO0O;
        if (this.f33830OooO0O0 != null) {
            return;
        }
        Extractor[] extractorArrOooO00o = this.f33829OooO00o.OooO00o(uri, map);
        boolean z = true;
        if (extractorArrOooO00o.length == 1) {
            this.f33830OooO0O0 = extractorArrOooO00o[0];
        } else {
            for (Extractor extractor : extractorArrOooO00o) {
                try {
                    if (extractor.OooO0o(oooOO0O)) {
                        this.f33830OooO0O0 = extractor;
                        oooOO0O.f34679OooO0o = 0;
                        break;
                    }
                    boolean z2 = this.f33830OooO0O0 != null || oooOO0O.f34678OooO0Oo == j;
                    p080o000OoO.o00Oo0.OooO0Oo(z2);
                    oooOO0O.f34679OooO0o = 0;
                } catch (EOFException unused) {
                    if (this.f33830OooO0O0 != null || oooOO0O.f34678OooO0Oo == j) {
                    }
                } catch (Throwable th) {
                    if (this.f33830OooO0O0 == null && oooOO0O.f34678OooO0Oo != j) {
                        z = false;
                    }
                    p080o000OoO.o00Oo0.OooO0Oo(z);
                    oooOO0O.f34679OooO0o = 0;
                    throw th;
                }
                p080o000OoO.o00Oo0.OooO0Oo(z2);
                oooOO0O.f34679OooO0o = 0;
            }
            if (this.f33830OooO0O0 == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i = o00.f34910OooO00o;
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < extractorArrOooO00o.length; i2++) {
                    sb2.append(extractorArrOooO00o[i2].getClass().getSimpleName());
                    if (i2 < extractorArrOooO00o.length - 1) {
                        sb2.append(", ");
                    }
                }
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(string);
            }
        }
        this.f33830OooO0O0.OooO0OO(oooo0);
    }
}
