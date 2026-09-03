package p365o0OOo0Oo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEmojiFaceUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiFaceUtil.kt\ncom/yalla/support/emojifaceutil/EmojiFaceUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1855#2,2:192\n*S KotlinDebug\n*F\n+ 1 EmojiFaceUtil.kt\ncom/yalla/support/emojifaceutil/EmojiFaceUtil\n*L\n55#1:192,2\n*E\n"})
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<OooOo>> f43954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f43955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Pattern f43956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Pattern f43957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f43958OooO0o0;

    static {
        o0000O0.OooO00o(20);
        f43954OooO00o = new MutableLiveData<>();
        f43955OooO0O0 = new HashMap<>();
        Pattern patternCompile = Pattern.compile("/\\[MRF_[0-9]{6}");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"/\\\\[MRF_[0-9]{6}\")");
        f43956OooO0OO = patternCompile;
        Pattern patternCompile2 = Pattern.compile("/\\[MRF_[0-9]{6}_");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(\"/\\\\[MRF_[0-9]{6}_\")");
        f43957OooO0Oo = patternCompile2;
        f43958OooO0o0 = 13;
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
        String strOooOoO = string;
        int i = 0;
        while (true) {
            String strSubstring = string.substring(i, i + 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!StringsKt.OooO0o(strSubstring, ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
                String strSubstring2 = strSubstring.substring(0, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if (StringsKt.OooOO0o("/[MRF_", strSubstring2)) {
                    String str = f43955OooO0O0.get(strSubstring);
                    if (!(str == null || StringsKt.isBlank(str))) {
                        strOooOoO = StringsKt.OooOoO(strOooOoO, strSubstring, "[face]");
                    }
                }
            }
            if (i == length) {
                return strOooOoO;
            }
            i++;
        }
    }

    @Nullable
    public static String OooO0O0(@NotNull String emojiTag) {
        Intrinsics.checkNotNullParameter(emojiTag, "emojiTag");
        HashMap<String, String> map = f43955OooO0O0;
        if (map == null || map.isEmpty()) {
            OooO0OO();
        }
        return map.get(emojiTag);
    }

    public static void OooO0OO() {
        String str;
        try {
            InputStream inputStreamOpenRawResource = o000O0.OooO00o().getResources().openRawResource(Oooo0.support_emoji_face);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "Utils.context.resources.…R.raw.support_emoji_face)");
            byte[] bArr = new byte[inputStreamOpenRawResource.available()];
            inputStreamOpenRawResource.read(bArr);
            inputStreamOpenRawResource.close();
            str = new String(bArr, Charsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
        JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
        ArrayList<OooOo> data = new ArrayList();
        Intrinsics.checkNotNullParameter(data, "data");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String name = jSONObject.getString("fileName");
            String tag = jSONObject.getString("faceTag");
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            data.add(new OooOo(name, tag));
        }
        f43954OooO00o.postValue(data);
        HashMap<String, String> map = f43955OooO0O0;
        map.clear();
        for (OooOo oooOo : data) {
            map.put(oooOo.f43952OooO0O0, oooOo.f43951OooO00o);
            String str2 = oooOo.f43952OooO0O0 + "_";
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            oooOo.f43953OooO0OO = str2;
        }
    }

    @NotNull
    public static SpannableString OooO0Oo(int i, @NotNull String text) {
        int identifier;
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        Matcher matcher = f43956OooO0OO.matcher(text);
        Context contextOooO00o = o000O0.OooO00o();
        while (matcher.find()) {
            String faceTag = matcher.group();
            Intrinsics.checkNotNullExpressionValue(faceTag, "faceTag");
            String strOooO0O0 = OooO0O0(faceTag);
            if (strOooO0O0 != null && (identifier = contextOooO00o.getResources().getIdentifier(StringsKt.OooOoO(strOooO0O0, ".png", ""), "raw", contextOooO00o.getPackageName())) > 0) {
                Drawable drawableOooO0O0 = o0000.OooO0O0(identifier);
                drawableOooO0O0.setBounds(0, 0, i, i);
                spannableString.setSpan(new ImageSpan(drawableOooO0O0), matcher.start(), matcher.end(), 33);
            }
        }
        return spannableString;
    }
}
