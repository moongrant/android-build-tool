package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000Oo0;
import p651o0ooOOoo.ui;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftRunWayNumberView;", "Landroid/widget/LinearLayout;", "", "string", "", "setNumber", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftRunWayNumberView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final ui f24832Oooo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayNumberView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setNumber(@Nullable String string) {
        ImageView imageView;
        removeAllViews();
        int i = 0;
        if (string == null || string.length() == 0) {
            return;
        }
        char[] charArray = string.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length;
        while (i < length) {
            if (i == 0) {
                imageView = this.f24832Oooo.f50764OooO0O0;
            } else if (i != 1) {
                imageView = i != 2 ? null : this.f24832Oooo.f50766OooO0Oo;
            } else {
                imageView = this.f24832Oooo.f50765OooO0OO;
            }
            if (imageView != null) {
                int iOooO0OO = o000Oo0.OooO0OO(String.valueOf(charArray[i]), 1);
                int i2 = R.drawable.icon_number_1;
                if (iOooO0OO != 0) {
                    switch (iOooO0OO) {
                        case 2:
                            i2 = R.drawable.icon_number_2;
                            break;
                        case 3:
                            i2 = R.drawable.icon_number_3;
                            break;
                        case 4:
                            i2 = R.drawable.icon_number_4;
                            break;
                        case 5:
                            i2 = R.drawable.icon_number_5;
                            break;
                        case 6:
                            i2 = R.drawable.icon_number_6;
                            break;
                        case 7:
                            i2 = R.drawable.icon_number_7;
                            break;
                        case 8:
                            i2 = R.drawable.icon_number_8;
                            break;
                        case 9:
                            i2 = R.drawable.icon_number_9;
                            break;
                    }
                } else {
                    i2 = R.drawable.icon_number_0;
                }
                imageView.setImageResource(i2);
            }
            i++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ui uiVarInflate = ui.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24832Oooo = uiVarInflate;
    }
}
