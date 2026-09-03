package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o00oOoo;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/view/TopicFollowPostNumberView;", "Landroid/widget/LinearLayout;", "", "alpha", "", "setAllAlpha", "setTextAlpha", "setImageAlpha", "", "color", "setTextColor", "size", "setTextSize", "resource", "setLayoutResource", "", "isWhiteType", "setType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TopicFollowPostNumberView extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ImageView f30216OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final TextView f30217OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final TextView f30218OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final TextView f30219OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ImageView f30220OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ImageView f30221OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ArrayList<ImageView> f30222OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ArrayList<TextView> f30223OooOO0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowPostNumberView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(int i, int i2, int i3) {
        this.f30217OooO0Oo.setText(o00oOoo.OooO0O0(i));
        this.f30219OooO0o0.setText(o00oOoo.OooO0O0(i2));
        ImageView imageView = this.f30216OooO;
        imageView.setVisibility(8);
        TextView textView = this.f30218OooO0o;
        textView.setVisibility(8);
        if (i3 >= 0) {
            imageView.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(o00oOoo.OooO0O0(i3));
        }
    }

    public final void setAllAlpha(float alpha) {
        setImageAlpha(alpha);
        setTextAlpha(alpha);
    }

    public final void setImageAlpha(float alpha) {
        Iterator<ImageView> it = this.f30222OooOO0.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(alpha);
        }
    }

    public final void setLayoutResource(int resource) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof LinearLayout) {
                View childAt = getChildAt(i);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.LinearLayout");
                ((LinearLayout) childAt).setBackgroundResource(resource);
            }
        }
    }

    public final void setTextAlpha(float alpha) {
        Iterator<TextView> it = this.f30223OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(alpha);
        }
    }

    public final void setTextColor(int color) {
        Iterator<TextView> it = this.f30223OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(color);
        }
    }

    public final void setTextSize(float size) {
        Iterator<TextView> it = this.f30223OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().setTextSize(size);
        }
    }

    public final void setType(boolean isWhiteType) {
        ImageView imageView = this.f30216OooO;
        ImageView imageView2 = this.f30221OooO0oo;
        ImageView imageView3 = this.f30220OooO0oO;
        if (isWhiteType) {
            setTextColor(o0000.OooO00o(o0OOO0o.color_white));
            imageView3.setImageResource(o0Oo0oo.icon_topic_count_person_write);
            imageView2.setImageResource(o0Oo0oo.icon_topic_count_post_write);
            imageView.setImageResource(o0Oo0oo.icon_topic_count_gift_write);
            imageView3.setBackground(null);
            imageView2.setBackground(null);
            imageView.setBackground(null);
            setAllAlpha(0.7f);
            return;
        }
        setTextColor(o0000.OooO00o(o0OOO0o.color_333333_45));
        imageView3.setImageResource(o0Oo0oo.icon_topic_count_person);
        imageView2.setImageResource(o0Oo0oo.icon_topic_count_post);
        imageView.setImageResource(o0Oo0oo.icon_topic_count_gift);
        imageView3.setBackground(null);
        imageView2.setBackground(null);
        imageView.setBackground(null);
        setAllAlpha(1.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowPostNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TopicFollowPostNumberView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowPostNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<ImageView> arrayList = new ArrayList<>();
        this.f30222OooOO0 = arrayList;
        ArrayList<TextView> arrayList2 = new ArrayList<>();
        this.f30223OooOO0O = arrayList2;
        setOrientation(0);
        View.inflate(context, oo0o0Oo.view_topic_follow_post_number, this);
        View viewFindViewById = findViewById(o0OO00O.tvFollowNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f30217OooO0Oo = textView;
        View viewFindViewById2 = findViewById(o0OO00O.tvPostNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f30219OooO0o0 = textView2;
        View viewFindViewById3 = findViewById(o0OO00O.tvGiftNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById3;
        this.f30218OooO0o = textView3;
        View viewFindViewById4 = findViewById(o0OO00O.ivFollow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f30220OooO0oO = imageView;
        View viewFindViewById5 = findViewById(o0OO00O.ivPost);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f30221OooO0oo = imageView2;
        View viewFindViewById6 = findViewById(o0OO00O.ivGift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        ImageView imageView3 = (ImageView) viewFindViewById6;
        this.f30216OooO = imageView3;
        arrayList.add(imageView);
        arrayList.add(imageView2);
        arrayList.add(imageView3);
        arrayList2.add(textView);
        arrayList2.add(textView2);
        arrayList2.add(textView3);
        setType(false);
    }
}
