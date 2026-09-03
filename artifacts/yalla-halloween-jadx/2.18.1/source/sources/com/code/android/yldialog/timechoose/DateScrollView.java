package com.code.android.yldialog.timechoose;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00oO0o;
import com.umeng.analytics.pro.d;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.o00O0OOO;
import p258o00ooOOo.e;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/code/android/yldialog/timechoose/DateScrollView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/code/android/yldialog/timechoose/DateScrollView$OooO0OO;", "onItemSelectListener", "", "setOnItemSelectListener", "", "unit", "setSelectedUnit", "", "getItemCount", "()I", "itemCount", "", "getList", "()Ljava/util/List;", "list", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "OooO0OO", "YLDialog_release"}, k = 1, mv = {1, 7, 1})
public final class DateScrollView extends RecyclerView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO00o f12601Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f12602Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12603Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public OooO0OO f12604Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f12605OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public String f12606OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f12607OoooO0O;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends RecyclerView.Adapter<RecyclerView.oo0o0Oo> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public List<Integer> f12608OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f12609OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f12610OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooO0OO f12611OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f12612OooO0o0;

        /* JADX INFO: renamed from: com.code.android.yldialog.timechoose.DateScrollView$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0083OooO00o extends RecyclerView.oo0o0Oo {
            public C0083OooO00o(Space space) {
                super(space);
            }
        }

        public OooO00o(int i, int i2, int i3) {
            this.f12612OooO0o0 = i3;
            this.f12609OooO0O0 = i;
            this.f12610OooO0OO = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<Integer> list = this.f12608OooO00o;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    List<Integer> list2 = this.f12608OooO00o;
                    Intrinsics.checkNotNull(list2);
                    return (this.f12610OooO0OO * 2) + list2.size();
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.oo0o0Oo viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.oo0o0Oo onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Space space = new Space(viewGroup.getContext());
            space.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f12609OooO0O0));
            return new C0083OooO00o(space);
        }
    }

    public final class OooO0O0 extends RecyclerView.OooOo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final Paint.FontMetrics f12613OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f12614OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f12615OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f12616OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f12617OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f12618OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f12619OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f12620OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final TextPaint f12621OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f12622OooOO0 = o000OO00.OooO00o(45);

        public OooO0O0(int i, int i2, int i3, int i4, int i5, boolean z) {
            this.f12614OooO00o = i;
            this.f12615OooO0O0 = i2;
            this.f12616OooO0OO = i4;
            this.f12617OooO0Oo = i5;
            this.f12619OooO0o0 = z;
            TextPaint textPaint = new TextPaint(1);
            this.f12621OooO0oo = textPaint;
            this.f12613OooO = new Paint.FontMetrics();
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTextSize(i3);
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0204 A[LOOP:0: B:26:0x007a->B:70:0x0204, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:79:0x0208 A[EDGE_INSN: B:79:0x0208->B:71:0x0208 BREAK  A[LOOP:0: B:26:0x007a->B:70:0x0204], SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.OooOo
        public final void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
            View viewFindViewByPosition;
            float f;
            boolean z;
            String string;
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (this.f12614OooO00o == 0 || DateScrollView.this.f12603Oooo0oO == 0 || this.f12621OooO0oo == null || this.f12613OooO == null || this.f12616OooO0OO == 0) {
                return;
            }
            this.f12620OooO0oO = (parent.getRight() - parent.getLeft()) >> 1;
            int bottom = (parent.getBottom() - parent.getTop()) >> 1;
            this.f12618OooO0o = bottom;
            if (this.f12620OooO0oO == 0 || bottom == 0 || !(parent.getLayoutManager() instanceof LinearLayoutManager)) {
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) parent.getLayoutManager();
            Intrinsics.checkNotNull(linearLayoutManager);
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition < 0) {
                return;
            }
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            this.f12621OooO0oo.setColor(this.f12616OooO0OO);
            if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                int i = iFindFirstVisibleItemPosition;
                while (true) {
                    if (i < DateScrollView.this.f12603Oooo0oO) {
                        if (i != iFindLastVisibleItemPosition) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int itemCount = linearLayoutManager.getItemCount();
                        DateScrollView dateScrollView = DateScrollView.this;
                        if (i >= itemCount - dateScrollView.f12603Oooo0oO) {
                            break;
                        }
                        OooO00o oooO00o = dateScrollView.f12601Oooo;
                        String strOooO00o = null;
                        if (oooO00o == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            oooO00o = null;
                        }
                        int i2 = i - DateScrollView.this.f12603Oooo0oO;
                        Objects.requireNonNull(oooO00o);
                        try {
                            OooO0OO oooO0OO = oooO00o.f12611OooO0Oo;
                            if (oooO0OO == null) {
                                List<Integer> list = oooO00o.f12608OooO00o;
                                Intrinsics.checkNotNull(list);
                                strOooO00o = String.valueOf(list.get(i2).intValue());
                            } else {
                                Intrinsics.checkNotNull(oooO0OO);
                                List<Integer> list2 = oooO00o.f12608OooO00o;
                                Intrinsics.checkNotNull(list2);
                                strOooO00o = oooO0OO.OooO00o(list2.get(i2).intValue(), oooO00o.f12612OooO0o0);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(strOooO00o) && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i)) != null) {
                            c.save();
                            float bottom2 = (viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) * 0.5f;
                            float f2 = this.f12618OooO0o;
                            float fAbs = Math.abs((bottom2 - f2) / f2);
                            int i3 = DateScrollView.this.f12603Oooo0oO;
                            float f3 = (i3 + 1) * 2.0f;
                            float f4 = (i3 * 2) + 1;
                            float f5 = f3 / f4;
                            float f6 = 1.0f / f4;
                            int iMax = 0;
                            float f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            if (fAbs >= f5) {
                                z = false;
                                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            } else if (fAbs <= f6) {
                                f = 0.22f * fAbs;
                                iMax = Math.max(0, (int) (KotlinVersion.MAX_COMPONENT_VALUE - (200 * fAbs)));
                                f7 = 1 - f;
                                z = true;
                            } else {
                                f = 0.22f * fAbs;
                                iMax = Math.max(0, (int) (KotlinVersion.MAX_COMPONENT_VALUE - (200 * fAbs)));
                                f7 = 1 - f;
                                z = false;
                            }
                            c.scale(f7, f7, this.f12620OooO0oO, this.f12618OooO0o);
                            TextPaint textPaint = this.f12621OooO0oo;
                            Intrinsics.checkNotNull(textPaint);
                            textPaint.setAlpha(iMax);
                            this.f12621OooO0oo.getFontMetrics(this.f12613OooO);
                            DateScrollView dateScrollView2 = DateScrollView.this;
                            if (dateScrollView2.f12605OoooO0) {
                                if (z && !TextUtils.isEmpty(dateScrollView2.f12606OoooO00)) {
                                    strOooO00o = strOooO00o + ' ' + DateScrollView.this.f12606OoooO00;
                                }
                                string = TextUtils.ellipsize(strOooO00o, this.f12621OooO0oo, viewFindViewByPosition.getWidth(), TextUtils.TruncateAt.END).toString();
                            } else {
                                if (z && !TextUtils.isEmpty(dateScrollView2.f12606OoooO00)) {
                                    strOooO00o = DateScrollView.this.f12606OoooO00 + ' ' + strOooO00o;
                                }
                                string = TextUtils.ellipsize(strOooO00o, this.f12621OooO0oo, viewFindViewByPosition.getWidth(), TextUtils.TruncateAt.END).toString();
                            }
                            if (this.f12619OooO0o0) {
                                f *= this.f12622OooOO0;
                            }
                            float right = ((viewFindViewByPosition.getRight() + viewFindViewByPosition.getLeft()) * 0.5f) + f;
                            float bottom3 = (viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) * 0.5f;
                            Paint.FontMetrics fontMetrics = this.f12613OooO;
                            Intrinsics.checkNotNull(fontMetrics);
                            c.drawText(string, right, bottom3 - ((fontMetrics.bottom + this.f12613OooO.top) / 2.0f), this.f12621OooO0oo);
                            c.restore();
                        }
                        if (i != iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (this.f12615OooO0O0 != 0 || this.f12617OooO0Oo == 0) {
                this.f12621OooO0oo.setColor(this.f12617OooO0Oo);
                float f8 = this.f12618OooO0o - (this.f12615OooO0O0 * 0.5f);
                float width = parent.getWidth();
                TextPaint textPaint2 = this.f12621OooO0oo;
                Intrinsics.checkNotNull(textPaint2);
                c.drawLine(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f8, width, f8, textPaint2);
                float f9 = (this.f12615OooO0O0 * 0.5f) + this.f12618OooO0o;
                c.drawLine(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f9, parent.getWidth(), f9, this.f12621OooO0oo);
            }
        }
    }

    public interface OooO0OO {
        @Nullable
        String OooO00o(int i, int i2);

        void OooO0O0(int i, int i2, int i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateScrollView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12605OoooO0 = oOO00O.OooO0OO(this);
        this.f12607OoooO0O = -1;
    }

    public static void OooO0Oo(DateScrollView dateScrollView, List list) {
        Objects.requireNonNull(dateScrollView);
        Intrinsics.checkNotNullParameter(list, "list");
        OooO00o oooO00o = dateScrollView.f12601Oooo;
        OooO00o oooO00o2 = null;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO00o = null;
        }
        oooO00o.f12608OooO00o = list;
        oooO00o.notifyDataSetChanged();
        dateScrollView.scrollToPosition(0);
        OooO0OO oooO0OO = dateScrollView.f12604Oooo0oo;
        if (oooO0OO != null) {
            OooO00o oooO00o3 = dateScrollView.f12601Oooo;
            if (oooO00o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                oooO00o2 = oooO00o3;
            }
            List<Integer> list2 = oooO00o2.f12608OooO00o;
            Intrinsics.checkNotNull(list2);
            Object orNull = CollectionsKt.getOrNull(list2, 0);
            Intrinsics.checkNotNull(orNull);
            oooO0OO.OooO0O0(((Number) orNull).intValue(), 0, dateScrollView.f12607OoooO0O);
        }
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o00O0OOO.DateScrollView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.DateScrollView)");
        this.f12602Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O0OOO.DateScrollView_dateScrollItemHeight, 0);
        this.f12603Oooo0oO = typedArrayObtainStyledAttributes.getInt(o00O0OOO.DateScrollView_dateScrollCountOneSide, 3);
        this.f12607OoooO0O = typedArrayObtainStyledAttributes.getInt(o00O0OOO.DateScrollView_dateScrollType, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O0OOO.DateScrollView_dateScrollDividerDistance, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O0OOO.DateScrollView_dateScrollCenterTextSize, 0);
        int color = typedArrayObtainStyledAttributes.getColor(o00O0OOO.DateScrollView_dateScrollCenterColor, -15986910);
        int color2 = typedArrayObtainStyledAttributes.getColor(o00O0OOO.DateScrollView_dateScrollDividerColor, -3355444);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o00O0OOO.DateScrollView_enableOffset, true);
        this.f12606OoooO00 = typedArrayObtainStyledAttributes.getString(o00O0OOO.DateScrollView_dataScrollSelectedUnit);
        typedArrayObtainStyledAttributes.recycle();
        setOverScrollMode(2);
        if (this.f12602Oooo0o == 0 || this.f12603Oooo0oO == 0) {
            return;
        }
        addOnScrollListener(new e(this, this.f12607OoooO0O));
        setLayoutManager(new LinearLayoutManager(context));
        new o00oO0o().attachToRecyclerView(this);
        OooO00o oooO00o = new OooO00o(this.f12602Oooo0o, this.f12603Oooo0oO, this.f12607OoooO0O);
        this.f12601Oooo = oooO00o;
        setAdapter(oooO00o);
        addItemDecoration(new OooO0O0(this.f12602Oooo0o, dimensionPixelSize, dimensionPixelSize2, color, color2, z));
    }

    public final void OooO0OO(@NotNull IntRange list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        OooO00o oooO00o = this.f12601Oooo;
        OooO00o oooO00o2 = null;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO00o = null;
        }
        oooO00o.f12608OooO00o = CollectionsKt.toList(list);
        oooO00o.notifyDataSetChanged();
        scrollToPosition(i);
        OooO0OO oooO0OO = this.f12604Oooo0oo;
        if (oooO0OO != null) {
            OooO00o oooO00o3 = this.f12601Oooo;
            if (oooO00o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                oooO00o2 = oooO00o3;
            }
            List<Integer> list2 = oooO00o2.f12608OooO00o;
            Intrinsics.checkNotNull(list2);
            Object orNull = CollectionsKt.getOrNull(list2, i);
            Intrinsics.checkNotNull(orNull);
            oooO0OO.OooO0O0(((Number) orNull).intValue(), i, this.f12607OoooO0O);
        }
    }

    public final void OooO0o0(int i) {
        RecyclerView.Oooo000 layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int i2 = this.f12603Oooo0oO;
            int i3 = (i2 * 2) + i;
            if (i > iFindFirstVisibleItemPosition) {
                smoothScrollToPosition(i3);
            } else if (i2 + i < iFindFirstVisibleItemPosition) {
                smoothScrollToPosition(i);
            } else {
                scrollToPosition(i);
            }
        }
    }

    public final int getItemCount() {
        OooO00o oooO00o = this.f12601Oooo;
        OooO00o oooO00o2 = null;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO00o = null;
        }
        if (oooO00o.f12608OooO00o == null) {
            return 0;
        }
        OooO00o oooO00o3 = this.f12601Oooo;
        if (oooO00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            oooO00o2 = oooO00o3;
        }
        List<Integer> list = oooO00o2.f12608OooO00o;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Nullable
    public final List<Integer> getList() {
        OooO00o oooO00o = this.f12601Oooo;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO00o = null;
        }
        return oooO00o.f12608OooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f12602Oooo0o == 0 || this.f12603Oooo0oO == 0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((this.f12603Oooo0oO * 2) + 1) * this.f12602Oooo0o) + getPaddingBottom() + getPaddingTop(), 1073741824));
    }

    public final void setOnItemSelectListener(@NotNull OooO0OO onItemSelectListener) {
        Intrinsics.checkNotNullParameter(onItemSelectListener, "onItemSelectListener");
        this.f12604Oooo0oo = onItemSelectListener;
        OooO00o oooO00o = this.f12601Oooo;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO00o = null;
        }
        oooO00o.f12611OooO0Oo = onItemSelectListener;
    }

    public final void setSelectedUnit(@Nullable String unit) {
        this.f12606OoooO00 = unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12605OoooO0 = oOO00O.OooO0OO(this);
        this.f12607OoooO0O = -1;
        OooO00o(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12605OoooO0 = oOO00O.OooO0OO(this);
        this.f12607OoooO0O = -1;
        OooO00o(context, attributeSet);
    }
}
