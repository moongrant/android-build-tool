package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p146o00Oo000.OooOOO0;
import p405o0Oo0OOO.r3;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/view/UserRankView;", "Landroid/widget/FrameLayout;", "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "", "setBgHeight", "size", "setTextSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class UserRankView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final r3 f30262OooO0Oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserRankView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(int i, int i2) {
        r3 r3Var = this.f30262OooO0Oo;
        if (i > 0) {
            o000O.OooOOOO(this);
            r3Var.f45471OooO0Oo.setText(String.valueOf(i));
            r3Var.f45469OooO0O0.setImageResource(o0Oo0oo.room_user_info_rank_moon);
            r3Var.f45470OooO0OO.setBackgroundResource(o0Oo0oo.room_shape_user_info_rank_moon);
            return;
        }
        if (i2 <= 0) {
            o000O.OooO0O0(this);
            return;
        }
        o000O.OooOOOO(this);
        r3Var.f45471OooO0Oo.setText(String.valueOf(i2));
        r3Var.f45469OooO0O0.setImageResource(o0Oo0oo.room_user_info_rank_star);
        r3Var.f45470OooO0OO.setBackgroundResource(o0Oo0oo.room_shape_user_info_rank_week);
    }

    public final void setBgHeight(int height) {
        r3 r3Var = this.f30262OooO0Oo;
        ViewGroup.LayoutParams layoutParams = r3Var.f45470OooO0OO.getLayoutParams();
        layoutParams.height = OooOOO0.OooO00o(height);
        ViewGroup.LayoutParams layoutParams2 = r3Var.f45469OooO0O0.getLayoutParams();
        layoutParams2.height = layoutParams.height - OooOOO0.OooO00o(2.0f);
        layoutParams2.width = layoutParams.height - OooOOO0.OooO00o(2.0f);
    }

    public final void setTextSize(int size) {
        this.f30262OooO0Oo.f45471OooO0Oo.setTextSize(o0000O0.OooO00o(size));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserRankView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserRankView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserRankView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        r3 r3VarInflate = r3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r3VarInflate, "inflate(...)");
        this.f30262OooO0Oo = r3VarInflate;
        setBgHeight(14);
    }
}
