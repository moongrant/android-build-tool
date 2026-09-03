package p077o000Oo00;

import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.Log;
import com.facebook.appevents.OooOOO;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import p080o000OoO.o0000OO0;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImmutableList<OooO> f34880OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34881OooO0O0;

    public OooOOOO(int i, o0O00 o0o01) {
        this.f34881OooO0O0 = i;
        this.f34880OooO00o = o0o01;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static OooOOOO OooO0O0(int i, o0000OO0 o0000oo1) {
        OooO oooOo00;
        String str;
        String str2;
        OooO oooOo01;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        int i2 = o0000oo1.f34951OooO0OO;
        int i3 = -2;
        while (o0000oo1.f34951OooO0OO - o0000oo1.f34950OooO0O0 > 8) {
            int iOooO = o0000oo1.OooO();
            int iOooO2 = o0000oo1.f34950OooO0O0 + o0000oo1.OooO();
            o0000oo1.Oooo000(iOooO2);
            if (iOooO != 1414744396) {
                switch (iOooO) {
                    case 1718776947:
                        if (i3 == 2) {
                            o0000oo1.Oooo00o(4);
                            int iOooO3 = o0000oo1.OooO();
                            int iOooO4 = o0000oo1.OooO();
                            o0000oo1.Oooo00o(4);
                            int iOooO5 = o0000oo1.OooO();
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
                                OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
                                oooO00o2.f6455OooOOOo = iOooO3;
                                oooO00o2.f6457OooOOo0 = iOooO4;
                                oooO00o2.f6450OooOO0O = str2;
                                oooOo01 = new OooOo00(new OooOO0(oooO00o2));
                                oooOo00 = oooOo01;
                            } else {
                                OooOOO.OooO00o("Ignoring track with unsupported compression ", iOooO5, "StreamFormatChunk");
                            }
                        } else if (i3 == 1) {
                            int iOooOOO = o0000oo1.OooOOO();
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
                                int iOooOOO2 = o0000oo1.OooOOO();
                                int iOooO6 = o0000oo1.OooO();
                                o0000oo1.Oooo00o(6);
                                int iOooOo0 = o000OO00.OooOo0(o0000oo1.OooOoOO());
                                int iOooOOO3 = o0000oo1.OooOOO();
                                byte[] bArr = new byte[iOooOOO3];
                                o0000oo1.OooO0Oo(0, iOooOOO3, bArr);
                                OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o();
                                oooO00o3.f6450OooOO0O = str;
                                oooO00o3.f6459OooOo = iOooOOO2;
                                oooO00o3.f6465OooOoO0 = iOooO6;
                                if ("audio/raw".equals(str) && iOooOo0 != 0) {
                                    oooO00o3.f6464OooOoO = iOooOo0;
                                }
                                if ("audio/mp4a-latm".equals(str) && iOooOOO3 > 0) {
                                    oooO00o3.f6453OooOOO0 = ImmutableList.OooOOOo(bArr);
                                }
                                oooOo00 = new OooOo00(new OooOO0(oooO00o3));
                            } else {
                                OooOOO.OooO00o("Ignoring track with unsupported format tag ", iOooOOO, "StreamFormatChunk");
                            }
                        } else {
                            Log.OooO0o("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + o000OO00.OooOoo0(i3));
                        }
                        oooOo00 = null;
                        break;
                    case 1751742049:
                        int iOooO7 = o0000oo1.OooO();
                        o0000oo1.Oooo00o(8);
                        int iOooO8 = o0000oo1.OooO();
                        int iOooO9 = o0000oo1.OooO();
                        o0000oo1.Oooo00o(4);
                        o0000oo1.OooO();
                        o0000oo1.Oooo00o(12);
                        oooOo00 = new OooOO0O(iOooO7, iOooO8, iOooO9);
                        break;
                    case 1752331379:
                        int iOooO10 = o0000oo1.OooO();
                        o0000oo1.Oooo00o(12);
                        o0000oo1.OooO();
                        int iOooO11 = o0000oo1.OooO();
                        int iOooO12 = o0000oo1.OooO();
                        o0000oo1.Oooo00o(4);
                        int iOooO13 = o0000oo1.OooO();
                        int iOooO14 = o0000oo1.OooO();
                        o0000oo1.Oooo00o(8);
                        oooOo01 = new OooOOO0(iOooO10, iOooO11, iOooO12, iOooO13, iOooO14);
                        oooOo00 = oooOo01;
                        break;
                    case 1852994675:
                        oooOo00 = new OooOo(o0000oo1.OooOOoo(o0000oo1.f34951OooO0OO - o0000oo1.f34950OooO0O0));
                        break;
                    default:
                        oooOo00 = null;
                        break;
                }
            } else {
                oooOo00 = OooO0O0(o0000oo1.OooO(), o0000oo1);
            }
            if (oooOo00 != null) {
                if (oooOo00.getType() == 1752331379) {
                    int i4 = ((OooOOO0) oooOo00).f34875OooO00o;
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
                oooO00o.OooO0OO(oooOo00);
            }
            o0000oo1.Oooo00O(iOooO2);
            o0000oo1.Oooo000(i2);
        }
        return new OooOOOO(i, oooO00o.OooO0oo());
    }

    @Nullable
    public final <T extends OooO> T OooO00o(Class<T> cls) {
        ImmutableList.OooO0O0 oooO0O0ListIterator = this.f34880OooO00o.listIterator(0);
        while (oooO0O0ListIterator.hasNext()) {
            T t = (T) oooO0O0ListIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // p077o000Oo00.OooO
    public final int getType() {
        return this.f34881OooO0O0;
    }
}
