package com.google.android.exoplayer2.extractor.ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p319o0O0oOo.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Format> f14057OooO0O0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        com.google.common.collect.OooO0OO oooO0OO = ImmutableList.f18188OoooO00;
        ImmutableList<Object> immutableList = o0.f18418OoooO;
        this.f14056OooO00o = 0;
        this.f14057OooO0O0 = immutableList;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.TsPayloadReader.OooO0OO
    @Nullable
    public final TsPayloadReader OooO00o(int i, TsPayloadReader.OooO0O0 oooO0O0) {
        if (i == 2) {
            return new o00O0O(new OooOOO(new o0ooOOo(OooO0O0(oooO0O0))));
        }
        if (i == 3 || i == 4) {
            return new o00O0O(new o000oOoO(oooO0O0.f14307OooO00o));
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
            return new o00O0O(new OooOO0O(oooO0O0.f14308OooO0O0));
        }
        if (i != 138) {
            if (i == 172) {
                return new o00O0O(new OooO0o(oooO0O0.f14307OooO00o));
            }
            if (i == 257) {
                return new oo000o(new o0OoOo0("application/vnd.dvb.ait"));
            }
            if (i != 129) {
                if (i != 130) {
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
                                return new o00O0O(new OooO(false, oooO0O0.f14307OooO00o));
                            case 16:
                                return new o00O0O(new OooOOOO(new o0ooOOo(OooO0O0(oooO0O0))));
                            case 17:
                                if (OooO0OO(2)) {
                                    return null;
                                }
                                return new o00O0O(new Oooo0(oooO0O0.f14307OooO00o));
                            default:
                                return null;
                        }
                    }
                } else if (!OooO0OO(64)) {
                    return null;
                }
            }
            return new o00O0O(new OooO0O0(oooO0O0.f14307OooO00o));
        }
        return new o00O0O(new OooOO0(oooO0O0.f14307OooO00o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final List<Format> OooO0O0(TsPayloadReader.OooO0O0 oooO0O0) {
        String str;
        int i;
        if (OooO0OO(32)) {
            return this.f14057OooO0O0;
        }
        o000O000 o000o001 = new o000O000(oooO0O0.f14309OooO0OO);
        ArrayList arrayList = this.f14057OooO0O0;
        while (o000o001.f36747OooO0OO - o000o001.f36746OooO0O0 > 0) {
            int iOooOOo0 = o000o001.OooOOo0();
            int iOooOOo1 = o000o001.f36746OooO0O0 + o000o001.OooOOo0();
            if (iOooOOo0 == 134) {
                arrayList = new ArrayList();
                int iOooOOo2 = o000o001.OooOOo0() & 31;
                for (int i2 = 0; i2 < iOooOOo2; i2++) {
                    String strOooOOO = o000o001.OooOOO(3);
                    int iOooOOo3 = o000o001.OooOOo0();
                    boolean z = (iOooOOo3 & 128) != 0;
                    if (z) {
                        i = iOooOOo3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bOooOOo0 = (byte) o000o001.OooOOo0();
                    o000o001.OooOoo0(1);
                    List<byte[]> listSingletonList = null;
                    if (z) {
                        listSingletonList = Collections.singletonList((bOooOOo0 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    Format.OooO0O0 oooO0O1 = new Format.OooO0O0();
                    oooO0O1.f13180OooOO0O = str;
                    oooO0O1.f13173OooO0OO = strOooOOO;
                    oooO0O1.f13197OooOoo = i;
                    oooO0O1.f13183OooOOO0 = listSingletonList;
                    arrayList.add(new Format(oooO0O1));
                }
            }
            o000o001.OooOoOO(iOooOOo1);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean OooO0OO(int i) {
        return (i & this.f14056OooO00o) != 0;
    }
}
