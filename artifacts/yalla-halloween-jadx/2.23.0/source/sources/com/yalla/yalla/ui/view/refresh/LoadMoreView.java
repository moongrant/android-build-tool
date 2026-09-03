package com.yalla.yalla.ui.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o0OO0o.OooO0o;
import o0OO0o.OooOO0O;
import o0OO0o.OooOOO0;
import o0OO0oO0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o00O0O;
import p148o00Oo0o.o0OoOo0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO0O0OoO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000e\u001a\u00020\u00052\n\u0010\r\u001a\u00020\u000b\"\u00020\fH\u0016¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/refresh/LoadMoreView;", "Landroid/widget/FrameLayout;", "Lo0OO0o/OooO0o;", "", "noMoreText", "", "setNoMoreText", "Landroid/view/View;", "getView", "Lo0OO0oO0/OooO0O0;", "getSpinnerStyle", "", "", "colors", "setPrimaryColors", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class LoadMoreView extends FrameLayout implements OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f31266OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImageView f31267OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f31268OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O0O f31269OooO0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadMoreView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // o0OO0o.OooOO0
    public final void OooO(int i, float f, int i2) {
    }

    @Override // o0OO0o.OooOO0
    public final void OooO00o(@NotNull OooOO0O kernel, int i, int i2) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
    }

    @Override // o0OO0o.OooO0o
    public final boolean OooO0O0(boolean z) {
        this.f31268OooO0o0 = z;
        return true;
    }

    @Override // p389o0OOoooO.o00O0OOO
    public final void OooO0OO(@NotNull OooOOO0 refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[newState.ordinal()];
        o00O0O o00o0o2 = this.f31269OooO0oO;
        ImageView imageView = null;
        ImageView imageView2 = this.f31267OooO0o;
        TextView textView = this.f31266OooO0Oo;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            o00o0o2.f37844OooO0o = o00o0o2.f37843OooO0Oo;
            if (this.f31268OooO0o0) {
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
                } else {
                    imageView = imageView2;
                }
                imageView.setVisibility(8);
                textView.setVisibility(0);
                return;
            }
            textView.setVisibility(8);
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(0);
            return;
        }
        if (this.f31268OooO0o0) {
            o00o0o2.f37844OooO0o = o00o0o2.f37843OooO0Oo;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
        } else {
            imageView = imageView2;
        }
        imageView.setVisibility(0);
        if (o00o0o2.f37844OooO0o == 0) {
            return;
        }
        o00o0o2.f37844OooO0o = 0;
        o00o0o2.f37840OooO00o.postDelayed(new o0OoOo0(0, o00o0o2, false), o00o0o2.f37846OooO0oO);
    }

    @Override // o0OO0o.OooOO0
    public final int OooO0Oo(@NotNull SmartRefreshLayout refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // o0OO0o.OooOO0
    public final void OooO0o(@NotNull OooOOO0 refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // o0OO0o.OooOO0
    public final void OooO0o0(float f, int i, int i2, int i3, boolean z) {
    }

    @Override // o0OO0o.OooOO0
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0OO0o.OooOO0
    public final void OooO0oo(@NotNull OooOOO0 refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // o0OO0o.OooOO0
    @NotNull
    public OooO0O0 getSpinnerStyle() {
        OooO0O0 Translate = OooO0O0.f43237OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // o0OO0o.OooOO0
    @NotNull
    public View getView() {
        return this;
    }

    public final void setNoMoreText(@NotNull String noMoreText) {
        Intrinsics.checkNotNullParameter(noMoreText, "noMoreText");
        this.f31266OooO0Oo.setText(noMoreText);
    }

    @Override // o0OO0o.OooOO0
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LoadMoreView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LoadMoreView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        ImageView imageView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, oO00OO0O.view_load_more, this);
        View viewFindViewById = findViewById(oO00O0oO.tvLoadMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tvLoadMore)");
        TextView textView = (TextView) viewFindViewById;
        this.f31266OooO0Oo = textView;
        textView.setVisibility(8);
        View viewFindViewById2 = findViewById(oO00O0oO.ivLoadMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.ivLoadMore)");
        ImageView imageView2 = (ImageView) viewFindViewById2;
        this.f31267OooO0o = imageView2;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            imageView = null;
        } else {
            imageView = imageView2;
        }
        imageView.setVisibility(0);
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivLoadMore");
            imageView2 = null;
        }
        this.f31269OooO0oO = new o00O0O(imageView2, oO0O0OoO.anim_loading_horse_green, 100L);
    }
}
