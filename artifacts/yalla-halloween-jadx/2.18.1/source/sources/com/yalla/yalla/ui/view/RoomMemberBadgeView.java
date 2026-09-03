package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomMemberBadgeView;", "Landroid/widget/FrameLayout;", "", "fontSize", "", "setTextSize", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomMemberBadgeView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f25107Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final NetImageView f25108Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final TextView f25109Oooo0oO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberBadgeView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(@Nullable Integer num, @Nullable String str, boolean z, float f) {
        if (num != null && num.intValue() > 0) {
            if (!(str == null || StringsKt.isBlank(str))) {
                oOO00O.OooO(this);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                oooO00o.f48429OooO0OO = str;
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(this.f25108Oooo0o);
                oOO00O.OooO0oo(this.f25109Oooo0oO, !z);
                this.f25109Oooo0oO.setText(num.toString());
                this.f25109Oooo0oO.setTextSize(f);
                return;
            }
        }
        oOO00O.OooO00o(this);
    }

    public final void setTextSize(float fontSize) {
        this.f25109Oooo0oO.setTextSize(fontSize);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberBadgeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        NetImageView netImageView = new NetImageView(context);
        this.f25108Oooo0o = netImageView;
        TextView textView = new TextView(context);
        this.f25109Oooo0oO = textView;
        addView(netImageView, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(textView, layoutParams);
        textView.setTextColor(o000O0O0.OooO00o(R.color.white));
        textView.setIncludeFontPadding(false);
    }
}
