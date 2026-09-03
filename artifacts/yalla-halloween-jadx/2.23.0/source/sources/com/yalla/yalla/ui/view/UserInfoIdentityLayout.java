package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.k9;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/UserInfoIdentityLayout;", "Landroid/widget/FrameLayout;", "", "identity", "", "setIdentityInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserInfoIdentityLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final k9 f30781OooO0Oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoIdentityLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setIdentityInfo(int identity) {
        setVisibility(0);
        k9 k9Var = this.f30781OooO0Oo;
        k9Var.f58302OooO0O0.OooO0OO(identity, true, true);
        LinearLayoutCompat linearLayoutCompat = k9Var.f58303OooO0OO;
        TextView textView = k9Var.f58304OooO0Oo;
        if (identity == 0) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_shape_dialog_identity_guest);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
            textView.setText(o0000.OooO0OO(oO00OOo0.Visitor));
            return;
        }
        if (identity == 1) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_shape_dialog_identity_host);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_FE6C6C));
            textView.setText(o0000.OooO0OO(oO00OOo0.title_RoomPerson_roomer));
        } else if (identity == 2) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_shape_dialog_identity_admin);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_ffc339));
            textView.setText(o0000.OooO0OO(oO00OOo0.admin));
        } else {
            if (identity != 3) {
                setVisibility(8);
                return;
            }
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_shape_dialog_identity_member);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
            textView.setText(o0000.OooO0OO(oO00OOo0.Member));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoIdentityLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserInfoIdentityLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoIdentityLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        k9 k9VarInflate = k9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(k9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30781OooO0Oo = k9VarInflate;
    }
}
