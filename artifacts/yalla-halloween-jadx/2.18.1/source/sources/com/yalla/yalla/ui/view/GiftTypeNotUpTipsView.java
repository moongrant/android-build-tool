package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.GiftPropTypeUser;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.xi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR?\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftTypeNotUpTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Oooo0oO", "I", "getType", "()I", "setType", "(I)V", "type", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "Oooo0oo", "Lkotlin/jvm/functions/Function1;", "getViewListener", "()Lkotlin/jvm/functions/Function1;", "setViewListener", "(Lkotlin/jvm/functions/Function1;)V", "viewListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftTypeNotUpTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final xi f24815Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> viewListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            Integer num;
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            int type = GiftTypeNotUpTipsView.this.getType();
            if (type == GiftPropTypeUser.Member.getValue()) {
                num = 1;
            } else if (type == GiftPropTypeUser.Premium.getValue()) {
                num = 2;
            } else {
                num = type == GiftPropTypeUser.Vip.getValue() ? 3 : null;
            }
            if (num != null) {
                OooOo.OooO0OO("102213", MapsKt.hashMapOf(new Pair("target", Integer.valueOf(num.intValue()))));
            }
            Function1<Integer, Unit> viewListener = GiftTypeNotUpTipsView.this.getViewListener();
            if (viewListener != null) {
                viewListener.invoke(Integer.valueOf(GiftTypeNotUpTipsView.this.getType()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTypeNotUpTipsView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Function1<Integer, Unit> getViewListener() {
        return this.viewListener;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setViewListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.viewListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTypeNotUpTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTypeNotUpTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        xi xiVarInflate = xi.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(xiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24815Oooo0o = xiVarInflate;
        this.type = GiftPropTypeUser.Hot.getValue();
        ConstraintLayout constraintLayout = xiVarInflate.f50985OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o00O0O.OooO0Oo(constraintLayout, new OooO00o());
    }
}
