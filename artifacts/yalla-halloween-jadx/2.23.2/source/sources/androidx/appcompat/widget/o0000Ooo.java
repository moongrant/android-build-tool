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
import androidx.core.content.ContextCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static o0000Ooo f3247OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final PorterDuff.Mode f3248OooO0oo = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0OO f3249OooOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WeakHashMap<Context, p190o00o0O.Oooo000<ColorStateList>> f3250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public p190o00o0O.OooOo<String, OooO> f3251OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public p190o00o0O.Oooo000<String> f3252OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<Context, p190o00o0O.OooOOOO<WeakReference<Drawable.ConstantState>>> f3253OooO0Oo = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f3254OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TypedValue f3255OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOO0 f3256OooO0oO;

    public interface OooO {
        Drawable OooO00o(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    public static class OooO00o implements OooO {
        @Override // androidx.appcompat.widget.o0000Ooo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return OooOo.OooO00o.OooO0oO(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    public static class OooO0O0 implements OooO {
        @Override // androidx.appcompat.widget.o0000Ooo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                o00O00OO.OooO0o oooO0o = new o00O00OO.OooO0o(context);
                oooO0o.inflate(resources, xmlResourceParser, attributeSet, theme);
                return oooO0o;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    public static class OooO0OO extends p190o00o0O.OooOo00<Integer, PorterDuffColorFilter> {
        public OooO0OO() {
            super(6);
        }
    }

    public static class OooO0o implements OooO {
        @Override // androidx.appcompat.widget.o0000Ooo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) OooO0o.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                p015OooOoO0.OooO0o.OooO0OO(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
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
        @Override // androidx.appcompat.widget.o0000Ooo.OooO
        public final Drawable OooO00o(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                o00O00OO.OooOOO oooOOO = new o00O00OO.OooOOO();
                oooOOO.inflate(resources, xmlResourceParser, attributeSet, theme);
                return oooOOO;
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized o0000Ooo OooO0Oo() {
        if (f3247OooO == null) {
            o0000Ooo o0000ooo = new o0000Ooo();
            f3247OooO = o0000ooo;
            OooOO0(o0000ooo);
        }
        return f3247OooO;
    }

    public static synchronized PorterDuffColorFilter OooO0oo(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        OooO0OO oooO0OO = f3249OooOO0;
        oooO0OO.getClass();
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = oooO0OO.get(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            oooO0OO.getClass();
            oooO0OO.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public static void OooOO0(@NonNull o0000Ooo o0000ooo) {
        if (Build.VERSION.SDK_INT < 24) {
            o0000ooo.OooO00o("vector", new OooOO0O());
            o0000ooo.OooO00o("animated-vector", new OooO0O0());
            o0000ooo.OooO00o("animated-selector", new OooO00o());
            o0000ooo.OooO00o("drawable", new OooO0o());
        }
    }

    public final synchronized ColorStateList OooO(@DrawableRes int i, @NonNull Context context) {
        ColorStateList colorStateList;
        p190o00o0O.Oooo000<ColorStateList> oooo000;
        try {
            WeakHashMap<Context, p190o00o0O.Oooo000<ColorStateList>> weakHashMap = this.f3250OooO00o;
            ColorStateList colorStateListOooO0Oo = null;
            colorStateList = (weakHashMap == null || (oooo000 = weakHashMap.get(context)) == null) ? null : (ColorStateList) oooo000.OooO0o(i, null);
            if (colorStateList == null) {
                OooOO0 oooOO1 = this.f3256OooO0oO;
                if (oooOO1 != null) {
                    colorStateListOooO0Oo = ((OooOOO0.OooO00o) oooOO1).OooO0Oo(i, context);
                }
                if (colorStateListOooO0Oo != null) {
                    if (this.f3250OooO00o == null) {
                        this.f3250OooO00o = new WeakHashMap<>();
                    }
                    p190o00o0O.Oooo000<ColorStateList> oooo001 = this.f3250OooO00o.get(context);
                    if (oooo001 == null) {
                        oooo001 = new p190o00o0O.Oooo000<>();
                        this.f3250OooO00o.put(context, oooo001);
                    }
                    oooo001.OooO0O0(i, colorStateListOooO0Oo);
                }
                colorStateList = colorStateListOooO0Oo;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    public final void OooO00o(@NonNull String str, @NonNull OooO oooO) {
        if (this.f3251OooO0O0 == null) {
            this.f3251OooO0O0 = new p190o00o0O.OooOo<>();
        }
        this.f3251OooO0O0.put(str, oooO);
    }

    public final synchronized void OooO0O0(@NonNull Context context, long j, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            p190o00o0O.OooOOOO<WeakReference<Drawable.ConstantState>> oooOOOO = this.f3253OooO0Oo.get(context);
            if (oooOOOO == null) {
                oooOOOO = new p190o00o0O.OooOOOO<>();
                this.f3253OooO0Oo.put(context, oooOOOO);
            }
            oooOOOO.OooO(j, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public final Drawable OooO0OO(@DrawableRes int i, @NonNull Context context) {
        LayerDrawable layerDrawableOooO0OO;
        if (this.f3255OooO0o0 == null) {
            this.f3255OooO0o0 = new TypedValue();
        }
        TypedValue typedValue = this.f3255OooO0o0;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableOooO0o0 = OooO0o0(context, j);
        if (drawableOooO0o0 != null) {
            return drawableOooO0o0;
        }
        if (this.f3256OooO0oO == null) {
            layerDrawableOooO0OO = null;
        } else if (i == p012OooOo0O.OooOo.abc_cab_background_top_material) {
            layerDrawableOooO0OO = new LayerDrawable(new Drawable[]{OooO0o(context, p012OooOo0O.OooOo.abc_cab_background_internal_bg), OooO0o(context, p012OooOo0O.OooOo.abc_cab_background_top_mtrl_alpha)});
        } else if (i == p012OooOo0O.OooOo.abc_ratingbar_material) {
            layerDrawableOooO0OO = OooOOO0.OooO00o.OooO0OO(this, context, p012OooOo0O.OooOo00.abc_star_big);
        } else if (i == p012OooOo0O.OooOo.abc_ratingbar_indicator_material) {
            layerDrawableOooO0OO = OooOOO0.OooO00o.OooO0OO(this, context, p012OooOo0O.OooOo00.abc_star_medium);
        } else if (i == p012OooOo0O.OooOo.abc_ratingbar_small_material) {
            layerDrawableOooO0OO = OooOOO0.OooO00o.OooO0OO(this, context, p012OooOo0O.OooOo00.abc_star_small);
        } else {
            layerDrawableOooO0OO = null;
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
        p190o00o0O.OooOOOO<WeakReference<Drawable.ConstantState>> oooOOOO = this.f3253OooO0Oo.get(context);
        if (oooOOOO == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) oooOOOO.OooO0oO(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            oooOOOO.OooOO0(j);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x018e A[Catch: all -> 0x00cb, TryCatch #1 {all -> 0x00cb, blocks: (B:3:0x0001, B:16:0x002c, B:18:0x0031, B:20:0x0037, B:22:0x003d, B:25:0x004b, B:29:0x005c, B:31:0x0060, B:32:0x0067, B:60:0x00e9, B:62:0x00ef, B:64:0x00f7, B:66:0x00fd, B:73:0x0113, B:69:0x010b, B:71:0x010f, B:75:0x0119, B:77:0x011d, B:79:0x0129, B:80:0x0154, B:82:0x0158, B:84:0x015c, B:86:0x0160, B:90:0x018e, B:97:0x019b, B:35:0x0081, B:37:0x0085, B:39:0x0091, B:40:0x0099, B:45:0x00a5, B:47:0x00b8, B:49:0x00c2, B:52:0x00ce, B:53:0x00d5, B:55:0x00d7, B:57:0x00e0, B:28:0x0055, B:6:0x0008, B:8:0x0012, B:10:0x0016, B:100:0x01a0, B:101:0x01a9), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (((r0 instanceof o00O00OO.OooOOO) || "android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName())) != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Drawable OooO0oO(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable drawableOooO0O0;
        int next;
        try {
            boolean z2 = false;
            if (!this.f3254OooO0o) {
                this.f3254OooO0o = true;
                Drawable drawableOooO0o = OooO0o(context, p015OooOoO0.OooO.abc_vector_test);
                if (drawableOooO0o != null) {
                }
                this.f3254OooO0o = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
            p190o00o0O.OooOo<String, OooO> oooOo = this.f3251OooO0O0;
            Drawable drawable = null;
            mode = null;
            PorterDuff.Mode mode = null;
            if (oooOo == null || oooOo.isEmpty()) {
                drawableOooO0O0 = null;
            } else {
                p190o00o0O.Oooo000<String> oooo000 = this.f3252OooO0OO;
                if (oooo000 != null) {
                    String str = (String) oooo000.OooO0o(i, null);
                    if ("appcompat_skip_skip".equals(str) || (str != null && this.f3251OooO0O0.getOrDefault(str, null) == null)) {
                        drawableOooO0O0 = null;
                    }
                } else {
                    this.f3252OooO0OO = new p190o00o0O.Oooo000<>();
                }
                if (this.f3255OooO0o0 == null) {
                    this.f3255OooO0o0 = new TypedValue();
                }
                TypedValue typedValue = this.f3255OooO0o0;
                Resources resources = context.getResources();
                resources.getValue(i, typedValue, true);
                long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
                drawableOooO0O0 = OooO0o0(context, j);
                if (drawableOooO0O0 == null) {
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
                            this.f3252OooO0OO.OooO0O0(i, name);
                            OooO orDefault = this.f3251OooO0O0.getOrDefault(name, null);
                            if (orDefault != null) {
                                drawableOooO0O0 = orDefault.OooO00o(context, xml, attributeSetAsAttributeSet, context.getTheme());
                            }
                            if (drawableOooO0O0 != null) {
                                drawableOooO0O0.setChangingConfigurations(typedValue.changingConfigurations);
                                OooO0O0(context, j, drawableOooO0O0);
                            }
                        } catch (Exception e) {
                            Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
                        }
                    }
                    if (drawableOooO0O0 == null) {
                        this.f3252OooO0OO.OooO0O0(i, "appcompat_skip_skip");
                    }
                }
            }
            if (drawableOooO0O0 == null) {
                drawableOooO0O0 = OooO0OO(i, context);
            }
            if (drawableOooO0O0 == null) {
                Object obj = ContextCompat.f5281OooO00o;
                drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, i);
            }
            if (drawableOooO0O0 != null) {
                ColorStateList colorStateListOooO = OooO(i, context);
                if (colorStateListOooO != null) {
                    int[] iArr = o000000.f3192OooO00o;
                    Drawable drawableMutate = drawableOooO0O0.mutate();
                    o00000oo.o00Ooo.OooO0O0.OooO0oo(drawableMutate, colorStateListOooO);
                    if (this.f3256OooO0oO != null && i == p012OooOo0O.OooOo.abc_switch_thumb_material) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode != null) {
                        o00000oo.o00Ooo.OooO0O0.OooO(drawableMutate, mode);
                    }
                    drawable = drawableMutate;
                } else if (this.f3256OooO0oO != null) {
                    if (i == p012OooOo0O.OooOo.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawableOooO0O0;
                        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                        int i2 = p012OooOo0O.OooOOO0.colorControlNormal;
                        int iOooO0OO = o0000O.OooO0OO(i2, context);
                        PorterDuff.Mode mode2 = OooOOO0.f2979OooO0O0;
                        OooOOO0.OooO00o.OooO0o0(drawableFindDrawableByLayerId, iOooO0OO, mode2);
                        OooOOO0.OooO00o.OooO0o0(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), o0000O.OooO0OO(i2, context), mode2);
                        OooOOO0.OooO00o.OooO0o0(layerDrawable.findDrawableByLayerId(R.id.progress), o0000O.OooO0OO(p012OooOo0O.OooOOO0.colorControlActivated, context), mode2);
                    } else {
                        if (i == p012OooOo0O.OooOo.abc_ratingbar_material || i == p012OooOo0O.OooOo.abc_ratingbar_indicator_material || i == p012OooOo0O.OooOo.abc_ratingbar_small_material) {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawableOooO0O0;
                            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
                            int iOooO0O0 = o0000O.OooO0O0(p012OooOo0O.OooOOO0.colorControlNormal, context);
                            PorterDuff.Mode mode3 = OooOOO0.f2979OooO0O0;
                            OooOOO0.OooO00o.OooO0o0(drawableFindDrawableByLayerId2, iOooO0O0, mode3);
                            Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                            int i3 = p012OooOo0O.OooOOO0.colorControlActivated;
                            OooOOO0.OooO00o.OooO0o0(drawableFindDrawableByLayerId3, o0000O.OooO0OO(i3, context), mode3);
                            OooOOO0.OooO00o.OooO0o0(layerDrawable2.findDrawableByLayerId(R.id.progress), o0000O.OooO0OO(i3, context), mode3);
                        } else if (z2) {
                            if (!OooOOO0(context, i, drawableOooO0O0)) {
                            }
                        }
                        drawable = drawableOooO0O0;
                    }
                    z2 = true;
                    if (z2) {
                        if (!OooOOO0(context, i, drawableOooO0O0)) {
                        }
                    }
                    drawable = drawableOooO0O0;
                } else if (!OooOOO0(context, i, drawableOooO0O0) || !z) {
                    drawable = drawableOooO0O0;
                }
                drawableOooO0O0 = drawable;
            }
            if (drawableOooO0O0 != null) {
                o000000.OooO00o(drawableOooO0O0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableOooO0O0;
    }

    public final synchronized void OooOO0O(@NonNull Context context) {
        p190o00o0O.OooOOOO<WeakReference<Drawable.ConstantState>> oooOOOO = this.f3253OooO0Oo.get(context);
        if (oooOOOO != null) {
            oooOOOO.OooO0Oo();
        }
    }

    public final synchronized void OooOO0o(OooOOO0.OooO00o oooO00o) {
        this.f3256OooO0oO = oooO00o;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public final boolean OooOOO0(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        boolean z;
        int i2;
        PorterDuff.Mode mode;
        int i3;
        int iRound;
        int i4;
        boolean z2;
        Drawable drawableMutate;
        OooOO0 oooOO1 = this.f3256OooO0oO;
        if (oooOO1 == null) {
            return false;
        }
        OooOOO0.OooO00o oooO00o = (OooOOO0.OooO00o) oooOO1;
        PorterDuff.Mode mode2 = OooOOO0.f2979OooO0O0;
        if (OooOOO0.OooO00o.OooO00o(i, oooO00o.f2982OooO00o)) {
            i4 = p012OooOo0O.OooOOO0.colorControlNormal;
        } else if (OooOOO0.OooO00o.OooO00o(i, oooO00o.f2984OooO0OO)) {
            i4 = p012OooOo0O.OooOOO0.colorControlActivated;
        } else {
            if (!OooOOO0.OooO00o.OooO00o(i, oooO00o.f2985OooO0Oo)) {
                if (i == p012OooOo0O.OooOo.abc_list_divider_mtrl_alpha) {
                    mode = mode2;
                    i3 = 16842800;
                    iRound = Math.round(40.8f);
                    z = true;
                } else {
                    if (i != p012OooOo0O.OooOo.abc_dialog_material_background) {
                        z = false;
                        i2 = 0;
                    }
                    mode = mode2;
                    i3 = i2;
                    iRound = -1;
                }
                if (z) {
                    int[] iArr = o000000.f3192OooO00o;
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(OooOOO0.OooO0OO(o0000O.OooO0OO(i3, context), mode));
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
                return false;
            }
            mode2 = PorterDuff.Mode.MULTIPLY;
            i4 = R.attr.colorBackground;
        }
        i2 = i4;
        z = true;
        mode = mode2;
        i3 = i2;
        iRound = -1;
        if (z) {
            int[] iArr2 = o000000.f3192OooO00o;
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(OooOOO0.OooO0OO(o0000O.OooO0OO(i3, context), mode));
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
        return false;
    }
}
