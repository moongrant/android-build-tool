package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/view/TopicFollowPostNumberView;", "Landroid/widget/LinearLayout;", "", "alpha", "", "setAllAlpha", "setTextAlpha", "setImageAlpha", "", "color", "setTextColor", "size", "setTextSize", "resource", "setLayoutResource", "", "isWhiteType", "setType", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicFollowPostNumberView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final ImageView f25218Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final TextView f25219Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final TextView f25220Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final TextView f25221Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final ArrayList<TextView> f25222OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final ImageView f25223OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final ImageView f25224OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final ArrayList<ImageView> f25225OoooO0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowPostNumberView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(int i, int i2, int i3) {
        this.f25219Oooo0o.setText(o00O00.OooO00o(i));
        this.f25220Oooo0oO.setText(o00O00.OooO00o(i2));
        this.f25223OoooO0.setVisibility(8);
        this.f25221Oooo0oo.setVisibility(8);
        if (i3 >= 0) {
            this.f25223OoooO0.setVisibility(0);
            this.f25221Oooo0oo.setVisibility(0);
            this.f25221Oooo0oo.setText(o00O00.OooO00o(i3));
        }
    }

    public final void setAllAlpha(float alpha) {
        setImageAlpha(alpha);
        setTextAlpha(alpha);
    }

    public final void setImageAlpha(float alpha) {
        Iterator<ImageView> it = this.f25225OoooO0O.iterator();
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
        Iterator<TextView> it = this.f25222OoooO.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(alpha);
        }
    }

    public final void setTextColor(int color) {
        Iterator<TextView> it = this.f25222OoooO.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(color);
        }
    }

    public final void setTextSize(float size) {
        Iterator<TextView> it = this.f25222OoooO.iterator();
        while (it.hasNext()) {
            it.next().setTextSize(size);
        }
    }

    public final void setType(boolean isWhiteType) {
        if (isWhiteType) {
            setTextColor(o000O0O0.OooO00o(R.color.color_white));
            this.f25218Oooo.setImageResource(R.drawable.icon_topic_count_person_write);
            this.f25224OoooO00.setImageResource(R.drawable.icon_topic_count_post_write);
            this.f25223OoooO0.setImageResource(R.drawable.icon_topic_count_gift_write);
            this.f25218Oooo.setBackground(null);
            this.f25224OoooO00.setBackground(null);
            this.f25223OoooO0.setBackground(null);
            setAllAlpha(0.7f);
            return;
        }
        setTextColor(o000O0O0.OooO00o(R.color.color_999999));
        this.f25218Oooo.setImageResource(R.drawable.icon_topic_count_person);
        this.f25224OoooO00.setImageResource(R.drawable.icon_topic_count_post);
        this.f25223OoooO0.setImageResource(R.drawable.icon_topic_count_gift);
        this.f25218Oooo.setBackgroundResource(R.drawable.bg_round_bg_gray_r3);
        this.f25224OoooO00.setBackgroundResource(R.drawable.bg_round_bg_gray_r3);
        this.f25223OoooO0.setBackgroundResource(R.drawable.bg_round_bg_gray_r3);
        setAllAlpha(1.0f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowPostNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopicFollowPostNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList<ImageView> arrayList = new ArrayList<>();
        this.f25225OoooO0O = arrayList;
        ArrayList<TextView> arrayList2 = new ArrayList<>();
        this.f25222OoooO = arrayList2;
        setOrientation(0);
        View.inflate(context, R.layout.view_topic_follow_post_number, this);
        View viewFindViewById = findViewById(R.id.tvFollowNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tvFollowNumber)");
        TextView textView = (TextView) viewFindViewById;
        this.f25219Oooo0o = textView;
        View viewFindViewById2 = findViewById(R.id.tvPostNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tvPostNumber)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f25220Oooo0oO = textView2;
        View viewFindViewById3 = findViewById(R.id.tvGiftNumber);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tvGiftNumber)");
        TextView textView3 = (TextView) viewFindViewById3;
        this.f25221Oooo0oo = textView3;
        View viewFindViewById4 = findViewById(R.id.ivFollow);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.ivFollow)");
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f25218Oooo = imageView;
        View viewFindViewById5 = findViewById(R.id.ivPost);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.ivPost)");
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f25224OoooO00 = imageView2;
        View viewFindViewById6 = findViewById(R.id.ivGift);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.ivGift)");
        ImageView imageView3 = (ImageView) viewFindViewById6;
        this.f25223OoooO0 = imageView3;
        arrayList.add(imageView);
        arrayList.add(imageView2);
        arrayList.add(imageView3);
        arrayList2.add(textView);
        arrayList2.add(textView2);
        arrayList2.add(textView3);
        setType(false);
    }
}
