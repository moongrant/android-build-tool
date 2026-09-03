package o00000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o0O0O00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o0000O0O.OooO;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p081o000OoO.o000oOoO;
import p081o000OoO.o00oO0o;
import p100o000oOoO.oOO00O;
import p146o00Oo0.o00000O;
import p146o00Oo0.o00000O0;
import p146o00Oo0.o00000OO;
import p146o00Oo0.o0000oo;
import p146o00Oo0.o0Oo0oo;
import p221o00oO0o.o0OOO0o;
import p221o00oO0o.o0ooOOo;
import p264o00ooo.o000O0;
import p264o00ooo.o000OO0O;
import p710oo000o.OooOOO0;
import p710oo000o.OooOOOO;
import p710oo000o.o00Oo0;
import p710oo000o.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    /* JADX WARN: Code duplicated, block: B:114:0x0329  */
    /* JADX WARN: Code duplicated, block: B:116:0x032c  */
    /* JADX WARN: Code duplicated, block: B:117:0x032f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0332  */
    /* JADX WARN: Code duplicated, block: B:121:0x0382  */
    /* JADX WARN: Code duplicated, block: B:122:0x0385  */
    /* JADX WARN: Code duplicated, block: B:134:0x0416  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a2  */
    @Composable
    @NotNull
    public static final o000OO0O OooO00o(@DrawableRes int i, @Nullable oOO00O ooo00o) {
        o000OO0O o000oo0o2;
        long jOooO0O0;
        int i2;
        Resources.Theme theme;
        int i3;
        int i4;
        int iOooO0OO;
        int i5;
        int iOooO0OO2;
        int i6;
        ooo00o.OooO0o0(473971343);
        Context context = (Context) ooo00o.OooOO0o(o0O0O00.f6616OooO0O0);
        Resources res = context.getResources();
        ooo00o.OooO0o0(-492369756);
        Object objOooO0o = ooo00o.OooO0o();
        Object obj = oOO00O.OooO00o.f29707OooO0O0;
        if (objOooO0o == obj) {
            objOooO0o = new TypedValue();
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        TypedValue typedValue = (TypedValue) objOooO0o;
        res.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && StringsKt__StringsKt.endsWith$default(charSequence, ".xml", false, 2, (Object) null)) {
            ooo00o.OooO0o0(-738265321);
            Resources.Theme theme2 = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme2, "context.theme");
            Intrinsics.checkNotNullExpressionValue(res, "res");
            ooo00o.OooO0o0(2112503116);
            OooO00o oooO00o = (OooO00o) ooo00o.OooOO0o(o0O0O00.f6617OooO0OO);
            OooO00o.OooO0O0 key = new OooO00o.OooO0O0(theme2, i);
            Objects.requireNonNull(oooO00o);
            String str = "key";
            Intrinsics.checkNotNullParameter(key, "key");
            WeakReference<OooO00o.C0278OooO00o> weakReference = oooO00o.f26589OooO00o.get(key);
            OooO00o.C0278OooO00o imageVectorEntry = weakReference != null ? weakReference.get() : null;
            if (imageVectorEntry == null) {
                XmlResourceParser parser = res.getXml(i);
                Intrinsics.checkNotNullExpressionValue(parser, "res.getXml(id)");
                Intrinsics.checkNotNullParameter(parser, "<this>");
                int next = parser.next();
                while (next != 2 && next != 1) {
                    next = parser.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!Intrinsics.areEqual(parser.getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
                Intrinsics.checkNotNullParameter(res, "res");
                Intrinsics.checkNotNullParameter(parser, "parser");
                AttributeSet attrs = Xml.asAttributeSet(parser);
                o0ooOOo o0ooooo2 = new o0ooOOo(parser);
                Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
                Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
                Intrinsics.checkNotNullParameter(res, "res");
                Intrinsics.checkNotNullParameter(attrs, "attrs");
                TypedArray typedArray = o0ooooo2.OooO0o0(res, theme2, attrs, o0OOO0o.f33698OooO00o);
                String str2 = "typedArray";
                Intrinsics.checkNotNullParameter(typedArray, "typedArray");
                Intrinsics.checkNotNullParameter("autoMirrored", "attrName");
                boolean zOooO00o = o00oO0o.OooO00o(typedArray, o0ooooo2.f33702OooO00o, "autoMirrored", 5, false);
                o0ooooo2.OooO0o(typedArray.getChangingConfigurations());
                float fOooO0O0 = o0ooooo2.OooO0O0(typedArray, "viewportWidth", 7, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                float fOooO0O1 = o0ooooo2.OooO0O0(typedArray, "viewportHeight", 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                if (fOooO0O0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                }
                if (fOooO0O1 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                }
                Intrinsics.checkNotNullParameter(typedArray, "typedArray");
                int i7 = 3;
                float dimension = typedArray.getDimension(3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                o0ooooo2.OooO0o(typedArray.getChangingConfigurations());
                Intrinsics.checkNotNullParameter(typedArray, "typedArray");
                float dimension2 = typedArray.getDimension(2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                o0ooooo2.OooO0o(typedArray.getChangingConfigurations());
                if (typedArray.hasValue(1)) {
                    TypedValue typedValue2 = new TypedValue();
                    typedArray.getValue(1, typedValue2);
                    if (typedValue2.type == 2) {
                        o00000O0.OooO00o oooO00o2 = o00000O0.f32084OooO0O0;
                        jOooO0O0 = o00000O0.f32083OooO;
                    } else {
                        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
                        Intrinsics.checkNotNullParameter("tint", "attrName");
                        ColorStateList colorStateListOooO0OO = o00oO0o.OooO0OO(typedArray, o0ooooo2.f33702OooO00o, theme2);
                        o0ooooo2.OooO0o(typedArray.getChangingConfigurations());
                        if (colorStateListOooO0OO != null) {
                            jOooO0O0 = o00000OO.OooO0O0(colorStateListOooO0OO.getDefaultColor());
                        } else {
                            o00000O0.OooO00o oooO00o3 = o00000O0.f32084OooO0O0;
                            jOooO0O0 = o00000O0.f32083OooO;
                        }
                    }
                } else {
                    o00000O0.OooO00o oooO00o4 = o00000O0.f32084OooO0O0;
                    jOooO0O0 = o00000O0.f32083OooO;
                }
                long j = jOooO0O0;
                Intrinsics.checkNotNullParameter(typedArray, "typedArray");
                int i8 = typedArray.getInt(6, -1);
                o0ooooo2.OooO0o(typedArray.getChangingConfigurations());
                if (i8 == -1) {
                    i2 = 5;
                } else if (i8 == 3) {
                    i2 = 3;
                } else if (i8 == 5) {
                    i2 = 5;
                } else if (i8 != 9) {
                    switch (i8) {
                        case 14:
                            i2 = 13;
                            break;
                        case 15:
                            i2 = 14;
                            break;
                        case 16:
                            i2 = 12;
                            break;
                        default:
                            i2 = 5;
                            break;
                    }
                } else {
                    i2 = 9;
                }
                float f = dimension / res.getDisplayMetrics().density;
                float f2 = dimension2 / res.getDisplayMetrics().density;
                typedArray.recycle();
                OooOOO0.OooO00o builder = new OooOOO0.OooO00o(f, f2, fOooO0O0, fOooO0O1, j, i2, zOooO00o);
                Resources.Theme theme3 = theme2;
                int i9 = 0;
                while (true) {
                    Intrinsics.checkNotNullParameter(parser, "<this>");
                    if (parser.getEventType() == 1 || (parser.getDepth() < 1 && parser.getEventType() == i7)) {
                        String str3 = str;
                        builder.OooO0Oo();
                        while (builder.f53120OooO.size() > 1) {
                            builder.OooO0OO();
                        }
                        OooOOO0 oooOOO0 = new OooOOO0(builder.f53121OooO00o, builder.f53122OooO0O0, builder.f53123OooO0OO, builder.f53124OooO0Oo, builder.f53126OooO0o0, builder.OooO0O0(builder.f53129OooOO0), builder.f53125OooO0o, builder.f53127OooO0oO, builder.f53128OooO0oo);
                        builder.f53130OooOO0O = true;
                        imageVectorEntry = new OooO00o.C0278OooO00o(oooOOO0, o0ooooo2.f33703OooO0O0);
                        Intrinsics.checkNotNullParameter(key, str3);
                        Intrinsics.checkNotNullParameter(imageVectorEntry, "imageVectorEntry");
                        oooO00o.f26589OooO00o.put(key, new WeakReference<>(imageVectorEntry));
                    } else {
                        Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
                        Intrinsics.checkNotNullParameter(res, "res");
                        Intrinsics.checkNotNullParameter(attrs, "attrs");
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        int eventType = o0ooooo2.f33702OooO00o.getEventType();
                        String str4 = str;
                        XmlResourceParser xmlResourceParser = parser;
                        if (eventType == 2) {
                            String name = o0ooooo2.f33702OooO00o.getName();
                            if (name != null) {
                                int iHashCode = name.hashCode();
                                if (iHashCode != -1649314686) {
                                    i3 = i9;
                                    if (iHashCode != 3433509) {
                                        if (iHashCode == 98629247 && name.equals("group")) {
                                            Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
                                            Intrinsics.checkNotNullParameter(res, "res");
                                            Intrinsics.checkNotNullParameter(attrs, "attrs");
                                            Intrinsics.checkNotNullParameter(builder, "builder");
                                            TypedArray typedArrayOooO0o0 = o0ooooo2.OooO0o0(res, theme3, attrs, o0OOO0o.f33699OooO0O0);
                                            float fOooO0O2 = o0ooooo2.OooO0O0(typedArrayOooO0o0, "rotation", 5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            Intrinsics.checkNotNullParameter(typedArrayOooO0o0, str2);
                                            float f3 = typedArrayOooO0o0.getFloat(1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            o0ooooo2.OooO0o(typedArrayOooO0o0.getChangingConfigurations());
                                            Intrinsics.checkNotNullParameter(typedArrayOooO0o0, str2);
                                            float f4 = typedArrayOooO0o0.getFloat(2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            o0ooooo2.OooO0o(typedArrayOooO0o0.getChangingConfigurations());
                                            float fOooO0O3 = o0ooooo2.OooO0O0(typedArrayOooO0o0, "scaleX", 3, 1.0f);
                                            float fOooO0O4 = o0ooooo2.OooO0O0(typedArrayOooO0o0, "scaleY", 4, 1.0f);
                                            float fOooO0O5 = o0ooooo2.OooO0O0(typedArrayOooO0o0, "translateX", 6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            float fOooO0O6 = o0ooooo2.OooO0O0(typedArrayOooO0o0, "translateY", 7, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            String strOooO0Oo = o0ooooo2.OooO0Oo(typedArrayOooO0o0, 0);
                                            String str5 = strOooO0Oo == null ? "" : strOooO0Oo;
                                            typedArrayOooO0o0.recycle();
                                            builder.OooO00o(str5, fOooO0O2, f3, f4, fOooO0O3, fOooO0O4, fOooO0O5, fOooO0O6, o00Oo0.f53233OooO00o);
                                        }
                                    } else if (name.equals("path")) {
                                        Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
                                        Intrinsics.checkNotNullParameter(res, "res");
                                        Intrinsics.checkNotNullParameter(attrs, "attrs");
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        TypedArray typedArrayOooO0o1 = o0ooooo2.OooO0o0(res, theme3, attrs, o0OOO0o.f33700OooO0OO);
                                        if (!o00oO0o.OooO(o0ooooo2.f33702OooO00o, "pathData")) {
                                            throw new IllegalArgumentException("No path data available");
                                        }
                                        String name2 = o0ooooo2.OooO0Oo(typedArrayOooO0o1, 0);
                                        if (name2 == null) {
                                            name2 = "";
                                        }
                                        List<OooOOOO> pathData = o00Oo0.OooO00o(o0ooooo2.OooO0Oo(typedArrayOooO0o1, 2));
                                        o000oOoO o000ooooOooO00o = o0ooooo2.OooO00o(typedArrayOooO0o1, theme2, "fillColor", 1);
                                        str2 = str2;
                                        float fOooO0O7 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "fillAlpha", 12, 1.0f);
                                        int iOooO0OO3 = o0ooooo2.OooO0OO(typedArrayOooO0o1, "strokeLineCap", 8, -1);
                                        if (iOooO0OO3 != 0) {
                                            if (iOooO0OO3 == 1) {
                                                i4 = 1;
                                            } else if (iOooO0OO3 == 2) {
                                                i4 = 2;
                                            }
                                            iOooO0OO = o0ooooo2.OooO0OO(typedArrayOooO0o1, "strokeLineJoin", 9, -1);
                                            if (iOooO0OO != 0) {
                                                i5 = 0;
                                            } else if (iOooO0OO != 1) {
                                                i5 = 2;
                                            } else {
                                                i5 = 1;
                                            }
                                            float fOooO0O8 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "strokeMiterLimit", 10, 1.0f);
                                            o000oOoO o000ooooOooO00o2 = o0ooooo2.OooO00o(typedArrayOooO0o1, theme2, "strokeColor", 3);
                                            theme = theme2;
                                            float fOooO0O9 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "strokeAlpha", 11, 1.0f);
                                            float fOooO0O10 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "strokeWidth", 4, 1.0f);
                                            float fOooO0O11 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "trimPathEnd", 6, 1.0f);
                                            float fOooO0O12 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "trimPathOffset", 7, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            float fOooO0O13 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "trimPathStart", 5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            iOooO0OO2 = o0ooooo2.OooO0OO(typedArrayOooO0o1, "fillType", 13, 0);
                                            typedArrayOooO0o1.recycle();
                                            o0Oo0oo o0oo0ooOooO00o = p221o00oO0o.o0Oo0oo.OooO00o(o000ooooOooO00o);
                                            o0Oo0oo o0oo0ooOooO00o2 = p221o00oO0o.o0Oo0oo.OooO00o(o000ooooOooO00o2);
                                            if (iOooO0OO2 == 0) {
                                                i6 = 0;
                                            } else {
                                                i6 = 1;
                                            }
                                            Intrinsics.checkNotNullParameter(pathData, "pathData");
                                            Intrinsics.checkNotNullParameter(name2, "name");
                                            builder.OooO0Oo();
                                            ArrayList<OooOOO0.OooO00o.C0435OooO00o> arrayList = builder.f53120OooO;
                                            arrayList.get(arrayList.size() - 1).f53140OooOO0.add(new o0OO00O(name2, pathData, i6, o0oo0ooOooO00o, fOooO0O7, o0oo0ooOooO00o2, fOooO0O9, fOooO0O10, i4, i5, fOooO0O8, fOooO0O13, fOooO0O11, fOooO0O12, null));
                                        }
                                        i4 = 0;
                                        iOooO0OO = o0ooooo2.OooO0OO(typedArrayOooO0o1, "strokeLineJoin", 9, -1);
                                        if (iOooO0OO != 0) {
                                            i5 = 0;
                                        } else if (iOooO0OO != 1) {
                                            i5 = 2;
                                        } else {
                                            i5 = 1;
                                        }
                                        float fOooO0O14 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "strokeMiterLimit", 10, 1.0f);
                                        o000oOoO o000ooooOooO00o3 = o0ooooo2.OooO00o(typedArrayOooO0o1, theme2, "strokeColor", 3);
                                        theme = theme2;
                                        float fOooO0O15 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "strokeAlpha", 11, 1.0f);
                                        float fOooO0O16 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "strokeWidth", 4, 1.0f);
                                        float fOooO0O17 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "trimPathEnd", 6, 1.0f);
                                        float fOooO0O18 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "trimPathOffset", 7, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        float fOooO0O19 = o0ooooo2.OooO0O0(typedArrayOooO0o1, "trimPathStart", 5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        iOooO0OO2 = o0ooooo2.OooO0OO(typedArrayOooO0o1, "fillType", 13, 0);
                                        typedArrayOooO0o1.recycle();
                                        o0Oo0oo o0oo0ooOooO00o3 = p221o00oO0o.o0Oo0oo.OooO00o(o000ooooOooO00o);
                                        o0Oo0oo o0oo0ooOooO00o4 = p221o00oO0o.o0Oo0oo.OooO00o(o000ooooOooO00o3);
                                        if (iOooO0OO2 == 0) {
                                            i6 = 0;
                                        } else {
                                            i6 = 1;
                                        }
                                        Intrinsics.checkNotNullParameter(pathData, "pathData");
                                        Intrinsics.checkNotNullParameter(name2, "name");
                                        builder.OooO0Oo();
                                        ArrayList<OooOOO0.OooO00o.C0435OooO00o> arrayList2 = builder.f53120OooO;
                                        arrayList2.get(arrayList2.size() - 1).f53140OooOO0.add(new o0OO00O(name2, pathData, i6, o0oo0ooOooO00o3, fOooO0O7, o0oo0ooOooO00o4, fOooO0O15, fOooO0O16, i4, i5, fOooO0O14, fOooO0O19, fOooO0O17, fOooO0O18, null));
                                    }
                                } else {
                                    theme = theme2;
                                    str2 = str2;
                                    i3 = i9;
                                    if (name.equals("clip-path")) {
                                        Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
                                        Intrinsics.checkNotNullParameter(res, "res");
                                        Intrinsics.checkNotNullParameter(attrs, "attrs");
                                        Intrinsics.checkNotNullParameter(builder, "builder");
                                        theme2 = theme;
                                        TypedArray typedArrayOooO0o2 = o0ooooo2.OooO0o0(res, theme2, attrs, o0OOO0o.f33701OooO0Oo);
                                        String strOooO0Oo2 = o0ooooo2.OooO0Oo(typedArrayOooO0o2, 0);
                                        String str6 = strOooO0Oo2 == null ? "" : strOooO0Oo2;
                                        List<OooOOOO> listOooO00o = o00Oo0.OooO00o(o0ooooo2.OooO0Oo(typedArrayOooO0o2, 1));
                                        typedArrayOooO0o2.recycle();
                                        builder.OooO00o(str6, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, listOooO00o);
                                        i9 = i3 + 1;
                                        theme3 = theme2;
                                    }
                                }
                                i9 = i3;
                                theme2 = theme;
                                theme3 = theme2;
                            } else {
                                i3 = i9;
                            }
                            i9 = i3;
                        } else if (eventType == i7 && Intrinsics.areEqual("group", o0ooooo2.f33702OooO00o.getName())) {
                            int i10 = i9 + 1;
                            for (int i11 = 0; i11 < i10; i11++) {
                                builder.OooO0OO();
                            }
                            str2 = str2;
                            i9 = 0;
                        } else {
                            i3 = i9;
                            i9 = i3;
                        }
                        xmlResourceParser.next();
                        str = str4;
                        parser = xmlResourceParser;
                        str2 = str2;
                        i7 = 3;
                    }
                }
            }
            OooOOO0 image = imageVectorEntry.f26590OooO00o;
            ooo00o.Oooo0o0();
            Intrinsics.checkNotNullParameter(image, "image");
            ooo00o.OooO0o0(1413834416);
            float f5 = image.f53113OooO0O0;
            float f6 = image.f53114OooO0OO;
            float f7 = image.f53115OooO0Oo;
            float f8 = image.f53117OooO0o0;
            String str7 = image.f53112OooO00o;
            long j2 = image.f53118OooO0oO;
            int i12 = image.f53119OooO0oo;
            boolean z = image.f53111OooO;
            o000OOo0 content = o00O0000.OooO00o(ooo00o, 1873274766, new p710oo000o.o0Oo0oo(image));
            Intrinsics.checkNotNullParameter(content, "content");
            ooo00o.OooO0o0(1068590786);
            OooO oooO = (OooO) ooo00o.OooOO0o(o000.f6371OooO0o0);
            float fOoooOoo = oooO.OoooOoo(f5);
            float fOoooOoo2 = oooO.OoooOoo(f6);
            float f9 = Float.isNaN(f7) ? fOoooOoo : f7;
            float f10 = Float.isNaN(f8) ? fOoooOoo2 : f8;
            Object o00000o1 = new o00000O0(j2);
            Object o00oo0o2 = new p146o00Oo0.o00oO0o(i12);
            ooo00o.OooO0o0(511388516);
            boolean zOooo0oo = ooo00o.Oooo0oo(o00000o1) | ooo00o.Oooo0oo(o00oo0o2);
            Object objOooO0o2 = ooo00o.OooO0o();
            if (zOooo0oo || objOooO0o2 == oOO00O.OooO00o.f29707OooO0O0) {
                o00000O0.OooO00o oooO00o5 = o00000O0.f32084OooO0O0;
                Object o00000o = o00000O0.OooO0Oo(j2, o00000O0.f32083OooO) ? null : new o00000O(Build.VERSION.SDK_INT >= 29 ? p146o00Oo0.o0ooOOo.f32171OooO00o.OooO00o(j2, i12) : new PorterDuffColorFilter(o00000OO.OooO0oO(j2), p146o00Oo0.OooOOO0.OooO0O0(i12)));
                ooo00o.Oooo00o(o00000o);
                objOooO0o2 = o00000o;
            }
            ooo00o.Oooo0o0();
            o00000O o00000o2 = (o00000O) objOooO0o2;
            ooo00o.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00o.OooO0o();
            if (objOooO0o3 == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o3 = new p710oo000o.o00oO0o();
                ooo00o.Oooo00o(objOooO0o3);
            }
            ooo00o.Oooo0o0();
            p710oo000o.o00oO0o o00oo0o3 = (p710oo000o.o00oO0o) objOooO0o3;
            o00oo0o3.f53234OoooOO0.setValue(new OooOo00(OooOo.OooO00o(fOoooOoo, fOoooOoo2)));
            o00oo0o3.f53240o000oOoO.setValue(Boolean.valueOf(z));
            o00oo0o3.f53235OoooOOO.f53214OooO0o.setValue(o00000o2);
            o00oo0o3.OooOO0O(str7, f9, f10, content, ooo00o, 35840);
            ooo00o.Oooo0o0();
            ooo00o.Oooo0o0();
            ooo00o.Oooo0o0();
            o000oo0o2 = o00oo0o3;
        } else {
            ooo00o.OooO0o0(-738265196);
            Object objValueOf = Integer.valueOf(i);
            ooo00o.OooO0o0(511388516);
            boolean zOooo0oo2 = ooo00o.Oooo0oo(objValueOf) | ooo00o.Oooo0oo(charSequence);
            Object objOooO0o4 = ooo00o.OooO0o();
            if (zOooo0oo2 || objOooO0o4 == obj) {
                Intrinsics.checkNotNullExpressionValue(res, "res");
                try {
                    Intrinsics.checkNotNullParameter(o0000oo.OooO00o.f32100OooO00o, "<this>");
                    Intrinsics.checkNotNullParameter(res, "res");
                    Drawable drawable = res.getDrawable(i, null);
                    Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
                    Intrinsics.checkNotNullParameter(bitmap, "<this>");
                    objOooO0o4 = new p146o00Oo0.OooOo00(bitmap);
                    ooo00o.Oooo00o(objOooO0o4);
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
            }
            ooo00o.Oooo0o0();
            o000O0 o000o0 = new o000O0((o0000oo) objOooO0o4);
            ooo00o.Oooo0o0();
            o000oo0o2 = o000o0;
        }
        ooo00o.Oooo0o0();
        return o000oo0o2;
    }
}
