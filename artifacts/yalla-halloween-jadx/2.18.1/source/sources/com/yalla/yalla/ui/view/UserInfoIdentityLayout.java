package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p649o0ooOOoo.vg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/UserInfoIdentityLayout;", "Landroid/widget/FrameLayout;", "", "identity", "", "setIdentityInfo", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoIdentityLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final vg f25231Oooo0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoIdentityLayout(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setIdentityInfo(int identity) {
        setVisibility(0);
        this.f25231Oooo0o.f50820OooO0O0.OooO0OO(identity, true, true);
        if (identity == 0) {
            this.f25231Oooo0o.f50821OooO0OO.setBackgroundResource(R.drawable.room_shape_dialog_identity_guest);
            this.f25231Oooo0o.f50822OooO0Oo.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
            this.f25231Oooo0o.f50822OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Visitor));
            return;
        }
        if (identity == 1) {
            this.f25231Oooo0o.f50821OooO0OO.setBackgroundResource(R.drawable.room_shape_dialog_identity_host);
            this.f25231Oooo0o.f50822OooO0Oo.setTextColor(o000O0O0.OooO00o(R.color.color_FE6C6C));
            this.f25231Oooo0o.f50822OooO0Oo.setText(o000O0O0.OooO0OO(R.string.title_RoomPerson_roomer));
        } else if (identity == 2) {
            this.f25231Oooo0o.f50821OooO0OO.setBackgroundResource(R.drawable.room_shape_dialog_identity_admin);
            this.f25231Oooo0o.f50822OooO0Oo.setTextColor(o000O0O0.OooO00o(R.color.color_ffc339));
            this.f25231Oooo0o.f50822OooO0Oo.setText(o000O0O0.OooO0OO(R.string.admin));
        } else {
            if (identity != 3) {
                setVisibility(8);
                return;
            }
            this.f25231Oooo0o.f50821OooO0OO.setBackgroundResource(R.drawable.room_shape_dialog_identity_member);
            this.f25231Oooo0o.f50822OooO0Oo.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
            this.f25231Oooo0o.f50822OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Member));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoIdentityLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoIdentityLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        vg vgVarInflate = vg.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(vgVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25231Oooo0o = vgVarInflate;
    }
}
