package p516o0o0O000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo {
    @Nullable
    public static final Map<String, Object> OooO00o(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) content.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = content.subSequence(i, length + 1).toString();
        HashMap map = new HashMap();
        try {
            if (string.charAt(0) == '[') {
                JSONArray jSONArray = new JSONArray(string);
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    Object obj = jSONArray.get(i2);
                    if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
                        String str = i2 + "";
                        String string2 = obj.toString();
                        int length3 = string2.length() - 1;
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 <= length3) {
                            boolean z4 = Intrinsics.compare((int) string2.charAt(!z3 ? i3 : length3), 32) <= 0;
                            if (z3) {
                                if (!z4) {
                                    break;
                                }
                                length3--;
                            } else if (z4) {
                                i3++;
                            } else {
                                z3 = true;
                            }
                        }
                        map.put(str, OooO00o(string2.subSequence(i3, length3 + 1).toString()));
                    } else {
                        map.put(i2 + "", jSONArray.getString(i2));
                    }
                }
            } else if (string.charAt(0) == '{') {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    Object obj2 = jSONObject.get(key);
                    if ((obj2 instanceof JSONArray) || (obj2 instanceof JSONObject)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        String string3 = obj2.toString();
                        int length4 = string3.length() - 1;
                        int i4 = 0;
                        boolean z5 = false;
                        while (i4 <= length4) {
                            boolean z6 = Intrinsics.compare((int) string3.charAt(!z5 ? i4 : length4), 32) <= 0;
                            if (z5) {
                                if (!z6) {
                                    break;
                                }
                                length4--;
                            } else if (z6) {
                                i4++;
                            } else {
                                z5 = true;
                            }
                        }
                        map.put(key, OooO00o(string3.subSequence(i4, length4 + 1).toString()));
                    } else {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        String string4 = obj2.toString();
                        int length5 = string4.length() - 1;
                        int i5 = 0;
                        boolean z7 = false;
                        while (i5 <= length5) {
                            boolean z8 = Intrinsics.compare((int) string4.charAt(!z7 ? i5 : length5), 32) <= 0;
                            if (z7) {
                                if (!z8) {
                                    break;
                                }
                                length5--;
                            } else if (z8) {
                                i5++;
                            } else {
                                z7 = true;
                            }
                        }
                        map.put(key, string4.subSequence(i5, length5 + 1).toString());
                    }
                }
            }
            return map;
        } catch (JSONException unused) {
            return null;
        }
    }

    @NotNull
    public static final String OooO0O0(@Nullable Object obj) {
        if (obj == null) {
            return "";
        }
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(obj);
        if (strOooO0oo == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
        return strOooO0oo;
    }

    @Nullable
    public static final <T> T OooO0OO(@NotNull String str, @NotNull Class<T> type) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        return (T) o0OOO0o.OooO0O0(str, type);
    }
}
