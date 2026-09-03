package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.ULong;
import o0000O0O.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface AutoSizeTextType {
    }

    @RequiresApi(28)
    public static class OooO {
        @DoNotInline
        public static CharSequence OooO00o(PrecomputedText precomputedText) {
            return precomputedText;
        }

        @DoNotInline
        public static String[] OooO0O0(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @DoNotInline
        public static PrecomputedText.Params OooO0OO(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @DoNotInline
        public static void OooO0Oo(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static boolean OooO00o(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @DoNotInline
        public static int OooO0O0(TextView textView) {
            return textView.getMaxLines();
        }

        @DoNotInline
        public static int OooO0OO(TextView textView) {
            return textView.getMinLines();
        }
    }

    @RequiresApi(17)
    public static class OooO0O0 {
        @DoNotInline
        public static Drawable[] OooO00o(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        public static int OooO0O0(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        public static int OooO0OO(View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        public static Locale OooO0Oo(TextView textView) {
            return textView.getTextLocale();
        }

        @DoNotInline
        public static void OooO0o(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @DoNotInline
        public static void OooO0o0(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        public static void OooO0oO(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        public static void OooO0oo(View view, int i) {
            view.setTextDirection(i);
        }
    }

    @RequiresApi(23)
    public static class OooO0OO {
        @DoNotInline
        public static int OooO00o(TextView textView) {
            return textView.getBreakStrategy();
        }

        @DoNotInline
        public static ColorStateList OooO0O0(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode OooO0OO(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @DoNotInline
        public static int OooO0Oo(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @DoNotInline
        public static void OooO0o(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @DoNotInline
        public static void OooO0o0(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @DoNotInline
        public static void OooO0oO(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @DoNotInline
        public static void OooO0oo(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    @RequiresApi(24)
    public static class OooO0o {
        @DoNotInline
        public static DecimalFormatSymbols OooO00o(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @RequiresApi(26)
    public static class OooOO0 implements ActionMode.Callback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ActionMode.Callback f5542OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f5543OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Class<?> f5544OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Method f5545OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f5546OooO0o = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f5547OooO0o0;

        public OooOO0(ActionMode.Callback callback, TextView textView) {
            this.f5542OooO00o = callback;
            this.f5543OooO0O0 = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f5542OooO00o.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f5542OooO00o.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f5542OooO00o.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            boolean z;
            String str;
            TextView textView = this.f5543OooO0O0;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f5546OooO0o) {
                this.f5546OooO0o = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f5544OooO0OO = cls;
                    this.f5545OooO0Oo = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f5547OooO0o0 = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f5544OooO0OO = null;
                    this.f5545OooO0Oo = null;
                    this.f5547OooO0o0 = false;
                }
            }
            try {
                Method declaredMethod = (this.f5547OooO0o0 && this.f5544OooO0OO.isInstance(menu)) ? this.f5545OooO0Oo : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            z = true;
                        } else {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                    MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                    Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f5542OooO00o.onPrepareActionMode(actionMode, menu);
        }
    }

    @NonNull
    public static o00O0O.OooO00o OooO00o(@NonNull TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new o00O0O.OooO00o(OooO.OooO0OO(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iOooO00o = OooO0OO.OooO00o(textView);
        int iOooO0Oo = OooO0OO.OooO0Oo(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (textView.getInputType() & 15) != 3) {
            boolean z = OooO0O0.OooO0O0(textView) == 1;
            switch (OooO0O0.OooO0OO(textView)) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(OooO.OooO0O0(OooO0o.OooO00o(OooO0O0.OooO0Oo(textView)))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new o00O0O.OooO00o(textPaint, textDirectionHeuristic, iOooO00o, iOooO0Oo);
    }

    public static void OooO0O0(@NonNull TextView textView, @IntRange(from = ULong.MIN_VALUE) @Px int i) {
        o000OO.OooOOO0.OooO0Oo(i);
        if (Build.VERSION.SDK_INT >= 28) {
            OooO.OooO0Oo(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = OooO00o.OooO00o(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void OooO0OO(@NonNull TextView textView, @IntRange(from = ULong.MIN_VALUE) @Px int i) {
        o000OO.OooOOO0.OooO0Oo(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = OooO00o.OooO00o(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void OooO0Oo(@NonNull TextView textView, @NonNull o00O0O o00o0o2) {
        if (Build.VERSION.SDK_INT >= 29) {
            o00o0o2.getClass();
            textView.setText(OooO.OooO00o(null));
        } else {
            o00O0O.OooO00o OooO00o2 = OooO00o(textView);
            o00o0o2.getClass();
            OooO00o2.OooO00o(null);
            throw null;
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback OooO0o(@Nullable ActionMode.Callback callback, @NonNull TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof OooOO0) || callback == null) ? callback : new OooOO0(callback, textView);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback OooO0o0(@Nullable ActionMode.Callback callback) {
        return (!(callback instanceof OooOO0) || Build.VERSION.SDK_INT < 26) ? callback : ((OooOO0) callback).f5542OooO00o;
    }
}
