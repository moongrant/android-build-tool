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

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final PorterDuff.Mode f5102OooO0O0 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static OooOO0O f5103OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000OOo f5104OooO00o;

    public class OooO00o implements o000OOo.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int[] f5105OooO00o = {OooOo00.OooO.abc_textfield_search_default_mtrl_alpha, OooOo00.OooO.abc_textfield_default_mtrl_alpha, OooOo00.OooO.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f5106OooO0O0 = {OooOo00.OooO.abc_ic_commit_search_api_mtrl_alpha, OooOo00.OooO.abc_seekbar_tick_mark_material, OooOo00.OooO.abc_ic_menu_share_mtrl_alpha, OooOo00.OooO.abc_ic_menu_copy_mtrl_am_alpha, OooOo00.OooO.abc_ic_menu_cut_mtrl_alpha, OooOo00.OooO.abc_ic_menu_selectall_mtrl_alpha, OooOo00.OooO.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f5107OooO0OO = {OooOo00.OooO.abc_textfield_activated_mtrl_alpha, OooOo00.OooO.abc_textfield_search_activated_mtrl_alpha, OooOo00.OooO.abc_cab_background_top_mtrl_alpha, OooOo00.OooO.abc_text_cursor_material, OooOo00.OooO.abc_text_select_handle_left_mtrl, OooOo00.OooO.abc_text_select_handle_middle_mtrl, OooOo00.OooO.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f5108OooO0Oo = {OooOo00.OooO.abc_popup_background_mtrl_mult, OooOo00.OooO.abc_cab_background_internal_bg, OooOo00.OooO.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int[] f5110OooO0o0 = {OooOo00.OooO.abc_tab_indicator_material, OooOo00.OooO.abc_textfield_search_material};

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int[] f5109OooO0o = {OooOo00.OooO.abc_btn_check_material, OooOo00.OooO.abc_btn_radio_material, OooOo00.OooO.abc_btn_check_material_anim, OooOo00.OooO.abc_btn_radio_material_anim};

        public final boolean OooO00o(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList OooO0O0(@NonNull Context context, @ColorInt int i) {
            int iOooO0OO = o00000OO.OooO0OO(context, OooOo00.OooO00o.colorControlHighlight);
            return new ColorStateList(new int[][]{o00000OO.f5356OooO0O0, o00000OO.f5358OooO0Oo, o00000OO.f5357OooO0OO, o00000OO.f5359OooO0o}, new int[]{o00000OO.OooO0O0(context, OooOo00.OooO00o.colorButtonNormal), p071o000O0o.OooO0o.OooO0O0(iOooO0OO, i), p071o000O0o.OooO0o.OooO0O0(iOooO0OO, i), i});
        }

        public final LayerDrawable OooO0OO(@NonNull o000OOo o000ooo2, @NonNull Context context, @DimenRes int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableOooO0o = o000ooo2.OooO0o(context, OooOo00.OooO.abc_star_black_48dp);
            Drawable drawableOooO0o2 = o000ooo2.OooO0o(context, OooOo00.OooO.abc_star_half_black_48dp);
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

        public final ColorStateList OooO0Oo(@NonNull Context context, int i) {
            if (i == OooOo00.OooO.abc_edit_text_material) {
                return p012OooOo0.OooOO0O.OooO00o(context, OooOo00.OooO0OO.abc_tint_edittext);
            }
            if (i == OooOo00.OooO.abc_switch_track_mtrl_alpha) {
                return p012OooOo0.OooOO0O.OooO00o(context, OooOo00.OooO0OO.abc_tint_switch_track);
            }
            if (i != OooOo00.OooO.abc_switch_thumb_material) {
                if (i == OooOo00.OooO.abc_btn_default_mtrl_shape) {
                    return OooO0O0(context, o00000OO.OooO0OO(context, OooOo00.OooO00o.colorButtonNormal));
                }
                if (i == OooOo00.OooO.abc_btn_borderless_material) {
                    return OooO0O0(context, 0);
                }
                if (i == OooOo00.OooO.abc_btn_colored_material) {
                    return OooO0O0(context, o00000OO.OooO0OO(context, OooOo00.OooO00o.colorAccent));
                }
                if (i == OooOo00.OooO.abc_spinner_mtrl_am_alpha || i == OooOo00.OooO.abc_spinner_textfield_background_material) {
                    return p012OooOo0.OooOO0O.OooO00o(context, OooOo00.OooO0OO.abc_tint_spinner);
                }
                if (OooO00o(this.f5106OooO0O0, i)) {
                    return o00000OO.OooO0Oo(context, OooOo00.OooO00o.colorControlNormal);
                }
                if (OooO00o(this.f5110OooO0o0, i)) {
                    return p012OooOo0.OooOO0O.OooO00o(context, OooOo00.OooO0OO.abc_tint_default);
                }
                if (OooO00o(this.f5109OooO0o, i)) {
                    return p012OooOo0.OooOO0O.OooO00o(context, OooOo00.OooO0OO.abc_tint_btn_checkable);
                }
                if (i == OooOo00.OooO.abc_seekbar_thumb_material) {
                    return p012OooOo0.OooOO0O.OooO00o(context, OooOo00.OooO0OO.abc_tint_seek_thumb);
                }
                return null;
            }
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = OooOo00.OooO00o.colorSwitchThumbNormal;
            ColorStateList colorStateListOooO0Oo = o00000OO.OooO0Oo(context, i2);
            if (colorStateListOooO0Oo == null || !colorStateListOooO0Oo.isStateful()) {
                iArr[0] = o00000OO.f5356OooO0O0;
                iArr2[0] = o00000OO.OooO0O0(context, i2);
                iArr[1] = o00000OO.f5360OooO0o0;
                iArr2[1] = o00000OO.OooO0OO(context, OooOo00.OooO00o.colorControlActivated);
                iArr[2] = o00000OO.f5359OooO0o;
                iArr2[2] = o00000OO.OooO0OO(context, i2);
            } else {
                iArr[0] = o00000OO.f5356OooO0O0;
                iArr2[0] = colorStateListOooO0Oo.getColorForState(iArr[0], 0);
                iArr[1] = o00000OO.f5360OooO0o0;
                iArr2[1] = o00000OO.OooO0OO(context, OooOo00.OooO00o.colorControlActivated);
                iArr[2] = o00000OO.f5359OooO0o;
                iArr2[2] = colorStateListOooO0Oo.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final void OooO0o0(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = o0ooOOo.f5493OooO00o;
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = OooOO0O.f5102OooO0O0;
            }
            drawableMutate.setColorFilter(OooOO0O.OooO0OO(i, mode));
        }
    }

    public static synchronized OooOO0O OooO00o() {
        if (f5103OooO0OO == null) {
            OooO0o0();
        }
        return f5103OooO0OO;
    }

    public static synchronized PorterDuffColorFilter OooO0OO(int i, PorterDuff.Mode mode) {
        return o000OOo.OooO0oo(i, mode);
    }

    public static void OooO0o(Drawable drawable, o0000O00 o0000o00, int[] iArr) {
        PorterDuff.Mode mode = o000OOo.f5409OooO0oo;
        int[] state = drawable.getState();
        int[] iArr2 = o0ooOOo.f5493OooO00o;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = o0000o00.f5387OooO0Oo;
        if (z || o0000o00.f5386OooO0OO) {
            PorterDuffColorFilter porterDuffColorFilterOooO0oo = null;
            ColorStateList colorStateList = z ? o0000o00.f5384OooO00o : null;
            PorterDuff.Mode mode2 = o0000o00.f5386OooO0OO ? o0000o00.f5385OooO0O0 : o000OOo.f5409OooO0oo;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterOooO0oo = o000OOo.OooO0oo(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterOooO0oo);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public static synchronized void OooO0o0() {
        if (f5103OooO0OO == null) {
            OooOO0O oooOO0O = new OooOO0O();
            f5103OooO0OO = oooOO0O;
            oooOO0O.f5104OooO00o = o000OOo.OooO0Oo();
            o000OOo o000ooo2 = f5103OooO0OO.f5104OooO00o;
            OooO00o oooO00o = new OooO00o();
            synchronized (o000ooo2) {
                o000ooo2.f5417OooO0oO = oooO00o;
            }
        }
    }

    public final synchronized Drawable OooO0O0(@NonNull Context context, @DrawableRes int i) {
        return this.f5104OooO00o.OooO0o(context, i);
    }

    public final synchronized ColorStateList OooO0Oo(@NonNull Context context, @DrawableRes int i) {
        return this.f5104OooO00o.OooO(context, i);
    }
}
