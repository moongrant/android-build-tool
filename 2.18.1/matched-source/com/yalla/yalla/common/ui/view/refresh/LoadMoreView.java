package com.yalla.yalla.common.ui.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOo.oO000OOo;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p409o0Oo0Oo0.o0OoOo0;
import p516o0o0O000.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\u00052\n\u0010\r\u001a\u00020\u000b\"\u00020\fH\u0016¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/common/ui/view/refresh/LoadMoreView;", "Landroid/widget/FrameLayout;", "Lo0Oo0OOo/oO000OOo;", "", "noMoreText", "", "setNoMoreText", "Landroid/view/View;", "getView", "Lo0Oo0Oo0/o0OoOo0;", "getSpinnerStyle", "", "", "colors", "setPrimaryColors", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LoadMoreView extends FrameLayout implements oO000OOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public o00Oo0 f21203Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public TextView f21204Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f21205Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageView f21206Oooo0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            iArr[RefreshState.None.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadMoreView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LoadMoreView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO(@NotNull oO000Oo refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO00o(@NotNull oO000Oo refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NotNull oO000Oo refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // p407o0Oo0OOo.oO000OOo
    public final boolean OooO0OO(boolean z) {
        this.f21205Oooo0oO = z;
        return true;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0Oo(float f, int i, int i2) {
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NotNull oO000Oo0 kernel, int i, int i2) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final boolean OooO0o0() {
        return false;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0oO(boolean z, float f, int i, int i2, int i3) {
    }

    @Override // p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NotNull oO000Oo refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[newState.ordinal()];
        ImageView imageView = null;
        if (i == 1) {
            if (!this.f21205Oooo0oO) {
                this.f21204Oooo0o.setVisibility(8);
                ImageView imageView2 = this.f21206Oooo0oo;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
                } else {
                    imageView = imageView2;
                }
                imageView.setVisibility(0);
                this.f21203Oooo.OooO0O0();
                return;
            }
            o00Oo0 o00oo1 = this.f21203Oooo;
            o00oo1.f42082OooO0o = o00oo1.f42081OooO0Oo;
            ImageView imageView3 = this.f21206Oooo0oo;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            } else {
                imageView = imageView3;
            }
            imageView.setVisibility(8);
            this.f21204Oooo0o.setVisibility(0);
            return;
        }
        if (i != 2) {
            return;
        }
        o00Oo0 o00oo2 = this.f21203Oooo;
        o00oo2.f42082OooO0o = o00oo2.f42081OooO0Oo;
        if (this.f21205Oooo0oO) {
            ImageView imageView4 = this.f21206Oooo0oo;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            } else {
                imageView = imageView4;
            }
            imageView.setVisibility(8);
            this.f21204Oooo0o.setVisibility(0);
            return;
        }
        this.f21204Oooo0o.setVisibility(8);
        ImageView imageView5 = this.f21206Oooo0oo;
        if (imageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
        } else {
            imageView = imageView5;
        }
        imageView.setVisibility(0);
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NotNull
    public o0OoOo0 getSpinnerStyle() {
        o0OoOo0 Translate = o0OoOo0.f39152OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NotNull
    public View getView() {
        return this;
    }

    public final void setNoMoreText(@NotNull String noMoreText) {
        Intrinsics.checkNotNullParameter(noMoreText, "noMoreText");
        this.f21204Oooo0o.setText(noMoreText);
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ImageView imageView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.view_load_more, this);
        View viewFindViewById = findViewById(R.id.tvLoadMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tvLoadMore)");
        TextView textView = (TextView) viewFindViewById;
        this.f21204Oooo0o = textView;
        textView.setVisibility(8);
        View viewFindViewById2 = findViewById(R.id.ivLoadMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.ivLoadMore)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.f21206Oooo0oo = imageView2;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        ImageView imageView3 = this.f21206Oooo0oo;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            imageView = null;
        } else {
            imageView = imageView3;
        }
        this.f21203Oooo = new o00Oo0(imageView, R.array.anim_loading_horse_green, 100L, true);
    }
}
