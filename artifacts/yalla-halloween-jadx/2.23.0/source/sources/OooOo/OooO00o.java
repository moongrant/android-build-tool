package OooOo;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000Ooo;
import io.agora.rtc.Constants;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p058o0000Ooo.oo000o;
import p079o000Oo0o.o000OOo0;
import p079o000Oo0o.o00O000;
import p188o00o0O.OooOo00;
import p188o00o0O.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends OooOo.OooO {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0O0 f221OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f222OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooOO0 f223OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f224OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f225OooOo0o;

    public static class OooO implements TimeInterpolator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f226OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f227OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f228OooO0OO;

        public OooO(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f227OooO0O0 = numberOfFrames;
            int[] iArr = this.f226OooO00o;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f226OooO00o = new int[numberOfFrames];
            }
            int[] iArr2 = this.f226OooO00o;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f228OooO0OO = i;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.f228OooO0OO) + 0.5f);
            int i2 = this.f227OooO0O0;
            int[] iArr = this.f226OooO00o;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f228OooO0OO : 0.0f);
        }
    }

    /* JADX INFO: renamed from: OooOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0002OooO00o extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Animatable f229OooO00o;

        public C0002OooO00o(Animatable animatable) {
            this.f229OooO00o = animatable;
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0OO() {
            this.f229OooO00o.start();
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0Oo() {
            this.f229OooO00o.stop();
        }
    }

    public static class OooO0O0 extends OooOo.OooO.OooO00o {

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public OooOo00<Long> f230Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public Oooo0<Integer> f231Oooo0O0;

        public OooO0O0(@Nullable OooO0O0 oooO0O0, @NonNull OooO00o oooO00o, @Nullable Resources resources) {
            super(oooO0O0, oooO00o, resources);
            if (oooO0O0 != null) {
                this.f230Oooo0 = oooO0O0.f230Oooo0;
                this.f231Oooo0O0 = oooO0O0.f231Oooo0O0;
            } else {
                this.f230Oooo0 = new OooOo00<>();
                this.f231Oooo0O0 = new Oooo0<>();
            }
        }

        @Override // OooOo.OooO.OooO00o, OooOo.OooO0O0.OooO0OO
        public final void OooO0o0() {
            this.f230Oooo0 = this.f230Oooo0.clone();
            this.f231Oooo0O0 = this.f231Oooo0O0.clone();
        }

        @Override // OooOo.OooO.OooO00o, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new OooO00o(this, null);
        }

        @Override // OooOo.OooO.OooO00o, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new OooO00o(this, resources);
        }
    }

    public static class OooO0OO extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OOo0 f232OooO00o;

        public OooO0OO(o000OOo0 o000ooo1) {
            this.f232OooO00o = o000ooo1;
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0OO() {
            this.f232OooO00o.start();
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0Oo() {
            this.f232OooO00o.stop();
        }
    }

    public static class OooO0o extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ObjectAnimator f233OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f234OooO0O0;

        public OooO0o(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            OooO oooO = new OooO(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            p015OooOoO0.OooO0OO.OooO00o(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(oooO.f228OooO0OO);
            objectAnimatorOfInt.setInterpolator(oooO);
            this.f234OooO0O0 = z2;
            this.f233OooO00o = objectAnimatorOfInt;
        }

        @Override // OooOo.OooO00o.OooOO0
        public final boolean OooO00o() {
            return this.f234OooO0O0;
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0O0() {
            this.f233OooO00o.reverse();
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0OO() {
            this.f233OooO00o.start();
        }

        @Override // OooOo.OooO00o.OooOO0
        public final void OooO0Oo() {
            this.f233OooO00o.cancel();
        }
    }

    public static abstract class OooOO0 {
        public boolean OooO00o() {
            return false;
        }

        public void OooO0O0() {
        }

        public abstract void OooO0OO();

        public abstract void OooO0Oo();
    }

    public OooO00o() {
        this(null, null);
    }

    @NonNull
    public static OooO00o OooO0oO(@NonNull Context context, @Nullable Resources.Theme theme, @NonNull Resources resources, @NonNull AttributeSet attributeSet, @NonNull XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int depth;
        int i;
        int next;
        int next2;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        OooO00o oooO00o = new OooO00o();
        TypedArray typedArrayOooO0oo = oo000o.OooO0oo(resources, theme, attributeSet, p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat);
        int i2 = 1;
        oooO00o.setVisible(typedArrayOooO0oo.getBoolean(p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat_android_visible, true), true);
        OooO0O0 oooO0O0 = oooO00o.f221OooOOoo;
        oooO0O0.f254OooO0Oo |= p015OooOoO0.OooO0o.OooO0O0(typedArrayOooO0oo);
        oooO0O0.f250OooO = typedArrayOooO0oo.getBoolean(p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat_android_variablePadding, oooO0O0.f250OooO);
        oooO0O0.f261OooOO0o = typedArrayOooO0oo.getBoolean(p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat_android_constantSize, oooO0O0.f261OooOO0o);
        oooO0O0.f275OooOoO0 = typedArrayOooO0oo.getInt(p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat_android_enterFadeDuration, oooO0O0.f275OooOoO0);
        oooO0O0.f274OooOoO = typedArrayOooO0oo.getInt(p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat_android_exitFadeDuration, oooO0O0.f274OooOoO);
        oooO00o.setDither(typedArrayOooO0oo.getBoolean(p015OooOoO0.OooOO0.AnimatedStateListDrawableCompat_android_dither, oooO0O0.f273OooOo0o));
        OooOo.OooO0O0.OooO0OO oooO0OO = oooO00o.f237OooO0Oo;
        int i3 = 0;
        if (resources != null) {
            oooO0OO.f252OooO0O0 = resources;
            int i4 = resources.getDisplayMetrics().densityDpi;
            if (i4 == 0) {
                i4 = Constants.ERR_ALREADY_IN_RECORDING;
            }
            int i5 = oooO0OO.f253OooO0OO;
            oooO0OO.f253OooO0OO = i4;
            if (i5 != i4) {
                oooO0OO.f263OooOOO0 = false;
                oooO0OO.f259OooOO0 = false;
            }
        } else {
            oooO0OO.getClass();
        }
        typedArrayOooO0oo.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        Context context2 = context;
        Resources.Theme theme2 = theme;
        OooO00o oooO00o2 = oooO00o;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i2 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == 3)) {
                break;
            }
            if (next3 == 2 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayOooO0oo2 = oo000o.OooO0oo(resources, theme2, attributeSet, p015OooOoO0.OooOO0.AnimatedStateListDrawableItem);
                    int resourceId = typedArrayOooO0oo2.getResourceId(p015OooOoO0.OooOO0.AnimatedStateListDrawableItem_android_id, i3);
                    int resourceId2 = typedArrayOooO0oo2.getResourceId(p015OooOoO0.OooOO0.AnimatedStateListDrawableItem_android_drawable, -1);
                    Drawable drawableOooO0o = resourceId2 > 0 ? o0000Ooo.OooO0Oo().OooO0o(context2, resourceId2) : null;
                    typedArrayOooO0oo2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i6 = i3;
                    int i7 = i6;
                    while (i7 < attributeCount) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                        int i8 = depth2;
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i9 = i6 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i6] = attributeNameResource;
                            i6 = i9;
                        }
                        i7++;
                        depth2 = i8;
                    }
                    i = depth2;
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i6);
                    if (drawableOooO0o == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableOooO0o = new o00O000();
                            drawableOooO0o.inflate(resources, xmlResourceParser, attributeSet, theme2);
                        } else {
                            drawableOooO0o = p015OooOoO0.OooO0o.OooO00o(resources, xmlResourceParser, attributeSet, theme2);
                        }
                    }
                    if (drawableOooO0o == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    OooO0O0 oooO0O1 = oooO00o2.f221OooOOoo;
                    int iOooO00o = oooO0O1.OooO00o(drawableOooO0o);
                    oooO0O1.f220Oooo00o[iOooO00o] = iArrTrimStateSet;
                    oooO0O1.f231Oooo0O0.OooO0oo(iOooO00o, Integer.valueOf(resourceId));
                } else {
                    i = depth2;
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayOooO0oo3 = oo000o.OooO0oo(resources, theme2, attributeSet, p015OooOoO0.OooOO0.AnimatedStateListDrawableTransition);
                        int resourceId3 = typedArrayOooO0oo3.getResourceId(p015OooOoO0.OooOO0.AnimatedStateListDrawableTransition_android_fromId, -1);
                        int resourceId4 = typedArrayOooO0oo3.getResourceId(p015OooOoO0.OooOO0.AnimatedStateListDrawableTransition_android_toId, -1);
                        int resourceId5 = typedArrayOooO0oo3.getResourceId(p015OooOoO0.OooOO0.AnimatedStateListDrawableTransition_android_drawable, -1);
                        Drawable drawableOooO0o2 = resourceId5 > 0 ? o0000Ooo.OooO0Oo().OooO0o(context2, resourceId5) : null;
                        boolean z = typedArrayOooO0oo3.getBoolean(p015OooOoO0.OooOO0.AnimatedStateListDrawableTransition_android_reversible, false);
                        typedArrayOooO0oo3.recycle();
                        if (drawableOooO0o2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableOooO0o2 = new o000OOo0(context);
                                drawableOooO0o2.inflate(resources, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableOooO0o2 = p015OooOoO0.OooO0o.OooO00o(resources, xmlResourceParser, attributeSet, theme2);
                            }
                        }
                        if (drawableOooO0o2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        OooO0O0 oooO0O2 = oooO00o2.f221OooOOoo;
                        int iOooO00o2 = oooO0O2.OooO00o(drawableOooO0o2);
                        long j = resourceId3;
                        long j2 = resourceId4;
                        long j3 = j2 | (j << 32);
                        long j4 = z ? 8589934592L : 0L;
                        long j5 = iOooO00o2;
                        oooO0O2.f230Oooo0.OooO0O0(j3, Long.valueOf(j5 | j4));
                        if (z) {
                            oooO0O2.f230Oooo0.OooO0O0((j2 << 32) | j, Long.valueOf(4294967296L | j5 | j4));
                        }
                    }
                    context2 = context;
                    theme2 = theme;
                    oooO00o2 = oooO00o;
                }
                depth2 = i;
                i2 = 1;
                i3 = 0;
            }
        }
        oooO00o.onStateChange(oooO00o.getState());
        return oooO00o;
    }

    @Override // OooOo.OooO, OooOo.OooO0O0
    public final OooOo.OooO0O0.OooO0OO OooO0O0() {
        return new OooO0O0(this.f221OooOOoo, this, null);
    }

    @Override // OooOo.OooO
    /* JADX INFO: renamed from: OooO0o */
    public final OooOo.OooO.OooO00o OooO0O0() {
        return new OooO0O0(this.f221OooOOoo, this, null);
    }

    @Override // OooOo.OooO, OooOo.OooO0O0
    public final void OooO0o0(@NonNull OooOo.OooO0O0.OooO0OO oooO0OO) {
        super.OooO0o0(oooO0OO);
        if (oooO0OO instanceof OooO0O0) {
            this.f221OooOOoo = (OooO0O0) oooO0OO;
        }
    }

    @Override // OooOo.OooO0O0, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        OooOO0 oooOO1 = this.f223OooOo00;
        if (oooOO1 != null) {
            oooOO1.OooO0Oo();
            this.f223OooOo00 = null;
            OooO0Oo(this.f222OooOo0);
            this.f222OooOo0 = -1;
            this.f224OooOo0O = -1;
        }
    }

    @Override // OooOo.OooO, OooOo.OooO0O0, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        if (!this.f225OooOo0o) {
            super.mutate();
            this.f221OooOOoo.OooO0o0();
            this.f225OooOo0o = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    @Override // OooOo.OooO, OooOo.OooO0O0, android.graphics.drawable.Drawable
    public final boolean onStateChange(@NonNull int[] iArr) {
        OooO0O0 oooO0O0;
        int iIntValue;
        int iIntValue2;
        boolean z;
        long j;
        int iLongValue;
        boolean z2;
        Object obj;
        OooOO0 c0002OooO00o;
        boolean z3;
        OooO0O0 oooO0O1 = this.f221OooOOoo;
        int iOooO0o = oooO0O1.OooO0o(iArr);
        if (iOooO0o < 0) {
            iOooO0o = oooO0O1.OooO0o(StateSet.WILD_CARD);
        }
        int i = this.f242OooOO0;
        boolean z4 = false;
        if (iOooO0o != i) {
            OooOO0 oooOO1 = this.f223OooOo00;
            if (oooOO1 == null) {
                this.f223OooOo00 = null;
                this.f224OooOo0O = -1;
                this.f222OooOo0 = -1;
                oooO0O0 = this.f221OooOOoo;
                if (i < 0) {
                    oooO0O0.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = ((Integer) oooO0O0.f231Oooo0O0.OooO0o(i, 0)).intValue();
                }
                if (iOooO0o < 0) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = ((Integer) oooO0O0.f231Oooo0O0.OooO0o(iOooO0o, 0)).intValue();
                }
                if (iIntValue2 != 0 && iIntValue != 0) {
                    j = ((long) iIntValue2) | (((long) iIntValue) << 32);
                    iLongValue = (int) ((Long) oooO0O0.f230Oooo0.OooO0oO(j, -1L)).longValue();
                    if (iLongValue >= 0) {
                        if ((((Long) oooO0O0.f230Oooo0.OooO0oO(j, -1L)).longValue() & 8589934592L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        OooO0Oo(iLongValue);
                        obj = this.f238OooO0o;
                        if (obj instanceof AnimationDrawable) {
                            if ((((Long) oooO0O0.f230Oooo0.OooO0oO(j, -1L)).longValue() & 4294967296L) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c0002OooO00o = new OooO0o((AnimationDrawable) obj, z3, z2);
                        } else if (obj instanceof o000OOo0) {
                            c0002OooO00o = new OooO0OO((o000OOo0) obj);
                        } else if (obj instanceof Animatable) {
                            c0002OooO00o = new C0002OooO00o((Animatable) obj);
                        }
                        c0002OooO00o.OooO0OO();
                        this.f223OooOo00 = c0002OooO00o;
                        this.f224OooOo0O = i;
                        this.f222OooOo0 = iOooO0o;
                        z = true;
                    }
                }
                z = false;
            } else {
                if (iOooO0o != this.f222OooOo0) {
                    if (iOooO0o == this.f224OooOo0O && oooOO1.OooO00o()) {
                        oooOO1.OooO0O0();
                        this.f222OooOo0 = this.f224OooOo0O;
                        this.f224OooOo0O = iOooO0o;
                    } else {
                        i = this.f222OooOo0;
                        oooOO1.OooO0Oo();
                        this.f223OooOo00 = null;
                        this.f224OooOo0O = -1;
                        this.f222OooOo0 = -1;
                        oooO0O0 = this.f221OooOOoo;
                        if (i < 0) {
                            oooO0O0.getClass();
                            iIntValue = 0;
                        } else {
                            iIntValue = ((Integer) oooO0O0.f231Oooo0O0.OooO0o(i, 0)).intValue();
                        }
                        if (iOooO0o < 0) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = ((Integer) oooO0O0.f231Oooo0O0.OooO0o(iOooO0o, 0)).intValue();
                        }
                        if (iIntValue2 != 0) {
                            j = ((long) iIntValue2) | (((long) iIntValue) << 32);
                            iLongValue = (int) ((Long) oooO0O0.f230Oooo0.OooO0oO(j, -1L)).longValue();
                            if (iLongValue >= 0) {
                                if ((((Long) oooO0O0.f230Oooo0.OooO0oO(j, -1L)).longValue() & 8589934592L) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                OooO0Oo(iLongValue);
                                obj = this.f238OooO0o;
                                if (obj instanceof AnimationDrawable) {
                                    if ((((Long) oooO0O0.f230Oooo0.OooO0oO(j, -1L)).longValue() & 4294967296L) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    c0002OooO00o = new OooO0o((AnimationDrawable) obj, z3, z2);
                                } else if (obj instanceof o000OOo0) {
                                    c0002OooO00o = new OooO0OO((o000OOo0) obj);
                                } else if (obj instanceof Animatable) {
                                    c0002OooO00o = new C0002OooO00o((Animatable) obj);
                                }
                                c0002OooO00o.OooO0OO();
                                this.f223OooOo00 = c0002OooO00o;
                                this.f224OooOo0O = i;
                                this.f222OooOo0 = iOooO0o;
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            }
            if (z || OooO0Oo(iOooO0o)) {
                z4 = true;
            }
        }
        Drawable drawable = this.f238OooO0o;
        return drawable != null ? z4 | drawable.setState(iArr) : z4;
    }

    @Override // OooOo.OooO0O0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        OooOO0 oooOO1 = this.f223OooOo00;
        if (oooOO1 != null && (visible || z2)) {
            if (z) {
                oooOO1.OooO0OO();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public OooO00o(@Nullable OooO0O0 oooO0O0, @Nullable Resources resources) {
        this.f222OooOo0 = -1;
        this.f224OooOo0O = -1;
        OooO0o0(new OooO0O0(oooO0O0, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
