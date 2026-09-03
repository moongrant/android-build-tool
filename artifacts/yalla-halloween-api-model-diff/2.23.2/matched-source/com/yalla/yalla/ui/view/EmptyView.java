package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.EmptyView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O0O0O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/EmptyView;", "Landroid/widget/LinearLayout;", "", "resId", "", "setImage", "(Ljava/lang/Integer;)V", "", "content", "setText", "Lo0Oo0OOO/o0O0O0O;", "OooO0Oo", "Lo0Oo0OOO/o0O0O0O;", "getBinding", "()Lo0Oo0OOO/o0O0O0O;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class EmptyView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f29846OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0O0O0O binding;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f29848OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @DrawableRes
    @Nullable
    public Integer f29849OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f29850OooO0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.DataError.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.DataNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 com.yalla.yalla.ui.view.EmptyView$State[], still in use, count: 1, list:
      (r2v3 com.yalla.yalla.ui.view.EmptyView$State[]) from 0x001e: INVOKE (r2v3 com.yalla.yalla.ui.view.EmptyView$State[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:31)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/view/EmptyView$State;", "", "", "code", "I", "getCode", "()I", "DataError", "DataNull", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class State {
        DataError(-1),
        DataNull(0);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private final int code;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr);
        }

        public State(int i) {
            super(str, i);
            this.code = i;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO00o(EmptyView emptyView, final Function0 function0) {
        String strOooO0OO = o0000.OooO0OO(o000000.Try_again);
        emptyView.f29850OooO0oO = function0;
        boolean z = strOooO0OO == null || strOooO0OO.length() == 0;
        o0O0O0O o0o0o0o = emptyView.binding;
        if (z) {
            Button button = o0o0o0o.f44483OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            o000O.OooO0O0(button);
        } else {
            Button button2 = o0o0o0o.f44483OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button2, "button");
            o000O.OooOOOO(button2);
            Button button3 = o0o0o0o.f44483OooO0O0;
            button3.setText(strOooO0OO);
            button3.setOnClickListener(new View.OnClickListener() { // from class: o0oOooOO.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = EmptyView.f29846OooO0oo;
                    Function0 function1 = function0;
                    if (function1 != null) {
                        function1.invoke();
                    }
                }
            });
        }
    }

    public final void OooO0O0(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = OooO00o.$EnumSwitchMapping$0[state.ordinal()];
        boolean z = true;
        o0O0O0O o0o0o0o = this.binding;
        if (i == 1) {
            ImageView image = o0o0o0o.f44484OooO0OO;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            o000O.OooO0O0(image);
            TextView text = o0o0o0o.f44485OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(text, "text");
            o000O.OooOOOO(text);
            o0o0o0o.f44485OooO0Oo.setText(o0000.OooO0OO(o000000.Network_request_failed));
            if (this.f29850OooO0oO != null) {
                Button button = o0o0o0o.f44483OooO0O0;
                Intrinsics.checkNotNullExpressionValue(button, "button");
                o000O.OooOOOO(button);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        Integer num = this.f29849OooO0o0;
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView image2 = o0o0o0o.f44484OooO0OO;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            o000O.OooOOOO(image2);
            o0o0o0o.f44484OooO0OO.setImageResource(iIntValue);
        }
        String str = this.f29848OooO0o;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            TextView text2 = o0o0o0o.f44485OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(text2, "text");
            o000O.OooOOOO(text2);
            o0o0o0o.f44485OooO0Oo.setText(this.f29848OooO0o);
        }
        Button button2 = o0o0o0o.f44483OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        o000O.OooO0O0(button2);
    }

    @NotNull
    public final o0O0O0O getBinding() {
        return this.binding;
    }

    public final void setImage(@DrawableRes @Nullable Integer resId) {
        this.f29849OooO0o0 = resId;
        o0O0O0O o0o0o0o = this.binding;
        if (resId != null) {
            int iIntValue = resId.intValue();
            ImageView image = o0o0o0o.f44484OooO0OO;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            o000O.OooOOOO(image);
            o0o0o0o.f44484OooO0OO.setImageResource(iIntValue);
        }
        if (this.f29849OooO0o0 == null) {
            ImageView image2 = o0o0o0o.f44484OooO0OO;
            Intrinsics.checkNotNullExpressionValue(image2, "image");
            o000O.OooO0O0(image2);
        }
    }

    public final void setText(@Nullable String content) {
        this.f29848OooO0o = content;
        boolean z = content == null || content.length() == 0;
        o0O0O0O o0o0o0o = this.binding;
        if (z) {
            TextView text = o0o0o0o.f44485OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(text, "text");
            o000O.OooO0O0(text);
        } else {
            TextView text2 = o0o0o0o.f44485OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(text2, "text");
            o000O.OooOOOO(text2);
            o0o0o0o.f44485OooO0Oo.setText(this.f29848OooO0o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EmptyView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        o0O0O0O o0o0o0oInflate = o0O0O0O.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0o0o0oInflate, "inflate(...)");
        this.binding = o0o0o0oInflate;
        State state = State.DataError;
        o0o0o0oInflate.f44484OooO0OO.setImageDrawable(null);
        o0o0o0oInflate.f44485OooO0Oo.setText("");
        o0o0o0oInflate.f44483OooO0O0.setText("");
    }
}
