package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import io.agora.rtc.Constants;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p080o000OoO.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8880OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<androidx.media3.common.OooOO0> f8881OooO0O0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory(ImmutableList immutableList) {
        this.f8881OooO0O0 = immutableList;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.OooO0OO
    @Nullable
    public final TsPayloadReader OooO00o(int i, TsPayloadReader.OooO0O0 oooO0O0) {
        if (i != 2) {
            String str = oooO0O0.f9128OooO00o;
            if (i == 3 || i == 4) {
                return new o00O0O(new o000oOoO(str));
            }
            if (i == 21) {
                return new o00O0O(new Oooo000());
            }
            if (i == 27) {
                if (OooO0OO(4)) {
                    return null;
                }
                return new o00O0O(new OooOo00(new o00oO0o(OooO0O0(oooO0O0)), OooO0OO(1), OooO0OO(8)));
            }
            if (i == 36) {
                return new o00O0O(new OooOo(new o00oO0o(OooO0O0(oooO0O0))));
            }
            if (i == 89) {
                return new o00O0O(new OooOO0O(oooO0O0.f9129OooO0O0));
            }
            if (i != 138) {
                if (i == 172) {
                    return new o00O0O(new OooO0o(str));
                }
                if (i == 257) {
                    return new oo000o(new o0OoOo0("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (OooO0OO(16)) {
                        return null;
                    }
                    return new oo000o(new o0OoOo0("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (OooO0OO(2)) {
                                return null;
                            }
                            return new o00O0O(new OooO(false, str));
                        case 16:
                            return new o00O0O(new OooOOOO(new o0ooOOo(OooO0O0(oooO0O0))));
                        case 17:
                            if (OooO0OO(2)) {
                                return null;
                            }
                            return new o00O0O(new Oooo0(str));
                        default:
                            switch (i) {
                                case 128:
                                    break;
                                case Constants.ERR_WATERMARK_READ /* 129 */:
                                    break;
                                case Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED /* 130 */:
                                    if (!OooO0OO(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new o00O0O(new OooO0O0(str));
            }
            return new o00O0O(new OooOO0(str));
        }
        return new o00O0O(new OooOOO(new o0ooOOo(OooO0O0(oooO0O0))));
    }

    public final List<androidx.media3.common.OooOO0> OooO0O0(TsPayloadReader.OooO0O0 oooO0O0) {
        String str;
        int i;
        boolean zOooO0OO = OooO0OO(32);
        List<androidx.media3.common.OooOO0> list = this.f8881OooO0O0;
        if (zOooO0OO) {
            return list;
        }
        o0000OO0 o0000oo1 = new o0000OO0(oooO0O0.f9130OooO0OO);
        while (o0000oo1.f34951OooO0OO - o0000oo1.f34950OooO0O0 > 0) {
            int iOooOo0O = o0000oo1.OooOo0O();
            int iOooOo0O2 = o0000oo1.f34950OooO0O0 + o0000oo1.OooOo0O();
            if (iOooOo0O == 134) {
                ArrayList arrayList = new ArrayList();
                int iOooOo0O3 = o0000oo1.OooOo0O() & 31;
                for (int i2 = 0; i2 < iOooOo0O3; i2++) {
                    String strOooOOoo = o0000oo1.OooOOoo(3);
                    int iOooOo0O4 = o0000oo1.OooOo0O();
                    boolean z = (iOooOo0O4 & 128) != 0;
                    if (z) {
                        i = iOooOo0O4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bOooOo0O = (byte) o0000oo1.OooOo0O();
                    o0000oo1.Oooo00o(1);
                    List<byte[]> listSingletonList = z ? Collections.singletonList((bOooOo0O & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
                    oooO00o.f6450OooOO0O = str;
                    oooO00o.f6443OooO0OO = strOooOOoo;
                    oooO00o.f6467OooOoo = i;
                    oooO00o.f6453OooOOO0 = listSingletonList;
                    arrayList.add(new androidx.media3.common.OooOO0(oooO00o));
                }
                list = arrayList;
            }
            o0000oo1.Oooo00O(iOooOo0O2);
        }
        return list;
    }

    public final boolean OooO0OO(int i) {
        return (i & this.f8880OooO00o) != 0;
    }
}
