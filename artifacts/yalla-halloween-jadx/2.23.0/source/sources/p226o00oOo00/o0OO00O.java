package p226o00oOo00;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.source.Oooo000;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.OooO00o;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0OO0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OO00O implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0OO0 f39897OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Extractor f39898OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o00O00o0 f39899OooO0OO;

    public o0OO00O(o00O0OO0 o00o0oo1) {
        this.f39897OooO00o = o00o0oo1;
    }

    public final long OooO00o() {
        o00O00o0 o00o00o1 = this.f39899OooO0OO;
        if (o00o00o1 != null) {
            return o00o00o1.f39532OooO0Oo;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    public final void OooO0O0(OooO00o oooO00o, Uri uri, Map map, long j, long j2, o00O0O0 o00o0o0) throws IOException {
        o00O00o0 o00o00o1 = new o00O00o0(oooO00o, j, j2);
        this.f39899OooO0OO = o00o00o1;
        if (this.f39898OooO0O0 != null) {
            return;
        }
        Extractor[] extractorArrOooO00o = this.f39897OooO00o.OooO00o(uri, map);
        boolean z = true;
        if (extractorArrOooO00o.length == 1) {
            this.f39898OooO0O0 = extractorArrOooO00o[0];
        } else {
            for (Extractor extractor : extractorArrOooO00o) {
                try {
                    if (extractor.OooO0Oo(o00o00o1)) {
                        this.f39898OooO0O0 = extractor;
                        o00o00o1.f39533OooO0o = 0;
                        break;
                    }
                    boolean z2 = this.f39898OooO0O0 != null || o00o00o1.f39532OooO0Oo == j;
                    o00O000o.OooO0Oo(z2);
                    o00o00o1.f39533OooO0o = 0;
                } catch (EOFException unused) {
                    if (this.f39898OooO0O0 != null || o00o00o1.f39532OooO0Oo == j) {
                    }
                } catch (Throwable th) {
                    if (this.f39898OooO0O0 == null && o00o00o1.f39532OooO0Oo != j) {
                        z = false;
                    }
                    o00O000o.OooO0Oo(z);
                    o00o00o1.f39533OooO0o = 0;
                    throw th;
                }
                o00O000o.OooO0Oo(z2);
                o00o00o1.f39533OooO0o = 0;
            }
            if (this.f39898OooO0O0 == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                int i = o0O00.f40595OooO00o;
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
        this.f39898OooO0O0.OooO0oo(o00o0o0);
    }
}
