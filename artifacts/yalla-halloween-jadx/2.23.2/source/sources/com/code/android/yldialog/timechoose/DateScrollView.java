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
import androidx.recyclerview.widget.o0ooOOo;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p205o00o0o0o.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/code/android/yldialog/timechoose/DateScrollView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/code/android/yldialog/timechoose/DateScrollView$OooO0O0;", "onItemSelectListener", "", "setOnItemSelectListener", "", "unit", "setSelectedUnit", "", "getItemCount", "()I", "itemCount", "", "getList", "()Ljava/util/List;", "list", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DateScrollAdapter", "OooO00o", "OooO0O0", "YLDialog_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDateScrollView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateScrollView.kt\ncom/code/android/yldialog/timechoose/DateScrollView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,358:1\n1#2:359\n*E\n"})
public final class DateScrollView extends RecyclerView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f13504OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f13505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0O0 f13506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f13507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public DateScrollAdapter f13508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public String f13509OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f13510OooOO0;

    @StabilityInferred(parameters = 0)
    public static final class DateScrollAdapter extends RecyclerView.Adapter<RecyclerView.o0O0O00> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public List<Integer> f13511OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13512OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13513OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooO0O0 f13514OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13515OooO0o0;

        public DateScrollAdapter(int i, int i2, int i3) {
            this.f13515OooO0o0 = -1;
            this.f13515OooO0o0 = i3;
            this.f13512OooO0O0 = i;
            this.f13513OooO0OO = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            List<Integer> list = this.f13511OooO00o;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    List<Integer> list2 = this.f13511OooO00o;
                    Intrinsics.checkNotNull(list2);
                    return (this.f13513OooO0OO * 2) + list2.size();
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(@NotNull RecyclerView.o0O0O00 viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public final RecyclerView.o0O0O00 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            final Space space = new Space(viewGroup.getContext());
            space.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f13512OooO0O0));
            return new RecyclerView.o0O0O00(space) { // from class: com.code.android.yldialog.timechoose.DateScrollView$DateScrollAdapter$onCreateViewHolder$1
            };
        }
    }

    public final class OooO00o extends RecyclerView.OooOo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final Paint.FontMetrics f13516OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13517OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13518OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13519OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13520OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f13521OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f13522OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13523OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final TextPaint f13524OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f13525OooOO0 = o0000O0.OooO00o(45);

        public OooO00o(int i, int i2, int i3, int i4, int i5, boolean z) {
            this.f13517OooO00o = i;
            this.f13518OooO0O0 = i2;
            this.f13519OooO0OO = i4;
            this.f13520OooO0Oo = i5;
            this.f13522OooO0o0 = z;
            TextPaint textPaint = new TextPaint(1);
            this.f13524OooO0oo = textPaint;
            this.f13516OooO = new Paint.FontMetrics();
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTextSize(i3);
        }

        /* JADX WARN: Code duplicated, block: B:70:0x01ce A[LOOP:0: B:26:0x0077->B:70:0x01ce, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:78:0x01d5 A[EDGE_INSN: B:78:0x01d5->B:71:0x01d5 BREAK  A[LOOP:0: B:26:0x0077->B:70:0x01ce], SYNTHETIC] */
        @Override // androidx.recyclerview.widget.RecyclerView.OooOo
        public final void onDraw(@NotNull Canvas c, @NotNull RecyclerView parent, @NotNull RecyclerView.o0OOO0o state) {
            TextPaint textPaint;
            Paint.FontMetrics fontMetrics;
            int i;
            View viewFindViewByPosition;
            float f;
            int iMax;
            float f2;
            String string;
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            if (this.f13517OooO00o != 0) {
                DateScrollView dateScrollView = DateScrollView.this;
                if (dateScrollView.f13507OooO0o0 == 0 || (textPaint = this.f13524OooO0oo) == null || (fontMetrics = this.f13516OooO) == null || (i = this.f13519OooO0OO) == 0) {
                    return;
                }
                this.f13523OooO0oO = (parent.getRight() - parent.getLeft()) >> 1;
                int bottom = (parent.getBottom() - parent.getTop()) >> 1;
                this.f13521OooO0o = bottom;
                if (this.f13523OooO0oO == 0 || bottom == 0 || !(parent.getLayoutManager() instanceof LinearLayoutManager)) {
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) parent.getLayoutManager();
                Intrinsics.checkNotNull(linearLayoutManager);
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition < 0) {
                    return;
                }
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                textPaint.setColor(i);
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    int i2 = iFindFirstVisibleItemPosition;
                    int i3 = 1;
                    float f3 = 0.5f;
                    while (true) {
                        if (i2 >= dateScrollView.f13507OooO0o0) {
                            if (i2 >= linearLayoutManager.getItemCount() - dateScrollView.f13507OooO0o0) {
                                break;
                            }
                            DateScrollAdapter dateScrollAdapter = dateScrollView.f13508OooO0oO;
                            String strOooO0O0 = null;
                            if (dateScrollAdapter == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                                dateScrollAdapter = null;
                            }
                            int i4 = i2 - dateScrollView.f13507OooO0o0;
                            dateScrollAdapter.getClass();
                            try {
                                OooO0O0 oooO0O0 = dateScrollAdapter.f13514OooO0Oo;
                                if (oooO0O0 == null) {
                                    List<Integer> list = dateScrollAdapter.f13511OooO00o;
                                    Intrinsics.checkNotNull(list);
                                    strOooO0O0 = String.valueOf(list.get(i4).intValue());
                                } else {
                                    Intrinsics.checkNotNull(oooO0O0);
                                    List<Integer> list2 = dateScrollAdapter.f13511OooO00o;
                                    Intrinsics.checkNotNull(list2);
                                    strOooO0O0 = oooO0O0.OooO00o(list2.get(i4).intValue(), dateScrollAdapter.f13515OooO0o0);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (!TextUtils.isEmpty(strOooO0O0) && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(i2)) != null) {
                                c.save();
                                float bottom2 = (viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) * f3;
                                float f4 = this.f13521OooO0o;
                                float fAbs = Math.abs((bottom2 - f4) / f4);
                                int i5 = dateScrollView.f13507OooO0o0;
                                float f5 = (i5 + 1) * 2.0f;
                                float f6 = (i5 * 2) + i3;
                                float f7 = 1.0f / f6;
                                if (fAbs >= f5 / f6) {
                                    f2 = 0.0f;
                                    i3 = 0;
                                    iMax = 0;
                                    f = 0.0f;
                                } else if (fAbs <= f7) {
                                    f = 0.22f * fAbs;
                                    iMax = Math.max(0, (int) (255 - (200 * fAbs)));
                                    f2 = i3 - f;
                                } else {
                                    f = 0.22f * fAbs;
                                    iMax = Math.max(0, (int) (255 - (200 * fAbs)));
                                    f2 = i3 - f;
                                    i3 = 0;
                                }
                                c.scale(f2, f2, this.f13523OooO0oO, this.f13521OooO0o);
                                Intrinsics.checkNotNull(textPaint);
                                textPaint.setAlpha(iMax);
                                textPaint.getFontMetrics(fontMetrics);
                                if (dateScrollView.f13504OooO) {
                                    if (i3 != 0 && !TextUtils.isEmpty(dateScrollView.f13509OooO0oo)) {
                                        strOooO0O0 = o0OoOo0.OooO0O0(strOooO0O0, ZegoConstants.ZegoVideoDataAuxPublishingStream, dateScrollView.f13509OooO0oo);
                                    }
                                    string = TextUtils.ellipsize(strOooO0O0, textPaint, viewFindViewByPosition.getWidth(), TextUtils.TruncateAt.END).toString();
                                } else {
                                    if (i3 != 0 && !TextUtils.isEmpty(dateScrollView.f13509OooO0oo)) {
                                        strOooO0O0 = o0OoOo0.OooO0O0(dateScrollView.f13509OooO0oo, ZegoConstants.ZegoVideoDataAuxPublishingStream, strOooO0O0);
                                    }
                                    string = TextUtils.ellipsize(strOooO0O0, textPaint, viewFindViewByPosition.getWidth(), TextUtils.TruncateAt.END).toString();
                                }
                                if (this.f13522OooO0o0) {
                                    f *= this.f13525OooOO0;
                                }
                                float right = ((viewFindViewByPosition.getRight() + viewFindViewByPosition.getLeft()) * 0.5f) + f;
                                float bottom3 = (viewFindViewByPosition.getBottom() + viewFindViewByPosition.getTop()) * 0.5f;
                                Intrinsics.checkNotNull(fontMetrics);
                                c.drawText(string, right, bottom3 - ((fontMetrics.bottom + fontMetrics.top) / 2.0f), textPaint);
                                c.restore();
                            }
                            if (i2 != iFindLastVisibleItemPosition) {
                                break;
                                break;
                            } else {
                                i2++;
                                i3 = 1;
                                f3 = 0.5f;
                            }
                        } else {
                            if (i2 != iFindLastVisibleItemPosition) {
                                break;
                            }
                            i2++;
                            i3 = 1;
                            f3 = 0.5f;
                        }
                    }
                }
                int i6 = this.f13520OooO0Oo;
                int i7 = this.f13518OooO0O0;
                if (i7 != 0 || i6 == 0) {
                    textPaint.setColor(i6);
                    float f8 = i7 * 0.5f;
                    float f9 = this.f13521OooO0o - f8;
                    float width = parent.getWidth();
                    Intrinsics.checkNotNull(textPaint);
                    c.drawLine(0.0f, f9, width, f9, textPaint);
                    float f10 = f8 + this.f13521OooO0o;
                    c.drawLine(0.0f, f10, parent.getWidth(), f10, textPaint);
                }
            }
        }
    }

    public interface OooO0O0 {
        @Nullable
        String OooO00o(int i, int i2);

        void OooO0O0(int i, int i2, int i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateScrollView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13504OooO = o000O.OooO0Oo(this);
        this.f13510OooOO0 = -1;
    }

    public static void OooO0Oo(DateScrollView dateScrollView, ArrayList list) {
        dateScrollView.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        DateScrollAdapter dateScrollAdapter = dateScrollView.f13508OooO0oO;
        DateScrollAdapter dateScrollAdapter2 = null;
        if (dateScrollAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dateScrollAdapter = null;
        }
        dateScrollAdapter.f13511OooO00o = list;
        dateScrollAdapter.notifyDataSetChanged();
        dateScrollView.scrollToPosition(0);
        OooO0O0 oooO0O0 = dateScrollView.f13506OooO0o;
        if (oooO0O0 != null) {
            DateScrollAdapter dateScrollAdapter3 = dateScrollView.f13508OooO0oO;
            if (dateScrollAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                dateScrollAdapter2 = dateScrollAdapter3;
            }
            List<Integer> list2 = dateScrollAdapter2.f13511OooO00o;
            Intrinsics.checkNotNull(list2);
            Object orNull = CollectionsKt.getOrNull(list2, 0);
            Intrinsics.checkNotNull(orNull);
            oooO0O0.OooO0O0(((Number) orNull).intValue(), 0, dateScrollView.f13510OooOO0);
        }
    }

    public final void OooO0O0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O0O0.DateScrollView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f13505OooO0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O0O0.DateScrollView_dateScrollItemHeight, 0);
        this.f13507OooO0o0 = typedArrayObtainStyledAttributes.getInt(o000O0O0.DateScrollView_dateScrollCountOneSide, 3);
        this.f13510OooOO0 = typedArrayObtainStyledAttributes.getInt(o000O0O0.DateScrollView_dateScrollType, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O0O0.DateScrollView_dateScrollDividerDistance, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000O0O0.DateScrollView_dateScrollCenterTextSize, 0);
        int color = typedArrayObtainStyledAttributes.getColor(o000O0O0.DateScrollView_dateScrollCenterColor, -15986910);
        int color2 = typedArrayObtainStyledAttributes.getColor(o000O0O0.DateScrollView_dateScrollDividerColor, -3355444);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o000O0O0.DateScrollView_enableOffset, true);
        this.f13509OooO0oo = typedArrayObtainStyledAttributes.getString(o000O0O0.DateScrollView_dataScrollSelectedUnit);
        typedArrayObtainStyledAttributes.recycle();
        setOverScrollMode(2);
        if (this.f13505OooO0Oo == 0 || this.f13507OooO0o0 == 0) {
            return;
        }
        addOnScrollListener(new com.code.android.yldialog.timechoose.OooO0O0(this, this.f13510OooOO0));
        setLayoutManager(new LinearLayoutManager(context));
        new o0ooOOo().attachToRecyclerView(this);
        DateScrollAdapter dateScrollAdapter = new DateScrollAdapter(this.f13505OooO0Oo, this.f13507OooO0o0, this.f13510OooOO0);
        this.f13508OooO0oO = dateScrollAdapter;
        setAdapter(dateScrollAdapter);
        addItemDecoration(new OooO00o(this.f13505OooO0Oo, dimensionPixelSize, dimensionPixelSize2, color, color2, z));
    }

    public final void OooO0OO(@NotNull IntRange list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        DateScrollAdapter dateScrollAdapter = this.f13508OooO0oO;
        DateScrollAdapter dateScrollAdapter2 = null;
        if (dateScrollAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dateScrollAdapter = null;
        }
        dateScrollAdapter.f13511OooO00o = CollectionsKt.toList(list);
        dateScrollAdapter.notifyDataSetChanged();
        scrollToPosition(i);
        OooO0O0 oooO0O0 = this.f13506OooO0o;
        if (oooO0O0 != null) {
            DateScrollAdapter dateScrollAdapter3 = this.f13508OooO0oO;
            if (dateScrollAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            } else {
                dateScrollAdapter2 = dateScrollAdapter3;
            }
            List<Integer> list2 = dateScrollAdapter2.f13511OooO00o;
            Intrinsics.checkNotNull(list2);
            Object orNull = CollectionsKt.getOrNull(list2, i);
            Intrinsics.checkNotNull(orNull);
            oooO0O0.OooO0O0(((Number) orNull).intValue(), i, this.f13510OooOO0);
        }
    }

    public final void OooO0o0(int i) {
        RecyclerView.Oooo000 layoutManager = getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int i2 = this.f13507OooO0o0;
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
        DateScrollAdapter dateScrollAdapter = this.f13508OooO0oO;
        DateScrollAdapter dateScrollAdapter2 = null;
        if (dateScrollAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dateScrollAdapter = null;
        }
        if (dateScrollAdapter.f13511OooO00o == null) {
            return 0;
        }
        DateScrollAdapter dateScrollAdapter3 = this.f13508OooO0oO;
        if (dateScrollAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            dateScrollAdapter2 = dateScrollAdapter3;
        }
        List<Integer> list = dateScrollAdapter2.f13511OooO00o;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Nullable
    public final List<Integer> getList() {
        DateScrollAdapter dateScrollAdapter = this.f13508OooO0oO;
        if (dateScrollAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dateScrollAdapter = null;
        }
        return dateScrollAdapter.f13511OooO00o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f13505OooO0Oo == 0 || this.f13507OooO0o0 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((((this.f13507OooO0o0 * 2) + 1) * this.f13505OooO0Oo) + getPaddingBottom() + getPaddingTop(), Pow2.MAX_POW2));
    }

    public final void setOnItemSelectListener(@NotNull OooO0O0 onItemSelectListener) {
        Intrinsics.checkNotNullParameter(onItemSelectListener, "onItemSelectListener");
        this.f13506OooO0o = onItemSelectListener;
        DateScrollAdapter dateScrollAdapter = this.f13508OooO0oO;
        if (dateScrollAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dateScrollAdapter = null;
        }
        dateScrollAdapter.f13514OooO0Oo = onItemSelectListener;
    }

    public final void setSelectedUnit(@Nullable String unit) {
        this.f13509OooO0oo = unit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13504OooO = o000O.OooO0Oo(this);
        this.f13510OooOO0 = -1;
        OooO0O0(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13504OooO = o000O.OooO0Oo(this);
        this.f13510OooOO0 = -1;
        OooO0O0(context, attributeSet);
    }
}
