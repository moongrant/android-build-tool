package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeTips;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.c3;
import p511o0o0O.o00000OO;
import p558o0oOOooo.oO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010A\u001a\u00020@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\b\b\u0002\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R2\u0010/\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R2\u00107\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R2\u0010;\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010*\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R2\u0010?\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.¨\u0006H"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftTopTipsView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "gift", "", "setData", "Lo0o0O/o00000OO;", "OooO0o0", "Lo0o0O/o00000OO;", "getDialog", "()Lo0o0O/o00000OO;", "setDialog", "(Lo0o0O/o00000OO;)V", "dialog", "Lcom/yalla/yalla/ui/view/gift/GiftBlindTipsView;", "OooO0oo", "Lcom/yalla/yalla/ui/view/gift/GiftBlindTipsView;", "getGiftBlindView", "()Lcom/yalla/yalla/ui/view/gift/GiftBlindTipsView;", "giftBlindView", "Lcom/yalla/yalla/ui/view/gift/GiftTypeNotUpTipsView;", "OooO", "Lcom/yalla/yalla/ui/view/gift/GiftTypeNotUpTipsView;", "getGiftTypeNotUpView", "()Lcom/yalla/yalla/ui/view/gift/GiftTypeNotUpTipsView;", "giftTypeNotUpView", "Lcom/yalla/yalla/ui/view/gift/GiftCustomMadeTipsView;", "OooOO0", "Lcom/yalla/yalla/ui/view/gift/GiftCustomMadeTipsView;", "getGiftCustomMadeView", "()Lcom/yalla/yalla/ui/view/gift/GiftCustomMadeTipsView;", "giftCustomMadeView", "Lkotlin/Function0;", "OooOOO0", "Lkotlin/jvm/functions/Function0;", "getGiftWeekStarClickListener", "()Lkotlin/jvm/functions/Function0;", "setGiftWeekStarClickListener", "(Lkotlin/jvm/functions/Function0;)V", "giftWeekStarClickListener", "Lkotlin/Function1;", "OooOOO", "Lkotlin/jvm/functions/Function1;", "getGiftBlindClickListener", "()Lkotlin/jvm/functions/Function1;", "setGiftBlindClickListener", "(Lkotlin/jvm/functions/Function1;)V", "giftBlindClickListener", "OooOOOO", "getGiftTypeNotUpClickListener", "setGiftTypeNotUpClickListener", "giftTypeNotUpClickListener", "OooOOOo", "getGiftCustomMadeClickListener", "setGiftCustomMadeClickListener", "giftCustomMadeClickListener", "OooOOo0", "getGiftNewClickListener", "setGiftNewClickListener", "giftNewClickListener", "OooOOo", "getGiftMergeClickListener", "setGiftMergeClickListener", "giftMergeClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftTopTipsView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GiftTypeNotUpTipsView giftTypeNotUpView;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final c3 f30468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public GiftPropModel f30469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o00000OO dialog;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final GiftWeekStarTipsView f30471OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GiftBlindTipsView giftBlindView;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GiftCustomMadeTipsView giftCustomMadeView;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final GiftTipsViewMerge f30474OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final GiftNewTipsView f30475OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> giftBlindClickListener;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> giftWeekStarClickListener;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> giftTypeNotUpClickListener;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> giftCustomMadeClickListener;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> giftMergeClickListener;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> giftNewClickListener;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000OO dialog = GiftTopTipsView.this.getDialog();
            if (dialog != null) {
                dialog.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<GiftPropModel, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GiftPropModel giftPropModel) {
            GiftPropModel giftPropModel2 = giftPropModel;
            Function1<GiftPropModel, Unit> giftCustomMadeClickListener = GiftTopTipsView.this.getGiftCustomMadeClickListener();
            if (giftCustomMadeClickListener != null) {
                giftCustomMadeClickListener.invoke(giftPropModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<GiftPropModel, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GiftPropModel giftPropModel) {
            GiftPropModel giftPropModel2 = giftPropModel;
            o0oo0000.OooO00o.OooO0OO("102319", MapsKt.hashMapOf(new Pair("source", 2)));
            Function1<GiftPropModel, Unit> giftNewClickListener = GiftTopTipsView.this.getGiftNewClickListener();
            if (giftNewClickListener != null) {
                giftNewClickListener.invoke(giftPropModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<GiftPropModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GiftPropModel giftPropModel) {
            GiftPropModel giftPropModel2 = giftPropModel;
            Function1<GiftPropModel, Unit> giftMergeClickListener = GiftTopTipsView.this.getGiftMergeClickListener();
            if (giftMergeClickListener != null) {
                giftMergeClickListener.invoke(giftPropModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000OO dialog = GiftTopTipsView.this.getDialog();
            if (dialog != null) {
                dialog.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000OO dialog = GiftTopTipsView.this.getDialog();
            if (dialog != null) {
                dialog.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000OO dialog = GiftTopTipsView.this.getDialog();
            if (dialog != null) {
                dialog.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000OO dialog = GiftTopTipsView.this.getDialog();
            if (dialog != null) {
                dialog.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<View, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o00000OO dialog = GiftTopTipsView.this.getDialog();
            if (dialog != null) {
                dialog.OooO0OO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> giftWeekStarClickListener = GiftTopTipsView.this.getGiftWeekStarClickListener();
            if (giftWeekStarClickListener != null) {
                giftWeekStarClickListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<View, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> giftTypeNotUpClickListener = GiftTopTipsView.this.getGiftTypeNotUpClickListener();
            if (giftTypeNotUpClickListener != null) {
                giftTypeNotUpClickListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<GiftPropModel, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(GiftPropModel giftPropModel) {
            GiftPropModel giftPropModel2 = giftPropModel;
            Function1<GiftPropModel, Unit> giftBlindClickListener = GiftTopTipsView.this.getGiftBlindClickListener();
            if (giftBlindClickListener != null) {
                giftBlindClickListener.invoke(giftPropModel2);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class Oooo000 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeTips.values().length];
            try {
                iArr[GiftPropTypeTips.GiftMerge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeTips.GiftBlind.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftPropTypeTips.GiftTypeNotUp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftPropTypeTips.GiftCustomMade.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GiftPropTypeTips.Default.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTopTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(ConstraintLayout constraintLayout) {
        c3 c3Var = this.f30468OooO0Oo;
        int childCount = c3Var.f43768OooO0oo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c3Var.f43768OooO0oo.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            o000O.OooO0O0(childAt);
        }
        if (constraintLayout != null) {
            o000O.OooOOOO(constraintLayout);
        }
    }

    @Nullable
    public final o00000OO getDialog() {
        return this.dialog;
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getGiftBlindClickListener() {
        return this.giftBlindClickListener;
    }

    @NotNull
    public final GiftBlindTipsView getGiftBlindView() {
        return this.giftBlindView;
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getGiftCustomMadeClickListener() {
        return this.giftCustomMadeClickListener;
    }

    @NotNull
    public final GiftCustomMadeTipsView getGiftCustomMadeView() {
        return this.giftCustomMadeView;
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getGiftMergeClickListener() {
        return this.giftMergeClickListener;
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getGiftNewClickListener() {
        return this.giftNewClickListener;
    }

    @Nullable
    public final Function0<Unit> getGiftTypeNotUpClickListener() {
        return this.giftTypeNotUpClickListener;
    }

    @NotNull
    public final GiftTypeNotUpTipsView getGiftTypeNotUpView() {
        return this.giftTypeNotUpView;
    }

    @Nullable
    public final Function0<Unit> getGiftWeekStarClickListener() {
        return this.giftWeekStarClickListener;
    }

    public final void setData(@Nullable GiftPropModel gift) {
        RoomUserInfoModel roomUserInfoModel;
        MutableStateFlow<String> userName;
        this.f30469OooO0o = gift;
        c3 c3Var = this.f30468OooO0Oo;
        c3Var.f43762OooO0O0.setData(gift);
        c3Var.f43766OooO0o0.setData(gift);
        o00000OO o00000oo2 = this.dialog;
        String receiveUserName = o0OoOo0.OooOOO((o00000oo2 == null || (roomUserInfoModel = o00000oo2.f50966OooOOOO) == null || (userName = roomUserInfoModel.getUserName()) == null) ? null : userName.getValue(), "");
        GiftTipsViewMerge giftTipsViewMerge = c3Var.f43764OooO0Oo;
        giftTipsViewMerge.getClass();
        Intrinsics.checkNotNullParameter(receiveUserName, "receiveUserName");
        giftTipsViewMerge.f30465OooO0o0 = gift;
        if (gift != null) {
            gift.isMerge(new oO0O00O(giftTipsViewMerge, gift, receiveUserName));
        }
    }

    public final void setDialog(@Nullable o00000OO o00000oo2) {
        this.dialog = o00000oo2;
    }

    public final void setGiftBlindClickListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.giftBlindClickListener = function1;
    }

    public final void setGiftCustomMadeClickListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.giftCustomMadeClickListener = function1;
    }

    public final void setGiftMergeClickListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.giftMergeClickListener = function1;
    }

    public final void setGiftNewClickListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.giftNewClickListener = function1;
    }

    public final void setGiftTypeNotUpClickListener(@Nullable Function0<Unit> function0) {
        this.giftTypeNotUpClickListener = function0;
    }

    public final void setGiftWeekStarClickListener(@Nullable Function0<Unit> function0) {
        this.giftWeekStarClickListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTopTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftTopTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTopTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        c3 c3VarInflate = c3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c3VarInflate, "inflate(...)");
        this.f30468OooO0Oo = c3VarInflate;
        GiftWeekStarTipsView giftWeekStar = c3VarInflate.f43767OooO0oO;
        Intrinsics.checkNotNullExpressionValue(giftWeekStar, "giftWeekStar");
        this.f30471OooO0oO = giftWeekStar;
        GiftBlindTipsView giftBlind = c3VarInflate.f43762OooO0O0;
        Intrinsics.checkNotNullExpressionValue(giftBlind, "giftBlind");
        this.giftBlindView = giftBlind;
        GiftTypeNotUpTipsView giftTypeNotUp = c3VarInflate.f43765OooO0o;
        Intrinsics.checkNotNullExpressionValue(giftTypeNotUp, "giftTypeNotUp");
        this.giftTypeNotUpView = giftTypeNotUp;
        GiftCustomMadeTipsView giftCustomMade = c3VarInflate.f43763OooO0OO;
        Intrinsics.checkNotNullExpressionValue(giftCustomMade, "giftCustomMade");
        this.giftCustomMadeView = giftCustomMade;
        GiftTipsViewMerge giftMerge = c3VarInflate.f43764OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(giftMerge, "giftMerge");
        this.f30474OooOO0O = giftMerge;
        GiftNewTipsView giftNew = c3VarInflate.f43766OooO0o0;
        Intrinsics.checkNotNullExpressionValue(giftNew, "giftNew");
        this.f30475OooOO0o = giftNew;
        LinearLayoutCompat layoutRoot = c3VarInflate.f43768OooO0oo;
        Intrinsics.checkNotNullExpressionValue(layoutRoot, "layoutRoot");
        o000O.OooO(layoutRoot, new OooO0o());
        GiftWeekStarTipsView giftWeekStar2 = c3VarInflate.f43767OooO0oO;
        Intrinsics.checkNotNullExpressionValue(giftWeekStar2, "giftWeekStar");
        o000O.OooO(giftWeekStar2, new OooO());
        GiftBlindTipsView giftBlind2 = c3VarInflate.f43762OooO0O0;
        Intrinsics.checkNotNullExpressionValue(giftBlind2, "giftBlind");
        o000O.OooO(giftBlind2, new OooOO0());
        GiftCustomMadeTipsView giftCustomMade2 = c3VarInflate.f43763OooO0OO;
        Intrinsics.checkNotNullExpressionValue(giftCustomMade2, "giftCustomMade");
        o000O.OooO(giftCustomMade2, new OooOO0O());
        GiftTipsViewMerge giftMerge2 = c3VarInflate.f43764OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(giftMerge2, "giftMerge");
        o000O.OooO(giftMerge2, new OooOOO0());
        GiftNewTipsView giftNew2 = c3VarInflate.f43766OooO0o0;
        Intrinsics.checkNotNullExpressionValue(giftNew2, "giftNew");
        o000O.OooO(giftNew2, new OooOOO());
        c3VarInflate.f43767OooO0oO.setViewClickListener(new OooOOOO());
        c3VarInflate.f43762OooO0O0.setBlindDetailListener(new OooOo00());
        GiftTypeNotUpTipsView giftTypeNotUp2 = c3VarInflate.f43765OooO0o;
        Intrinsics.checkNotNullExpressionValue(giftTypeNotUp2, "giftTypeNotUp");
        o000O.OooO(giftTypeNotUp2, new OooOo());
        c3VarInflate.f43763OooO0OO.setShowCustomMadeGiftListener(new OooO00o());
        c3VarInflate.f43766OooO0o0.setViewClickListener(new OooO0O0());
        c3VarInflate.f43764OooO0Oo.setViewClickListener(new OooO0OO());
    }
}
