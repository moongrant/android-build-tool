package o000O0O;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0O;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.net.URLDecoder;
import p022Oooo00O.o00O00OO;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO0O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public byte[] f34168OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public DataSpec f34169OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f34170OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f34171OooO0oo;

    public OooO0O0() {
        super(false);
    }

    @Override // androidx.media3.datasource.OooO00o
    public final long OooO00o(DataSpec dataSpec) throws IOException {
        OooOOO(dataSpec);
        this.f34169OooO0o0 = dataSpec;
        Uri uriNormalizeScheme = dataSpec.f6970OooO00o.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        o00Oo0.OooO0O0("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = o00.f34910OooO00o;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(o0000O0O.OooO00o("Unexpected URI format: ", uriNormalizeScheme), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f34168OooO0o = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(o00O00OO.OooO00o("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f34168OooO0o = o00.OooOoo(URLDecoder.decode(str, com.google.common.base.OooOO0.f18590OooO00o.name()));
        }
        byte[] bArr = this.f34168OooO0o;
        long length = bArr.length;
        long j = dataSpec.f6974OooO0o;
        if (j > length) {
            this.f34168OooO0o = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j;
        this.f34170OooO0oO = i2;
        int length2 = bArr.length - i2;
        this.f34171OooO0oo = length2;
        long j2 = dataSpec.f6976OooO0oO;
        if (j2 != -1) {
            this.f34171OooO0oo = (int) Math.min(length2, j2);
        }
        OooOOOO(dataSpec);
        return j2 != -1 ? j2 : this.f34171OooO0oo;
    }

    @Override // androidx.media3.datasource.OooO00o
    @Nullable
    public final Uri OooOO0O() {
        DataSpec dataSpec = this.f34169OooO0o0;
        if (dataSpec != null) {
            return dataSpec.f6970OooO00o;
        }
        return null;
    }

    @Override // androidx.media3.datasource.OooO00o
    public final void close() {
        if (this.f34168OooO0o != null) {
            this.f34168OooO0o = null;
            OooOOO0();
        }
        this.f34169OooO0o0 = null;
    }

    @Override // p069o0000ooO.o00000O0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f34171OooO0oo;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f34168OooO0o;
        int i4 = o00.f34910OooO00o;
        System.arraycopy(bArr2, this.f34170OooO0oO, bArr, i, iMin);
        this.f34170OooO0oO += iMin;
        this.f34171OooO0oo -= iMin;
        OooOO0o(iMin);
        return iMin;
    }
}
