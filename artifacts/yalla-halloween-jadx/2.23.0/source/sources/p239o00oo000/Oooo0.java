package p239o00oo000;

import androidx.annotation.Nullable;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import com.google.common.collect.o0O00;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p245o00oo0o.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f40375OooO00o = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f40376OooO0O0 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f40377OooO0OO = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    public static OooOo00 OooO00o(String str) throws XmlPullParserException, IOException {
        boolean z;
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!o0OoO00O.OooO0Oo(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.OooO00o("Couldn't find xmp metadata", null);
        }
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        o0O00 o0o00OooO0O0 = o0O00.f19536OooO0oo;
        long j2 = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f40375OooO00o;
                int i = 0;
                while (true) {
                    if (i < 4) {
                        String strOooO00o = o0OoO00O.OooO00o(xmlPullParserNewPullParser, strArr[i]);
                        if (strOooO00o == null) {
                            i++;
                        } else if (Integer.parseInt(strOooO00o) == 1) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    break;
                }
                if (!z) {
                    return null;
                }
                String[] strArr2 = f40376OooO0O0;
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        String strOooO00o2 = o0OoO00O.OooO00o(xmlPullParserNewPullParser, strArr2[i2]);
                        if (strOooO00o2 != null) {
                            j = Long.parseLong(strOooO00o2);
                            if (j != -1) {
                                break;
                            }
                            break;
                        }
                        i2++;
                    }
                    j = -9223372036854775807L;
                    break;
                }
                String[] strArr3 = f40377OooO0OO;
                int i3 = 0;
                while (true) {
                    if (i3 >= 2) {
                        ImmutableList.OooO0O0 oooO0O1 = ImmutableList.f19157OooO0o0;
                        o0o00OooO0O0 = o0O00.f19536OooO0oo;
                        break;
                    }
                    String strOooO00o3 = o0OoO00O.OooO00o(xmlPullParserNewPullParser, strArr3[i3]);
                    if (strOooO00o3 != null) {
                        Object[] objArr = {new OooOo00.OooO00o(0L, "image/jpeg", 0L), new OooOo00.OooO00o(Long.parseLong(strOooO00o3), MediaUtils.VIDEO_MP4, 0L)};
                        o0.OooO00o(2, objArr);
                        o0o00OooO0O0 = ImmutableList.OooO(2, objArr);
                        break;
                    }
                    i3++;
                }
                j2 = j;
            } else if (o0OoO00O.OooO0Oo(xmlPullParserNewPullParser, "Container:Directory")) {
                o0o00OooO0O0 = OooO0O0(xmlPullParserNewPullParser, "Container", "Item");
            } else if (o0OoO00O.OooO0Oo(xmlPullParserNewPullParser, "GContainer:Directory")) {
                o0o00OooO0O0 = OooO0O0(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (o0o00OooO0O0.isEmpty()) {
            return null;
        }
        return new OooOo00(j2, o0o00OooO0O0);
    }

    public static o0O00 OooO0O0(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
        ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (o0OoO00O.OooO0Oo(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strOooO00o = o0OoO00O.OooO00o(xmlPullParser, strConcat3);
                String strOooO00o2 = o0OoO00O.OooO00o(xmlPullParser, strConcat4);
                String strOooO00o3 = o0OoO00O.OooO00o(xmlPullParser, strConcat5);
                String strOooO00o4 = o0OoO00O.OooO00o(xmlPullParser, strConcat6);
                if (strOooO00o == null || strOooO00o2 == null) {
                    return o0O00.f19536OooO0oo;
                }
                oooO00o.OooO0OO(new OooOo00.OooO00o(strOooO00o3 != null ? Long.parseLong(strOooO00o3) : 0L, strOooO00o, strOooO00o4 != null ? Long.parseLong(strOooO00o4) : 0L));
            }
        } while (!o0OoO00O.OooO0O0(xmlPullParser, strConcat2));
        return oooO00o.OooO0oo();
    }
}
