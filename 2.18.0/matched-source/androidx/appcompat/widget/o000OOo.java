package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static o000OOo f5408OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final PorterDuff.Mode f5409OooO0oo = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0OO f5410OooOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WeakHashMap<Context, p021OooOooo.o0ooOOo<ColorStateList>> f5411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public p021OooOooo.o00oO0o<String, OooO> f5412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public p021OooOooo.o0ooOOo<String> f5413OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<Context, p021OooOooo.o00Ooo<WeakReference<Drawable.ConstantState>>> f5414OooO0Oo = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f5415OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TypedValue f5416OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOO0 f5417OooO0oO;

    public interface OooO {
        Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    public static class OooO00o implements OooO {
        @Override // androidx.appcompat.widget.o000OOo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return p013OooOo0O.OooO0OO.OooO0oO(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    public static class OooO0O0 implements OooO {
        @Override // androidx.appcompat.widget.o000OOo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return p104o000oo00.OooOOO0.OooO00o(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    public static class OooO0OO extends p021OooOooo.oo000o<Integer, PorterDuffColorFilter> {
        public OooO0OO() {
            super(6);
        }
    }

    public static class OooO0o implements OooO {
        @Override // androidx.appcompat.widget.o000OOo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) OooO0o.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                p014OooOo0o.OooOOO0.OooO0OO(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                return null;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface OooOO0 {
    }

    public static class OooOO0O implements OooO {
        @Override // androidx.appcompat.widget.o000OOo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return p104o000oo00.OooOo.OooO00o(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized o000OOo OooO0Oo() {
        if (f5408OooO == null) {
            o000OOo o000ooo2 = new o000OOo();
            f5408OooO = o000ooo2;
            OooOO0(o000ooo2);
        }
        return f5408OooO;
    }

    public static synchronized PorterDuffColorFilter OooO0oo(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        OooO0OO oooO0OO = f5410OooOO0;
        Objects.requireNonNull(oooO0OO);
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = oooO0OO.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            Objects.requireNonNull(oooO0OO);
            oooO0OO.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public static void OooOO0(@NonNull o000OOo o000ooo2) {
        if (Build.VERSION.SDK_INT < 24) {
            o000ooo2.OooO00o("vector", new OooOO0O());
            o000ooo2.OooO00o("animated-vector", new OooO0O0());
            o000ooo2.OooO00o("animated-selector", new OooO00o());
            o000ooo2.OooO00o("drawable", new OooO0o());
        }
    }

    public final synchronized ColorStateList OooO(@NonNull Context context, @DrawableRes int i) {
        ColorStateList colorStateListOooO0oO;
        p021OooOooo.o0ooOOo<ColorStateList> o0ooooo2;
        WeakHashMap<Context, p021OooOooo.o0ooOOo<ColorStateList>> weakHashMap = this.f5411OooO00o;
        ColorStateList colorStateListOooO0Oo = null;
        colorStateListOooO0oO = (weakHashMap == null || (o0ooooo2 = weakHashMap.get(context)) == null) ? null : o0ooooo2.OooO0oO(i, null);
        if (colorStateListOooO0oO == null) {
            OooOO0 oooOO1 = this.f5417OooO0oO;
            if (oooOO1 != null) {
                colorStateListOooO0Oo = ((androidx.appcompat.widget.OooOO0O.OooO00o) oooOO1).OooO0Oo(context, i);
            }
            if (colorStateListOooO0Oo != null) {
                if (this.f5411OooO00o == null) {
                    this.f5411OooO00o = new WeakHashMap<>();
                }
                p021OooOooo.o0ooOOo<ColorStateList> o0ooooo3 = this.f5411OooO00o.get(context);
                if (o0ooooo3 == null) {
                    o0ooooo3 = new p021OooOooo.o0ooOOo<>();
                    this.f5411OooO00o.put(context, o0ooooo3);
                }
                o0ooooo3.OooO0OO(i, colorStateListOooO0Oo);
            }
            colorStateListOooO0oO = colorStateListOooO0Oo;
        }
        return colorStateListOooO0oO;
    }

    public final void OooO00o(@NonNull String str, @NonNull OooO oooO) {
        if (this.f5412OooO0O0 == null) {
            this.f5412OooO0O0 = new p021OooOooo.o00oO0o<>();
        }
        this.f5412OooO0O0.put(str, oooO);
    }

    public final synchronized boolean OooO0O0(@NonNull Context context, long j, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        p021OooOooo.o00Ooo<WeakReference<Drawable.ConstantState>> o00ooo2 = this.f5414OooO0Oo.get(context);
        if (o00ooo2 == null) {
            o00ooo2 = new p021OooOooo.o00Ooo<>();
            this.f5414OooO0Oo.put(context, o00ooo2);
        }
        o00ooo2.OooOO0o(j, new WeakReference<>(constantState));
        return true;
    }

    public final Drawable OooO0OO(@NonNull Context context, @DrawableRes int i) {
        if (this.f5416OooO0o0 == null) {
            this.f5416OooO0o0 = new TypedValue();
        }
        TypedValue typedValue = this.f5416OooO0o0;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableOooO0o0 = OooO0o0(context, j);
        if (drawableOooO0o0 != null) {
            return drawableOooO0o0;
        }
        OooOO0 oooOO1 = this.f5417OooO0oO;
        LayerDrawable layerDrawableOooO0OO = null;
        if (oooOO1 != null) {
            androidx.appcompat.widget.OooOO0O.OooO00o oooO00o = (androidx.appcompat.widget.OooOO0O.OooO00o) oooOO1;
            Objects.requireNonNull(oooO00o);
            if (i == OooOo00.OooO.abc_cab_background_top_material) {
                layerDrawableOooO0OO = new LayerDrawable(new Drawable[]{OooO0o(context, OooOo00.OooO.abc_cab_background_internal_bg), OooO0o(context, OooOo00.OooO.abc_cab_background_top_mtrl_alpha)});
            } else if (i == OooOo00.OooO.abc_ratingbar_material) {
                layerDrawableOooO0OO = oooO00o.OooO0OO(this, context, OooOo00.OooO0o.abc_star_big);
            } else if (i == OooOo00.OooO.abc_ratingbar_indicator_material) {
                layerDrawableOooO0OO = oooO00o.OooO0OO(this, context, OooOo00.OooO0o.abc_star_medium);
            } else if (i == OooOo00.OooO.abc_ratingbar_small_material) {
                layerDrawableOooO0OO = oooO00o.OooO0OO(this, context, OooOo00.OooO0o.abc_star_small);
            }
        }
        if (layerDrawableOooO0OO != null) {
            layerDrawableOooO0OO.setChangingConfigurations(typedValue.changingConfigurations);
            OooO0O0(context, j, layerDrawableOooO0OO);
        }
        return layerDrawableOooO0OO;
    }

    public final synchronized Drawable OooO0o(@NonNull Context context, @DrawableRes int i) {
        return OooO0oO(context, i, false);
    }

    public final synchronized Drawable OooO0o0(@NonNull Context context, long j) {
        p021OooOooo.o00Ooo<WeakReference<Drawable.ConstantState>> o00ooo2 = this.f5414OooO0Oo.get(context);
        if (o00ooo2 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceOooO = o00ooo2.OooO(j, null);
        if (weakReferenceOooO != null) {
            Drawable.ConstantState constantState = weakReferenceOooO.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            o00ooo2.OooOOO0(j);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable OooO0oO(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable drawableOooOO0O;
        if (!this.f5415OooO0o) {
            boolean z2 = true;
            this.f5415OooO0o = true;
            Drawable drawableOooO0o = OooO0o(context, p014OooOo0o.OooOOO.abc_vector_test);
            if (drawableOooO0o != null) {
                if (!(drawableOooO0o instanceof p104o000oo00.OooOo) && !"android.graphics.drawable.VectorDrawable".equals(drawableOooO0o.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f5415OooO0o = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        drawableOooOO0O = OooOO0O(context, i);
        if (drawableOooOO0O == null) {
            drawableOooOO0O = OooO0OO(context, i);
        }
        if (drawableOooOO0O == null) {
            Object obj = o000O000.OooO00o.f28105OooO00o;
            drawableOooOO0O = o000O000.OooO00o.OooO0OO.OooO0O0(context, i);
        }
        if (drawableOooOO0O != null) {
            drawableOooOO0O = OooOO0o(context, i, z, drawableOooOO0O);
        }
        if (drawableOooOO0O != null) {
            o0ooOOo.OooO00o(drawableOooOO0O);
        }
        return drawableOooOO0O;
    }

    public final Drawable OooOO0O(@NonNull Context context, @DrawableRes int i) {
        int next;
        p021OooOooo.o00oO0o<String, OooO> o00oo0o2 = this.f5412OooO0O0;
        if (o00oo0o2 == null || o00oo0o2.isEmpty()) {
            return null;
        }
        p021OooOooo.o0ooOOo<String> o0ooooo2 = this.f5413OooO0OO;
        if (o0ooooo2 != null) {
            String strOooO0oO = o0ooooo2.OooO0oO(i, null);
            if ("appcompat_skip_skip".equals(strOooO0oO) || (strOooO0oO != null && this.f5412OooO0O0.getOrDefault(strOooO0oO, null) == null)) {
                return null;
            }
        } else {
            this.f5413OooO0OO = new p021OooOooo.o0ooOOo<>();
        }
        if (this.f5416OooO0o0 == null) {
            this.f5416OooO0o0 = new TypedValue();
        }
        TypedValue typedValue = this.f5416OooO0o0;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableOooO0o0 = OooO0o0(context, j);
        if (drawableOooO0o0 != null) {
            return drawableOooO0o0;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
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
                String name = xml.getName();
                this.f5413OooO0OO.OooO0OO(i, name);
                OooO orDefault = this.f5412OooO0O0.getOrDefault(name, null);
                if (orDefault != null) {
                    drawableOooO0o0 = orDefault.OooO00o(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableOooO0o0 != null) {
                    drawableOooO0o0.setChangingConfigurations(typedValue.changingConfigurations);
                    OooO0O0(context, j, drawableOooO0o0);
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (drawableOooO0o0 == null) {
            this.f5413OooO0OO.OooO0OO(i, "appcompat_skip_skip");
        }
        return drawableOooO0o0;
    }

    public final Drawable OooOO0o(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList colorStateListOooO = OooO(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListOooO != null) {
            int[] iArr = o0ooOOo.f5493OooO00o;
            Drawable drawableOooO0o0 = p084o000Ooo.o0OOO0o.OooO0o0(drawable.mutate());
            o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableOooO0o0, colorStateListOooO);
            if (this.f5417OooO0oO != null && i == OooOo00.OooO.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawableOooO0o0;
            }
            o000Ooo.o0OOO0o.OooO0O0.OooO(drawableOooO0o0, mode);
            return drawableOooO0o0;
        }
        OooOO0 oooOO1 = this.f5417OooO0oO;
        if (oooOO1 != null) {
            androidx.appcompat.widget.OooOO0O.OooO00o oooO00o = (androidx.appcompat.widget.OooOO0O.OooO00o) oooOO1;
            boolean z2 = true;
            if (i == OooOo00.OooO.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i2 = OooOo00.OooO00o.colorControlNormal;
                int iOooO0OO = o00000OO.OooO0OO(context, i2);
                PorterDuff.Mode mode2 = androidx.appcompat.widget.OooOO0O.f5102OooO0O0;
                oooO00o.OooO0o0(drawableFindDrawableByLayerId, iOooO0OO, mode2);
                oooO00o.OooO0o0(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), o00000OO.OooO0OO(context, i2), mode2);
                oooO00o.OooO0o0(layerDrawable.findDrawableByLayerId(R.id.progress), o00000OO.OooO0OO(context, OooOo00.OooO00o.colorControlActivated), mode2);
            } else if (i == OooOo00.OooO.abc_ratingbar_material || i == OooOo00.OooO.abc_ratingbar_indicator_material || i == OooOo00.OooO.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                int iOooO0O0 = o00000OO.OooO0O0(context, OooOo00.OooO00o.colorControlNormal);
                PorterDuff.Mode mode3 = androidx.appcompat.widget.OooOO0O.f5102OooO0O0;
                oooO00o.OooO0o0(drawableFindDrawableByLayerId2, iOooO0O0, mode3);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i3 = OooOo00.OooO00o.colorControlActivated;
                oooO00o.OooO0o0(drawableFindDrawableByLayerId3, o00000OO.OooO0OO(context, i3), mode3);
                oooO00o.OooO0o0(layerDrawable2.findDrawableByLayerId(R.id.progress), o00000OO.OooO0OO(context, i3), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (OooOOO0(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public final boolean OooOOO0(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        boolean z2;
        Drawable drawableMutate;
        OooOO0 oooOO1 = this.f5417OooO0oO;
        if (oooOO1 != null) {
            androidx.appcompat.widget.OooOO0O.OooO00o oooO00o = (androidx.appcompat.widget.OooOO0O.OooO00o) oooOO1;
            PorterDuff.Mode mode = androidx.appcompat.widget.OooOO0O.f5102OooO0O0;
            boolean zOooO00o = oooO00o.OooO00o(oooO00o.f5105OooO00o, i);
            int i3 = R.attr.colorBackground;
            if (zOooO00o) {
                i3 = OooOo00.OooO00o.colorControlNormal;
            } else if (oooO00o.OooO00o(oooO00o.f5107OooO0OO, i)) {
                i3 = OooOo00.OooO00o.colorControlActivated;
            } else if (oooO00o.OooO00o(oooO00o.f5108OooO0Oo, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i == OooOo00.OooO.abc_list_divider_mtrl_alpha) {
                    i2 = R.attr.colorForeground;
                    iRound = Math.round(40.8f);
                    z = true;
                } else if (i != OooOo00.OooO.abc_dialog_material_background) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {
                    int[] iArr = o0ooOOo.f5493OooO00o;
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(o00000OO.OooO0OO(context, i2), mode));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            i2 = i3;
            iRound = -1;
            z = true;
            if (z) {
                int[] iArr2 = o0ooOOo.f5493OooO00o;
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(androidx.appcompat.widget.OooOO0O.OooO0OO(o00000OO.OooO0OO(context, i2), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
