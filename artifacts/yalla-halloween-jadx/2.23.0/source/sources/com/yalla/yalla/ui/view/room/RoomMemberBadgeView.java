package com.yalla.yalla.ui.view.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.netimage.NetImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomMemberBadgeView;", "Landroid/widget/FrameLayout;", "", "fontSize", "", "setTextSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomMemberBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final NetImageView f31319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f31320OooO0o0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberBadgeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(@Nullable Integer num, @Nullable String str, boolean z, float f) {
        if (num != null && num.intValue() > 0) {
            if (!(str == null || StringsKt.isBlank(str))) {
                o000OO00.OooOOOO(this);
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
                oooO00o.f43911OooO0OO = str;
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(this.f31319OooO0Oo);
                TextView textView = this.f31320OooO0o0;
                o000OO00.OooOOO0(textView, !z);
                textView.setText(num.toString());
                textView.setTextSize(f);
                return;
            }
        }
        o000OO00.OooO0O0(this);
    }

    public final void setTextSize(float fontSize) {
        this.f31320OooO0o0.setTextSize(fontSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomMemberBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        NetImageView netImageView = new NetImageView(context);
        this.f31319OooO0Oo = netImageView;
        TextView textView = new TextView(context);
        this.f31320OooO0o0 = textView;
        addView(netImageView, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        textView.setTextColor(o0000.OooO00o(oO00O0o.white));
        textView.setIncludeFontPadding(false);
    }
}
