package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final PorterDuff.Mode f2982OooO0O0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static OooOOO0 f2983OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0000Ooo f2984OooO00o;

    public class OooO00o implements o0000Ooo.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f2985OooO00o = {p012OooOo0O.OooOo.abc_textfield_search_default_mtrl_alpha, p012OooOo0O.OooOo.abc_textfield_default_mtrl_alpha, p012OooOo0O.OooOo.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f2986OooO0O0 = {p012OooOo0O.OooOo.abc_ic_commit_search_api_mtrl_alpha, p012OooOo0O.OooOo.abc_seekbar_tick_mark_material, p012OooOo0O.OooOo.abc_ic_menu_share_mtrl_alpha, p012OooOo0O.OooOo.abc_ic_menu_copy_mtrl_am_alpha, p012OooOo0O.OooOo.abc_ic_menu_cut_mtrl_alpha, p012OooOo0O.OooOo.abc_ic_menu_selectall_mtrl_alpha, p012OooOo0O.OooOo.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f2987OooO0OO = {p012OooOo0O.OooOo.abc_textfield_activated_mtrl_alpha, p012OooOo0O.OooOo.abc_textfield_search_activated_mtrl_alpha, p012OooOo0O.OooOo.abc_cab_background_top_mtrl_alpha, p012OooOo0O.OooOo.abc_text_cursor_material, p012OooOo0O.OooOo.abc_text_select_handle_left_mtrl, p012OooOo0O.OooOo.abc_text_select_handle_middle_mtrl, p012OooOo0O.OooOo.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f2988OooO0Oo = {p012OooOo0O.OooOo.abc_popup_background_mtrl_mult, p012OooOo0O.OooOo.abc_cab_background_internal_bg, p012OooOo0O.OooOo.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f2990OooO0o0 = {p012OooOo0O.OooOo.abc_tab_indicator_material, p012OooOo0O.OooOo.abc_textfield_search_material};

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int[] f2989OooO0o = {p012OooOo0O.OooOo.abc_btn_check_material, p012OooOo0O.OooOo.abc_btn_radio_material, p012OooOo0O.OooOo.abc_btn_check_material_anim, p012OooOo0O.OooOo.abc_btn_radio_material_anim};

        public static boolean OooO00o(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList OooO0O0(@ColorInt int i, @NonNull Context context) {
            int iOooO0OO = o0000O.OooO0OO(p012OooOo0O.OooOOO0.colorControlHighlight, context);
            return new ColorStateList(new int[][]{o0000O.f3236OooO0O0, o0000O.f3238OooO0Oo, o0000O.f3237OooO0OO, o0000O.f3239OooO0o}, new int[]{o0000O.OooO0O0(p012OooOo0O.OooOOO0.colorButtonNormal, context), p052o00000oO.OooOO0.OooO0OO(iOooO0OO, i), p052o00000oO.OooOO0.OooO0OO(iOooO0OO, i), i});
        }

        public static LayerDrawable OooO0OO(@NonNull o0000Ooo o0000ooo, @NonNull Context context, @DimenRes int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableOooO0o = o0000ooo.OooO0o(context, p012OooOo0O.OooOo.abc_star_black_48dp);
            Drawable drawableOooO0o2 = o0000ooo.OooO0o(context, p012OooOo0O.OooOo.abc_star_half_black_48dp);
            if ((drawableOooO0o instanceof BitmapDrawable) && drawableOooO0o.getIntrinsicWidth() == dimensionPixelSize && drawableOooO0o.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableOooO0o;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableOooO0o.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableOooO0o.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableOooO0o2 instanceof BitmapDrawable) && drawableOooO0o2.getIntrinsicWidth() == dimensionPixelSize && drawableOooO0o2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableOooO0o2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableOooO0o2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableOooO0o2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public static void OooO0o0(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = o000000.f3195OooO00o;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = OooOOO0.f2982OooO0O0;
            }
            drawableMutate.setColorFilter(OooOOO0.OooO0OO(i, mode));
        }

        public final ColorStateList OooO0Oo(int i, @NonNull Context context) {
            if (i == p012OooOo0O.OooOo.abc_edit_text_material) {
                return ContextCompat.OooO0O0(p012OooOo0O.OooOOOO.abc_tint_edittext, context);
            }
            if (i == p012OooOo0O.OooOo.abc_switch_track_mtrl_alpha) {
                return ContextCompat.OooO0O0(p012OooOo0O.OooOOOO.abc_tint_switch_track, context);
            }
            if (i != p012OooOo0O.OooOo.abc_switch_thumb_material) {
                if (i == p012OooOo0O.OooOo.abc_btn_default_mtrl_shape) {
                    return OooO0O0(o0000O.OooO0OO(p012OooOo0O.OooOOO0.colorButtonNormal, context), context);
                }
                if (i == p012OooOo0O.OooOo.abc_btn_borderless_material) {
                    return OooO0O0(0, context);
                }
                if (i == p012OooOo0O.OooOo.abc_btn_colored_material) {
                    return OooO0O0(o0000O.OooO0OO(p012OooOo0O.OooOOO0.colorAccent, context), context);
                }
                if (i == p012OooOo0O.OooOo.abc_spinner_mtrl_am_alpha || i == p012OooOo0O.OooOo.abc_spinner_textfield_background_material) {
                    return ContextCompat.OooO0O0(p012OooOo0O.OooOOOO.abc_tint_spinner, context);
                }
                if (OooO00o(i, this.f2986OooO0O0)) {
                    return o0000O.OooO0Oo(p012OooOo0O.OooOOO0.colorControlNormal, context);
                }
                if (OooO00o(i, this.f2990OooO0o0)) {
                    return ContextCompat.OooO0O0(p012OooOo0O.OooOOOO.abc_tint_default, context);
                }
                if (OooO00o(i, this.f2989OooO0o)) {
                    return ContextCompat.OooO0O0(p012OooOo0O.OooOOOO.abc_tint_btn_checkable, context);
                }
                if (i == p012OooOo0O.OooOo.abc_seekbar_thumb_material) {
                    return ContextCompat.OooO0O0(p012OooOo0O.OooOOOO.abc_tint_seek_thumb, context);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = p012OooOo0O.OooOOO0.colorSwitchThumbNormal;
            ColorStateList colorStateListOooO0Oo = o0000O.OooO0Oo(i2, context);
            if (colorStateListOooO0Oo == null || !colorStateListOooO0Oo.isStateful()) {
                iArr[0] = o0000O.f3236OooO0O0;
                iArr2[0] = o0000O.OooO0O0(i2, context);
                iArr[1] = o0000O.f3240OooO0o0;
                iArr2[1] = o0000O.OooO0OO(p012OooOo0O.OooOOO0.colorControlActivated, context);
                iArr[2] = o0000O.f3239OooO0o;
                iArr2[2] = o0000O.OooO0OO(i2, context);
            } else {
                int[] iArr3 = o0000O.f3236OooO0O0;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListOooO0Oo.getColorForState(iArr3, 0);
                iArr[1] = o0000O.f3240OooO0o0;
                iArr2[1] = o0000O.OooO0OO(p012OooOo0O.OooOOO0.colorControlActivated, context);
                iArr[2] = o0000O.f3239OooO0o;
                iArr2[2] = colorStateListOooO0Oo.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
    }

    public static synchronized OooOOO0 OooO00o() {
        if (f2983OooO0OO == null) {
            OooO0Oo();
        }
        return f2983OooO0OO;
    }

    public static synchronized PorterDuffColorFilter OooO0OO(int i, PorterDuff.Mode mode) {
        return o0000Ooo.OooO0oo(i, mode);
    }

    public static synchronized void OooO0Oo() {
        if (f2983OooO0OO == null) {
            OooOOO0 oooOOO0 = new OooOOO0();
            f2983OooO0OO = oooOOO0;
            oooOOO0.f2984OooO00o = o0000Ooo.OooO0Oo();
            f2983OooO0OO.f2984OooO00o.OooOO0o(new OooO00o());
        }
    }

    public static void OooO0o0(Drawable drawable, o000O000 o000o001, int[] iArr) {
        PorterDuff.Mode mode = o0000Ooo.f3251OooO0oo;
        int[] state = drawable.getState();
        int[] iArr2 = o000000.f3195OooO00o;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = o000o001.f3270OooO0Oo;
        if (z || o000o001.f3269OooO0OO) {
            PorterDuffColorFilter porterDuffColorFilterOooO0oo = null;
            ColorStateList colorStateList = z ? o000o001.f3267OooO00o : null;
            PorterDuff.Mode mode2 = o000o001.f3269OooO0OO ? o000o001.f3268OooO0O0 : o0000Ooo.f3251OooO0oo;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterOooO0oo = o0000Ooo.OooO0oo(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterOooO0oo);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable OooO0O0(@NonNull Context context, @DrawableRes int i) {
        return this.f2984OooO00o.OooO0o(context, i);
    }
}
