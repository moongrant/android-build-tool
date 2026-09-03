package o00O00OO;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p053o00000oo.o00Ooo;
import p058o0000Ooo.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends OooOOO0 implements Animatable {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f36040OooOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO00o f36041OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f36042OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f36043OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooO f36044OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<o00O00OO.OooO0OO> f36045OooO0oo;

    public class OooO00o implements Drawable.Callback {
        public OooO00o() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            OooO0o.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            OooO0o.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            OooO0o.this.unscheduleSelf(runnable);
        }
    }

    public static class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOOO f36047OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public AnimatorSet f36048OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ArrayList<Animator> f36049OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public p190o00o0O.OooO<Animator, String> f36050OooO0Oo;

        public OooO0O0(OooO00o oooO00o) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public OooO0o() {
        this(null);
    }

    @Override // o00O00OO.OooOOO0, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO00o(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            return o00Ooo.OooO0O0.OooO0O0(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        OooO0O0 oooO0O0 = this.f36043OooO0o0;
        oooO0O0.f36047OooO00o.draw(canvas);
        if (oooO0O0.f36048OooO0O0.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? o00Ooo.OooO00o.OooO00o(drawable) : this.f36043OooO0o0.f36047OooO00o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f36043OooO0o0.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? o00Ooo.OooO0O0.OooO0OO(drawable) : this.f36043OooO0o0.f36047OooO00o.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f36119OooO0Oo == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new OooO0OO(this.f36119OooO0Oo.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f36043OooO0o0.f36047OooO00o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f36043OooO0o0.f36047OooO00o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? drawable.getOpacity() : this.f36043OooO0o0.f36047OooO00o.getOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        OooO0O0 oooO0O0;
        Animator animatorOooO00o;
        OooOOO oooOOO;
        int next;
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0Oo(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            oooO0O0 = this.f36043OooO0o0;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayOooO0oo = oo000o.OooO0oo(resources, theme, attributeSet, o00O00OO.OooO00o.f36033OooO0o0);
                    int resourceId = typedArrayOooO0oo.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = OooOOO.f36054OooOOO0;
                        if (Build.VERSION.SDK_INT >= 24) {
                            oooOOO = new OooOOO();
                            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5298OooO00o;
                            oooOOO.f36119OooO0Oo = androidx.core.content.res.OooO00o.C0121OooO00o.OooO00o(resources, resourceId, theme);
                            new OooOOO.OooOOO0(oooOOO.f36119OooO0Oo.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                oooOOO = new OooOOO();
                                oooOOO.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                oooOOO = null;
                            } catch (XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                oooOOO = null;
                            }
                        }
                        oooOOO.f36055OooO = false;
                        oooOOO.setCallback(this.f36041OooO);
                        OooOOO oooOOO2 = oooO0O0.f36047OooO00o;
                        if (oooOOO2 != null) {
                            oooOOO2.setCallback(null);
                        }
                        oooO0O0.f36047OooO00o = oooOOO;
                    }
                    typedArrayOooO0oo.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, o00O00OO.OooO00o.f36032OooO0o);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        XmlResourceParser xmlResourceParser = this.f36042OooO0o;
                        if (xmlResourceParser == 0) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorOooO00o = AnimatorInflater.loadAnimator(xmlResourceParser, resourceId2);
                        } else {
                            Resources resources2 = xmlResourceParser.getResources();
                            Resources.Theme theme2 = xmlResourceParser.getTheme();
                            try {
                                try {
                                    XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorOooO00o = OooOO0.OooO00o(xmlResourceParser, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                        animation.close();
                                    } catch (IOException e3) {
                                        e = e3;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e4) {
                                        e = e4;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        xmlResourceParser = animation;
                                        if (xmlResourceParser != 0) {
                                            xmlResourceParser.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = 0;
                            }
                        }
                        animatorOooO00o.setTarget(oooO0O0.f36047OooO00o.f36057OooO0o0.f36108OooO0O0.f36105OooOOOO.getOrDefault(string, null));
                        if (oooO0O0.f36049OooO0OO == null) {
                            oooO0O0.f36049OooO0OO = new ArrayList<>();
                            oooO0O0.f36050OooO0Oo = new p190o00o0O.OooO<>();
                        }
                        oooO0O0.f36049OooO0OO.add(animatorOooO00o);
                        oooO0O0.f36050OooO0Oo.put(animatorOooO00o, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (oooO0O0.f36048OooO0O0 == null) {
            oooO0O0.f36048OooO0O0 = new AnimatorSet();
        }
        oooO0O0.f36048OooO0O0.playTogether(oooO0O0.f36049OooO0OO);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? o00Ooo.OooO00o.OooO0Oo(drawable) : this.f36043OooO0o0.f36047OooO00o.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f36043OooO0o0.f36048OooO0O0.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? drawable.isStateful() : this.f36043OooO0o0.f36047OooO00o.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setBounds(rect);
        }
    }

    @Override // o00O00OO.OooOOO0, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? drawable.setLevel(i) : this.f36043OooO0o0.f36047OooO00o.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f36119OooO0Oo;
        return drawable != null ? drawable.setState(iArr) : this.f36043OooO0o0.f36047OooO00o.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO00o.OooO0o0(drawable, z);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO00o(drawable, i);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0O0(drawable, colorStateList);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            o00Ooo.OooO0OO(drawable, mode);
        } else {
            this.f36043OooO0o0.f36047OooO00o.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f36043OooO0o0.f36047OooO00o.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        OooO0O0 oooO0O0 = this.f36043OooO0o0;
        if (oooO0O0.f36048OooO0O0.isStarted()) {
            return;
        }
        oooO0O0.f36048OooO0O0.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f36119OooO0Oo;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f36043OooO0o0.f36048OooO0O0.end();
        }
    }

    public OooO0o(@Nullable Context context) {
        this.f36044OooO0oO = null;
        this.f36045OooO0oo = null;
        OooO00o oooO00o = new OooO00o();
        this.f36041OooO = oooO00o;
        this.f36042OooO0o = context;
        this.f36043OooO0o0 = new OooO0O0(oooO00o);
    }

    @RequiresApi(24)
    public static class OooO0OO extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f36051OooO00o;

        public OooO0OO(Drawable.ConstantState constantState) {
            this.f36051OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f36051OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f36051OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooO0o oooO0o = new OooO0o();
            Drawable drawableNewDrawable = this.f36051OooO00o.newDrawable();
            oooO0o.f36119OooO0Oo = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooO0o.f36041OooO);
            return oooO0o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooO0o oooO0o = new OooO0o();
            Drawable drawableNewDrawable = this.f36051OooO00o.newDrawable(resources);
            oooO0o.f36119OooO0Oo = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooO0o.f36041OooO);
            return oooO0o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooO0o oooO0o = new OooO0o();
            Drawable drawableNewDrawable = this.f36051OooO00o.newDrawable(resources, theme);
            oooO0o.f36119OooO0Oo = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooO0o.f36041OooO);
            return oooO0o;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
