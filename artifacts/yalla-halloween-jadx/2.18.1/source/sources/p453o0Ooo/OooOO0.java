package p453o0Ooo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.lifecycle.MutableLiveData;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f40347OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<OooO>> f40348OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f40349OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Pattern f40350OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int f40351OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Pattern f40352OooO0o0;

    static {
        OooOo00.OooO00o(20.0f);
        f40348OooO0O0 = new MutableLiveData<>();
        f40349OooO0OO = new HashMap<>();
        Pattern patternCompile = Pattern.compile("/\\[MRF_[0-9]{6}");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(\"/\\\\[MRF_[0-9]{6}\")");
        f40350OooO0Oo = patternCompile;
        Pattern patternCompile2 = Pattern.compile("/\\[MRF_[0-9]{6}_");
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(\"/\\\\[MRF_[0-9]{6}_\")");
        f40352OooO0o0 = patternCompile2;
        f40351OooO0o = 13;
    }

    @Nullable
    public static final String OooO00o(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (StringsKt.isBlank(string)) {
            return "";
        }
        int length = string.length() - 12;
        if (length < 0) {
            return string;
        }
        int i = 0;
        String strOooOo00 = string;
        while (true) {
            String strSubstring = string.substring(i, i + 12);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            if (!StringsKt__StringsKt.contains$default(strSubstring, ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 2, (Object) null)) {
                String strSubstring2 = strSubstring.substring(0, 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                if (StringsKt.OooO("/[MRF_", strSubstring2)) {
                    String str = f40349OooO0OO.get(strSubstring);
                    if (!(str == null || StringsKt.isBlank(str))) {
                        strOooOo00 = StringsKt.OooOo00(strOooOo00, strSubstring, "[face]");
                    }
                }
            }
            if (i == length) {
                return strOooOo00;
            }
            i++;
        }
    }

    @Nullable
    public static final String OooO0O0(@NotNull String emojiTag) {
        Intrinsics.checkNotNullParameter(emojiTag, "emojiTag");
        HashMap<String, String> map = f40349OooO0OO;
        if (map == null || map.isEmpty()) {
            OooO0OO();
        }
        return map.get(emojiTag);
    }

    public static final List OooO0OO() throws JSONException {
        String str;
        try {
            Context context = o0000O.f2657OooO00o;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(OooOO0O.support_emoji_face);
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
        ArrayList<OooO> data = new ArrayList();
        Intrinsics.checkNotNullParameter(data, "data");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String name = jSONObject.getString("fileName");
            String tag = jSONObject.getString("faceTag");
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            data.add(new OooO(name, tag));
        }
        f40348OooO0O0.postValue(data);
        f40349OooO0OO.clear();
        for (OooO oooO : data) {
            f40349OooO0OO.put(oooO.f40344OooO0O0, oooO.f40343OooO00o);
            String str2 = oooO.f40344OooO0O0 + '_';
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            oooO.f40345OooO0OO = str2;
        }
        return data;
    }

    @NotNull
    public static final SpannableString OooO0Oo(@NotNull CharSequence text, int i) {
        int identifier;
        Intrinsics.checkNotNullParameter(text, "text");
        SpannableString spannableString = new SpannableString(text);
        Matcher matcher = f40350OooO0Oo.matcher(text);
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        while (matcher.find()) {
            String faceTag = matcher.group();
            Intrinsics.checkNotNullExpressionValue(faceTag, "faceTag");
            String strOooO0O0 = OooO0O0(faceTag);
            if (strOooO0O0 != null && (identifier = context.getResources().getIdentifier(StringsKt.OooOo00(strOooO0O0, ".png", ""), "raw", context.getPackageName())) > 0) {
                Drawable drawableOooO0O0 = OooOOO.OooO0O0(identifier);
                drawableOooO0O0.setBounds(0, 0, i, i);
                spannableString.setSpan(new ImageSpan(drawableOooO0O0), matcher.start(), matcher.end(), 33);
            }
        }
        return spannableString;
    }
}
