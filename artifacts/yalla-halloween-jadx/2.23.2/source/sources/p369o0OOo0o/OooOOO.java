package p369o0OOo0o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nEmojiFaceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiFaceUtil.kt\ncom/yalla/support/emojifaceutil/EmojiFaceUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1855#2,2:192\n*S KotlinDebug\n*F\n+ 1 EmojiFaceUtil.kt\ncom/yalla/support/emojifaceutil/EmojiFaceUtil\n*L\n55#1:192,2\n*E\n"})
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<OooOOO0>> f43158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f43159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Pattern f43160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Pattern f43161OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f43162OooO0o0;

    static {
        o0000O0.OooO00o(20);
        f43158OooO00o = new MutableLiveData<>();
        f43159OooO0O0 = new HashMap<>();
        Pattern patternCompile = Pattern.compile("/\\[MRF_[0-9]{6}");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        f43160OooO0OO = patternCompile;
        Pattern patternCompile2 = Pattern.compile("/\\[MRF_[0-9]{6}_");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
        f43161OooO0Oo = patternCompile2;
        f43162OooO0o0 = 13;
    }

    @Nullable
    public static String OooO00o(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (StringsKt.isBlank(string)) {
            return "";
        }
        int length = string.length() - 12;
        if (length < 0) {
            return string;
        }
        String strReplace$default = string;
        int i = 0;
        while (true) {
            String strSubstring = string.substring(i, i + 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!StringsKt__StringsKt.contains$default(strSubstring, ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 2, (Object) null)) {
                String strSubstring2 = strSubstring.substring(0, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if (StringsKt__StringsJVMKt.equals("/[MRF_", strSubstring2, true)) {
                    String str = f43159OooO0O0.get(strSubstring);
                    if (!(str == null || StringsKt.isBlank(str))) {
                        strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default, strSubstring, "[face]", false, 4, (Object) null);
                    }
                }
            }
            if (i == length) {
                return strReplace$default;
            }
            i++;
        }
    }

    @Nullable
    public static String OooO0O0(@NotNull String emojiTag) {
        Intrinsics.checkNotNullParameter(emojiTag, "emojiTag");
        HashMap<String, String> map = f43159OooO0O0;
        if (map == null || map.isEmpty()) {
            OooO0OO();
        }
        return map.get(emojiTag);
    }

    public static void OooO0OO() {
        String str;
        try {
            InputStream inputStreamOpenRawResource = o000O00O.OooO00o().getResources().openRawResource(OooOOOO.support_emoji_face);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            inputStreamOpenRawResource.read(bArr);
            inputStreamOpenRawResource.close();
            str = new String(bArr, Charsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
        ArrayList<OooOOO0> data = new ArrayList();
        Intrinsics.checkNotNullParameter(data, "data");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("fileName");
            String string2 = jSONObject.getString("faceTag");
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNull(string2);
            data.add(new OooOOO0(string, string2));
        }
        f43158OooO00o.postValue(data);
        HashMap<String, String> map = f43159OooO0O0;
        map.clear();
        for (OooOOO0 oooOOO0 : data) {
            map.put(oooOOO0.f43164OooO0O0, oooOOO0.f43163OooO00o);
            String str2 = oooOOO0.f43164OooO0O0 + "_";
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            oooOOO0.f43165OooO0OO = str2;
        }
    }

    @NotNull
    public static SpannableString OooO0Oo(int i, @NotNull String text) {
        int identifier;
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        Matcher matcher = f43160OooO0OO.matcher(text);
        Context contextOooO00o = o000O00O.OooO00o();
        while (matcher.find()) {
            String strGroup = matcher.group();
            Intrinsics.checkNotNull(strGroup);
            String strOooO0O0 = OooO0O0(strGroup);
            if (strOooO0O0 != null && (identifier = contextOooO00o.getResources().getIdentifier(StringsKt__StringsJVMKt.replace$default(strOooO0O0, ".png", "", false, 4, (Object) null), "raw", contextOooO00o.getPackageName())) > 0) {
                Drawable drawableOooO0O0 = o0000.OooO0O0(identifier);
                drawableOooO0O0.setBounds(0, 0, i, i);
                spannableString.setSpan(new ImageSpan(drawableOooO0O0), matcher.start(), matcher.end(), 33);
            }
        }
        return spannableString;
    }
}
