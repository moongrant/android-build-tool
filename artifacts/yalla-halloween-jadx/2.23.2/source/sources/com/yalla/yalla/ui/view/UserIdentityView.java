package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/view/UserIdentityView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class UserIdentityView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserIdentityView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean OooO0OO(int i, boolean z, boolean z2) {
        if (i != 0) {
            if (i == 1) {
                o000O.OooOOOO(this);
                setImageResource(o0Oo0oo.icon_identity_red);
            } else if (i == 2) {
                o000O.OooOOOO(this);
                setImageResource(o0Oo0oo.icon_identity_yellow);
            } else {
                if (i != 3) {
                    o000O.OooO0O0(this);
                    return false;
                }
                if (!z) {
                    o000O.OooO0O0(this);
                    return false;
                }
                o000O.OooOOOO(this);
                setImageResource(o0Oo0oo.icon_identity_green);
            }
        } else {
            if (!z2) {
                o000O.OooO0O0(this);
                return false;
            }
            o000O.OooOOOO(this);
            setImageResource(o0Oo0oo.icon_identity_gray);
        }
        return true;
    }

    public final void OooO0Oo(int i) {
        if (i == 1) {
            o000O.OooOOOO(this);
            setImageResource(o0Oo0oo.ic_topic_owner);
        } else if (i == 2) {
            o000O.OooO0O0(this);
        } else if (i != 3) {
            o000O.OooO0O0(this);
        } else {
            o000O.OooOOOO(this);
            setImageResource(o0Oo0oo.ic_topic_manager);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserIdentityView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserIdentityView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserIdentityView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
