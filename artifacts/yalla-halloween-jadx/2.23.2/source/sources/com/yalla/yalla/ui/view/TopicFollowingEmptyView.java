package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.ooo0Oo0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/view/TopicFollowingEmptyView;", "Landroid/widget/LinearLayout;", "Lo0Oo0OOO/ooo0Oo0;", "OooO0Oo", "Lo0Oo0OOO/ooo0Oo0;", "getBinding", "()Lo0Oo0OOO/ooo0Oo0;", "binding", "Lkotlin/Function0;", "", "OooO0o0", "Lkotlin/jvm/functions/Function0;", "getButtonListener", "()Lkotlin/jvm/functions/Function0;", "setButtonListener", "(Lkotlin/jvm/functions/Function0;)V", "buttonListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TopicFollowingEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ooo0Oo0 binding;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> buttonListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> buttonListener = TopicFollowingEmptyView.this.getButtonListener();
            if (buttonListener != null) {
                buttonListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowingEmptyView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ooo0Oo0 getBinding() {
        return this.binding;
    }

    @Nullable
    public final Function0<Unit> getButtonListener() {
        return this.buttonListener;
    }

    public final void setButtonListener(@Nullable Function0<Unit> function0) {
        this.buttonListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowingEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TopicFollowingEmptyView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowingEmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ooo0Oo0 ooo0oo0Inflate = ooo0Oo0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ooo0oo0Inflate, "inflate(...)");
        this.binding = ooo0oo0Inflate;
        ooo0oo0Inflate.f45338OooO00o.setVisibility(0);
        ooo0oo0Inflate.f45341OooO0Oo.setImageResource(o0Oo0oo.ic_empty_message_system);
        ooo0oo0Inflate.f45340OooO0OO.setText(o0000.OooO0OO(o000000.null_topic));
        ooo0oo0Inflate.f45339OooO0O0.setText(o0000.OooO0OO(o000000.topic_find));
        Button button = ooo0oo0Inflate.f45339OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        o000O.OooOOOO(button);
        Button button2 = ooo0oo0Inflate.f45339OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        o000O.OooO(button2, new OooO00o());
    }
}
