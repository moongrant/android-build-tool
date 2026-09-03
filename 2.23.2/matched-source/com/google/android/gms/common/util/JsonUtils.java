package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p259o00ooOoO.o0oo0000;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@KeepForSdk
public final class JsonUtils {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f14797OooO00o = Pattern.compile("\\\\.");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Pattern f14798OooO0O0 = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    @KeepForSdk
    public static boolean areJsonValuesEquivalent(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) obj;
            JSONObject jSONObject2 = (JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    Preconditions.checkNotNull(next);
                    if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                        return false;
                    }
                } catch (JSONException unused) {
                }
            }
            return true;
        }
        if (!(obj instanceof JSONArray) || !(obj2 instanceof JSONArray)) {
            return obj.equals(obj2);
        }
        JSONArray jSONArray = (JSONArray) obj;
        JSONArray jSONArray2 = (JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                    return false;
                }
            } catch (JSONException unused2) {
            }
        }
        return true;
    }

    @Nullable
    @KeepForSdk
    public static String escapeString(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f14798OooO0O0.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (cCharAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @NonNull
    @KeepForSdk
    public static String unescapeString(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = o0oo0000.f40376OooO00o;
        StringBuffer stringBuffer = null;
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = o0oo0000.f40376OooO00o.matcher(str);
            int iEnd = 0;
            StringBuilder sb = null;
            while (matcher.find()) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                int iStart = matcher.start();
                int i = iStart;
                while (i >= 0 && str.charAt(i) == '\\') {
                    i--;
                }
                if ((iStart - i) % 2 != 0) {
                    int i2 = Integer.parseInt(matcher.group().substring(2), 16);
                    sb.append((CharSequence) str, iEnd, matcher.start());
                    if (i2 == 92) {
                        sb.append("\\\\");
                    } else {
                        sb.append(Character.toChars(i2));
                    }
                    iEnd = matcher.end();
                }
            }
            if (sb != null) {
                if (iEnd < matcher.regionEnd()) {
                    sb.append((CharSequence) str, iEnd, matcher.regionEnd());
                }
                str = sb.toString();
            }
        }
        Matcher matcher2 = f14797OooO00o.matcher(str);
        while (matcher2.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char cCharAt = matcher2.group().charAt(1);
            if (cCharAt == '\"') {
                matcher2.appendReplacement(stringBuffer, "\"");
            } else if (cCharAt == '/') {
                matcher2.appendReplacement(stringBuffer, "/");
            } else if (cCharAt == '\\') {
                matcher2.appendReplacement(stringBuffer, "\\\\");
            } else if (cCharAt == 'b') {
                matcher2.appendReplacement(stringBuffer, "\b");
            } else if (cCharAt == 'f') {
                matcher2.appendReplacement(stringBuffer, "\f");
            } else if (cCharAt == 'n') {
                matcher2.appendReplacement(stringBuffer, "\n");
            } else if (cCharAt == 'r') {
                matcher2.appendReplacement(stringBuffer, "\r");
            } else {
                if (cCharAt != 't') {
                    throw new IllegalStateException("Found an escaped character that should never be.");
                }
                matcher2.appendReplacement(stringBuffer, "\t");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher2.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
