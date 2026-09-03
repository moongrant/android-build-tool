package p103o000oo00;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
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
import p021OooOooo.Oooo0;
import p081o000OoO.o00oO0o;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooOo00 implements Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ArgbEvaluator f29844Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO0O0 f29845Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f29846Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO00o f29847OoooO00;

    public class OooO00o implements Drawable.Callback {
        public OooO00o() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            OooOOO0.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            OooOOO0.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            OooOOO0.this.unscheduleSelf(runnable);
        }
    }

    public static class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f29849OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOo f29850OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public AnimatorSet f29851OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ArrayList<Animator> f29852OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Oooo0<Animator, String> f29853OooO0o0;

        public OooO0O0(Drawable.Callback callback) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f29849OooO00o;
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

    public OooOOO0() {
        this(null);
    }

    public static OooOOO0 OooO00o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        OooOOO0 oooOOO0 = new OooOOO0(context);
        oooOOO0.inflate(resources, xmlPullParser, attributeSet, theme);
        return oooOOO0;
    }

    @Override // p103o000oo00.OooOo00, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO00o(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            return o0OOO0o.OooO0O0.OooO0O0(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f29845Oooo0oO.f29850OooO0O0.draw(canvas);
        if (this.f29845Oooo0oO.f29851OooO0OO.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? o0OOO0o.OooO00o.OooO00o(drawable) : this.f29845Oooo0oO.f29850OooO0O0.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f29845Oooo0oO.f29849OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? o0OOO0o.OooO0O0.OooO0OO(drawable) : this.f29845Oooo0oO.f29850OooO0O0.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f29921Oooo0o == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new OooO0OO(this.f29921Oooo0o.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f29845Oooo0oO.f29850OooO0O0.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f29845Oooo0oO.f29850OooO0O0.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.getOpacity() : this.f29845Oooo0oO.f29850OooO0O0.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        XmlResourceParser animation;
        Animator animatorOooO00o;
        OooOo oooOoOooO00o;
        int next;
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0Oo(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayOooOO0 = o00oO0o.OooOO0(resources, theme, attributeSet, OooOO0.f29837OooO0o0);
                    int resourceId = typedArrayOooOO0.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = OooOo.f29856o000oOoO;
                        if (Build.VERSION.SDK_INT >= 24) {
                            oooOoOooO00o = new OooOo();
                            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
                            oooOoOooO00o.f29921Oooo0o = androidx.core.content.res.OooO00o.C0045OooO00o.OooO00o(resources, resourceId, theme);
                            new OooOo.OooOOO0(oooOoOooO00o.f29921Oooo0o.getConstantState());
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
                                oooOoOooO00o = OooOo.OooO00o(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                oooOoOooO00o = null;
                            } catch (XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                oooOoOooO00o = null;
                            }
                        }
                        oooOoOooO00o.f29861OoooO0 = false;
                        oooOoOooO00o.setCallback(this.f29847OoooO00);
                        OooOo oooOo = this.f29845Oooo0oO.f29850OooO0O0;
                        if (oooOo != null) {
                            oooOo.setCallback(null);
                        }
                        this.f29845Oooo0oO.f29850OooO0O0 = oooOoOooO00o;
                    }
                    typedArrayOooOO0.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, OooOO0.f29836OooO0o);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f29846Oooo0oo;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorOooO00o = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorOooO00o = OooOOO.OooO00o(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
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
                                        if (animation != null) {
                                            animation.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    animation = null;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                            }
                        }
                        animatorOooO00o.setTarget(this.f29845Oooo0oO.f29850OooO0O0.f29858Oooo0oO.f29910OooO0O0.f29907OooOOOO.getOrDefault(string, null));
                        OooO0O0 oooO0O0 = this.f29845Oooo0oO;
                        if (oooO0O0.f29852OooO0Oo == null) {
                            oooO0O0.f29852OooO0Oo = new ArrayList<>();
                            this.f29845Oooo0oO.f29853OooO0o0 = new Oooo0<>();
                        }
                        this.f29845Oooo0oO.f29852OooO0Oo.add(animatorOooO00o);
                        this.f29845Oooo0oO.f29853OooO0o0.put(animatorOooO00o, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        OooO0O0 oooO0O1 = this.f29845Oooo0oO;
        if (oooO0O1.f29851OooO0OO == null) {
            oooO0O1.f29851OooO0OO = new AnimatorSet();
        }
        oooO0O1.f29851OooO0OO.playTogether(oooO0O1.f29852OooO0Oo);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? o0OOO0o.OooO00o.OooO0Oo(drawable) : this.f29845Oooo0oO.f29850OooO0O0.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f29845Oooo0oO.f29851OooO0OO.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.isStateful() : this.f29845Oooo0oO.f29850OooO0O0.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setBounds(rect);
        }
    }

    @Override // p103o000oo00.OooOo00, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.setLevel(i) : this.f29845Oooo0oO.f29850OooO0O0.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f29921Oooo0o;
        return drawable != null ? drawable.setState(iArr) : this.f29845Oooo0oO.f29850OooO0O0.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO00o.OooO0o0(drawable, z);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oO(drawable, i);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO(drawable, mode);
        } else {
            this.f29845Oooo0oO.f29850OooO0O0.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f29845Oooo0oO.f29850OooO0O0.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f29845Oooo0oO.f29851OooO0OO.isStarted()) {
                return;
            }
            this.f29845Oooo0oO.f29851OooO0OO.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f29921Oooo0o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f29845Oooo0oO.f29851OooO0OO.end();
        }
    }

    public OooOOO0(@Nullable Context context) {
        this.f29844Oooo = null;
        OooO00o oooO00o = new OooO00o();
        this.f29847OoooO00 = oooO00o;
        this.f29846Oooo0oo = context;
        this.f29845Oooo0oO = new OooO0O0(oooO00o);
    }

    @RequiresApi(24)
    public static class OooO0OO extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f29854OooO00o;

        public OooO0OO(Drawable.ConstantState constantState) {
            this.f29854OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f29854OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f29854OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooOOO0 oooOOO0 = new OooOOO0(null);
            Drawable drawableNewDrawable = this.f29854OooO00o.newDrawable();
            oooOOO0.f29921Oooo0o = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooOOO0.f29847OoooO00);
            return oooOOO0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooOOO0 oooOOO0 = new OooOOO0(null);
            Drawable drawableNewDrawable = this.f29854OooO00o.newDrawable(resources);
            oooOOO0.f29921Oooo0o = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooOOO0.f29847OoooO00);
            return oooOOO0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooOOO0 oooOOO0 = new OooOOO0(null);
            Drawable drawableNewDrawable = this.f29854OooO00o.newDrawable(resources, theme);
            oooOOO0.f29921Oooo0o = drawableNewDrawable;
            drawableNewDrawable.setCallback(oooOOO0.f29847OoooO00);
            return oooOOO0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
