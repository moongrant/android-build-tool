package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.ImageItemModel;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.ce;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/view/ImageItemView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/ImageView;", "getImageView", "Lcom/yalla/yalla/model/ImageItemModel;", "Oooo0oo", "Lcom/yalla/yalla/model/ImageItemModel;", "getData", "()Lcom/yalla/yalla/model/ImageItemModel;", "setData", "(Lcom/yalla/yalla/model/ImageItemModel;)V", "data", "", "Oooo", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ImageItemView extends RelativeLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ce f24824Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public String f24825Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ImageItemModel data;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageItemView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o() {
        this.f24824Oooo0o.f49105OooO0OO.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f24824Oooo0o.f49105OooO0OO.setBackgroundResource(R.drawable.shape_bg_image_default_circluar);
        this.f24824Oooo0o.f49105OooO0OO.setImageResource(R.drawable.icon_picture_default_circluar);
        this.f24824Oooo0o.f49104OooO0O0.setVisibility(8);
    }

    @Nullable
    public final ImageItemModel getData() {
        return this.data;
    }

    @NotNull
    public final ImageView getImageView() {
        NetImageView netImageView = this.f24824Oooo0o.f49105OooO0OO;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.image");
        return netImageView;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setData(@Nullable ImageItemModel imageItemModel) {
        this.data = imageItemModel;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ImageItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ce ceVarInflate = ce.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ceVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24824Oooo0o = ceVarInflate;
    }
}
