package p612o0oo0OoO;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.util.Base64;
import android.util.Log;
import androidx.camera.core.impl.OooOOOO;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.zip.Inflater;
import kotlin.collections.ArraysKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p039OoooOoo.o0o0Oo;
import p041Ooooo0o.o00000;
import p613o0oo0Ooo.w5;
import p616o0oo0o00.Oooo0;
import p620o0oo0oO0.o00;

/* JADX INFO: loaded from: classes4.dex */
public final class p5 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final r5 f57453OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o5 f57454OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Integer f57455OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f57456OooO0Oo;

    public p5(@NotNull r5 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f57453OooO00o = playerEva;
    }

    public static int[] OooO00o(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth() / 10;
        int height = bitmap.getHeight() / 10;
        int i3 = i + width;
        int i4 = i2 + height;
        int i5 = (width * 2) + i;
        int i6 = (width * 3) + i;
        int i7 = (width * 4) + i;
        int i8 = (height * 2) + i2;
        int i9 = (height * 3) + i2;
        int i10 = (height * 4) + i2;
        return new int[]{bitmap.getPixel(i3, i4), bitmap.getPixel(i5, i4), bitmap.getPixel(i6, i4), bitmap.getPixel(i7, i4), bitmap.getPixel(i3, i8), bitmap.getPixel(i5, i8), bitmap.getPixel(i6, i8), bitmap.getPixel(i7, i8), bitmap.getPixel(i3, i9), bitmap.getPixel(i5, i9), bitmap.getPixel(i6, i9), bitmap.getPixel(i7, i9), bitmap.getPixel(i3, i10), bitmap.getPixel(i5, i10), bitmap.getPixel(i6, i10), bitmap.getPixel(i7, i10)};
    }

    public static boolean OooO0O0(int[] iArr) {
        for (int i : iArr) {
            int iRed = Color.red(i);
            int iGreen = Color.green(i);
            int iBlue = Color.blue(i);
            StringBuilder sbOooO00o = o00000.OooO00o("r=", iRed, " ,g=", iGreen, " ,b=");
            sbOooO00o.append(iBlue);
            Log.i("打印选择的值", sbOooO00o.toString());
            if ((Math.abs(iRed - iGreen) > 10 || Math.abs(iGreen - iBlue) > 10 || Math.abs(iBlue - iRed) > 10) && iRed > 30 && iGreen > 30 && iBlue > 30) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0447  */
    /* JADX WARN: Code duplicated, block: B:193:0x0465 A[LOOP:4: B:153:0x0353->B:193:0x0465, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:232:0x046a A[EDGE_INSN: B:232:0x046a->B:194:0x046a BREAK  A[LOOP:4: B:153:0x0353->B:193:0x0465], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    public final boolean OooO0OO(@NotNull Oooo0 evaFileContainer, int i) throws IOException {
        int i2;
        boolean z;
        File fileOooO0Oo;
        boolean z2;
        boolean z3;
        String strSubstring;
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        o5 o5Var = new o5();
        this.f57454OooO0O0 = o5Var;
        r5 r5Var = this.f57453OooO00o;
        if (r5Var.f57479OooOo0) {
            o5Var.f57425OooO0o = true;
            o5Var.f57428OooO0oo = -1;
            o5Var.f57427OooO0oO = i;
            w5 w5Var = r5Var.f57463OooO0Oo;
            if (w5Var != null) {
                o00 o00Var = (o00) w5Var.f57489OooOO0.getValue();
                if (i <= 0) {
                    o00Var.getClass();
                } else {
                    o00Var.f57577OooO0Oo = o00Var.f57574OooO00o / ((long) i);
                }
            }
            r5Var.f57466OooO0oO = i;
            return true;
        }
        evaFileContainer.OooO00o();
        byte[] bArr = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
        byte[] bArr2 = new byte[ConstantsKt.MINIMUM_BLOCK_SIZE];
        boolean z4 = false;
        String string = "";
        ?? r8 = 0;
        while (true) {
            if (evaFileContainer.read(bArr) > 0) {
                if (z4) {
                    Charset charset = Charsets.UTF_8;
                    String str = new String(bArr, charset);
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default(str, "]]yyeffectmp4json", (int) r8, (boolean) r8, 6, (Object) null);
                    if (iIndexOf$default > 0) {
                        StringBuilder sbOooO00o = o0o0Oo.OooO00o(string);
                        String strSubstring2 = str.substring(r8, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sbOooO00o.append(strSubstring2);
                        string = sbOooO00o.toString();
                        i2 = 6;
                    } else {
                        if (!(bArr2.length == 0)) {
                            i2 = 6;
                            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) new String(ArraysKt.plus(bArr, bArr2), charset), "]]yyeffectmp4json", 0, false, 6, (Object) null);
                            if (iIndexOf$default2 > 0) {
                                String strSubstring3 = string.substring(0, (string.length() - (iIndexOf$default2 - bArr2.length)) - 1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                string = strSubstring3;
                            }
                        }
                        string = OooOOOO.OooO00o(string, str);
                        bArr2 = bArr;
                    }
                    z = true;
                } else {
                    Charset charset2 = Charsets.UTF_8;
                    String str2 = new String(bArr, charset2);
                    int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default(str2, "yyeffectmp4json[[", (int) r8, (boolean) r8, 6, (Object) null);
                    if (iIndexOf$default3 > 0) {
                        String strSubstring4 = str2.substring(iIndexOf$default3 + 17);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
                        int iIndexOf$default4 = StringsKt__StringsKt.indexOf$default((CharSequence) strSubstring4, "]]yyeffectmp4json", 0, false, 6, (Object) null);
                        if (iIndexOf$default4 > 0) {
                            strSubstring = strSubstring4.substring(0, iIndexOf$default4);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        } else {
                            string = strSubstring4;
                            z4 = true;
                        }
                    } else {
                        if (!(bArr2.length == 0)) {
                            String str3 = new String(ArraysKt.plus(bArr, bArr2), charset2);
                            int iIndexOf$default5 = StringsKt__StringsKt.indexOf$default((CharSequence) str3, "yyeffectmp4json[[", 0, false, 6, (Object) null);
                            if (iIndexOf$default5 > 0) {
                                string = str3.substring(iIndexOf$default5 + 17);
                                Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String).substring(startIndex)");
                                int iIndexOf$default6 = StringsKt__StringsKt.indexOf$default((CharSequence) string, "]]yyeffectmp4json", 0, false, 6, (Object) null);
                                if (iIndexOf$default6 > 0) {
                                    strSubstring = string.substring(0, iIndexOf$default6);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                } else {
                                    z4 = true;
                                }
                            }
                        }
                        bArr2 = bArr;
                    }
                    string = strSubstring;
                    z = true;
                    z4 = true;
                    i2 = 6;
                }
                r8 = 0;
            } else {
                i2 = 6;
                z = false;
            }
            evaFileContainer.OooO0O0();
            if (z4 && z) {
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] data = Base64.decode(bytes, 0);
                Intrinsics.checkNotNullExpressionValue(data, "decode(jsonStr.toByteArray(), Base64.DEFAULT)");
                Intrinsics.checkNotNullParameter(data, "data");
                Inflater inflater = new Inflater();
                inflater.reset();
                inflater.setInput(data, 0, data.length);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(data.length);
                try {
                    try {
                        byte[] bArr3 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                        while (!inflater.finished()) {
                            byteArrayOutputStream.write(bArr3, 0, inflater.inflate(bArr3));
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        Intrinsics.checkNotNullExpressionValue(byteArray, "o.toByteArray()");
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        data = byteArray;
                    } catch (Throwable th) {
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                inflater.end();
                String strDecodeToString = StringsKt.decodeToString(data);
                String msg = "jsonStr:" + strDecodeToString;
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaAnimConfigManager", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter(msg, "msg");
                JSONObject json = new JSONObject(strDecodeToString);
                o5Var.f57420OooO = json;
                Intrinsics.checkNotNullParameter(json, "json");
                try {
                    JSONObject jSONObjectOptJSONObject = json.optJSONObject("descript");
                    if (jSONObjectOptJSONObject != null) {
                        o5.OooO0OO oooO0OO = new o5.OooO0OO(jSONObjectOptJSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY), jSONObjectOptJSONObject.optInt(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY), jSONObjectOptJSONObject.optBoolean("isEffect"), jSONObjectOptJSONObject.optInt(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION), o5.OooO0OO(jSONObjectOptJSONObject.getJSONArray("rgbFrame")), o5.OooO0OO(jSONObjectOptJSONObject.getJSONArray("alphaFrame")), jSONObjectOptJSONObject.optInt("fps"), jSONObjectOptJSONObject.optBoolean("haAudio"), jSONObjectOptJSONObject.optBoolean("hasBg"));
                        o5Var.f57423OooO0OO = oooO0OO;
                        Intrinsics.checkNotNull(oooO0OO);
                        o5.OooO0OO oooO0OO2 = o5Var.f57423OooO0OO;
                        Intrinsics.checkNotNull(oooO0OO2);
                        oooO0OO2.getClass();
                        o5.OooO0OO oooO0OO3 = o5Var.f57423OooO0OO;
                        Intrinsics.checkNotNull(oooO0OO3);
                        o5Var.f57421OooO00o = oooO0OO3.f57441OooO0o0.f57590OooO0OO;
                        o5.OooO0OO oooO0OO4 = o5Var.f57423OooO0OO;
                        Intrinsics.checkNotNull(oooO0OO4);
                        o5Var.f57422OooO0O0 = oooO0OO4.f57441OooO0o0.f57591OooO0Oo;
                        o5.OooO0OO oooO0OO5 = o5Var.f57423OooO0OO;
                        Intrinsics.checkNotNull(oooO0OO5);
                        oooO0OO5.getClass();
                        o5.OooO0OO oooO0OO6 = o5Var.f57423OooO0OO;
                        Intrinsics.checkNotNull(oooO0OO6);
                        oooO0OO6.getClass();
                        o5.OooO0OO oooO0OO7 = o5Var.f57423OooO0OO;
                        Intrinsics.checkNotNull(oooO0OO7);
                        o5Var.f57427OooO0oO = oooO0OO7.f57442OooO0oO;
                    }
                    JSONArray jSONArrayOptJSONArray = json.optJSONArray("effect");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        o5Var.f57424OooO0Oo = new ArrayList();
                        int length = jSONArrayOptJSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            ArrayList arrayList = o5Var.f57424OooO0Oo;
                            if (arrayList != null) {
                                arrayList.add(o5.OooO0O0(jSONArrayOptJSONArray.getJSONObject(i3)));
                            }
                        }
                    }
                    JSONArray jSONArrayOptJSONArray2 = json.optJSONArray("datas");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        o5Var.f57426OooO0o0 = new ArrayList();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i4 = 0; i4 < length2; i4++) {
                            ArrayList arrayList2 = o5Var.f57426OooO0o0;
                            if (arrayList2 != null) {
                                arrayList2.add(o5.OooO00o(jSONArrayOptJSONArray2.getJSONObject(i4)));
                            }
                        }
                    }
                    ArrayList arrayList3 = o5Var.f57424OooO0Oo;
                    if (!(arrayList3 == null || arrayList3.isEmpty())) {
                        ArrayList arrayList4 = o5Var.f57426OooO0o0;
                        if (!(arrayList4 == null || arrayList4.isEmpty())) {
                            o5Var.f57429OooOO0 = true;
                        }
                    }
                    z3 = true;
                } catch (JSONException tr) {
                    String msg2 = "json parse fail " + tr;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaAnimConfig", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg2, "msg");
                    Intrinsics.checkNotNullParameter(tr, "tr");
                    z3 = false;
                    o5Var.f57429OooOO0 = false;
                }
                if (o5Var.f57427OooO0oO == 0) {
                    o5Var.f57427OooO0oO = i;
                }
                int i5 = o5Var.f57427OooO0oO;
                w5 w5Var2 = r5Var.f57463OooO0Oo;
                if (w5Var2 != null) {
                    o00 o00Var2 = (o00) w5Var2.f57489OooOO0.getValue();
                    if (i5 <= 0) {
                        o00Var2.getClass();
                    } else {
                        o00Var2.f57577OooO0Oo = o00Var2.f57574OooO00o / ((long) i5);
                    }
                }
                r5Var.f57466OooO0oO = i5;
                return z3;
            }
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaAnimConfigManager", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("yyeffectmp4json not found", "msg");
            if (r5Var.f57472OooOOO0 == -1 && (fileOooO0Oo = evaFileContainer.OooO0Oo()) != null && fileOooO0Oo.exists()) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(fileOooO0Oo.getAbsolutePath());
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                Long lValueOf = strExtractMetadata != null ? Long.valueOf(Long.parseLong(strExtractMetadata)) : null;
                if (lValueOf != null && lValueOf.longValue() > 0) {
                    int i6 = 1;
                    int i7 = i2;
                    while (i6 < 7) {
                        this.f57456OooO0Oo = System.currentTimeMillis();
                        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(((lValueOf.longValue() * ((long) i6)) / ((long) i7)) * ((long) 1000), 3);
                        if (frameAtTime != null) {
                            int width = frameAtTime.getWidth();
                            int height = frameAtTime.getHeight();
                            Log.i("EvaAnimPlayer.EvaAnimConfigManager", "ltIsGray");
                            boolean zOooO0O0 = OooO0O0(OooO00o(frameAtTime, 0, 0));
                            Log.i("EvaAnimPlayer.EvaAnimConfigManager", "rtIsGray");
                            int i8 = width / 2;
                            boolean zOooO0O1 = OooO0O0(OooO00o(frameAtTime, i8, 0));
                            Log.i("EvaAnimPlayer.EvaAnimConfigManager", "lbIsGray");
                            int i9 = height / 2;
                            boolean zOooO0O2 = OooO0O0(OooO00o(frameAtTime, 0, i9));
                            Log.i("EvaAnimPlayer.EvaAnimConfigManager", "rbIsGray");
                            boolean zOooO0O3 = OooO0O0(OooO00o(frameAtTime, i8, i9));
                            Log.i("EvaAnimPlayer.EvaAnimConfigManager", "ltIsGray " + zOooO0O0 + ", rtIsGray " + zOooO0O1 + ", lbIsGray " + zOooO0O2 + ", rbIsGray " + zOooO0O3);
                            if (!zOooO0O0 && !zOooO0O2 && !zOooO0O1 && !zOooO0O3) {
                                Log.i("EvaAnimPlayer.EvaAnimConfigManager", "正常mp4");
                                r5Var.f57479OooOo0 = true;
                            } else if (zOooO0O0 && zOooO0O2 && !(zOooO0O1 && zOooO0O3)) {
                                Log.i("EvaAnimPlayer.EvaAnimConfigManager", "左灰右彩");
                                r5Var.f57472OooOOO0 = 1;
                            } else if (!(zOooO0O0 && zOooO0O2) && zOooO0O1 && zOooO0O3) {
                                Log.i("EvaAnimPlayer.EvaAnimConfigManager", "左彩右灰");
                                r5Var.f57472OooOOO0 = 3;
                            } else if (zOooO0O0 && zOooO0O1 && !(zOooO0O2 && zOooO0O3)) {
                                Log.i("EvaAnimPlayer.EvaAnimConfigManager", "上灰下彩");
                                r5Var.f57472OooOOO0 = 2;
                            } else {
                                if ((!zOooO0O0 || !zOooO0O1) && zOooO0O2 && zOooO0O3) {
                                    Log.i("EvaAnimPlayer.EvaAnimConfigManager", "上彩下灰");
                                    r5Var.f57472OooOOO0 = 4;
                                }
                                if (frameAtTime != null) {
                                    frameAtTime.recycle();
                                }
                                Log.i("EvaAnimPlayer.EvaAnimConfigManager", "detect image mp4Type " + (System.currentTimeMillis() - this.f57456OooO0Oo));
                                if (z2) {
                                    break;
                                }
                                i6++;
                                i7 = 6;
                            }
                            z2 = true;
                            if (frameAtTime != null) {
                                frameAtTime.recycle();
                            }
                            Log.i("EvaAnimPlayer.EvaAnimConfigManager", "detect image mp4Type " + (System.currentTimeMillis() - this.f57456OooO0Oo));
                            if (z2) {
                                break;
                                break;
                            }
                            i6++;
                            i7 = 6;
                        } else {
                            Log.e("EvaAnimPlayer.EvaAnimConfigManager", "getConfigManager bitmap is null");
                            Integer num = this.f57455OooO0OO;
                            if (num != null) {
                                Intrinsics.checkNotNull(num);
                                r5Var.f57472OooOOO0 = num.intValue();
                            }
                        }
                        z2 = false;
                        if (frameAtTime != null) {
                            frameAtTime.recycle();
                        }
                        Log.i("EvaAnimPlayer.EvaAnimConfigManager", "detect image mp4Type " + (System.currentTimeMillis() - this.f57456OooO0Oo));
                        if (z2) {
                            break;
                            break;
                        }
                        i6++;
                        i7 = 6;
                    }
                }
                mediaMetadataRetriever.release();
            }
            o5Var.f57425OooO0o = true;
            int i10 = r5Var.f57472OooOOO0;
            if (i10 == -1) {
                r5Var.f57479OooOo0 = true;
            }
            o5Var.f57428OooO0oo = i10;
            o5Var.f57427OooO0oO = i;
            w5 w5Var3 = r5Var.f57463OooO0Oo;
            if (w5Var3 != null) {
                o00 o00Var3 = (o00) w5Var3.f57489OooOO0.getValue();
                if (i <= 0) {
                    o00Var3.getClass();
                } else {
                    o00Var3.f57577OooO0Oo = o00Var3.f57574OooO00o / ((long) i);
                }
            }
            r5Var.f57466OooO0oO = i;
            return true;
        }
    }
}
