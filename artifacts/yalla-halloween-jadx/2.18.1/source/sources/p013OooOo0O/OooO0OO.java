package p013OooOo0O;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o000OOo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p014OooOo0o.OooOO0O;
import p014OooOo0o.OooOOOO;
import p021OooOooo.o00Ooo;
import p021OooOooo.o0ooOOo;
import p081o000OoO.o00oO0o;
import p084o000Ooo.o0Oo0oo;
import p103o000oo00.OooOOO0;
import p103o000oo00.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends p013OooOo0O.OooOO0 implements o0Oo0oo {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooO0O0 f201Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooOO0 f202Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f203OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f204OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f205OooooOo;

    public static class OooO implements TimeInterpolator {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int[] f206OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f207OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f208OooO0OO;

        public OooO(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f207OooO0O0 = numberOfFrames;
            int[] iArr = this.f206OooO00o;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f206OooO00o = new int[numberOfFrames];
            }
            int[] iArr2 = this.f206OooO00o;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f208OooO0OO = i;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            int i = (int) ((f * this.f208OooO0OO) + 0.5f);
            int i2 = this.f207OooO0O0;
            int[] iArr = this.f206OooO00o;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f208OooO0OO : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    public static class OooO00o extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Animatable f209OooO00o;

        public OooO00o(Animatable animatable) {
            this.f209OooO00o = animatable;
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0OO() {
            this.f209OooO00o.start();
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0Oo() {
            this.f209OooO00o.stop();
        }
    }

    public static class OooO0O0 extends OooOo0O.OooOO0.OooO00o {

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public o00Ooo<Long> f210Oooo0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public o0ooOOo<Integer> f211Oooo0O0;

        public OooO0O0(@Nullable OooO0O0 oooO0O0, @NonNull OooO0OO oooO0OO, @Nullable Resources resources) {
            super(oooO0O0, oooO0OO, resources);
            if (oooO0O0 != null) {
                this.f210Oooo0 = oooO0O0.f210Oooo0;
                this.f211Oooo0O0 = oooO0O0.f211Oooo0O0;
            } else {
                this.f210Oooo0 = new o00Ooo<>();
                this.f211Oooo0O0 = new o0ooOOo<>();
            }
        }

        public static long OooO(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        @Override // OooOo0O.OooOO0.OooO00o, OooOo0O.OooO0o.OooO0OO
        public final void OooO0o0() {
            this.f210Oooo0 = this.f210Oooo0.clone();
            this.f211Oooo0O0 = this.f211Oooo0O0.clone();
        }

        public final int OooOO0(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f211Oooo0O0.OooO0oO(i, 0).intValue();
        }

        @Override // OooOo0O.OooOO0.OooO00o, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new OooO0OO(this, null);
        }

        @Override // OooOo0O.OooOO0.OooO00o, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new OooO0OO(this, resources);
        }
    }

    /* JADX INFO: renamed from: OooOo0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C0004OooO0OO extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOOO0 f212OooO00o;

        public C0004OooO0OO(OooOOO0 oooOOO0) {
            this.f212OooO00o = oooOOO0;
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0OO() {
            this.f212OooO00o.start();
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0Oo() {
            this.f212OooO00o.stop();
        }
    }

    public static class OooO0o extends OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ObjectAnimator f213OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f214OooO0O0;

        public OooO0o(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            OooO oooO = new OooO(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            OooOO0O.OooO00o(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(oooO.f208OooO0OO);
            objectAnimatorOfInt.setInterpolator(oooO);
            this.f214OooO0O0 = z2;
            this.f213OooO00o = objectAnimatorOfInt;
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final boolean OooO00o() {
            return this.f214OooO0O0;
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0O0() {
            this.f213OooO00o.reverse();
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0OO() {
            this.f213OooO00o.start();
        }

        @Override // OooOo0O.OooO0OO.OooOO0
        public final void OooO0Oo() {
            this.f213OooO00o.cancel();
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

    public OooO0OO() {
        this(null, null);
    }

    @NonNull
    public static OooO0OO OooO0oO(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int next;
        int next2;
        AttributeSet attributeSet2 = attributeSet;
        String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        Drawable drawable = null;
        OooO0OO oooO0OO = new OooO0OO(null, null);
        TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources, theme, attributeSet2, OooOOOO.AnimatedStateListDrawableCompat);
        int i = 1;
        oooO0OO.setVisible(typedArrayOooOO0.getBoolean(OooOOOO.AnimatedStateListDrawableCompat_android_visible, true), true);
        OooO0O0 oooO0O0 = oooO0OO.f201Ooooo00;
        oooO0O0.f234OooO0Oo |= p014OooOo0o.OooOOO0.OooO0O0(typedArrayOooOO0);
        oooO0O0.f230OooO = typedArrayOooOO0.getBoolean(OooOOOO.AnimatedStateListDrawableCompat_android_variablePadding, oooO0O0.f230OooO);
        oooO0O0.f241OooOO0o = typedArrayOooOO0.getBoolean(OooOOOO.AnimatedStateListDrawableCompat_android_constantSize, oooO0O0.f241OooOO0o);
        oooO0O0.f255OooOoO0 = typedArrayOooOO0.getInt(OooOOOO.AnimatedStateListDrawableCompat_android_enterFadeDuration, oooO0O0.f255OooOoO0);
        oooO0O0.f254OooOoO = typedArrayOooOO0.getInt(OooOOOO.AnimatedStateListDrawableCompat_android_exitFadeDuration, oooO0O0.f254OooOoO);
        oooO0OO.setDither(typedArrayOooOO0.getBoolean(OooOOOO.AnimatedStateListDrawableCompat_android_dither, oooO0O0.f253OooOo0o));
        oooO0OO.f217Oooo0o.OooO0oO(resources);
        typedArrayOooOO0.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        Context context2 = context;
        Resources resources2 = resources;
        while (true) {
            int next3 = xmlPullParser.next();
            if (next3 == i || ((depth = xmlPullParser.getDepth()) < depth2 && next3 == 3)) {
                break;
            }
            if (next3 == 2 && depth <= depth2) {
                if (xmlPullParser.getName().equals("item")) {
                    TypedArray typedArrayOooOO1 = o00oO0o.OooOO0(resources2, theme, attributeSet2, OooOOOO.AnimatedStateListDrawableItem);
                    int resourceId = typedArrayOooOO1.getResourceId(OooOOOO.AnimatedStateListDrawableItem_android_id, 0);
                    int resourceId2 = typedArrayOooOO1.getResourceId(OooOOOO.AnimatedStateListDrawableItem_android_drawable, -1);
                    Drawable drawableOooO0o = resourceId2 > 0 ? o000OOo.OooO0Oo().OooO0o(context2, resourceId2) : drawable;
                    typedArrayOooOO1.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i2 = 0;
                    for (int i3 = 0; i3 < attributeCount; i3++) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i4 = i2 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i2] = attributeNameResource;
                            i2 = i4;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                    if (drawableOooO0o == null) {
                        do {
                            next2 = xmlPullParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        drawableOooO0o = xmlPullParser.getName().equals("vector") ? OooOo.OooO00o(resources, xmlPullParser, attributeSet, theme) : p014OooOo0o.OooOOO0.OooO00o(resources, xmlPullParser, attributeSet, theme);
                    }
                    if (drawableOooO0o == null) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    OooO0O0 oooO0O1 = oooO0OO.f201Ooooo00;
                    int iOooO00o = oooO0O1.OooO00o(drawableOooO0o);
                    oooO0O1.f265Oooo00o[iOooO00o] = iArrTrimStateSet;
                    oooO0O1.f211Oooo0O0.OooOO0O(iOooO00o, Integer.valueOf(resourceId));
                } else {
                    if (xmlPullParser.getName().equals("transition")) {
                        TypedArray typedArrayOooOO2 = o00oO0o.OooOO0(resources2, theme, attributeSet2, OooOOOO.AnimatedStateListDrawableTransition);
                        int resourceId3 = typedArrayOooOO2.getResourceId(OooOOOO.AnimatedStateListDrawableTransition_android_fromId, -1);
                        int resourceId4 = typedArrayOooOO2.getResourceId(OooOOOO.AnimatedStateListDrawableTransition_android_toId, -1);
                        int resourceId5 = typedArrayOooOO2.getResourceId(OooOOOO.AnimatedStateListDrawableTransition_android_drawable, -1);
                        Drawable drawableOooO0o2 = resourceId5 > 0 ? o000OOo.OooO0Oo().OooO0o(context2, resourceId5) : null;
                        boolean z = typedArrayOooOO2.getBoolean(OooOOOO.AnimatedStateListDrawableTransition_android_reversible, false);
                        typedArrayOooOO2.recycle();
                        if (drawableOooO0o2 == null) {
                            do {
                                next = xmlPullParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            drawableOooO0o2 = xmlPullParser.getName().equals("animated-vector") ? OooOOO0.OooO00o(context, resources, xmlPullParser, attributeSet, theme) : p014OooOo0o.OooOOO0.OooO00o(resources, xmlPullParser, attributeSet, theme);
                        }
                        if (drawableOooO0o2 == null) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        OooO0O0 oooO0O2 = oooO0OO.f201Ooooo00;
                        int iOooO00o2 = oooO0O2.OooO00o(drawableOooO0o2);
                        long jOooO = OooO0O0.OooO(resourceId3, resourceId4);
                        long j = z ? 8589934592L : 0L;
                        long j2 = iOooO00o2;
                        oooO0O2.f210Oooo0.OooO0OO(jOooO, Long.valueOf(j2 | j));
                        if (z) {
                            oooO0O2.f210Oooo0.OooO0OO(OooO0O0.OooO(resourceId4, resourceId3), Long.valueOf(j2 | 4294967296L | j));
                        }
                    }
                    context2 = context;
                    resources2 = resources;
                }
                attributeSet2 = attributeSet;
                drawable = null;
                i = 1;
            }
        }
        oooO0OO.onStateChange(oooO0OO.getState());
        return oooO0OO;
    }

    @Override // p013OooOo0O.OooOO0, p013OooOo0O.OooO0o
    public final OooOo0O.OooO0o.OooO0OO OooO0O0() {
        return new OooO0O0(this.f201Ooooo00, this, null);
    }

    @Override // p013OooOo0O.OooOO0
    /* JADX INFO: renamed from: OooO0o */
    public final OooOo0O.OooOO0.OooO00o OooO0O0() {
        return new OooO0O0(this.f201Ooooo00, this, null);
    }

    @Override // p013OooOo0O.OooOO0, p013OooOo0O.OooO0o
    public final void OooO0o0(@NonNull OooOo0O.OooO0o.OooO0OO oooO0OO) {
        super.OooO0o0(oooO0OO);
        if (oooO0OO instanceof OooO0O0) {
            this.f201Ooooo00 = (OooO0O0) oooO0OO;
        }
    }

    @Override // p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        OooOO0 oooOO1 = this.f202Ooooo0o;
        if (oooOO1 != null) {
            oooOO1.OooO0Oo();
            this.f202Ooooo0o = null;
            OooO0Oo(this.f203OooooO0);
            this.f203OooooO0 = -1;
            this.f204OooooOO = -1;
        }
    }

    @Override // p013OooOo0O.OooOO0, p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        if (!this.f205OooooOo) {
            super.mutate();
            this.f201Ooooo00.OooO0o0();
            this.f205OooooOo = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    @Override // p013OooOo0O.OooOO0, p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    public final boolean onStateChange(@NonNull int[] iArr) {
        OooO0O0 oooO0O0;
        int iOooOO0;
        int iOooOO1;
        boolean z;
        int iLongValue;
        boolean z2;
        Object obj;
        OooOO0 oooO00o;
        boolean z3;
        OooO0O0 oooO0O1 = this.f201Ooooo00;
        int iOooO0oo = oooO0O1.OooO0oo(iArr);
        if (iOooO0oo < 0) {
            iOooO0oo = oooO0O1.OooO0oo(StateSet.WILD_CARD);
        }
        int i = this.f223OoooO0O;
        boolean z4 = false;
        if (iOooO0oo != i) {
            OooOO0 oooOO1 = this.f202Ooooo0o;
            if (oooOO1 == null) {
                this.f202Ooooo0o = null;
                this.f204OooooOO = -1;
                this.f203OooooO0 = -1;
                oooO0O0 = this.f201Ooooo00;
                iOooOO0 = oooO0O0.OooOO0(i);
                iOooOO1 = oooO0O0.OooOO0(iOooO0oo);
                if (iOooOO1 != 0 && iOooOO0 != 0) {
                    iLongValue = (int) oooO0O0.f210Oooo0.OooO(OooO0O0.OooO(iOooOO0, iOooOO1), -1L).longValue();
                    if (iLongValue >= 0) {
                        if ((oooO0O0.f210Oooo0.OooO(OooO0O0.OooO(iOooOO0, iOooOO1), -1L).longValue() & 8589934592L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        OooO0Oo(iLongValue);
                        obj = this.f219Oooo0oo;
                        if (obj instanceof AnimationDrawable) {
                            if ((oooO0O0.f210Oooo0.OooO(OooO0O0.OooO(iOooOO0, iOooOO1), -1L).longValue() & 4294967296L) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            oooO00o = new OooO0o((AnimationDrawable) obj, z3, z2);
                        } else if (obj instanceof OooOOO0) {
                            oooO00o = new C0004OooO0OO((OooOOO0) obj);
                        } else if (obj instanceof Animatable) {
                            oooO00o = new OooO00o((Animatable) obj);
                        }
                        oooO00o.OooO0OO();
                        this.f202Ooooo0o = oooO00o;
                        this.f204OooooOO = i;
                        this.f203OooooO0 = iOooO0oo;
                        z = true;
                    }
                }
                z = false;
            } else {
                if (iOooO0oo != this.f203OooooO0) {
                    if (iOooO0oo == this.f204OooooOO && oooOO1.OooO00o()) {
                        oooOO1.OooO0O0();
                        this.f203OooooO0 = this.f204OooooOO;
                        this.f204OooooOO = iOooO0oo;
                    } else {
                        i = this.f203OooooO0;
                        oooOO1.OooO0Oo();
                        this.f202Ooooo0o = null;
                        this.f204OooooOO = -1;
                        this.f203OooooO0 = -1;
                        oooO0O0 = this.f201Ooooo00;
                        iOooOO0 = oooO0O0.OooOO0(i);
                        iOooOO1 = oooO0O0.OooOO0(iOooO0oo);
                        if (iOooOO1 != 0) {
                            iLongValue = (int) oooO0O0.f210Oooo0.OooO(OooO0O0.OooO(iOooOO0, iOooOO1), -1L).longValue();
                            if (iLongValue >= 0) {
                                if ((oooO0O0.f210Oooo0.OooO(OooO0O0.OooO(iOooOO0, iOooOO1), -1L).longValue() & 8589934592L) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                OooO0Oo(iLongValue);
                                obj = this.f219Oooo0oo;
                                if (obj instanceof AnimationDrawable) {
                                    if ((oooO0O0.f210Oooo0.OooO(OooO0O0.OooO(iOooOO0, iOooOO1), -1L).longValue() & 4294967296L) != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    oooO00o = new OooO0o((AnimationDrawable) obj, z3, z2);
                                } else if (obj instanceof OooOOO0) {
                                    oooO00o = new C0004OooO0OO((OooOOO0) obj);
                                } else if (obj instanceof Animatable) {
                                    oooO00o = new OooO00o((Animatable) obj);
                                }
                                oooO00o.OooO0OO();
                                this.f202Ooooo0o = oooO00o;
                                this.f204OooooOO = i;
                                this.f203OooooO0 = iOooO0oo;
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            }
            if (z || OooO0Oo(iOooO0oo)) {
                z4 = true;
            }
        }
        Drawable drawable = this.f219Oooo0oo;
        return drawable != null ? z4 | drawable.setState(iArr) : z4;
    }

    @Override // p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        OooOO0 oooOO1 = this.f202Ooooo0o;
        if (oooOO1 != null && (visible || z2)) {
            if (z) {
                oooOO1.OooO0OO();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public OooO0OO(@Nullable OooO0O0 oooO0O0, @Nullable Resources resources) {
        this.f203OooooO0 = -1;
        this.f204OooooOO = -1;
        OooO0o0(new OooO0O0(oooO0O0, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
