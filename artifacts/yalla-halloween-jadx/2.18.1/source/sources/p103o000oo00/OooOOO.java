package p103o000oo00;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p071o000O0o.OooOO0O;
import p081o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOO {

    public static class OooO00o implements TypeEvaluator<OooOO0O.OooO00o[]> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOO0O.OooO00o[] f29843OooO00o;

        @Override // android.animation.TypeEvaluator
        public final OooOO0O.OooO00o[] evaluate(float f, OooOO0O.OooO00o[] oooO00oArr, OooOO0O.OooO00o[] oooO00oArr2) {
            OooOO0O.OooO00o[] oooO00oArr3 = oooO00oArr;
            OooOO0O.OooO00o[] oooO00oArr4 = oooO00oArr2;
            if (!OooOO0O.OooO00o(oooO00oArr3, oooO00oArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!OooOO0O.OooO00o(this.f29843OooO00o, oooO00oArr3)) {
                this.f29843OooO00o = OooOO0O.OooO0o0(oooO00oArr3);
            }
            for (int i = 0; i < oooO00oArr3.length; i++) {
                OooOO0O.OooO00o oooO00o = this.f29843OooO00o[i];
                OooOO0O.OooO00o oooO00o2 = oooO00oArr3[i];
                OooOO0O.OooO00o oooO00o3 = oooO00oArr4[i];
                Objects.requireNonNull(oooO00o);
                oooO00o.f28168OooO00o = oooO00o2.f28168OooO00o;
                int i2 = 0;
                while (true) {
                    float[] fArr = oooO00o2.f28169OooO0O0;
                    if (i2 < fArr.length) {
                        oooO00o.f28169OooO0O0[i2] = (oooO00o3.f28169OooO0O0[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f29843OooO00o;
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02f1  */
    public static Animator OooO00o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr;
        int i3;
        int i4;
        PropertyValuesHolder propertyValuesHolderOooO0OO;
        int size;
        Keyframe keyframeOfFloat;
        ValueAnimator valueAnimatorOooO0o0;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlPullParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i5 = 3;
            boolean z = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i6 = 1;
            if (next == 1) {
                break;
            }
            int i7 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    valueAnimatorOooO0o0 = new ObjectAnimator();
                    OooO0o0(context, resources, theme, attributeSet, valueAnimatorOooO0o0, xmlPullParser);
                } else {
                    if (name.equals("animator")) {
                        valueAnimatorOooO0o0 = OooO0o0(context, resources, theme, attributeSet, null, xmlPullParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources2, theme2, attributeSet, OooOO0.f29839OooO0oo);
                        OooO00o(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "ordering", 0, 0));
                        typedArrayOooOO0.recycle();
                        i2 = depth;
                        animator = animatorSet2;
                    } else {
                        String str = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown animator name: ");
                            sbOooO0o0.append(xmlPullParser.getName());
                            throw new RuntimeException(sbOooO0o0.toString());
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType == i5 || eventType == i6) {
                                break;
                            }
                            if (eventType != i7) {
                                xmlPullParser.next();
                            } else {
                                if (xmlPullParser.getName().equals(str)) {
                                    TypedArray typedArrayOooOO1 = o00oO0o.OooOO0(resources2, theme2, attributeSetAsAttributeSet, OooOO0.f29831OooO);
                                    String strOooO0oo = o00oO0o.OooO0oo(typedArrayOooOO1, xmlPullParser, "propertyName", i5);
                                    int iOooO0o = o00oO0o.OooO0o(typedArrayOooOO1, xmlPullParser, "valueType", i7, 4);
                                    ArrayList arrayList3 = null;
                                    int i8 = iOooO0o;
                                    while (true) {
                                        int next2 = xmlPullParser.next();
                                        if (next2 == i5 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlPullParser.getName().equals("keyframe")) {
                                            if (i8 == 4) {
                                                TypedArray typedArrayOooOO2 = o00oO0o.OooOO0(resources2, theme2, Xml.asAttributeSet(xmlPullParser), OooOO0.f29840OooOO0);
                                                TypedValue typedValuePeekValue = !o00oO0o.OooO(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE) ? null : typedArrayOooOO2.peekValue(0);
                                                i8 = ((typedValuePeekValue != null) && OooO0Oo(typedValuePeekValue.type)) ? 3 : 0;
                                                typedArrayOooOO2.recycle();
                                            }
                                            TypedArray typedArrayOooOO3 = o00oO0o.OooOO0(resources2, theme2, Xml.asAttributeSet(xmlPullParser), OooOO0.f29840OooOO0);
                                            float fOooO0o0 = o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, "fraction", 3, -1.0f);
                                            TypedValue typedValuePeekValue2 = !o00oO0o.OooO(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE) ? null : typedArrayOooOO3.peekValue(0);
                                            boolean z2 = typedValuePeekValue2 != null;
                                            int i9 = i8 == 4 ? (z2 && OooO0Oo(typedValuePeekValue2.type)) ? 3 : 0 : i8;
                                            if (!z2) {
                                                keyframeOfFloat = i9 == 0 ? Keyframe.ofFloat(fOooO0o0) : Keyframe.ofInt(fOooO0o0);
                                            } else if (i9 != 0) {
                                                keyframeOfFloat = (i9 == 1 || i9 == 3) ? Keyframe.ofInt(fOooO0o0, o00oO0o.OooO0o(typedArrayOooOO3, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0)) : null;
                                            } else {
                                                keyframeOfFloat = Keyframe.ofFloat(fOooO0o0, o00oO0o.OooO0o0(typedArrayOooOO3, xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                                            }
                                            int iOooO0oO = o00oO0o.OooO0oO(typedArrayOooOO3, xmlPullParser, 1);
                                            if (iOooO0oO > 0) {
                                                keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, iOooO0oO));
                                            }
                                            typedArrayOooOO3.recycle();
                                            if (keyframeOfFloat != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(keyframeOfFloat);
                                            }
                                            xmlPullParser.next();
                                        }
                                        i5 = 3;
                                        resources2 = resources;
                                        theme2 = theme;
                                        depth = depth;
                                    }
                                    i3 = depth;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i4 = 3;
                                        propertyValuesHolderOooO0OO = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        if (fraction < 1.0f) {
                                            if (fraction < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), OooO0O0(keyframe2, 1.0f));
                                                size++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            if (fraction2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                keyframe.setFraction(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                            } else {
                                                arrayList3.add(0, OooO0O0(keyframe, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                                                size++;
                                            }
                                        }
                                        Keyframe[] keyframeArr = new Keyframe[size];
                                        arrayList3.toArray(keyframeArr);
                                        int i10 = 0;
                                        while (i10 < size) {
                                            Keyframe keyframe3 = keyframeArr[i10];
                                            if (keyframe3.getFraction() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                if (i10 == 0) {
                                                    keyframe3.setFraction(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                                } else {
                                                    int i11 = size - 1;
                                                    if (i10 == i11) {
                                                        keyframe3.setFraction(1.0f);
                                                    } else {
                                                        int i12 = i10;
                                                        for (int i13 = i10 + 1; i13 < i11 && keyframeArr[i13].getFraction() < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE; i13++) {
                                                            i12 = i13;
                                                        }
                                                        float fraction3 = (keyframeArr[i12 + 1].getFraction() - keyframeArr[i10 - 1].getFraction()) / ((i12 - i10) + 2);
                                                        int i14 = i10;
                                                        while (i14 <= i12) {
                                                            keyframeArr[i14].setFraction(keyframeArr[i14 - 1].getFraction() + fraction3);
                                                            i14++;
                                                            size = size;
                                                        }
                                                    }
                                                }
                                            }
                                            i10++;
                                            size = size;
                                        }
                                        propertyValuesHolderOooO0OO = PropertyValuesHolder.ofKeyframe(strOooO0oo, keyframeArr);
                                        i4 = 3;
                                        if (i8 == 3) {
                                            propertyValuesHolderOooO0OO.setEvaluator(OooOOOO.f29855OooO00o);
                                        }
                                    }
                                    if (propertyValuesHolderOooO0OO == null) {
                                        propertyValuesHolderOooO0OO = OooO0OO(typedArrayOooOO1, iOooO0o, 0, 1, strOooO0oo);
                                    }
                                    if (propertyValuesHolderOooO0OO != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolderOooO0OO);
                                    }
                                    typedArrayOooOO1.recycle();
                                    i5 = i4;
                                } else {
                                    i3 = depth;
                                }
                                xmlPullParser.next();
                                i6 = 1;
                                i7 = 2;
                                resources2 = resources;
                                theme2 = theme;
                                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                str = str;
                                depth = i3;
                            }
                        }
                        i2 = depth;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i15 = 0; i15 < size2; i15++) {
                                propertyValuesHolderArr[i15] = (PropertyValuesHolder) arrayList2.get(i15);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (animator instanceof ValueAnimator)) {
                            ((ValueAnimator) animator).setValues(propertyValuesHolderArr);
                        }
                        z = true;
                    }
                    if (animatorSet != null && !z) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                    resources2 = resources;
                    theme2 = theme;
                    depth = i2;
                }
                animator = valueAnimatorOooO0o0;
                i2 = depth;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator);
                }
                resources2 = resources;
                theme2 = theme;
                depth = i2;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                animatorArr[i16] = (Animator) it.next();
                i16++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animator;
    }

    public static Keyframe OooO0O0(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        return keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    public static PropertyValuesHolder OooO0OO(TypedArray typedArray, int i, int i2, int i3, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        boolean z = typedValuePeekValue != null;
        int i4 = z ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i3);
        boolean z2 = typedValuePeekValue2 != null;
        int i5 = z2 ? typedValuePeekValue2.type : 0;
        if (i == 4) {
            i = ((z && OooO0Oo(i4)) || (z2 && OooO0Oo(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            OooOO0O.OooO00o[] oooO00oArrOooO0OO = OooOO0O.OooO0OO(string);
            OooOO0O.OooO00o[] oooO00oArrOooO0OO2 = OooOO0O.OooO0OO(string2);
            if (oooO00oArrOooO0OO == null && oooO00oArrOooO0OO2 == null) {
                return null;
            }
            if (oooO00oArrOooO0OO == null) {
                if (oooO00oArrOooO0OO2 != null) {
                    return PropertyValuesHolder.ofObject(str, new OooO00o(), oooO00oArrOooO0OO2);
                }
                return null;
            }
            OooO00o oooO00o = new OooO00o();
            if (oooO00oArrOooO0OO2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, oooO00o, oooO00oArrOooO0OO);
            } else {
                if (!OooOO0O.OooO00o(oooO00oArrOooO0OO, oooO00oArrOooO0OO2)) {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, oooO00o, oooO00oArrOooO0OO, oooO00oArrOooO0OO2);
            }
            return propertyValuesHolderOfObject;
        }
        OooOOOO oooOOOO = i == 3 ? OooOOOO.f29855OooO00o : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : typedArray.getFloat(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                if (z2) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : typedArray.getFloat(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : typedArray.getFloat(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z) {
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                color2 = OooO0Oo(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                } else {
                    color3 = OooO0Oo(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z2) {
            if (i5 == 5) {
                color = (int) typedArray.getDimension(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                color = OooO0Oo(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || oooOOOO == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(oooOOOO);
        return propertyValuesHolderOfInt;
    }

    public static boolean OooO0Oo(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator OooO0o0(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        ValueAnimator valueAnimator3;
        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources, theme, attributeSet, OooOO0.f29838OooO0oO);
        TypedArray typedArrayOooOO1 = o00oO0o.OooOO0(resources, theme, attributeSet, OooOO0.f29841OooOO0O);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long jOooO0o = o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "duration", 1, ShopVehicleListModel.VehicleTagType_Vip300);
        int i = 0;
        long jOooO0o2 = o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "startOffset", 2, 0);
        int iOooO0o = o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "valueType", 7, 4);
        if (o00oO0o.OooO(xmlPullParser, "valueFrom") && o00oO0o.OooO(xmlPullParser, "valueTo")) {
            if (iOooO0o == 4) {
                TypedValue typedValuePeekValue = typedArrayOooOO0.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i2 = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayOooOO0.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                iOooO0o = ((z && OooO0Oo(i2)) || (z2 && OooO0Oo(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderOooO0OO = OooO0OO(typedArrayOooOO0, iOooO0o, 5, 6, "");
            if (propertyValuesHolderOooO0OO != null) {
                valueAnimator4.setValues(propertyValuesHolderOooO0OO);
            }
        }
        valueAnimator4.setDuration(jOooO0o);
        valueAnimator4.setStartDelay(jOooO0o2);
        valueAnimator4.setRepeatCount(o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(o00oO0o.OooO0o(typedArrayOooOO0, xmlPullParser, "repeatMode", 4, 1));
        if (typedArrayOooOO1 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String strOooO0oo = o00oO0o.OooO0oo(typedArrayOooOO1, xmlPullParser, "pathData", 1);
            if (strOooO0oo != null) {
                String strOooO0oo2 = o00oO0o.OooO0oo(typedArrayOooOO1, xmlPullParser, "propertyXName", 2);
                String strOooO0oo3 = o00oO0o.OooO0oo(typedArrayOooOO1, xmlPullParser, "propertyYName", 3);
                if (strOooO0oo2 == null && strOooO0oo3 == null) {
                    throw new InflateException(typedArrayOooOO1.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathOooO0Oo = OooOO0O.OooO0Oo(strOooO0oo);
                PathMeasure pathMeasure = new PathMeasure(pathOooO0Oo, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float length = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                do {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(pathOooO0Oo, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f = length / (iMin - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayOooOO0;
                int i3 = 0;
                float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i4 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f2 += f;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f2 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    i++;
                    iMin = i4;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strOooO0oo2 != null ? PropertyValuesHolder.ofFloat(strOooO0oo2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strOooO0oo3 != null ? PropertyValuesHolder.ofFloat(strOooO0oo3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    i = 0;
                    objectAnimator.setValues(propertyValuesHolderOfFloat2);
                } else {
                    i = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = typedArrayOooOO0;
                objectAnimator.setPropertyName(o00oO0o.OooO0oo(typedArrayOooOO1, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = typedArrayOooOO0;
        }
        TypedArray typedArray2 = typedArray;
        int iOooO0oO = o00oO0o.OooO0oO(typedArray2, xmlPullParser, i);
        if (iOooO0oO > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, iOooO0oO));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (typedArrayOooOO1 != null) {
            typedArrayOooOO1.recycle();
        }
        return valueAnimator3;
    }
}
