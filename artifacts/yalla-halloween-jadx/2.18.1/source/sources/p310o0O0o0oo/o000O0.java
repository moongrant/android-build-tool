package p310o0O0o0oo;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p296o0O0OoO0.Oooo000;
import p296o0O0OoO0.o00O0O;
import p296o0O0OoO0.o0OoOo0;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p709oo0oOOo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O f36265OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Extractor f36266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Oooo000 f36267OooO0OO;

    public o000O0(o00O0O o00o0o2) {
        this.f36265OooO00o = o00o0o2;
    }

    public final long OooO00o() {
        Oooo000 oooo000 = this.f36267OooO0OO;
        if (oooo000 != null) {
            return oooo000.f35894OooO0Oo;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    public final void OooO0O0(OooOO0O oooOO0O, Uri uri, Map<String, List<String>> map, long j, long j2, o0OoOo0 o0oooo1) throws IOException {
        Oooo000 oooo000 = new Oooo000(oooOO0O, j, j2);
        this.f36267OooO0OO = oooo000;
        if (this.f36266OooO0O0 != null) {
            return;
        }
        Extractor[] extractorArrOooO0O0 = this.f36265OooO00o.OooO0O0(uri, map);
        boolean z = true;
        if (extractorArrOooO0O0.length == 1) {
            this.f36266OooO0O0 = extractorArrOooO0O0[0];
        } else {
            for (Extractor extractor : extractorArrOooO0O0) {
                try {
                    if (extractor.OooO0o(oooo000)) {
                        this.f36266OooO0O0 = extractor;
                        oooo000.f35895OooO0o = 0;
                        break;
                    } else {
                        boolean z2 = this.f36266OooO0O0 != null || oooo000.f35894OooO0Oo == j;
                        o00000O0.OooO0Oo(z2);
                        oooo000.f35895OooO0o = 0;
                    }
                } catch (EOFException unused) {
                    if (this.f36266OooO0O0 != null || oooo000.f35894OooO0Oo == j) {
                    }
                } catch (Throwable th) {
                    if (this.f36266OooO0O0 == null && oooo000.f35894OooO0Oo != j) {
                        z = false;
                    }
                    o00000O0.OooO0Oo(z);
                    oooo000.f35895OooO0o = 0;
                    throw th;
                }
                o00000O0.OooO0Oo(z2);
                oooo000.f35895OooO0o = 0;
            }
            if (this.f36266OooO0O0 == null) {
                int i = o000OOo0.f36740OooO00o;
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < extractorArrOooO0O0.length; i2++) {
                    sb.append(extractorArrOooO0O0[i2].getClass().getSimpleName());
                    if (i2 < extractorArrOooO0O0.length - 1) {
                        sb.append(", ");
                    }
                }
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder(o0OO00O.OooO00o(string, 58));
                sb2.append("None of the available extractors (");
                sb2.append(string);
                sb2.append(") could read the stream.");
                String string2 = sb2.toString();
                Objects.requireNonNull(uri);
                throw new UnrecognizedInputFormatException(string2);
            }
        }
        this.f36266OooO0O0.OooO(o0oooo1);
    }
}
