package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
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
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f12108OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<com.google.android.exoplayer2.OooOo> f12109OooO0O0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory(ImmutableList immutableList) {
        this.f12109OooO0O0 = immutableList;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.OooO0OO
    @Nullable
    public final TsPayloadReader OooO00o(int i, TsPayloadReader.OooO0O0 oooO0O0) {
        if (i != 2) {
            String str = oooO0O0.f12356OooO00o;
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
                return new o00O0O(new OooOO0O(oooO0O0.f12357OooO0O0));
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

    public final List<com.google.android.exoplayer2.OooOo> OooO0O0(TsPayloadReader.OooO0O0 oooO0O0) {
        String str;
        int i;
        boolean zOooO0OO = OooO0OO(32);
        List<com.google.android.exoplayer2.OooOo> list = this.f12109OooO0O0;
        if (zOooO0OO) {
            return list;
        }
        o00Oo00 o00oo00 = new o00Oo00(oooO0O0.f12358OooO0OO);
        while (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 > 0) {
            int iOooOo0O = o00oo00.OooOo0O();
            int iOooOo0O2 = o00oo00.f40592OooO0O0 + o00oo00.OooOo0O();
            if (iOooOo0O == 134) {
                ArrayList arrayList = new ArrayList();
                int iOooOo0O3 = o00oo00.OooOo0O() & 31;
                for (int i2 = 0; i2 < iOooOo0O3; i2++) {
                    String strOooOOoo = o00oo00.OooOOoo(3);
                    int iOooOo0O4 = o00oo00.OooOo0O();
                    boolean z = (iOooOo0O4 & 128) != 0;
                    if (z) {
                        i = iOooOo0O4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bOooOo0O = (byte) o00oo00.OooOo0O();
                    o00oo00.Oooo00o(1);
                    List<byte[]> listSingletonList = z ? Collections.singletonList((bOooOo0O & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
                    oooO00o.f11244OooOO0O = str;
                    oooO00o.f11237OooO0OO = strOooOOoo;
                    oooO00o.f11261OooOoo = i;
                    oooO00o.f11247OooOOO0 = listSingletonList;
                    arrayList.add(new com.google.android.exoplayer2.OooOo(oooO00o));
                }
                list = arrayList;
            }
            o00oo00.Oooo00O(iOooOo0O2);
        }
        return list;
    }

    public final boolean OooO0OO(int i) {
        return (i & this.f12108OooO00o) != 0;
    }
}
