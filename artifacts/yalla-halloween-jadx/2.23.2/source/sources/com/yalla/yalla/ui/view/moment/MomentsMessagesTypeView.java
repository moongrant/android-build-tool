package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oOOO0O0o;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p573o0oOoOO.o0O0o0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentsMessagesTypeView;", "Landroid/widget/LinearLayout;", "", "getTitleName", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Landroid/graphics/drawable/Drawable;", "OooO0Oo", "Lkotlin/Lazy;", "getDrawableBottom", "()Landroid/graphics/drawable/Drawable;", "drawableBottom", "OooO0o0", "getDrawableTop", "drawableTop", "OooO0oO", "I", "getSelectType", "()I", "setSelectType", "(I)V", "selectType", "Landroid/widget/TextView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OooOO0", "Landroid/widget/TextView;", "getTitleContent", "()Landroid/widget/TextView;", "setTitleContent", "(Landroid/widget/TextView;)V", "titleContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MomentsMessagesTypeView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f30619OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy drawableBottom;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f30621OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy drawableTop;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public int selectType;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList<TextView> f30624OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView titleContent;

    public static final class OooO extends o0OOOO0o {
        public OooO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentsMessagesTypeView momentsMessagesTypeView = MomentsMessagesTypeView.this;
            MomentsMessagesTypeView.OooO0O0(momentsMessagesTypeView, !momentsMessagesTypeView.f30621OooO0o);
            if (momentsMessagesTypeView.f30621OooO0o) {
                MomentsMessagesTypeView.OooO00o(momentsMessagesTypeView, momentsMessagesTypeView.getSelectType());
            }
        }
    }

    public static final class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f30628OooO0oo;

        public OooO00o(int i) {
            this.f30628OooO0oo = i;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            int i = this.f30628OooO0oo;
            MomentsMessagesTypeView momentsMessagesTypeView = MomentsMessagesTypeView.this;
            MomentsMessagesTypeView.OooO00o(momentsMessagesTypeView, i);
            MomentsMessagesTypeView.OooO0O0(momentsMessagesTypeView, false);
            Function1<? super Integer, Unit> function1 = momentsMessagesTypeView.f30619OooO;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(momentsMessagesTypeView.getSelectType()));
            }
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentsMessagesTypeView.OooO0O0(MomentsMessagesTypeView.this, false);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Drawable> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f30630OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() {
            return o0000.OooO0O0(o0Oo0oo.ucrop_triangle_bottom);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Drawable> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f30631OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() {
            return o0000.OooO0O0(o0Oo0oo.ucrop_triangle_top);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesTypeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO00o(MomentsMessagesTypeView momentsMessagesTypeView, int i) {
        momentsMessagesTypeView.selectType = i;
        ArrayList<TextView> arrayList = momentsMessagesTypeView.f30624OooO0oo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = arrayList.get(i2);
            Intrinsics.checkNotNullExpressionValue(textView, "get(...)");
            TextView textView2 = textView;
            textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_65));
            textView2.setBackground(o0000.OooO0O0(o0Oo0oo.bg_05333333_r16));
            if (i2 == i) {
                textView2.setTextColor(o0000.OooO00o(o0OOO0o.white));
                textView2.setBackground(o0000.OooO0O0(o0Oo0oo.bg_00d8c9_r16));
            }
        }
    }

    public static final void OooO0O0(MomentsMessagesTypeView momentsMessagesTypeView, boolean z) {
        momentsMessagesTypeView.f30621OooO0o = z;
        if (z) {
            momentsMessagesTypeView.setVisibility(0);
            TextView textView = momentsMessagesTypeView.titleContent;
            if (textView != null) {
                o0O0o0.OooO0O0(textView, momentsMessagesTypeView.getDrawableTop(), momentsMessagesTypeView.getTitleName(), ViewLocation.end, OooOo00.OooO0o0());
                return;
            }
            return;
        }
        momentsMessagesTypeView.setVisibility(8);
        TextView textView2 = momentsMessagesTypeView.titleContent;
        if (textView2 != null) {
            o0O0o0.OooO0O0(textView2, momentsMessagesTypeView.getDrawableBottom(), momentsMessagesTypeView.getTitleName(), ViewLocation.end, OooOo00.OooO0o0());
        }
    }

    private final Drawable getDrawableBottom() {
        return (Drawable) this.drawableBottom.getValue();
    }

    private final Drawable getDrawableTop() {
        return (Drawable) this.drawableTop.getValue();
    }

    private final String getTitleName() {
        int i = o000000.moment_notification_type_all;
        String strOooO0OO = o0000.OooO0OO(i);
        int i2 = this.selectType;
        if (i2 == 0) {
            return o0000.OooO0OO(i);
        }
        if (i2 == 1) {
            return o0000.OooO0OO(o000000.Likes);
        }
        if (i2 == 2) {
            return o0000.OooO0OO(o000000.Comments);
        }
        if (i2 == 3) {
            return o0000.OooO0OO(o000000.moment_notification_type_at);
        }
        if (i2 == 4) {
            return o0000.OooO0OO(o000000.Gifts);
        }
        return i2 == 5 ? o0000.OooO0OO(o000000.Other) : strOooO0OO;
    }

    public final int getSelectType() {
        return this.selectType;
    }

    @Nullable
    public final TextView getTitleContent() {
        return this.titleContent;
    }

    public final void setListener(@Nullable Function1<? super Integer, Unit> listener) {
        this.f30619OooO = listener;
    }

    public final void setSelectType(int i) {
        this.selectType = i;
    }

    public final void setTitleContent(@Nullable TextView textView) {
        if (textView != null) {
            textView.setOnClickListener(new OooO());
            o0O0o0.OooO0O0(textView, getDrawableBottom(), o0000.OooO0OO(o000000.moment_notification_type_all), ViewLocation.end, OooOo00.OooO0o0());
        }
        this.titleContent = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesTypeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentsMessagesTypeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesTypeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        oOOO0O0o oooo0o0oInflate = oOOO0O0o.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(oooo0o0oInflate, "inflate(...)");
        this.drawableBottom = LazyKt.lazy(OooO0OO.f30630OooO0Oo);
        this.drawableTop = LazyKt.lazy(OooO0o.f30631OooO0Oo);
        this.selectType = 0;
        ArrayList<TextView> arrayList = new ArrayList<>();
        this.f30624OooO0oo = arrayList;
        arrayList.add(oooo0o0oInflate.f45160OooO0O0);
        arrayList.add(oooo0o0oInflate.f45163OooO0o);
        arrayList.add(oooo0o0oInflate.f45162OooO0Oo);
        arrayList.add(oooo0o0oInflate.f45161OooO0OO);
        arrayList.add(oooo0o0oInflate.f45164OooO0o0);
        arrayList.add(oooo0o0oInflate.f45165OooO0oO);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = this.f30624OooO0oo.get(i2);
            Intrinsics.checkNotNullExpressionValue(textView, "get(...)");
            textView.setOnClickListener(new OooO00o(i2));
        }
        setOnClickListener(new OooO0O0());
    }
}
