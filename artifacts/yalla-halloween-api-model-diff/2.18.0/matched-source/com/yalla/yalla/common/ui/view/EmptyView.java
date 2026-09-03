package com.yalla.yalla.common.ui.view;

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
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.EmptyView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.oOO00O;
import p651o0ooOOoo.l8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/common/ui/view/EmptyView;", "Landroid/widget/LinearLayout;", "", "resId", "", "setImage", "(Ljava/lang/Integer;)V", "", "content", "setText", "Lo0ooOOoo/l8;", "binding", "Lo0ooOOoo/l8;", "getBinding", "()Lo0ooOOoo/l8;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EmptyView extends LinearLayout {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final /* synthetic */ int f20954OoooO = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final l8 f20955Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public String f20956OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @DrawableRes
    @Nullable
    public Integer f20957OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f20958OoooO0O;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.DataError.ordinal()] = 1;
            iArr[State.DataNull.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/common/ui/view/EmptyView$State;", "", "", "code", "I", "getCode", "()I", "DataError", "DataNull", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum State {
        DataError(-1),
        DataNull(0);

        private final int code;

        State(int i) {
            this.code = i;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EmptyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    public static void OooO00o(EmptyView emptyView, final Function0 function0) {
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Try_again);
        emptyView.f20958OoooO0O = function0;
        if (strOooO0OO == null || strOooO0OO.length() == 0) {
            Button button = emptyView.f20955Oooo.f49941OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button, "binding.button");
            oOO00O.OooO00o(button);
        } else {
            Button button2 = emptyView.f20955Oooo.f49941OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.button");
            oOO00O.OooO(button2);
            emptyView.f20955Oooo.f49941OooO0O0.setText(strOooO0OO);
            emptyView.f20955Oooo.f49941OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.o000OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Function0 function1 = function0;
                    int i = EmptyView.f20954OoooO;
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
        if (i == 1) {
            ImageView imageView = this.f20955Oooo.f49942OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
            oOO00O.OooO00o(imageView);
            TextView textView = this.f20955Oooo.f49943OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            oOO00O.OooO(textView);
            this.f20955Oooo.f49943OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Network_request_failed));
            if (this.f20958OoooO0O != null) {
                Button button = this.f20955Oooo.f49941OooO0O0;
                Intrinsics.checkNotNullExpressionValue(button, "binding.button");
                oOO00O.OooO(button);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        Integer num = this.f20957OoooO00;
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView imageView2 = this.f20955Oooo.f49942OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.image");
            oOO00O.OooO(imageView2);
            this.f20955Oooo.f49942OooO0OO.setImageResource(iIntValue);
        }
        String str = this.f20956OoooO0;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (!z) {
            TextView textView2 = this.f20955Oooo.f49943OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.text");
            oOO00O.OooO(textView2);
            this.f20955Oooo.f49943OooO0Oo.setText(this.f20956OoooO0);
        }
        Button button2 = this.f20955Oooo.f49941OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.button");
        oOO00O.OooO00o(button2);
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final l8 getF20955Oooo() {
        return this.f20955Oooo;
    }

    public final void setImage(@DrawableRes @Nullable Integer resId) {
        this.f20957OoooO00 = resId;
        if (resId != null) {
            int iIntValue = resId.intValue();
            ImageView imageView = this.f20955Oooo.f49942OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.image");
            oOO00O.OooO(imageView);
            this.f20955Oooo.f49942OooO0OO.setImageResource(iIntValue);
        }
        if (this.f20957OoooO00 == null) {
            ImageView imageView2 = this.f20955Oooo.f49942OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.image");
            oOO00O.OooO00o(imageView2);
        }
    }

    public final void setText(@Nullable String content) {
        this.f20956OoooO0 = content;
        if (content == null || content.length() == 0) {
            TextView textView = this.f20955Oooo.f49943OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.text");
            oOO00O.OooO00o(textView);
        } else {
            TextView textView2 = this.f20955Oooo.f49943OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.text");
            oOO00O.OooO(textView2);
            this.f20955Oooo.f49943OooO0Oo.setText(this.f20956OoooO0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        l8 l8VarInflate = l8.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(l8VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f20955Oooo = l8VarInflate;
        State state = State.DataNull;
        l8VarInflate.f49942OooO0OO.setImageDrawable(null);
        l8VarInflate.f49943OooO0Oo.setText("");
        l8VarInflate.f49941OooO0O0.setText("");
    }
}
