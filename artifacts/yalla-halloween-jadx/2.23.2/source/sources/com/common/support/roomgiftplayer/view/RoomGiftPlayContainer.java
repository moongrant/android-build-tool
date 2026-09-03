package com.common.support.roomgiftplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import com.common.support.roomgiftplayer.view.inter.IRoomGiftVideoView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/common/support/roomgiftplayer/view/RoomGiftPlayContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/common/support/roomgiftplayer/view/inter/IRoomGiftVideoView;", "svgaView", "getSvgaView", "()Lcom/common/support/roomgiftplayer/view/inter/IRoomGiftVideoView;", "yyEvaVideoView", "Lcom/common/support/roomgiftplayer/view/YYEvaVideoView;", "getYyEvaVideoView", "()Lcom/common/support/roomgiftplayer/view/YYEvaVideoView;", "yyEvaVideoView$delegate", "Lkotlin/Lazy;", "goneAll", "", "initSvgaView", "setMute", "mute", "", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomGiftPlayContainer extends FrameLayout {
    public static final int $stable = 8;

    @Nullable
    private IRoomGiftVideoView svgaView;

    /* JADX INFO: renamed from: yyEvaVideoView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy yyEvaVideoView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomGiftPlayContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final IRoomGiftVideoView getSvgaView() {
        return this.svgaView;
    }

    @NotNull
    public final YYEvaVideoView getYyEvaVideoView() {
        return (YYEvaVideoView) this.yyEvaVideoView.getValue();
    }

    public final void goneAll() {
        View view;
        o000O.OooO0O0(getYyEvaVideoView().getView());
        IRoomGiftVideoView iRoomGiftVideoView = this.svgaView;
        if (iRoomGiftVideoView == null || (view = iRoomGiftVideoView.getView()) == null) {
            return;
        }
        o000O.OooO0O0(view);
    }

    public final void initSvgaView(@NotNull IRoomGiftVideoView svgaView) {
        Intrinsics.checkNotNullParameter(svgaView, "svgaView");
        this.svgaView = svgaView;
        if (svgaView.getView().getParent() == null) {
            addView(svgaView.getView(), new ViewGroup.LayoutParams(-1, -1));
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        svgaView.init((AppCompatActivity) context);
    }

    public final void setMute(boolean mute) {
        getYyEvaVideoView().setMute(mute);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomGiftPlayContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomGiftPlayContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomGiftPlayContainer(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.yyEvaVideoView = LazyKt.lazy(new Function0<YYEvaVideoView>() { // from class: com.common.support.roomgiftplayer.view.RoomGiftPlayContainer$yyEvaVideoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final YYEvaVideoView invoke() {
                Context context2 = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                YYEvaVideoView yYEvaVideoView = new YYEvaVideoView(context2, null, 0, 6, null);
                Context context3 = context;
                Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                yYEvaVideoView.init((AppCompatActivity) context3);
                this.this$0.addView(yYEvaVideoView, new ViewGroup.LayoutParams(-1, -1));
                return yYEvaVideoView;
            }
        });
    }
}
