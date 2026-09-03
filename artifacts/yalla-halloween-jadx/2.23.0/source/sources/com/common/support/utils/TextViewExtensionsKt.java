package com.common.support.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0081\u0002\u0010\u0011\u001a\u00020\u0012*\u00020\u00032d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d0\u00142d\b\u0006\u0010\u001e\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001d0\u00142#\b\u0006\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u001d0!H\u0086\bø\u0001\u0000\u001a5\u0010 \u001a\u00020\u0012*\u00020\u00032#\b\u0006\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u001d0!H\u0086\bø\u0001\u0000\u001av\u0010\u0013\u001a\u00020\u0012*\u00020\u00032d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0086\bø\u0001\u0000\u001a\n\u0010#\u001a\u00020\u001d*\u00020\u0003\u001a\u0012\u0010#\u001a\u00020\u001d*\u00020\u00032\u0006\u0010\u0000\u001a\u00020$\u001av\u0010\u001e\u001a\u00020\u0012*\u00020\u00032d\b\u0006\u0010\u001e\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0086\bø\u0001\u0000\u001a\u0012\u0010%\u001a\u00020\u001d*\u00020\u00032\u0006\u0010&\u001a\u00020\u0019\u001a\u001a\u0010'\u001a\u00020\u001d*\u00020\u00032\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019\u001a\u0012\u0010*\u001a\u00020\u001d*\u00020\u00032\u0006\u0010&\u001a\u00020\u0019\u001a\u001a\u0010+\u001a\u00020\u001d*\u00020\u00032\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019\u001a\u0012\u0010,\u001a\u00020\u001d*\u00020\u00032\u0006\u0010&\u001a\u00020\u0019\u001a\u001a\u0010-\u001a\u00020\u001d*\u00020\u00032\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019\u001a\u0012\u0010.\u001a\u00020\u001d*\u00020\u00032\u0006\u0010&\u001a\u00020\u0019\u001a\u001a\u0010/\u001a\u00020\u001d*\u00020\u00032\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019\",\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\",\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007\",\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007\",\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\u0010\u0000\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroid/graphics/drawable/Drawable;", "compoundDrawableBottom", "Landroid/widget/TextView;", "getCompoundDrawableBottom", "(Landroid/widget/TextView;)Landroid/graphics/drawable/Drawable;", "setCompoundDrawableBottom", "(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V", "compoundDrawableEnd", "getCompoundDrawableEnd", "setCompoundDrawableEnd", "compoundDrawableStart", "getCompoundDrawableStart", "setCompoundDrawableStart", "compoundDrawableTop", "getCompoundDrawableTop", "setCompoundDrawableTop", "addTextChangedListener", "Landroid/text/TextWatcher;", "beforeTextChanged", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "s", "", "start", "count", "after", "", "onTextChanged", "before", "afterTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "copy", "", "setDrawableBottom", "drawableRes", "setDrawableBottomWithSize", "drawable", "size", "setDrawableEnd", "setDrawableEndWithSize", "setDrawableStart", "setDrawableStartWithSize", "setDrawableTop", "setDrawableTopWithSize", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class TextViewExtensionsKt {
    @NotNull
    public static final TextWatcher addTextChangedListener(@NotNull TextView textView, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> beforeTextChanged, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> onTextChanged, @NotNull Function1<? super Editable, Unit> afterTextChanged) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(beforeTextChanged, "beforeTextChanged");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        TextViewExtensionsKt$addTextChangedListener$listener$1 textViewExtensionsKt$addTextChangedListener$listener$1 = new TextViewExtensionsKt$addTextChangedListener$listener$1(onTextChanged, afterTextChanged, beforeTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$addTextChangedListener$listener$1);
        return textViewExtensionsKt$addTextChangedListener$listener$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, Function4 beforeTextChanged, Function4 onTextChanged, Function1 afterTextChanged, int i, Object obj) {
        if ((i & 1) != 0) {
            beforeTextChanged = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: com.common.support.utils.TextViewExtensionsKt.addTextChangedListener.1
                public final void invoke(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onTextChanged = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: com.common.support.utils.TextViewExtensionsKt.addTextChangedListener.2
                public final void invoke(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            afterTextChanged = new Function1<Editable, Unit>() { // from class: com.common.support.utils.TextViewExtensionsKt.addTextChangedListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Editable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    invoke2(editable);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(beforeTextChanged, "beforeTextChanged");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        TextViewExtensionsKt$addTextChangedListener$listener$1 textViewExtensionsKt$addTextChangedListener$listener$1 = new TextViewExtensionsKt$addTextChangedListener$listener$1(onTextChanged, afterTextChanged, beforeTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$addTextChangedListener$listener$1);
        return textViewExtensionsKt$addTextChangedListener$listener$1;
    }

    @NotNull
    public static final TextWatcher afterTextChanged(@NotNull TextView textView, @NotNull Function1<? super Editable, Unit> afterTextChanged) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        TextViewExtensionsKt$afterTextChanged$listener$1 textViewExtensionsKt$afterTextChanged$listener$1 = new TextViewExtensionsKt$afterTextChanged$listener$1(afterTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$afterTextChanged$listener$1);
        return textViewExtensionsKt$afterTextChanged$listener$1;
    }

    public static /* synthetic */ TextWatcher afterTextChanged$default(TextView textView, Function1 afterTextChanged, int i, Object obj) {
        if ((i & 1) != 0) {
            afterTextChanged = new Function1<Editable, Unit>() { // from class: com.common.support.utils.TextViewExtensionsKt.afterTextChanged.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Editable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Editable editable) {
                    invoke2(editable);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(afterTextChanged, "afterTextChanged");
        TextViewExtensionsKt$afterTextChanged$listener$1 textViewExtensionsKt$afterTextChanged$listener$1 = new TextViewExtensionsKt$afterTextChanged$listener$1(afterTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$afterTextChanged$listener$1);
        return textViewExtensionsKt$afterTextChanged$listener$1;
    }

    @NotNull
    public static final TextWatcher beforeTextChanged(@NotNull TextView textView, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> beforeTextChanged) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(beforeTextChanged, "beforeTextChanged");
        TextViewExtensionsKt$beforeTextChanged$listener$1 textViewExtensionsKt$beforeTextChanged$listener$1 = new TextViewExtensionsKt$beforeTextChanged$listener$1(beforeTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$beforeTextChanged$listener$1);
        return textViewExtensionsKt$beforeTextChanged$listener$1;
    }

    public static /* synthetic */ TextWatcher beforeTextChanged$default(TextView textView, Function4 beforeTextChanged, int i, Object obj) {
        if ((i & 1) != 0) {
            beforeTextChanged = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: com.common.support.utils.TextViewExtensionsKt.beforeTextChanged.1
                public final void invoke(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(beforeTextChanged, "beforeTextChanged");
        TextViewExtensionsKt$beforeTextChanged$listener$1 textViewExtensionsKt$beforeTextChanged$listener$1 = new TextViewExtensionsKt$beforeTextChanged$listener$1(beforeTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$beforeTextChanged$listener$1);
        return textViewExtensionsKt$beforeTextChanged$listener$1;
    }

    public static final void copy(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("id", textView.getText()));
    }

    @Nullable
    public static final Drawable getCompoundDrawableBottom(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getCompoundDrawablesRelative()[3];
    }

    @Nullable
    public static final Drawable getCompoundDrawableEnd(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getCompoundDrawablesRelative()[2];
    }

    @Nullable
    public static final Drawable getCompoundDrawableStart(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getCompoundDrawablesRelative()[0];
    }

    @Nullable
    public static final Drawable getCompoundDrawableTop(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return textView.getCompoundDrawablesRelative()[1];
    }

    @NotNull
    public static final TextWatcher onTextChanged(@NotNull TextView textView, @NotNull Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> onTextChanged) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        TextViewExtensionsKt$onTextChanged$listener$1 textViewExtensionsKt$onTextChanged$listener$1 = new TextViewExtensionsKt$onTextChanged$listener$1(onTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$onTextChanged$listener$1);
        return textViewExtensionsKt$onTextChanged$listener$1;
    }

    public static /* synthetic */ TextWatcher onTextChanged$default(TextView textView, Function4 onTextChanged, int i, Object obj) {
        if ((i & 1) != 0) {
            onTextChanged = new Function4<CharSequence, Integer, Integer, Integer, Unit>() { // from class: com.common.support.utils.TextViewExtensionsKt.onTextChanged.1
                public final void invoke(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
                    invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        TextViewExtensionsKt$onTextChanged$listener$1 textViewExtensionsKt$onTextChanged$listener$1 = new TextViewExtensionsKt$onTextChanged$listener$1(onTextChanged);
        textView.addTextChangedListener(textViewExtensionsKt$onTextChanged$listener$1);
        return textViewExtensionsKt$onTextChanged$listener$1;
    }

    public static final void setCompoundDrawableBottom(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], drawable);
    }

    public static final void setCompoundDrawableEnd(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], textView.getCompoundDrawablesRelative()[1], drawable, textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void setCompoundDrawableStart(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void setCompoundDrawableTop(@NotNull TextView textView, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], drawable, textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void setDrawableBottom(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, i);
    }

    public static final void setDrawableBottomWithSize(@NotNull TextView textView, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Drawable drawable = textView.getCompoundDrawablesRelative()[0];
        Drawable drawable2 = textView.getCompoundDrawablesRelative()[1];
        Drawable drawable3 = textView.getCompoundDrawablesRelative()[2];
        Resources resources = textView.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        Drawable drawable4 = null;
        Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i, null);
        if (drawableOooO00o != null) {
            drawableOooO00o.setBounds(0, 0, i2, i2);
            Unit unit = Unit.INSTANCE;
            drawable4 = drawableOooO00o;
        }
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static final void setDrawableEnd(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }

    public static final void setDrawableEndWithSize(@NotNull TextView textView, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Drawable drawable = textView.getCompoundDrawablesRelative()[0];
        Drawable drawable2 = textView.getCompoundDrawablesRelative()[1];
        Resources resources = textView.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        Drawable drawable3 = null;
        Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i, null);
        if (drawableOooO00o != null) {
            drawableOooO00o.setBounds(0, 0, i2, i2);
            Unit unit = Unit.INSTANCE;
            drawable3 = drawableOooO00o;
        }
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void setDrawableStart(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public static final void setDrawableStartWithSize(@NotNull TextView textView, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Resources resources = textView.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        Drawable drawable = null;
        Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i, null);
        if (drawableOooO00o != null) {
            drawableOooO00o.setBounds(0, 0, i2, i2);
            Unit unit = Unit.INSTANCE;
            drawable = drawableOooO00o;
        }
        textView.setCompoundDrawablesRelative(drawable, textView.getCompoundDrawablesRelative()[1], textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void setDrawableTop(@NotNull TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i, 0, 0);
    }

    public static final void setDrawableTopWithSize(@NotNull TextView textView, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Drawable drawable = textView.getCompoundDrawablesRelative()[0];
        Resources resources = textView.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
        Drawable drawable2 = null;
        Drawable drawableOooO00o = androidx.core.content.res.OooO00o.C0119OooO00o.OooO00o(resources, i, null);
        if (drawableOooO00o != null) {
            drawableOooO00o.setBounds(0, 0, i2, i2);
            Unit unit = Unit.INSTANCE;
            drawable2 = drawableOooO00o;
        }
        textView.setCompoundDrawablesRelative(drawable, drawable2, textView.getCompoundDrawablesRelative()[2], textView.getCompoundDrawablesRelative()[3]);
    }

    public static final void copy(@NotNull TextView textView, @NotNull String value) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("id", value));
    }
}
