package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0000;
import p539o0o0OoOO.o2;
import p539o0o0OoOO.p2;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00102\u001a\u00020\u0016¢\u0006\u0004\b3\u00104J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00065"}, d2 = {"Lcom/yalla/yalla/ui/view/ScrollableViews;", "Landroid/widget/LinearLayout;", "", "isAnim", "", "setAnim", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "OooO0o", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "getSize", "()Lcom/yalla/yalla/ui/view/NumberSize$Size;", "setSize", "(Lcom/yalla/yalla/ui/view/NumberSize$Size;)V", "size", "", "OooO0oO", "J", "getDelay", "()J", "setDelay", "(J)V", "delay", "", "OooO", "I", "getNumMinCount", "()I", "setNumMinCount", "(I)V", "numMinCount", "Lkotlin/Function1;", "OooOO0", "Lkotlin/jvm/functions/Function1;", "getItemScrollFinishListener", "()Lkotlin/jvm/functions/Function1;", "setItemScrollFinishListener", "(Lkotlin/jvm/functions/Function1;)V", "itemScrollFinishListener", "Lkotlin/Function0;", "OooOO0O", "Lkotlin/jvm/functions/Function0;", "getScrollFinishListener", "()Lkotlin/jvm/functions/Function0;", "setScrollFinishListener", "(Lkotlin/jvm/functions/Function0;)V", "scrollFinishListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrollableViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableViews.kt\ncom/yalla/yalla/ui/view/ScrollableViews\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 ScrollableViews.kt\ncom/yalla/yalla/ui/view/ScrollableViews\n*L\n60#1:116,2\n*E\n"})
public final class ScrollableViews extends LinearLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    public int numMinCount;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f30613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NumberSize.Size size;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f30615OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public long delay;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public String f30617OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> itemScrollFinishListener;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> scrollFinishListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableViews(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    public static void OooO00o(final ScrollableViews scrollableViews, int i) {
        scrollableViews.getClass();
        String numStr = String.valueOf(i);
        Intrinsics.checkNotNullParameter(numStr, "numStr");
        scrollableViews.f30615OooO0o0 = false;
        ArrayList arrayList = scrollableViews.f30613OooO0Oo;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o000OO00.OooO0O0((View) it.next());
        }
        scrollableViews.f30617OooO0oo = numStr;
        int i2 = scrollableViews.numMinCount;
        if (i2 >= 0) {
            scrollableViews.f30617OooO0oo = o0000.OooO00o(i2, numStr);
        }
        char[] charArray = scrollableViews.f30617OooO0oo.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        ?? it2 = ArraysKt.getIndices(charArray).iterator();
        while (it2.hasNext()) {
            int iNextInt = it2.nextInt();
            if ((!arrayList.isEmpty()) && charArray.length == arrayList.size()) {
                Object obj = arrayList.get(iNextInt);
                ScrollableView scrollableView = obj instanceof ScrollableView ? (ScrollableView) obj : null;
                if (scrollableView != null) {
                    scrollableView.OooO0OO(((long) (iNextInt + 1)) * scrollableViews.delay, new p2(scrollableViews, iNextInt, charArray), scrollableViews.f30615OooO0o0, charArray[iNextInt] - '0');
                    o000OO00.OooOOOO(scrollableView);
                }
            } else {
                final Context context = scrollableViews.getContext();
                ScrollableView scrollableView2 = new ScrollableView(context) { // from class: com.yalla.yalla.ui.view.ScrollableViews$initView$scrollableView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(context, null, 6, 0);
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                    }

                    @Override // com.yalla.yalla.ui.view.ScrollableView
                    @NotNull
                    public final NumberView OooO0O0(int i3, @NotNull Context context2) {
                        Intrinsics.checkNotNullParameter(context2, "context");
                        NumberView numberView = new NumberView(context2, null, 6, 0);
                        numberView.setTag(Integer.valueOf(i3));
                        numberView.setSize(this.f30620OooOO0O.getSize());
                        numberView.setData(i3);
                        return numberView;
                    }
                };
                scrollableView2.OooO0OO(scrollableViews.delay * ((long) (iNextInt + 1)), new o2(scrollableViews, iNextInt, charArray), scrollableViews.f30615OooO0o0, charArray[iNextInt] - '0');
                arrayList.add(scrollableView2);
                scrollableViews.addView(scrollableView2);
            }
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    @Nullable
    public final Function1<Integer, Unit> getItemScrollFinishListener() {
        return this.itemScrollFinishListener;
    }

    public final int getNumMinCount() {
        return this.numMinCount;
    }

    @Nullable
    public final Function0<Unit> getScrollFinishListener() {
        return this.scrollFinishListener;
    }

    @NotNull
    public final NumberSize.Size getSize() {
        return this.size;
    }

    public final void setAnim(boolean isAnim) {
        this.delay = isAnim ? 50L : 0L;
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    public final void setItemScrollFinishListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.itemScrollFinishListener = function1;
    }

    public final void setNumMinCount(int i) {
        this.numMinCount = i;
    }

    public final void setScrollFinishListener(@Nullable Function0<Unit> function0) {
        this.scrollFinishListener = function0;
    }

    public final void setSize(@NotNull NumberSize.Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.size = size;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableViews(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScrollableViews(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollableViews(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30613OooO0Oo = new ArrayList();
        this.f30615OooO0o0 = true;
        this.size = NumberSize.Size.M;
        this.f30617OooO0oo = "";
        this.numMinCount = -1;
        setOrientation(0);
        setGravity(17);
        setLayoutDirection(0);
    }
}
