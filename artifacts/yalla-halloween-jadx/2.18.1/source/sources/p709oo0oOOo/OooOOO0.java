package p709oo0oOOo;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.net.URLDecoder;
import o0OOOO0o.OooO0o;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public byte[] f53382OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public DataSpec f53383OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f53384OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f53385OooO0oo;

    public OooOOO0() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO0o(DataSpec dataSpec) throws IOException {
        OooOOo0(dataSpec);
        this.f53383OooO0o0 = dataSpec;
        this.f53385OooO0oo = (int) dataSpec.f14805OooO0o;
        Uri uri = dataSpec.f14801OooO00o;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            String strValueOf = String.valueOf(scheme);
            throw new ParserException(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "));
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = o000OOo0.f36740OooO00o;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(strValueOf2);
            throw new ParserException(sb.toString());
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f53382OooO0o = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String strValueOf3 = String.valueOf(str);
                throw new ParserException(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e);
            }
        } else {
            this.f53382OooO0o = o000OOo0.OooOoO0(URLDecoder.decode(str, OooO0o.f38230OooO00o.name()));
        }
        long j = dataSpec.f14807OooO0oO;
        int length = j != -1 ? ((int) j) + this.f53385OooO0oo : this.f53382OooO0o.length;
        this.f53384OooO0oO = length;
        if (length > this.f53382OooO0o.length || this.f53385OooO0oo > length) {
            this.f53382OooO0o = null;
            throw new DataSourceException();
        }
        OooOOo(dataSpec);
        return ((long) this.f53384OooO0oO) - ((long) this.f53385OooO0oo);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0o() {
        DataSpec dataSpec = this.f53383OooO0o0;
        if (dataSpec != null) {
            return dataSpec.f14801OooO00o;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
        if (this.f53382OooO0o != null) {
            this.f53382OooO0o = null;
            OooOOOo();
        }
        this.f53383OooO0o0 = null;
    }

    @Override // p709oo0oOOo.OooOO0O
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f53384OooO0oO - this.f53385OooO0oo;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f53382OooO0o;
        int i4 = o000OOo0.f36740OooO00o;
        System.arraycopy(bArr2, this.f53385OooO0oo, bArr, i, iMin);
        this.f53385OooO0oo += iMin;
        OooOOOO(iMin);
        return iMin;
    }
}
