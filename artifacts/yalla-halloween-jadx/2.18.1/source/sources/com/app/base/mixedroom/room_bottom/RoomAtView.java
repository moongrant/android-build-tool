package com.app.base.mixedroom.room_bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.bj;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR?\u0010\u0017\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006 "}, d2 = {"Lcom/app/base/mixedroom/room_bottom/RoomAtView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "", "", "Oooo0oO", "Lkotlin/jvm/functions/Function1;", "getAtEveryOneListener", "()Lkotlin/jvm/functions/Function1;", "setAtEveryOneListener", "(Lkotlin/jvm/functions/Function1;)V", "atEveryOneListener", "Oooo0oo", "getAtMemberListener", "setAtMemberListener", "atMemberListener", "", "Lkotlin/ParameterName;", "name", "isShow", "Oooo", "getShowStateListener", "setShowStateListener", "showStateListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomAtView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> showStateListener;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public bj f11845Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> atEveryOneListener;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> atMemberListener;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f11848OoooO00;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooOo.OooO0O0("102203");
            Function1<String, Unit> atEveryOneListener = RoomAtView.this.getAtEveryOneListener();
            if (atEveryOneListener != null) {
                atEveryOneListener.invoke(o000O0O0.OooO0OO(R.string.room_at_everyOne));
            }
            RoomAtView.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            OooOo.OooO0O0("102204");
            Function1<String, Unit> atMemberListener = RoomAtView.this.getAtMemberListener();
            if (atMemberListener != null) {
                atMemberListener.invoke(o000O0O0.OooO0OO(R.string.room_at_member));
            }
            RoomAtView.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomAtView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0O0() {
        if (this.f11848OoooO00) {
            this.f11848OoooO00 = false;
            ConstraintLayout constraintLayout = this.f11845Oooo0o.f49071OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutAt");
            oOO00O.OooO00o(constraintLayout);
            Function1<? super Boolean, Unit> function1 = this.showStateListener;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(this.f11848OoooO00));
            }
        }
    }

    public final void OooO0OO() {
        if (this.f11848OoooO00) {
            return;
        }
        this.f11848OoooO00 = true;
        ConstraintLayout constraintLayout = this.f11845Oooo0o.f49071OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutAt");
        oOO00O.OooO(constraintLayout);
        Function1<? super Boolean, Unit> function1 = this.showStateListener;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.f11848OoooO00));
        }
    }

    @Nullable
    public final Function1<String, Unit> getAtEveryOneListener() {
        return this.atEveryOneListener;
    }

    @Nullable
    public final Function1<String, Unit> getAtMemberListener() {
        return this.atMemberListener;
    }

    @Nullable
    public final Function1<Boolean, Unit> getShowStateListener() {
        return this.showStateListener;
    }

    public final void setAtEveryOneListener(@Nullable Function1<? super String, Unit> function1) {
        this.atEveryOneListener = function1;
    }

    public final void setAtMemberListener(@Nullable Function1<? super String, Unit> function1) {
        this.atMemberListener = function1;
    }

    public final void setShowStateListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.showStateListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomAtView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomAtView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        bj bjVarInflate = bj.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(bjVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f11845Oooo0o = bjVarInflate;
        TextView textView = bjVarInflate.f49069OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.atEveryOne");
        o00O0O.OooO0Oo(textView, new OooO00o());
        TextView textView2 = this.f11845Oooo0o.f49070OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.atMember");
        o00O0O.OooO0Oo(textView2, new OooO0O0());
    }
}
