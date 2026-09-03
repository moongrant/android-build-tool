package p208o00o0oo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import p101o000oo.Oooo000;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O0O implements o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImmutableList<o00O00o0> f39473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39474OooO0O0;

    public o00O0O0O(int i, o0O00 o0o01) {
        this.f39474OooO0O0 = i;
        this.f39473OooO00o = o0o01;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static o00O0O0O OooO0O0(int i, o00Oo00 o00oo00) {
        o00O00o0 o00o0oo1;
        String str;
        String str2;
        o00O00o0 o00o0oo2;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        int i2 = o00oo00.f40593OooO0OO;
        int i3 = -2;
        while (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 > 8) {
            int iOooO = o00oo00.OooO();
            int iOooO2 = o00oo00.f40592OooO0O0 + o00oo00.OooO();
            o00oo00.Oooo000(iOooO2);
            if (iOooO != 1414744396) {
                switch (iOooO) {
                    case 1718776947:
                        if (i3 == 2) {
                            o00oo00.Oooo00o(4);
                            int iOooO3 = o00oo00.OooO();
                            int iOooO4 = o00oo00.OooO();
                            o00oo00.Oooo00o(4);
                            int iOooO5 = o00oo00.OooO();
                            switch (iOooO5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
                                oooO00o2.f11249OooOOOo = iOooO3;
                                oooO00o2.f11251OooOOo0 = iOooO4;
                                oooO00o2.f11244OooOO0O = str2;
                                o00o0oo2 = new o00O0OO0(new OooOo(oooO00o2));
                                o00o0oo1 = o00o0oo2;
                            } else {
                                Oooo000.OooO0O0("Ignoring track with unsupported compression ", iOooO5, "StreamFormatChunk");
                            }
                        } else if (i3 == 1) {
                            int iOooOOO = o00oo00.OooOOO();
                            if (iOooOOO == 1) {
                                str = "audio/raw";
                            } else if (iOooOOO == 85) {
                                str = "audio/mpeg";
                            } else if (iOooOOO == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iOooOOO != 8192) {
                                str = iOooOOO != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str != null) {
                                int iOooOOO2 = o00oo00.OooOOO();
                                int iOooO6 = o00oo00.OooO();
                                o00oo00.Oooo00o(6);
                                int iOooOo00 = p245o00oo0o.o0O00.OooOo00(o00oo00.OooOoOO());
                                int iOooOOO3 = o00oo00.OooOOO();
                                byte[] bArr = new byte[iOooOOO3];
                                o00oo00.OooO0Oo(0, iOooOOO3, bArr);
                                OooOo.OooO00o oooO00o3 = new OooOo.OooO00o();
                                oooO00o3.f11244OooOO0O = str;
                                oooO00o3.f11253OooOo = iOooOOO2;
                                oooO00o3.f11259OooOoO0 = iOooO6;
                                if ("audio/raw".equals(str) && iOooOo00 != 0) {
                                    oooO00o3.f11258OooOoO = iOooOo00;
                                }
                                if ("audio/mp4a-latm".equals(str) && iOooOOO3 > 0) {
                                    oooO00o3.f11247OooOOO0 = ImmutableList.OooOOOo(bArr);
                                }
                                o00o0oo1 = new o00O0OO0(new OooOo(oooO00o3));
                            } else {
                                Oooo000.OooO0O0("Ignoring track with unsupported format tag ", iOooOOO, "StreamFormatChunk");
                            }
                        } else {
                            Log.OooO0o("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + p245o00oo0o.o0O00.OooOoOO(i3));
                        }
                        o00o0oo1 = null;
                        break;
                    case 1751742049:
                        int iOooO7 = o00oo00.OooO();
                        o00oo00.Oooo00o(8);
                        int iOooO8 = o00oo00.OooO();
                        int iOooO9 = o00oo00.OooO();
                        o00oo00.Oooo00o(4);
                        o00oo00.OooO();
                        o00oo00.Oooo00o(12);
                        o00o0oo1 = new o00O0(iOooO7, iOooO8, iOooO9);
                        break;
                    case 1752331379:
                        int iOooO10 = o00oo00.OooO();
                        o00oo00.Oooo00o(12);
                        o00oo00.OooO();
                        int iOooO11 = o00oo00.OooO();
                        int iOooO12 = o00oo00.OooO();
                        o00oo00.Oooo00o(4);
                        int iOooO13 = o00oo00.OooO();
                        int iOooO14 = o00oo00.OooO();
                        o00oo00.Oooo00o(8);
                        o00o0oo2 = new o00O0O00(iOooO10, iOooO11, iOooO12, iOooO13, iOooO14);
                        o00o0oo1 = o00o0oo2;
                        break;
                    case 1852994675:
                        o00o0oo1 = new oo0o0O0(o00oo00.OooOOoo(o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0));
                        break;
                    default:
                        o00o0oo1 = null;
                        break;
                }
            } else {
                o00o0oo1 = OooO0O0(o00oo00.OooO(), o00oo00);
            }
            if (o00o0oo1 != null) {
                if (o00o0oo1.getType() == 1752331379) {
                    int i4 = ((o00O0O00) o00o0oo1).f39468OooO00o;
                    if (i4 == 1935960438) {
                        i3 = 2;
                    } else if (i4 == 1935963489) {
                        i3 = 1;
                    } else if (i4 != 1937012852) {
                        Log.OooO0o("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i4));
                        i3 = -1;
                    } else {
                        i3 = 3;
                    }
                }
                oooO00o.OooO0OO(o00o0oo1);
            }
            o00oo00.Oooo00O(iOooO2);
            o00oo00.Oooo000(i2);
        }
        return new o00O0O0O(i, oooO00o.OooO0oo());
    }

    @Nullable
    public final <T extends o00O00o0> T OooO00o(Class<T> cls) {
        ImmutableList.OooO0O0 oooO0O0ListIterator = this.f39473OooO00o.listIterator(0);
        while (oooO0O0ListIterator.hasNext()) {
            T t = (T) oooO0O0ListIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // p208o00o0oo.o00O00o0
    public final int getType() {
        return this.f39474OooO0O0;
    }
}
