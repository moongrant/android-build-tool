package p244o00oo0Oo;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0O;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.common.base.OooO;
import java.io.IOException;
import java.net.URLDecoder;
import p022Oooo00O.o00O00OO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0000 extends o000OO00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public byte[] f40476OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public DataSpec f40477OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f40478OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f40479OooO0oo;

    public o00O0000() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        OooOOO(dataSpec);
        this.f40477OooO0o0 = dataSpec;
        Uri uriNormalizeScheme = dataSpec.f14161OooO00o.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        o00O000o.OooO0O0("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = o0O00.f40595OooO00o;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(o0000O0O.OooO00o("Unexpected URI format: ", uriNormalizeScheme), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f40476OooO0o = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(o00O00OO.OooO00o("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f40476OooO0o = o0O00.OooOoo0(URLDecoder.decode(str, OooO.f19057OooO00o.name()));
        }
        byte[] bArr = this.f40476OooO0o;
        long length = bArr.length;
        long j = dataSpec.f14165OooO0o;
        if (j > length) {
            this.f40476OooO0o = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j;
        this.f40478OooO0oO = i2;
        int length2 = bArr.length - i2;
        this.f40479OooO0oo = length2;
        long j2 = dataSpec.f14167OooO0oO;
        if (j2 != -1) {
            this.f40479OooO0oo = (int) Math.min(length2, j2);
        }
        OooOOOO(dataSpec);
        return j2 != -1 ? j2 : this.f40479OooO0oo;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        DataSpec dataSpec = this.f40477OooO0o0;
        if (dataSpec != null) {
            return dataSpec.f14161OooO00o;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.OooO00o
    public final void close() {
        if (this.f40476OooO0o != null) {
            this.f40476OooO0o = null;
            OooOOO0();
        }
        this.f40477OooO0o0 = null;
    }

    @Override // p244o00oo0Oo.o00
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f40479OooO0oo;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f40476OooO0o;
        int i4 = o0O00.f40595OooO00o;
        System.arraycopy(bArr2, this.f40478OooO0oO, bArr, i, iMin);
        this.f40478OooO0oO += iMin;
        this.f40479OooO0oo -= iMin;
        OooOO0o(iMin);
        return iMin;
    }
}
