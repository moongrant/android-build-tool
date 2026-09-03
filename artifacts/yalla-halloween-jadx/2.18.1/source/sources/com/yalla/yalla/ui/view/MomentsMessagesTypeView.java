package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.framework.view.textView.ViewLocation;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
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
import p152o00Oo0o0.o00Oo00;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p649o0ooOOoo.fe;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentsMessagesTypeView;", "Landroid/widget/LinearLayout;", "", "getTitleName", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Landroid/graphics/drawable/Drawable;", "Oooo0o", "Lkotlin/Lazy;", "getDrawableBottom", "()Landroid/graphics/drawable/Drawable;", "drawableBottom", "Oooo0oO", "getDrawableTop", "drawableTop", "Oooo", "I", "getSelectType", "()I", "setSelectType", "(I)V", "selectType", "Landroid/widget/TextView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OoooO0O", "Landroid/widget/TextView;", "getTitleContent", "()Landroid/widget/TextView;", "setTitleContent", "(Landroid/widget/TextView;)V", "titleContent", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentsMessagesTypeView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    public int selectType;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy drawableBottom;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy drawableTop;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f25011Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f25012OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final ArrayList<TextView> f25013OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView titleContent;

    public static final class OooO extends o00Oo0 {
        public OooO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentsMessagesTypeView momentsMessagesTypeView = MomentsMessagesTypeView.this;
            MomentsMessagesTypeView.OooO0O0(momentsMessagesTypeView, !momentsMessagesTypeView.f25011Oooo0oo);
            MomentsMessagesTypeView momentsMessagesTypeView2 = MomentsMessagesTypeView.this;
            if (momentsMessagesTypeView2.f25011Oooo0oo) {
                MomentsMessagesTypeView.OooO00o(momentsMessagesTypeView2, momentsMessagesTypeView2.getSelectType());
            }
        }
    }

    public static final class OooO00o extends o00Oo0 {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f25017OoooO00;

        public OooO00o(int i) {
            this.f25017OoooO00 = i;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentsMessagesTypeView.OooO00o(MomentsMessagesTypeView.this, this.f25017OoooO00);
            MomentsMessagesTypeView.OooO0O0(MomentsMessagesTypeView.this, false);
            MomentsMessagesTypeView momentsMessagesTypeView = MomentsMessagesTypeView.this;
            Function1<? super Integer, Unit> function1 = momentsMessagesTypeView.f25012OoooO0;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(momentsMessagesTypeView.getSelectType()));
            }
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentsMessagesTypeView.OooO0O0(MomentsMessagesTypeView.this, false);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Drawable> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f25019Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() {
            return OooOOO.OooO0O0(R.drawable.icon_triangle_bottom);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Drawable> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f25020Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Drawable invoke() {
            return OooOOO.OooO0O0(R.drawable.icon_triangle_top);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesTypeView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO00o(MomentsMessagesTypeView momentsMessagesTypeView, int i) {
        momentsMessagesTypeView.selectType = i;
        int size = momentsMessagesTypeView.f25013OoooO00.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = momentsMessagesTypeView.f25013OoooO00.get(i2);
            Intrinsics.checkNotNullExpressionValue(textView, "mTypeList[i]");
            TextView textView2 = textView;
            textView2.setTextColor(o000O0O0.OooO00o(R.color.color_333333));
            textView2.setBackground(OooOOO.OooO0O0(R.drawable.bgs_button_efefef_r6));
            if (i2 == i) {
                textView2.setTextColor(o000O0O0.OooO00o(R.color.white));
                textView2.setBackground(OooOOO.OooO0O0(R.drawable.bgs_button_green_r6));
            }
        }
    }

    public static final void OooO0O0(MomentsMessagesTypeView momentsMessagesTypeView, boolean z) {
        momentsMessagesTypeView.f25011Oooo0oo = z;
        if (z) {
            momentsMessagesTypeView.setVisibility(0);
            TextView textView = momentsMessagesTypeView.titleContent;
            if (textView != null) {
                o00Oo00.OooO0O0(textView, momentsMessagesTypeView.getDrawableTop(), momentsMessagesTypeView.getTitleName(), ViewLocation.end, oo000o.OooO0o0());
                return;
            }
            return;
        }
        momentsMessagesTypeView.setVisibility(8);
        TextView textView2 = momentsMessagesTypeView.titleContent;
        if (textView2 != null) {
            o00Oo00.OooO0O0(textView2, momentsMessagesTypeView.getDrawableBottom(), momentsMessagesTypeView.getTitleName(), ViewLocation.end, oo000o.OooO0o0());
        }
    }

    private final Drawable getDrawableBottom() {
        return (Drawable) this.drawableBottom.getValue();
    }

    private final Drawable getDrawableTop() {
        return (Drawable) this.drawableTop.getValue();
    }

    private final String getTitleName() {
        String strOooO0OO = o000O0O0.OooO0OO(R.string.moment_notification_type_all);
        int i = this.selectType;
        if (i == 0) {
            return o000O0O0.OooO0OO(R.string.moment_notification_type_all);
        }
        if (i == 1) {
            return o000O0O0.OooO0OO(R.string.moment_notification_type_like);
        }
        if (i == 2) {
            return o000O0O0.OooO0OO(R.string.moment_notification_type_comment);
        }
        if (i == 3) {
            return o000O0O0.OooO0OO(R.string.moment_notification_type_at);
        }
        if (i == 4) {
            return o000O0O0.OooO0OO(R.string.moment_notification_type_gifts);
        }
        return i == 5 ? o000O0O0.OooO0OO(R.string.Other) : strOooO0OO;
    }

    public final int getSelectType() {
        return this.selectType;
    }

    @Nullable
    public final TextView getTitleContent() {
        return this.titleContent;
    }

    public final void setListener(@Nullable Function1<? super Integer, Unit> listener) {
        this.f25012OoooO0 = listener;
    }

    public final void setSelectType(int i) {
        this.selectType = i;
    }

    public final void setTitleContent(@Nullable TextView textView) {
        if (textView != null) {
            textView.setOnClickListener(new OooO());
            o00Oo00.OooO0O0(textView, getDrawableBottom(), o000O0O0.OooO0OO(R.string.moment_notification_type_all), ViewLocation.end, oo000o.OooO0o0());
        }
        this.titleContent = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesTypeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentsMessagesTypeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        fe feVarInflate = fe.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(feVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.drawableBottom = LazyKt.lazy(OooO0OO.f25019Oooo0o);
        this.drawableTop = LazyKt.lazy(OooO0o.f25020Oooo0o);
        this.selectType = 0;
        ArrayList<TextView> arrayList = new ArrayList<>();
        this.f25013OoooO00 = arrayList;
        arrayList.add(feVarInflate.f49378OooO0O0);
        arrayList.add(feVarInflate.f49381OooO0o);
        arrayList.add(feVarInflate.f49380OooO0Oo);
        arrayList.add(feVarInflate.f49379OooO0OO);
        arrayList.add(feVarInflate.f49382OooO0o0);
        arrayList.add(feVarInflate.f49383OooO0oO);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            TextView textView = this.f25013OoooO00.get(i2);
            Intrinsics.checkNotNullExpressionValue(textView, "mTypeList[i]");
            textView.setOnClickListener(new OooO00o(i2));
        }
        setOnClickListener(new OooO0O0());
    }
}
