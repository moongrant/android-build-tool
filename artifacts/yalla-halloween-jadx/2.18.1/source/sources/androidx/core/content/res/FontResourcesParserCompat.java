package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o000O0.OooOO0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p069o0000oo0.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class FontResourcesParserCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class OooO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooOO0 f7818OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7819OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7820OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f7821OooO0Oo;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public OooO(@NonNull OooOO0 oooOO1, int i, int i2, @Nullable String str) {
            this.f7818OooO00o = oooOO1;
            this.f7820OooO0OO = i;
            this.f7819OooO0O0 = i2;
            this.f7821OooO0Oo = str;
        }
    }

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static int OooO00o(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public interface OooO0O0 {
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooO0o[] f7822OooO00o;

        public OooO0OO(@NonNull OooO0o[] oooO0oArr) {
            this.f7822OooO00o = oooO0oArr;
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final String f7823OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7824OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f7825OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f7826OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f7827OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f7828OooO0o0;

        public OooO0o(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.f7823OooO00o = str;
            this.f7824OooO0O0 = i;
            this.f7825OooO0OO = z;
            this.f7826OooO0Oo = str2;
            this.f7828OooO0o0 = i2;
            this.f7827OooO0o = i3;
        }
    }

    @Nullable
    public static OooO0O0 OooO00o(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlPullParser.require(2, null, "font-family");
        if (!xmlPullParser.getName().equals("font-family")) {
            OooO0OO(xmlPullParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), o000O0O0.FontFamily);
        String string = typedArrayObtainAttributes.getString(o000O0O0.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(o000O0O0.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(o000O0O0.FontFamily_fontProviderQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(o000O0O0.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(o000O0O0.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(o000O0O0.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = typedArrayObtainAttributes.getString(o000O0O0.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                OooO0OO(xmlPullParser);
            }
            return new OooO(new OooOO0(string, string2, string3, OooO0O0(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), o000O0O0.FontFamilyFont);
                    int i = o000O0O0.FontFamilyFont_fontWeight;
                    if (!typedArrayObtainAttributes2.hasValue(i)) {
                        i = o000O0O0.FontFamilyFont_android_fontWeight;
                    }
                    int i2 = typedArrayObtainAttributes2.getInt(i, ShopVehicleListModel.VehicleTagType_Vip400);
                    int i3 = o000O0O0.FontFamilyFont_fontStyle;
                    if (!typedArrayObtainAttributes2.hasValue(i3)) {
                        i3 = o000O0O0.FontFamilyFont_android_fontStyle;
                    }
                    boolean z = 1 == typedArrayObtainAttributes2.getInt(i3, 0);
                    int i4 = o000O0O0.FontFamilyFont_ttcIndex;
                    if (!typedArrayObtainAttributes2.hasValue(i4)) {
                        i4 = o000O0O0.FontFamilyFont_android_ttcIndex;
                    }
                    int i5 = o000O0O0.FontFamilyFont_fontVariationSettings;
                    if (!typedArrayObtainAttributes2.hasValue(i5)) {
                        i5 = o000O0O0.FontFamilyFont_android_fontVariationSettings;
                    }
                    String string5 = typedArrayObtainAttributes2.getString(i5);
                    int i6 = typedArrayObtainAttributes2.getInt(i4, 0);
                    int i7 = o000O0O0.FontFamilyFont_font;
                    if (!typedArrayObtainAttributes2.hasValue(i7)) {
                        i7 = o000O0O0.FontFamilyFont_android_font;
                    }
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                    String string6 = typedArrayObtainAttributes2.getString(i7);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlPullParser.next() != 3) {
                        OooO0OO(xmlPullParser);
                    }
                    arrayList.add(new OooO0o(string6, i2, z, string5, i6, resourceId2));
                } else {
                    OooO0OO(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new OooO0OO((OooO0o[]) arrayList.toArray(new OooO0o[0]));
    }

    @NonNull
    public static List<List<byte[]>> OooO0O0(@NonNull Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (OooO00o.OooO00o(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(OooO0Oo(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(OooO0Oo(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void OooO0OO(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List<byte[]> OooO0Oo(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
