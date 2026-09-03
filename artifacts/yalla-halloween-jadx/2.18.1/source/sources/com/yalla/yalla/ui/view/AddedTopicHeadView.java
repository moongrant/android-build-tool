package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0o.oo0o0O0;
import p649o0ooOOoo.l9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/view/AddedTopicHeadView;", "Landroid/widget/LinearLayout;", "com/yalla/yalla/ui/view/OooO00o", "OoooO00", "Lkotlin/Lazy;", "getNoDoubleClickListener", "()Lcom/yalla/yalla/ui/view/OooO00o;", "noDoubleClickListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AddedTopicHeadView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final List<OooO00o> f24761Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f24762Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public String f24763Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final List<TopicInfoModel> f24764Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy noDoubleClickListener;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final ConstraintLayout f24766OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final NetImageView f24767OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final TextView f24768OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final TextView f24769OooO0Oo;

        public OooO00o(@Nullable ConstraintLayout constraintLayout, @Nullable NetImageView netImageView, @Nullable TextView textView, TextView textView2) {
            this.f24766OooO00o = constraintLayout;
            this.f24767OooO0O0 = netImageView;
            this.f24768OooO0OO = textView;
            this.f24769OooO0Oo = textView2;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.ui.view.OooO00o> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f24772Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f24772Oooo0oO = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.view.OooO00o invoke() {
            return new com.yalla.yalla.ui.view.OooO00o(AddedTopicHeadView.this, this.f24772Oooo0oO);
        }
    }

    @JvmOverloads
    public AddedTopicHeadView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AddedTopicHeadView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AddedTopicHeadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    private final com.yalla.yalla.ui.view.OooO00o getNoDoubleClickListener() {
        return (com.yalla.yalla.ui.view.OooO00o) this.noDoubleClickListener.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.view.AddedTopicHeadView$OooO00o>] */
    public final void OooO00o() {
        for (OooO00o oooO00o : this.f24761Oooo) {
            TextView textView = oooO00o.f24768OooO0OO;
            if (textView != null) {
                oo0o0O0.OooO00o(textView);
                oooO00o.f24768OooO0OO.setText("");
                oooO00o.f24768OooO0OO.setTextColor(AddedTopicHeadView.this.getContext().getResources().getColor(R.color.color_87000000));
            }
            TextView textView2 = oooO00o.f24769OooO0Oo;
            if (textView2 != null) {
                textView2.setText("");
            }
            NetImageView netImageView = oooO00o.f24767OooO0O0;
            if (netImageView != null) {
                netImageView.setImageBitmap(null);
            }
            ConstraintLayout constraintLayout = oooO00o.f24766OooO00o;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            TextView textView3 = oooO00o.f24768OooO0OO;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TextView textView4 = oooO00o.f24769OooO0Oo;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
        }
    }

    @JvmOverloads
    public AddedTopicHeadView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l9 l9VarInflate = l9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(l9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24762Oooo0o = 4;
        this.f24764Oooo0oo = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f24761Oooo = arrayList;
        this.noDoubleClickListener = LazyKt.lazy(new OooO0O0(context));
        l9VarInflate.f49927OooO0oo.setOnClickListener(getNoDoubleClickListener());
        l9VarInflate.f49937OooOOoo.setOnClickListener(getNoDoubleClickListener());
        l9VarInflate.f49933OooOOOO.setOnClickListener(getNoDoubleClickListener());
        l9VarInflate.f49921OooO0O0.setOnClickListener(getNoDoubleClickListener());
        l9VarInflate.f49922OooO0OO.setOnClickListener(getNoDoubleClickListener());
        l9VarInflate.f49923OooO0Oo.setOnClickListener(getNoDoubleClickListener());
        arrayList.add(new OooO00o(l9VarInflate.f49919OooO, l9VarInflate.f49925OooO0o0, l9VarInflate.f49934OooOOOo, l9VarInflate.f49930OooOO0o));
        arrayList.add(new OooO00o(l9VarInflate.f49928OooOO0, l9VarInflate.f49924OooO0o, l9VarInflate.f49936OooOOo0, l9VarInflate.f49932OooOOO0));
        arrayList.add(new OooO00o(l9VarInflate.f49929OooOO0O, l9VarInflate.f49926OooO0oO, l9VarInflate.f49935OooOOo, l9VarInflate.f49931OooOOO));
        OooO00o();
    }
}
