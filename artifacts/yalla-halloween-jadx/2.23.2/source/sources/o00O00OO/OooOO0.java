package o00O00OO;

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
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p031OoooO0.o00Ooo;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOO0 {

    public static class OooO00o implements TypeEvaluator<o00000oO.OooOOO.OooO00o[]> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o00000oO.OooOOO.OooO00o[] f36052OooO00o;

        @Override // android.animation.TypeEvaluator
        public final o00000oO.OooOOO.OooO00o[] evaluate(float f, o00000oO.OooOOO.OooO00o[] oooO00oArr, o00000oO.OooOOO.OooO00o[] oooO00oArr2) {
            o00000oO.OooOOO.OooO00o[] oooO00oArr3 = oooO00oArr;
            o00000oO.OooOOO.OooO00o[] oooO00oArr4 = oooO00oArr2;
            if (!p052o00000oO.OooOOO.OooO00o(oooO00oArr3, oooO00oArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!p052o00000oO.OooOOO.OooO00o(this.f36052OooO00o, oooO00oArr3)) {
                this.f36052OooO00o = p052o00000oO.OooOOO.OooO0o0(oooO00oArr3);
            }
            for (int i = 0; i < oooO00oArr3.length; i++) {
                o00000oO.OooOOO.OooO00o oooO00o = this.f36052OooO00o[i];
                o00000oO.OooOOO.OooO00o oooO00o2 = oooO00oArr3[i];
                o00000oO.OooOOO.OooO00o oooO00o3 = oooO00oArr4[i];
                oooO00o.getClass();
                oooO00o.f33481OooO00o = oooO00o2.f33481OooO00o;
                int i2 = 0;
                while (true) {
                    float[] fArr = oooO00o2.f33482OooO0O0;
                    if (i2 < fArr.length) {
                        oooO00o.f33482OooO0O0[i2] = (oooO00o3.f33482OooO0O0[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f36052OooO00o;
        }
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0316  */
    public static Animator OooO00o(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i2;
        String str;
        int i3;
        int i4;
        PropertyValuesHolder propertyValuesHolderOooO0OO;
        int size;
        int i5;
        Keyframe keyframeOfFloat;
        Animator animatorOooO0o0;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        int depth = xmlResourceParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i6 = 3;
            int i7 = 0;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i8 = 1;
            if (next == 1) {
                break;
            }
            int i9 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    OooO0o0(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorOooO0o0 = objectAnimator;
                } else {
                    if (name.equals("animator")) {
                        animatorOooO0o0 = OooO0o0(context, resources, theme, attributeSet, null, xmlResourceParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray typedArrayOooO0oo = oo000o.OooO0oo(resources2, theme2, attributeSet, o00O00OO.OooO00o.f36035OooO0oo);
                        OooO00o(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, oo000o.OooO0o0(typedArrayOooO0oo, xmlResourceParser, "ordering", 0, 0));
                        typedArrayOooO0oo.recycle();
                        animator = animatorSet2;
                    } else {
                        String str2 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                        }
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i6 || eventType == i8) {
                                break;
                            }
                            if (eventType != i9) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals(str2)) {
                                    TypedArray typedArrayOooO0oo2 = oo000o.OooO0oo(resources2, theme2, attributeSetAsAttributeSet, o00O00OO.OooO00o.f36027OooO);
                                    String strOooO0o = oo000o.OooO0o(typedArrayOooO0oo2, xmlResourceParser, "propertyName", i6);
                                    int iOooO0o0 = oo000o.OooO0o0(typedArrayOooO0oo2, xmlResourceParser, "valueType", i9, 4);
                                    int i10 = iOooO0o0;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        attributeSet2 = attributeSetAsAttributeSet;
                                        if (next2 == i6 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = o00O00OO.OooO00o.f36036OooOO0;
                                            if (i10 == 4) {
                                                TypedArray typedArrayOooO0oo3 = oo000o.OooO0oo(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                TypedValue typedValuePeekValue = !oo000o.OooO0oO(xmlResourceParser, AppMeasurementSdk.ConditionalUserProperty.VALUE) ? null : typedArrayOooO0oo3.peekValue(0);
                                                i10 = ((typedValuePeekValue != null) && OooO0Oo(typedValuePeekValue.type)) ? 3 : 0;
                                                typedArrayOooO0oo3.recycle();
                                            }
                                            TypedArray typedArrayOooO0oo4 = oo000o.OooO0oo(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float fOooO0Oo = oo000o.OooO0Oo(typedArrayOooO0oo4, xmlResourceParser, "fraction", 3, -1.0f);
                                            TypedValue typedValuePeekValue2 = !oo000o.OooO0oO(xmlResourceParser, AppMeasurementSdk.ConditionalUserProperty.VALUE) ? null : typedArrayOooO0oo4.peekValue(0);
                                            boolean z = typedValuePeekValue2 != null;
                                            int i11 = i10 == 4 ? (z && OooO0Oo(typedValuePeekValue2.type)) ? 3 : 0 : i10;
                                            if (!z) {
                                                keyframeOfFloat = i11 == 0 ? Keyframe.ofFloat(fOooO0Oo) : Keyframe.ofInt(fOooO0Oo);
                                            } else if (i11 != 0) {
                                                keyframeOfFloat = (i11 == 1 || i11 == 3) ? Keyframe.ofInt(fOooO0Oo, oo000o.OooO0o0(typedArrayOooO0oo4, xmlResourceParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0)) : null;
                                            } else {
                                                keyframeOfFloat = Keyframe.ofFloat(fOooO0Oo, oo000o.OooO0Oo(typedArrayOooO0oo4, xmlResourceParser, AppMeasurementSdk.ConditionalUserProperty.VALUE, 0, 0.0f));
                                            }
                                            int resourceId = !oo000o.OooO0oO(xmlResourceParser, "interpolator") ? 0 : typedArrayOooO0oo4.getResourceId(1, 0);
                                            if (resourceId > 0) {
                                                keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            typedArrayOooO0oo4.recycle();
                                            ArrayList arrayList4 = arrayList3;
                                            if (keyframeOfFloat != null) {
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(keyframeOfFloat);
                                                arrayList3 = arrayList4;
                                            }
                                            xmlResourceParser.next();
                                        }
                                        resources2 = resources;
                                        theme2 = theme;
                                        attributeSetAsAttributeSet = attributeSet2;
                                        str2 = str2;
                                        i6 = 3;
                                    }
                                    str = str2;
                                    ArrayList arrayList5 = arrayList3;
                                    if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                                        i6 = 3;
                                        i2 = 2;
                                        propertyValuesHolderOooO0OO = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList5.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList5.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList5.add(arrayList5.size(), OooO0O0(keyframe2, 1.0f));
                                                size++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList5.add(0, OooO0O0(keyframe, 0.0f));
                                                size++;
                                            }
                                        }
                                        Keyframe[] keyframeArr = new Keyframe[size];
                                        arrayList5.toArray(keyframeArr);
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Keyframe keyframe3 = keyframeArr[i12];
                                            if (keyframe3.getFraction() >= 0.0f) {
                                                i5 = size;
                                            } else if (i12 == 0) {
                                                keyframe3.setFraction(0.0f);
                                                i5 = size;
                                            } else {
                                                int i13 = size - 1;
                                                if (i12 == i13) {
                                                    keyframe3.setFraction(1.0f);
                                                    i5 = size;
                                                } else {
                                                    int i14 = i12;
                                                    for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                                                        i14 = i15;
                                                    }
                                                    float fraction3 = (keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction()) / ((i14 - i12) + 2);
                                                    int i16 = i12;
                                                    while (true) {
                                                        i5 = size;
                                                        if (i16 <= i14) {
                                                            keyframeArr[i16].setFraction(keyframeArr[i16 - 1].getFraction() + fraction3);
                                                            i16++;
                                                            size = i5;
                                                            i14 = i14;
                                                        }
                                                    }
                                                }
                                            }
                                            i12++;
                                            size = i5;
                                        }
                                        i2 = 2;
                                        propertyValuesHolderOooO0OO = PropertyValuesHolder.ofKeyframe(strOooO0o, keyframeArr);
                                        i6 = 3;
                                        if (i10 == 3) {
                                            propertyValuesHolderOooO0OO.setEvaluator(OooOO0O.f36053OooO00o);
                                        }
                                    }
                                    i4 = 0;
                                    i3 = 1;
                                    if (propertyValuesHolderOooO0OO == null) {
                                        propertyValuesHolderOooO0OO = OooO0OO(typedArrayOooO0oo2, iOooO0o0, 0, 1, strOooO0o);
                                    }
                                    if (propertyValuesHolderOooO0OO != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolderOooO0OO);
                                    }
                                    typedArrayOooO0oo2.recycle();
                                } else {
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    i2 = i9;
                                    str = str2;
                                    i3 = i8;
                                    i4 = i7;
                                }
                                xmlResourceParser.next();
                                resources2 = resources;
                                theme2 = theme;
                                i7 = i4;
                                i8 = i3;
                                i9 = i2;
                                attributeSetAsAttributeSet = attributeSet2;
                                str2 = str;
                            }
                        }
                        int i17 = i8;
                        int i18 = i7;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i19 = i18; i19 < size2; i19++) {
                                propertyValuesHolderArr[i19] = (PropertyValuesHolder) arrayList2.get(i19);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (animator instanceof ValueAnimator)) {
                            ((ValueAnimator) animator).setValues(propertyValuesHolderArr);
                        }
                        i7 = i17;
                        animator = animator;
                    }
                    if (animatorSet != null && i7 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(animator);
                    }
                    resources2 = resources;
                    theme2 = theme;
                }
                animator = animatorOooO0o0;
                if (animatorSet != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animator);
                }
                resources2 = resources;
                theme2 = theme;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i20 = 0;
            while (it.hasNext()) {
                animatorArr[i20] = (Animator) it.next();
                i20++;
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
        PropertyValuesHolder propertyValuesHolderOfInt;
        int color2;
        int color3;
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
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            o00000oO.OooOOO.OooO00o[] oooO00oArrOooO0OO = p052o00000oO.OooOOO.OooO0OO(string);
            o00000oO.OooOOO.OooO00o[] oooO00oArrOooO0OO2 = p052o00000oO.OooOOO.OooO0OO(string2);
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
                if (!p052o00000oO.OooOOO.OooO00o(oooO00oArrOooO0OO, oooO00oArrOooO0OO2)) {
                    throw new InflateException(o00Ooo.OooO00o(" Can't morph from ", string, " to ", string2));
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, oooO00o, oooO00oArrOooO0OO, oooO00oArrOooO0OO2);
            }
            return propertyValuesHolderOfObject;
        }
        OooOO0O oooOO0O = i == 3 ? OooOO0O.f36053OooO00o : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
        } else {
            if (!z) {
                if (z2) {
                    if (i5 == 5) {
                        color = (int) typedArray.getDimension(i3, 0.0f);
                    } else {
                        color = OooO0Oo(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
                }
                if (propertyValuesHolder == null && oooOO0O != null) {
                    propertyValuesHolder.setEvaluator(oooOO0O);
                    return propertyValuesHolder;
                }
            }
            if (i4 == 5) {
                color2 = (int) typedArray.getDimension(i2, 0.0f);
            } else {
                color2 = OooO0Oo(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i5 == 5) {
                    color3 = (int) typedArray.getDimension(i3, 0.0f);
                } else {
                    color3 = OooO0Oo(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        }
        propertyValuesHolder = propertyValuesHolderOfInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static boolean OooO0Oo(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator OooO0o0(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray typedArrayOooO0oo = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36034OooO0oO);
        TypedArray typedArrayOooO0oo2 = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36037OooOO0O);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long jOooO0o0 = oo000o.OooO0o0(typedArrayOooO0oo, xmlResourceParser, "duration", 1, 300);
        int resourceId = 0;
        long jOooO0o1 = oo000o.OooO0o0(typedArrayOooO0oo, xmlResourceParser, "startOffset", 2, 0);
        int iOooO0o0 = oo000o.OooO0o0(typedArrayOooO0oo, xmlResourceParser, "valueType", 7, 4);
        if (oo000o.OooO0oO(xmlResourceParser, "valueFrom") && oo000o.OooO0oO(xmlResourceParser, "valueTo")) {
            if (iOooO0o0 == 4) {
                TypedValue typedValuePeekValue = typedArrayOooO0oo.peekValue(5);
                boolean z = typedValuePeekValue != null;
                int i = z ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayOooO0oo.peekValue(6);
                boolean z2 = typedValuePeekValue2 != null;
                iOooO0o0 = ((z && OooO0Oo(i)) || (z2 && OooO0Oo(z2 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderOooO0OO = OooO0OO(typedArrayOooO0oo, iOooO0o0, 5, 6, "");
            if (propertyValuesHolderOooO0OO != null) {
                valueAnimator3.setValues(propertyValuesHolderOooO0OO);
            }
        }
        valueAnimator3.setDuration(jOooO0o0);
        valueAnimator3.setStartDelay(jOooO0o1);
        valueAnimator3.setRepeatCount(oo000o.OooO0o0(typedArrayOooO0oo, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(oo000o.OooO0o0(typedArrayOooO0oo, xmlResourceParser, "repeatMode", 4, 1));
        if (typedArrayOooO0oo2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strOooO0o = oo000o.OooO0o(typedArrayOooO0oo2, xmlResourceParser, "pathData", 1);
            if (strOooO0o != null) {
                String strOooO0o2 = oo000o.OooO0o(typedArrayOooO0oo2, xmlResourceParser, "propertyXName", 2);
                String strOooO0o3 = oo000o.OooO0o(typedArrayOooO0oo2, xmlResourceParser, "propertyYName", 3);
                if (strOooO0o2 == null && strOooO0o3 == null) {
                    throw new InflateException(typedArrayOooO0oo2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathOooO0Oo = p052o00000oO.OooOOO.OooO0Oo(strOooO0o);
                PathMeasure pathMeasure = new PathMeasure(pathOooO0Oo, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
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
                valueAnimator = valueAnimator3;
                typedArray = typedArrayOooO0oo;
                int i2 = 0;
                float f2 = 0.0f;
                while (true) {
                    if (resourceId >= iMin) {
                        break;
                    }
                    int i3 = iMin;
                    pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
                    fArr[resourceId] = fArr3[0];
                    fArr2[resourceId] = fArr3[1];
                    f2 += f;
                    int i4 = i2 + 1;
                    if (i4 < arrayList.size() && f2 > ((Float) arrayList.get(i4)).floatValue()) {
                        pathMeasure2.nextContour();
                        i2 = i4;
                    }
                    resourceId++;
                    iMin = i3;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strOooO0o2 != null ? PropertyValuesHolder.ofFloat(strOooO0o2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strOooO0o3 != null ? PropertyValuesHolder.ofFloat(strOooO0o3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayOooO0oo;
                objectAnimator2.setPropertyName(oo000o.OooO0o(typedArrayOooO0oo2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayOooO0oo;
        }
        if (oo000o.OooO0oO(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayOooO0oo2 != null) {
            typedArrayOooO0oo2.recycle();
        }
        return valueAnimator2;
    }
}
