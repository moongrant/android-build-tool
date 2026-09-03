package o0OO0O0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOooO0.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSVGADrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGADrawable.kt\ncom/opensource/svgaplayer/SVGADrawable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1855#2,2:107\n1855#2,2:109\n1855#2,2:111\n1855#2,2:113\n*S KotlinDebug\n*F\n+ 1 SVGADrawable.kt\ncom/opensource/svgaplayer/SVGADrawable\n*L\n58#1:107,2\n70#1:109,2\n82#1:111,2\n94#1:113,2\n*E\n"})
public final class OooO extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo000o f43064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOO0 f43065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f43066OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f43067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0OO0OoO.OooO0O0 f43068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public ImageView.ScaleType f43069OooO0o0;

    public OooO(@NotNull oo000o videoItem, @NotNull OooOO0 dynamicItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        Intrinsics.checkNotNullParameter(dynamicItem, "dynamicItem");
        this.f43064OooO00o = videoItem;
        this.f43065OooO0O0 = dynamicItem;
        this.f43066OooO0OO = true;
        this.f43069OooO0o0 = ImageView.ScaleType.MATRIX;
        this.f43068OooO0o = new o0OO0OoO.OooO0O0(videoItem, dynamicItem);
    }

    public final void OooO00o(boolean z) {
        if (this.f43066OooO0OO == z) {
            return;
        }
        this.f43066OooO0OO = z;
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:129:0x029c  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a9 A[LOOP:3: B:132:0x02a7->B:133:0x02a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:139:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x0309  */
    /* JADX WARN: Code duplicated, block: B:166:0x031c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0322  */
    /* JADX WARN: Code duplicated, block: B:170:0x0329  */
    /* JADX WARN: Code duplicated, block: B:172:0x032c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0347  */
    /* JADX WARN: Code duplicated, block: B:176:0x0353  */
    /* JADX WARN: Code duplicated, block: B:178:0x035c A[LOOP:5: B:177:0x035a->B:178:0x035c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x036e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0376  */
    /* JADX WARN: Code duplicated, block: B:196:0x039a  */
    /* JADX WARN: Code duplicated, block: B:197:0x039f  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:207:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:208:0x03be  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:216:0x03da  */
    /* JADX WARN: Code duplicated, block: B:217:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:265:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x03cf A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Object[] objArr;
        boolean z;
        int i;
        Boolean[] boolArr;
        boolean zBooleanValue;
        Boolean[] boolArr2;
        boolean zBooleanValue2;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o;
        int size;
        Boolean[] boolArr3;
        int i2;
        Iterator it;
        int i3;
        int i4;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o2;
        String str;
        String str2;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o3;
        int i5;
        String str3;
        boolean z2;
        int size2;
        Boolean[] boolArr4;
        int i6;
        Iterator it2;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o4;
        String str4;
        String str5;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o5;
        Iterator it3;
        String str6;
        boolean z3;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o6;
        String str7;
        Object obj;
        Integer num;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f43066OooO0OO) {
            return;
        }
        int i7 = this.f43067OooO0Oo;
        ImageView.ScaleType scaleType = this.f43069OooO0o0;
        o0OO0OoO.OooO0O0 oooO0O0 = this.f43068OooO0o;
        oooO0O0.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        oo000o oo000oVar = oooO0O0.f43132OooO00o;
        p330o0OO0Ooo.OooO oooO = oo000oVar.f43120OooO0Oo;
        float f = (float) oooO.f43155OooO00o;
        float f2 = (float) oooO.f43156OooO0O0;
        p330o0OO0Ooo.OooOO0 oooOO1 = oooO0O0.f43133OooO0O0;
        oooOO1.getClass();
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (!(width == 0.0f)) {
            if (!(height == 0.0f)) {
                if (!(f == 0.0f)) {
                    if (!(f2 == 0.0f)) {
                        oooOO1.f43161OooO00o = 0.0f;
                        oooOO1.f43162OooO0O0 = 0.0f;
                        oooOO1.f43163OooO0OO = 1.0f;
                        oooOO1.f43164OooO0Oo = 1.0f;
                        oooOO1.f43165OooO0o0 = false;
                        float f3 = (width - f) / 2.0f;
                        float f4 = (height - f2) / 2.0f;
                        float f5 = f / f2;
                        float f6 = width / height;
                        float f7 = height / f2;
                        float f8 = width / f;
                        switch (o0OO0Ooo.OooOO0.OooO00o.$EnumSwitchMapping$0[scaleType.ordinal()]) {
                            case 1:
                                oooOO1.f43161OooO00o = f3;
                                oooOO1.f43162OooO0O0 = f4;
                                break;
                            case 2:
                                if (f5 > f6) {
                                    oooOO1.f43165OooO0o0 = false;
                                    oooOO1.f43163OooO0OO = f7;
                                    oooOO1.f43164OooO0Oo = f7;
                                    oooOO1.f43161OooO00o = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(f, f7, width, 2.0f);
                                } else {
                                    oooOO1.f43165OooO0o0 = true;
                                    oooOO1.f43163OooO0OO = f8;
                                    oooOO1.f43164OooO0Oo = f8;
                                    oooOO1.f43162OooO0O0 = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(f2, f8, height, 2.0f);
                                }
                                break;
                            case 3:
                                if (f < width && f2 < height) {
                                    oooOO1.f43161OooO00o = f3;
                                    oooOO1.f43162OooO0O0 = f4;
                                } else if (f5 > f6) {
                                    oooOO1.f43165OooO0o0 = true;
                                    oooOO1.f43163OooO0OO = f8;
                                    oooOO1.f43164OooO0Oo = f8;
                                    oooOO1.f43162OooO0O0 = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(f2, f8, height, 2.0f);
                                } else {
                                    oooOO1.f43165OooO0o0 = false;
                                    oooOO1.f43163OooO0OO = f7;
                                    oooOO1.f43164OooO0Oo = f7;
                                    oooOO1.f43161OooO00o = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(f, f7, width, 2.0f);
                                }
                                break;
                            case 4:
                                if (f5 > f6) {
                                    oooOO1.f43165OooO0o0 = true;
                                    oooOO1.f43163OooO0OO = f8;
                                    oooOO1.f43164OooO0Oo = f8;
                                    oooOO1.f43162OooO0O0 = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(f2, f8, height, 2.0f);
                                } else {
                                    oooOO1.f43165OooO0o0 = false;
                                    oooOO1.f43163OooO0OO = f7;
                                    oooOO1.f43164OooO0Oo = f7;
                                    oooOO1.f43161OooO00o = androidx.compose.ui.graphics.colorspace.OooO00o.OooO00o(f, f7, width, 2.0f);
                                }
                                break;
                            case 5:
                                if (f5 > f6) {
                                    oooOO1.f43165OooO0o0 = true;
                                    oooOO1.f43163OooO0OO = f8;
                                    oooOO1.f43164OooO0Oo = f8;
                                } else {
                                    oooOO1.f43165OooO0o0 = false;
                                    oooOO1.f43163OooO0OO = f7;
                                    oooOO1.f43164OooO0Oo = f7;
                                }
                                break;
                            case 6:
                                if (f5 > f6) {
                                    oooOO1.f43165OooO0o0 = true;
                                    oooOO1.f43163OooO0OO = f8;
                                    oooOO1.f43164OooO0Oo = f8;
                                    oooOO1.f43162OooO0O0 = height - (f2 * f8);
                                } else {
                                    oooOO1.f43165OooO0o0 = false;
                                    oooOO1.f43163OooO0OO = f7;
                                    oooOO1.f43164OooO0Oo = f7;
                                    oooOO1.f43161OooO00o = width - (f * f7);
                                }
                                break;
                            case 7:
                                Math.max(f8, f7);
                                oooOO1.f43165OooO0o0 = f8 > f7;
                                oooOO1.f43163OooO0OO = f8;
                                oooOO1.f43164OooO0Oo = f7;
                                break;
                            default:
                                oooOO1.f43165OooO0o0 = true;
                                oooOO1.f43163OooO0OO = f8;
                                oooOO1.f43164OooO0Oo = f8;
                                break;
                        }
                    }
                }
            }
        }
        for (p384o0OOooO0.o0OoOo0 o0oooo0 : oo000oVar.f43124OooO0oo) {
            if (o0oooo0.f44327OooO00o == i7) {
                o00O0O.f43110OooO00o.getClass();
                SoundPool soundPool = oo000oVar.f43116OooO;
                if (soundPool != null && (num = o0oooo0.f44329OooO0OO) != null) {
                    o0oooo0.f44330OooO0Oo = Integer.valueOf(soundPool.play(num.intValue(), 1.0f, 1.0f, 1, 0, 1.0f));
                }
            }
            if (o0oooo0.f44328OooO0O0 <= i7) {
                Integer num2 = o0oooo0.f44330OooO0Oo;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    o00O0O.f43110OooO00o.getClass();
                    SoundPool soundPool2 = oo000oVar.f43116OooO;
                    if (soundPool2 != null) {
                        soundPool2.stop(iIntValue);
                    }
                }
                o0oooo0.f44330OooO0Oo = null;
            }
        }
        o0OO0OoO.OooO0O0.OooO00o oooO00o = oooO0O0.f43142OooO0oO;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (oooO00o.f43145OooO00o != canvas.getWidth() || oooO00o.f43146OooO0O0 != canvas.getHeight()) {
            oooO00o.f43147OooO0OO.clear();
        }
        oooO00o.f43145OooO00o = canvas.getWidth();
        oooO00o.f43146OooO0O0 = canvas.getHeight();
        List<p384o0OOooO0.oo000o> list = oo000oVar.f43123OooO0oO;
        ArrayList<o0OO0OoO.OooO00o.C0453OooO00o> sprites = new ArrayList();
        Iterator<T> it4 = list.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            p330o0OO0Ooo.OooO0OO<o0OO0OoO.OooO00o.C0453OooO00o> oooO0OO = oooO0O0.f43134OooO0OO;
            if (!zHasNext) {
                if (sprites.size() <= 0) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                oooO0O0.f43143OooO0oo = null;
                oooO0O0.f43138OooO = null;
                int i8 = 0;
                String str8 = ((o0OO0OoO.OooO00o.C0453OooO00o) sprites.get(0)).f43136OooO0O0;
                boolean zOooOO0O = str8 != null ? StringsKt.OooOO0O(str8, ".matte") : false;
                int iSaveLayer = -1;
                int i9 = 0;
                for (Object obj2 : sprites) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o7 = (o0OO0OoO.OooO00o.C0453OooO00o) obj2;
                    String str9 = c0453OooO00o7.f43136OooO0O0;
                    if (str9 == null) {
                        if (oooO0O0.f43143OooO0oo == null) {
                            size2 = sprites.size();
                            boolArr4 = new Boolean[size2];
                            for (i6 = i8; i6 < size2; i6++) {
                                boolArr4[i6] = Boolean.FALSE;
                            }
                            it2 = sprites.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i11 = i8 + 1;
                                if (i8 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                c0453OooO00o4 = (o0OO0OoO.OooO00o.C0453OooO00o) next;
                                int i12 = iSaveLayer;
                                str4 = c0453OooO00o4.f43136OooO0O0;
                                if ((str4 == null && StringsKt.OooOO0O(str4, ".matte")) || (str5 = c0453OooO00o4.f43135OooO00o) == null || str5.length() <= 0 || (c0453OooO00o5 = (o0OO0OoO.OooO00o.C0453OooO00o) sprites.get(i8 - 1)) == null) {
                                    it3 = it2;
                                } else {
                                    it3 = it2;
                                    str6 = c0453OooO00o5.f43135OooO00o;
                                    if (str6 != null || str6.length() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        boolArr4[i8] = Boolean.TRUE;
                                    } else if (!Intrinsics.areEqual(c0453OooO00o5.f43135OooO00o, c0453OooO00o4.f43135OooO00o)) {
                                        boolArr4[i8] = Boolean.TRUE;
                                    }
                                }
                                i8 = i11;
                                iSaveLayer = i12;
                                it2 = it3;
                            }
                            i = iSaveLayer;
                            oooO0O0.f43143OooO0oo = boolArr4;
                        } else {
                            i = iSaveLayer;
                        }
                        boolArr = oooO0O0.f43143OooO0oo;
                        if (boolArr != null) {
                            zBooleanValue = boolArr[i9].booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (zBooleanValue) {
                            iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
                        } else {
                            iSaveLayer = i;
                        }
                        oooO0O0.OooO00o(c0453OooO00o7, canvas, i7);
                        if (oooO0O0.f43138OooO == null) {
                            size = sprites.size();
                            boolArr3 = new Boolean[size];
                            for (i2 = 0; i2 < size; i2++) {
                                boolArr3[i2] = Boolean.FALSE;
                            }
                            it = sprites.iterator();
                            i3 = 0;
                            while (it.hasNext()) {
                                Object next2 = it.next();
                                i4 = i3 + 1;
                                if (i3 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                c0453OooO00o2 = (o0OO0OoO.OooO00o.C0453OooO00o) next2;
                                Iterator it5 = it;
                                str = c0453OooO00o2.f43136OooO0O0;
                                if ((str == null && StringsKt.OooOO0O(str, ".matte")) || (str2 = c0453OooO00o2.f43135OooO00o) == null || str2.length() <= 0) {
                                    i5 = i4;
                                } else {
                                    if (i3 == sprites.size() - 1) {
                                        boolArr3[i3] = Boolean.TRUE;
                                    } else {
                                        c0453OooO00o3 = (o0OO0OoO.OooO00o.C0453OooO00o) sprites.get(i4);
                                        if (c0453OooO00o3 != null) {
                                            i5 = i4;
                                            str3 = c0453OooO00o3.f43135OooO00o;
                                            if (str3 != null || str3.length() == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                boolArr3[i3] = Boolean.TRUE;
                                            } else if (!Intrinsics.areEqual(c0453OooO00o3.f43135OooO00o, c0453OooO00o2.f43135OooO00o)) {
                                                boolArr3[i3] = Boolean.TRUE;
                                            }
                                        }
                                    }
                                    i5 = i4;
                                }
                                it = it5;
                                i3 = i5;
                            }
                            oooO0O0.f43138OooO = boolArr3;
                        }
                        boolArr2 = oooO0O0.f43138OooO;
                        if (boolArr2 != null) {
                            zBooleanValue2 = boolArr2[i9].booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                        if (!zBooleanValue2 && (c0453OooO00o = (o0OO0OoO.OooO00o.C0453OooO00o) linkedHashMap.get(c0453OooO00o7.f43135OooO00o)) != null) {
                            int width2 = canvas.getWidth();
                            int height2 = canvas.getHeight();
                            o0OO0OoO.OooO0O0.C0454OooO0O0 c0454OooO0O0 = oooO0O0.f43141OooO0o0;
                            c0454OooO0O0.getClass();
                            c0454OooO0O0.f43154OooO0oO = Bitmap.createBitmap(width2, height2, Bitmap.Config.ALPHA_8);
                            Bitmap bitmap = c0454OooO0O0.f43154OooO0oO;
                            Intrinsics.checkNotNull(bitmap);
                            oooO0O0.OooO00o(c0453OooO00o, new Canvas(bitmap), i7);
                            Bitmap bitmap2 = c0454OooO0O0.f43154OooO0oO;
                            Intrinsics.checkNotNull(bitmap2, "null cannot be cast to non-null type android.graphics.Bitmap");
                            Paint paint = c0454OooO0O0.f43152OooO0o;
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                            if (iSaveLayer != -1) {
                                canvas.restoreToCount(iSaveLayer);
                            } else {
                                canvas.restore();
                            }
                        }
                    } else {
                        if (!zOooOO0O) {
                            oooO0O0.OooO00o(c0453OooO00o7, canvas, i7);
                        } else if (StringsKt.OooOO0O(str9, ".matte")) {
                            linkedHashMap.put(str9, c0453OooO00o7);
                        } else {
                            if (oooO0O0.f43143OooO0oo == null) {
                                size2 = sprites.size();
                                boolArr4 = new Boolean[size2];
                                while (i6 < size2) {
                                    boolArr4[i6] = Boolean.FALSE;
                                }
                                it2 = sprites.iterator();
                                while (it2.hasNext()) {
                                    Object next3 = it2.next();
                                    int i13 = i8 + 1;
                                    if (i8 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    c0453OooO00o4 = (o0OO0OoO.OooO00o.C0453OooO00o) next3;
                                    int i14 = iSaveLayer;
                                    str4 = c0453OooO00o4.f43136OooO0O0;
                                    if (str4 == null) {
                                        it3 = it2;
                                        str6 = c0453OooO00o5.f43135OooO00o;
                                        if (str6 != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            boolArr4[i8] = Boolean.TRUE;
                                        } else if (!Intrinsics.areEqual(c0453OooO00o5.f43135OooO00o, c0453OooO00o4.f43135OooO00o)) {
                                            boolArr4[i8] = Boolean.TRUE;
                                        }
                                    } else {
                                        it3 = it2;
                                        str6 = c0453OooO00o5.f43135OooO00o;
                                        if (str6 != null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (z3) {
                                            boolArr4[i8] = Boolean.TRUE;
                                        } else if (!Intrinsics.areEqual(c0453OooO00o5.f43135OooO00o, c0453OooO00o4.f43135OooO00o)) {
                                            boolArr4[i8] = Boolean.TRUE;
                                        }
                                    }
                                    i8 = i13;
                                    iSaveLayer = i14;
                                    it2 = it3;
                                }
                                i = iSaveLayer;
                                oooO0O0.f43143OooO0oo = boolArr4;
                            } else {
                                i = iSaveLayer;
                            }
                            boolArr = oooO0O0.f43143OooO0oo;
                            if (boolArr != null) {
                                zBooleanValue = boolArr[i9].booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            if (zBooleanValue) {
                                iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
                            } else {
                                iSaveLayer = i;
                            }
                            oooO0O0.OooO00o(c0453OooO00o7, canvas, i7);
                            if (oooO0O0.f43138OooO == null) {
                                size = sprites.size();
                                boolArr3 = new Boolean[size];
                                while (i2 < size) {
                                    boolArr3[i2] = Boolean.FALSE;
                                }
                                it = sprites.iterator();
                                i3 = 0;
                                while (it.hasNext()) {
                                    Object next4 = it.next();
                                    i4 = i3 + 1;
                                    if (i3 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    c0453OooO00o2 = (o0OO0OoO.OooO00o.C0453OooO00o) next4;
                                    Iterator it6 = it;
                                    str = c0453OooO00o2.f43136OooO0O0;
                                    if (str == null) {
                                        if (i3 == sprites.size() - 1) {
                                            boolArr3[i3] = Boolean.TRUE;
                                        } else {
                                            c0453OooO00o3 = (o0OO0OoO.OooO00o.C0453OooO00o) sprites.get(i4);
                                            if (c0453OooO00o3 != null) {
                                                i5 = i4;
                                                str3 = c0453OooO00o3.f43135OooO00o;
                                                if (str3 != null) {
                                                    z2 = true;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (z2) {
                                                    boolArr3[i3] = Boolean.TRUE;
                                                } else if (!Intrinsics.areEqual(c0453OooO00o3.f43135OooO00o, c0453OooO00o2.f43135OooO00o)) {
                                                    boolArr3[i3] = Boolean.TRUE;
                                                }
                                            }
                                        }
                                        i5 = i4;
                                    } else {
                                        if (i3 == sprites.size() - 1) {
                                            boolArr3[i3] = Boolean.TRUE;
                                        } else {
                                            c0453OooO00o3 = (o0OO0OoO.OooO00o.C0453OooO00o) sprites.get(i4);
                                            if (c0453OooO00o3 != null) {
                                                i5 = i4;
                                                str3 = c0453OooO00o3.f43135OooO00o;
                                                if (str3 != null) {
                                                    z2 = true;
                                                } else {
                                                    z2 = true;
                                                }
                                                if (z2) {
                                                    boolArr3[i3] = Boolean.TRUE;
                                                } else if (!Intrinsics.areEqual(c0453OooO00o3.f43135OooO00o, c0453OooO00o2.f43135OooO00o)) {
                                                    boolArr3[i3] = Boolean.TRUE;
                                                }
                                            }
                                        }
                                        i5 = i4;
                                    }
                                    it = it6;
                                    i3 = i5;
                                }
                                oooO0O0.f43138OooO = boolArr3;
                            }
                            boolArr2 = oooO0O0.f43138OooO;
                            if (boolArr2 != null) {
                                zBooleanValue2 = boolArr2[i9].booleanValue();
                            } else {
                                zBooleanValue2 = false;
                            }
                            if (!zBooleanValue2) {
                            }
                        }
                        zOooOO0O = zOooOO0O;
                    }
                    i8 = 0;
                    i9 = i10;
                    zOooOO0O = zOooOO0O;
                }
                Intrinsics.checkNotNullParameter(sprites, "sprites");
                for (o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o8 : sprites) {
                    int i15 = oooO0OO.f43158OooO0O0;
                    int i16 = 0;
                    while (true) {
                        objArr = oooO0OO.f43157OooO00o;
                        if (i16 >= i15) {
                            z = false;
                        } else if (objArr[i16] == c0453OooO00o8) {
                            z = true;
                        } else {
                            i16++;
                        }
                    }
                    if (!(!z)) {
                        throw new IllegalStateException("Already in the pool!".toString());
                    }
                    int i17 = oooO0OO.f43158OooO0O0;
                    if (i17 < objArr.length) {
                        objArr[i17] = c0453OooO00o8;
                        oooO0OO.f43158OooO0O0 = i17 + 1;
                    }
                }
                return;
            }
            p384o0OOooO0.oo000o oo000oVar2 = (p384o0OOooO0.oo000o) it4.next();
            if (i7 < 0 || i7 >= oo000oVar2.f44333OooO0OO.size() || (str7 = oo000oVar2.f44331OooO00o) == null) {
                c0453OooO00o6 = null;
            } else {
                boolean zOooOO0O2 = StringsKt.OooOO0O(str7, ".matte");
                List<o00oO0o> list2 = oo000oVar2.f44333OooO0OO;
                if (zOooOO0O2 || list2.get(i7).f44322OooO00o > 0.0d) {
                    int i18 = oooO0OO.f43158OooO0O0;
                    if (i18 > 0) {
                        int i19 = i18 - 1;
                        Object[] objArr2 = oooO0OO.f43157OooO00o;
                        obj = objArr2[i19];
                        objArr2[i19] = null;
                        oooO0OO.f43158OooO0O0 = i19;
                    } else {
                        obj = null;
                    }
                    c0453OooO00o6 = (o0OO0OoO.OooO00o.C0453OooO00o) obj;
                    if (c0453OooO00o6 == null) {
                        c0453OooO00o6 = new o0OO0OoO.OooO00o.C0453OooO00o(0);
                    }
                    c0453OooO00o6.f43135OooO00o = oo000oVar2.f44332OooO0O0;
                    c0453OooO00o6.f43136OooO0O0 = str7;
                    c0453OooO00o6.f43137OooO0OO = list2.get(i7);
                } else {
                    c0453OooO00o6 = null;
                }
            }
            if (c0453OooO00o6 != null) {
                sprites.add(c0453OooO00o6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OooO(@NotNull oo000o videoItem) {
        this(videoItem, new OooOO0());
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
    }
}
