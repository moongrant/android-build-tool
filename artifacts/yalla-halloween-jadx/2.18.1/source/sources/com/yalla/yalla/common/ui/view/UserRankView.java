package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO.o00O0;
import p254o00ooO0O.oOO00O;
import p649o0ooOOoo.hj;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/common/ui/view/UserRankView;", "Landroid/widget/FrameLayout;", "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "", "setBgHeight", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserRankView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final hj f21056Oooo0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserRankView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean OooO00o(int i, int i2) {
        if (i > 0) {
            oOO00O.OooO(this);
            this.f21056Oooo0o.f49637OooO0Oo.setText(String.valueOf(i));
            this.f21056Oooo0o.f49635OooO0O0.setImageResource(R.drawable.room_user_info_rank_moon);
            this.f21056Oooo0o.f49636OooO0OO.setBackgroundResource(R.drawable.room_shape_user_info_rank_moon);
            return true;
        }
        if (i2 <= 0) {
            oOO00O.OooO00o(this);
            return false;
        }
        oOO00O.OooO(this);
        this.f21056Oooo0o.f49637OooO0Oo.setText(String.valueOf(i2));
        this.f21056Oooo0o.f49635OooO0O0.setImageResource(R.drawable.room_user_info_rank_star);
        this.f21056Oooo0o.f49636OooO0OO.setBackgroundResource(R.drawable.room_shape_user_info_rank_week);
        return true;
    }

    public final void setBgHeight(int height) {
        ViewGroup.LayoutParams layoutParams = this.f21056Oooo0o.f49636OooO0OO.getLayoutParams();
        layoutParams.height = o00O0.OooO00o(height);
        ViewGroup.LayoutParams layoutParams2 = this.f21056Oooo0o.f49635OooO0O0.getLayoutParams();
        layoutParams2.height = layoutParams.height - o00O0.OooO00o(2.0f);
        layoutParams2.width = layoutParams.height - o00O0.OooO00o(2.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserRankView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserRankView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        hj hjVarInflate = hj.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hjVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f21056Oooo0o = hjVarInflate;
        setBgHeight(14);
    }
}
