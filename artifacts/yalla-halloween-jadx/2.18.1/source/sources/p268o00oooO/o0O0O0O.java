package p268o00oooO;

import android.util.Base64;
import com.common.support.apm.model.TokenModel;
import com.qiniu.android.http.request.Request;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import oO0OO0OO.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.NotNull;
import p271o00oooo.o0O0oo0o;
import p272o00oooo0.o0O0o000;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0o0Oo;
import p666o0oooO0o.oOo00o0o;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0O implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        String stringToEncode;
        String strJoinToString$default;
        String str;
        byte[] bArrDoFinal;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O0oo0o o0o0oo0o = o0O0oo0o.f34965OooO00o;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        String str2 = "";
        String keyString = StringsKt.OooOo00(string, "-", "");
        String publicKey = o0O0oo0o.f34966OooO0O0;
        Intrinsics.checkNotNullParameter(keyString, "content");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        byte[] byteArray = keyString.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byteArray, "(this as java.lang.String).getBytes(charset)");
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        int i = 0;
        byte[] bArrDecode = Base64.decode(publicKey, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(content, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(keySpec)");
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKeyGeneratePublic);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = 0;
        while (byteArray.length - length > 0) {
            if (byteArray.length - length >= 117) {
                bArrDoFinal = cipher.doFinal(byteArray, length, 117);
                length += 117;
            } else {
                bArrDoFinal = cipher.doFinal(byteArray, length, byteArray.length - length);
                length = byteArray.length;
            }
            byteArrayOutputStream.write(bArrDoFinal);
        }
        byteArrayOutputStream.close();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "outputStream.toByteArray()");
        String debug = Intrinsics.stringPlus("rsaEncryptContent = ", keyString);
        Intrinsics.checkNotNullParameter(debug, "debug");
        if (o0O0o000.f34971OooO0Oo) {
            o0O0o000.f34969OooO0O0.OooO00o(3, o0O0o000.f34970OooO0OO, debug);
        }
        String debug2 = Intrinsics.stringPlus("rsaPublicKey = ", publicKey);
        Intrinsics.checkNotNullParameter(debug2, "debug");
        if (o0O0o000.f34971OooO0Oo) {
            o0O0o000.f34969OooO0O0.OooO00o(3, o0O0o000.f34970OooO0OO, debug2);
        }
        String strEncodeToString = Base64.encodeToString(byteArray2, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(byteArray, Base64.DEFAULT)");
        String strOooOo00 = StringsKt.OooOo00(strEncodeToString, "\n", "");
        String debug3 = Intrinsics.stringPlus("rsaEncrypted(signKey) is ", strOooOo00);
        Intrinsics.checkNotNullParameter(debug3, "debug");
        if (o0O0o000.f34971OooO0Oo) {
            o0O0o000.f34969OooO0O0.OooO00o(3, o0O0o000.f34970OooO0OO, debug3);
        }
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        Intrinsics.checkNotNullExpressionValue(o00ooo01, "chain.request()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.areEqual(o00ooo01.f51426OooO0OO, Request.HttpMethodPOST)) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            o0o0Oo o0o0oo = o00ooo01.f51429OooO0o0;
            if (o0o0oo != null && (o0o0oo instanceof o00OO0OO)) {
                o00OO0OO o00oo0oo = (o00OO0OO) o0o0oo;
                int size = o00oo0oo.f51415OooO0Oo.size();
                if (size > 0) {
                    while (true) {
                        int i2 = i + 1;
                        o00OO0OO.OooO0OO oooO0OO = o00oo0oo.f51415OooO0Oo.get(i);
                        o00OO0O0 o00oo0o0ContentType = oooO0OO.f51421OooO0O0.contentType();
                        Boolean boolValueOf = null;
                        if (o00oo0o0ContentType != null && (str = o00oo0o0ContentType.f51402OooO00o) != null) {
                            boolValueOf = Boolean.valueOf(StringsKt__StringsKt.contains$default(str, "text/plain", false, 2, (Object) null));
                        }
                        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                            o0oOO o0ooo2 = new o0oOO();
                            oooO0OO.f51421OooO0O0.writeTo(o0ooo2);
                            Charset charsetForName = Charset.forName("UTF-8");
                            Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(charsetName)");
                            String value = o0ooo2.OooooO0(charsetForName);
                            o00O o00o2 = oooO0OO.f51420OooO00o;
                            if (o00o2 != null) {
                                String strOooO00o = o00o2.OooO00o("Content-Disposition");
                                if (!(strOooO00o == null || strOooO00o.length() == 0)) {
                                    String strOooOo01 = StringsKt.OooOo00(StringsKt.OooOo00(strOooO00o, "form-data; name=", ""), "\"", "");
                                    Intrinsics.checkNotNullExpressionValue(value, "value");
                                    linkedHashMap2.put(strOooOo01, value);
                                }
                            }
                        }
                        if (i2 >= size) {
                            break;
                        }
                        o00oo0oo = o00oo0oo;
                        i = i2;
                    }
                }
            }
            if (!linkedHashMap2.isEmpty()) {
                ArrayList arrayList = new ArrayList(linkedHashMap2.entrySet());
                Collections.sort(arrayList, new Comparator() { // from class: o00oooO.o0O00o00
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                    }
                });
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "&", "{", "}", 0, null, o0O00oO0.f34944Oooo0o, 24, null);
            } else {
                strJoinToString$default = "";
            }
            linkedHashMap.put("biz_content", strJoinToString$default);
        }
        o00OO000 o00oo001 = o00ooo01.f51425OooO0O0;
        String strOooO0O0 = o00oo001.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "url.encodedPath()");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strOooO0O0.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        linkedHashMap.put("request_path", lowerCase);
        List<String> list = o00oo001.f51389OooO0oo;
        int size2 = list != null ? list.size() / 2 : 0;
        if (size2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                String name = o00oo001.OooO(i3);
                String value2 = o00oo001.OooOO0(i3);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(value2, "value");
                linkedHashMap.put(name, value2);
                if (i4 >= size2) {
                    break;
                }
                i3 = i4;
            }
        }
        if (linkedHashMap.isEmpty()) {
            stringToEncode = "";
        } else {
            ArrayList arrayList2 = new ArrayList(linkedHashMap.entrySet());
            Collections.sort(arrayList2, new Comparator() { // from class: o00oooO.o0O00o00
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                }
            });
            StringBuilder sb = new StringBuilder();
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    Map.Entry entry = (Map.Entry) arrayList2.get(i5);
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    sb.append(str3);
                    sb.append("=");
                    sb.append(str4);
                    if (i5 != arrayList2.size() - 1) {
                        sb.append("&");
                    }
                    if (i6 > size3) {
                        break;
                    }
                    i5 = i6;
                }
            }
            stringToEncode = sb.toString();
            Intrinsics.checkNotNullExpressionValue(stringToEncode, "sb.toString()");
        }
        String debug4 = Intrinsics.stringPlus("sortedParams is ", stringToEncode);
        Intrinsics.checkNotNullParameter(debug4, "debug");
        if (o0O0o000.f34971OooO0Oo) {
            o0O0o000.f34969OooO0O0.OooO00o(3, o0O0o000.f34970OooO0OO, debug4);
        }
        o0O0oo0o o0o0oo0o2 = o0O0oo0o.f34965OooO00o;
        Intrinsics.checkNotNullParameter(stringToEncode, "stringToEncode");
        Intrinsics.checkNotNullParameter(keyString, "keyString");
        if (!(keyString.length() > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(stringToEncode.length() > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        try {
            SecretKeySpec secretKeySpecOooO00o = o0o0oo0o2.OooO00o(keyString);
            Charset charsetForName2 = Charset.forName("UTF8");
            Intrinsics.checkNotNullExpressionValue(charsetForName2, "Charset.forName(charsetName)");
            byte[] bytes = stringToEncode.getBytes(charsetForName2);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(o0O0oo0o.f34967OooO0OO);
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher2.init(1, secretKeySpecOooO00o, ivParameterSpec);
            byte[] bArrOooO0O0 = OooO00o.OooO0O0(cipher2.doFinal(bytes));
            Intrinsics.checkNotNullExpressionValue(bArrOooO0O0, "encode(cipher.doFinal(clearText))");
            str2 = new String(bArrOooO0O0, Charsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        } catch (InvalidAlgorithmParameterException e3) {
            e3.printStackTrace();
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
        } catch (IllegalBlockSizeException e7) {
            e7.printStackTrace();
        } catch (NoSuchPaddingException e8) {
            e8.printStackTrace();
        }
        String debug5 = Intrinsics.stringPlus("aesEncrypted(sign) is ", str2);
        Intrinsics.checkNotNullParameter(debug5, "debug");
        if (o0O0o000.f34971OooO0Oo) {
            o0O0o000.f34969OooO0O0.OooO00o(3, o0O0o000.f34970OooO0OO, debug5);
        }
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(ooo00o0o.f51883OooO0o);
        oooO00o.OooO00o("SignKey", strOooOo00);
        oooO00o.OooO00o("Sign", str2);
        oooO00o.OooO00o("User-Agent", "ANDROID");
        oooO00o.OooO00o("User-Agent-Version", "12");
        TokenModel tokenModel = p267o00ooo0o.o00OO0OO.f34924OooO0oO;
        if (tokenModel != null) {
            oooO00o.OooO00o("Authorization", Intrinsics.stringPlus("Bearer ", tokenModel.getAccessToken()));
        }
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(oooO00o.OooO0O0());
        Intrinsics.checkNotNullExpressionValue(o00oooo0OooO0O0, "chain.proceed(newRequest.build())");
        return o00oooo0OooO0O0;
    }
}
