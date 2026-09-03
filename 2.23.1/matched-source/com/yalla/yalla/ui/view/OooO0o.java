package com.yalla.yalla.ui.view;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.ui.view.OooO;
import com.yalla.yalla.ui.view.SwitchView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p425o0OoO0OO.o00O0OOO;
import p565o0oOo000.o0Oo0oo;
import p570o0oOo0o.o000O0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSwitchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchView.kt\ncom/yalla/yalla/ui/view/SwitchView$adapter$2$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,232:1\n215#2,2:233\n*S KotlinDebug\n*F\n+ 1 SwitchView.kt\ncom/yalla/yalla/ui/view/SwitchView$adapter$2$1\n*L\n96#1:233,2\n*E\n"})
public final class OooO0o extends o000O0<String> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ SwitchView f29992OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f29993OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(Context context, SwitchView switchView, int i) {
        super(context, i);
        this.f29992OooOoo = switchView;
        this.f29993OooOoo0 = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        SwitchView.OooO00o oooO00o;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        String item = (String) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        LinkedHashMap linkedHashMap = this.f29993OooOoo0;
        if (linkedHashMap.containsKey(Integer.valueOf(helper.getLayoutPosition()))) {
            oooO00o = (SwitchView.OooO00o) linkedHashMap.get(Integer.valueOf(helper.getLayoutPosition()));
        } else {
            int layoutPosition = helper.getLayoutPosition();
            View view = helper.getView(o0Oo0oo.layout);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            View view2 = helper.getView(o0Oo0oo.image);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            View view3 = helper.getView(o0Oo0oo.content);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            oooO00o = new SwitchView.OooO00o(layoutPosition, (ConstraintLayout) view, (ImageView) view2, (TextView) view3);
            linkedHashMap.put(Integer.valueOf(helper.getLayoutPosition()), oooO00o);
        }
        if (oooO00o != null) {
            TextView textView = oooO00o.f30217OooO0OO;
            textView.setText(item);
            boolean z = oooO00o.f30218OooO0Oo;
            ImageView imageView = oooO00o.f30216OooO0O0;
            SwitchView switchView = this.f29992OooOoo;
            if (z) {
                textView.setTextColor(o0000.OooO00o(switchView.getTextColorSelect()));
                imageView.setImageResource(switchView.getResIdBgSelect());
            } else {
                textView.setTextColor(o0000.OooO00o(switchView.getTextColor()));
                imageView.setImageResource(switchView.getResIdBg());
            }
            if (switchView.getItemTextHeight() > 0) {
                textView.setHeight(o0000O0.OooO00o(switchView.getItemTextHeight()));
            }
            linkedHashMap.put(Integer.valueOf(oooO00o.f30215OooO00o), oooO00o);
            Function1<SwitchView.OooO00o, Unit> setItemListener = switchView.getSetItemListener();
            if (setItemListener != null) {
                setItemListener.invoke(oooO00o);
            }
        }
    }

    public final void Oooo0o0(int i) {
        Function1<SwitchView.OooO00o, Unit> currentItemListener;
        Iterator it = this.f29993OooOoo0.entrySet().iterator();
        Object value = null;
        Object value2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((SwitchView.OooO00o) entry.getValue()).f30218OooO0Oo) {
                ((Number) entry.getKey()).intValue();
                ((SwitchView.OooO00o) entry.getValue()).f30218OooO0Oo = false;
                value = entry.getValue();
            }
            if (((Number) entry.getKey()).intValue() == i) {
                ((Number) entry.getKey()).intValue();
                ((SwitchView.OooO00o) entry.getValue()).f30218OooO0Oo = true;
                value2 = entry.getValue();
            }
        }
        final SwitchView.OooO00o oooO00o = (SwitchView.OooO00o) value;
        final SwitchView.OooO00o oooO00o2 = (SwitchView.OooO00o) value2;
        final SwitchView switchView = this.f29992OooOoo;
        final ImageView bgImage = switchView.f30199OooO0Oo.f43995OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bgImage, "bgImage");
        if (switchView.currentSelectAnimation && oooO00o2 != null) {
            boolean z = switchView.f30213OooOOoo == -1.0f;
            ImageView imageView = oooO00o2.f30216OooO0O0;
            if (z) {
                o00O0OOO.OooO0O0(bgImage, imageView.getHeight());
                o00O0OOO.OooO0OO(bgImage, imageView.getWidth());
            }
            bgImage.setImageResource(switchView.resIdBgSelect);
            imageView.post(new Runnable() { // from class: o0o0Ooo0.oOo000o0
                @Override // java.lang.Runnable
                public final void run() {
                    ImageView imageView2;
                    int i2 = SwitchView.f30197OooOo0;
                    SwitchView this$0 = switchView;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView bgImage2 = bgImage;
                    Intrinsics.checkNotNullParameter(bgImage2, "$bgImage");
                    SwitchView.OooO00o it2 = oooO00o2;
                    Intrinsics.checkNotNullParameter(it2, "$it");
                    int[] iArr = new int[2];
                    SwitchView.OooO00o oooO00o3 = oooO00o;
                    if (oooO00o3 != null && (imageView2 = oooO00o3.f30216OooO0O0) != null) {
                        imageView2.getLocationInWindow(iArr);
                    }
                    this$0.f30209OooOOOO = o0OoOo0.OooO0Oo(Integer.valueOf(iArr[0]));
                    this$0.f30210OooOOOo = o0OoOo0.OooO0Oo(Integer.valueOf(iArr[1]));
                    int[] iArr2 = new int[2];
                    oooO00o2.f30216OooO0O0.getLocationInWindow(iArr2);
                    this$0.f30212OooOOo0 = o0OoOo0.OooO0Oo(Integer.valueOf(iArr2[0]));
                    this$0.f30211OooOOo = o0OoOo0.OooO0Oo(Integer.valueOf(iArr2[1]));
                    if (this$0.f30213OooOOoo == -1.0f) {
                        int[] iArr3 = new int[2];
                        this$0.f30199OooO0Oo.f43996OooO0OO.getLocationInWindow(iArr3);
                        this$0.f30213OooOOoo = o0OoOo0.OooO0Oo(Integer.valueOf(iArr3[0]));
                        this$0.f30214OooOo00 = o0OoOo0.OooO0Oo(Integer.valueOf(iArr3[1]));
                    }
                    OooOOOO.OooO0O0("wrm SwitchView \n fromX:" + this$0.f30209OooOOOO + " -> toX:" + this$0.f30212OooOOo0 + "\n fromY:" + this$0.f30210OooOOOo + " -> toY:" + this$0.f30211OooOOo + "\n recycler-X:" + this$0.f30213OooOOoo + ", -Y:" + this$0.f30214OooOo00);
                    float f = this$0.f30209OooOOOO;
                    float f2 = this$0.f30213OooOOoo;
                    float f3 = f - f2;
                    float f4 = this$0.f30212OooOOo0 - f2;
                    float f5 = this$0.f30210OooOOOo;
                    float f6 = this$0.f30214OooOo00;
                    float f7 = f5 - f6;
                    float f8 = this$0.f30211OooOOo - f6;
                    OooO oooO = new OooO(bgImage2, it2);
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.setInterpolator(new LinearInterpolator());
                    animationSet.setDuration(Math.abs(300L));
                    animationSet.setRepeatCount(0);
                    animationSet.setFillAfter(true);
                    animationSet.setAnimationListener(oooO);
                    animationSet.addAnimation(new TranslateAnimation(f3, f4, f7, f8));
                    bgImage2.startAnimation(animationSet);
                }
            });
            bgImage.invalidate();
            o000O.OooOOOO(bgImage);
        }
        if (oooO00o2 != null && (currentItemListener = switchView.getCurrentItemListener()) != null) {
            currentItemListener.invoke(oooO00o2);
        }
        notifyDataSetChanged();
    }
}
