package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0OO00OO;
import p587o0oOooOO.l0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "selected", "", "setSelectedGift", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "getData", "Landroidx/lifecycle/LifecycleOwner;", "OooO0oo", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGiftView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftView.kt\ncom/yalla/yalla/ui/view/GiftView\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,327:1\n163#2,6:328\n*S KotlinDebug\n*F\n+ 1 GiftView.kt\ncom/yalla/yalla/ui/view/GiftView\n*L\n184#1:328,6\n*E\n"})
public final class GiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f29921OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OO00OO f29922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public String f29923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f29924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public String f29925OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LifecycleOwner lifecycleOwner;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setNewGift$lambda$0(GiftView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(2);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setAnimationListener(new l0(this$0));
        this$0.f29922OooO0Oo.f44580OooO0OO.startAnimation(scaleAnimation);
    }

    @Nullable
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final GiftPropModel getF29924OooO0o0() {
        return this.f29924OooO0o0;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

    public final void setSelectedGift(boolean selected) {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null) {
            o0OO00OO o0oo00oo2 = this.f29922OooO0Oo;
            if (!selected) {
                View selectBg = o0oo00oo2.f44577OooO;
                Intrinsics.checkNotNullExpressionValue(selectBg, "selectBg");
                o000O.OooO0OO(selectBg);
                boolean zIsBlank = StringsKt.isBlank(this.f29923OooO0o);
                SVGAView sVGAView = o0oo00oo2.f44580OooO0OO;
                if (zIsBlank) {
                    sVGAView.clearAnimation();
                } else {
                    sVGAView.OooOO0O(this.f29925OooO0oO, lifecycleOwner);
                }
                if (this.f29921OooO) {
                    LinearLayoutCompat layoutGiftBackpackTimeTag = o0oo00oo2.f44584OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(layoutGiftBackpackTimeTag, "layoutGiftBackpackTimeTag");
                    o000O.OooOOOO(layoutGiftBackpackTimeTag);
                    return;
                }
                return;
            }
            View selectBg2 = o0oo00oo2.f44577OooO;
            Intrinsics.checkNotNullExpressionValue(selectBg2, "selectBg");
            o000O.OooOOOO(selectBg2);
            boolean zIsBlank2 = StringsKt.isBlank(this.f29923OooO0o);
            SVGAView sVGAView2 = o0oo00oo2.f44580OooO0OO;
            if (zIsBlank2) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300L);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setRepeatCount(Integer.MAX_VALUE);
                scaleAnimation.setInterpolator(new AccelerateInterpolator());
                sVGAView2.startAnimation(scaleAnimation);
            } else {
                sVGAView2.clearAnimation();
                sVGAView2.OooOO0O(this.f29923OooO0o, lifecycleOwner);
                sVGAView2.OooOO0o();
            }
            LinearLayoutCompat layoutGiftBackpackTimeTag2 = o0oo00oo2.f44584OooO0oO;
            Intrinsics.checkNotNullExpressionValue(layoutGiftBackpackTimeTag2, "layoutGiftBackpackTimeTag");
            o000O.OooO0O0(layoutGiftBackpackTimeTag2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        o0OO00OO o0oo00ooInflate = o0OO00OO.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oo00ooInflate, "inflate(...)");
        this.f29922OooO0Oo = o0oo00ooInflate;
        this.f29923OooO0o = "";
        this.f29925OooO0oO = "";
    }
}
