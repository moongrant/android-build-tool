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
import com.code.android.util.o000OO00;
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
import p417o0OoO0.o000O0Oo;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nSwitchView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchView.kt\ncom/yalla/yalla/ui/view/SwitchView$adapter$2$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,232:1\n215#2,2:233\n*S KotlinDebug\n*F\n+ 1 SwitchView.kt\ncom/yalla/yalla/ui/view/SwitchView$adapter$2$1\n*L\n96#1:233,2\n*E\n"})
public final class OooO0o extends o000O<String> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ SwitchView f30527OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f30528OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(Context context, SwitchView switchView, int i) {
        super(context, i);
        this.f30527OooOoo = switchView;
        this.f30528OooOoo0 = new LinkedHashMap();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        SwitchView.OooO00o oooO00o;
        ViewHolder helper = (ViewHolder) baseViewHolder;
        String item = (String) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        LinkedHashMap linkedHashMap = this.f30528OooOoo0;
        if (linkedHashMap.containsKey(Integer.valueOf(helper.getLayoutPosition()))) {
            oooO00o = (SwitchView.OooO00o) linkedHashMap.get(Integer.valueOf(helper.getLayoutPosition()));
        } else {
            int layoutPosition = helper.getLayoutPosition();
            View view = helper.getView(oO00O0oO.layout);
            Intrinsics.checkNotNullExpressionValue(view, "helper.getView(R.id.layout)");
            View view2 = helper.getView(oO00O0oO.image);
            Intrinsics.checkNotNullExpressionValue(view2, "helper.getView(R.id.image)");
            View view3 = helper.getView(oO00O0oO.content);
            Intrinsics.checkNotNullExpressionValue(view3, "helper.getView(R.id.content)");
            oooO00o = new SwitchView.OooO00o(layoutPosition, (ConstraintLayout) view, (ImageView) view2, (TextView) view3);
            linkedHashMap.put(Integer.valueOf(helper.getLayoutPosition()), oooO00o);
        }
        if (oooO00o != null) {
            TextView textView = oooO00o.f30752OooO0OO;
            textView.setText(item);
            boolean z = oooO00o.f30753OooO0Oo;
            ImageView imageView = oooO00o.f30751OooO0O0;
            SwitchView switchView = this.f30527OooOoo;
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
            linkedHashMap.put(Integer.valueOf(oooO00o.f30750OooO00o), oooO00o);
            Function1<SwitchView.OooO00o, Unit> setItemListener = switchView.getSetItemListener();
            if (setItemListener != null) {
                setItemListener.invoke(oooO00o);
            }
        }
    }

    public final void Oooo0o0(int i) {
        Function1<SwitchView.OooO00o, Unit> currentItemListener;
        Iterator it = this.f30528OooOoo0.entrySet().iterator();
        Object value = null;
        Object value2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((SwitchView.OooO00o) entry.getValue()).f30753OooO0Oo) {
                ((Number) entry.getKey()).intValue();
                ((SwitchView.OooO00o) entry.getValue()).f30753OooO0Oo = false;
                value = entry.getValue();
            }
            if (((Number) entry.getKey()).intValue() == i) {
                ((Number) entry.getKey()).intValue();
                ((SwitchView.OooO00o) entry.getValue()).f30753OooO0Oo = true;
                value2 = entry.getValue();
            }
        }
        final SwitchView.OooO00o oooO00o = (SwitchView.OooO00o) value;
        final SwitchView.OooO00o oooO00o2 = (SwitchView.OooO00o) value2;
        final SwitchView switchView = this.f30527OooOoo;
        final ImageView imageView = switchView.f30734OooO0Oo.f58980OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.bgImage");
        if (switchView.currentSelectAnimation && oooO00o2 != null) {
            boolean z = switchView.f30748OooOOoo == -1.0f;
            ImageView imageView2 = oooO00o2.f30751OooO0O0;
            if (z) {
                o000O0Oo.OooO0O0(imageView, imageView2.getHeight());
                o000O0Oo.OooO0OO(imageView, imageView2.getWidth());
            }
            imageView.setImageResource(switchView.resIdBgSelect);
            imageView2.post(new Runnable() { // from class: o0o0OoOO.z2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageView imageView3;
                    int i2 = SwitchView.f30732OooOo0;
                    SwitchView this$0 = switchView;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageView bgImage = imageView;
                    Intrinsics.checkNotNullParameter(bgImage, "$bgImage");
                    SwitchView.OooO00o it2 = oooO00o2;
                    Intrinsics.checkNotNullParameter(it2, "$it");
                    int[] iArr = new int[2];
                    SwitchView.OooO00o oooO00o3 = oooO00o;
                    if (oooO00o3 != null && (imageView3 = oooO00o3.f30751OooO0O0) != null) {
                        imageView3.getLocationInWindow(iArr);
                    }
                    this$0.f30744OooOOOO = o0OoOo0.OooO0Oo(Integer.valueOf(iArr[0]));
                    this$0.f30745OooOOOo = o0OoOo0.OooO0Oo(Integer.valueOf(iArr[1]));
                    int[] iArr2 = new int[2];
                    oooO00o2.f30751OooO0O0.getLocationInWindow(iArr2);
                    this$0.f30747OooOOo0 = o0OoOo0.OooO0Oo(Integer.valueOf(iArr2[0]));
                    this$0.f30746OooOOo = o0OoOo0.OooO0Oo(Integer.valueOf(iArr2[1]));
                    if (this$0.f30748OooOOoo == -1.0f) {
                        int[] iArr3 = new int[2];
                        this$0.f30734OooO0Oo.f58981OooO0OO.getLocationInWindow(iArr3);
                        this$0.f30748OooOOoo = o0OoOo0.OooO0Oo(Integer.valueOf(iArr3[0]));
                        this$0.f30749OooOo00 = o0OoOo0.OooO0Oo(Integer.valueOf(iArr3[1]));
                    }
                    OooOOO0.OooO0O0("wrm SwitchView \n fromX:" + this$0.f30744OooOOOO + " -> toX:" + this$0.f30747OooOOo0 + "\n fromY:" + this$0.f30745OooOOOo + " -> toY:" + this$0.f30746OooOOo + "\n recycler-X:" + this$0.f30748OooOOoo + ", -Y:" + this$0.f30749OooOo00);
                    float f = this$0.f30744OooOOOO;
                    float f2 = this$0.f30748OooOOoo;
                    float f3 = f - f2;
                    float f4 = this$0.f30747OooOOo0 - f2;
                    float f5 = this$0.f30745OooOOOo;
                    float f6 = this$0.f30749OooOo00;
                    float f7 = f5 - f6;
                    float f8 = this$0.f30746OooOOo - f6;
                    OooO oooO = new OooO(bgImage, it2);
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.setInterpolator(new LinearInterpolator());
                    animationSet.setDuration(Math.abs(300L));
                    animationSet.setRepeatCount(0);
                    animationSet.setFillAfter(true);
                    animationSet.setAnimationListener(oooO);
                    animationSet.addAnimation(new TranslateAnimation(f3, f4, f7, f8));
                    bgImage.startAnimation(animationSet);
                }
            });
            imageView.invalidate();
            o000OO00.OooOOOO(imageView);
        }
        if (oooO00o2 != null && (currentItemListener = switchView.getCurrentItemListener()) != null) {
            currentItemListener.invoke(oooO00o2);
        }
        notifyDataSetChanged();
    }
}
