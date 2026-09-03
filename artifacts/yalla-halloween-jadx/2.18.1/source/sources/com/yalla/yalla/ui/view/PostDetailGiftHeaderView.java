package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\bH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/view/PostDetailGiftHeaderView;", "Landroid/widget/LinearLayout;", "Lo00Oo00/OooO00o;", "Lo00Oo00/OooO0OO;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setListener", "Lo0ooo/o00Oo0;", "mNoDoubleClickListener", "setNoDoubleClickListener", "getNoDoubleClickListener", "Landroid/widget/RelativeLayout;", "Oooo0o", "Landroid/widget/RelativeLayout;", "getMLayout", "()Landroid/widget/RelativeLayout;", "setMLayout", "(Landroid/widget/RelativeLayout;)V", "mLayout", "Landroid/widget/ImageView;", "Oooo0oO", "Landroid/widget/ImageView;", "getMImageTv", "()Landroid/widget/ImageView;", "setMImageTv", "(Landroid/widget/ImageView;)V", "mImageTv", "Landroid/widget/TextView;", "Oooo0oo", "Landroid/widget/TextView;", "getMNameTv", "()Landroid/widget/TextView;", "setMNameTv", "(Landroid/widget/TextView;)V", "mNameTv", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PostDetailGiftHeaderView extends LinearLayout implements o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f25061Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public RelativeLayout mLayout;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ImageView mImageTv;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextView mNameTv;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00Oo0 f25065OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o00Oo00.OooO0OO<Integer> f25066OoooO00;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PostDetailGiftHeaderView.this.onClickNotDouble(view);
        }
    }

    @JvmOverloads
    public PostDetailGiftHeaderView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public PostDetailGiftHeaderView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PostDetailGiftHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void OooO00o(int i) {
        this.f25061Oooo = i;
        if (i == 0) {
            ImageView imageView = this.mImageTv;
            Intrinsics.checkNotNull(imageView);
            imageView.setImageResource(R.drawable.icon_comment_list_new);
            TextView textView = this.mNameTv;
            Intrinsics.checkNotNull(textView);
            textView.setText(R.string.post_detail_gift_head_Latest);
            return;
        }
        if (i != 1) {
            return;
        }
        ImageView imageView2 = this.mImageTv;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setImageResource(R.drawable.icon_comment_list_hot);
        TextView textView2 = this.mNameTv;
        Intrinsics.checkNotNull(textView2);
        textView2.setText(R.string.post_detail_gift_head_Wealth);
    }

    @Nullable
    public final ImageView getMImageTv() {
        return this.mImageTv;
    }

    @Nullable
    public final RelativeLayout getMLayout() {
        return this.mLayout;
    }

    @Nullable
    public final TextView getMNameTv() {
        return this.mNameTv;
    }

    @NotNull
    public o00Oo0 getNoDoubleClickListener() {
        if (this.f25065OoooO0 == null) {
            this.f25065OoooO0 = new OooO00o();
        }
        o00Oo0 o00oo1 = this.f25065OoooO0;
        Intrinsics.checkNotNull(o00oo1);
        return o00oo1;
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == R.id.image || id == R.id.name) {
            int i = this.f25061Oooo == 1 ? 0 : 1;
            this.f25061Oooo = i;
            OooO00o(i);
            o00Oo00.OooO0OO<Integer> oooO0OO = this.f25066OoooO00;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(Integer.valueOf(this.f25061Oooo));
            }
        }
    }

    public final void setListener(@Nullable o00Oo00.OooO0OO<Integer> listener) {
        this.f25066OoooO00 = listener;
    }

    public final void setMImageTv(@Nullable ImageView imageView) {
        this.mImageTv = imageView;
    }

    public final void setMLayout(@Nullable RelativeLayout relativeLayout) {
        this.mLayout = relativeLayout;
    }

    public final void setMNameTv(@Nullable TextView textView) {
        this.mNameTv = textView;
    }

    public final void setNoDoubleClickListener(@Nullable o00Oo0 mNoDoubleClickListener) {
        this.f25065OoooO0 = mNoDoubleClickListener;
    }

    @JvmOverloads
    public PostDetailGiftHeaderView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25061Oooo = 1;
        View.inflate(getContext(), R.layout.item_post_detail_gift_header, this);
        View viewOooO00o = p148o00Oo0O.o00Oo0.OooO00o(this, R.id.layout, null);
        Intrinsics.checkNotNullExpressionValue(viewOooO00o, "findViewClick(this, id, null)");
        Intrinsics.checkNotNull(viewOooO00o, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.mLayout = (RelativeLayout) viewOooO00o;
        View viewOooO00o2 = p148o00Oo0O.o00Oo0.OooO00o(this, R.id.image, getNoDoubleClickListener());
        Intrinsics.checkNotNullExpressionValue(viewOooO00o2, "findViewClick(this, id, noDoubleClickListener)");
        Intrinsics.checkNotNull(viewOooO00o2, "null cannot be cast to non-null type android.widget.ImageView");
        this.mImageTv = (ImageView) viewOooO00o2;
        View viewOooO00o3 = p148o00Oo0O.o00Oo0.OooO00o(this, R.id.name, getNoDoubleClickListener());
        Intrinsics.checkNotNullExpressionValue(viewOooO00o3, "findViewClick(this, id, noDoubleClickListener)");
        Intrinsics.checkNotNull(viewOooO00o3, "null cannot be cast to non-null type android.widget.TextView");
        this.mNameTv = (TextView) viewOooO00o3;
    }
}
