package com.app.base.view.dialog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/app/base/view/dialog/HollowGuideView;", "Landroid/view/View;", "Landroid/graphics/RectF;", "rect_", "", "setLocation", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class HollowGuideView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final int f12156Oooo = o000O0O0.OooO00o(R.color.color_70000000);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public Paint f12157Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final PorterDuffXfermode f12158Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public RectF f12159Oooo0oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HollowGuideView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void draw(@Nullable Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            int iSaveLayer = canvas.saveLayer(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight(), null, 31);
            canvas.drawColor(f12156Oooo);
            this.f12157Oooo0o.setXfermode(this.f12158Oooo0oO);
            canvas.drawRoundRect(this.f12159Oooo0oo, 16.0f, 16.0f, this.f12157Oooo0o);
            this.f12157Oooo0o.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public final void setLocation(@NotNull RectF rect_) {
        Intrinsics.checkNotNullParameter(rect_, "rect_");
        this.f12159Oooo0oo = rect_;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HollowGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HollowGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12157Oooo0o = new Paint(1);
        this.f12158Oooo0oO = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f12159Oooo0oo = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f12157Oooo0o.setColor(-1);
        this.f12157Oooo0o.setStyle(Paint.Style.FILL);
    }
}
